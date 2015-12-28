
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionKH
    implements CountrySubDivisionCode
{

    _1("Banteay Mean Chey", "1"),
    _10("Kracheh", "10"),
    _11("Mondol Kiri", "11"),
    _12("Phnom Penh", "12"),
    _13("Preah Vihear", "13"),
    _14("Prey Veaeng", "14"),
    _15("Pousaat", "15"),
    _16("Rotanak Kiri", "16"),
    _17("Siem Reab", "17"),
    _18("Krong Preah Sihanouk", "18"),
    _19("Stueng Traeng", "19"),
    _2("Baat Dambang", "2"),
    _20("Svaay Rieng", "20"),
    _21("Taakaev", "21"),
    _22("Otdar Mean Chey", "22"),
    _23("Krong Kaeb", "23"),
    _24("Krong Pailin", "24"),
    _3("Kampong Chaam", "3"),
    _4("Kampong Chhnang", "4"),
    _5("Kampong Spueu", "5"),
    _6("Kampong Thum", "6"),
    _7("Kampot", "7"),
    _8("Kandaal", "8"),
    _9("Kaoh Kong", "9");
    public String name;
    public String code;

    SubDivisionKH(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.KH;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
