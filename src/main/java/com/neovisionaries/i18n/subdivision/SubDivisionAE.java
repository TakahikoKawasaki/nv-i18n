
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionAE
    implements CountrySubDivisionCode
{

    AJ("'Ajman", "AJ"),
    AZ("Ab\u016b \u0224aby[Abu Dhabi]", "AZ"),
    DU("Dubayy [Dubai]", "DU"),
    FU("Al Fujayrah", "FU"),
    RK("R\u0101's al Khaymah", "RK"),
    SH("Ash Sh\u0101riqah [Sharjah]", "SH"),
    UQ("Umm al Qaywayn", "UQ");
    public String name;
    public String code;

    SubDivisionAE(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.AE;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
