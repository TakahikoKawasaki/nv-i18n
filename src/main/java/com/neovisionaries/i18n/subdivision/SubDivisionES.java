
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionES
    implements CountrySubDivisionCode
{

    A("Alicante / Alacant", "A"),
    AB("Albacete", "AB"),
    AL("Almer\u00eda", "AL"),
    AV("\u00c1vila", "AV"),
    B("Barcelona [Barcelona]", "B"),
    BA("Badajoz", "BA"),
    BI("Vizcaya / Biskaia", "BI"),
    BU("Burgos", "BU"),
    C("A Coru\u00f1a [La Coru\u00f1a]", "C"),
    CA("C\u00e1diz", "CA"),
    CC("C\u00e1ceres", "CC"),
    CE("Ceuta", "CE"),
    CO("C\u00f3rdoba", "CO"),
    CR("Ciudad Real", "CR"),
    CS("Castell\u00f3n / Castell\u00f3", "CS"),
    CU("Cuenca", "CU"),
    GC("Las Palmas", "GC"),
    GI("Girona [Gerona]", "GI"),
    GR("Granada", "GR"),
    GU("Guadalajara", "GU"),
    H("Huelva", "H"),
    HU("Huesca", "HU"),
    J("Ja\u00e9n", "J"),
    L("Lleida [L\u00e9rida]", "L"),
    LE("Le\u00f3n", "LE"),
    LO("La Rioja", "LO"),
    LU("Lugo [Lugo]", "LU"),
    M("Madrid", "M"),
    MA("M\u00e1laga", "MA"),
    ML("Melilla", "ML"),
    MU("Murcia", "MU"),
    NA("Navarra / Nafarroa", "NA"),
    O("Asturias", "O"),
    OR("Ourense [Orense]", "OR"),
    P("Palencia", "P"),
    PM("Balears [Baleares]", "PM"),
    PO("Pontevedra [Pontevedra]", "PO"),
    S("Cantabria", "S"),
    SA("Salamanca", "SA"),
    SE("Sevilla", "SE"),
    SG("Segovia", "SG"),
    SO("Soria", "SO"),
    SS("Guip\u00fazcoa / Gipuzkoa", "SS"),
    T("Tarragona [Tarragona]", "T"),
    TE("Teruel", "TE"),
    TF("Santa Cruz de Tenerife", "TF"),
    TO("Toledo", "TO"),
    V("Valencia / Val\u00e8ncia", "V"),
    VA("Valladolid", "VA"),
    VI("\u00c1lava / Araba", "VI"),
    Z("Zaragoza", "Z"),
    ZA("Zamora", "ZA");
    public String name;
    public String code;

    SubDivisionES(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.ES;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
