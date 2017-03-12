
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionVU
    implements CountrySubDivisionCode
{

    MAP("Malampa", "MAP"),
    PAM("P\u00e9nama", "PAM"),
    SAM("Sanma", "SAM"),
    SEE("Sh\u00e9fa", "SEE"),
    TAE("Taf\u00e9a", "TAE"),
    TOB("Torba", "TOB");
    public String name;
    public String code;

    SubDivisionVU(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.VU;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
