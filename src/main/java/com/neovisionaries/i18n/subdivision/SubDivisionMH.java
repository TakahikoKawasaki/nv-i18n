
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionMH
    implements CountrySubDivisionCode
{

    ALK("Ailuk", "ALK"),
    ALL("Ailinglapalap", "ALL"),
    ARN("Arno", "ARN"),
    AUR("Aur", "AUR"),
    EBO("Ebon", "EBO"),
    ENI("Eniwetok", "ENI"),
    JAB("Jabat", "JAB"),
    JAL("Jaluit", "JAL"),
    KIL("Kili", "KIL"),
    KWA("Kwajalein", "KWA"),
    L("Ralik chain", "L"),
    LAE("Lae", "LAE"),
    LIB("Lib", "LIB"),
    LIK("Likiep", "LIK"),
    MAJ("Majuro", "MAJ"),
    MAL("Maloelap", "MAL"),
    MEJ("Mejit", "MEJ"),
    MIL("Mili", "MIL"),
    NMK("Namorik", "NMK"),
    NMU("Namu", "NMU"),
    RON("Rongelap", "RON"),
    T("Ratak chain", "T"),
    UJA("Ujae", "UJA"),
    UTI("Utirik", "UTI"),
    WTH("Wotho", "WTH"),
    WTJ("Wotje", "WTJ");
    public String name;
    public String code;

    SubDivisionMH(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.MH;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
