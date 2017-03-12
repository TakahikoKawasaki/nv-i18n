
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionIL
    implements CountrySubDivisionCode
{

    D("El Jan\u016bb\u012b / HaDarom", "D"),
    HA("\u1e24eif\u0101 / H\u0331efa", "HA"),
    JM("Al Quds / Yerushalayim", "JM"),
    M("HaDarom / HaMerkaz", "M"),
    TA("Tell Ab\u012bb / Tel-Aviv", "TA"),
    Z("Esh Sham\u0101l\u012b / Ha \u1e94afon", "Z");
    public String name;
    public String code;

    SubDivisionIL(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.IL;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
