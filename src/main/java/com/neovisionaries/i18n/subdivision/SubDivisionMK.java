
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionMK
    implements CountrySubDivisionCode
{

    _01("Aerodrom", "01"),
    _02("Ara\u010dinovo", "02"),
    _03("Berovo", "03"),
    _04("Bitola", "04"),
    _05("Bogdanci", "05"),
    _06("Bogovinje", "06"),
    _07("Bosilovo", "07"),
    _08("Brvenica", "08"),
    _09("Butel", "09"),
    _10("Valandovo", "10"),
    _11("Vasilevo", "11"),
    _12("Vev\u010dani", "12"),
    _13("Veles", "13"),
    _14("Vinica", "14"),
    _15("Vrane\u0161tica", "15"),
    _16("Vrap\u010di\u0161te", "16"),
    _17("Gazi Babae", "17"),
    _18("Gevgelija", "18"),
    _19("Gostivar", "19"),
    _20("Gradsko", "20"),
    _21("Debar", "21"),
    _22("Debarca", "22"),
    _23("Del\u010devo", "23"),
    _24("Demir Kapija", "24"),
    _25("Demir Hisar", "25"),
    _26("Dojran", "26"),
    _27("Dolneni", "27"),
    _28("Drugovo", "28"),
    _29("Gjor\u010de Petrov", "29"),
    _30("\u017delino", "30"),
    _31("Zajas", "31"),
    _32("Zelenikovo", "32"),
    _33("Zrnovci", "33"),
    _34("Ilinden", "34"),
    _35("Jegunovce", "35"),
    _36("Kavadarci", "36"),
    _37("Karbinci", "37"),
    _38("Karpo\u0161", "38"),
    _39("Kisela Voda", "39"),
    _40("Ki\u010devo", "40"),
    _41("Kon\u010de", "41"),
    _42("Ko\u010dani", "42"),
    _43("Kratovo", "43"),
    _44("Kriva Palanka", "44"),
    _45("Krivoga\u0161tan", "45"),
    _46("Kru\u0161evo", "46"),
    _47("Kumanovo", "47"),
    _48("Lipkovo", "48"),
    _49("Lozovo", "49"),
    _50("Mavrovo-i-Rostu\u0161a", "50"),
    _51("Makedonska Kamenica", "51"),
    _52("Makedonski Brod", "52"),
    _53("Mogila", "53"),
    _54("Negotino", "54"),
    _55("Novaci", "55"),
    _56("Novo Selo", "56"),
    _57("Oslomej", "57"),
    _58("Ohrid", "58"),
    _59("Petrovec", "59"),
    _60("Peh\u010devo", "60"),
    _61("Plasnica", "61"),
    _62("Prilep", "62"),
    _63("Probi\u0161tip", "63"),
    _64("Radovi\u0161", "64"),
    _65("Rankovce", "65"),
    _66("Resen", "66"),
    _67("Rosoman", "67"),
    _68("Saraj", "68"),
    _69("Sveti Nikole", "69"),
    _70("Sopi\u0161te", "70"),
    _71("Staro Nagori\u010dane", "71"),
    _72("Struga", "72"),
    _73("Strumica", "73"),
    _74("Studeni\u010dani", "74"),
    _75("Tearce", "75"),
    _76("Tetovo", "76"),
    _77("Centar", "77"),
    _78("Centar \u017dupa", "78"),
    _79("\u010cair", "79"),
    _80("\u010ca\u0161ka", "80"),
    _81("\u010ce\u0161inovo-Oble\u0161evo", "81"),
    _82("\u010cu\u010der Sandevo", "82"),
    _83("\u0160tip", "83"),
    _84("\u0160uto Orizari", "84");
    public String name;
    public String code;

    SubDivisionMK(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.MK;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
