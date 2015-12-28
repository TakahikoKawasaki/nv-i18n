
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionTD
    implements CountrySubDivisionCode
{

    BA("Batha", "BA"),
    BG("Bahr el Gazel", "BG"),
    BO("Borkou", "BO"),
    CB("Chari-Baguirmi", "CB"),
    EN("Ennedi", "EN"),
    GR("Gu\u00e9ra", "GR"),
    HL("Hadjer Lamis", "HL"),
    KA("Kanem", "KA"),
    LC("Lac", "LC"),
    LO("Logone-Occidental", "LO"),
    LR("Logone-Oriental", "LR"),
    MA("Mandoul", "MA"),
    MC("Moyen-Chari", "MC"),
    ME("Mayo-K\u00e9bbi-Est", "ME"),
    MO("Mayo-K\u00e9bbi-Ouest", "MO"),
    ND("Ndjamena", "ND"),
    OD("Ouadda\u00ef", "OD"),
    SA("Salamat", "SA"),
    SI("Sila", "SI"),
    TA("Tandjil\u00e9", "TA"),
    TI("Tibesti", "TI"),
    WF("Wadi Fira", "WF");
    public String name;
    public String code;

    SubDivisionTD(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.TD;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
