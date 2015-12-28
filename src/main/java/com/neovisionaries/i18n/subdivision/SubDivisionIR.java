
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionIR
    implements CountrySubDivisionCode
{

    _01("\u0100z\u0304arb\u0101yj\u0101n-e Sharq\u012b", "01"),
    _02("\u0100z\u0304arb\u0101yj\u0101n-e Gharb\u012b", "02"),
    _03("Ardab\u012bl", "03"),
    _04("E\u015ffah\u0101nn", "04"),
    _05("\u012al\u0101m", "05"),
    _06("B\u016bshehr", "06"),
    _07("Tehr\u0101n", "07"),
    _08("Chah\u0101r Ma\u1e29\u0101ll va Bakht\u012b\u0101r\u012b", "08"),
    _10("Kh\u016bzest\u0101n", "10"),
    _11("Zanj\u0101n", "11"),
    _12("Semn\u0101n", "12"),
    _13("S\u012bst\u0101n va Bal\u016bchest\u0101n", "13"),
    _14("F\u0101rs", "14"),
    _15("Kerm\u0101n", "15"),
    _16("Kordest\u0101n", "16"),
    _17("Kerm\u0101nsh\u0101h", "17"),
    _18("Kohg\u012bl\u016byeh va B\u016byer A\u1e29mad", "18"),
    _19("G\u012bl\u0101n", "19"),
    _20("Lorest\u0101n", "20"),
    _21("M\u0101zandar\u0101n", "21"),
    _22("Markaz\u012b", "22"),
    _23("Hormozg\u0101n", "23"),
    _24("Hamad\u0101n", "24"),
    _25("Yazd", "25"),
    _26("Qom", "26"),
    _27("Golest\u0101n", "27"),
    _28("Qazv\u012bn", "28"),
    _29("Khor\u0101s\u0101n-e Jan\u016bb\u012b", "29"),
    _30("Khor\u0101s\u0101n-e Razav\u012b", "30"),
    _31("Khor\u0101s\u0101n-e Shem\u0101l\u012b", "31");
    public String name;
    public String code;

    SubDivisionIR(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.IR;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
