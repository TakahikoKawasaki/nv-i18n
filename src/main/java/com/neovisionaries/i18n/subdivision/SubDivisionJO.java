
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionJO
    implements CountrySubDivisionCode
{

    AJ("\u02bdAjl\u016bn", "AJ"),
    AM("\u2018Amm\u0101n (Al \u2018A\u0305\u015fimah)", "AM"),
    AQ("Al'Aqaba", "AQ"),
    AT("A\u0163 \u0162af\u012blah", "AT"),
    AZ("Az Zarq\u0101'", "AZ"),
    BA("Al Balq\u0101'", "BA"),
    IR("Irbid", "IR"),
    JA("Jarash", "JA"),
    KA("AI Karak", "KA"),
    MA("AI Mafraq", "MA"),
    MD("M\u0101dab\u0101", "MD"),
    MN("Ma'\u0101n", "MN");
    public String name;
    public String code;

    SubDivisionJO(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.JO;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
