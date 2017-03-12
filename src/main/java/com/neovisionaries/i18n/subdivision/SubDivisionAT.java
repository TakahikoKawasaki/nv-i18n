
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionAT
    implements CountrySubDivisionCode
{

    _1("Burgenland", "1"),
    _2("K\u00e4rnten", "2"),
    _3("Nieder\u00f6sterreich", "3"),
    _4("Ober\u00f6sterreich", "4"),
    _5("Salzburg", "5"),
    _6("Steiermark", "6"),
    _7("Tirol", "7"),
    _8("Vorarlberg", "8"),
    _9("Wien", "9");
    public String name;
    public String code;

    SubDivisionAT(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.AT;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
