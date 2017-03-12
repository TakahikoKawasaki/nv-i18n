
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionME
    implements CountrySubDivisionCode
{

    _01("Andrijevica", "01"),
    _02("Bar", "02"),
    _03("Berane", "03"),
    _04("Bijelo Polje", "04"),
    _05("Budva", "05"),
    _06("Cetinje", "06"),
    _07("Danilovgrad", "07"),
    _08("Herceg-Novi", "08"),
    _09("Kola\u0161in", "09"),
    _10("Kotor", "10"),
    _11("Mojkovac", "11"),
    _12("Nik\u0161i\u0107", "12"),
    _13("Plav", "13"),
    _14("Pljevlja", "14"),
    _15("Plu\u017eine", "15"),
    _16("Podgorica", "16"),
    _17("Ro\u017eaje", "17"),
    _18("\u0160avnik", "18"),
    _19("Tivat", "19"),
    _20("Ulcinj", "20"),
    _21("\u017dabljak", "21");
    public String name;
    public String code;

    SubDivisionME(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.ME;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
