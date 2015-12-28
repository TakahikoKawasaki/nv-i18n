
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionHU
    implements CountrySubDivisionCode
{

    BA("Baranya", "BA"),
    BC("B\u00e9k\u00e9scsaba", "BC"),
    BE("B\u00e9k\u00e9s", "BE"),
    BK("B\u00e1cs-Kiskun", "BK"),
    BU("Budapest", "BU"),
    BZ("Borsod-Aba\u00faj-Zempl\u00e9n", "BZ"),
    CS("Csongr\u00e1d", "CS"),
    DE("Debrecen", "DE"),
    DU("Dunaujv\u00e1ros", "DU"),
    EG("Eger", "EG"),
    FE("Fej\u00e9r", "FE"),
    GS("Gy\u00f3r-Moson-Sopron", "GS"),
    GY("Gy\u00f3r", "GY"),
    HB("Hajd\u00fa-Bihar", "HB"),
    HE("Heves", "HE"),
    HV("H\u00f3dmez\u00f3v\u00e1s\u00e1rhely", "HV"),
    JN("J\u00e1sz-Nagykun-Szolnok", "JN"),
    KE("Kom\u00e1rom-Esztergom", "KE"),
    KM("Kecskem\u00e9t", "KM"),
    KV("Kaposv\u00e1r", "KV"),
    MI("Miskolc", "MI"),
    NK("Nagykanizsa", "NK"),
    NO("N\u00f3gr\u00e1d", "NO"),
    NY("Ny\u00edregyh\u00e1za", "NY"),
    PE("Pest", "PE"),
    PS("P\u00e9cs", "PS"),
    SD("Szeged", "SD"),
    SF("Sz\u00e9kesfeh\u00e9rv\u00e1r", "SF"),
    SH("Szombathely", "SH"),
    SK("Szolnok", "SK"),
    SN("Sopron", "SN"),
    SO("Somogy", "SO"),
    SS("Szeksz\u00e1rd", "SS"),
    ST("Salg\u00f3tarj\u00e1n", "ST"),
    SZ("Szabolcs-Szatm\u00e1r-Bereg", "SZ"),
    TB("Tatab\u00e1nya", "TB"),
    TO("Tolna", "TO"),
    VA("Vas", "VA"),
    VE("Veszpr\u00e9m", "VE"),
    VM("Veszpr\u00e9m", "VM"),
    ZA("Zala", "ZA"),
    ZE("Zalaegerszeg", "ZE");
    public String name;
    public String code;

    SubDivisionHU(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.HU;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
