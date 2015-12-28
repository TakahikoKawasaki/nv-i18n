
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionSC
    implements CountrySubDivisionCode
{

    _01("Anse aux Pins", "01"),
    _02("Anse Boileau", "02"),
    _03("Anse \u00c9toile", "03"),
    _04("Au Cap", "04"),
    _05("Anse Royale", "05"),
    _06("Baie Lazare", "06"),
    _07("Baie Sainte-Anne", "07"),
    _08("Beau Vallon", "08"),
    _09("Bel Air", "09"),
    _10("Bel Ombre", "10"),
    _11("Cascade", "11"),
    _12("Glacis", "12"),
    _13("Grand' Anse Mah\u00e9", "13"),
    _14("Grand' Anse Praslin", "14"),
    _15("La Digue", "15"),
    _16("La Rivi\u00e8re Anglaise", "16"),
    _17("Mont Buxton", "17"),
    _18("Mont Fleuri", "18"),
    _19("Plaisance", "19"),
    _20("Pointe La Rue", "20"),
    _21("Port Glaud", "21"),
    _22("Saint Louis", "22"),
    _23("Takamaka", "23"),
    _24("Les Mamelles", "24"),
    _25("Roche Ca\u00efman", "25");
    public String name;
    public String code;

    SubDivisionSC(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.SC;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
