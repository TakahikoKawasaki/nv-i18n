
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionPG
    implements CountrySubDivisionCode
{

    NSB("Bougainville", "NSB"),
    NCD("National Capital District (Port Moresby)", "NCD"),
    CPK("Chimbu", "CPK"),
    CPM("Central", "CPM"),
    EBR("East New Britain", "EBR"),
    EHG("Eastern Highlands", "EHG"),
    EPW("Enga", "EPW"),
    ESW("East Sepik", "ESW"),
    GPK("Gulf", "GPK"),
    MBA("Milne Bay", "MBA"),
    MPL("Morobe", "MPL"),
    MPM("Madang", "MPM"),
    MRL("Manus", "MRL"),
    NIK("New Ireland", "NIK"),
    NPP("Northern", "NPP"),
    SAN("Sandaun (West Sepik)", "SAN"),
    SHM("Southern Highlands", "SHM"),
    WBK("West New Britain", "WBK"),
    WHM("Western Highlands", "WHM"),
    WPD("Western", "WPD");
    public String name;
    public String code;

    SubDivisionPG(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.PG;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
