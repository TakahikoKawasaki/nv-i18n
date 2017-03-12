
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionGN
    implements CountrySubDivisionCode
{

    BE("Beyla", "BE"),
    BF("Boffa", "BF"),
    BK("Bok\u00e9", "BK"),
    CO("Coyah", "CO"),
    DB("Dabola", "DB"),
    DI("Dinguiraye", "DI"),
    DL("Dalaba", "DL"),
    DU("Dubr\u00e9ka", "DU"),
    FA("Faranah", "FA"),
    FO("For\u00e9cariah", "FO"),
    FR("Fria", "FR"),
    GA("Gaoual", "GA"),
    GU("Gu\u00e9k\u00e9dou", "GU"),
    KA("Kankan", "KA"),
    KB("Koubia", "KB"),
    KD("Kindia", "KD"),
    KE("K\u00e9rouan\u00e9", "KE"),
    KN("Koundara", "KN"),
    KO("Kouroussa", "KO"),
    KS("Kissidougou", "KS"),
    LA("Lab\u00e9", "LA"),
    LE("L\u00e9louma", "LE"),
    LO("Lola", "LO"),
    MC("Macenta", "MC"),
    MD("Mandiana", "MD"),
    ML("Mali", "ML"),
    MM("Mamou", "MM"),
    NZ("Nz\u00e9r\u00e9kor\u00e9", "NZ"),
    PI("Pita", "PI"),
    SI("Siguiri", "SI"),
    TE("T\u00e9lim\u00e9l\u00e9", "TE"),
    TO("Tougu\u00e9", "TO"),
    YO("Yomou", "YO");
    public String name;
    public String code;

    SubDivisionGN(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.GN;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
