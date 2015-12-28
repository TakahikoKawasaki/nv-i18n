
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionEC
    implements CountrySubDivisionCode
{

    A("Azuay", "A"),
    B("Bol\u00edvar", "B"),
    C("Carchi", "C"),
    D("Orellana", "D"),
    E("Esmeraldas", "E"),
    F("Ca\u00f1ar", "F"),
    G("Guayas", "G"),
    H("Chimborazo", "H"),
    I("Imbabura", "I"),
    L("Loja", "L"),
    M("Manab\u00ed", "M"),
    N("Napo", "N"),
    O("El Oro", "O"),
    P("Pichincha", "P"),
    R("Los R\u00edos", "R"),
    S("Morona-Santiago", "S"),
    SD("Santo Domingo de los Ts\u00e1chilas", "SD"),
    SE("Santa Elena", "SE"),
    T("Tungurahua", "T"),
    U("Sucumb\u00edos", "U"),
    W("Gal\u00e1pagos", "W"),
    X("Cotopaxi", "X"),
    Y("Pastaza", "Y"),
    Z("Zamora-Chinchipe", "Z");
    public String name;
    public String code;

    SubDivisionEC(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.EC;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
