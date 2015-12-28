
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionCV
    implements CountrySubDivisionCode
{

    BR("Brava", "BR"),
    BV("Boa Vista", "BV"),
    CA("Santa Catarina", "CA"),
    CF("Santa Catarina do Fogo", "CF"),
    CR("Santa Cruz", "CR"),
    MA("Maio", "MA"),
    MO("Mosteiros", "MO"),
    PA("Paul", "PA"),
    PN("Porto Novo", "PN"),
    PR("Praia", "PR"),
    RB("Ribeira Brava", "RB"),
    RG("Ribeira Grande", "RG"),
    RS("Ribeira Grande de Santiago", "RS"),
    SD("S\u00e3o Domingos", "SD"),
    SF("S\u00e3o Filipe", "SF"),
    SL("Sal", "SL"),
    SM("S\u00e3o Miguel", "SM"),
    SS("S\u00e3o Salvador do Mundo", "SS"),
    SV("S\u00e3o Vicente", "SV"),
    TA("Tarrafal", "TA"),
    TS("Tarrafal de S\u00e3o Nicolau", "TS");
    public String name;
    public String code;

    SubDivisionCV(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.CV;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
