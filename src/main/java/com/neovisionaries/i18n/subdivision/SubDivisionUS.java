
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionUS
    implements CountrySubDivisionCode
{

    AK("Alaska", "AK"),
    AL("Alabama", "AL"),
    AR("Arkansas", "AR"),
    AS("American Samoa (see also separate entry under AS)", "AS"),
    AZ("Arizona", "AZ"),
    CA("California", "CA"),
    CO("Colorado", "CO"),
    CT("Connecticut", "CT"),
    DC("District of Columbia", "DC"),
    DE("Delaware", "DE"),
    FL("Florida", "FL"),
    GA("Georgia", "GA"),
    GU("Guam (see also separate entry under GU)", "GU"),
    HI("Hawaii", "HI"),
    IA("Iowa", "IA"),
    ID("Idaho", "ID"),
    IL("Illinois", "IL"),
    IN("Indiana", "IN"),
    KS("Kansas", "KS"),
    KY("Kentucky", "KY"),
    LA("Louisiana", "LA"),
    MA("Massachusetts", "MA"),
    MD("Maryland", "MD"),
    ME("Maine", "ME"),
    MI("Michigan", "MI"),
    MN("Minnesota", "MN"),
    MO("Missouri", "MO"),
    MP("Northern Mariana Islands (see also separate entry MP)", "MP"),
    MS("Mississippi", "MS"),
    MT("Montana", "MT"),
    NC("North Carolina", "NC"),
    ND("North Dakota", "ND"),
    NE("Nebraska", "NE"),
    NH("New Hampshire", "NH"),
    NJ("New Jersey", "NJ"),
    NM("New Mexico", "NM"),
    NV("Nevada", "NV"),
    NY("New York", "NY"),
    OH("Ohio", "OH"),
    OK("Oklahoma", "OK"),
    OR("Oregon", "OR"),
    PA("Pennsylvania", "PA"),
    PR("Puerto Rico (see also separate entry under PR)", "PR"),
    RI("Rhode Island", "RI"),
    SC("South Carolina", "SC"),
    SD("South Dakota", "SD"),
    TN("Tennessee", "TN"),
    TX("Texas", "TX"),
    UM("U.S. Minor Outlying Islands (cf. separate entry UM)", "UM"),
    UT("Utah", "UT"),
    VA("Virginia", "VA"),
    VI("Virgin Islands of the U.S. (see also separate entry VI)", "VI"),
    VT("Vermont", "VT"),
    WA("Washington", "WA"),
    WI("Wisconsin", "WI"),
    WV("West Virginia", "WV"),
    WY("Wyoming", "WY");
    public String name;
    public String code;

    SubDivisionUS(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.US;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
