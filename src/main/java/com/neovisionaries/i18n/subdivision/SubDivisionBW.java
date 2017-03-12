
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionBW
    implements CountrySubDivisionCode
{

    CE("Central", "CE"),
    GH("Ghanzi", "GH"),
    KG("Kgalagadi", "KG"),
    KL("Kgatleng", "KL"),
    KW("Kweneng", "KW"),
    NE("North-East", "NE"),
    NW("North-West", "NW"),
    SE("South-East", "SE"),
    SO("Southern", "SO");
    public String name;
    public String code;

    SubDivisionBW(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.BW;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
