
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionLR
    implements CountrySubDivisionCode
{

    BG("Bong", "BG"),
    BM("Bomi", "BM"),
    CM("Grand Cape Mount", "CM"),
    GB("Grand Bassa", "GB"),
    GG("Grand Gedeh", "GG"),
    GK("Grand Kru", "GK"),
    GP("Gbarpolu", "GP"),
    LO("Lofa", "LO"),
    MG("Margibi", "MG"),
    MO("Montserrado", "MO"),
    MY("Maryland", "MY"),
    NI("Nimba", "NI"),
    RG("River Gee", "RG"),
    RI("Rivercess", "RI"),
    SI("Sinoe", "SI");
    public String name;
    public String code;

    SubDivisionLR(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.LR;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
