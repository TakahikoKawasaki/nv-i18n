
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionSH
    implements CountrySubDivisionCode
{

    AC("Ascension", "AC"),
    HL("Saint Helena", "HL"),
    TA("Tristan da Cunha", "TA");
    public String name;
    public String code;

    SubDivisionSH(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.SH;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
