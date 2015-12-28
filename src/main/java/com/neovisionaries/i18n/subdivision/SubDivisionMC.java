
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionMC
    implements CountrySubDivisionCode
{

    CL("La Colle", "CL"),
    CO("La Condamine", "CO"),
    FO("Fontvieille", "FO"),
    GA("La Gare", "GA"),
    JE("Jardin Exotique", "JE"),
    LA("Larvotto", "LA"),
    MA("Malbousquet", "MA"),
    MC("Monte-Carlo", "MC"),
    MG("Moneghetti", "MG"),
    MO("Monaco-Ville", "MO"),
    MU("Moulins", "MU"),
    PH("Port-Hercule", "PH"),
    SD("Sainte-D\u00e9vote", "SD"),
    SO("La Source", "SO"),
    SP("Sp\u00e9lugues", "SP"),
    SR("Saint-Roman", "SR"),
    VR("Vallon de la Rousse", "VR");
    public String name;
    public String code;

    SubDivisionMC(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.MC;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
