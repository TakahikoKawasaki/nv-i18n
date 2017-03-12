
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionBY
    implements CountrySubDivisionCode
{

    HM("Horad Minsk (be) - BrestGorod Minsk (ru)", "HM"),
    BR("Brestskaya voblasts' (be) - Brestskaya oblast' (ru)", "BR"),
    HO("Homyel'skaya voblasts' (be) - Gomel'skaya oblast' (ru)", "HO"),
    HR("Hrodzenskaya voblasts' (be) - Grodnenskaya oblast' (ru)", "HR"),
    MA("Mahilyowskaya voblasts' (be) - Mogilevskaya oblast' (ru)", "MA"),
    MI("Minskaya voblasts' (be) - Minskaya oblast' (ru)", "MI"),
    VI("Vitsyebskaya voblasts' (be) - Vitebskaya oblast' (ru)", "VI");
    public String name;
    public String code;

    SubDivisionBY(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.BY;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
