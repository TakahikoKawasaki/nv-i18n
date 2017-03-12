
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionAM
    implements CountrySubDivisionCode
{

    AG("Araga\u00e7otn", "AG"),
    AR("Ararat", "AR"),
    AV("Armavir", "AV"),
    ER("Erevan", "ER"),
    GR("Ge\u0121ark'unik'", "GR"),
    KT("Kotayk'", "KT"),
    LO("Lo\u1e59y", "LO"),
    SH("\u0160irak", "SH"),
    SU("Syunik'", "SU"),
    TV("Tavu\u0161", "TV"),
    VD("Vayo\u0107 Jor", "VD");
    public String name;
    public String code;

    SubDivisionAM(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.AM;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
