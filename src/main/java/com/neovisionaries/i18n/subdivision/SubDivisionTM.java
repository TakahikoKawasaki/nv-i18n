
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionTM
    implements CountrySubDivisionCode
{

    A("Ahal", "A"),
    B("Balkan", "B"),
    D("Da\u015foguz", "D"),
    L("Lebap", "L"),
    M("Mary", "M"),
    S("A\u015fgabat", "S");
    public String name;
    public String code;

    SubDivisionTM(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.TM;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
