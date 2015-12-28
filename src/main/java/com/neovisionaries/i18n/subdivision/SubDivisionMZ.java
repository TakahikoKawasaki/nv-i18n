
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionMZ
    implements CountrySubDivisionCode
{

    MPM("Maputo", "MPM"),
    A("Niaosa", "A"),
    B("Manica", "B"),
    G("Gaza", "G"),
    I("Inhambane", "I"),
    L("Maputo", "L"),
    N("Nampula", "N"),
    P("Cabo Delgado", "P"),
    Q("Zamb\u00e9zia", "Q"),
    S("Sofala", "S"),
    T("Tete", "T");
    public String name;
    public String code;

    SubDivisionMZ(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.MZ;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
