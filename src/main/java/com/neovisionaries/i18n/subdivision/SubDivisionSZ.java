
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionSZ
    implements CountrySubDivisionCode
{

    HH("Hhohho", "HH"),
    LU("Lubombo", "LU"),
    MA("Manzini", "MA"),
    SH("Shiselweni", "SH");
    public String name;
    public String code;

    SubDivisionSZ(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.SZ;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
