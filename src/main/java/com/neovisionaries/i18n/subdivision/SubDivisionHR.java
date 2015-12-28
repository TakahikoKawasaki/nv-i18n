
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionHR
    implements CountrySubDivisionCode
{

    _01("Zagreba\u010dka \u017eupanija", "01"),
    _02("Krapinsko-zagorska \u017eupanija", "02"),
    _03("Sisa\u010dko-moslava\u010dka \u017eupanija", "03"),
    _04("Karlova\u010dka \u017eupanija", "04"),
    _05("Vara\u017edinska \u017eupanija", "05"),
    _06("Koprivni\u010dko-kri\u017eeva\u010dka \u017eupanija", "06"),
    _07("Bjelovarsko-bilogorska \u017eupanija", "07"),
    _08("Primorsko-goranska \u017eupanija", "08"),
    _09("Li\u010dko-senjska \u017eupanija", "09"),
    _10("Viroviti\u010dko-podravska \u017eupanija", "10"),
    _11("Po\u017ee\u0161ko-slavonska \u017eupanija", "11"),
    _12("Brodsko-posavska \u017eupanija", "12"),
    _13("Zadarska \u017eupanija", "13"),
    _14("Osje\u010dko-baranjska \u017eupanija", "14"),
    _15("\u0160ibensko-kninska \u017eupanija", "15"),
    _16("Vukovarsko-srijemska \ufffdupanija", "16"),
    _17("Vukovarsko-srijemska \u017eupanija", "17"),
    _18("Istarska \u017eupanija", "18"),
    _19("Dubrova\u010dko-neretvanska \u017eupanija", "19"),
    _20("Me\u0111imurska \u017eupanija", "20"),
    _21("Grad Zagreb", "21");
    public String name;
    public String code;

    SubDivisionHR(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.HR;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
