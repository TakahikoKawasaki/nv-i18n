
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionTR
    implements CountrySubDivisionCode
{

    _01("Adana", "01"),
    _02("Adiyaman", "02"),
    _03("Afyon", "03"),
    _04("A\u011fr\u0131", "04"),
    _05("Amasya", "05"),
    _06("Ankara", "06"),
    _07("Antalya", "07"),
    _08("Artvin", "08"),
    _09("Aydin", "09"),
    _10("Balikesir", "10"),
    _11("Bilecik", "11"),
    _12("Bing\u00f6l", "12"),
    _13("Bitlis", "13"),
    _14("Bolu", "14"),
    _15("Burdur", "15"),
    _16("Bursa", "16"),
    _17("\u00c7anakkale", "17"),
    _18("\u00c7ank\u0131r\u0131", "18"),
    _19("\u00c7orum", "19"),
    _20("Denizli", "20"),
    _21("Diyarbakir", "21"),
    _22("Edirne", "22"),
    _23("Elaz\u0131\u011f", "23"),
    _24("Erzincan", "24"),
    _25("Erzurum", "25"),
    _26("Eski\u015fehir", "26"),
    _27("Gaziantep", "27"),
    _28("Giresun", "28"),
    _29("G\u00fcm\u00fc\u015fhane", "29"),
    _30("Hakk\u00e2ri", "30"),
    _31("Hatay", "31"),
    _32("Isparta", "32"),
    _33("Icel", "33"),
    _34("Istanbul", "34"),
    _35("Izmir", "35"),
    _36("Kars", "36"),
    _37("Kastamonu", "37"),
    _38("Kayseri", "38"),
    _39("Kirklareli", "39"),
    _40("K\u0131r\u015fehir", "40"),
    _41("Kocaeli", "41"),
    _42("Konya", "42"),
    _43("K\u00fctahya", "43"),
    _44("Malatya", "44"),
    _45("Manisa", "45"),
    _46("Kahramanmara\u015f", "46"),
    _47("Mardin", "47"),
    _48("Mu\u011fla", "48"),
    _49("Mu\u015f", "49"),
    _50("Nev\u015fehir", "50"),
    _51("Ni\u011fde", "51"),
    _52("Ordu", "52"),
    _53("Rize", "53"),
    _54("Sakarya", "54"),
    _55("Samsun", "55"),
    _56("Siirt", "56"),
    _57("Sinop", "57"),
    _58("Sivas", "58"),
    _59("Tekirda\u011f", "59"),
    _60("Tokat", "60"),
    _61("Trabzon", "61"),
    _62("Tunceli", "62"),
    _63("\u015eanl\u0131urfa", "63"),
    _64("U\u015fak", "64"),
    _65("Van", "65"),
    _66("Yozgat", "66"),
    _67("Zonguldak", "67"),
    _68("Aksaray", "68"),
    _69("Bayburt", "69"),
    _70("Karaman", "70"),
    _71("Kirkkale", "71"),
    _72("Batman", "72"),
    _73("\u015e\u0131rnak", "73"),
    _74("Bartin", "74"),
    _75("Ardahan", "75"),
    _76("I\u011fd\u0131r", "76"),
    _77("Yalova", "77"),
    _78("Karab\u00fck", "78"),
    _79("Kilis", "79"),
    _80("Osmaniye", "80"),
    _81("D\u00fczce", "81");
    public String name;
    public String code;

    SubDivisionTR(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.TR;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
