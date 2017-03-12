
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionCH
    implements CountrySubDivisionCode
{

    AG("Aargau (de)", "AG"),
    AI("Appenzell Innerrhoden (de)", "AI"),
    AR("Appenzell Ausserrhoden (de)", "AR"),
    BE("Bern (de)", "BE"),
    BL("Basel-Landschaft (de)", "BL"),
    BS("Basel-Stadt (de)", "BS"),
    FR("Fribourg (fr)", "FR"),
    GE("Gen\u00e8ve (fr)", "GE"),
    GL("Glarus (de)", "GL"),
    GR("Graub\u00fcnden (de)", "GR"),
    JU("Jura (fr)", "JU"),
    LU("Luzern (de)", "LU"),
    NE("Neuch\u00e2tel (fr)", "NE"),
    NW("Nidwalden (de)", "NW"),
    OW("Obwalden (de)", "OW"),
    SG("Sankt Gallen (de)", "SG"),
    SH("Schaffhausen (de)", "SH"),
    SO("Solothurn (de)", "SO"),
    SZ("Schwyz (de)", "SZ"),
    TG("Thurgau (de)", "TG"),
    TI("Ticino (it)", "TI"),
    UR("Uri (de)", "UR"),
    VD("Vaud (fr)", "VD"),
    VS("Valais (fr)", "VS"),
    ZG("Zug (de)", "ZG"),
    ZH("Z\u00fcrich (de)", "ZH");
    public String name;
    public String code;

    SubDivisionCH(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.CH;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
