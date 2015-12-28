
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionTH
    implements CountrySubDivisionCode
{

    _10("Krung Thep Maha Nakhon [Bangkok]", "10"),
    _11("Samut Prakan", "11"),
    _12("Nonthaburi", "12"),
    _13("Pathum Thani", "13"),
    _14("Phra Nakhon Si Ayutthaya", "14"),
    _15("Ang Thong", "15"),
    _16("Lop Buri", "16"),
    _17("Sing Buri", "17"),
    _18("Chai Nat", "18"),
    _19("Saraburi", "19"),
    _20("Chon Buri", "20"),
    _21("Rayong", "21"),
    _22("Chanthaburi", "22"),
    _23("Trat", "23"),
    _24("Chachoengsao", "24"),
    _25("Prachin Buri", "25"),
    _26("Nakhon Nayok", "26"),
    _27("Sa Kaeo", "27"),
    _30("Nakhon Ratchasima", "30"),
    _31("Buri Ram", "31"),
    _32("Surin", "32"),
    _33("Si Sa Ket", "33"),
    _34("Ubon Ratchathani", "34"),
    _35("Yasothon", "35"),
    _36("Chaiyaphum", "36"),
    _37("Amnat Charoen", "37"),
    _39("Nong Bua Lam Phu", "39"),
    _40("Khon Kaen", "40"),
    _41("Udon Thani", "41"),
    _42("Loei", "42"),
    _43("Nong Khai", "43"),
    _44("Maha Sarakham", "44"),
    _45("Roi Et", "45"),
    _46("Kalasin", "46"),
    _47("Sakon Nakhon", "47"),
    _48("Nakhon Phanom", "48"),
    _49("Mukdahan", "49"),
    _50("Chiang Mai", "50"),
    _51("Lamphun", "51"),
    _52("Lampang", "52"),
    _53("Uttaradit", "53"),
    _54("Phrae", "54"),
    _55("Nan", "55"),
    _56("Phayao", "56"),
    _57("Chiang Rai", "57"),
    _58("Mae Hong Son", "58"),
    _60("Nakhon Sawan", "60"),
    _61("Uthai Thani", "61"),
    _62("Kamphaeng Phet", "62"),
    _63("Tak", "63"),
    _64("Sukhothai", "64"),
    _65("Phitsanulok", "65"),
    _66("Phichit", "66"),
    _67("Phetchabun", "67"),
    _70("Ratchaburi", "70"),
    _71("Kanchanaburi", "71"),
    _72("Suphan Buri", "72"),
    _73("Nakhon Pathom", "73"),
    _74("Samut Sakhon", "74"),
    _75("Samut Songkhram", "75"),
    _76("Phetchaburi", "76"),
    _77("Prachuap Khiri Khan", "77"),
    _80("Nakhon Si Thammarat", "80"),
    _81("Krabi", "81"),
    _82("Phangnga", "82"),
    _83("Phuket", "83"),
    _84("Surat Thani", "84"),
    _85("Ranong", "85"),
    _86("Chumphon", "86"),
    _90("Songkhla", "90"),
    _91("Satun", "91"),
    _92("Trang", "92"),
    _93("Phatthalung", "93"),
    _94("Pattani", "94"),
    _95("Yala", "95"),
    _96("Narathiwat", "96"),
    S("Phatthaya", "S");
    public String name;
    public String code;

    SubDivisionTH(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.TH;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
