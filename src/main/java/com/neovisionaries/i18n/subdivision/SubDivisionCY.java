
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionCY
    implements CountrySubDivisionCode
{

    _01("Lefkosia", "01"),
    _02("Lemesos", "02"),
    _03("Larnaka", "03"),
    _04("Ammochostos", "04"),
    _05("Pafos", "05"),
    _06("Keryneia", "06");
    public String name;
    public String code;

    SubDivisionCY(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.CY;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
