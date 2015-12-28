
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionSV
    implements CountrySubDivisionCode
{

    AH("Ahuachap\u00e1n", "AH"),
    CA("Caba\u00f1as", "CA"),
    CH("Chalatenango", "CH"),
    CU("Cuscatl\u00e1n", "CU"),
    LI("La Libertad", "LI"),
    MO("Moraz\u00e1n", "MO"),
    PA("La Paz", "PA"),
    SA("Santa Ana", "SA"),
    SM("San Miguel", "SM"),
    SO("Sonsonate", "SO"),
    SS("San Salvador", "SS"),
    SV("San Vicente", "SV"),
    UN("La Uni\u00f3n", "UN"),
    US("Usulut\u00e1n", "US");
    public String name;
    public String code;

    SubDivisionSV(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.SV;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
