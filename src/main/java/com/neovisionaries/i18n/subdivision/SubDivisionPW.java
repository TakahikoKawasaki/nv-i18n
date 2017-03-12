
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionPW
    implements CountrySubDivisionCode
{

    _002("Aimeliik", "002"),
    _004("Airai", "004"),
    _010("Angaur", "010"),
    _050("Hatobohei", "050"),
    _100("Kayangel", "100"),
    _150("Koror", "150"),
    _212("Melekeok", "212"),
    _214("Ngaraard", "214"),
    _218("Ngarchelong", "218"),
    _222("Ngardmau", "222"),
    _224("Ngatpang", "224"),
    _226("Ngchesar", "226"),
    _227("Ngeremlengui", "227"),
    _228("Ngiwal", "228"),
    _350("Peleliu", "350"),
    _370("Sonsorol", "370");
    public String name;
    public String code;

    SubDivisionPW(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.PW;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
