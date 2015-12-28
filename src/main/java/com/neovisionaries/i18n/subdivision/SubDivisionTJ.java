
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionTJ
    implements CountrySubDivisionCode
{

    GB("Gorno-Badakhshan", "GB"),
    KT("Khatlon", "KT"),
    SU("Sughd", "SU");
    public String name;
    public String code;

    SubDivisionTJ(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.TJ;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
