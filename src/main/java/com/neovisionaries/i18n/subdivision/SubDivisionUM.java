
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionUM
    implements CountrySubDivisionCode
{

    _67("Johnston Atoll (ISO reserved code = JT)", "67"),
    _71("Midway Islands (ISO reserved code = I)", "71"),
    _76("Navassa Island (ISO reserved code = NV)", "76"),
    _79("Wake Island (ISO reserved code = WK)", "79"),
    _81("Baker Island", "81"),
    _84("Howland Island", "84"),
    _86("Jarvis Island", "86"),
    _89("Kingman Reef", "89"),
    _95("Palmyra Atoll", "95");
    public String name;
    public String code;

    SubDivisionUM(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.UM;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
