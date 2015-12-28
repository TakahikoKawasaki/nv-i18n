
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionSL
    implements CountrySubDivisionCode
{

    E("Eastern", "E"),
    N("Northern", "N"),
    S("Southern", "S"),
    W("Western Area (Freetown)", "W");
    public String name;
    public String code;

    SubDivisionSL(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.SL;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
