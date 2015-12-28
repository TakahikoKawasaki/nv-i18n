
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionSY
    implements CountrySubDivisionCode
{

    DI("Dimashq", "DI"),
    DR("Dar'\u0101", "DR"),
    DY("Dayr az Zawr", "DY"),
    HA("Al \u1e28asakah", "HA"),
    HI("\u1e28im\u015f", "HI"),
    HL("\u1e28alab", "HL"),
    HM("\u1e28am\u0101h", "HM"),
    ID("Idlib", "ID"),
    LA("Al L\u0101dhiq\u012byah", "LA"),
    Qu("Al Qunay\u0163irah", "Qu"),
    RA("Ar Raqqah", "RA"),
    RD("Rif Dimashq", "RD"),
    SU("As Suwayd\u0101'", "SU"),
    TA("\u0162ar\u0163\u016bs", "TA");
    public String name;
    public String code;

    SubDivisionSY(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.SY;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
