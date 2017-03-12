
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionFI
    implements CountrySubDivisionCode
{

    _01("Ahvenanmaan maakunta", "01"),
    _02("Etel\u00e4-Karjala", "02"),
    _03("Etel\u00e4-Pohjanmaa", "03"),
    _04("Etel\u00e4-Savo", "04"),
    _05("Kainuu", "05"),
    _06("Kanta-H\u00e4me", "06"),
    _07("Keski-Pohjanmaa", "07"),
    _08("Keski-Suomi", "08"),
    _09("Kymenlaakso", "09"),
    _10("Lappi", "10"),
    _11("Pirkanmaa", "11"),
    _12("Pohjanmaa", "12"),
    _13("Pohjois-Karjala", "13"),
    _14("Pohjois-Pohjanmaa", "14"),
    _15("Pohjois-Savo", "15"),
    _16("P\u00e4ij\u00e4t-H\u00e4me", "16"),
    _17("Satakunta", "17"),
    _18("Uusimaa", "18"),
    _19("Varsinais-Suomi", "19");
    public String name;
    public String code;

    SubDivisionFI(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.FI;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
