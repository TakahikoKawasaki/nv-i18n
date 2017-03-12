
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionPH
    implements CountrySubDivisionCode
{

    ABR("Abra", "ABR"),
    AGN("Agusan del Norte", "AGN"),
    AGS("Agusan del Sur", "AGS"),
    AKL("Aklan", "AKL"),
    ALB("Albay", "ALB"),
    ANT("Antique", "ANT"),
    APA("Apayao", "APA"),
    AUR("Aurora", "AUR"),
    BAN("Bataan", "BAN"),
    BAS("Basilan", "BAS"),
    BEN("Benguet", "BEN"),
    BIL("Biliran", "BIL"),
    BOH("Bohol", "BOH"),
    BTG("Batangas", "BTG"),
    BTN("Batanes", "BTN"),
    BUK("Bukidnon", "BUK"),
    BUL("Bulacan", "BUL"),
    CAG("Cagayan", "CAG"),
    CAM("Camiguin", "CAM"),
    CAN("Camarines Norte", "CAN"),
    CAP("Capiz", "CAP"),
    CAS("Camarines Sur", "CAS"),
    CAT("Catanduanes", "CAT"),
    CAV("Cavite", "CAV"),
    CEB("Cebu", "CEB"),
    COM("Compostela Valley", "COM"),
    DAO("Davao Oriental", "DAO"),
    DAS("Davao del Sur", "DAS"),
    DAV("Davao", "DAV"),
    DIN("Dinagat Islands", "DIN"),
    EAS("Eastern Samar", "EAS"),
    GUI("Guimaras", "GUI"),
    IFU("Ifugao", "IFU"),
    ILI("Iloilo", "ILI"),
    ILN("Ilocos Norte", "ILN"),
    ILS("Ilocoq Sur", "ILS"),
    ISA("Isabela", "ISA"),
    KAL("Kalinga-Apayao", "KAL"),
    LAG("Laguna", "LAG"),
    LAN("Lanao del Norte", "LAN"),
    LAS("Lanao del Sur", "LAS"),
    LEY("Leyte", "LEY"),
    LUN("La Union", "LUN"),
    MAD("Marinduque", "MAD"),
    MAG("Maguindanao", "MAG"),
    MAS("Masbate", "MAS"),
    MDC("Mindoro Occidental", "MDC"),
    MDR("Mindoro Oriental", "MDR"),
    MOU("Mountain Province", "MOU"),
    MSC("Misamis Occidental", "MSC"),
    MSR("Misamis Oriental", "MSR"),
    NCO("North Cotabato", "NCO"),
    NEC("Negros occidental", "NEC"),
    NER("Negros oriental", "NER"),
    NSA("Northern Samar", "NSA"),
    NUE("Nueva Ecija", "NUE"),
    NUV("Nueva Vizcaya", "NUV"),
    PAM("Pampanga", "PAM"),
    PAN("Pangasinan", "PAN"),
    PLW("Palawan", "PLW"),
    QUE("Quezon", "QUE"),
    QUI("Quirino", "QUI"),
    RIZ("Rizal", "RIZ"),
    ROM("Romblon", "ROM"),
    SAR("Sarangani", "SAR"),
    SCO("South Cotabato", "SCO"),
    SIG("Siquijor", "SIG"),
    SLE("Southern Leyte", "SLE"),
    SLU("Sulu", "SLU"),
    SOR("Sorsogon", "SOR"),
    SUK("Sultan Kudarat", "SUK"),
    SUN("Surigao del Norte", "SUN"),
    SUR("Surigao del Sur", "SUR"),
    TAR("Tarlac", "TAR"),
    TAW("Tawi-Tawi", "TAW"),
    WSA("Western Samar", "WSA"),
    ZAN("Zamboanga del Norte", "ZAN"),
    ZAS("Zamboanga del Sur", "ZAS"),
    ZMB("Zambales", "ZMB"),
    ZSI("Zamboanga Sibuguey [Zamboanga Sibugay]", "ZSI");
    public String name;
    public String code;

    SubDivisionPH(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.PH;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
