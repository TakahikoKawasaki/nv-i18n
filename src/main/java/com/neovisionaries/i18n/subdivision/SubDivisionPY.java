
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionPY
    implements CountrySubDivisionCode
{

    _1("Concepci\u00f3n", "1"),
    _10("Alto Paran\u00e1", "10"),
    _11("Central", "11"),
    _12("\u00d1eembuc\u00fa", "12"),
    _13("Amambay", "13"),
    _14("Canindey\u00fa", "14"),
    _15("Presidente Hayes", "15"),
    _16("Alto Paraguay", "16"),
    _19("Boquer\u00f3n", "19"),
    _2("San Pedro", "2"),
    _3("Cordillera", "3"),
    _4("Guair\u00e1", "4"),
    _5("Caaguaz\u00fa", "5"),
    _6("Caazap\u00e1", "6"),
    _7("Itap\u00faa", "7"),
    _8("Misiones", "8"),
    _9("Paraguar\u00ed", "9"),
    ASU("Asunci\u00f3n", "ASU");
    public String name;
    public String code;

    SubDivisionPY(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.PY;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
