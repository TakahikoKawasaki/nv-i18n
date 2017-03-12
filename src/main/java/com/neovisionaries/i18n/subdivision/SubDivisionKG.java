
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionKG
    implements CountrySubDivisionCode
{

    B("Batken", "B"),
    C("Ch\u00fc", "C"),
    GB("Bishkek", "GB"),
    J("Jalal-Abad", "J"),
    N("Naryn", "N"),
    O("Osh", "O"),
    T("Talas", "T"),
    Y("Ysyk-K\u00f6l", "Y");
    public String name;
    public String code;

    SubDivisionKG(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.KG;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
