
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionSA
    implements CountrySubDivisionCode
{

    _01("Ar Riy\u0101\u1e11", "01"),
    _02("Makkah", "02"),
    _03("Al Mad\u012bnah", "03"),
    _04("Ash Sharq\u012byah", "04"),
    _05("Al Qa\u015f\u012bm", "05"),
    _06("\u1e28\u0101'il", "06"),
    _07("Tab\u016bk", "07"),
    _08("Al \u1e28ud\u016bd ash Sham\u0101l\u012byah", "08"),
    _09("J\u012bz\u0101n", "09"),
    _10("Najr\u0101n", "10"),
    _11("Al B\u0101\u1e29ah", "11"),
    _12("AI Jawf", "12"),
    _14("'As\u012br", "14");
    public String name;
    public String code;

    SubDivisionSA(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.SA;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
