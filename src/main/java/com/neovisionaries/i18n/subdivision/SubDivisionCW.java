
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionCW
    implements CountrySubDivisionCode
{

    NONE("No subDivisions", "NONE");
    public String name;
    public String code;

    SubDivisionCW(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.CW;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return false;
    }

}
