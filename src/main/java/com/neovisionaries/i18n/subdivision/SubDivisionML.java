
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionML
    implements CountrySubDivisionCode
{

    _1("Kayes", "1"),
    _2("Koulikoro", "2"),
    _3("Sikasso", "3"),
    _4("S\u00e9gou", "4"),
    _5("Mopti", "5"),
    _6("Tombouctou", "6"),
    _7("Gao", "7"),
    _8("Kidal", "8"),
    BKO("Bamako", "BKO");
    public String name;
    public String code;

    SubDivisionML(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.ML;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
