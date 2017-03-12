
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionMV
    implements CountrySubDivisionCode
{

    _00("Alifu Dhaalu", "00"),
    _01("Seenu", "01"),
    _02("Alifu Alifu", "02"),
    _03("Lhaviyani", "03"),
    _04("Vaavu", "04"),
    _05("Laamu", "05"),
    _07("Haa Alifu", "07"),
    _08("Thaa", "08"),
    _12("Meemu", "12"),
    _13("Raa", "13"),
    _14("Faafu", "14"),
    _17("Dhaalu", "17"),
    _20("Baa", "20"),
    _23("Haa Dhaalu", "23"),
    _24("Shaviyani", "24"),
    _25("Noonu", "25"),
    _26("Kaafu", "26"),
    _27("Gaaf Alifu", "27"),
    _28("Gaafu Dhaalu", "28"),
    _29("Gnaviyani", "29"),
    MLE("Male", "MLE");
    public String name;
    public String code;

    SubDivisionMV(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.MV;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
