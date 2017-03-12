
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionCN
    implements CountrySubDivisionCode
{

    _11("Beijing", "11"),
    _12("Tianjin", "12"),
    _13("Hebei", "13"),
    _14("Shanxi", "14"),
    _15("Nei Mongol (mn)", "15"),
    _21("Liaoning", "21"),
    _22("Jilin", "22"),
    _23("Heilongjiang", "23"),
    _31("Shanghai", "31"),
    _32("Jiangsu", "32"),
    _33("Zhejiang", "33"),
    _34("Anhui", "34"),
    _35("Fujian", "35"),
    _36("Jiangxi", "36"),
    _37("Shandong", "37"),
    _41("Henan", "41"),
    _42("Hubei", "42"),
    _43("Hunan", "43"),
    _44("Guangdong", "44"),
    _45("Guangxi", "45"),
    _46("Hainan", "46"),
    _50("Chongqing", "50"),
    _51("Sichuan", "51"),
    _52("Guizhou", "52"),
    _53("Yunnan", "53"),
    _54("Xizang", "54"),
    _61("Shaanxi", "61"),
    _62("Gansu", "62"),
    _63("Qinghai", "63"),
    _64("Ningxia", "64"),
    _65("Xinjiang", "65"),
    _71("Taiwan", "71"),
    _91("Xianggang", "91"),
    _92("Aomen", "92");
    public String name;
    public String code;

    SubDivisionCN(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.CN;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
