
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionNO
    implements CountrySubDivisionCode
{

    _01("\u00d8stfold", "01"),
    _02("Akershus", "02"),
    _03("Oslo", "03"),
    _04("Hedmark", "04"),
    _05("Oppland", "05"),
    _06("Buskerud", "06"),
    _07("Vestfold", "07"),
    _08("Telemark", "08"),
    _09("Aust-Agder", "09"),
    _10("Vest-Agder", "10"),
    _11("Rogaland", "11"),
    _12("Hordaland", "12"),
    _14("Sogn og Fjordane", "14"),
    _15("M\u00f8re og Romsdal", "15"),
    _16("S\u00f8r-Tr\u00f8ndelag", "16"),
    _17("Nord-Tr\u00f8ndelag", "17"),
    _18("Nordland", "18"),
    _19("Troms", "19"),
    _20("Finnmark", "20");
    public String name;
    public String code;

    SubDivisionNO(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.NO;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
