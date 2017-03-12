
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionNE
    implements CountrySubDivisionCode
{

    _1("Agadez", "1"),
    _2("Diffa", "2"),
    _3("Dosso", "3"),
    _4("Maradi", "4"),
    _5("Tahoua", "5"),
    _6("Tillab\u00e9ri", "6"),
    _7("Zinder", "7"),
    _8("Niamey", "8");
    public String name;
    public String code;

    SubDivisionNE(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.NE;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
