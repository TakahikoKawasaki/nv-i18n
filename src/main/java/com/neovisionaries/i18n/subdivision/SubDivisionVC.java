
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionVC
    implements CountrySubDivisionCode
{

    _01("Charlotte", "01"),
    _02("Saint Andrew", "02"),
    _03("Saint David", "03"),
    _04("Saint George", "04"),
    _05("Saint Patrick", "05"),
    _06("Grenadines", "06");
    public String name;
    public String code;

    SubDivisionVC(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.VC;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
