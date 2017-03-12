
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionTV
    implements CountrySubDivisionCode
{

    FUN("Funafuti", "FUN"),
    NIT("Niutao", "NIT"),
    NIU("Nui", "NIU"),
    NKF("Nukufetau", "NKF"),
    NKL("Nukulaelae", "NKL"),
    NMA("Nanumea", "NMA"),
    NMG("Nanumanga", "NMG"),
    VAI("Vaitupu", "VAI");
    public String name;
    public String code;

    SubDivisionTV(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.TV;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
