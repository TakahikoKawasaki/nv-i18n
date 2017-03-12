
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionDE
    implements CountrySubDivisionCode
{

    BB("Brandenburg", "BB"),
    BE("Berlin", "BE"),
    BW("Baden-W\u00fcrttemberg", "BW"),
    BY("Bayern", "BY"),
    HB("Bremen", "HB"),
    HE("Hessen", "HE"),
    HH("Hamburg", "HH"),
    MV("Mecklenburg-Vorpommern", "MV"),
    NI("Niedersachsen", "NI"),
    NW("Nordrhein-Westfalen", "NW"),
    RP("Rheinland-Pfalz", "RP"),
    SH("Schleswig-Holstein", "SH"),
    SL("Saarland", "SL"),
    SN("Sachsen", "SN"),
    ST("Sachsen-Anhalt", "ST"),
    TH("Th\u00fcringen", "TH");
    public String name;
    public String code;

    SubDivisionDE(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.DE;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
