
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionRW
    implements CountrySubDivisionCode
{

    _02("Est", "02"),
    _03("Nord", "03"),
    _04("Ouest", "04"),
    _05("Sud", "05"),
    _01("Ville de Kigali", "01");
    public String name;
    public String code;

    SubDivisionRW(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.RW;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
