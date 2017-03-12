
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionZM
    implements CountrySubDivisionCode
{

    _01("Western", "01"),
    _02("Central", "02"),
    _03("Eastern", "03"),
    _04("Luapula", "04"),
    _05("Northern", "05"),
    _06("North-Western", "06"),
    _07("Southern", "07"),
    _08("Copperbelt", "08"),
    _09("Lusaka", "09");
    public String name;
    public String code;

    SubDivisionZM(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.ZM;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
