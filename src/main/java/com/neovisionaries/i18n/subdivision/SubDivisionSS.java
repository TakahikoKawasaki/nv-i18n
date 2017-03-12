
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionSS
    implements CountrySubDivisionCode
{

    BN("Northern Bahr el-Ghazal", "BN"),
    BW("Western Bahr el-Ghazal", "BW"),
    EC("Central Equatoria", "EC"),
    EE("Eastern Equatoria", "EE"),
    EW("Western Equatoria", "EW"),
    JG("Jonglei", "JG"),
    LK("Lakes", "LK"),
    NU("Upper Nile", "NU"),
    UY("Unity", "UY"),
    WR("Warrap", "WR");
    public String name;
    public String code;

    SubDivisionSS(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.SS;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
