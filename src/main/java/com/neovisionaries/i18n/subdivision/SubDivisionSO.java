
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionSO
    implements CountrySubDivisionCode
{

    AW("Awdal", "AW"),
    BK("Bakool", "BK"),
    BN("Banaadir", "BN"),
    BR("Bari", "BR"),
    BY("Bay", "BY"),
    GA("Galguduud", "GA"),
    GE("Gedo", "GE"),
    HI("Hiiraan", "HI"),
    JD("Jubbada Dhexe", "JD"),
    JH("Jubbada Hoose", "JH"),
    MU("Mudug", "MU"),
    NU("Nugaal", "NU"),
    SA("Sanaag", "SA"),
    SD("Shabeellaha Dhexe", "SD"),
    SH("Shabeellaha Hoose", "SH"),
    SO("Sool", "SO"),
    TO("Togdheer", "TO"),
    WO("Woqooyi Galbeed", "WO");
    public String name;
    public String code;

    SubDivisionSO(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.SO;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
