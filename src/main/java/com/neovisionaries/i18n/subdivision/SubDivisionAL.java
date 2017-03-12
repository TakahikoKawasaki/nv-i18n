
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionAL
    implements CountrySubDivisionCode
{

    BR("Berat", "BR"),
    BU("Bulqiz\u00eb", "BU"),
    DI("Dib\u00ebr", "DI"),
    DL("Delvin\u00eb", "DL"),
    DR("Durr\u00ebs", "DR"),
    DV("Devoll", "DV"),
    EL("Elbasan", "EL"),
    ER("Kolonj\u00eb", "ER"),
    FR("Fier", "FR"),
    GJ("Gjirokast\u00ebr", "GJ"),
    GR("Gramsh", "GR"),
    HA("Has", "HA"),
    KA("Kavaj\u00eb", "KA"),
    KB("Kurbin", "KB"),
    KC("Ku\u00e7ov\u00eb", "KC"),
    KO("Kor\u00e7\u00eb", "KO"),
    KR("Kruj\u00eb", "KR"),
    KU("Kuk\u00ebs", "KU"),
    LB("Librazhd", "LB"),
    LE("Lezh\u00eb", "LE"),
    LU("Lushnj\u00eb", "LU"),
    MK("Mallakast\u00ebr", "MK"),
    MM("Mal\u00ebsi e Madhe", "MM"),
    MR("Mirdit\u00eb", "MR"),
    MT("Mat", "MT"),
    PG("Pogradec", "PG"),
    PQ("Peqin", "PQ"),
    PR("P\u00ebrmet", "PR"),
    PU("Puk\u00eb", "PU"),
    SH("Shkod\u00ebr", "SH"),
    SK("Skrapar", "SK"),
    SR("Sarand\u00eb", "SR"),
    TE("Tepelen\u00eb", "TE"),
    TP("Tropoj\u00eb", "TP"),
    TR("Tiran\u00eb", "TR"),
    VL("Vlor\u00eb", "VL");
    public String name;
    public String code;

    SubDivisionAL(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.AL;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
