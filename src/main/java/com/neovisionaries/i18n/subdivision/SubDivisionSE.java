
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionSE
    implements CountrySubDivisionCode
{

    AB("Stockholms l\u00e4n[SE-01]", "AB"),
    AC("V\u00e4sterbottens l\u00e4n[SE-24]", "AC"),
    BD("Norrbottens l\u00e4n[SE-25]", "BD"),
    C("Uppsala l\u00e4n[SE-03]", "C"),
    D("S\u00f6dermanlands l\u00e4n[SE-04]", "D"),
    E("\u00d6sterg\u00f6tlands l\u00e4n[SE-05]", "E"),
    F("J\u00f6nk\u00f6pings l\u00e4n[SE-06]", "F"),
    G("Kronoborgs l\u00e4n[SE-07]", "G"),
    H("Kalmar l\u00e4n[SE-08]", "H"),
    I("Gotlands l\u00e4n[SE-09]", "I"),
    K("Blekinge l\u00e4n[SE-10]", "K"),
    M("Sk\u00e5ne l\u00e4n[SE-12]", "M"),
    N("Hallands l\u00e4n[SE-13]", "N"),
    O("V\u00e4stra G\u00f6talands l\u00e4n[SE-14]", "O"),
    S("V\u00e4rmlands l\u00e4n[SE-17]", "S"),
    T("\u00d6rebro l\u00e4n[SE-18]", "T"),
    U("V\u00e4stmanlands l\u00e4n[SE-19]", "U"),
    W("Dalarnes l\u00e4n[SE-20]", "W"),
    X("G\u00e4vleborgs l\u00e4n[SE-21]", "X"),
    Y("V\u00e4sternorrlands l\u00e4n[SE-22]", "Y"),
    Z("J\u00e4mtlands l\u00e4n[SE-23]", "Z");
    public String name;
    public String code;

    SubDivisionSE(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.SE;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
