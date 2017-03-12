
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionAU
    implements CountrySubDivisionCode
{

    ACT("Australian Capital Territory", "ACT"),
    NSW("New South Wales", "NSW"),
    NT("Northern Territory", "NT"),
    QLD("Queensland", "QLD"),
    SA("South Australia", "SA"),
    TAS("Tasmania", "TAS"),
    VIC("Victoria", "VIC"),
    WA("Western Australia", "WA");
    public String name;
    public String code;

    SubDivisionAU(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.AU;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
