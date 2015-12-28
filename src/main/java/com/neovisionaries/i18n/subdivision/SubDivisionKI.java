
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionKI
    implements CountrySubDivisionCode
{

    G("Gilbert Islands", "G"),
    L("Line Islands", "L"),
    P("Phoenix Islands", "P");
    public String name;
    public String code;

    SubDivisionKI(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.KI;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
