
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionBA
    implements CountrySubDivisionCode
{

    _01("Unsko-Sanski Kanton", "01"),
    _02("Posavski Kanton", "02"),
    _03("Tuzlanski Kanton", "03"),
    _04("Zeni\u010dko-dobojski Kanton", "04"),
    _05("Bosansko-Podrinjski Kanton", "05"),
    _06("Srednjobosanski Kanton", "06"),
    _07("Hercegova\u010dko-neretvanski Kanton", "07"),
    _08("Zapadnohercegova\u010dki Kanton", "08"),
    _09("Kanton Sarajevo", "09"),
    _10("Kanton br. 10 (Livanjski kanton)", "10"),
    BRC("Br\u010dko Distrikt", "BRC"),
    BIH("Federacija Bosne i Hercegovine", "BIH"),
    SRP("Republika Srpska", "SRP");
    public String name;
    public String code;

    SubDivisionBA(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.BA;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
