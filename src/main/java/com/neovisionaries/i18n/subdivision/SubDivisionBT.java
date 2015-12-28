
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionBT
    implements CountrySubDivisionCode
{

    _11("Paro", "11"),
    _12("Chhukha", "12"),
    _13("Ha", "13"),
    _14("Samtse", "14"),
    _15("Thimphu", "15"),
    _21("Tsirang", "21"),
    _22("Dagana", "22"),
    _23("Punakha", "23"),
    _24("Wangdue Phodrang", "24"),
    _31("Sarpang", "31"),
    _32("Trongsa", "32"),
    _33("Bumthang", "33"),
    _34("Zhemgang", "34"),
    _41("Trashigang", "41"),
    _42("Monggar", "42"),
    _43("Pemagatshel", "43"),
    _44("Lhuentse", "44"),
    _45("Samdrup Jongkha", "45"),
    GA("Gasa", "GA"),
    TY("Trashi Yangtse", "TY");
    public String name;
    public String code;

    SubDivisionBT(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.BT;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
