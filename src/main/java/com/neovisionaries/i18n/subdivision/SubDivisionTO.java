
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionTO
    implements CountrySubDivisionCode
{

    _01("'Eua", "01"),
    _02("Ha'apai", "02"),
    _03("Niuas", "03"),
    _04("Tongatapu", "04"),
    _05("Vava'u", "05");
    public String name;
    public String code;

    SubDivisionTO(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.TO;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
