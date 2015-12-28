
package com.neovisionaries.i18n.subdivision;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CountrySubDivisionCode;

public enum SubDivisionDO
    implements CountrySubDivisionCode
{

    _01("Distrito Nacional (Santo Domingo)", "01"),
    _02("Azua", "02"),
    _03("Bahoruco", "03"),
    _04("Barahona", "04"),
    _05("Dajab\u00f3n", "05"),
    _06("Duarte", "06"),
    _07("La Estrelleta", "07"),
    _08("El Seybo", "08"),
    _09("Espaillat", "09"),
    _10("Independencia", "10"),
    _11("La Altagracia", "11"),
    _12("La Romana", "12"),
    _13("La Vega", "13"),
    _14("Mar\u00eda Trinidad S\u00e1nchez", "14"),
    _15("Monte Cristi", "15"),
    _16("Pedernales", "16"),
    _17("Peravia", "17"),
    _18("Puerto Plata", "18"),
    _19("Salcedo", "19"),
    _20("Saman\u00e1", "20"),
    _21("San Crist\u00f3bal", "21"),
    _22("San Juan", "22"),
    _23("San Pedro de Macor\u00eds", "23"),
    _24("S\u00e1nchez Ram\u00edrez", "24"),
    _25("Santiago", "25"),
    _26("Santiago Rodr\u00edguez", "26"),
    _27("Valverde", "27"),
    _28("Monse\u00f1or Nouel", "28"),
    _29("Monte Plata", "29"),
    _30("Hato Mayor", "30"),
    _31("San Jos\u00e9 de Ocoa", "31"),
    _32("Santo Domingo", "32");
    public String name;
    public String code;

    SubDivisionDO(String subDivisionName, String subDivisionCode) {
        this.name = subDivisionName;
        this.code = subDivisionCode;
    }

    public CountryCode getCountryCode() {
        return CountryCode.DO;
    }

    public String getCode() {
        return code;
    }

    public boolean isRealRegion() {
        return true;
    }

}
