
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionGT
    implements CountrySubDivisionCode
{

    AV("Alta Verapaz", "AV"),
    BV("Baja Verapaz", "BV"),
    CM("Chimaltenango", "CM"),
    CQ("Chiquimula", "CQ"),
    ES("Escuintla", "ES"),
    GU("Guatemala", "GU"),
    HU("Huehuetenango", "HU"),
    IZ("Izabal", "IZ"),
    JA("Jalapa", "JA"),
    JU("Jutiapa", "JU"),
    PE("Pet\u00e9n", "PE"),
    PR("El Progreso", "PR"),
    QC("Quich\u00e9", "QC"),
    QZ("Quetzaltenango", "QZ"),
    RE("Retalhuleu", "RE"),
    SA("Sacatep\u00e9quez", "SA"),
    SM("San Marcos", "SM"),
    SO("Solol\u00e1", "SO"),
    SR("Santa Rosa", "SR"),
    SU("Suchitep\u00e9quez", "SU"),
    TO("Totonicap\u00e1n", "TO"),
    ZA("Zacapa", "ZA");
    public String name;
    public String code;

    SubDivisionGT(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.GT;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
