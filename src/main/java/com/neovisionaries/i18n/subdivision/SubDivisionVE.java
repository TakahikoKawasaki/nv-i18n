
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionVE
    implements CountrySubDivisionCode
{

    A("Distrito Capital", "A"),
    B("Anzo\u00e1tegui", "B"),
    C("Apure", "C"),
    D("Aragua", "D"),
    E("Barinas", "E"),
    F("Bol\u00edvar", "F"),
    G("Carabobo", "G"),
    H("Cojedes", "H"),
    I("Falc\u00f3n", "I"),
    J("Gu\u00e1rico", "J"),
    K("Lara", "K"),
    L("M\u00e9rida", "L"),
    M("Miranda", "M"),
    N("Monagas", "N"),
    O("Nueva Esparta", "O"),
    P("Portuguesa", "P"),
    R("Sucre", "R"),
    S("T\u00e1chira", "S"),
    T("Trujillo", "T"),
    U("Yaracuy", "U"),
    V("Zulia", "V"),
    W("Dependencias Federales", "W"),
    X("vargas", "X"),
    Y("Delta Amacuro", "Y"),
    Z("Amazonas", "Z");
    public String name;
    public String code;

    SubDivisionVE(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.VE;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
