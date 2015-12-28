
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionMM
    implements CountrySubDivisionCode
{

    _01("Sagaing", "01"),
    _02("Bago", "02"),
    _03("Magway", "03"),
    _04("Mandalay", "04"),
    _05("Tanintharyi", "05"),
    _06("Yangon", "06"),
    _07("Ayeyarwady", "07"),
    _11("Kachin", "11"),
    _12("Kayah", "12"),
    _13("Kayin", "13"),
    _14("Chin", "14"),
    _15("Mon", "15"),
    _16("Rakhine", "16"),
    _17("Shan", "17");
    public String name;
    public String code;

    SubDivisionMM(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.MM;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
