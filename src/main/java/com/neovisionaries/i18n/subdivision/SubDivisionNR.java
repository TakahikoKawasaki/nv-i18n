
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionNR
    implements CountrySubDivisionCode
{

    _01("Aiwo", "01"),
    _02("Anabar", "02"),
    _03("Anetan", "03"),
    _04("Anibare", "04"),
    _05("Baiti", "05"),
    _06("Boe", "06"),
    _07("Buada", "07"),
    _08("Denigomodu", "08"),
    _09("Ewa", "09"),
    _10("Ijuw", "10"),
    _11("Meneng", "11"),
    _12("Nibok", "12"),
    _13("Uaboe", "13"),
    _14("Yaren", "14");
    public String name;
    public String code;

    SubDivisionNR(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.NR;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
