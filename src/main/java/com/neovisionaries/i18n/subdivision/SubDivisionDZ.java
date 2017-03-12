
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionDZ
    implements CountrySubDivisionCode
{

    _01("Adrar", "01"),
    _02("Chlef", "02"),
    _03("Laghouat", "03"),
    _04("Oum el Bouaghi", "04"),
    _05("Batna", "05"),
    _06("B\u00e9ja\u00efa", "06"),
    _07("Biskra", "07"),
    _08("B\u00e9char", "08"),
    _09("Blida", "09"),
    _10("Bouira", "10"),
    _11("Tamanghasset", "11"),
    _12("T\u00e9bessa", "12"),
    _13("Tlemcen", "13"),
    _14("Tiaret", "14"),
    _15("Tizi Ouzou", "15"),
    _16("Alger", "16"),
    _17("Djelfa", "17"),
    _18("Jijel", "18"),
    _19("S\u00e9tif", "19"),
    _20("Sa\u00efda", "20"),
    _21("Skikda", "21"),
    _22("Sidi Bel Abb\u00e8s", "22"),
    _23("Annaba", "23"),
    _24("Guelma", "24"),
    _25("Constantine", "25"),
    _26("M\u00e9d\u00e9a", "26"),
    _27("Mostaganem", "27"),
    _28("Msila", "28"),
    _29("Mascara", "29"),
    _30("Ouargla", "30"),
    _31("Oran", "31"),
    _32("El Bayadh", "32"),
    _33("Illizi", "33"),
    _34("Bordj Bou Arr\u00e9ridj", "34"),
    _35("Boumerd\u00e8s", "35"),
    _36("El Tarf", "36"),
    _37("Tindouf", "37"),
    _38("Tissemsilt", "38"),
    _39("El Oued", "39"),
    _40("Khenchela", "40"),
    _41("Souk Ahras", "41"),
    _42("Tipaza", "42"),
    _43("Mila", "43"),
    _44("A\u00efn Defla", "44"),
    _45("Naama", "45"),
    _46("A\u00efn T\u00e9mouchent", "46"),
    _47("Gharda\u00efa", "47"),
    _48("Relizane", "48");
    public String name;
    public String code;

    SubDivisionDZ(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.DZ;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
