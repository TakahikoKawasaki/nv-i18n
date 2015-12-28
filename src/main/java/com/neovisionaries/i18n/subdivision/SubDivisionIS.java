
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionIS
    implements CountrySubDivisionCode
{

    _0("Reykjav\u00edk", "0"),
    _1("H\u00f6fu\u00f0borgarsv\u00e6\u00f0i utan Reykjav\u00edkur", "1"),
    _2("Su\u00f0urnes", "2"),
    _3("Vesturland", "3"),
    _4("Vestfir\u00f0ir", "4"),
    _5("Nor\u00f0urland vestra", "5"),
    _6("Nor\u00f0urland eystra", "6"),
    _7("Austurland", "7"),
    _8("Su\u00f0urland", "8");
    public String name;
    public String code;

    SubDivisionIS(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.IS;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
