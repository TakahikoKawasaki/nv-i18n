
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionMN
    implements CountrySubDivisionCode
{

    _035("Orhon", "035"),
    _037("Darhan uul", "037"),
    _039("Hentiy", "039"),
    _041("H\u00f6vag\u00f6l", "041"),
    _043("Hovd", "043"),
    _046("Uvs", "046"),
    _047("T\u00f6v", "047"),
    _049("Selenge", "049"),
    _051("S\u00fchbaatar", "051"),
    _053("\u00d6mn\u00f6govi", "053"),
    _055("\u00d6v\u00f6rhangay", "055"),
    _057("Dzavhan", "057"),
    _059("Dundgovi", "059"),
    _061("Dornod", "061"),
    _063("Dornogovi", "063"),
    _064("Govi-Sumber", "064"),
    _065("Govi-Altay", "065"),
    _067("Bulgan", "067"),
    _069("Bayanhongor", "069"),
    _071("Bayan-\u00d6lgiy", "071"),
    _073("Arhangay", "073"),
    _1("Ulaanbaatar", "1");
    public String name;
    public String code;

    SubDivisionMN(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.MN;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
