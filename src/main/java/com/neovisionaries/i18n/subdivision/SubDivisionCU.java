
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionCU
    implements CountrySubDivisionCode
{

    _01("Pinar del R\u00edo", "01"),
    _02("La Habana", "02"),
    _03("Ciudad de La Habana", "03"),
    _04("Matanzas", "04"),
    _05("Villa Clara", "05"),
    _06("Cienfuegos", "06"),
    _07("Sancti Sp\u00edritus", "07"),
    _08("Ciego de \u00c1vila", "08"),
    _09("Camag\u00fcey", "09"),
    _10("Las Tunas", "10"),
    _11("Holgu\u00edn", "11"),
    _12("Granma", "12"),
    _13("Santiago de Cuba", "13"),
    _14("Guant\u00e1namo", "14"),
    _99("Isla de la Juventud", "99");
    public String name;
    public String code;

    SubDivisionCU(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.CU;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
