
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionWS
    implements CountrySubDivisionCode
{

    AA("Alana", "AA"),
    AL("Aiga-I-le-Tai", "AL"),
    AT("Atua", "AT"),
    FA("Fa'asaleleaga", "FA"),
    GE("Gaga'emauga", "GE"),
    GI("Gagaifomauga", "GI"),
    PA("Palauli", "PA"),
    SA("Satupa 'itea", "SA"),
    TU("Tuamasaga", "TU"),
    VF("Va'a-o-Fonoti", "VF"),
    VS("Vaisigano", "VS");
    public String name;
    public String code;

    SubDivisionWS(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.WS;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
