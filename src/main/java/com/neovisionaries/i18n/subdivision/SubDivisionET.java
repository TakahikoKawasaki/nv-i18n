
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionET
    implements CountrySubDivisionCode
{

    AA("\u0100d\u012bs \u0100beba / Adis Abeba", "AA"),
    AF("\u0100far / Afar", "AF"),
    AM("\u0100mara / Amara", "AM"),
    BE("B\u012bnshangul Gumuz / Binshangul Gumuz", "BE"),
    DD("Dir\u0113 Dawa / Dire Dawa", "DD"),
    GA("Gamb\u0113la Hizboch / Gambela Hizboch", "GA"),
    HA("H\u0101rer\u012b Hizb / Hareri Hizb", "HA"),
    OR("Orom\u012bya / Oromiya", "OR"),
    SN("YeDebub Bih\u0113roch Bih\u0113reseboch na Hizboch / YeDebub Biheroch Bihereseboch na Hizboch", "SN"),
    SO("Sumal\u0113 / Sumale", "SO"),
    TI("Tigray / Tigray", "TI");
    public String name;
    public String code;

    SubDivisionET(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.ET;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
