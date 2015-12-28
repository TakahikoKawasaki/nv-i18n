
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionCI
    implements CountrySubDivisionCode
{

    _01("Lagunes (R\u00e9gion des)", "01"),
    _02("Haut-Sassandra (R\u00e9gion du)", "02"),
    _03("Savanes (R\u00e9gion des)", "03"),
    _04("Vall\u00e9e du Bandama (R\u00e9gion de la)", "04"),
    _05("Moyen-Como\u00e9 (R\u00e9gion du)", "05"),
    _06("18 Montagnes (R\u00e9gion des)", "06"),
    _07("Lacs (R\u00e9gion des)", "07"),
    _08("Zanzan (R\u00e9gion du)", "08"),
    _09("Bas-Sassandra (R\u00e9gion du)", "09"),
    _10("Dengu\u00e9l\u00e9 (R\u00e9gion du)", "10"),
    _11("Nzi-Como\u00e9 (R\u00e9gion)", "11"),
    _12("Marahou\u00e9 (R\u00e9gion de la)", "12"),
    _13("Sud-Como\u00e9 (R\u00e9gion du)", "13"),
    _14("Worodougou (R\u00e9gion du)", "14"),
    _15("Sud-Bandama (R\u00e9gion du)", "15"),
    _16("Agn\u00e9bi (R\u00e9gion de l')", "16"),
    _17("Bafing (R\u00e9gion du)", "17"),
    _18("Fromager (R\u00e9gion du)", "18"),
    _19("Moyen-Cavally (R\u00e9gion du)", "19");
    public String name;
    public String code;

    SubDivisionCI(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.CI;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
