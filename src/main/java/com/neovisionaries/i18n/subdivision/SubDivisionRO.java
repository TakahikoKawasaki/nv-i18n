
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionRO
    implements CountrySubDivisionCode
{

    AB("Alba", "AB"),
    AG("Arge\u015f", "AG"),
    AR("Arad", "AR"),
    B("Bucure\u015fti", "B"),
    BC("Bac\u0103u", "BC"),
    BH("Bihor", "BH"),
    BN("Bistri\u0163a-N\u0103s\u0103ud", "BN"),
    BR("Br\u0103ila", "BR"),
    BT("Boto\u015fani", "BT"),
    BV("Bra\u015fov", "BV"),
    BZ("Buz\u0103u", "BZ"),
    CJ("Cluj", "CJ"),
    CL("C\u0103l\u0103ra\u015fi", "CL"),
    CS("Cara\u015f-Severin", "CS"),
    CT("Constan\u0163a", "CT"),
    CV("Covasna", "CV"),
    DB("D\u00e2mbovi\u0163a", "DB"),
    DJ("Dolj", "DJ"),
    GJ("Gorj", "GJ"),
    GL("Gala\u0163i", "GL"),
    GR("Giurgiu", "GR"),
    HD("Hunedoara", "HD"),
    HR("Harghita", "HR"),
    IF("Ilfov", "IF"),
    IL("Ialomita", "IL"),
    IS("Ia\u015fi", "IS"),
    MH("Mehedin\u0163i", "MH"),
    MM("Maramure\u015f", "MM"),
    MS("Mure\u015f", "MS"),
    NT("Neam\u0163", "NT"),
    OT("Olt", "OT"),
    PH("Prahova", "PH"),
    SB("Sibiu", "SB"),
    SJ("S\u0103laj", "SJ"),
    SM("Satu Mare", "SM"),
    SV("Suceava", "SV"),
    TL("Tulcea", "TL"),
    TM("Timi\u015f", "TM"),
    TR("Teleorman", "TR"),
    VL("V\u00e2lcea", "VL"),
    VN("Vrancea", "VN"),
    VS("Vaslui", "VS");
    public String name;
    public String code;

    SubDivisionRO(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.RO;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
