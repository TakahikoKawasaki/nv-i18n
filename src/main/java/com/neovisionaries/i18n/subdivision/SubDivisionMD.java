
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionMD
    implements CountrySubDivisionCode
{

    GA("G\u0103g\u0103uzia, Unitatea teritorial\u0103 autonom\u0103 (UTAG)", "GA"),
    BA("B\u0103l\u0163i", "BA"),
    BD("Tighina", "BD"),
    CU("Chi\u015fin\u0103u", "CU"),
    AN("Anenii Noi", "AN"),
    BR("Briceni", "BR"),
    BS("Basarabeasca", "BS"),
    CA("Cahul", "CA"),
    CL("C\u0103l\u0103ra\u015fi", "CL"),
    CM("Cimi\u015flia", "CM"),
    CR("Criuleni", "CR"),
    CS("C\u0103u\u015feni", "CS"),
    CT("Cantemir", "CT"),
    DO("Dondu\u015feni", "DO"),
    DR("Drochia", "DR"),
    DU("Dub\u0103sari", "DU"),
    ED("Edine\u0163", "ED"),
    FA("F\u0103le\u015fti", "FA"),
    FL("Flore\u015fti", "FL"),
    GL("Glodeni", "GL"),
    HI("H\u00eence\u015fti", "HI"),
    IA("Ialoveni", "IA"),
    LE("Leova", "LE"),
    NI("Nisporeni", "NI"),
    OC("Ocni\u0163a", "OC"),
    OR("Orhei", "OR"),
    RE("Rezina", "RE"),
    RI("R\u00ee\u015fcani", "RI"),
    SD("\u015eold\u0103ne\u015fti", "SD"),
    SI("S\u00eengerei", "SI"),
    SO("Soroca", "SO"),
    ST("Str\u0103\u015feni", "ST"),
    SV("\u015etefan Vod\u0103", "SV"),
    TA("Taraclia", "TA"),
    TE("Telene\u015fti", "TE"),
    UN("Ungheni", "UN"),
    SN("St\u00eenga Nistrului, unitatea teritorial\u0103 din", "SN");
    public String name;
    public String code;

    SubDivisionMD(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.MD;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
