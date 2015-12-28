
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionFM
    implements CountrySubDivisionCode
{

    KSA("Kosrae", "KSA"),
    PNI("Pohnpei", "PNI"),
    TRK("Chuuk", "TRK"),
    YAP("Yap", "YAP");
    public String name;
    public String code;

    SubDivisionFM(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.FM;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
