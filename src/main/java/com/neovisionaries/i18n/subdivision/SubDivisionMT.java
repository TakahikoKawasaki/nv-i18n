
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionMT
    implements CountrySubDivisionCode
{

    _01("Attard", "01"),
    _02("Balzan", "02"),
    _03("Birgu", "03"),
    _04("Birkirkara", "04"),
    _05("Bir\u017cebbu\u0121a", "05"),
    _06("Bormla", "06"),
    _07("Dingli", "07"),
    _08("Fgura", "08"),
    _09("Floriana", "09"),
    _10("Fontana", "10"),
    _11("Gudja", "11"),
    _12("G\u017cira", "12"),
    _13("G\u0127ajnsielem", "13"),
    _14("G\u0127arb", "14"),
    _15("G\u0127arg\u0127ur", "15"),
    _16("G\u0127asri", "16"),
    _17("G\u0127axaq", "17"),
    _18("\u0126amrun", "18"),
    _19("Iklin", "19"),
    _20("Isla", "20"),
    _21("Kalkara", "21"),
    _22("Ker\u010bem", "22"),
    _23("Kirkop", "23"),
    _24("Lija", "24"),
    _25("Luqa", "25"),
    _26("Marsa", "26"),
    _27("Marsaskala", "27"),
    _28("Marsaxlokk", "28"),
    _29("Mdina", "29"),
    _30("Mellie\u0127a", "30"),
    _31("M\u0121arr", "31"),
    _32("Mosta", "32"),
    _33("Mqabba", "33"),
    _34("Msida", "34"),
    _35("Mtarfa", "35"),
    _36("Munxar", "36"),
    _37("Nadur", "37"),
    _38("Naxxar", "38"),
    _39("Paola", "39"),
    _40("Pembroke", "40"),
    _41("Piet\u00e0", "41"),
    _42("Qala", "42"),
    _43("Qormi", "43"),
    _44("Qrendi", "44"),
    _45("Rabat Gozo", "45"),
    _46("Rabat Malta", "46"),
    _47("Safi", "47"),
    _48("Saint Julian\u2019s", "48"),
    _49("Saint John", "49"),
    _50("Saint Lawrence", "50"),
    _51("Saint Paul\u2019s Bay", "51"),
    _52("Sannat", "52"),
    _53("Saint Lucia\u2019s", "53"),
    _54("Santa Venera", "54"),
    _55("Si\u0121\u0121iewi", "55"),
    _56("Sliema", "56"),
    _57("Swieqi", "57"),
    _58("Ta\u2019 Xbiex", "58"),
    _59("Tarxien", "59"),
    _60("Valletta", "60"),
    _61("Xag\u0127ra", "61"),
    _62("Xewkija", "62"),
    _63("Xg\u0127ajra", "63"),
    _64("\u017babbar", "64"),
    _65("\u017bebbu\u0121 Gozo", "65"),
    _66("\u017bebbu\u0121 Malta", "66"),
    _67("\u017bejtun", "67"),
    _68("\u017burrieq", "68");
    public String name;
    public String code;

    SubDivisionMT(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.MT;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
