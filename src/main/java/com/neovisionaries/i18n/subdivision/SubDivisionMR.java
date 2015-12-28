
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionMR
    implements CountrySubDivisionCode
{

    _01("Hodh ech Chargui", "01"),
    _02("Hodh el Gharbi", "02"),
    _03("Assaba", "03"),
    _04("Gorgol", "04"),
    _05("Brakna", "05"),
    _06("Trarza", "06"),
    _07("Adrar", "07"),
    _08("Dakhlet Nou\u00e2dhibou", "08"),
    _09("Tagant", "09"),
    _10("Guidimaka", "10"),
    _11("Tiris Zemmour", "11"),
    _12("Inchiri", "12"),
    NKC("Nouakchott", "NKC");
    public String name;
    public String code;

    SubDivisionMR(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.MR;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
