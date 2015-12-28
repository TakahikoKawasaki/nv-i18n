
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionCR
    implements CountrySubDivisionCode
{

    A("Alajuela", "A"),
    C("Cartago", "C"),
    G("Guanacaste", "G"),
    H("Heredia", "H"),
    L("Lim\u00f3n", "L"),
    P("Puntarenas", "P"),
    SJ("San Jos\u00e9", "SJ");
    public String name;
    public String code;

    SubDivisionCR(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.CR;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
