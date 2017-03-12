
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionSM
    implements CountrySubDivisionCode
{

    _01("Acquaviva", "01"),
    _02("Chiesanuova", "02"),
    _03("Domagnano", "03"),
    _04("Faetano", "04"),
    _05("Fiorentino", "05"),
    _06("Borgo Maggiore", "06"),
    _07("San Marino", "07"),
    _08("Montegiardino", "08"),
    _09("Serravalle", "09");
    public String name;
    public String code;

    SubDivisionSM(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.SM;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
