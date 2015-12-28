
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionNL
    implements CountrySubDivisionCode
{

    DR("Drenthe", "DR"),
    FL("Flevoland", "FL"),
    FR("Friesland", "FR"),
    GE("Gelderland", "GE"),
    GR("Groningen", "GR"),
    LI("Limburg", "LI"),
    NB("Noord-Brabant", "NB"),
    NH("Noord-Holland", "NH"),
    OV("Overijssel", "OV"),
    UT("Utrecht", "UT"),
    ZE("Zeeland", "ZE"),
    ZH("Zuid-Holland", "ZH");
    public String name;
    public String code;

    SubDivisionNL(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.NL;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
