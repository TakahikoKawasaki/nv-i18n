
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionEG
    implements CountrySubDivisionCode
{

    ALX("Al Iskandar\u012byah", "ALX"),
    ASN("Asw\u0101n", "ASN"),
    AST("Asy\u016b\u0163", "AST"),
    BA("Al Ba\u1e29r al A\u1e29mar", "BA"),
    BH("Al Bu\u1e29ayrah", "BH"),
    BNS("Ban\u012b Suwayf", "BNS"),
    C("Al Q\u0101hirah", "C"),
    DK("Ad Daqahl\u012byah", "DK"),
    DT("Dumy\u0101\u0163", "DT"),
    FYM("Al Fayy\u016bm", "FYM"),
    GH("Al Gharb\u012byah", "GH"),
    GZ("Al J\u012bzah", "GZ"),
    HU("\u1e28ulw\u0101n", "HU"),
    IS("Al Ism\u0101'\u012bl\u012byah", "IS"),
    JS("Jan\u016bb S\u012bn\u0101'", "JS"),
    KB("Al Qaly\u016bb\u012byah", "KB"),
    KFS("Kafr ash Shaykh", "KFS"),
    KN("Qin\u0101", "KN"),
    LX("Al Uq\u015fur", "LX"),
    MN("Al Miny\u0101", "MN"),
    MNF("Al Min\u016bf\u012byah", "MNF"),
    MT("Ma\u0163r\u016b\u1e29", "MT"),
    PTS("B\u016br Sa\u2018\u012bd", "PTS"),
    SHG("S\u016bh\u0101j", "SHG"),
    SHR("Ash Sharq\u012byah", "SHR"),
    SIN("Sham\u0101l S\u012bn\u0101'", "SIN"),
    SU("As S\u0101dis min Ukt\u016bbar", "SU"),
    SUZ("As Suways", "SUZ"),
    WAD("Al W\u0101d\u012b al Jad\u012bd", "WAD");
    public String name;
    public String code;

    SubDivisionEG(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.EG;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
