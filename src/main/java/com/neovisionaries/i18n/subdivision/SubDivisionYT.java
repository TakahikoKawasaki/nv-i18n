
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionYT
    implements CountrySubDivisionCode
{

    NONE("No subDivisions", "NONE");
    public String name;
    public String code;

    SubDivisionYT(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.YT;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return false;
    }

}
