
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionCO
    implements CountrySubDivisionCode
{

    AMA("Amazonas", "AMA"),
    ANT("Antioquia", "ANT"),
    ARA("Arauca", "ARA"),
    ATL("Atl\u00e1ntico", "ATL"),
    BOL("Bol\u00edvar", "BOL"),
    BOY("Boyac\u00e1", "BOY"),
    CAL("Caldas", "CAL"),
    CAQ("Caquet\u00e1", "CAQ"),
    CAS("Casanare", "CAS"),
    CAU("Cauca", "CAU"),
    CES("Cesar", "CES"),
    CHO("Choc\u00f3", "CHO"),
    COR("C\u00f3rdoba", "COR"),
    CUN("Cundinamarca", "CUN"),
    DC("Distrito Capital de Bogot\u00e1", "DC"),
    GUA("Guain\u00eda", "GUA"),
    GUV("Guaviare", "GUV"),
    HUI("Huila", "HUI"),
    LAG("La Guajira", "LAG"),
    MAG("Magdalena", "MAG"),
    MET("Meta", "MET"),
    NAR("Nari\u00f1o", "NAR"),
    NSA("Norte de Santander", "NSA"),
    PUT("Putumayo", "PUT"),
    QUI("Quind\u00edo", "QUI"),
    RIS("Risaralda", "RIS"),
    SAN("Santander", "SAN"),
    SAP("San Andr\u00e9s, Providencia y Santa Catalina", "SAP"),
    SUC("Sucre", "SUC"),
    TOL("Tolima", "TOL"),
    VAC("Valle del Cauca", "VAC"),
    VAU("Vaup\u00e9s", "VAU"),
    VID("Vichada", "VID");
    public String name;
    public String code;

    SubDivisionCO(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.CO;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
