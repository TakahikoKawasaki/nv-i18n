
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionLC
    implements CountrySubDivisionCode
{

    _01("Anse la Raye", "01"),
    _02("Castries", "02"),
    _03("Choiseul", "03"),
    _04("Dauphin", "04"),
    _05("Dennery", "05"),
    _06("Gros Islet", "06"),
    _07("Laborie", "07"),
    _08("Micoud", "08"),
    _09("Praslin", "09"),
    _10("Soufri\u00e8re", "10"),
    _11("Vieux Fort", "11");
    public String name;
    public String code;

    SubDivisionLC(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.LC;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
