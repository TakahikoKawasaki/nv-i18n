
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionGA
    implements CountrySubDivisionCode
{

    _1("Estuaire", "1"),
    _2("Haut-Ogoou\u00e9", "2"),
    _3("Moyen-Ogoou\u00e9", "3"),
    _4("Ngouni\u00e9", "4"),
    _5("Nyanga", "5"),
    _6("Ogoou\u00e9-Ivindo", "6"),
    _7("Ogoou\u00e9-Lolo", "7"),
    _8("Ogoou\u00e9-Maritime", "8"),
    _9("Woleu-Ntem", "9");
    public String name;
    public String code;

    SubDivisionGA(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.GA;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
