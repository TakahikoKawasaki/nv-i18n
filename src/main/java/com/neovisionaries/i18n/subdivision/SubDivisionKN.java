
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionKN
    implements CountrySubDivisionCode
{

    _01("Christ Church Nichola Town", "01"),
    _02("Saint Anne Sandy Point", "02"),
    _03("Saint George Basseterre", "03"),
    _04("Saint George Gingerland", "04"),
    _05("Saint James Windward", "05"),
    _06("Saint John Capisterre", "06"),
    _07("Saint John Figtree", "07"),
    _08("Saint Mary Cayon", "08"),
    _09("Saint Paul Capisterre", "09"),
    _10("Saint Paul Charlestown", "10"),
    _11("Saint Peter Basseterre", "11"),
    _12("Saint Thomas Lowland", "12"),
    _13("Saint Thomas Middle Island", "13"),
    _15("Trinity Palmetto Point", "15");
    public String name;
    public String code;

    SubDivisionKN(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.KN;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
