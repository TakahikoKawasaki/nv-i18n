
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionAZ
    implements CountrySubDivisionCode
{

    NX("Nax\u00e7\u0131van", "NX"),
    BA("Bak\u0131", "BA"),
    GA("G\u04d9nc\u04d9", "GA"),
    LA("L\u04d9nk\u04d9ran", "LA"),
    MI("Ming\u04d9\u00e7evir", "MI"),
    NA("Naftalan", "NA"),
    NV("Nax\u00e7\u0131van", "NV"),
    SA("\u015e\u04d9ki", "SA"),
    SM("Sumqay\u0131t", "SM"),
    SR("\u015eirvan", "SR"),
    XA("Xank\u04d9ndi", "XA"),
    YE("Yevlax", "YE"),
    ABS("Ab\u015feron", "ABS"),
    AGA("A\u011fstafa", "AGA"),
    AGC("A\u011fcab\u04d9di", "AGC"),
    AGM("A\u011fdam", "AGM"),
    AGS("A\u011fda\u015f", "AGS"),
    AGU("A\u011fsu", "AGU"),
    AST("Astara", "AST"),
    BAB("Bab\u0259k", "BAB"),
    BAL("Balak\u0259n", "BAL"),
    BAR("B\u0259rd\u0259", "BAR"),
    BEY("Beyl\u0259qan", "BEY"),
    BIL("Bil\u0259suvar", "BIL"),
    CAB("C\u0259bray\u0131l", "CAB"),
    CAL("C\u0259lilabad", "CAL"),
    CUL("Culfa", "CUL"),
    DAS("Da\u015fk\u0259s\u0259n", "DAS"),
    FUZ("F\u00fczuli", "FUZ"),
    GAD("G\u0259d\u0259b\u0259y", "GAD"),
    GOR("Goranboy", "GOR"),
    GOY("G\u00f6y\u00e7ay", "GOY"),
    GYG("G\u00f6yg\u00f6l", "GYG"),
    HAC("Haciqabul", "HAC"),
    IMI("\u0130mi\u015fli", "IMI"),
    ISM("\u0130smay\u0131ll\u0131", "ISM"),
    KAL("K\u0259lb\u0259c\u0259r", "KAL"),
    KAN("K\u01ddng\u01ddrli", "KAN"),
    KUR("K\u00fcrd\u0259mir", "KUR"),
    LAC("La\u00e7in", "LAC"),
    LAN("L\u0259nk\u0259ran", "LAN"),
    LER("Lerik", "LER"),
    MAS("Masall\u0131", "MAS"),
    NEF("Neft\u00e7ala", "NEF"),
    OGU("O\u011fuz", "OGU"),
    ORD("Ordubad", "ORD"),
    QAB("Q\u04d9b\u04d9l\u04d9", "QAB"),
    QAX("Qax", "QAX"),
    QAZ("Qazax", "QAZ"),
    QBA("Quba", "QBA"),
    QBI("Qubadl\u0131", "QBI"),
    QOB("Qobustan", "QOB"),
    QUS("Qusar", "QUS"),
    SAB("Sabirabad", "SAB"),
    SAD("S\u04d9d\u04d9r\u04d9k", "SAD"),
    SAH("\u015eahbuz", "SAH"),
    SAK("\u015e\u04d9ki", "SAK"),
    SAL("Salyan", "SAL"),
    SAR("\u015e\u04d9rur", "SAR"),
    SAT("Saatl\u0131", "SAT"),
    SBN("\u015eabran", "SBN"),
    SIY("Siy\u04d9z\u04d9n", "SIY"),
    SKR("\u015e\u04d9mkir", "SKR"),
    SMI("\u015eamax\u0131", "SMI"),
    SMX("Samux", "SMX"),
    SUS("\u015eu\u015fa", "SUS"),
    TAR("T\u04d9rt\u04d9r", "TAR"),
    TOV("Tovuz", "TOV"),
    UCA("Ucar", "UCA"),
    XAC("Xa\u00e7maz", "XAC"),
    XCI("Xocal\u0131", "XCI"),
    XIZ("X\u0131z\u0131", "XIZ"),
    XVD("Xocav\u04d9nd", "XVD"),
    YAR("Yard\u0131ml\u0131", "YAR"),
    YEV("Yevlax", "YEV"),
    ZAN("Z\u04d9ngilan", "ZAN"),
    ZAQ("Zaqatala", "ZAQ"),
    ZAR("Z\u04d9rdab", "ZAR");
    public String name;
    public String code;

    SubDivisionAZ(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.AZ;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
