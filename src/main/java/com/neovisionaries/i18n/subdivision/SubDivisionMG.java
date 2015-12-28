
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionMG
    implements CountrySubDivisionCode
{

    A("Toamasina", "A"),
    D("Antsiranana", "D"),
    F("Fianarantsoa", "F"),
    M("Mahajanga", "M"),
    T("Antananarivo", "T"),
    U("Toliara", "U");
    public String name;
    public String code;

    SubDivisionMG(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.MG;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
