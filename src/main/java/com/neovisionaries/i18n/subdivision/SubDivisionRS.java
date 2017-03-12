
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionRS
    implements CountrySubDivisionCode
{

    KM("Kosovo-Metohija", "KM"),
    VO("Vojvodina", "VO"),
    _00("Beograd", "00"),
    _01("Severnoba\u010dki okrug", "01"),
    _02("Srednjebanatski okrug", "02"),
    _03("Severnobanatski okrug", "03"),
    _04("Ju\u017enobanatski okrug", "04"),
    _05("Zapadnoba\u010dki okrug", "05"),
    _06("Ju\u017enoba\u010dki okrug", "06"),
    _07("Sremski okrug", "07"),
    _08("Ma\u010dvanski okrug", "08"),
    _09("Kolubarski okrug", "09"),
    _10("Podunavski okrug", "10"),
    _11("Brani\u010devski okrug", "11"),
    _12("\u0160umadijski okrug", "12"),
    _13("Pomoravski okrug", "13"),
    _14("Borski okrug", "14"),
    _15("Zaje\u010darski okrug", "15"),
    _16("Zlatiborski okrug", "16"),
    _17("Moravi\u010dki okrug", "17"),
    _18("Ra\u0161ki okrug", "18"),
    _19("Rasinski okrug", "19"),
    _20("Ni\u0161avski okrug", "20"),
    _21("Topli\u010dki okrug", "21"),
    _22("Pirotski okrug", "22"),
    _23("Jablani\u010dki okrug", "23"),
    _24("P\u010dinjski okrug", "24"),
    _25("Kosovski okrug", "25"),
    _26("Pe\u0107ki okrug", "26"),
    _27("Prizrenski okrug", "27"),
    _28("Kosovsko-Mitrova\u010dki okrug", "28"),
    _29("Kosovsko-Pomoravski okrug", "29");
    public String name;
    public String code;

    SubDivisionRS(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.RS;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
