
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionMU
    implements CountrySubDivisionCode
{

    AG("Agalega Islands", "AG"),
    BL("Black River", "BL"),
    BR("Beau Bassin-Rose Hill", "BR"),
    CC("Cargados Carajos Shoals", "CC"),
    CU("Curepipe", "CU"),
    FL("Flacq", "FL"),
    GP("Grand Port", "GP"),
    MO("Moka", "MO"),
    PA("Pamplemousses", "PA"),
    PL("Part Louis", "PL"),
    PU("Port Louis", "PU"),
    PW("Plaines wilhems", "PW"),
    QB("Quatre Bornes", "QB"),
    RO("Rodrigues Island", "RO"),
    RR("Rivi\u00e8re du Rempart", "RR"),
    SA("Savanne", "SA"),
    VP("Vacoas-Phoenix", "VP");
    public String name;
    public String code;

    SubDivisionMU(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.MU;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
