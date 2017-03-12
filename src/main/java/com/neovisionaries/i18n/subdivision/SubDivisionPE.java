
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionPE
    implements CountrySubDivisionCode
{

    CAL("El Callao", "CAL"),
    AMA("Amazonas", "AMA"),
    ANC("Ancash", "ANC"),
    APU("Apur\u00edmac", "APU"),
    ARE("Arequipa", "ARE"),
    AYA("Ayacucho", "AYA"),
    CAJ("Cajamarca", "CAJ"),
    CUS("Cuzco [Cusco]", "CUS"),
    HUC("Hu\u00e1nuco", "HUC"),
    HUV("Huancavelica", "HUV"),
    ICA("Ica", "ICA"),
    JUN("Jun\u00edn", "JUN"),
    LAL("La Libertad", "LAL"),
    LAX("Lambayeque", "LAX"),
    LIM("Lima", "LIM"),
    LOR("Loreto", "LOR"),
    MDD("Madre de Dios", "MDD"),
    MOQ("Moquegua", "MOQ"),
    PAS("Pasco", "PAS"),
    PIU("Piura", "PIU"),
    PUN("Puno", "PUN"),
    SAM("San Mart\u00edn", "SAM"),
    TAC("Tacna", "TAC"),
    TUM("Tumbes", "TUM"),
    UCA("Ucayali", "UCA"),
    LMA("Municipalidad Metropolitana de Lima", "LMA");
    public String name;
    public String code;

    SubDivisionPE(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.PE;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
