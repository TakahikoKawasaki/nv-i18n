
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionOM
    implements CountrySubDivisionCode
{

    BU("Al Buraym\u012b", "BU"),
    MA("Masqa\u0163", "MA"),
    MU("Musandam", "MU"),
    ZU("Z\u0327uf\u0101r", "ZU"),
    BA("Al B\u0101\u0163inah", "BA"),
    DA("Ad D\u0101khil\u012byah", "DA"),
    SH("Ash Sharq\u012byah", "SH"),
    WU("Al Wus\u0163\u00e1", "WU"),
    ZA("A\u0225 \u0224\u0101hirah", "ZA");
    public String name;
    public String code;

    SubDivisionOM(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.OM;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
