
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionIN
    implements CountrySubDivisionCode
{

    AN("Andaman and Nicobar Islands", "AN"),
    AP("Andhra Pradesh", "AP"),
    AR("Arunachal Pradesh", "AR"),
    AS("Assam", "AS"),
    BR("Bihar", "BR"),
    CH("Chandigarh", "CH"),
    CT("Chhattisgarh", "CT"),
    DD("Daman and Diu", "DD"),
    DL("Delhi", "DL"),
    DN("Dadra and Nagar Haveli", "DN"),
    GA("Goa", "GA"),
    GJ("Gujarat", "GJ"),
    HP("Himachal Pradesh", "HP"),
    HR("Haryana", "HR"),
    JH("Jharkhand", "JH"),
    JK("Jammu and Kashmir", "JK"),
    KA("Karnataka", "KA"),
    KL("Kerala", "KL"),
    LD("Lakshadweep", "LD"),
    MH("Maharashtra", "MH"),
    ML("Meghalaya", "ML"),
    MN("Manipur", "MN"),
    MP("Madhya Pradesh", "MP"),
    MZ("Mizoram", "MZ"),
    NL("Nagaland", "NL"),
    OR("Orissa", "OR"),
    PB("Punjab", "PB"),
    PY("Pondicherry", "PY"),
    RJ("Rajasthan", "RJ"),
    SK("Sikkim", "SK"),
    TN("Tamil Nadu", "TN"),
    TR("Tripura", "TR"),
    UP("Uttar Pradesh", "UP"),
    WB("West Bengal", "WB");
    public String name;
    public String code;

    SubDivisionIN(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.IN;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
