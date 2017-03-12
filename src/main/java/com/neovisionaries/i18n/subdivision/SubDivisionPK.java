
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionPK
    implements CountrySubDivisionCode
{

    IS("Islamabad", "IS"),
    GB("Gilgit-Baltistan", "GB"),
    JK("Azad Kashmir", "JK"),
    BA("Baluchistan", "BA"),
    KP("Khyber Pakhtunkhwa", "KP"),
    PB("Punjab", "PB"),
    SD("Sind", "SD"),
    TA("Federally Administered Tribal Areas", "TA");
    public String name;
    public String code;

    SubDivisionPK(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.PK;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
