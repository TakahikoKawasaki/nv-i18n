
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionGR
    implements CountrySubDivisionCode
{

    _01("Aitolia kai Akarnania", "01"),
    _03("Voiotia", "03"),
    _04("Evvoia", "04"),
    _05("Evrytania", "05"),
    _06("Fthiotida", "06"),
    _07("Fokida", "07"),
    _11("Argolida", "11"),
    _12("Arkadia", "12"),
    _13("Acha\u00efa", "13"),
    _14("Ileia", "14"),
    _15("Korinthia", "15"),
    _16("Lakonia", "16"),
    _17("Messinia", "17"),
    _21("Zakynthos", "21"),
    _22("Kerkyra", "22"),
    _23("Kefallonia", "23"),
    _24("Lefkada", "24"),
    _31("Arta", "31"),
    _32("Thesprotia", "32"),
    _33("Ioannina", "33"),
    _34("Preveza", "34"),
    _41("Karditsa", "41"),
    _42("Larisa", "42"),
    _43("Magnisia", "43"),
    _44("Trikala", "44"),
    _51("Grevena", "51"),
    _52("Drama", "52"),
    _53("Imathia", "53"),
    _54("Thessaloniki", "54"),
    _55("Kavala", "55"),
    _56("Kastoria", "56"),
    _57("Kilkis", "57"),
    _58("Kozani", "58"),
    _59("Pella", "59"),
    _61("Pieria", "61"),
    _62("Serres", "62"),
    _63("Florina", "63"),
    _64("Chalkidiki", "64"),
    _69("Agio Oros", "69"),
    _71("Evros", "71"),
    _72("Xanthi", "72"),
    _73("Rodopi", "73"),
    _81("Dodekanisos", "81"),
    _82("Kyklades", "82"),
    _83("Lesvos", "83"),
    _84("Samos", "84"),
    _85("Chios", "85"),
    _91("Irakleio", "91"),
    _92("Lasithi", "92"),
    _93("Rethymno", "93"),
    _94("Chania", "94"),
    A1("Attiki", "A1");
    public String name;
    public String code;

    SubDivisionGR(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.GR;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
