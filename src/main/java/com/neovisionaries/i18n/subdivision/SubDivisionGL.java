
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionGL
    implements CountrySubDivisionCode
{

    KU("Kommune Kujalleq", "KU"),
    QA("Qaasuitsup Kommunia", "QA"),
    QE("Qeqqata Kommunia", "QE"),
    SM("Kommuneqarfik Sermersooq", "SM");
    public String name;
    public String code;

    SubDivisionGL(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.GL;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
