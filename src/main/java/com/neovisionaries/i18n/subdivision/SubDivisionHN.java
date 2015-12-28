
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionHN
    implements CountrySubDivisionCode
{

    AT("Atl\u00e1ntida", "AT"),
    CH("Choluteca", "CH"),
    CL("Col\u00f3n", "CL"),
    CM("Comayagua", "CM"),
    CP("Cop\u00e1n", "CP"),
    CR("Cort\u00e9s", "CR"),
    EP("El Para\u00edso", "EP"),
    FM("Francisco Moraz\u00e1n", "FM"),
    GD("Gracias a Dios", "GD"),
    IB("Islas de la Bah\u00eda", "IB"),
    IN("Intibuc\u00e1", "IN"),
    LE("Lempira", "LE"),
    LP("La Paz", "LP"),
    OC("Ocotepeque", "OC"),
    OL("Olancho", "OL"),
    SB("Santa B\u00e1rbara", "SB"),
    VA("Valle", "VA"),
    YO("Yoro", "YO");
    public String name;
    public String code;

    SubDivisionHN(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.HN;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
