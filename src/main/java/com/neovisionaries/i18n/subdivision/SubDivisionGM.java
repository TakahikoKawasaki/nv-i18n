
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionGM
    implements CountrySubDivisionCode
{

    B("Banjul", "B"),
    L("Lower River", "L"),
    M("Central River", "M"),
    N("North Bank", "N"),
    U("Upper River", "U"),
    W("Western", "W");
    public String name;
    public String code;

    SubDivisionGM(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.GM;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
