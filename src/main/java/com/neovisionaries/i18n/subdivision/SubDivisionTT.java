
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionTT
    implements CountrySubDivisionCode
{

    ARI("Arima", "ARI"),
    CHA("Chaguanas", "CHA"),
    CTT("Couva-Tabaquite-Talparo", "CTT"),
    DMN("Diego Martin", "DMN"),
    ETO("Eastern Tobago", "ETO"),
    PED("Penal-Debe", "PED"),
    POS("Port of Spain", "POS"),
    PRT("Princes Town", "PRT"),
    PTF("Point Fortin", "PTF"),
    RCM("Rio Claro-Mayaro", "RCM"),
    SFO("San Fernando", "SFO"),
    SGE("Sangre Grande", "SGE"),
    SIP("Siparia", "SIP"),
    SJL("San Juan-Laventille", "SJL"),
    TUP("Tunapuna-Piarco", "TUP"),
    WTO("Western Tobago", "WTO");
    public String name;
    public String code;

    SubDivisionTT(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.TT;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
