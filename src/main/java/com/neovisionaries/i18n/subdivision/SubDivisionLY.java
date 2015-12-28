
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionLY
    implements CountrySubDivisionCode
{

    BA("Bangh\u0101z\u012b", "BA"),
    BU("Al Bu\u0163n\u0101n", "BU"),
    DR("Darnah", "DR"),
    GT("Gh\u0101t", "GT"),
    JA("Al Jabal al Akh\u1e11ar", "JA"),
    JG("Al Jabal al Gharb\u012b", "JG"),
    JI("Al Jif\u0101rah", "JI"),
    JU("Al Jufrah", "JU"),
    KF("Al Kufrah", "KF"),
    MB("Al Marqab", "MB"),
    MI("Mi\u015fr\u0101tah", "MI"),
    MJ("Al Marj", "MJ"),
    MQ("Murzuq", "MQ"),
    NL("N\u0101l\u016bt", "NL"),
    NQ("An Nuq\u0101\u0163 al Khams", "NQ"),
    SB("Sabh\u0101", "SB"),
    SR("Surt", "SR"),
    TB("\u0162ar\u0101bulus", "TB"),
    WA("Al W\u0101\u1e29\u0101t", "WA"),
    WD("W\u0101d\u012b al \u1e28ay\u0101t", "WD"),
    WS("W\u0101d\u012b ash Sh\u0101\u0163i\u02be", "WS"),
    ZA("Az Z\u0101wiyah", "ZA");
    public String name;
    public String code;

    SubDivisionLY(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.LY;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
