
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionBI
    implements CountrySubDivisionCode
{

    BB("Bubanza", "BB"),
    BL("Bujumbura Rural", "BL"),
    BM("Bujumbura Mairie", "BM"),
    BR("Bururi", "BR"),
    CA("Cankuzo", "CA"),
    CI("Cibitoke", "CI"),
    GI("Gitega", "GI"),
    KI("Kirundo", "KI"),
    KR("Karuzi", "KR"),
    KY("Kayanza", "KY"),
    MA("Makamba", "MA"),
    MU("Muramvya", "MU"),
    MW("Mwaro", "MW"),
    MY("Muyinga", "MY"),
    NG("Ngozi", "NG"),
    RT("Rutana", "RT"),
    RY("Ruyigi", "RY");
    public String name;
    public String code;

    SubDivisionBI(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.BI;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
