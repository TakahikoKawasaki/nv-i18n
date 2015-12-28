
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionLI
    implements CountrySubDivisionCode
{

    _01("Balzers", "01"),
    _02("Eschen", "02"),
    _03("Gamprin", "03"),
    _04("Mauren", "04"),
    _05("Planken", "05"),
    _06("Ruggell", "06"),
    _07("Schaan", "07"),
    _08("Schellenberg", "08"),
    _09("Triesen", "09"),
    _10("Triesenberg", "10"),
    _11("Vaduz", "11");
    public String name;
    public String code;

    SubDivisionLI(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.LI;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
