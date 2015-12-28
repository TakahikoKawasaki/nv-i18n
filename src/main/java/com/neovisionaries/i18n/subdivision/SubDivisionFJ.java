
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionFJ
    implements CountrySubDivisionCode
{

    C("Central", "C"),
    E("Eastern", "E"),
    N("Northern", "N"),
    R("Rotuma", "R"),
    W("Western", "W");
    public String name;
    public String code;

    SubDivisionFJ(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.FJ;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
