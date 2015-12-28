
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionPT
    implements CountrySubDivisionCode
{

    _01("Aveiro", "01"),
    _02("Beja", "02"),
    _03("Braga", "03"),
    _04("Bragan\u00e7a", "04"),
    _05("Castelo Branco", "05"),
    _06("Coimbra", "06"),
    _07("\u00c9vora", "07"),
    _08("Faro", "08"),
    _09("Guarda", "09"),
    _10("Leiria", "10"),
    _11("Lisboa", "11"),
    _12("Portalegre", "12"),
    _13("Porto", "13"),
    _14("Santar\u00e9m", "14"),
    _15("Set\u00fabal", "15"),
    _16("Viana do Castelo", "16"),
    _17("Vila Real", "17"),
    _18("Viseu", "18"),
    _20("Regi\u00e3o Aut\u00f3noma dos A\u00e7ores", "20"),
    _30("Regi\u00e3o Aut\u00f3noma da Madeira", "30");
    public String name;
    public String code;

    SubDivisionPT(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.PT;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
