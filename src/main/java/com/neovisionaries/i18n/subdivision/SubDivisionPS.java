
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionPS
    implements CountrySubDivisionCode
{

    BTH("Bethlehem", "BTH"),
    DEB("Deir El Balah", "DEB"),
    GZA("Gaza", "GZA"),
    HBN("Hebron", "HBN"),
    JEM("Jerusalem", "JEM"),
    JEN("Jenin", "JEN"),
    JRH("Jericho \u2013 Al Aghwar", "JRH"),
    KYS("Khan Yunis", "KYS"),
    NBS("Nablus", "NBS"),
    NGZ("North Gaza", "NGZ"),
    QQA("Qalqilya", "QQA"),
    RBH("Ramallah", "RBH"),
    RFH("Rafah", "RFH"),
    SLT("Salfit", "SLT"),
    TBS("Tubas", "TBS"),
    TKM("Tulkarm", "TKM");
    public String name;
    public String code;

    SubDivisionPS(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.PS;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
