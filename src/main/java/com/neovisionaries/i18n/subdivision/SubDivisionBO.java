
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionBO
    implements CountrySubDivisionCode
{

    B("El Beni", "B"),
    C("Cochabamba", "C"),
    H("Chuquisaca", "H"),
    L("La Paz", "L"),
    N("Pando", "N"),
    O("Oruro", "O"),
    P("Potos\u00ed", "P"),
    S("Santa Cruz", "S"),
    T("Tarija", "T");
    public String name;
    public String code;

    SubDivisionBO(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.BO;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
