
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionTL
    implements CountrySubDivisionCode
{

    AL("Aileu", "AL"),
    AN("Ainaro", "AN"),
    BA("Baucau", "BA"),
    BO("Bobonaro", "BO"),
    CO("Cova Lima", "CO"),
    DI("Dili", "DI"),
    ER("Ermera", "ER"),
    LA("Lautem", "LA"),
    LI("Liqui\u00e7a", "LI"),
    MF("Manufahi", "MF"),
    MT("Manatuto", "MT"),
    OE("Oecussi", "OE"),
    VI("Viqueque", "VI");
    public String name;
    public String code;

    SubDivisionTL(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.TL;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
