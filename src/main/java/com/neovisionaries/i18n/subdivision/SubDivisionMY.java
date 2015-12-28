
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionMY
    implements CountrySubDivisionCode
{

    _01("Johor", "01"),
    _02("Kedah", "02"),
    _03("Kelantan", "03"),
    _04("Melaka", "04"),
    _05("Negeri Sembilan", "05"),
    _06("Pahang", "06"),
    _07("Pulau Pinang", "07"),
    _08("Perak", "08"),
    _09("Perlis", "09"),
    _10("Selangor", "10"),
    _11("Terengganu", "11"),
    _12("Sabah", "12"),
    _13("Sarawak", "13"),
    _14("Wilayah Persekutuan Kuala Lumpur", "14"),
    _15("Wilayah Persekutuan Labuan", "15"),
    _16("Wilayah Persekutuan Putrajaya", "16");
    public String name;
    public String code;

    SubDivisionMY(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.MY;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
