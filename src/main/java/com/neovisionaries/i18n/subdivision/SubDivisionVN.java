
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionVN
    implements CountrySubDivisionCode
{

    CT("Can Tho", "CT"),
    DN("Da Nang", "DN"),
    HN("Ha Noi", "HN"),
    HP("Hai Phong", "HP"),
    SG("Ho Chi Minh", "SG"),
    _01("Lai Chau", "01"),
    _02("Lao Cai", "02"),
    _03("Ha Giang", "03"),
    _04("Cao Bang", "04"),
    _05("Son La", "05"),
    _06("Yen Bai", "06"),
    _07("Tuyen Quang", "07"),
    _09("Lang Son", "09"),
    _13("Quang Ninh", "13"),
    _14("Hoa Binh", "14"),
    _15("Ha Tay", "15"),
    _18("Ninh Binh", "18"),
    _20("Thai Binh", "20"),
    _21("Thanh Hoa", "21"),
    _22("Nghe An", "22"),
    _23("Ha Tinh", "23"),
    _24("Quang Binh", "24"),
    _25("Quang Tri", "25"),
    _26("Thua Thien-Hue", "26"),
    _27("Quang Nam", "27"),
    _28("Kon Tum", "28"),
    _29("Quang Ngai", "29"),
    _30("Gia Lai", "30"),
    _31("Binh Dinh", "31"),
    _32("Phu Yen", "32"),
    _33("Dac Lac", "33"),
    _34("Khanh Hoa", "34"),
    _35("Lam Dong", "35"),
    _36("Ninh Thuan", "36"),
    _37("Tay Ninh", "37"),
    _39("Dong Nai", "39"),
    _40("Binh Thuan", "40"),
    _41("Long An", "41"),
    _43("Ba Ria - Vung Tau", "43"),
    _44("An Giang", "44"),
    _45("Dong Thap", "45"),
    _46("Tien Giang", "46"),
    _47("Kien Giang", "47"),
    _49("Vinh Long", "49"),
    _50("Ben Tre", "50"),
    _51("Tra Vinh", "51"),
    _52("Soc Trang", "52"),
    _53("Bac Can", "53"),
    _54("Bac Giang", "54"),
    _55("Bac Lieu", "55"),
    _56("Bac Ninh", "56"),
    _57("Binh Duong", "57"),
    _58("Binh Phuoc", "58"),
    _59("Ca Mau", "59"),
    _60("Da Nang, thanh pho", "60"),
    _61("Hai Duong", "61"),
    _62("Hai Phong, thanh pho", "62"),
    _63("Ha Nam", "63"),
    _66("Hung Yen", "66"),
    _67("Nam Dinh", "67"),
    _68("Phu Tho", "68"),
    _69("Thai Nguyen", "69"),
    _70("Vinh Yen", "70"),
    _71("Dien Bien", "71"),
    _72("Dak Nong", "72"),
    _73("Hau Giang", "73");
    public String name;
    public String code;

    SubDivisionVN(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.VN;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
