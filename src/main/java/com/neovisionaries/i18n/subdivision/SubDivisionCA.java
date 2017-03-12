
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionCA
    implements CountrySubDivisionCode
{

    AB("Alberta", "AB"),
    BC("British Columbia", "BC"),
    MB("Manitoba", "MB"),
    NB("New Brunswick", "NB"),
    NL("Newfoundland and Labrador", "NL"),
    NS("Nova Scotia", "NS"),
    NT("Northwest Territories", "NT"),
    NU("Nunavut", "NU"),
    ON("Ontario", "ON"),
    PE("Prince Edward Island", "PE"),
    QC("Quebec", "QC"),
    SK("Saskatchewan", "SK"),
    YT("Yukon Territory", "YT");
    public String name;
    public String code;

    SubDivisionCA(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.CA;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
