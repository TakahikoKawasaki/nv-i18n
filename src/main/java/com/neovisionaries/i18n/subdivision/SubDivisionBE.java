
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionBE
    implements CountrySubDivisionCode
{

    BRU("Bruxelles-Capitale, R\u00e9gion de (fr), Brussels Hoofdstedelijk Gewest (nl)", "BRU"),
    VAN("Antwerpen (VLG)", "VAN"),
    VBR("Vlaams Brabant (VLG)", "VBR"),
    VLG("Vlaamse Gewest (nl)", "VLG"),
    VLI("Limburg (VLG)", "VLI"),
    VOV("Oost-Vlaanderen (VLG)", "VOV"),
    VWV("West-Vlaanderen (VLG)", "VWV"),
    WAL("Wallonne, R\u00e9gion (fr)", "WAL"),
    WBR("Brabant Wallon (WAL)", "WBR"),
    WHT("Hainaut (WAL)", "WHT"),
    WLG("Li\u00e8ge (WAL)", "WLG"),
    WLX("Luxembourg (WAL)", "WLX"),
    WNA("Namur (WAL)", "WNA");
    public String name;
    public String code;

    SubDivisionBE(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.BE;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
