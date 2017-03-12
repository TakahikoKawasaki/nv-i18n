
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionFR
    implements CountrySubDivisionCode
{

    CP("Clipperton", "CP"),
    _01("Ain", "01"),
    _02("Aisne", "02"),
    _03("Allier", "03"),
    _04("Alpes-de-Haute-Provence", "04"),
    _05("Hautes-Alpes", "05"),
    _06("Alpes-Maritimes", "06"),
    _07("Ard\u00e8che", "07"),
    _08("Ardennes", "08"),
    _09("Ari\u00e8ge", "09"),
    _10("Aube", "10"),
    _11("Aude", "11"),
    _12("Aveyron", "12"),
    _13("Bouches-du-Rh\u00f4ne", "13"),
    _14("Calvados", "14"),
    _15("Cantal", "15"),
    _16("Charente", "16"),
    _17("Charente-Maritime", "17"),
    _18("Cher", "18"),
    _19("Corr\u00e8ze", "19"),
    _21("C\u00f4te-d'Or", "21"),
    _22("C\u00f4tes-d'Armor", "22"),
    _23("Creuse", "23"),
    _24("Dordogne", "24"),
    _25("Doubs", "25"),
    _26("Dr\u00f4me", "26"),
    _27("Eure", "27"),
    _28("Eure-et-Loir", "28"),
    _29("Finist\u00e8re", "29"),
    _2A("Corse-du-Sud", "2A"),
    _2B("Haute-Corse", "2B"),
    _30("Gard", "30"),
    _31("Haute-Garonne", "31"),
    _32("Gers", "32"),
    _33("Gironde", "33"),
    _34("H\u00e9rault", "34"),
    _35("Ille-et-Vilaine", "35"),
    _36("Indre", "36"),
    _37("Indre-et-Loire", "37"),
    _38("Is\u00e8re", "38"),
    _39("Jura", "39"),
    _40("Landes", "40"),
    _41("Loir-et-Cher", "41"),
    _42("Loire", "42"),
    _43("Haute-Loire", "43"),
    _44("Loire-Atlantique", "44"),
    _45("Loiret", "45"),
    _46("Lot", "46"),
    _47("Lot-et-Garonne", "47"),
    _48("Loz\u00e8re", "48"),
    _49("Maine-et-Loire", "49"),
    _50("Manche", "50"),
    _51("Marne", "51"),
    _52("Haute-Marne", "52"),
    _53("Mayenne", "53"),
    _54("Meurthe-et-Moselle", "54"),
    _55("Meuse", "55"),
    _56("Morbihan", "56"),
    _57("Moselle", "57"),
    _58("Ni\u00e8vre", "58"),
    _59("Nord", "59"),
    _60("Oise", "60"),
    _61("Orne", "61"),
    _62("Pas-de-Calais", "62"),
    _63("Puy-de-D\u00f4me", "63"),
    _64("Pyr\u00e9n\u00e9es-Atlantiques", "64"),
    _65("Hautes-Pyr\u00e9n\u00e9es", "65"),
    _66("Pyr\u00e9n\u00e9es-Orientales", "66"),
    _67("Bas-Rhin", "67"),
    _68("Haut-Rhin", "68"),
    _69("Rh\u00f4ne", "69"),
    _70("Haute-Sa\u00f4ne", "70"),
    _71("Sa\u00f4ne-et-Loire", "71"),
    _72("Sarthe", "72"),
    _73("Savoie", "73"),
    _74("Haute-Savoie", "74"),
    _75("Paris", "75"),
    _76("Seine-Maritime", "76"),
    _77("Seine-et-Marne", "77"),
    _78("Yvelines", "78"),
    _79("Deux-S\u00e8vres", "79"),
    _80("Somme", "80"),
    _81("Tarn", "81"),
    _82("Tarn-et-Garonne", "82"),
    _83("Var", "83"),
    _84("Vaucluse", "84"),
    _85("Vend\u00e9e", "85"),
    _86("Vienne", "86"),
    _87("Haute-Vienne", "87"),
    _88("Vosges", "88"),
    _89("Yonne", "89"),
    _90("Territoire de Belfort", "90"),
    _91("Essonne", "91"),
    _92("Hauts-de-Seine", "92"),
    _93("Seine-Saint-Denis", "93"),
    _94("Val-de-Marne", "94"),
    _95("Val-d'Oise", "95");
    public String name;
    public String code;

    SubDivisionFR(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.FR;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
