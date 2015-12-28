
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionKZ
    implements CountrySubDivisionCode
{

    AKM("Aqmola oblysy", "AKM"),
    AKT("Aqt\u00f6be oblysy", "AKT"),
    ALA("Almaty", "ALA"),
    ALM("Almaty oblysy", "ALM"),
    AST("Astana", "AST"),
    ATY("Atyra\u016b oblysy", "ATY"),
    KAR("Qaraghandy oblysy", "KAR"),
    KUS("Qostanay oblysy", "KUS"),
    KZY("Qyzylorda oblysy", "KZY"),
    MAN("Mangghysta\u016b oblysy", "MAN"),
    PAV("Pavlodar oblysy", "PAV"),
    SEV("Solt\u00fcstik Qazaqstan oblysy", "SEV"),
    VOS("Shyghys Qazaqstan oblysy", "VOS"),
    YUZ("Ongt\u00fcstik Qazaqstan oblysy", "YUZ"),
    ZAP("Batys Qazaqstan oblysy", "ZAP"),
    ZHA("Zhambyl oblysy", "ZHA");
    public String name;
    public String code;

    SubDivisionKZ(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.KZ;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
