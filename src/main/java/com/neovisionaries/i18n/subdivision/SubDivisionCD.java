
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionCD
    implements CountrySubDivisionCode
{

    BC("Bas-Congo", "BC"),
    BN("Bandundu", "BN"),
    EQ("\u00c9quateur", "EQ"),
    KA("Katanga", "KA"),
    KE("Kasai-Oriental", "KE"),
    KN("Kinshasa", "KN"),
    KW("Kasai-Occidental", "KW"),
    MA("Maniema", "MA"),
    NK("Nord-Kivu", "NK"),
    OR("Orientale", "OR"),
    SK("Sud-Kivu", "SK");
    public String name;
    public String code;

    SubDivisionCD(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.CD;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
