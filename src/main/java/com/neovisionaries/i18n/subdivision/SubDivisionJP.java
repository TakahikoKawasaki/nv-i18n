
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionJP
    implements CountrySubDivisionCode
{

    _01("Hokkaid\u00f4 [Hokkaido]", "01"),
    _02("Aomori", "02"),
    _03("Iwate", "03"),
    _04("Miyagi", "04"),
    _05("Akita", "05"),
    _06("Yamagata", "06"),
    _07("Hukusima [Fukushima]", "07"),
    _08("Ibaraki", "08"),
    _09("Totigi [Tochigi]", "09"),
    _10("Gunma", "10"),
    _11("Saitama", "11"),
    _12("Tiba [Chiba]", "12"),
    _13("T\u00f4ky\u00f4 [Tokyo]", "13"),
    _14("Kanagawa", "14"),
    _15("Niigata", "15"),
    _16("Toyama", "16"),
    _17("Isikawa [Ishikawa]", "17"),
    _18("Hukui [Fukui]", "18"),
    _19("Yamanasi [Yamanashi]", "19"),
    _20("Nagano", "20"),
    _21("Gihu [Gifu]", "21"),
    _22("Sizuoka [Shizuoka]", "22"),
    _23("Aiti [Aichi]", "23"),
    _24("Mie", "24"),
    _25("Siga [Shiga]", "25"),
    _26("Ky\u00f4to [Kyoto]", "26"),
    _27("\u00d4saka [Osaka]", "27"),
    _28("Hy\u00f4go [Hyogo]", "28"),
    _29("Nara", "29"),
    _30("Wakayama", "30"),
    _31("Tottori", "31"),
    _32("Simane [Shimane]", "32"),
    _33("Okayama", "33"),
    _34("Hirosima [Hiroshima]", "34"),
    _35("Yamaguti [Yamaguchi]", "35"),
    _36("Tokusima [Tokushima]", "36"),
    _37("Kagawa", "37"),
    _38("Ehime", "38"),
    _39("K\u00f4ti [Kochi]", "39"),
    _40("Hukuoka [Fukuoka]", "40"),
    _41("Saga", "41"),
    _42("Nagasaki", "42"),
    _43("Kumamoto", "43"),
    _44("\u00d4ita [Oita]", "44"),
    _45("Miyazaki", "45"),
    _46("Kagosima [Kagoshima]", "46"),
    _47("Okinawa", "47");
    public String name;
    public String code;

    SubDivisionJP(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.JP;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
