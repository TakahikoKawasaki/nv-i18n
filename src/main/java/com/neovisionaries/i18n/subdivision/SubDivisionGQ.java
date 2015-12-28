
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionGQ
    implements CountrySubDivisionCode
{

    AN("Annob\u00f3n", "AN"),
    BN("Bioko Norte", "BN"),
    BS("Bioko Sur", "BS"),
    CS("Centro Sur", "CS"),
    KN("Kie-Ntem", "KN"),
    LI("Litoral", "LI"),
    WN("Wele-Nz\u00e1s", "WN");
    public String name;
    public String code;

    SubDivisionGQ(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.GQ;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
