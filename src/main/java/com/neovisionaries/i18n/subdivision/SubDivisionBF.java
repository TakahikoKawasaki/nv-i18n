
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionBF
    implements CountrySubDivisionCode
{

    BAL("Bal\u00e9", "BAL"),
    BAM("Bam", "BAM"),
    BAN("Banwa", "BAN"),
    BAZ("Baz\u00e9ga", "BAZ"),
    BGR("Bougouriba", "BGR"),
    BLG("Boulgou", "BLG"),
    BLK("Boulkiemd\u00e9", "BLK"),
    COM("Como\u00e9", "COM"),
    GAN("Ganzourgou", "GAN"),
    GNA("Gnagna", "GNA"),
    GOU("Gourma", "GOU"),
    HOU("Houet", "HOU"),
    IOB("Ioba", "IOB"),
    KAD("Kadiogo", "KAD"),
    KEN("K\u00e9n\u00e9dougou", "KEN"),
    KMD("Komondjari", "KMD"),
    KMP("Kompienga", "KMP"),
    KOP("Koulp\u00e9logo", "KOP"),
    KOS("Kossi", "KOS"),
    KOT("Kouritenga", "KOT"),
    KOW("Kourw\u00e9ogo", "KOW"),
    LER("L\u00e9raba", "LER"),
    LOR("Loroum", "LOR"),
    MOU("Mouhoun", "MOU"),
    NAM("Namentenga", "NAM"),
    NAO("Nahouri", "NAO"),
    NAY("Nayala", "NAY"),
    NOU("Noumbiel", "NOU"),
    OUB("Oubritenga", "OUB"),
    OUD("Oudalan", "OUD"),
    PAS("Passor\u00e9", "PAS"),
    PON("Poni", "PON"),
    SEN("S\u00e9no", "SEN"),
    SIS("Sissili", "SIS"),
    SMT("Sanmatenga", "SMT"),
    SNG("Sangui\u00e9", "SNG"),
    SOM("Soum", "SOM"),
    SOR("Sourou", "SOR"),
    TAP("Tapoa", "TAP"),
    TUI("Tui", "TUI"),
    YAG("Yagha", "YAG"),
    YAT("Yatenga", "YAT"),
    ZIR("Ziro", "ZIR"),
    ZON("Zondoma", "ZON"),
    ZOU("Zoundw\u00e9ogo", "ZOU");
    public String name;
    public String code;

    SubDivisionBF(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.BF;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
