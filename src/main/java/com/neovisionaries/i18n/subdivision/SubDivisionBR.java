
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionBR
    implements CountrySubDivisionCode
{

    AC("Acre", "AC"),
    AL("Alagoas", "AL"),
    AM("Amazonas", "AM"),
    AP("Amap\u00e1", "AP"),
    BA("Bahia", "BA"),
    CE("Cear\u00e1", "CE"),
    DF("Distrito Federal", "DF"),
    ES("Esp\u00edrito Santo", "ES"),
    GO("Goi\u00e1s", "GO"),
    MA("Maranh\u00e3o", "MA"),
    MG("Minas Gerais", "MG"),
    MS("Mato Grosso do Sul", "MS"),
    MT("Mato Grosso", "MT"),
    PA("Par\u00e1", "PA"),
    PB("Para\u00edba", "PB"),
    PE("Pernambuco", "PE"),
    PI("Piau\u00ed", "PI"),
    PR("Paran\u00e1", "PR"),
    RJ("Rio de Janeiro", "RJ"),
    RN("Rio Grande do Norte", "RN"),
    RO("Rond\u00f4nia", "RO"),
    RR("Roraima", "RR"),
    RS("Rio Grande do Sul", "RS"),
    SC("Santa Catarina", "SC"),
    SE("Sergipe", "SE"),
    SP("S\u00e3o Paulo", "SP"),
    TO("Tocantins", "TO");
    public String name;
    public String code;

    SubDivisionBR(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.BR;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
