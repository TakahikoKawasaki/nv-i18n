
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionEE
    implements CountrySubDivisionCode
{

    _37("Harjumaa", "37"),
    _39("Hiiumaa", "39"),
    _44("Ida-Virumaa", "44"),
    _49("J\u00f5gevamaa", "49"),
    _51("J\u00e4rvamaa", "51"),
    _57("L\u00e4\u00e4nemaa", "57"),
    _59("L\u00e4\u00e4ne-Virumaa", "59"),
    _65("P\u00f5lvamaa", "65"),
    _67("P\u00e4rnumaa", "67"),
    _70("Raplamaa", "70"),
    _74("Saaremaa", "74"),
    _78("Tartumaa", "78"),
    _82("Valgamaa", "82"),
    _84("Viljandimaa", "84"),
    _86("V\u00f5rumaa", "86");
    public String name;
    public String code;

    SubDivisionEE(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.EE;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
