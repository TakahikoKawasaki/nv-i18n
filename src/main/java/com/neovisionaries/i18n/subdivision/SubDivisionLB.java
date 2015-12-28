
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionLB
    implements CountrySubDivisionCode
{

    AK("Aakk\u00e2r\u00e2li", "AK"),
    AS("Liban-Nord\u00e2li", "AS"),
    BA("Beyrouth", "BA"),
    BH("Baalbek-Hermel", "BH"),
    BI("B\u00e9qaa", "BI"),
    JA("Liban-Sud\u00fbbi", "JA"),
    JL("Mont-Liban", "JL"),
    NA("Nabat\u00eey\u00e9", "NA");
    public String name;
    public String code;

    SubDivisionLB(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.LB;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
