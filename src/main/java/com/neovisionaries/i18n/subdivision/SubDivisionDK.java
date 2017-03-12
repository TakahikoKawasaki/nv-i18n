
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionDK
    implements CountrySubDivisionCode
{

    _81("Region Nordjylland", "81"),
    _82("Region Midtjylland", "82"),
    _83("Region Syddanmark", "83"),
    _84("Region Hovedstaden", "84"),
    _85("Region Sj\u00e6lland", "85");
    public String name;
    public String code;

    SubDivisionDK(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.DK;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
