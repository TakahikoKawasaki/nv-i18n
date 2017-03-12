
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionTW
    implements CountrySubDivisionCode
{

    CHA("Changhua", "CHA"),
    CYQ("Chiayi", "CYQ"),
    HSZQ("Hsinchu", "HSZQ"),
    HUA("Hualien", "HUA"),
    ILA("Ilan", "ILA"),
    KHQ("Kaohsiung", "KHQ"),
    MIA("Miaoli", "MIA"),
    NAN("Nantou", "NAN"),
    PEN("Penghu", "PEN"),
    PIF("Pingtung", "PIF"),
    TAO("Taoyuan", "TAO"),
    TNQ("Tainan", "TNQ"),
    TPQ("Taipei", "TPQ"),
    TTT("Taitung", "TTT"),
    TXQ("Taichung", "TXQ"),
    YUN("Yunlin", "YUN"),
    CYI("Chiayi", "CYI"),
    HSZ("Hsinchu", "HSZ"),
    KEE("Keelung", "KEE"),
    TNN("Tainan", "TNN"),
    TXG("Taichung", "TXG"),
    KHH("Kaohsiung", "KHH"),
    TPE("Taipei", "TPE");
    public String name;
    public String code;

    SubDivisionTW(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.TW;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
