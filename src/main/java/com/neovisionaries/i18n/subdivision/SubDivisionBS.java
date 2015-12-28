
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionBS
    implements CountrySubDivisionCode
{

    AK("Acklins", "AK"),
    BI("Bimini", "BI"),
    BP("Black Point", "BP"),
    BY("Berry Islands", "BY"),
    CE("Central Eleuthera", "CE"),
    CI("Cat Island", "CI"),
    CK("Crooked Island and Long Cay", "CK"),
    CO("Central Abaco", "CO"),
    CS("Central Andros", "CS"),
    EG("East Grand Bahama", "EG"),
    EX("Exuma", "EX"),
    FC("Fresh Creek", "FC"),
    FP("City of Freeport", "FP"),
    GC("Grand Cay", "GC"),
    HI("Harbour Island", "HI"),
    HT("Hope Town", "HT"),
    IN("Inagua", "IN"),
    LI("Long Island", "LI"),
    MC("Mangrove Cay", "MC"),
    MG("Mayaguana", "MG"),
    MI("Moores Island", "MI"),
    NE("North Eleuthera", "NE"),
    NO("North Abaco", "NO"),
    NS("North Andros", "NS"),
    RC("Rum Cay", "RC"),
    RI("Ragged Island", "RI"),
    SA("South Andros", "SA"),
    SE("South Eleuthera", "SE"),
    SO("South Abaco", "SO"),
    SS("San Salvador", "SS"),
    SW("Spanish Wells", "SW"),
    WG("West Grand Bahama", "WG");
    public String name;
    public String code;

    SubDivisionBS(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.BS;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
