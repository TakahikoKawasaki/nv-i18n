
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionDM
    implements CountrySubDivisionCode
{

    _02("Saint Andrew", "02"),
    _03("Saint David", "03"),
    _04("Saint George", "04"),
    _05("Saint John", "05"),
    _06("Saint Joseph", "06"),
    _07("Saint Luke", "07"),
    _08("Saint Mark", "08"),
    _09("Saint Patrick", "09"),
    _10("Saint Paul", "10"),
    _11("Saint Peter", "11");
    public String name;
    public String code;

    SubDivisionDM(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.DM;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
