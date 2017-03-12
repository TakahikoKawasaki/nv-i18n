
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionMW
    implements CountrySubDivisionCode
{

    BA("Balaka", "BA"),
    BL("Blantyre", "BL"),
    C("Central", "C"),
    CK("Chikwawa", "CK"),
    CR("Chiradzulu", "CR"),
    CT("Chitipa", "CT"),
    DE("Dedza", "DE"),
    DO("Dowa", "DO"),
    KR("Karonga", "KR"),
    KS("Kasungu", "KS"),
    LI("Lilongwe", "LI"),
    LK("Likoma Island", "LK"),
    MC("Mchinji", "MC"),
    MG("Mangochi", "MG"),
    MH("Machinga", "MH"),
    MU("Mulanje", "MU"),
    MW("Mwanza", "MW"),
    MZ("Mzimba", "MZ"),
    N("Northern", "N"),
    NB("Nkhata Bay", "NB"),
    NE("Neno", "NE"),
    NI("Ntchisi", "NI"),
    NK("Nkhotakota", "NK"),
    NS("Nsanje", "NS"),
    NU("Ntcheu", "NU"),
    PH("Phalombe", "PH"),
    RU("Rumphi", "RU"),
    S("Southern", "S"),
    SA("Salima", "SA"),
    TH("Thyolo", "TH"),
    ZO("Zomba", "ZO");
    public String name;
    public String code;

    SubDivisionMW(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.MW;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
