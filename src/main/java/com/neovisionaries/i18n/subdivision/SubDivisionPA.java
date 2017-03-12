
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionPA
    implements CountrySubDivisionCode
{

    EM("Ember\u00e1", "EM"),
    KY("Kuna Yala", "KY"),
    NB("Ng\u00f6be-Bugl\u00e9", "NB"),
    _1("Bocas del Toro", "1"),
    _2("Cocl\u00e9", "2"),
    _3("Col\u00f3n", "3"),
    _4("Chiriqu\u00ed", "4"),
    _5("Dari\u00e9n", "5"),
    _6("Herrera", "6"),
    _7("Los Santos", "7"),
    _8("Panam\u00e1", "8"),
    _9("Veraguas", "9");
    public String name;
    public String code;

    SubDivisionPA(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.PA;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
