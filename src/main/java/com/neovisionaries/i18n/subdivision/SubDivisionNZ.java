
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionNZ
    implements CountrySubDivisionCode
{

    AUK("Auckland", "AUK"),
    BOP("Bay of Plenty", "BOP"),
    CAN("Canterbury", "CAN"),
    CIT("Chatham Islands Territory", "CIT"),
    GIS("Gisborne District", "GIS"),
    HKB("Hawkes's Bay", "HKB"),
    MBH("Marlborough District", "MBH"),
    MWT("Manawatu-Wanganui", "MWT"),
    NSN("Nelson City", "NSN"),
    NTL("Northland", "NTL"),
    OTA("Otago", "OTA"),
    STL("Southland", "STL"),
    TAS("Tasman District", "TAS"),
    TKI("Taranaki", "TKI"),
    WGN("Wellington", "WGN"),
    WKO("Waikato", "WKO"),
    WTC("West Coast", "WTC");
    public String name;
    public String code;

    SubDivisionNZ(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.NZ;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
