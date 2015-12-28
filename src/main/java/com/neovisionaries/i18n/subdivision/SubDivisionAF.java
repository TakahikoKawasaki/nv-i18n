
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionAF
    implements CountrySubDivisionCode
{

    BAL("Balkh", "BAL"),
    BAM("B\u0101my\u0101n", "BAM"),
    BDG("B\u0101dgh\u012bs", "BDG"),
    BDS("Badakhsh\u0101n", "BDS"),
    BGL("Baghl\u0101n", "BGL"),
    DAY("D\u0101ykund\u012b", "DAY"),
    FRA("Far\u0101h", "FRA"),
    FYB("F\u0101ry\u0101b", "FYB"),
    GHA("Ghazn\u012b", "GHA"),
    GHO("Gh\u014dr", "GHO"),
    HEL("Helmand", "HEL"),
    HER("Her\u0101t", "HER"),
    JOW("Jowzj\u0101n", "JOW"),
    KAB("K\u0101bul", "KAB"),
    KAN("Kandah\u0101r", "KAN"),
    KAP("K\u0101p\u012bs\u0101", "KAP"),
    KDZ("Kunduz", "KDZ"),
    KHO("Kh\u014dst", "KHO"),
    KNR("Kunar", "KNR"),
    LAG("Laghm\u0101n", "LAG"),
    LOG("L\u014dgar", "LOG"),
    NAN("Nangarh\u0101r", "NAN"),
    NIM("N\u012bmr\u014dz", "NIM"),
    NUR("N\u016brist\u0101n", "NUR"),
    PAN("Panjshayr", "PAN"),
    PAR("Parw\u0101n", "PAR"),
    PIA("Pakt\u012b\u0101", "PIA"),
    PKA("Pakt\u012bk\u0101", "PKA"),
    SAM("Samang\u0101n", "SAM"),
    SAR("Sar-e Pul", "SAR"),
    TAK("Takh\u0101r", "TAK"),
    URU("Uruzg\u0101n", "URU"),
    WAR("Wardak", "WAR"),
    ZAB("Z\u0101bul", "ZAB");
    public String name;
    public String code;

    SubDivisionAF(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.AF;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
