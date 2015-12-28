
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionKP
    implements CountrySubDivisionCode
{

    _01("Phyeongyang", "01"),
    _02("Phyeongannamto", "02"),
    _03("Phyeonganpukto", "03"),
    _04("Jakangto", "04"),
    _05("Hwanghainamto", "05"),
    _06("Hwanghaipukto", "06"),
    _07("Kangweonto", "07"),
    _08("Hamkyeongnamto", "08"),
    _09("Hamkyeongpukto", "09"),
    _10("Yanggang-do", "10"),
    _13("Nas\u01d2n", "13");
    public String name;
    public String code;

    SubDivisionKP(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.KP;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
