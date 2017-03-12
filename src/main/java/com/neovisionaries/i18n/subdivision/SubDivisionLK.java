
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionLK
    implements CountrySubDivisionCode
{

    _1("Basn\u0101hira pa\u1e37\u0101ta", "1"),
    _11("K\u014f\u1e37amba", "11"),
    _12("Gampaha", "12"),
    _13("Ka\u1e37utara", "13"),
    _2("Madhyama pa\u1e37\u0101ta", "2"),
    _21("Mahanuvara", "21"),
    _22("M\u0101tale", "22"),
    _23("Nuvara \u0114liya", "23"),
    _3("Daku\u1e47u pa\u1e37\u0101ta", "3"),
    _31("G\u0101lla", "31"),
    _32("M\u0101tara", "32"),
    _33("Hambant\u014f\u1e6da", "33"),
    _4("Uturu pa\u1e37\u0101ta", "4"),
    _41("Y\u0101panaya", "41"),
    _42("Kilin\u014fchchi", "42"),
    _43("Mann\u0101rama", "43"),
    _44("Vavuniy\u0101va", "44"),
    _45("Mulativ", "45"),
    _5("N\u00e6\u0306g\u0115nahira pa\u1e37\u0101ta", "5"),
    _51("Ma\u1e0dakalapuva", "51"),
    _52("Amp\u0101ra", "52"),
    _53("Triku\u1e47\u0101malaya", "53"),
    _6("Vayamba pa\u1e37\u0101ta", "6"),
    _61("Kuru\u1e47\u00e6gala", "61"),
    _62("Puttalama", "62"),
    _7("Uturum\u00e6\u0306da pa\u1e37\u0101ta", "7"),
    _71("Anur\u0101dhapura", "71"),
    _72("P\u014f\u1e37\u014fnnaruva", "72"),
    _8("\u016ava pa\u1e37\u0101ta", "8"),
    _81("Badulla", "81"),
    _82("M\u014f\u1e47ar\u0101gala", "82"),
    _9("Sabaragamuva pa\u1e37\u0101ta", "9"),
    _91("Ratnapura", "91"),
    _92("K\u00e6galla", "92");
    public String name;
    public String code;

    SubDivisionLK(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.LK;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
