
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionBB
    implements CountrySubDivisionCode
{

    _01("Christ Church", "01"),
    _02("Saint Andrew", "02"),
    _03("Saint George", "03"),
    _04("Saint James", "04"),
    _05("Saint John", "05"),
    _06("Saint Joseph", "06"),
    _07("Saint Lucy", "07"),
    _08("Saint Michael", "08"),
    _09("Saint Peter", "09"),
    _10("Saint Philip", "10"),
    _11("Saint Thomas", "11");
    public String name;
    public String code;

    SubDivisionBB(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.BB;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
