
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionCM
    implements CountrySubDivisionCode
{

    AD("Adamaoua", "AD"),
    CE("Centre", "CE"),
    EN("Far North", "EN"),
    ES("East", "ES"),
    LT("Littoral", "LT"),
    NO("North", "NO"),
    NW("North-West", "NW"),
    OU("West", "OU"),
    SU("South", "SU"),
    SW("South-West", "SW");
    public String name;
    public String code;

    SubDivisionCM(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.CM;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
