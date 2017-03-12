
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionSN
    implements CountrySubDivisionCode
{

    DB("Diourbel", "DB"),
    DK("Dakar", "DK"),
    FK("Fatick", "FK"),
    KA("Kaffrine", "KA"),
    KD("Kolda", "KD"),
    KE("K\u00e9dougou", "KE"),
    KL("Kaolack", "KL"),
    LG("Louga", "LG"),
    MT("Matam", "MT"),
    SE("S\u00e9dhiou", "SE"),
    SL("Saint-Louis", "SL"),
    TC("Tambacounda", "TC"),
    TH("Thi\u00e8s", "TH"),
    ZG("Ziguinchor", "ZG");
    public String name;
    public String code;

    SubDivisionSN(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.SN;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
