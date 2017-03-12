#!/usr/bin/env groovy
import com.neovisionaries.i18n.CountryCode
import com.neovisionaries.i18n.CountrySubDivisionCode
import com.sun.codemodel.*
import groovy.transform.Field
import org.apache.commons.lang3.StringUtils
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.select.Elements

@GrabResolver(name='custom_local', root='file://${user.home}/.m2/repository', m2Compatible='true')
@Grab('org.jsoup:jsoup:1.8.3')
@Grab('com.neovisionaries:nv-i18n:1.19-SNAPSHOT')
@Grab('org.apache.commons:commons-lang3:3.3.2')
@Grab('com.sun.codemodel:codemodel:2.6')

@Field
private static final String JAVA_PACKAGE = "com.neovisionaries.i18n.subdivision"

@Field
final def JCodeModel cm = new JCodeModel();
@Field
final JClass countryCodeClass = cm.ref(CountryCode.class)


void parseHtml(CountryCode cc, URI uri) {
    Map<String, String> parsedData = [:]
    try {
        def html = uri.toURL().text
        Document parse = Jsoup.parse(html)
        // Caveat JSoup magic that makes regex seem easy.
        // All <tr> tags from <tbody> (inserted by Jsoup when parsing) from <table>
        // <table> is found by checking if any of the <td> nodes below contains the string "Level"
        Elements rows = parse.select("table:has(td:contains(Level)) > tbody > tr:gt(0)")
        rows.each { row ->
            def newCC = CountryCode.getByCode(trim(row.child(0).text()), false);
            if (cc != null && cc != newCC) {
                throw new RuntimeException("For ${uri}, expected (Country=${cc}) but found (Country=${newCC})")
            }
            def subDivisionCode = trim(row.child(1).text())
            def subDivisionName = trim(row.child(2).text())
            parsedData[subDivisionCode] = subDivisionName;
        }
    } catch (IOException e) {
        println(e)
    }
    generateClass(cc, parsedData)
}


JClass generateClass(CountryCode countryCode, Map<String, String> parsedData) {
    JDefinedClass dc = cm._class("${JAVA_PACKAGE}.SubDivision${countryCode.alpha2}", ClassType.ENUM)
    dc._implements(cm.ref(CountrySubDivisionCode.class))
    JFieldVar name = dc.field(JMod.PUBLIC, String.class, "name")
    JFieldVar code = dc.field(JMod.PUBLIC, String.class, "code")
    dc.method(JMod.PUBLIC, CountryCode.class, "getCountryCode").with {
        body().with {
            _return(countryCodeClass.staticRef(countryCode.alpha2))
        }
    }
    dc.method(JMod.PUBLIC, String.class, "getCode").with {
        body().with {
            _return(code);
        }
    }
    dc.constructor(0).with {
        def subDivName = param(String.class, "subDivisionName")
        def subDivCode = param(String.class, "subDivisionCode")
        body().with {
            assign(JExpr._this().ref(name), subDivName)
            assign(JExpr._this().ref(code), subDivCode)
        }
    }

    if (parsedData) {
        parsedData.each { subDivisionCode, subDivisionName ->
            String escapedCode = subDivisionCode
            if (Character.valueOf(escapedCode.charAt(0)).isDigit()) {
                escapedCode = "_" + escapedCode;
            }
            dc.enumConstant(escapedCode).with {
                arg(JExpr.lit(subDivisionName))
                arg(JExpr.lit(subDivisionCode))
            }
        }
        dc.method(JMod.PUBLIC, boolean.class, "isRealRegion").with {
            body().with {
                _return(JExpr.lit(true))
            }
        }
    } else {
        dc.enumConstant("NONE").with {
            arg(JExpr.lit("No SubDivisions"))
            arg(JExpr.lit("NONE"))
        }
        dc.method(JMod.PUBLIC, boolean.class, "isRealRegion").with {
            body().with {
                _return(JExpr.lit(false))
            }
        }
    }
    dc
}

String trim(String str) {
    StringUtils.trim(StringUtils.normalizeSpace(str));
}

CountryCode.values().each {
    if (it.assignment == CountryCode.Assignment.OFFICIALLY_ASSIGNED) {
        parseHtml(it, URI.create("http://www.unece.org/fileadmin/DAM/cefact/locode/Subdivision/${it.alpha2.toLowerCase(Locale.US)}Sub.htm"))
    }
}

def outputDir = new File((File)project.basedir,  "src/main/java/")
new File(outputDir, "/" + JAVA_PACKAGE.replace('.', '/')).listFiles().each {
    System.err.println(it)
}
cm.build(outputDir)