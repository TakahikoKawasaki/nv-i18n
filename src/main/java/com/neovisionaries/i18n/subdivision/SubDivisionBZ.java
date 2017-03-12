
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionBZ
    implements CountrySubDivisionCode
{

    BZ("Belize", "BZ"),
    CY("Cayo", "CY"),
    CZL("Corozal", "CZL"),
    OW("Orange Walk", "OW"),
    SC("Stann Creek", "SC"),
    TOL("Toledo", "TOL");
    public String name;
    public String code;

    SubDivisionBZ(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.BZ;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
