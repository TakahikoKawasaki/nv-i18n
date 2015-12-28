
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionTG
    implements CountrySubDivisionCode
{

    C("Centre", "C"),
    K("Kara", "K"),
    M("Maritime (R\u00e9gion)", "M"),
    P("Plateaux", "P"),
    S("Savannes", "S");
    public String name;
    public String code;

    SubDivisionTG(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.TG;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
