
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionUG
    implements CountrySubDivisionCode
{

    _101("Kalangala", "101"),
    _102("Kampala", "102"),
    _103("Kiboga", "103"),
    _104("Luwero", "104"),
    _105("Masaka", "105"),
    _106("Mpigi", "106"),
    _107("Mubende", "107"),
    _108("Mukono", "108"),
    _109("Nakasongola", "109"),
    _110("Rakai", "110"),
    _111("Sembabule", "111"),
    _112("Kayunga", "112"),
    _113("Wakiso", "113"),
    _114("Mityana", "114"),
    _115("Nakaseke", "115"),
    _116("Lyantonde", "116"),
    _201("Bugiri", "201"),
    _202("Busia", "202"),
    _203("Iganga", "203"),
    _204("Jinja", "204"),
    _205("Kamuli", "205"),
    _206("Kapchorwa", "206"),
    _207("Katakwi", "207"),
    _208("Kumi", "208"),
    _209("Mbale", "209"),
    _210("Pallisa", "210"),
    _211("Soroti", "211"),
    _212("Tororo", "212"),
    _213("Kaberamaido", "213"),
    _214("Mayuge", "214"),
    _215("Sironko", "215"),
    _216("Amuria", "216"),
    _217("Budaka", "217"),
    _218("Bukwa", "218"),
    _219("Butaleja", "219"),
    _220("Kaliro", "220"),
    _221("Manafwa", "221"),
    _222("Namutumba", "222"),
    _223("Bududa", "223"),
    _224("Bukedea", "224"),
    _301("Adjumani", "301"),
    _302("Apac", "302"),
    _303("Arua", "303"),
    _304("Gulu", "304"),
    _305("Kitgum", "305"),
    _306("Kotido", "306"),
    _307("Lira", "307"),
    _308("Moroto", "308"),
    _309("Moyo", "309"),
    _310("Nebbi", "310"),
    _311("Nakapiripirit", "311"),
    _312("Pader", "312"),
    _313("Yumbe", "313"),
    _314("Amolatar", "314"),
    _315("Kaabong", "315"),
    _316("Koboko", "316"),
    _317("Abim", "317"),
    _318("Dokolo", "318"),
    _319("Amuru", "319"),
    _320("Maracha", "320"),
    _321("Oyam", "321"),
    _401("Bundibugyo", "401"),
    _402("Bushenyi", "402"),
    _403("Hoima", "403"),
    _404("Kabale", "404"),
    _405("Kabarole", "405"),
    _406("Kasese", "406"),
    _407("Kibaale", "407"),
    _408("Kisoro", "408"),
    _409("Masindi", "409"),
    _410("Mbarara", "410"),
    _411("Ntungamo", "411"),
    _412("Rukungiri", "412"),
    _413("Kamwenge", "413"),
    _414("Kanungu", "414"),
    _415("Kyenjojo", "415"),
    _416("Ibanda", "416"),
    _417("Isingiro", "417"),
    _418("Kiruhura", "418"),
    _419("Buliisa", "419"),
    C("Central", "C"),
    E("Eastern", "E"),
    N("Northern", "N"),
    W("Western", "W");
    public String name;
    public String code;

    SubDivisionUG(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.UG;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
