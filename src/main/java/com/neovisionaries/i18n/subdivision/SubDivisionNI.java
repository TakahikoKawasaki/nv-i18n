
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionNI
    implements CountrySubDivisionCode
{

    AN("Atl\u00e1ntico Norte", "AN"),
    AS("Atl\u00e1ntico Sur", "AS"),
    BO("Boaco", "BO"),
    CA("Carazo", "CA"),
    CI("Chinandega", "CI"),
    CO("Chontales", "CO"),
    ES("Estel\u00ed", "ES"),
    GR("Granada", "GR"),
    JI("Jinotega", "JI"),
    LE("Le\u00f3n", "LE"),
    MD("Madriz", "MD"),
    MN("Managua", "MN"),
    MS("Masaya", "MS"),
    MT("Matagalpa", "MT"),
    NS("Nueva Segovia", "NS"),
    RI("Rivas", "RI"),
    SJ("R\u00edo San Juan", "SJ");
    public String name;
    public String code;

    SubDivisionNI(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.NI;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
