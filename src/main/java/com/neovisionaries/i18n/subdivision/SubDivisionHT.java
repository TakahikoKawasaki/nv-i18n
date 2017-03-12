
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionHT
    implements CountrySubDivisionCode
{

    AR("Artibonite", "AR"),
    CE("Centre", "CE"),
    GA("Grande-Anse", "GA"),
    ND("Nord", "ND"),
    NE("Nord-Est", "NE"),
    NI("Nippes", "NI"),
    NO("Nord-Ouest", "NO"),
    OU("Ouest", "OU"),
    SD("Sud", "SD"),
    SE("Sud-Est", "SE");
    public String name;
    public String code;

    SubDivisionHT(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.HT;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
