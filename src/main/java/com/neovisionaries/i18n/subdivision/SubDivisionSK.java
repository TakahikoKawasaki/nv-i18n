
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionSK
    implements CountrySubDivisionCode
{

    BC("Banskobystrick\u00fd kraj", "BC"),
    BL("Bratislavsk\u00fd kraj", "BL"),
    KI("Ko\u0161ick\u00fd kraj", "KI"),
    NI("Nitriansky kraj", "NI"),
    PV("Pre\u0161ovsk\u00fd kraj", "PV"),
    TA("Trnavsk\u00fd kraj", "TA"),
    TC("Tren\u010diansky kraj", "TC"),
    ZI("\u017dilinsk\u00fd kraj", "ZI");
    public String name;
    public String code;

    SubDivisionSK(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.SK;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
