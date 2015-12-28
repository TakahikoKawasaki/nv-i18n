
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionKR
    implements CountrySubDivisionCode
{

    _11("Seoul Teugbyeolsi", "11"),
    _26("Busan Gwang'yeogsi", "26"),
    _27("Daegu Gwang'yeogsi", "27"),
    _28("Incheon Gwang'yeogsiv", "28"),
    _29("Gwangju Gwang'yeogsi", "29"),
    _30("Daejeon Gwang'yeogsi", "30"),
    _31("Ulsan Gwang'yeogsi", "31"),
    _41("Gyeonggido", "41"),
    _42("Gang'weondo", "42"),
    _43("Chungcheongbugdo", "43"),
    _44("Chungcheongnamdo", "44"),
    _45("Jeonrabugdo", "45"),
    _46("Jeonranamdo", "46"),
    _47("Gyeongsangbugdo", "47"),
    _48("Gyeongsangnamdo", "48"),
    _49("Jejudo", "49");
    public String name;
    public String code;

    SubDivisionKR(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.KR;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
