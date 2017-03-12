
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionNA
    implements CountrySubDivisionCode
{

    CA("Caprivi", "CA"),
    ER("Erongo", "ER"),
    HA("Hardap", "HA"),
    KA("Karas", "KA"),
    KH("Khomas", "KH"),
    KU("Kunene", "KU"),
    OD("Otjozondjupa", "OD"),
    OH("Omaheke", "OH"),
    OK("Okavango", "OK"),
    ON("Oshana", "ON"),
    OS("Omusati", "OS"),
    OT("Oshikoto", "OT"),
    OW("Ohangwena", "OW");
    public String name;
    public String code;

    SubDivisionNA(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.NA;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
