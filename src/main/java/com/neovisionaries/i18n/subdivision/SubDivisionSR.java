
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionSR
    implements CountrySubDivisionCode
{

    BR("Brokopondo", "BR"),
    CM("Commewijne", "CM"),
    CR("Coronie", "CR"),
    MA("Marowijne", "MA"),
    NI("Nickerie", "NI"),
    PM("Saramacca", "PM"),
    PR("Para", "PR"),
    SA("Saramacca", "SA"),
    SI("Sipaliwini", "SI"),
    WA("Wanica", "WA");
    public String name;
    public String code;

    SubDivisionSR(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.SR;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
