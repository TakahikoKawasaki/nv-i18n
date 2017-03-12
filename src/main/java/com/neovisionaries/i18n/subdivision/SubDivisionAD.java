
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionAD
    implements CountrySubDivisionCode
{

    _02("Canillo", "02"),
    _03("Encamp", "03"),
    _04("La Massana", "04"),
    _05("Ordino", "05"),
    _06("Sant Juli\u00e0 de L\u00f2ria", "06"),
    _07("Andorra la Vella", "07"),
    _08("Escaldes-Engordany", "08");
    public String name;
    public String code;

    SubDivisionAD(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.AD;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
