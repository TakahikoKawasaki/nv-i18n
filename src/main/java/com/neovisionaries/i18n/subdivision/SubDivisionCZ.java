
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionCZ
    implements CountrySubDivisionCode
{

    JC("Jihocesk\u00fd kraj", "JC"),
    JM("Jihomoravsk\u00fd kraj", "JM"),
    KA("Karlovarsk\u00fd kraj", "KA"),
    KR("Kr\u00e1lov\u00e9hradeck\u00fd kraj", "KR"),
    LI("Libereck\u00fd kraj", "LI"),
    MO("Moravskoslezsk\u00fd kraj", "MO"),
    OL("Olomouck\u00fd kraj", "OL"),
    PA("Pardubick\u00fd kraj", "PA"),
    PL("Plze\u0148sk\u00fd kraj", "PL"),
    PR("Praha, hlavn\u00ed me\u0161to", "PR"),
    ST("St\u0159edo\u010desk\u00fd kraj", "ST"),
    US("\u00dasteck\u00fd kraj", "US"),
    VY("Vyso\u010dina", "VY"),
    ZL("Zl\u00ednsk\u00fd kraj", "ZL");
    public String name;
    public String code;

    SubDivisionCZ(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.CZ;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
