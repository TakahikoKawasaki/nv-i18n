
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionKW
    implements CountrySubDivisionCode
{

    AH("Al A\u1e29mad\u012b", "AH"),
    FA("Al Farw\u0101n\u012byah", "FA"),
    HA("\u1e28awall\u012b", "HA"),
    JA("Al Jahr\u0101\u2019", "JA"),
    KU("Al Kuwayt (Al \u2018\u0100\u015fimah)", "KU"),
    MU("Mub\u0101rak al Kab\u012br", "MU");
    public String name;
    public String code;

    SubDivisionKW(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.KW;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
