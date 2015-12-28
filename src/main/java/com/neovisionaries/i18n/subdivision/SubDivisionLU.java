
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionLU
    implements CountrySubDivisionCode
{

    D("Diekirch", "D"),
    G("Grevenmacher", "G"),
    L("Luxembourg (fr)", "L");
    public String name;
    public String code;

    SubDivisionLU(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.LU;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
