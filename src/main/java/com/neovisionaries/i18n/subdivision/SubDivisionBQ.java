
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionBQ
    implements CountrySubDivisionCode
{

    BO("Boneiru", "BO"),
    SA("Saba", "SA"),
    SE("Sint Eustatius", "SE");
    public String name;
    public String code;

    SubDivisionBQ(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.BQ;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
