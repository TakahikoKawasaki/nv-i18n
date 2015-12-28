
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionLT
    implements CountrySubDivisionCode
{

    AL("Alytaus Apskritis", "AL"),
    KL("Klaip\u0117dos Apskritis", "KL"),
    KU("Kauno Apskritis", "KU"),
    MR("Marijampol\u0117s Apskritis", "MR"),
    PN("Panev\u0117\u017eio Apskritis", "PN"),
    SA("\u0160iauli\u0173 Apskritis", "SA"),
    TA("Taurag\u0117s Apskritis", "TA"),
    TE("\u0160iauli\u0173 Apskritis", "TE"),
    UT("Utenos Apskritis", "UT"),
    VL("Vilniaus Apskritis", "VL");
    public String name;
    public String code;

    SubDivisionLT(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.LT;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
