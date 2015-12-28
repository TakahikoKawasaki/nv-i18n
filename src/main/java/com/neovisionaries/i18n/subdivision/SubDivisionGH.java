
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionGH
    implements CountrySubDivisionCode
{

    AA("Greater Accra", "AA"),
    AH("Ashanti", "AH"),
    BA("Brong-Ahafo", "BA"),
    CP("Central", "CP"),
    EP("Eastern", "EP"),
    NP("Northern", "NP"),
    TV("Volta", "TV"),
    UE("Upper East", "UE"),
    UW("Upper West", "UW"),
    WP("Western", "WP");
    public String name;
    public String code;

    SubDivisionGH(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.GH;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
