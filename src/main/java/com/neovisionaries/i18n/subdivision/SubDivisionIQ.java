
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionIQ
    implements CountrySubDivisionCode
{

    AN("Al Anb\u0101r", "AN"),
    AR("Arb\u012bl", "AR"),
    BA("Al Ba\u015frah", "BA"),
    BB("B\u0101bil", "BB"),
    BG("Baghd\u0101d", "BG"),
    DA("Dah\u016bk", "DA"),
    DI("Diy\u0101l\u00e1", "DI"),
    DQ("Dh\u012b Q\u0101r", "DQ"),
    KA("Karbal\u0101'", "KA"),
    MA("Mays\u0101n", "MA"),
    MU("Al Muthann\u00e1\u00e1", "MU"),
    NA("An Najaf", "NA"),
    NI("N\u012bnaw\u00e1", "NI"),
    QA("Al Q\u0101dis\u012byah", "QA"),
    SD("\u015eal\u0101\u1e29 ad D\u012bn", "SD"),
    SU("As Sulaym\u0101n\u012byah", "SU"),
    TS("At Ta'm\u012bm", "TS"),
    WA("W\u0101si\u0163", "WA");
    public String name;
    public String code;

    SubDivisionIQ(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.IQ;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
