
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionQA
    implements CountrySubDivisionCode
{

    DA("Ad Daw\u1e29ah", "DA"),
    KH("Al Khawr wa adh Dhakh\u012brah", "KH"),
    MS("Ash Sham\u0101l", "MS"),
    RA("Ar Rayy\u0101n", "RA"),
    US("Umm \u015eal\u0101l", "US"),
    WA("Al Wakrah", "WA"),
    ZA("Az\u0327 Z\u0327a\u2018\u0101yin", "ZA");
    public String name;
    public String code;

    SubDivisionQA(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.QA;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
