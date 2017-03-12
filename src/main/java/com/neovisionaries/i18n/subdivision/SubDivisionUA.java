
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionUA
    implements CountrySubDivisionCode
{

    _05("Vinnyts'ka Oblast'", "05"),
    _07("Volyns'ka Oblast'", "07"),
    _09("Luhans'ka Oblast'", "09"),
    _12("Dnipropetrovs'ka Oblast'", "12"),
    _14("Donets'ka Oblast'", "14"),
    _18("Zhytomyrs'ka Oblast'", "18"),
    _21("Zakarpats'ka Oblast'", "21"),
    _23("Zaporiz'ka Oblast'", "23"),
    _26("Ivano-Frankivs'ka Oblast'", "26"),
    _30("Ky\u00efv", "30"),
    _32("Kylvs'ka Oblast'", "32"),
    _35("Kirovohrads'ka Oblast'", "35"),
    _40("Sevastopol'", "40"),
    _46("L'vivs'ka Oblast'", "46"),
    _48("Mykolaivs'ka Oblast'", "48"),
    _51("Odes'ka Oblast'", "51"),
    _53("Poltavs'ka Oblast'", "53"),
    _56("Rivnens'ka Oblast'", "56"),
    _59("Sums'ka Oblast'", "59"),
    _61("Ternopil's'ka Oblast'", "61"),
    _63("Kharkivs'ka Oblast'", "63"),
    _68("Khmel'nyts'ka Oblast'", "68"),
    _71("Cherkas'ka Oblast'", "71"),
    _74("Chernihivs'ka Oblast'", "74"),
    _77("Chernivets'ka Oblast'", "77"),
    _43("Respublika Krym", "43");
    public String name;
    public String code;

    SubDivisionUA(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.UA;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
