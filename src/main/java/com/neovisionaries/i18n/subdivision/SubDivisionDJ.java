
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionDJ
    implements CountrySubDivisionCode
{

    AR("\u2018Art\u0101 / Arta", "AR"),
    AS("\u2018Al\u012b S\u0101bi\u1e29 / Ali Sabieh", "AS"),
    DI("Dikh\u012bl / Dikhil", "DI"),
    DJ("J\u012bb\u016bt\u012b / Djibouti", "DJ"),
    OB("\u016ab\u016bk / Obock", "OB"),
    TA("T\u0101j\u016brah / Tadjoura", "TA");
    public String name;
    public String code;

    SubDivisionDJ(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.DJ;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
