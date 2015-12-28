
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionGE
    implements CountrySubDivisionCode
{

    AB("Abkhazia", "AB"),
    AJ("Ajaria", "AJ"),
    GU("Guria", "GU"),
    IM("Imeret'i", "IM"),
    KA("Kakhet'i", "KA"),
    KK("K'vemo K'art'li", "KK"),
    MM("Mts'khet'a-Mt'ianet'i", "MM"),
    RL("Racha-Lech'khumi-K'vemo Svanet'i", "RL"),
    SJ("Samts'khe-Javakhet'i", "SJ"),
    SK("Shida K'art'li", "SK"),
    SZ("Samegrelo-Zemo Svanet'i", "SZ"),
    TB("T'bilisi", "TB");
    public String name;
    public String code;

    SubDivisionGE(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.GE;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
