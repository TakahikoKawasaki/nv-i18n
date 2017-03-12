
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionZW
    implements CountrySubDivisionCode
{

    BU("Bulawayo", "BU"),
    HA("Harare", "HA"),
    MA("Manicaland", "MA"),
    MC("Mashonaland Central", "MC"),
    ME("Mashonaland East", "ME"),
    MI("Midlands", "MI"),
    MN("Matabeleland North", "MN"),
    MS("Matabeleland South", "MS"),
    MV("Masvingo", "MV"),
    MW("Mashonaland West", "MW");
    public String name;
    public String code;

    SubDivisionZW(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.ZW;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
