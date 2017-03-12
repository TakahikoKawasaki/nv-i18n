
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionLS
    implements CountrySubDivisionCode
{

    A("Maseru", "A"),
    B("Butha-Buthe", "B"),
    C("Leribe", "C"),
    D("Berea", "D"),
    E("Mafeteng", "E"),
    F("Mohale's Hoek", "F"),
    G("Quthing", "G"),
    H("Qacha's Nek", "H"),
    J("Mokhotlong", "J"),
    K("Thaba-Tseka", "K");
    public String name;
    public String code;

    SubDivisionLS(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.LS;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
