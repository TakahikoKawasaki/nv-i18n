
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionCF
    implements CountrySubDivisionCode
{

    AC("Ouham", "AC"),
    BB("Bamingui-Bangoran", "BB"),
    BGF("Bangui", "BGF"),
    BK("Basse-Kotto", "BK"),
    HK("Haute-Kotto", "HK"),
    HM("Haut-Mbomou", "HM"),
    HS("Haute-Sangha / Mamb\u00e9r\u00e9-Kad\u00e9\u00ef", "HS"),
    KB("Gribingui", "KB"),
    KG("K\u00e9mo-Gribingui", "KG"),
    LB("Lobaye", "LB"),
    MB("Mbomou", "MB"),
    MP("Ombella-Mpoko", "MP"),
    NM("Nana-Mamb\u00e9r\u00e9", "NM"),
    OP("Ouham-Pend\u00e9", "OP"),
    SE("Sangha", "SE"),
    UK("Ouaka", "UK"),
    VK("Vakaga", "VK");
    public String name;
    public String code;

    SubDivisionCF(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.CF;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
