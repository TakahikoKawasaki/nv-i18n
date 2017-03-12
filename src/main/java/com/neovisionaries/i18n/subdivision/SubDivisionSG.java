
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionSG
    implements CountrySubDivisionCode
{

    _01("Central Singapore", "01"),
    _02("North East", "02"),
    _03("North West", "03"),
    _04("South East", "04"),
    _05("South West", "05");
    public String name;
    public String code;

    SubDivisionSG(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.SG;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
