
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionGW
    implements CountrySubDivisionCode
{

    BA("Bafat\u00e1", "BA"),
    BL("Bolama", "BL"),
    BM("Biombo", "BM"),
    BS("Bissau", "BS"),
    CA("Cacheu", "CA"),
    GA("Gab\u00fa", "GA"),
    OI("Oio", "OI"),
    QU("Quinara", "QU"),
    TO("Tombali", "TO");
    public String name;
    public String code;

    SubDivisionGW(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.GW;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
