
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionTN
    implements CountrySubDivisionCode
{

    _11("Tunis", "11"),
    _12("L'Ariana", "12"),
    _13("Ben Arous", "13"),
    _14("La Manouba", "14"),
    _21("Nabeul", "21"),
    _22("Zaghouan", "22"),
    _23("Bizerte", "23"),
    _31("B\u00e9ja", "31"),
    _32("Jendouba", "32"),
    _33("Le Kef", "33"),
    _34("Siliana", "34"),
    _41("Kairouan", "41"),
    _42("Kasserine", "42"),
    _43("Sidi Bouzid", "43"),
    _51("Sousse", "51"),
    _52("Monastir", "52"),
    _53("Mahdia", "53"),
    _61("Sfax", "61"),
    _71("Gafsa", "71"),
    _72("Tozeur", "72"),
    _73("Kebili", "73"),
    _81("Gab\u00e8s", "81"),
    _82("Medenine", "82"),
    _83("Tataouine", "83");
    public String name;
    public String code;

    SubDivisionTN(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.TN;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
