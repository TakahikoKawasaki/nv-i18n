
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionLA
    implements CountrySubDivisionCode
{

    AT("Attapu [Attopeu]", "AT"),
    BK("Bok\u00e8o", "BK"),
    BL("Bolikhamxai [Borikhane]", "BL"),
    CH("Champasak [Champassak]", "CH"),
    HO("Houaphan", "HO"),
    KH("Khammouan", "KH"),
    LM("Louang Namtha", "LM"),
    LP("Louangphabang [Louang Prabang)", "LP"),
    OU("Oudomxai [Oudomsai]", "OU"),
    PH("Ph\u00f4ngsali [Phong Saly]", "PH"),
    SL("Salavan [Saravane]", "SL"),
    SV("Savannakh\u00e9t", "SV"),
    VI("Vientiane", "VI"),
    VT("Vientiane", "VT"),
    XA("Xaignabouli [Sayaboury]", "XA"),
    XE("X\u00e9kong [S\u00e9kong]", "XE"),
    XI("Xiangkhoang [Xieng Khouang]", "XI"),
    XN("Xais\u00f4mboun", "XN");
    public String name;
    public String code;

    SubDivisionLA(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.LA;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
