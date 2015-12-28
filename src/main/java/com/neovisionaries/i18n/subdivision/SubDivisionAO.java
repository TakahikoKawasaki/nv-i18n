
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionAO
    implements CountrySubDivisionCode
{

    BGO("Bengo", "BGO"),
    BGU("Benguela", "BGU"),
    BIE("Bi\u00e9", "BIE"),
    CAB("Cabinda", "CAB"),
    CCU("Cuando-Cubango", "CCU"),
    CNN("Cunene", "CNN"),
    CNO("Cuanza Norte", "CNO"),
    CUS("Cuanza Sul", "CUS"),
    HUA("Huambo", "HUA"),
    HUI("Hu\u00edla", "HUI"),
    LNO("Lunda Norte", "LNO"),
    LSU("Lunda Sul", "LSU"),
    LUA("Luanda", "LUA"),
    MAL("Malange", "MAL"),
    MOX("Moxico", "MOX"),
    NAM("Namibe", "NAM"),
    UIG("U\u00edge", "UIG"),
    ZAI("Zaire", "ZAI");
    public String name;
    public String code;

    SubDivisionAO(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.AO;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
