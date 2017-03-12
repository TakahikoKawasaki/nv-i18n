
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionUZ
    implements CountrySubDivisionCode
{

    AN("Andijon", "AN"),
    BU("Bukhoro", "BU"),
    FA("Farghona", "FA"),
    JI("Jizzakh", "JI"),
    KH("Khorazm", "KH"),
    NG("Namangan", "NG"),
    NW("Nawoiy", "NW"),
    QA("Qashqadaryo", "QA"),
    QR("Qoraqalpoghiston Respublikasi", "QR"),
    SA("Samarqand", "SA"),
    SI("Sirdaryo", "SI"),
    SU("Surkhondaryo", "SU"),
    TK("Toshkent", "TK"),
    TO("Toshkent", "TO"),
    XO("Xorazm", "XO");
    public String name;
    public String code;

    SubDivisionUZ(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.UZ;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
