
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionSB
    implements CountrySubDivisionCode
{

    CE("Central", "CE"),
    CH("Choiseul", "CH"),
    CT("Capital Territory (Honiara)", "CT"),
    GU("Guadalcanal", "GU"),
    IS("Isabel", "IS"),
    MK("Makira-Ulawa", "MK"),
    ML("Malaita", "ML"),
    RB("Rennell and Bellona", "RB"),
    TE("Temotu", "TE"),
    WE("Western", "WE");
    public String name;
    public String code;

    SubDivisionSB(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.SB;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
