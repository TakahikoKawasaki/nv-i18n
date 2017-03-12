
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionGY
    implements CountrySubDivisionCode
{

    BA("Barima-Waini", "BA"),
    CU("Cuyuni-Mazaruni", "CU"),
    DE("Demerara-Mahaica", "DE"),
    EB("East Berbice-Corentyne", "EB"),
    ES("Essequibo Islands-West Demerara", "ES"),
    MA("Mahaica-Berbice", "MA"),
    PM("Pomeroon-Supenaam", "PM"),
    PT("Potaro-Siparuni", "PT"),
    UD("Upper Demerara-Berbice", "UD"),
    UT("Upper Takutu-Upper Essequibo", "UT");
    public String name;
    public String code;

    SubDivisionGY(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.GY;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
