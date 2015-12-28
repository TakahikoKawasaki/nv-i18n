
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionSD
    implements CountrySubDivisionCode
{

    DC("Central Darfur", "DC"),
    DE("East Darfur", "DE"),
    DN("North Darfur", "DN"),
    DS("South Darfur", "DS"),
    DW("West Darfur", "DW"),
    GD("Gedaref", "GD"),
    GZ("Gezira", "GZ"),
    KA("Kassala", "KA"),
    KH("Khartoum", "KH"),
    KN10("North Kordofan", "KN10"),
    KS("South Kordofan", "KS"),
    NB("Blue Nile", "NB"),
    NO("Northern", "NO"),
    NR("River Nile", "NR"),
    NW("White Nile", "NW"),
    RS("Red Sea", "RS"),
    SI("Sennar", "SI");
    public String name;
    public String code;

    SubDivisionSD(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.SD;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
