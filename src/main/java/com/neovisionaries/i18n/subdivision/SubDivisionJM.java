
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionJM
    implements CountrySubDivisionCode
{

    _01("Kingston", "01"),
    _02("Saint Andrew", "02"),
    _03("Saint Thomas", "03"),
    _04("Portland", "04"),
    _05("Saint Mary", "05"),
    _06("Saint Ann", "06"),
    _07("Trelawny", "07"),
    _08("Saint James", "08"),
    _09("Hanover", "09"),
    _10("Westmoreland", "10"),
    _11("Saint Elizabeth", "11"),
    _12("Manchester", "12"),
    _13("Clarendon", "13"),
    _14("Saint Catherine", "14");
    public String name;
    public String code;

    SubDivisionJM(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.JM;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
