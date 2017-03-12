
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionHK
    implements CountrySubDivisionCode
{

    NONE("No subDivisions", "NONE");
    public String name;
    public String code;

    SubDivisionHK(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.HK;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return false;
    }

}
