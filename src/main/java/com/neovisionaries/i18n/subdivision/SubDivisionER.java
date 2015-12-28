
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionER
    implements CountrySubDivisionCode
{

    AN("Anseba", "AN"),
    DK("Debubawi Keyih Bahri", "DK"),
    DU("Debub", "DU"),
    GB("Gash-Barka", "GB"),
    MA("Maakel", "MA"),
    SK("Semenawi Keyih Bahri", "SK");
    public String name;
    public String code;

    SubDivisionER(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.ER;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
