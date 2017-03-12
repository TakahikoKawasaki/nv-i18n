
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionID
    implements CountrySubDivisionCode
{

    AC("Aceh", "AC"),
    BA("Bali", "BA"),
    BB("Bangka Belitung", "BB"),
    BE("Bengkulu", "BE"),
    BT("Banten", "BT"),
    GO("Gorontalo", "GO"),
    JA("Jambi", "JA"),
    JB("Jawa Barat", "JB"),
    JI("Jawa Timur", "JI"),
    JK("Jakarta Raya", "JK"),
    JT("Jawa Tengah", "JT"),
    KB("Kalimantan Barat", "KB"),
    KI("Kalimantan Timur", "KI"),
    KR("Kepulauan Riau", "KR"),
    KS("Kalimantan Selatan", "KS"),
    KT("Kalimantan Tengah", "KT"),
    LA("Lampung", "LA"),
    MA("Maluku", "MA"),
    MU("Maluku Utara", "MU"),
    NB("Nusa Tenggara Barat", "NB"),
    NT("Nusa Tenggara Timur", "NT"),
    PA("Papua", "PA"),
    PB("Papua Barat", "PB"),
    RI("Riau", "RI"),
    SA("Sulawesi Utara", "SA"),
    SB("Sumatera Barat", "SB"),
    SG("Sulawesi Tenggara", "SG"),
    SN("Sulawesi Selatan", "SN"),
    SS("Sumatera Selatan", "SS"),
    ST("Sulawesi Tengah", "ST"),
    SU("Sumatera Utara", "SU"),
    YO("Yogyakarta", "YO");
    public String name;
    public String code;

    SubDivisionID(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.ID;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
