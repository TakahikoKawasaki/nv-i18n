
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionAR
    implements CountrySubDivisionCode
{

    A("Salta", "A"),
    B("Buenos Aires", "B"),
    C("Ciudad Aut\u00f3noma de Buenos Aires", "C"),
    D("San Luis", "D"),
    E("Entre R\u00edos", "E"),
    F("La Rioja", "F"),
    G("Santiago del Estero", "G"),
    H("Chaco", "H"),
    J("San Juan", "J"),
    K("Catamarca", "K"),
    L("La Pampa", "L"),
    M("Mendoza", "M"),
    N("Misiones", "N"),
    P("Formosa", "P"),
    Q("Neuqu\u00e9n", "Q"),
    R("R\u00edo Negro", "R"),
    S("Santa Fe", "S"),
    T("Tucum\u00e1n", "T"),
    U("Chubut", "U"),
    V("Tierra del Fuego", "V"),
    W("Corrientes", "W"),
    X("C\u00f3rdoba", "X"),
    Y("Jujuy", "Y"),
    Z("Santa Cruz", "Z");
    public String name;
    public String code;

    SubDivisionAR(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.AR;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
