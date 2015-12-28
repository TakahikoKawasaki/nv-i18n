
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionNG
    implements CountrySubDivisionCode
{

    AB("Abia", "AB"),
    AD("Adamawa", "AD"),
    AK("Akwa Ibom", "AK"),
    AN("Anambra", "AN"),
    BA("Bauchi", "BA"),
    BE("Benue", "BE"),
    BO("Borno", "BO"),
    BY("Bayelsa", "BY"),
    CR("Cross River", "CR"),
    DE("Delta", "DE"),
    EB("Ebonyi", "EB"),
    ED("Edo", "ED"),
    EK("Ekiti", "EK"),
    EN("Enugu", "EN"),
    FC("Abuja Capital Territory", "FC"),
    GO("Gombe", "GO"),
    IM("Imo", "IM"),
    JI("Jigawa", "JI"),
    KD("Kaduna", "KD"),
    KE("Kebbi", "KE"),
    KN("Kano", "KN"),
    KO("Kogi", "KO"),
    KT("Katsina", "KT"),
    KW("Kwara", "KW"),
    LA("Lagos", "LA"),
    NA("Nassarawa", "NA"),
    NI("Niger", "NI"),
    OG("Ogun", "OG"),
    ON("Ondo", "ON"),
    OS("Osun", "OS"),
    OY("Oyo", "OY"),
    PL("Plateau", "PL"),
    RI("Rivers", "RI"),
    SO("Sokoto", "SO"),
    TA("Taraba", "TA"),
    YO("Yobe", "YO"),
    ZA("Zamfara", "ZA");
    public String name;
    public String code;

    SubDivisionNG(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.NG;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
