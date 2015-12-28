
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionCG
    implements CountrySubDivisionCode
{

    _11("Bouenza", "11"),
    _12("Pool", "12"),
    _13("Sangha", "13"),
    _14("Plateaux", "14"),
    _15("Cuvette-Ouest", "15"),
    _2("L\u00e9koumou", "2"),
    _5("Kouilou", "5"),
    _7("Likouala", "7"),
    _8("Cuvette", "8"),
    _9("Niari", "9"),
    BZV("Brazzaville", "BZV");
    public String name;
    public String code;

    SubDivisionCG(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.CG;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
