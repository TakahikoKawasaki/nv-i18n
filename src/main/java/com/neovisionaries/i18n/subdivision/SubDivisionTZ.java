
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionTZ
    implements CountrySubDivisionCode
{

    _01("Arusha", "01"),
    _02("Dar es Salaam", "02"),
    _03("Dodoma", "03"),
    _04("Iringa", "04"),
    _05("Kagera", "05"),
    _06("Kaskazini Pemba", "06"),
    _07("Kaskazini Unguja", "07"),
    _08("Kigoma", "08"),
    _09("Kilimanjaro", "09"),
    _10("Kusini Pemba", "10"),
    _11("Kusini Unguja", "11"),
    _12("Lindi", "12"),
    _13("Mara", "13"),
    _14("Mbeya", "14"),
    _15("Mjini Magharibi", "15"),
    _16("Morogoro", "16"),
    _17("Mtwara", "17"),
    _18("Mwanza", "18"),
    _19("Pwani", "19"),
    _20("Rukwa", "20"),
    _21("Ruvuma", "21"),
    _22("Shinyanga", "22"),
    _23("Singida", "23"),
    _24("Tabora", "24"),
    _25("Tanga", "25"),
    _26("Manyara", "26");
    public String name;
    public String code;

    SubDivisionTZ(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.TZ;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
