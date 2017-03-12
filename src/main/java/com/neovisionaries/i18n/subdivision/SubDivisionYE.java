
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionYE
    implements CountrySubDivisionCode
{

    AB("Abyan", "AB"),
    AD("'Adan", "AD"),
    AM("'Amr\u0101n", "AM"),
    BA("Al Bay\u1e11\u0101'", "BA"),
    DA("A\u1e11 \u1e10\u0101li'", "DA"),
    DH("Dham\u0101r", "DH"),
    HD("\u1e28a\u1e11ramawt", "HD"),
    HJ("\u1e28ajjah", "HJ"),
    HU("Al \u1e28udaydah", "HU"),
    IB("Ibb", "IB"),
    JA("Al Jawf", "JA"),
    LA("La\u1e29ij", "LA"),
    MA("Ma'rib", "MA"),
    MR("Al Mahrah", "MR"),
    MW("Al Ma\u1e29w\u012bt", "MW"),
    RA("Raymah", "RA"),
    SD("\u015e\u0101\u02bbdah", "SD"),
    SH("Shabwah", "SH"),
    SN("\u015ean\u02bb\u0101'", "SN"),
    TA("T\u0101\u02bbizz", "TA"),
    SA("\u015ean\u02bb\u0101' [city]", "SA");
    public String name;
    public String code;

    SubDivisionYE(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.YE;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
