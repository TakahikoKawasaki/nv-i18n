
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionZA
    implements CountrySubDivisionCode
{

    EC("Eastern Cape", "EC"),
    FS("Free State", "FS"),
    GT("Gauteng", "GT"),
    LP("Limpopo", "LP"),
    MP("Mpumalanga", "MP"),
    NC("Northern Cape", "NC"),
    NL("Kwazulu-Natal", "NL"),
    NW("North-West", "NW"),
    WC("Western Cape", "WC");
    public String name;
    public String code;

    SubDivisionZA(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.ZA;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
