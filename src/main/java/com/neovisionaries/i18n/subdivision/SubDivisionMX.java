
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionMX
    implements CountrySubDivisionCode
{

    AGU("Aguascalientes", "AGU"),
    BCN("Baja California", "BCN"),
    BCS("Baja California Sur", "BCS"),
    CAM("Campeche", "CAM"),
    CHH("Chihuahua", "CHH"),
    CHP("Chiapas", "CHP"),
    COA("Coahuila", "COA"),
    COL("Colima", "COL"),
    DIF("Distrito Federal", "DIF"),
    DUR("Durango", "DUR"),
    GRO("Guerrero", "GRO"),
    GUA("Guanajuato", "GUA"),
    HID("Hidalgo", "HID"),
    JAL("Jalisco", "JAL"),
    MEX("M\u00e9xico", "MEX"),
    MIC("Michoac\u00e1n", "MIC"),
    MOR("Morelos", "MOR"),
    NAY("Nayarit", "NAY"),
    NLE("Nuevo Le\u00f3n", "NLE"),
    OAX("Oaxaca", "OAX"),
    PUE("Puebla", "PUE"),
    QUE("Quer\u00e9taro", "QUE"),
    ROO("Quintana Roo", "ROO"),
    SIN("Sinaloa", "SIN"),
    SLP("San Luis Potos\u00ed", "SLP"),
    SON("Sonora", "SON"),
    TAB("Tabasco", "TAB"),
    TAM("Tamaulipas", "TAM"),
    TLA("Tlaxcala", "TLA"),
    VER("Veracruz", "VER"),
    YUC("Yucat\u00e1n", "YUC"),
    ZAC("Zacatecas", "ZAC");
    public String name;
    public String code;

    SubDivisionMX(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.MX;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
