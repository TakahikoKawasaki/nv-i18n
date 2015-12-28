
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionPL
    implements CountrySubDivisionCode
{

    DS("Dolnoslaskie", "DS"),
    KP("Kujawsko-pomorskie", "KP"),
    LB("Lubuskie", "LB"),
    LD("L\u00f3dzkie", "LD"),
    LU("Lubelskie", "LU"),
    MA("Malopolskie", "MA"),
    MZ("Mazowieckie", "MZ"),
    OP("Opolskie", "OP"),
    PD("Podlaskie", "PD"),
    PK("Podkarpackie", "PK"),
    PM("Pomorskie", "PM"),
    SK("Swietokrzyskie", "SK"),
    SL("Slaskie", "SL"),
    WN("Warminsko-mazurskie", "WN"),
    WP("Wielkopolskie", "WP"),
    ZP("Zachodniopomorskie", "ZP");
    public String name;
    public String code;

    SubDivisionPL(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.PL;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
