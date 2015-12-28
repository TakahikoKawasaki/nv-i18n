
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionBJ
    implements CountrySubDivisionCode
{

    AK("Atakora", "AK"),
    AL("Alibori", "AL"),
    AQ("Atlantique", "AQ"),
    BO("Borgou", "BO"),
    CO("Collines", "CO"),
    DO("Donga", "DO"),
    KO("Kouffo", "KO"),
    LI("Littoral", "LI"),
    MO("Mono", "MO"),
    OU("Ou\u00e9m\u00e9", "OU"),
    PL("Plateau", "PL"),
    ZO("Zou", "ZO");
    public String name;
    public String code;

    SubDivisionBJ(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.BJ;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
