
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionGD
    implements CountrySubDivisionCode
{

    _01("Saint Andrew", "01"),
    _02("Saint David", "02"),
    _03("Saint George", "03"),
    _04("Saint John", "04"),
    _05("Saint Mark", "05"),
    _06("Saint Patrick", "06"),
    _10("Southern Grenadine Islands", "10");
    public String name;
    public String code;

    SubDivisionGD(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.GD;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
