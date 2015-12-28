
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionRU
    implements CountrySubDivisionCode
{

    AMU("Amurskaya oblast'", "AMU"),
    ARK("Arkhangel'skaya oblast,", "ARK"),
    AST("Astrakhanskaya oblast'", "AST"),
    BEL("Belgorodskaya oblast'", "BEL"),
    BRY("Bryanskaya oblast'", "BRY"),
    CHE("Chelyabinskaya oblast'", "CHE"),
    IRK("Irkutskaya oblast'", "IRK"),
    IVA("Ivanovskaya oblast'", "IVA"),
    KEM("Kemerovskaya oblast'", "KEM"),
    KGD("Kaliningradskaya oblast,", "KGD"),
    KGN("Kurganskaya oblast'", "KGN"),
    KIR("Kirovskaya oblast'", "KIR"),
    KLU("Kaluzhskaya oblast'", "KLU"),
    KOS("Kostromskaya oblast'", "KOS"),
    KRS("Kurskaya oblast'", "KRS"),
    LEN("Leningradskaya oblast'", "LEN"),
    LIP("Lipetskaya oblast'", "LIP"),
    MAG("Magadanskaya oblast'", "MAG"),
    MOS("Moskovskaya oblast'", "MOS"),
    MUR("Murmanskaya oblast'", "MUR"),
    NGR("Novgorodskaya oblast'", "NGR"),
    NIZ("Nizbegorodskaya oblast,", "NIZ"),
    NVS("Novosibirskaya oblast'", "NVS"),
    OMS("Omskaya oblast'", "OMS"),
    ORE("Orenburgskaya oblast'", "ORE"),
    ORL("Orlovskaya oblast'", "ORL"),
    PNZ("Penzenskaya oblast'", "PNZ"),
    PSK("Pskovskaya oblast'", "PSK"),
    ROS("Rostovskaya oblast'", "ROS"),
    RYA("Ryazanskaya oblast'", "RYA"),
    SAK("Sakhalinskaya oblast'", "SAK"),
    SAM("Samarskaya oblast'", "SAM"),
    SAR("Saratovskaya oblast'", "SAR"),
    SMO("Smolenskaya oblast'", "SMO"),
    SVE("Sverdlovskaya oblast'", "SVE"),
    TAM("Tambovskaya oblast'", "TAM"),
    TOM("Tomskaya oblast'", "TOM"),
    TUL("Tul'skaya oblast'", "TUL"),
    TVE("Tverskaya oblast'", "TVE"),
    TYU("Tyumenskaya oblast'", "TYU"),
    ULY("Ul'yanovskaya oblast'", "ULY"),
    VGG("Volgogradskaya oblast'", "VGG"),
    VLA("Vladimirskaya oblast'", "VLA"),
    VLG("Vologodskaya oblast'", "VLG"),
    VOR("Voronezhskaya oblast'", "VOR"),
    YAR("Yaroslavskaya oblast'", "YAR"),
    ALT("Altayskiy kray", "ALT"),
    KAM("Kamchatskiy kray", "KAM"),
    KDA("Krasnodarskiy kray", "KDA"),
    KHA("Khabarovskiy kray", "KHA"),
    KYA("Krasnoyarskiy kray", "KYA"),
    PER("Permskiy kray", "PER"),
    PRI("Primorskiy kray", "PRI"),
    STA("Stavropol'skiy kray", "STA"),
    ZAB("Zabaykal'skiy kray", "ZAB"),
    MOW("Moskva", "MOW"),
    SPE("Sankt-Peterburg", "SPE"),
    CHU("Chukotskiy avtonomnyy okrug", "CHU"),
    KHM("Khanty-Mansiyskiy avtonomnyy okrug-Yugra", "KHM"),
    NEN("Nenetskiy avtonomnyy okrug", "NEN"),
    YAN("Yamalo-Nenetskiy avtonomnyy okrug", "YAN"),
    YEV("Yevreyskaya avtonomnaya oblast'ug", "YEV");
    public String name;
    public String code;

    SubDivisionRU(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.RU;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
