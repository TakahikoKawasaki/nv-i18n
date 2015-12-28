
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionBH
    implements CountrySubDivisionCode
{

    _13("Al Man\u0101mah", "13"),
    _14("Al Jan\u016bb\u012byah", "14"),
    _15("Al Mu\u1e29arraq", "15"),
    _16("Al Wus\u0163\u00e1", "16"),
    _17("Ash Sham\u0101l\u012byah", "17");
    public String name;
    public String code;

    SubDivisionBH(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.BH;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
