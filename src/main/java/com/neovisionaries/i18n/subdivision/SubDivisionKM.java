
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionKM
    implements CountrySubDivisionCode
{

    A("Anjouan", "A"),
    G("Grande Comore", "G"),
    M("Moh\u00e9li", "M");
    public String name;
    public String code;

    SubDivisionKM(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.KM;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
