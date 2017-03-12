
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionIE
    implements CountrySubDivisionCode
{

    CE("Clare", "CE"),
    CN("Cavan", "CN"),
    CO("Cork", "CO"),
    CW("Carlow", "CW"),
    D("Dublin", "D"),
    DL("Donegal", "DL"),
    G("Galway", "G"),
    KE("Kildare", "KE"),
    KK("Kilkenny", "KK"),
    KY("Kerry", "KY"),
    LD("Longford", "LD"),
    LH("Louth", "LH"),
    LK("Limerick", "LK"),
    LM("Leitrim", "LM"),
    LS("Laois", "LS"),
    MH("Meath", "MH"),
    MN("Monaghan", "MN"),
    MO("Mayo", "MO"),
    OY("Offaly", "OY"),
    RN("Roscommon", "RN"),
    SO("Sligo", "SO"),
    TA("Tipperary", "TA"),
    WD("Waterford", "WD"),
    WH("Westmeath", "WH"),
    WW("Wicklow", "WW"),
    WX("Wexford", "WX");
    public String name;
    public String code;

    SubDivisionIE(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.IE;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
