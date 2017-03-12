
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionAG
    implements CountrySubDivisionCode
{

    _03("Saint George", "03"),
    _04("Saint John's", "04"),
    _05("Saint Mary", "05"),
    _06("Saint Paul", "06"),
    _07("Saint Peter", "07"),
    _08("Saint Philip", "08"),
    _10("Barbuda", "10"),
    _11("Redonda", "11");
    public String name;
    public String code;

    SubDivisionAG(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.AG;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
