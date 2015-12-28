
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionMA
    implements CountrySubDivisionCode
{

    _01("Tanger-T\u00e9touan", "01"),
    _02("Gharb-Chrarda-Beni Hssen", "02"),
    _03("Taza-Al Hoceima-Taounate", "03"),
    _04("L'Oriental", "04"),
    _05("F\u00e8s-Boulemane", "05"),
    _06("Mekn\u00e8s-Tafilalet", "06"),
    _07("Rabat-Sal\u00e9-Zemmour-Zaer", "07"),
    _08("Grand Casablanca", "08"),
    _09("Chaouia-Ouardigha", "09"),
    _10("Doukhala-Abda", "10"),
    _11("Marrakech-Tensift-Al Haouz", "11"),
    _12("Tadla-Azilal", "12"),
    _13("Sous-Massa-Draa", "13"),
    _14("Guelmim-Es Smara", "14"),
    _15("La\u00e2youne-Boujdour-Sakia el Hamra", "15"),
    _16("Oued ed Dahab-Lagouira (EH)", "16"),
    AGD("Agadir-Ida-Outanane", "AGD"),
    AOU("Aousserd (EH)", "AOU"),
    CAS("Casablanca [Dar el Be\u00efda]*", "CAS"),
    FAH("Fahs-Beni Makada", "FAH"),
    FES("F\u00e8s-Dar-Dbibegh", "FES"),
    INE("Inezgane-Ait Melloul", "INE"),
    MEK("Mekn\u00e8s", "MEK"),
    MMD("Marrakech-Medina", "MMD"),
    MMN("Marrakech-Menara", "MMN"),
    MOH("Mohammadia", "MOH"),
    OUJ("Oujda-Angad", "OUJ"),
    RAB("Rabat", "RAB"),
    SAL("Sal\u00e9", "SAL"),
    SKH("Skhirate-T\u00e9mara", "SKH"),
    SYB("Sidi Youssef Ben Ali", "SYB"),
    TET("T\u00e9touan", "TET"),
    TNG("Tanger-Assilah", "TNG"),
    ASZ("Assa-Zag", "ASZ"),
    AZI("Azilal", "AZI"),
    BEM("Beni Mellal", "BEM"),
    BER("Berkane", "BER"),
    BES("Ben Slimane", "BES"),
    BOD("Boujdour (EH)", "BOD"),
    BOM("Boulemane", "BOM"),
    CHE("Chefchaouene", "CHE"),
    CHI("Chichaoua", "CHI"),
    CHT("Chtouka-Ait Baha", "CHT"),
    ERR("Errachidia", "ERR"),
    ESI("Essaouira", "ESI"),
    ESM("Es Smara (EH)", "ESM"),
    FIG("Figuig", "FIG"),
    GUE("Guelmim", "GUE"),
    HAJ("El Hajeb", "HAJ"),
    HAO("Al Haouz", "HAO"),
    HOC("Al Hoce\u00efma", "HOC"),
    IFR("Ifrane", "IFR"),
    JDI("El Jadida", "JDI"),
    JRA("Jrada", "JRA"),
    KEN("K\u00e8nitra", "KEN"),
    KES("Kelaat es Sraghna", "KES"),
    KHE("Khemisset", "KHE"),
    KHN("Khenifra", "KHN"),
    KHO("Khouribga", "KHO"),
    LAA("La\u00e2youne", "LAA"),
    LAR("Larache", "LAR"),
    MED("M\u00e9diouna", "MED"),
    MOU("Moulay Yacoub", "MOU"),
    NAD("Nador", "NAD"),
    NOU("Nouaceur", "NOU"),
    OUA("Ouarzazate", "OUA"),
    OUD("Oued ed Dahab (EH)", "OUD"),
    SAF("Safi", "SAF"),
    SEF("Sefrou", "SEF"),
    SET("Settat", "SET"),
    SIK("Sidi Kacem", "SIK"),
    TAI("Taourirt", "TAI"),
    TAO("Taounate", "TAO"),
    TAR("Taroudant", "TAR"),
    TAT("Tata", "TAT"),
    TAZ("Taza", "TAZ"),
    TIZ("Tiznit", "TIZ"),
    TNT("Tan-Tan", "TNT"),
    ZAG("Zagora", "ZAG");
    public String name;
    public String code;

    SubDivisionMA(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.MA;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
