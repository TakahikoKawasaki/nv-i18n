
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionKE
    implements CountrySubDivisionCode
{

    _110("Nairobi", "110"),
    _200("Central", "200"),
    _300("Coast", "300"),
    _400("Eastern", "400"),
    _500("North-Eastern", "500"),
    _600("Nyanza", "600"),
    _700("Rift Valley", "700"),
    _800("Western", "800");
    public String name;
    public String code;

    SubDivisionKE(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.KE;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
