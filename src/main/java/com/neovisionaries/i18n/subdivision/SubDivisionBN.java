
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionBN
    implements CountrySubDivisionCode
{

    BE("Belait", "BE"),
    BM("Brunei-Muara", "BM"),
    TE("Temburong", "TE"),
    TU("Tutong", "TU");
    public String name;
    public String code;

    SubDivisionBN(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.BN;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
