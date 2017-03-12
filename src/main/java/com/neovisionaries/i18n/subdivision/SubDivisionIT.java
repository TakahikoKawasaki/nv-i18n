
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionIT
    implements CountrySubDivisionCode
{

    AG("Agrigento", "AG"),
    AL("Alessandria", "AL"),
    AN("Ancona", "AN"),
    AO("Aosta / Aoste (fr)", "AO"),
    AP("Ascoli Piceno", "AP"),
    AQ("L'Aquila", "AQ"),
    AR("Arezzo", "AR"),
    AT("Asti", "AT"),
    AV("Avellino", "AV"),
    BA("Bari", "BA"),
    BG("Bergamo", "BG"),
    BI("Biella", "BI"),
    BL("Belluno", "BL"),
    BN("Benevento", "BN"),
    BO("Bologna", "BO"),
    BR("Brindisi", "BR"),
    BS("Brescia", "BS"),
    BT("Barletta-Andria-Trani", "BT"),
    BZ("Bolzano / Bozen (de)", "BZ"),
    CA("Cagliari", "CA"),
    CB("Campobasso", "CB"),
    CE("Caserta", "CE"),
    CH("Chieti", "CH"),
    CI("Carbonia-Iglesias", "CI"),
    CL("Caltanissetta", "CL"),
    CN("Cuneo", "CN"),
    CO("Como", "CO"),
    CR("Cremona", "CR"),
    CS("Cosenza", "CS"),
    CT("Catania", "CT"),
    CZ("Catanzaro", "CZ"),
    EN("Enna", "EN"),
    FC("Forl\u00ec-Cesena", "FC"),
    FE("Ferrara", "FE"),
    FG("Foggia", "FG"),
    FI("Firenze", "FI"),
    FM("Fermo", "FM"),
    FR("Frosinone", "FR"),
    GE("Genova", "GE"),
    GO("Gorizia", "GO"),
    GR("Grosseto", "GR"),
    IM("Imperia", "IM"),
    IS("Isernia", "IS"),
    KR("Crotone", "KR"),
    LC("Lecco", "LC"),
    LE("Lecce", "LE"),
    LI("Livorno", "LI"),
    LO("Lodi", "LO"),
    LT("Latina", "LT"),
    LU("Lucca", "LU"),
    MB("Monza e Brianza", "MB"),
    MC("Macerata", "MC"),
    ME("Messina", "ME"),
    MI("Milano", "MI"),
    MN("Mantova", "MN"),
    MO("Modena", "MO"),
    MS("Massa-Carrara", "MS"),
    MT("Matera", "MT"),
    NA("Napoli", "NA"),
    NO("Novara", "NO"),
    NU("Nuoro", "NU"),
    OG("Ogliastra", "OG"),
    OR("Oristano", "OR"),
    OT("Olbia-Tempio", "OT"),
    PA("Palermo", "PA"),
    PC("Piacenza", "PC"),
    PD("Padova", "PD"),
    PE("Pescara", "PE"),
    PG("Perugia", "PG"),
    PI("Pisa", "PI"),
    PN("Pordenone", "PN"),
    PO("Prato", "PO"),
    PR("Parma", "PR"),
    PT("Pistoia", "PT"),
    PU("Pesaro e Urbino", "PU"),
    PV("Pavia", "PV"),
    PZ("Potenza", "PZ"),
    RA("Ravenna", "RA"),
    RC("Reggio Calabria", "RC"),
    RE("Reggio Emilia", "RE"),
    RG("Ragusa", "RG"),
    RI("Rieti", "RI"),
    RM("Roma", "RM"),
    RN("Rimini", "RN"),
    RO("Rovigo", "RO"),
    SA("Salerno", "SA"),
    SI("Siena", "SI"),
    SO("Sondrio", "SO"),
    SP("La Spezia", "SP"),
    SR("Siracusa", "SR"),
    SS("Sassari", "SS"),
    SV("Savona", "SV"),
    TA("Taranto", "TA"),
    TE("Teramo", "TE"),
    TN("Trento", "TN"),
    TO("Torino", "TO"),
    TP("Trapani", "TP"),
    TR("Terni", "TR"),
    TS("Trieste", "TS"),
    TV("Treviso", "TV"),
    UD("Udine", "UD"),
    VA("Varese", "VA"),
    VB("Verbano-Cusio-Ossola", "VB"),
    VC("Vercelli", "VC"),
    VE("Venezia", "VE"),
    VI("Vicenza", "VI"),
    VR("Verona", "VR"),
    VS("Medio Campidano", "VS"),
    VT("Viterbo", "VT"),
    VV("Vibo Valentia", "VV");
    public String name;
    public String code;

    SubDivisionIT(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.IT;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
