
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionBD
    implements CountrySubDivisionCode
{

    _01("Bandarban", "01"),
    _02("Barguna", "02"),
    _03("Bogra", "03"),
    _04("Brahmanbaria", "04"),
    _05("Bagerhat", "05"),
    _06("Barisal", "06"),
    _07("Bhola", "07"),
    _08("Comilla", "08"),
    _09("Chandpur", "09"),
    _10("Chittagong", "10"),
    _11("Cox's Bazar", "11"),
    _12("Chuadanga", "12"),
    _13("Dhaka", "13"),
    _14("Dinajpur", "14"),
    _15("Faridpur", "15"),
    _16("Feni", "16"),
    _17("Gopalganj", "17"),
    _18("Gazipur", "18"),
    _19("Gaibandha", "19"),
    _20("Habiganj", "20"),
    _21("Jamalpur", "21"),
    _22("Jessore", "22"),
    _23("Jhenaidah", "23"),
    _24("Jaipurhat", "24"),
    _25("Jhalakati", "25"),
    _26("Kishoreganj", "26"),
    _27("Khulna", "27"),
    _28("Kurigram", "28"),
    _29("Khagrachari", "29"),
    _30("Kushtia", "30"),
    _31("Lakshmipur", "31"),
    _32("Lalmonirhat", "32"),
    _33("Manikganj", "33"),
    _34("Mymensingh", "34"),
    _35("Munshiganj", "35"),
    _36("Madaripur", "36"),
    _37("Magura", "37"),
    _38("Moulvibazar", "38"),
    _39("Meherpur", "39"),
    _40("Narayanganj", "40"),
    _41("Netrakona", "41"),
    _42("Narsingdi", "42"),
    _43("Narail", "43"),
    _44("Natore", "44"),
    _45("Nawabganj", "45"),
    _46("Nilphamari", "46"),
    _47("Noakhali", "47"),
    _48("Naogaon", "48"),
    _49("Pabna", "49"),
    _50("Pirojpur", "50"),
    _51("Patuakhali", "51"),
    _52("Panchagarh", "52"),
    _53("Rajbari", "53"),
    _54("Rajshahi", "54"),
    _55("Rangpur", "55"),
    _56("Rangamati", "56"),
    _57("Sherpur", "57"),
    _58("Satkhira", "58"),
    _59("Sirajganj", "59"),
    _60("Sylhet", "60"),
    _61("Sunamganj", "61"),
    _62("Shariatpur", "62"),
    _63("Tangail", "63"),
    _64("Thakurgaon", "64");
    public String name;
    public String code;

    SubDivisionBD(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.BD;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
