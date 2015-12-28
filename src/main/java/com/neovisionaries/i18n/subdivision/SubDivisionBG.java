
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionBG
    implements CountrySubDivisionCode
{

    _01("Blagoevgrad", "01"),
    _02("Burgas", "02"),
    _03("Varna", "03"),
    _04("Veliko Tarnovo", "04"),
    _05("Vidin", "05"),
    _06("Vratsa", "06"),
    _07("Gabrovo", "07"),
    _08("Dobrich", "08"),
    _09("Kardzhali", "09"),
    _10("Kjustendil", "10"),
    _11("Lovech", "11"),
    _12("Montana", "12"),
    _13("Pazardzhik", "13"),
    _14("Pernik", "14"),
    _15("Pleven", "15"),
    _16("Plovdiv", "16"),
    _17("Razgrad", "17"),
    _18("Ruse", "18"),
    _19("Silistra", "19"),
    _20("Sliven", "20"),
    _21("Smolyan", "21"),
    _22("Sofija-Grad", "22"),
    _23("Sofia", "23"),
    _24("Stara Zagora", "24"),
    _25("Targovishte", "25"),
    _26("Haskovo", "26"),
    _27("Shumen", "27"),
    _28("Yambol", "28");
    public String name;
    public String code;

    SubDivisionBG(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.BG;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
