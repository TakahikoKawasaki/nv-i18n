
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionCL
    implements CountrySubDivisionCode
{

    AI("Ais\u00e9n del General Carlos Ib\u00e1\u00f1ez del Campo", "AI"),
    AN("Antofagasta", "AN"),
    AP("Arica y Parinacota", "AP"),
    AR("Araucan\u00eda", "AR"),
    AT("Atacama", "AT"),
    BI("B\u00edo-B\u00edo", "BI"),
    CO("Coquimbo", "CO"),
    LI("Libertador General Bernardo O'Higgins", "LI"),
    LL("Los Lagos", "LL"),
    LR("Los R\u00edos", "LR"),
    MA("Magallanes", "MA"),
    ML("Maule", "ML"),
    RM("Regi\u00f3n Metropolitana de Santiago", "RM"),
    TA("Tarapac\u00e1", "TA"),
    VS("Valpara\u00edso", "VS");
    public String name;
    public String code;

    SubDivisionCL(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.CL;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
