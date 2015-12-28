
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionNP
    implements CountrySubDivisionCode
{

    _1("Madhyamanchal", "1"),
    _2("Madhya Pashchimanchal", "2"),
    _3("Pashchimanchal", "3"),
    _4("Purwanchal", "4"),
    _5("Sudur Pashchimanchal", "5"),
    BA("Bagmati", "BA"),
    BH("Bheri", "BH"),
    DH("Dhawalagiri", "DH"),
    GA("Gandaki", "GA"),
    JA("Janakpur", "JA"),
    KA("Karnali", "KA"),
    KO("Kosi [Koshi]", "KO"),
    LU("Lumbini", "LU"),
    MA("Mahakali", "MA"),
    ME("Mechi", "ME"),
    NA("Narayani", "NA"),
    RA("Rapti", "RA"),
    SA("Sagarmatha", "SA"),
    SE("Seti", "SE");
    public String name;
    public String code;

    SubDivisionNP(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.NP;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
