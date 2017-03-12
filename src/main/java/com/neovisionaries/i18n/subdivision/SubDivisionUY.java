
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionUY
    implements CountrySubDivisionCode
{

    AR("Artigas", "AR"),
    CA("Canelones", "CA"),
    CL("Cerro Largo", "CL"),
    CO("Colonia", "CO"),
    DU("Durazno", "DU"),
    FD("Florida", "FD"),
    FS("Flores", "FS"),
    LA("Lavalleja", "LA"),
    MA("Maldonado", "MA"),
    MO("Montevideo", "MO"),
    PA("Paysand\u00fa", "PA"),
    RN("R\u00edo Negro", "RN"),
    RO("Rocha", "RO"),
    RV("Rivera", "RV"),
    SA("Salto", "SA"),
    SJ("San Jos\u00e9", "SJ"),
    SO("Soriano", "SO"),
    TA("Tacuaremb\u00f3", "TA"),
    TT("Treinta y Tres", "TT");
    public String name;
    public String code;

    SubDivisionUY(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.UY;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
