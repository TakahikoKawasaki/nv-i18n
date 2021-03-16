/*
 * Copyright (C) 2014-2019 Neo Visionaries Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.neovisionaries.i18n;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Currency;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;


/**
 * Currency code (ISO 4217).
 *
 * <p>
 * The initial entries in this enum was created based on
 * <a href="http://www.currency-iso.org/en/home/tables/table-a1.html"
 * >the official currency &amp; funds code list</a> (ISO 4217) of
 * January 1, 2014.
 * </p>
 *
 * @since 1.9
 *
 * @see <a href="http://www.currency-iso.org/en/home/tables/table-a1.html"
 *      >The official currency &amp; funds code list</a>
 *
 * @see <a href="http://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a>
 *
 * @author Takahiko Kawasaki
 */
public enum CurrencyCode
{
    /**
     * Undefined.
     *
     * <p>
     * This is not an official ISO 4217 code.
     * </p>
     *
     * @since 1.14
     * @see #XXX XXX: 999 No currency
     */
    UNDEFINED("Undefined", -1, -1),

    /**
     * <a href="http://en.wikipedia.org/wiki/United_Arab_Emirates_dirham">UAE Dirham</a>
     * [numeric code = 784, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#AE AE}: UNITED ARAB EMIRATES
     * </ul>
     */
    AED("UAE Dirham", 784, 2, CountryCode.AE),

    /**
     * <a href="http://en.wikipedia.org/wiki/Afghan_afghani">Afghani</a>
     * [numeric code = 971, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#AF AF}: AFGHANISTAN
     * </ul>
     */
    AFN("Afghani", 971, 2, CountryCode.AF),

    /**
     * <a href="http://en.wikipedia.org/wiki/Albanian_lek">Lek</a>
     * [numeric code = 8, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#AL AL}: ALBANIA
     * </ul>
     */
    ALL("Lek", 8, 2, CountryCode.AL),

    /**
     * <a href="http://en.wikipedia.org/wiki/Armenian_dram">Armenian Dram</a>
     * [numeric code = 51, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#AM AM}: ARMENIA
     * </ul>
     */
    AMD("Armenian Dram", 51, 2, CountryCode.AM),

    /**
     * <a href="http://en.wikipedia.org/wiki/Netherlands_Antillean_guilder"
     * >Netherlands Antillean Guilder</a>
     * [numeric code = 532, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#CW CW}: CURA&Ccedil;AO
     * <li>{@link CountryCode#SX SX}: SINT MAARTEN (DUTCH PART)
     * </ul>
     */
    ANG("Netherlands Antillean Guilder", 532, 2, CountryCode.CW, CountryCode.SX),

    /**
     * <a href="http://en.wikipedia.org/wiki/Angolan_kwanza">Kwanza</a>
     * [numeric code = 973, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#AO AO}: ANGOLA
     * </ul>
     */
    AOA("Kwanza", 973, 2, CountryCode.AO),

    /**
     * <a href="http://en.wikipedia.org/wiki/Argentine_peso">Argentine Peso</a>
     * [numeric code = 32, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#AR AR}: ARGENTINA
     * </ul>
     */
    ARS("Argentine Peso", 32, 2, CountryCode.AR),

    /**
     * <a href="http://en.wikipedia.org/wiki/Australian_dollar">Australian Dollar</a>
     * [numeric code = 36, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#AU AU}: AUSTRALIA
     * <li>{@link CountryCode#CC CC}: COCOS (KEELING) ISLANDS
     * <li>{@link CountryCode#CX CX}: CHRISTMAS ISLAND
     * <li>{@link CountryCode#HM HM}: HEARD ISLAND AND McDONALD ISLANDS
     * <li>{@link CountryCode#KI KI}: KIRIBATI
     * <li>{@link CountryCode#NF NF}: NORFOLK ISLAND
     * <li>{@link CountryCode#NR NR}: NAURU
     * <li>{@link CountryCode#TV TV}: TUVALU
     * </ul>
     */
    AUD("Australian Dollar", 36, 2,
        CountryCode.AU, CountryCode.CC, CountryCode.CX, CountryCode.HM,
        CountryCode.KI, CountryCode.NF, CountryCode.NR, CountryCode.TV),

    /**
     * <a href="http://en.wikipedia.org/wiki/Aruban_florin">Aruban Florin</a>
     * [numeric code = 533, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#AW AW}: ARUBA
     * </ul>
     */
    AWG("Aruban Florin", 533, 2, CountryCode.AW),

    /**
     * <a href="http://en.wikipedia.org/wiki/Azerbaijani_manat">Azerbaijanian Manat</a>
     * [numeric code = 944, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#AZ AZ}: AZERBAIJAN
     * </ul>
     */
    AZN("Azerbaijanian Manat", 944, 2, CountryCode.AZ),

    /**
     * <a href="http://en.wikipedia.org/wiki/Bosnia_and_Herzegovina_convertible_mark"
     * >Convertible Mark</a>
     * [numeric code = 977, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#BA BA}: BOSNIA AND HERZEGOVINA
     * </ul>
     */
    BAM("Convertible Mark", 977, 2, CountryCode.BA),

    /**
     * <a href="http://en.wikipedia.org/wiki/Barbados_dollar">Barbados Dollar</a>
     * [numeric code = 52, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#BB BB}: BARBADOS
     * </ul>
     */
    BBD("Barbados Dollar", 52, 2, CountryCode.BB),

    /**
     * <a href="http://en.wikipedia.org/wiki/Bangladeshi_taka">Taka</a>
     * [numeric code = 50, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#BD BD}: BANGLADESH
     * </ul>
     */
    BDT("Taka", 50, 2, CountryCode.BD),

    /**
     * <a href="http://en.wikipedia.org/wiki/Bulgarian_lev">Bulgarian Lev</a>
     * [numeric code = 975, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#BG BG}: BULGARIA
     * </ul>
     */
    BGN("Bulgarian Lev", 975, 2, CountryCode.BG),

    /**
     * <a href="http://en.wikipedia.org/wiki/Bahraini_dinar">Bahraini Dinar</a>
     * [numeric code = 48, minor unit = 3]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#BH BH}: BAHRAIN
     * </ul>
     */
    BHD("Bahraini Dinar", 48, 3, CountryCode.BH),

    /**
     * <a href="http://en.wikipedia.org/wiki/Burundian_franc">Burundi Franc</a>
     * [numeric code = 108, minor unit = 0]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#BI BI}: BURUNDI
     * </ul>
     */
    BIF("Burundi Franc", 108, 0, CountryCode.BI),

    /**
     * <a href="http://en.wikipedia.org/wiki/Bermudian_dollar">Bermudian Dollar</a>
     * [numeric code = 60, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#BM BM}: BERMUDA
     * </ul>
     */
    BMD("Bermudian Dollar", 60, 2, CountryCode.BM),

    /**
     * <a href="http://en.wikipedia.org/wiki/Brunei_dollar">Brunei Dollar</a>
     * [numeric code = 96, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#BN BN}: BRUNEI DARUSSALAM
     * </ul>
     */
    BND("Brunei Dollar", 96, 2, CountryCode.BN),

    /**
     * <a href="http://en.wikipedia.org/wiki/Boliviano">Boliviano</a>
     * [numeric code = 68, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#BO BO}: BOLIVIA, PLURINATIONAL STATE OF
     * </ul>
     */
    BOB("Boliviano", 68, 2, CountryCode.BO),

    /**
     * Mvdol
     * [numeric code = 984, minor unit = 2, fund]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#BO BO}: BOLIVIA, PLURINATIONAL STATE OF
     * </ul>
     */
    BOV("Mvdol", 984, 2, CountryCode.BO)
    {
        @Override
        public boolean isFund()
        {
            return true;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Brazilian_real">Brazilian Real</a>
     * [numeric code = 986, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#BR BR}: BRAZIL
     * </ul>
     */
    BRL("Brazilian Real", 986, 2, CountryCode.BR),

    /**
     * <a href="http://en.wikipedia.org/wiki/Bahamian_dollar">Bahamian Dollar</a>
     * [numeric code = 44, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#BS BS}: BAHAMAS
     * </ul>
     */
    BSD("Bahamian Dollar", 44, 2, CountryCode.BS),

    /**
     * <a href="http://en.wikipedia.org/wiki/Bhutanese_ngultrum">Ngultrum</a>
     * [numeric code = 64, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#BT BT}: BHUTAN
     * </ul>
     */
    BTN("Ngultrum", 64, 2, CountryCode.BT),

    /**
     * <a href="http://en.wikipedia.org/wiki/Botswana_pula">Pula</a>
     * [numeric code = 72, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#BW BW}: BOTSWANA
     * </ul>
     */
    BWP("Pula", 72, 2, CountryCode.BW),

    /**
     * <a href="http://en.wikipedia.org/wiki/Belarusian_ruble">Belarusian Ruble</a>
     * [numeric code = 933, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#BY BY}: BELARUS
     * </ul>
     *
     * <p>
     * This currency code was added by <a href=
     * "http://www.currency-iso.org/dam/isocy/downloads/dl_currency_iso_amendment_161.pdf"
     * >ISO 4217 AMENDMENT NUMBER 161</a> (18 December 2015). Effective from 1 July 2016.
     * </p>
     *
     * @see <a href="http://www.currency-iso.org/dam/isocy/downloads/dl_currency_iso_amendment_161.pdf"
     *      >ISO 4217 AMENDMENT NUMBER 161</a>
     *
     * @see #BYR
     *
     * @since 1.19
     */
    BYN("Belarusian Ruble", 933, 2, CountryCode.BY),

    /**
     * <a href="http://en.wikipedia.org/wiki/Belarusian_ruble">Belarusian Ruble</a>
     * [numeric code = 974, minor unit = 0]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#BY BY}: BELARUS
     * </ul>
     *
     * @see #BYN
     *
     * @deprecated
     */
    BYR("Belarusian Ruble", 974, 0, CountryCode.BY),

    /**
     * <a href="http://en.wikipedia.org/wiki/Belize_dollar">Belize Dollar</a>
     * [numeric code = 84, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#BZ BZ}: BELIZE
     * </ul>
     */
    BZD("Belize Dollar", 84, 2, CountryCode.BZ),

    /**
     * <a href="http://en.wikipedia.org/wiki/Canadian_dollar">Canadian Dollar</a>
     * [numeric code = 124, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#CA CA}: CANADA
     * </ul>
     */
    CAD("Canadian Dollar", 124, 2, CountryCode.CA),

    /**
     * <a href="http://en.wikipedia.org/wiki/Congolese_franc">Congolese Franc</a>
     * [numeric code = 976, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#CD CD}: CONGO, THE DEMOCRATIC REPUBLIC OF
     * </ul>
     */
    CDF("Congolese Franc", 976, 2, CountryCode.CD),

    /**
     * WIR Euro
     * [numeric code = 947, minor unit = 2, fund]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#CH CH}: SWITZERLAND
     * </ul>
     */
    CHE("WIR Euro", 947, 2, CountryCode.CH)
    {
        @Override
        public boolean isFund()
        {
            return true;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Swiss_franc">Swiss Franc</a>
     * [numeric code = 756, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#CH CH}: SWITZERLAND
     * <li>{@link CountryCode#LI LI}: LIECHTENSTEIN
     * </ul>
     */
    CHF("Swiss Franc", 756, 2, CountryCode.CH, CountryCode.LI),

    /**
     * WIR Franc
     * [numeric code = 948, minor unit = 2, fund]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#CH CH}: SWITZERLAND
     * </ul>
     */
    CHW("WIR Franc", 948, 2, CountryCode.CH)
    {
        @Override
        public boolean isFund()
        {
            return true;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Unidad_de_Fomento">Unidad de Fomento</a>
     * [numeric code = 990, minor unit = 0, fund]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#CL CL}: CHILE
     * </ul>
     */
    CLF("Unidad de Fomento", 990, 0, CountryCode.CL)
    {
        @Override
        public boolean isFund()
        {
            return true;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Chilean_peso">Chilean Peso</a>
     * [numeric code = 152, minor unit = 0]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#CL CL}: CHILE
     * </ul>
     */
    CLP("Chilean Peso", 152, 0, CountryCode.CL),

    /**
     * <a href="http://en.wikipedia.org/wiki/Renminbi">Yuan Renminbi</a>
     * [numeric code = 156, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#CN CN}: CHINA
     * </ul>
     */
    CNY("Yuan Renminbi", 156, 2, CountryCode.CN),

    /**
     * <a href="http://en.wikipedia.org/wiki/Colombian_peso">Colombian Peso</a>
     * [numeric code = 170, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#CO CO}: COLOMBIA
     * </ul>
     */
    COP("Colombian Peso", 170, 2, CountryCode.CO),

    /**
     * <a href="http://en.wikipedia.org/wiki/Unidad_de_Valor_Real">Unidad de Valor Real</a>
     * [numeric code = 970, minor unit = 2, fund]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#CO CO}: COLOMBIA
     * </ul>
     */
    COU("Unidad de Valor Real", 970, 2, CountryCode.CO)
    {
        @Override
        public boolean isFund()
        {
            return true;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Costa_Rican_colon">Costa Rican Colon</a>
     * [numeric code = 188, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#CR CR}: COSTA RICA
     * </ul>
     */
    CRC("Costa Rican Colon", 188, 2, CountryCode.CR),

    /**
     * <a href="http://en.wikipedia.org/wiki/Cuban_convertible_peso">Peso Convertible</a>
     * [numeric code = 931, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#CU CU}: CUBA
     * </ul>
     */
    CUC("Peso Convertible", 931, 2, CountryCode.CU),

    /**
     * <a href="http://en.wikipedia.org/wiki/Cuban_peso">Cuban Peso</a>
     * [numeric code = 192, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#CU CU}: CUBA
     * </ul>
     */
    CUP("Cuban Peso", 192, 2, CountryCode.CU),

    /**
     * <a href="http://en.wikipedia.org/wiki/Cape_Verde_escudo">Cape Verde Escudo</a>
     * [numeric code = 132, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#CV CV}: CAPE VERDE
     * </ul>
     */
    CVE("Cape Verde Escudo", 132, 2, CountryCode.CV),

    /**
     * <a href="http://en.wikipedia.org/wiki/Czech_koruna">Czech Koruna</a>
     * [numeric code = 203, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#CZ CZ}: CZECH REPUBLIC
     * </ul>
     */
    CZK("Czech Koruna", 203, 2, CountryCode.CZ),

    /**
     * <a href="http://en.wikipedia.org/wiki/Djiboutian_franc">Djibouti Franc</a>
     * [numeric code = 262, minor unit = 0]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#DJ DJ}: DJIBOUTI
     * </ul>
     */
    DJF("Djibouti Franc", 262, 0, CountryCode.DJ),

    /**
     * <a href="http://en.wikipedia.org/wiki/Danish_krone">Danish Krone</a>
     * [numeric code = 208, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#DK DK}: DENMARK
     * <li>{@link CountryCode#FO FO}: FAROE ISLANDS
     * <li>{@link CountryCode#GL GL}: GREENLAND
     * </ul>
     */
    DKK("Danish Krone", 208, 2, CountryCode.DK, CountryCode.FO, CountryCode.GL),

    /**
     * <a href="http://en.wikipedia.org/wiki/Dominican_peso">Dominican Peso</a>
     * [numeric code = 214, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#DO DO}: DOMINICAN REPUBLIC
     * </ul>
     */
    DOP("Dominican Peso", 214, 2, CountryCode.DO),

    /**
     * <a href="http://en.wikipedia.org/wiki/Algerian_dinar">Algerian Dinar</a>
     * [numeric code = 12, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#DZ DZ}: ALGERIA
     * </ul>
     */
    DZD("Algerian Dinar", 12, 2, CountryCode.DZ),

    /**
     * <a href="http://en.wikipedia.org/wiki/Egyptian_pound">Egyptian Pound</a>
     * [numeric code = 818, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#EG EG}: EGYPT
     * </ul>
     */
    EGP("Egyptian Pound", 818, 2, CountryCode.EG),

    /**
     * <a href="http://en.wikipedia.org/wiki/Eritrean_nakfa">Nakfa</a>
     * [numeric code = 232, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#ER ER}: ERITREA
     * </ul>
     */
    ERN("Nakfa", 232, 2, CountryCode.ER),

    /**
     * <a href="http://en.wikipedia.org/wiki/Ethiopian_birr">Ethiopian Birr</a>
     * [numeric code = 230, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#ET ET}: ETHIOPIA
     * </ul>
     */
    ETB("Ethiopian Birr", 230, 2, CountryCode.ET),

    /**
     * <a href="http://en.wikipedia.org/wiki/Euro">Euro</a>
     * [numeric code = 978, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#AD AD}: ANDORRA
     * <li>{@link CountryCode#AT AT}: AUSTRIA
     * <li>{@link CountryCode#AX AX}: &Aring;LAND ISLANDS
     * <li>{@link CountryCode#BE BE}: BELGIUM
     * <li>{@link CountryCode#BL BL}: SAINT BARTH&Eacute;LEMY
     * <li>{@link CountryCode#CY CY}: CYPRUS
     * <li>{@link CountryCode#DE DE}: GERMANY
     * <li>{@link CountryCode#EE EE}: ESTONIA
     * <li>{@link CountryCode#ES ES}: SPAIN
     * <li>{@link CountryCode#EU EU}: EUROPEAN UNION
     * <li>{@link CountryCode#FI FI}: FINLAND
     * <li>{@link CountryCode#FR FR}: FRANCE
     * <li>{@link CountryCode#GF GF}: FRENCH GUIANA
     * <li>{@link CountryCode#GP GP}: GUADELOUPE
     * <li>{@link CountryCode#GR GR}: GREECE
     * <li>{@link CountryCode#IE IE}: IRELAND
     * <li>{@link CountryCode#IT IT}: ITALY
     * <li>{@link CountryCode#LT LT}: LITHUANIA
     * <li>{@link CountryCode#LU LU}: LUXEMBOURG
     * <li>{@link CountryCode#LV LV}: LATVIA
     * <li>{@link CountryCode#MC MC}: MONACO
     * <li>{@link CountryCode#ME ME}: MONTENEGRO
     * <li>{@link CountryCode#MF MF}: SAINT MARTIN (FRENCH PART)
     * <li>{@link CountryCode#MQ MQ}: MARTINIQUE
     * <li>{@link CountryCode#MT MT}: MALTA
     * <li>{@link CountryCode#NL NL}: NETHERLANDS
     * <li>{@link CountryCode#PM PM}: SAINT PIERRE AND MIQUELON
     * <li>{@link CountryCode#PT PT}: PORTUGAL
     * <li>{@link CountryCode#RE RE}: R&Eacute;UNION
     * <li>{@link CountryCode#SI SI}: SLOVENIA
     * <li>{@link CountryCode#SK SK}: SLOVAKIA
     * <li>{@link CountryCode#SM SM}: SAN MARINO
     * <li>{@link CountryCode#TF TF}: FRENCH SOUTHERN TERRITORIES
     * <li>{@link CountryCode#VA VA}: HOLY SEE (VATICAN CITY STATE)
     * <li>{@link CountryCode#XK XK}: KOSOVO, REPUBLIC OF
     * <li>{@link CountryCode#YT YT}: MAYOTTE
     * </ul>
     */
    EUR("Euro", 978, 2,
        CountryCode.AD, CountryCode.AT, CountryCode.AX, CountryCode.BE,
        CountryCode.BL, CountryCode.CY, CountryCode.DE, CountryCode.EE,
        CountryCode.ES, CountryCode.EU, CountryCode.FI, CountryCode.FR,
        CountryCode.GF, CountryCode.GP, CountryCode.GR, CountryCode.IE,
        CountryCode.IT, CountryCode.LT, CountryCode.LU, CountryCode.LV,
        CountryCode.MC, CountryCode.ME, CountryCode.MF, CountryCode.MQ,
        CountryCode.MT, CountryCode.NL, CountryCode.PM, CountryCode.PT,
        CountryCode.RE, CountryCode.SI, CountryCode.SK, CountryCode.SM,
        CountryCode.TF, CountryCode.VA, CountryCode.XK, CountryCode.YT),

    /**
     * <a href="http://en.wikipedia.org/wiki/Fiji_dollar">Fiji Dollar</a>
     * [numeric code = 242, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#FJ FJ}: FIJI
     * </ul>
     */
    FJD("Fiji Dollar", 242, 2, CountryCode.FJ),

    /**
     * <a href="http://en.wikipedia.org/wiki/Falkland_Islands_pound">Falkland Islands Pound</a>
     * [numeric code = 238, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#FK FK}: FALKLAND ISLANDS (MALVINAS)
     * </ul>
     */
    FKP("Falkland Islands Pound", 238, 2, CountryCode.FK),

    /**
     * <a href="http://en.wikipedia.org/wiki/Pound_sterling">Pound Sterling</a>
     * [numeric code = 826, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#GB GB}: UNITED KINGDOM
     * <li>{@link CountryCode#GG GG}: GUERNSEY
     * <li>{@link CountryCode#IM IM}: ISLE OF MAN
     * <li>{@link CountryCode#JE JE}: JERSEY
     * </ul>
     */
    GBP("Pound Sterling", 826, 2,
        CountryCode.GB, CountryCode.GG, CountryCode.IM, CountryCode.JE),

    /**
     * <a href="http://en.wikipedia.org/wiki/Georgian_lari">Lari</a>
     * [numeric code = 981, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#GE GE}: GEORGIA
     * </ul>
     */
    GEL("Lari", 981, 2, CountryCode.GE),

    /**
     * <a href="http://en.wikipedia.org/wiki/Ghanaian_cedi">Ghana Cedi</a>
     * [numeric code = 936, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#GH GH}: GHANA
     * </ul>
     */
    GHS("Ghana Cedi", 936, 2, CountryCode.GH),

    /**
     * <a href="http://en.wikipedia.org/wiki/Gibraltar_pound">Gibraltar Pound</a>
     * [numeric code = 292, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#GI GI}: GIBRALTAR
     * </ul>
     */
    GIP("Gibraltar Pound", 292, 2, CountryCode.GI),

    /**
     * <a href="http://en.wikipedia.org/wiki/Gambian_dalasi">Dalasi</a>
     * [numeric code = 270, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#GM GM}: GAMBIA
     * </ul>
     */
    GMD("Dalasi", 270, 2, CountryCode.GM),

    /**
     * <a href="http://en.wikipedia.org/wiki/Guinean_franc">Guinea Franc</a>
     * [numeric code = 324, minor unit = 0]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#GN GN}: GUINEA
     * </ul>
     */
    GNF("Guinea Franc", 324, 0, CountryCode.GN),

    /**
     * <a href="http://en.wikipedia.org/wiki/Guatemalan_quetzal">Quetzal</a>
     * [numeric code = 320, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#GT GT}: GUATEMALA
     * </ul>
     */
    GTQ("Quetzal", 320, 2, CountryCode.GT),

    /**
     * <a href="http://en.wikipedia.org/wiki/Guyanese_dollar">Guyana Dollar</a>
     * [numeric code = 328, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#GY GY}: GUYANA
     * </ul>
     */
    GYD("Guyana Dollar", 328, 2, CountryCode.GY),

    /**
     * <a href="http://en.wikipedia.org/wiki/Hong_Kong_dollar">Hong Kong Dollar</a>
     * [numeric code = 344, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#HK HK}: HONG KONG
     * </ul>
     */
    HKD("Hong Kong Dollar", 344, 2, CountryCode.HK),

    /**
     * <a href="http://en.wikipedia.org/wiki/Honduran_lempira">Lempira</a>
     * [numeric code = 340, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#HN HN}: HONDURAS
     * </ul>
     */
    HNL("Lempira", 340, 2, CountryCode.HN),

    /**
     * <a href="http://en.wikipedia.org/wiki/Croatian_kuna">Croatian Kuna</a>
     * [numeric code = 191, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#HR HR}: CROATIA
     * </ul>
     */
    HRK("Croatian Kuna", 191, 2, CountryCode.HR),

    /**
     * <a href="http://en.wikipedia.org/wiki/Haitian_gourde">Gourde</a>
     * [numeric code = 332, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#HT HT}: HAITI
     * </ul>
     */
    HTG("Gourde", 332, 2, CountryCode.HT),

    /**
     * <a href="http://en.wikipedia.org/wiki/Hungarian_forint">Forint</a>
     * [numeric code = 348, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#HU HU}: HUNGARY
     * </ul>
     */
    HUF("Forint", 348, 2, CountryCode.HU),

    /**
     * <a href="http://en.wikipedia.org/wiki/Indonesian_rupiah">Rupiah</a>
     * [numeric code = 360, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#ID ID}: INDONESIA
     * </ul>
     */
    IDR("Rupiah", 360, 2, CountryCode.ID),

    /**
     * <a href="http://en.wikipedia.org/wiki/Israeli_new_shekel">New Israeli Sheqel</a>
     * [numeric code = 376, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#IL IL}: ISRAEL
     * </ul>
     */
    ILS("New Israeli Sheqel", 376, 2, CountryCode.IL),

    /**
     * <a href="http://en.wikipedia.org/wiki/Indian_rupee">Indian Rupee</a>
     * [numeric code = 356, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#BT BT}: BHUTAN
     * <li>{@link CountryCode#IN IN}: INDIA
     * </ul>
     */
    INR("Indian Rupee", 356, 2, CountryCode.BT, CountryCode.IN),

    /**
     * <a href="http://en.wikipedia.org/wiki/Iraqi_dinar">Iraqi Dinar</a>
     * [numeric code = 368, minor unit = 3]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#IQ IQ}: IRAQ
     * </ul>
     */
    IQD("Iraqi Dinar", 368, 3, CountryCode.IQ),

    /**
     * <a href="http://en.wikipedia.org/wiki/Iranian_rial">Iranian Rial</a>
     * [numeric code = 364, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#IR IR}: IRAN, ISLAMIC REPUBLIC OF
     * </ul>
     */
    IRR("Iranian Rial", 364, 2, CountryCode.IR),

    /**
     * <a href="http://en.wikipedia.org/wiki/Icelandic_kr%C3%B3na">Iceland Krona</a>
     * [numeric code = 352, minor unit = 0]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#IS IS}: ICELAND
     * </ul>
     */
    ISK("Iceland Krona", 352, 0, CountryCode.IS),

    /**
     * <a href="http://en.wikipedia.org/wiki/Jamaican_dollar">Jamaican Dollar</a>
     * [numeric code = 388, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#JM JM}: JAMAICA
     * </ul>
     */
    JMD("Jamaican Dollar", 388, 2, CountryCode.JM),

    /**
     * <a href="http://en.wikipedia.org/wiki/Jordanian_dinar">Jordanian Dinar</a>
     * [numeric code = 400, minor unit = 3]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#JO JO}: JORDAN
     * </ul>
     */
    JOD("Jordanian Dinar", 400, 3, CountryCode.JO),

    /**
     * <a href="http://en.wikipedia.org/wiki/Japanese_yen">Yen</a>
     * [numeric code = 392, minor unit = 0]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#JP JP}: JAPAN
     * </ul>
     */
    JPY("Yen", 392, 0, CountryCode.JP),

    /**
     * <a href="http://en.wikipedia.org/wiki/Kenyan_shilling">Kenyan Shilling</a>
     * [numeric code = 404, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#KE KE}: KENYA
     * </ul>
     */
    KES("Kenyan Shilling", 404, 2, CountryCode.KE),

    /**
     * <a href="http://en.wikipedia.org/wiki/Kyrgyzstani_som">Som</a>
     * [numeric code = 417, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#KG KG}: KYRGYZSTAN
     * </ul>
     */
    KGS("Som", 417, 2, CountryCode.KG),

    /**
     * <a href="http://en.wikipedia.org/wiki/Cambodian_riel">Riel</a>
     * [numeric code = 116, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#KH KH}: CAMBODIA
     * </ul>
     */
    KHR("Riel", 116, 2, CountryCode.KH),

    /**
     * <a href="http://en.wikipedia.org/wiki/Comoro_franc">Comoro Franc</a>
     * [numeric code = 174, minor unit = 0]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#KM KM}: COMOROS
     * </ul>
     */
    KMF("Comoro Franc", 174, 0, CountryCode.KM),

    /**
     * <a href="http://en.wikipedia.org/wiki/North_Korean_won">North Korean Won</a>
     * [numeric code = 408, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#KP KP}: KOREA, DEMOCRATIC PEOPLE'S REPUBLIC OF
     * </ul>
     */
    KPW("North Korean Won", 408, 2, CountryCode.KP),

    /**
     * <a href="http://en.wikipedia.org/wiki/South_Korean_won">Won</a>
     * [numeric code = 410, minor unit = 0]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#KR KR}: KOREA, REPUBLIC OF
     * </ul>
     */
    KRW("Won", 410, 0, CountryCode.KR),

    /**
     * <a href="http://en.wikipedia.org/wiki/Kuwaiti_dinar">Kuwaiti Dinar</a>
     * [numeric code = 414, minor unit = 3]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#KW KW}: KUWAIT
     * </ul>
     */
    KWD("Kuwaiti Dinar", 414, 3, CountryCode.KW),

    /**
     * <a href="http://en.wikipedia.org/wiki/Cayman_Islands_dollar">Cayman Islands Dollar</a>
     * [numeric code = 136, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#KY KY}: CAYMAN ISLANDS
     * </ul>
     */
    KYD("Cayman Islands Dollar", 136, 2, CountryCode.KY),

    /**
     * <a href="http://en.wikipedia.org/wiki/Kazakhstani_tenge">Tenge</a>
     * [numeric code = 398, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#KZ KZ}: KAZAKHSTAN
     * </ul>
     */
    KZT("Tenge", 398, 2, CountryCode.KZ),

    /**
     * <a href="http://en.wikipedia.org/wiki/Lao_kip">Kip</a>
     * [numeric code = 418, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#LA LA}: LAO PEOPLE'S DEMOCRATIC REPUBLIC
     * </ul>
     */
    LAK("Kip", 418, 2, CountryCode.LA),

    /**
     * <a href="http://en.wikipedia.org/wiki/Lebanese_pound">Lebanese Pound</a>
     * [numeric code = 422, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#LB LB}: LEBANON
     * </ul>
     */
    LBP("Lebanese Pound", 422, 2, CountryCode.LB),

    /**
     * <a href="http://en.wikipedia.org/wiki/Sri_Lankan_rupee">Sri Lanka Rupee</a>
     * [numeric code = 144, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#LK LK}: SRI LANKA
     * </ul>
     */
    LKR("Sri Lanka Rupee", 144, 2, CountryCode.LK),

    /**
     * <a href="http://en.wikipedia.org/wiki/Liberian_dollar">Liberian Dollar</a>
     * [numeric code = 430, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#LR LR}: LIBERIA
     * </ul>
     */
    LRD("Liberian Dollar", 430, 2, CountryCode.LR),

    /**
     * <a href="http://en.wikipedia.org/wiki/Lesotho_loti">Loti</a>
     * [numeric code = 426, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#LS LS}: LESOTHO
     * </ul>
     */
    LSL("Loti", 426, 2, CountryCode.LS),

    /**
     * <a href="http://en.wikipedia.org/wiki/Lithuanian_litas">Lithuanian Litas</a>
     * [numeric code = 440, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#LT LT}: LITHUANIA
     * </ul>
     *
     * @deprecated
     */
    LTL("Lithuanian Litas", 440, 2, CountryCode.LT),

    /**
     * <a href="http://en.wikipedia.org/wiki/Libyan_dinar">Libyan Dinar</a>
     * [numeric code = 434, minor unit = 3]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#LY LY}: LIBYA
     * </ul>
     */
    LYD("Libyan Dinar", 434, 3, CountryCode.LY),

    /**
     * <a href="http://en.wikipedia.org/wiki/Moroccan_dirham">Moroccan Dirham</a>
     * [numeric code = 504, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#EH EH}: WESTERN SAHARA
     * <li>{@link CountryCode#MA MA}: MOROCCO
     * </ul>
     */
    MAD("Moroccan Dirham", 504, 2, CountryCode.EH, CountryCode.MA),

    /**
     * <a href="http://en.wikipedia.org/wiki/Moldovan_leu">Moldovan Leu</a>
     * [numeric code = 498, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#MD MD}: MOLDOVA, REPUBLIC OF
     * </ul>
     */
    MDL("Moldovan Leu", 498, 2, CountryCode.MD),

    /**
     * <a href="http://en.wikipedia.org/wiki/Malagasy_ariary">Malagasy Ariary</a>
     * [numeric code = 969, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#MG MG}: MADAGASCAR
     * </ul>
     */
    MGA("Malagasy Ariary", 969, 2, CountryCode.MG),

    /**
     * <a href="http://en.wikipedia.org/wiki/Macedonian_denar">Denar</a>
     * [numeric code = 807, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#MK MK}: NORTH MACEDONIA, REPUBLIC OF
     * </ul>
     */
    MKD("Denar", 807, 2, CountryCode.MK),

    /**
     * <a href="http://en.wikipedia.org/wiki/Myanma_kyat">Kyat</a>
     * [numeric code = 104, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#MM MM}: MYANMAR
     * </ul>
     */
    MMK("Kyat", 104, 2, CountryCode.MM),

    /**
     * <a href="http://en.wikipedia.org/wiki/Mongolian_t%C3%B6gr%C3%B6g">Tugrik</a>
     * [numeric code = 496, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#MN MN}: MONGOLIA
     * </ul>
     */
    MNT("Tugrik", 496, 2, CountryCode.MN),

    /**
     * <a href="http://en.wikipedia.org/wiki/Macanese_pataca">Pataca</a>
     * [numeric code = 446, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#MO MO}: MACAO
     * </ul>
     */
    MOP("Pataca", 446, 2, CountryCode.MO),

    /**
     * <a href="http://en.wikipedia.org/wiki/Mauritanian_ouguiya">Ouguiya</a>
     * [numeric code = 478, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#MR MR}: MAURITANIA
     * </ul>
     *
     * @see #MRU
     *
     * @deprecated
     */
    MRO("Ouguiya", 478, 2, CountryCode.MR),

    /**
     * <a href="http://en.wikipedia.org/wiki/Mauritanian_ouguiya">Ouguiya</a>
     * [numeric code = 929, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#MR MR}: MAURITANIA
     * </ul>
     *
     * <p>
     * Excerpted from <a href=
     * "https://www.currency-iso.org/dam/isocy/downloads/dl_currency_iso_amendment_165.pdf"
     * >ISO 4217 AMENDMENT NUMBER 165</a>:
     * </p>
     *
     * <blockquote>
     * <p><i>
     * The Central Bank of Mauritania is carrying out a re-denomination of
     * their local currency, with the entry into circulation of the OUGUIYA.
     * The conversion rate is 10 (old) Ouguiya to 1 (new) Ouguiya (10:1).
     * </i></p>
     *
     * <p><i>
     * From 1 January 2018 to 30 June 2018, the old and new denominations run concurrently.
     * </i></p>
     * </blockquote>
     *
     * @since 1.23
     *
     * @see #MRO
     *
     * @see <a href="https://www.currency-iso.org/dam/isocy/downloads/dl_currency_iso_amendment_165.pdf"
     *      >ISO 4217 AMENDMENT NUMBER 165</a>
     */
    MRU("Ouguiya", 929, 2, CountryCode.MR),

    /**
     * <a href="http://en.wikipedia.org/wiki/Mauritian_rupee">Mauritius Rupee</a>
     * [numeric code = 480, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#MU MU}: MAURITIUS
     * </ul>
     */
    MUR("Mauritius Rupee", 480, 2, CountryCode.MU),

    /**
     * <a href="http://en.wikipedia.org/wiki/Maldivian_rufiyaa">Rufiyaa</a>
     * [numeric code = 462, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#MV MV}: MALDIVES
     * </ul>
     */
    MVR("Rufiyaa", 462, 2, CountryCode.MV),

    /**
     * <a href="http://en.wikipedia.org/wiki/Malawian_kwacha">Kwacha</a>
     * [numeric code = 454, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#MW MW}: MALAWI
     * </ul>
     */
    MWK("Kwacha", 454, 2, CountryCode.MW),

    /**
     * <a href="http://en.wikipedia.org/wiki/Mexican_peso">Mexican Peso</a>
     * [numeric code = 484, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#MX MX}: MEXICO
     * </ul>
     */
    MXN("Mexican Peso", 484, 2, CountryCode.MX),

    /**
     * <a href="http://en.wikipedia.org/wiki/Mexican_Unidad_de_Inversion"
     * >Mexican Unidad de Inversion (UDI)</a>
     * [numeric code = 979, minor unit = 2, fund]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#MX MX}: MEXICO
     * </ul>
     */
    MXV("Mexican Unidad de Inversion (UDI)", 979, 2, CountryCode.MX)
    {
        @Override
        public boolean isFund()
        {
            return true;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Malaysian_ringgit">Malaysian Ringgit</a>
     * [numeric code = 458, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#MY MY}: MALAYSIA
     * </ul>
     */
    MYR("Malaysian Ringgit", 458, 2, CountryCode.MY),

    /**
     * <a href="http://en.wikipedia.org/wiki/Mozambican_metical">Mozambique Metical</a>
     * [numeric code = 943, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#MZ MZ}: MOZAMBIQUE
     * </ul>
     */
    MZN("Mozambique Metical", 943, 2, CountryCode.MZ),

    /**
     * <a href="http://en.wikipedia.org/wiki/Namibian_dollar">Namibia Dollar</a>
     * [numeric code = 516, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#NA NA}: NAMIBIA
     * </ul>
     */
    NAD("Namibia Dollar", 516, 2, CountryCode.NA),

    /**
     * <a href="http://en.wikipedia.org/wiki/Nigerian_naira">Naira</a>
     * [numeric code = 566, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#NG NG}: NIGERIA
     * </ul>
     */
    NGN("Naira", 566, 2, CountryCode.NG),

    /**
     * <a href="http://en.wikipedia.org/wiki/Nicaraguan_c%C3%B3rdoba">Cordoba Oro</a>
     * [numeric code = 558, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#NI NI}: NICARAGUA
     * </ul>
     */
    NIO("Cordoba Oro", 558, 2, CountryCode.NI),

    /**
     * <a href="http://en.wikipedia.org/wiki/Norwegian_krone">Norwegian Krone</a>
     * [numeric code = 578, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#BV BV}: BOUVET ISLAND
     * <li>{@link CountryCode#NO NO}: NORWAY
     * <li>{@link CountryCode#SJ SJ}: SVALBARD AND JAN MAYEN
     * </ul>
     */
    NOK("Norwegian Krone", 578, 2, CountryCode.BV, CountryCode.NO, CountryCode.SJ),

    /**
     * <a href="http://en.wikipedia.org/wiki/Nepalese_rupee">Nepalese Rupee</a>
     * [numeric code = 524, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#NP NP}: NEPAL
     * </ul>
     */
    NPR("Nepalese Rupee", 524, 2, CountryCode.NP),

    /**
     * <a href="http://en.wikipedia.org/wiki/New_Zealand_dollar">New Zealand Dollar</a>
     * [numeric code = 554, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#CK CK}: COOK ISLANDS
     * <li>{@link CountryCode#NU NU}: NIUE
     * <li>{@link CountryCode#NZ NZ}: NEW ZEALAND
     * <li>{@link CountryCode#PN PN}: PITCAIRN
     * <li>{@link CountryCode#TK TK}: TOKELAU
     * </ul>
     */
    NZD("New Zealand Dollar", 554, 2,
        CountryCode.CK, CountryCode.NU, CountryCode.NZ, CountryCode.PN,
        CountryCode.TK),

    /**
     * <a href="http://en.wikipedia.org/wiki/Omani_rial">Rial Omani</a>
     * [numeric code = 512, minor unit = 3]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#OM OM}: OMAN
     * </ul>
     */
    OMR("Rial Omani", 512, 3, CountryCode.OM),

    /**
     * <a href="http://en.wikipedia.org/wiki/Panamanian_balboa">Balboa</a>
     * [numeric code = 590, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#PA PA}: PANAMA
     * </ul>
     */
    PAB("Balboa", 590, 2, CountryCode.PA),

    /**
     * <a href="http://en.wikipedia.org/wiki/Peruvian_nuevo_sol">Nuevo Sol</a>
     * [numeric code = 604, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#PE PE}: PERU
     * </ul>
     */
    PEN("Nuevo Sol", 604, 2, CountryCode.PE),

    /**
     * <a href="http://en.wikipedia.org/wiki/Papua_New_Guinean_kina">Kina</a>
     * [numeric code = 598, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#PG PG}: PAPUA NEW GUINEA
     * </ul>
     */
    PGK("Kina", 598, 2, CountryCode.PG),

    /**
     * <a href="http://en.wikipedia.org/wiki/Philippine_peso">Philippine Peso</a>
     * [numeric code = 608, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#PH PH}: PHILIPPINES
     * </ul>
     */
    PHP("Philippine Peso", 608, 2, CountryCode.PH),

    /**
     * <a href="http://en.wikipedia.org/wiki/Pakistani_rupee">Pakistan Rupee</a>
     * [numeric code = 586, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#PK PK}: PAKISTAN
     * </ul>
     */
    PKR("Pakistan Rupee", 586, 2, CountryCode.PK),

    /**
     * <a href="http://en.wikipedia.org/wiki/Polish_z%C5%82oty">Zloty</a>
     * [numeric code = 985, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#PL PL}: POLAND
     * </ul>
     */
    PLN("Zloty", 985, 2, CountryCode.PL),

    /**
     * <a href="http://en.wikipedia.org/wiki/Paraguayan_guaran%C3%AD">Guarani</a>
     * [numeric code = 600, minor unit = 0]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#PY PY}: PARAGUAY
     * </ul>
     */
    PYG("Guarani", 600, 0, CountryCode.PY),

    /**
     * <a href="http://en.wikipedia.org/wiki/Qatari_riyal">Qatari Rial</a>
     * [numeric code = 634, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#QA QA}: QATAR
     * </ul>
     */
    QAR("Qatari Rial", 634, 2, CountryCode.QA),

    /**
     * <a href="http://en.wikipedia.org/wiki/Romanian_Leu">New Romanian Leu</a>
     * [numeric code = 946, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#RO RO}: ROMANIA
     * </ul>
     */
    RON("New Romanian Leu", 946, 2, CountryCode.RO),

    /**
     * <a href="http://en.wikipedia.org/wiki/Serbian_dinar">Serbian Dinar</a>
     * [numeric code = 941, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#RS RS}: SERBIA
     * </ul>
     */
    RSD("Serbian Dinar", 941, 2, CountryCode.RS),

    /**
     * <a href="http://en.wikipedia.org/wiki/Russian_ruble">Russian Ruble</a>
     * [numeric code = 643, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#RU RU}: RUSSIAN FEDERATION
     * </ul>
     *
     * @see #RUR
     */
    RUB("Russian Ruble", 643, 2, CountryCode.RU),

    /**
     * <a href="http://en.wikipedia.org/wiki/Russian_ruble">Russian Ruble</a>
     * before the 1998 redenomination (1 {@link #RUB} = 1,000 {@link #RUR}).
     * [numeric code = 810, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#RU RU}: RUSSIAN FEDERATION
     * </ul>
     *
     * @see #RUB
     *
     * @since 1.20
     *
     * @deprecated
     */
    RUR("Russian Ruble", 810, 2, CountryCode.RU),

    /**
     * <a href="http://en.wikipedia.org/wiki/Rwandan_franc">Rwanda Franc</a>
     * [numeric code = 646, minor unit = 0]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#RW RW}: RWANDA
     * </ul>
     */
    RWF("Rwanda Franc", 646, 0, CountryCode.RW),

    /**
     * <a href="http://en.wikipedia.org/wiki/Saudi_riyal">Saudi Riyal</a>
     * [numeric code = 682, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#SA SA}: SAUDI ARABIA
     * </ul>
     */
    SAR("Saudi Riyal", 682, 2, CountryCode.SA),

    /**
     * <a href="http://en.wikipedia.org/wiki/Solomon_Islands_dollar">Solomon Islands Dollar</a>
     * [numeric code = 90, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#SB SB}: SOLOMON ISLANDS
     * </ul>
     */
    SBD("Solomon Islands Dollar", 90, 2, CountryCode.SB),

    /**
     * <a href="http://en.wikipedia.org/wiki/Seychelles_rupee">Seychelles Rupee</a>
     * [numeric code = 690, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#SC SC}: SEYCHELLES
     * </ul>
     */
    SCR("Seychelles Rupee", 690, 2, CountryCode.SC),

    /**
     * <a href="http://en.wikipedia.org/wiki/Sudanese_pound">Sudanese Pound</a>
     * [numeric code = 938, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#SD SD}: SUDAN
     * </ul>
     */
    SDG("Sudanese Pound", 938, 2, CountryCode.SD),

    /**
     * <a href="http://en.wikipedia.org/wiki/Swedish_krona">Swedish Krona</a>
     * [numeric code = 752, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#SE SE}: SWEDEN
     * </ul>
     */
    SEK("Swedish Krona", 752, 2, CountryCode.SE),

    /**
     * <a href="http://en.wikipedia.org/wiki/Singapore_dollar">Singapore Dollar</a>
     * [numeric code = 702, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#SG SG}: SINGAPORE
     * </ul>
     */
    SGD("Singapore Dollar", 702, 2, CountryCode.SG),

    /**
     * <a href="http://en.wikipedia.org/wiki/Saint_Helena_pound">Saint Helena Pound</a>
     * [numeric code = 654, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#SH SH}: SAINT HELENA, ASCENSION AND TRISTAN DA CUNHA
     * </ul>
     */
    SHP("Saint Helena Pound", 654, 2, CountryCode.SH),

    /**
     * <a href="http://en.wikipedia.org/wiki/Sierra_Leonean_leone">Leone</a>
     * [numeric code = 694, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#SL SL}: SIERRA LEONE
     * </ul>
     */
    SLL("Leone", 694, 2, CountryCode.SL),

    /**
     * <a href="http://en.wikipedia.org/wiki/Somali_shilling">Somali Shilling</a>
     * [numeric code = 706, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#SO SO}: SOMALIA
     * </ul>
     */
    SOS("Somali Shilling", 706, 2, CountryCode.SO),

    /**
     * <a href="http://en.wikipedia.org/wiki/Surinamese_dollar">Surinam Dollar</a>
     * [numeric code = 968, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#SR SR}: SURINAME
     * </ul>
     */
    SRD("Surinam Dollar", 968, 2, CountryCode.SR),

    /**
     * <a href="http://en.wikipedia.org/wiki/South_Sudanese_pound">South Sudanese Pound</a>
     * [numeric code = 728, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#SS SS}: SOUTH SUDAN
     * </ul>
     */
    SSP("South Sudanese Pound", 728, 2, CountryCode.SS),

    /**
     * <a href="http://en.wikipedia.org/wiki/S%C3%A3o_Tom%C3%A9_and_Pr%C3%ADncipe_dobra">Dobra</a>
     * [numeric code = 678, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#ST ST}: SAO TOME AND PRINCIPE
     * </ul>
     *
     * @see #STN
     *
     * @deprecated
     */
    STD("Dobra", 678, 2, CountryCode.ST),

    /**
     * <a href="http://en.wikipedia.org/wiki/S%C3%A3o_Tom%C3%A9_and_Pr%C3%ADncipe_dobra">Dobra</a>
     * [numeric code = 930, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#ST ST}: SAO TOME AND PRINCIPE
     * </ul>
     *
     * <p>
     * Excerpted from <a href=
     * "https://www.currency-iso.org/dam/isocy/downloads/dl_currency_iso_amendment_164.pdf"
     * >ISO 4217 AMENDMENT NUMBER 164</a>:
     * </p>
     *
     * <blockquote>
     * <p><i>
     * The Central Bank of S. Tom&eacute; and Pr&iacute;ncipe is carrying out
     * an important Monetary Reform Project, with the entry into circulation
     * of a new family of DOBRAS. The conversion rate is 1000 (old) Dobras to
     * 1 (new) Dobra (1000:1).
     * </i></p>
     *
     * <p><i>
     * From 1 January 2018 to 30 June 2018, the old and new denominations run concurrently.
     * </i></p>
     * </blockquote>
     *
     * @since 1.23
     *
     * @see #STD
     *
     * @see <a href="https://www.currency-iso.org/dam/isocy/downloads/dl_currency_iso_amendment_164.pdf"
     *      >ISO 4217 AMENDMENT NUMBER 164</a>
     */
    STN("Dobra", 930, 2, CountryCode.ST),

    /**
     * <a href="http://en.wikipedia.org/wiki/Salvadoran_col%C3%B3n">El Salvador Colon</a>
     * [numeric code = 222, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#SV SV}: EL SALVADOR
     * </ul>
     */
    SVC("El Salvador Colon", 222, 2, CountryCode.SV),

    /**
     * <a href="http://en.wikipedia.org/wiki/Syrian_pound">Syrian Pound</a>
     * [numeric code = 760, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#SY SY}: SYRIAN ARAB REPUBLIC
     * </ul>
     */
    SYP("Syrian Pound", 760, 2, CountryCode.SY),

    /**
     * <a href="http://en.wikipedia.org/wiki/Swazi_lilangeni">Lilangeni</a>
     * [numeric code = 748, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#SZ SZ}: ESWATINI
     * </ul>
     */
    SZL("Lilangeni", 748, 2, CountryCode.SZ),

    /**
     * <a href="http://en.wikipedia.org/wiki/Thai_baht">Baht</a>
     * [numeric code = 764, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#TH TH}: THAILAND
     * </ul>
     */
    THB("Baht", 764, 2, CountryCode.TH),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tajikistani_somoni">Somoni</a>
     * [numeric code = 972, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#TJ TJ}: TAJIKISTAN
     * </ul>
     */
    TJS("Somoni", 972, 2, CountryCode.TJ),

    /**
     * <a href="http://en.wikipedia.org/wiki/Turkmenistani_manat">Turkmenistan New Manat</a>
     * [numeric code = 934, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#TM TM}: TURKMENISTAN
     * </ul>
     */
    TMT("Turkmenistan New Manat", 934, 2, CountryCode.TM),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tunisian_dinar">Tunisian Dinar</a>
     * [numeric code = 788, minor unit = 3]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#TN TN}: TUNISIA
     * </ul>
     */
    TND("Tunisian Dinar", 788, 3, CountryCode.TN),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tongan_pa%CA%BBanga">Pa&#x2bb;anga</a>
     * [numeric code = 776, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#TO TO}: TONGA
     * </ul>
     */
    TOP("Pa\u02BBanga", 776, 2, CountryCode.TO),

    /**
     * <a href="http://en.wikipedia.org/wiki/Turkish_lira">Turkish Lira</a>
     * [numeric code = 949, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#TR TR}: TURKEY
     * </ul>
     */
    TRY("Turkish Lira", 949, 2, CountryCode.TR),

    /**
     * <a href="http://en.wikipedia.org/wiki/Trinidad_and_Tobago_dollar"
     * >Trinidad and Tobago Dollar</a>
     * [numeric code = 780, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#TT TT}: TRINIDAD AND TOBAGO
     * </ul>
     */
    TTD("Trinidad and Tobago Dollar", 780, 2, CountryCode.TT),

    /**
     * <a href="http://en.wikipedia.org/wiki/New_Taiwan_dollar">New Taiwan Dollar</a>
     * [numeric code = 901, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#TW TW}: TAIWAN, PROVINCE OF CHINA
     * </ul>
     */
    TWD("New Taiwan Dollar", 901, 2, CountryCode.TW),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tanzanian_shilling">Tanzanian Shilling</a>
     * [numeric code = 834, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#TZ TZ}: TANZANIA, UNITED REPUBLIC OF
     * </ul>
     */
    TZS("Tanzanian Shilling", 834, 2, CountryCode.TZ),

    /**
     * <a href="http://en.wikipedia.org/wiki/Ukrainian_hryvnia">Hryvnia</a>
     * [numeric code = 980, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#UA UA}: UKRAINE
     * </ul>
     */
    UAH("Hryvnia", 980, 2, CountryCode.UA),

    /**
     * <a href="http://en.wikipedia.org/wiki/Ugandan_shilling">Uganda Shilling</a>
     * [numeric code = 800, minor unit = 0]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#UG UG}: UGANDA
     * </ul>
     */
    UGX("Uganda Shilling", 800, 0, CountryCode.UG),

    /**
     * <a href="http://en.wikipedia.org/wiki/United_States_dollar">US Dollar</a>
     * [numeric code = 840, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#AS AS}: AMERICAN SAMOA
     * <li>{@link CountryCode#BQ BQ}: BONAIRE, SINT EUSTATIUS AND SABA
     * <li>{@link CountryCode#EC EC}: ECUADOR
     * <li>{@link CountryCode#FM FM}: MICRONESIA, FEDERATED STATES OF
     * <li>{@link CountryCode#GU GU}: GUAM
     * <li>{@link CountryCode#HT HT}: HAITI
     * <li>{@link CountryCode#IO IO}: BRITISH INDIAN OCEAN TERRITORY
     * <li>{@link CountryCode#MH MH}: MARSHALL ISLANDS
     * <li>{@link CountryCode#MP MP}: NORTHERN MARIANA ISLANDS
     * <li>{@link CountryCode#PA PA}: PANAMA
     * <li>{@link CountryCode#PR PR}: PUERTO RICO
     * <li>{@link CountryCode#PW PW}: PALAU
     * <li>{@link CountryCode#SV SV}: EL SALVADOR
     * <li>{@link CountryCode#TC TC}: TURKS AND CAICOS ISLANDS
     * <li>{@link CountryCode#TL TL}: TIMOR-LESTE
     * <li>{@link CountryCode#UM UM}: UNITED STATES MINOR OUTLYING ISLANDS
     * <li>{@link CountryCode#US US}: UNITED STATES
     * <li>{@link CountryCode#VG VG}: VIRGIN ISLANDS (BRITISH)
     * <li>{@link CountryCode#VI VI}: VIRGIN ISLANDS (US)
     * </ul>
     */
    USD("US Dollar", 840, 2,
        CountryCode.AS, CountryCode.BQ, CountryCode.EC, CountryCode.FM,
        CountryCode.GU, CountryCode.HT, CountryCode.IO, CountryCode.MH,
        CountryCode.MP, CountryCode.PA, CountryCode.PR, CountryCode.PW,
        CountryCode.SV, CountryCode.TC, CountryCode.TL, CountryCode.UM,
        CountryCode.US, CountryCode.VG, CountryCode.VI),

    /**
     * US Dollar (Next day)
     * [numeric code = 997, minor unit = 2, fund]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#US US}: UNITED STATES
     * </ul>
     */
    USN("US Dollar (Next day)", 997, 2, CountryCode.US)
    {
        @Override
        public boolean isFund()
        {
            return true;
        }
    },

    /**
     * US Dollar (Same day)
     * [numeric code = 998, minor unit = 2, fund]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#US US}: UNITED STATES
     * </ul>
     */
    USS("US Dollar (Same day)", 998, 2, CountryCode.US)
    {
        @Override
        public boolean isFund()
        {
            return true;
        }
    },

    /**
     * Uruguay Peso en Unidades Indexadas (URUIURUI)
     * [numeric code = 940, minor unit = 0, fund]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#UY UY}: URUGUAY
     * </ul>
     */
    UYI("Uruguay Peso en Unidades Indexadas (URUIURUI)", 940, 0, CountryCode.UY)
    {
        @Override
        public boolean isFund()
        {
            return true;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Uruguayan_peso">Peso Uruguayo</a>
     * [numeric code = 858, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#UY UY}: URUGUAY
     * </ul>
     */
    UYU("Peso Uruguayo", 858, 2, CountryCode.UY),

    /**
     * <a href="http://en.wikipedia.org/wiki/Uzbekistan_som">Uzbekistan Sum</a>
     * [numeric code = 860, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#UZ UZ}: UZBEKISTAN
     * </ul>
     */
    UZS("Uzbekistan Sum", 860, 2, CountryCode.UZ),

    /**
     * <a href="http://en.wikipedia.org/wiki/Venezuelan_bol%C3%ADvar">Bolivar</a>
     * [numeric code = 937, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#VE VE}: VENEZUELA, BOLIVARIAN REPUBLIC OF
     * </ul>
     *
     * @see #VES
     *
     * @deprecated
     */
    VEF("Bolivar", 937, 2, CountryCode.VE),

    /**
     * <a href="http://en.wikipedia.org/wiki/Venezuelan_bol%C3%ADvar">Bolivar</a>
     * [numeric code = 928, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#VE VE}: VENEZUELA, BOLIVARIAN REPUBLIC OF
     * </ul>
     *
     * @see #VEF
     */
    VES("Bolivar Soberano", 928, 2, CountryCode.VE),

    /**
     * <a href="http://en.wikipedia.org/wiki/Vietnamese_dong">Dong</a>
     * [numeric code = 704, minor unit = 0]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#VN VN}: VIET NAM
     * </ul>
     */
    VND("Dong", 704, 0, CountryCode.VN),

    /**
     * <a href="http://en.wikipedia.org/wiki/Vanuatu_vatu">Vatu</a>
     * [numeric code = 548, minor unit = 0]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#VU VU}: VANUATU
     * </ul>
     */
    VUV("Vatu", 548, 0, CountryCode.VU),

    /**
     * <a href="http://en.wikipedia.org/wiki/Samoan_tala">Tala</a>
     * [numeric code = 882, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#WS WS}: SAMOA
     * </ul>
     */
    WST("Tala", 882, 2, CountryCode.WS),

    /**
     * <a href="http://en.wikipedia.org/wiki/Central_African_CFA_franc">CFA Franc BEAC</a>
     * [numeric code = 950, minor unit = 0]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#CF CF}: CENTRAL AFRICAN REPUBLIC
     * <li>{@link CountryCode#CG CG}: CONGO
     * <li>{@link CountryCode#CM CM}: CAMEROON
     * <li>{@link CountryCode#GA GA}: GABON
     * <li>{@link CountryCode#GQ GQ}: EQUATORIAL GUINEA
     * <li>{@link CountryCode#TD TD}: CHAD
     * </ul>
     */
    XAF("CFA Franc BEAC", 950, 0,
        CountryCode.CF, CountryCode.CG, CountryCode.CM, CountryCode.GA,
        CountryCode.GQ, CountryCode.TD),

    /**
     * <a href="http://en.wikipedia.org/wiki/Silver">Silver</a>
     * [numeric code = 961, minor unit = -1, precious metal]
     */
    XAG("Silver", 961, -1)
    {
        @Override
        public boolean isPreciousMetal()
        {
            return true;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Gold">Gold</a>
     * [numeric code = 959, minor unit = -1, precious metal]
     */
    XAU("Gold", 959, -1)
    {
        @Override
        public boolean isPreciousMetal()
        {
            return true;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/European_Composite_Unit"
     * >Bond Markets Unit European Composite Unit (EURCO)</a>
     * [numeric code = 955, minor unit = -1]
     */
    XBA("Bond Markets Unit European Composite Unit (EURCO)", 955, -1),

    /**
     * <a href="http://en.wikipedia.org/wiki/European_Monetary_Unit"
     * >Bond Markets Unit European Monetary Unit (E.M.U.-6)</a>
     * [numeric code = 956, minor unit = -1]
     */
    XBB("Bond Markets Unit European Monetary Unit (E.M.U.-6)", 956, -1),

    /**
     * <a href="http://en.wikipedia.org/wiki/European_Unit_of_Account_9"
     * >Bond Markets Unit European Unit of Account 9 (E.U.A.-9)</a>
     * [numeric code = 957, minor unit = -1]
     */
    XBC("Bond Markets Unit European Unit of Account 9 (E.U.A.-9)", 957, -1),

    /**
     * <a href="http://en.wikipedia.org/wiki/European_Unit_of_Account_17"
     * >Bond Markets Unit European Unit of Account 17 (E.U.A.-17)</a>
     * [numeric code = 958, minor unit = -1]
     */
    XBD("Bond Markets Unit European Unit of Account 17 (E.U.A.-17)", 958, -1),

    /**
     * <a href="http://en.wikipedia.org/wiki/East_Caribbean_dollar"
     * >East Caribbean Dollar</a>
     * [numeric code = 951, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#AG AG}: ANTIGUA AND BARBUDA
     * <li>{@link CountryCode#AI AI}: ANGUILLA
     * <li>{@link CountryCode#DM DM}: DOMINICA
     * <li>{@link CountryCode#GD GD}: GRENADA
     * <li>{@link CountryCode#KN KN}: SAINT KITTS AND NEVIS
     * <li>{@link CountryCode#LC LC}: SAINT LUCIA
     * <li>{@link CountryCode#MS MS}: MONTSERRAT
     * <li>{@link CountryCode#VC VC}: SAINT VINCENT AND THE GRENADINES
     * </ul>
     */
    XCD("East Caribbean Dollar", 951, 2,
        CountryCode.AG, CountryCode.AI, CountryCode.DM, CountryCode.GD,
        CountryCode.KN, CountryCode.LC, CountryCode.MS, CountryCode.VC),

    /**
     * <a href="http://en.wikipedia.org/wiki/Special_drawing_rights"
     * >SDR (Special Drawing Right)</a>
     * [numeric code = 960, minor unit = -1]
     */
    XDR("SDR (Special Drawing Right)", 960, -1),

    /**
     * <a href="http://en.wikipedia.org/wiki/West_African_CFA_franc"
     * >CFA Franc BCEAO</a>
     * [numeric code = 952, minor unit = 0]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#BF BF}: BURKINA FASO
     * <li>{@link CountryCode#BJ BJ}: BENIN
     * <li>{@link CountryCode#CI CI}: C&Ocirc;TE D'IVOIRE
     * <li>{@link CountryCode#GW GW}: GUINEA-BISSAU
     * <li>{@link CountryCode#ML ML}: MALI
     * <li>{@link CountryCode#NE NE}: NIGER
     * <li>{@link CountryCode#SN SN}: SENEGAL
     * <li>{@link CountryCode#TG TG}: TOGO
     * </ul>
     */
    XOF("CFA Franc BCEAO", 952, 0,
        CountryCode.BF, CountryCode.BJ, CountryCode.CI, CountryCode.GW,
        CountryCode.ML, CountryCode.NE, CountryCode.SN, CountryCode.TG),

    /**
     * <a href="http://en.wikipedia.org/wiki/Palladium">Palladium</a>
     * [numeric code = 964, minor unit = -1, precious metal]
     */
    XPD("Palladium", 964, -1)
    {
        @Override
        public boolean isPreciousMetal()
        {
            return true;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/CFP_franc">CFP Franc</a>
     * [numeric code = 953, minor unit = 0]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#NC NC}: NEW CALEDONIA
     * <li>{@link CountryCode#PF PF}: FRENCH POLYNESIA
     * <li>{@link CountryCode#WF WF}: WALLIS AND FUTUNA
     * </ul>
     */
    XPF("CFP Franc", 953, 0, CountryCode.NC, CountryCode.PF, CountryCode.WF),

    /**
     * <a href="http://en.wikipedia.org/wiki/Platinum">Platinum</a>
     * [numeric code = 962, minor unit = -1, precious metal]
     */
    XPT("Platinum", 962, -1)
    {
        @Override
        public boolean isPreciousMetal()
        {
            return true;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/SUCRE">Sucre</a>
     * [numeric code = 994, minor unit = -1]
     */
    XSU("Sucre", 994, -1),

    /**
     * Codes specifically reserved for testing purposes.
     * [numeric code = 963, minor unit = -1]
     */
    XTS("Codes specifically reserved for testing purposes", 963, -1),

    /**
     * ADB Unit of Account
     * [numeric code = 965, minor unit = -1]
     */
    XUA("ADB Unit of Account", 965, -1),

    /**
     * The codes assigned for transactions where no currency is involved
     * [numeric code = 999, minor unit = -1]
     */
    XXX("The codes assigned for transactions where no currency is involved", 999, -1),

    /**
     * <a href="http://en.wikipedia.org/wiki/Yemeni_rial">Yemeni Rial</a>
     * [numeric code = 886, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#YE YE}: YEMEN
     * </ul>
     */
    YER("Yemeni Rial", 886, 2, CountryCode.YE),

    /**
     * <a href="http://en.wikipedia.org/wiki/South_African_rand">Rand</a>
     * [numeric code = 710, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#LS LS}: LESOTHO
     * <li>{@link CountryCode#NA NA}: NAMIBIA
     * <li>{@link CountryCode#ZA ZA}: SOUTH AFRICA
     * </ul>
     */
    ZAR("Rand", 710, 2, CountryCode.LS, CountryCode.NA, CountryCode.ZA),

    /**
     * <a href="http://en.wikipedia.org/wiki/Zambian_kwacha">Zambian Kwacha</a>
     * [numeric code = 967, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#ZM ZM}: ZAMBIA
     * </ul>
     */
    ZMW("Zambian Kwacha", 967, 2, CountryCode.ZM),

    /**
     * <a href="http://en.wikipedia.org/wiki/Zimbabwe_dollar">Zimbabwe Dollar</a>
     * [numeric code = 932, minor unit = 2]
     *
     * <p>Used by:</p>
     * <ul>
     * <li>{@link CountryCode#ZW ZW}: ZIMBABWE
     * </ul>
     */
    ZWL("Zimbabwe Dollar", 932, 2, CountryCode.ZW),
    ;


    private static final Map<Integer, CurrencyCode> numericMap = new HashMap<Integer, CurrencyCode>();


    static
    {
        for (CurrencyCode cc : values())
        {
            numericMap.put(cc.getNumeric(), cc);
        }
    }


    private final String name;
    private final int numeric;
    private final int minorUnit;
    private final List<CountryCode> countryList;


    private CurrencyCode(String name, int numeric, int minorUnit, CountryCode... countries)
    {
        this.name        = name;
        this.numeric     = numeric;
        this.minorUnit   = minorUnit;
        this.countryList = Collections.unmodifiableList(Arrays.asList(countries));
    }


    /**
     * Get the currency name.
     *
     * @return
     *         The currency name.
     */
    public String getName()
    {
        return name;
    }


    /**
     * Get the <a href="http://en.wikipedia.org/wiki/ISO_4217"
     * >ISO 4217</a> numeric code.
     *
     * @return
     *         The <a href="http://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a>
     *         numeric code.
     */
    public int getNumeric()
    {
        return numeric;
    }


    /**
     * Get the minor unit.
     *
     * @return
     *         The minor unit. {@code -1} means N.A.
     */
    public int getMinorUnit()
    {
        return minorUnit;
    }


    /**
     * Get the list of countries using this currency.
     *
     * @return
     *         The list of countries using this currency.
     */
    public List<CountryCode> getCountryList()
    {
        return countryList;
    }


    /**
     * Check if this currency code represents a fund.
     *
     * <p>
     * {@code CurrencyCode} instances listed below return {@code true}.
     * </p>
     *
     * <ul>
     * <li>{@link #BOV} Mvdol
     * <li>{@link #CHE} WIR EUro
     * <li>{@link #CHW} WIR Franc
     * <li>{@link #CLF} Unidad de Fomento
     * <li>{@link #COU} Unidad de Valor Real
     * <li>{@link #MXV} Mexican Unidad de Inversion (UDI)
     * <li>{@link #USN} US Dollar (Next day)
     * <li>{@link #USS} US Dollar (Same day)
     * <li>{@link #UYI} Uruguay Peso en Unidades
     * </ul>
     *
     * @return
     *         True if this currency code represents a fund.
     */
    public boolean isFund()
    {
        return false;
    }


    /**
     * Check if this currency code represents a precious metal.
     *
     * <p>
     * {@code CurrencyCode} instances listed below return {@code true}.
     * </p>
     *
     * <ul>
     * <li>{@link #XAG} Silver
     * <li>{@link #XAU} Gold
     * <li>{@link #XPD} Palladium
     * <li>{@link #XPT} Platinum
     * </ul>
     *
     * @return
     *         True if this currency code represents a precious metal.
     */
    public boolean isPreciousMetal()
    {
        return false;
    }


    /**
     * Get the {@link Currency} instance that corresponds to
     * this currency code.
     *
     * <p>
     * This method is an alias of {@link Currency}{@code .}{@link
     * Currency#getInstance(String) getInstance}{@code (this.name())}.
     * The only difference is that this method returns {@code null}
     * when {@code Currency.getInstance(String)} throws {@code
     * IllegalArgumentException}.
     * </p>
     *
     * @return
     *         A {@link Currency} instance, or {@code null} if this
     *         ISO 4217 code is not supported by the implementation
     *         of {@link Currency#getInstance(String)}.
     *
     * @see Currency#getInstance(String)
     */
    public Currency getCurrency()
    {
        try
        {
            return Currency.getInstance(this.name());
        }
        catch (IllegalArgumentException e)
        {
            // Currency.getInstance(String) throws IllegalArgumentException
            // when the given ISO 4217 code is not supported.
            return null;
        }
    }


    /**
     * Get a {@code CurrencyCode} that corresponds to the given
     * <a href="http://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a>
     * alpha-3 code.
     *
     * <p>
     * This method calls {@link #getByCode(String, boolean) getByCode}{@code (code, true)}.
     * Note that the behavior has changed since the version 1.13. In the older versions,
     * this method was an alias of {@code getByCode(code, false)}.
     * </p>
     *
     * @param code
     *         <a href="http://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a>
     *         alpha-3 code.
     *         When {@code "UNDEFINED"} is given, {@link #UNDEFINED CurrencyCode.UNDEFINED}
     *         is returned.
     *
     * @return
     *         A {@code CurrencyCode} instance, or {@code null} if not found.
     *
     * @see #getByCode(String, boolean)
     */
    public static CurrencyCode getByCode(String code)
    {
        return getByCode(code, true);
    }


    /**
     * Get a {@code CurrencyCode} that corresponds to the given
     * <a href="http://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a>
     * alpha-3 code.
     *
     * <p>
     * This method calls {@link #getByCode(String, boolean) getByCode}{@code (code, false)}.
     * </p>
     *
     * @param code
     *         <a href="http://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a>
     *         alpha-3 code. Or {@code "UNDEFINED"} (case insensitive).
     *
     * @return
     *         A {@code CurrencyCode} instance, or {@code null} if not found.
     *
     * @since 1.13
     *
     * @see #getByCode(String, boolean)
     */
    public static CurrencyCode getByCodeIgnoreCase(String code)
    {
        return getByCode(code, false);
    }


    /**
     * Get a {@code CurrencyCode} that corresponds to the given
     * <a href="http://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a>
     * alpha-3 code.
     *
     * @param code
     *         <a href="http://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a>
     *         alpha-3 code.
     *         Or {@code "UNDEFINED"} (its case sensitivity depends on the value of
     *         {@code caseSensitive}).
     *
     * @param caseSensitive
     *         If {@code true}, the given code should consist of upper-case letters only.
     *         If {@code false}, this method internally canonicalizes the given code by
     *         {@link String#toUpperCase()} and then performs search. For example,
     *         {@code getByCode("jpy", true)} returns {@code null}, but on the other hand,
     *         {@code getByCode("jpy", false)} returns {@link #JPY CurrencyCode.JPY}.
     *
     * @return
     *         A {@code CurrencyCode} instance, or {@code null} if not found.
     */
    public static CurrencyCode getByCode(String code, boolean caseSensitive)
    {
        code = canonicalize(code, caseSensitive);

        if (code == null)
        {
            return null;
        }

        try
        {
            return Enum.valueOf(CurrencyCode.class, code);
        }
        catch (IllegalArgumentException e)
        {
            return null;
        }
    }


    /**
     * Get a {@code CurrencyCode} that corresponds to the given
     * <a href="http://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a>
     * numeric code.
     *
     * @param code
     *         <a href="http://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a>
     *         numeric code.
     *
     * @return
     *         A {@code CurrencyCode} instance, or {@code null} if not found.
     *         If 0 or a negative value is given, {@code null} is returned.
     */
    public static CurrencyCode getByCode(int code)
    {
        if (code <= 0)
        {
            return null;
        }

        return numericMap.get(code);
    }


    private static String canonicalize(String code, boolean caseSensitive)
    {
        if (code == null || code.length() == 0)
        {
            return null;
        }

        if (caseSensitive)
        {
            return code;
        }
        else
        {
            return code.toUpperCase();
        }
    }


    /**
     * Get a list of {@code CurrencyCode} instances whose country
     * list contains the specified country.
     *
     * <p>
     * This method is an alias of {@link #getByCountry(String, boolean)
     * getByCountry}{@code (country, true)}.
     * Note that the behavior has changed since the version 1.13.
     * In the older versions, this method was an alias of {@code
     * getByCountry(code, false)}.
     * </p>
     *
     * @param country
     *         Country code. ISO 3166-1 alpha-2 or alpha-3.
     *
     * @return
     *         List of {@code CurrencyCode} instances. If there is no
     *         {@code CurrencyCode} instance whose country list contains
     *         the specified country, the size of the returned list is zero.
     */
    public static List<CurrencyCode> getByCountry(String country)
    {
        return getByCountry(country, true);
    }


    /**
     * Get a list of {@code CurrencyCode} instances whose country
     * list contains the specified country.
     *
     * <p>
     * This method is an alias of {@link #getByCountry(String, boolean)
     * getByCountry}{@code (country, false)}.
     * </p>
     *
     * @param country
     *         Country code. ISO 3166-1 alpha-2 or alpha-3.
     *
     * @return
     *         List of {@code CurrencyCode} instances. If there is no
     *         {@code CurrencyCode} instance whose country list contains
     *         the specified country, the size of the returned list is zero.
     *
     * @since 1.13
     */
    public static List<CurrencyCode> getByCountryIgnoreCase(String country)
    {
        return getByCountry(country, false);
    }


    /**
     * Get a list of {@code CurrencyCode} instances whose country
     * list contains the specified country.
     *
     * <p>
     * This method is an alias of {@link #getByCountry(CountryCode)
     * getByCountry}{@code (}{@link CountryCode}{@code .}{@link
     * CountryCode#getByCode(String, boolean) getByCode}{@code
     * (country, caseSensitive))}.
     * </p>
     *
     * @param country
     *         Country code. ISO 3166-1 alpha-2 or alpha-3.
     *
     * @param caseSensitive
     *         If {@code true}, the given code should consist of uppercase
     *         letters only. If {@code false}, case is ignored.
     *
     * @return
     *         List of {@code CurrencyCode} instances. If there is no
     *         {@code CurrencyCode} instance whose country list contains
     *         the specified country, the size of the returned list is zero.
     */
    public static List<CurrencyCode> getByCountry(String country, boolean caseSensitive)
    {
        return getByCountry(CountryCode.getByCode(country, caseSensitive));
    }


    /**
     * Get a list of {@code CurrencyCode} instances whose country list
     * contains the specified country.
     *
     * @param country
     *         {@code CountryCode} instance that represents a country.
     *
     * @return
     *         List of {@code CurrencyCode} instances. If there is no
     *         {@code CurrencyCode} instance whose country list contains
     *         the specified country, the size of the returned list is zero.
     */
    public static List<CurrencyCode> getByCountry(CountryCode country)
    {
        List<CurrencyCode> list = new ArrayList<CurrencyCode>();

        if (country == null)
        {
            return list;
        }

        for (CurrencyCode currency : values())
        {
            for (CountryCode cc : currency.countryList)
            {
                if (cc == country)
                {
                    list.add(currency);
                }
            }
        }

        return list;
    }


    /**
     * Get a list of {@code CurrencyCode} by a name regular expression.
     *
     * <p>
     * This method is almost equivalent to {@link #findByName(Pattern)
     * findByName}{@code (Pattern.compile(regex))}.
     * </p>
     *
     * @param regex
     *         Regular expression for names.
     *
     * @return
     *         List of {@code CurrencyCode}. If nothing has matched,
     *         an empty list is returned.
     *
     * @throws IllegalArgumentException
     *         {@code regex} is {@code null}.
     *
     * @throws java.util.regex.PatternSyntaxException
     *         {@code regex} failed to be compiled.
     *
     * @since 1.11
     */
    public static List<CurrencyCode> findByName(String regex)
    {
        if (regex == null)
        {
            throw new IllegalArgumentException("regex is null.");
        }

        // Compile the regular expression. This may throw
        // java.util.regex.PatternSyntaxException.
        Pattern pattern = Pattern.compile(regex);

        return findByName(pattern);
    }


    /**
     * Get a list of {@code CurrencyCode} by a name pattern.
     *
     * <p>
     * For example, the list obtained by the code snippet below:
     * </p>
     *
     * <pre style="background-color: #EEEEEE; margin-left: 2em; margin-right: 2em; border: 1px solid black; padding: 0.5em;">
     * Pattern pattern = Pattern.compile(<span style="color: darkred;">".*Ruble"</span>);
     * List&lt;CurrencyCode&gt; list = CurrencyCode.findByName(pattern);</pre>
     *
     * <p>
     * contains 4 {@code CurrencyCode}s as listed below.
     * </p>
     *
     * <ol>
     * <li>{@link #BYN} : Belarusian Ruble
     * <li>{@link #BYR} : Belarusian Ruble
     * <li>{@link #RUB} : Russian Ruble
     * <li>{@link #RUR} : Russian Ruble
     * </ol>
     *
     * @param pattern
     *         Pattern to match names.
     *
     * @return
     *         List of {@code CurrencyCde}. If nothing has matched,
     *         an empty list is returned.
     *
     * @throws IllegalArgumentException
     *         {@code pattern} is {@code null}.
     *
     * @since 1.11
     */
    public static List<CurrencyCode> findByName(Pattern pattern)
    {
        if (pattern == null)
        {
            throw new IllegalArgumentException("pattern is null.");
        }

        List<CurrencyCode> list = new ArrayList<CurrencyCode>();

        for (CurrencyCode entry : values())
        {
            // If the name matches the given pattern.
            if (pattern.matcher(entry.getName()).matches())
            {
                list.add(entry);
            }
        }

        return list;
    }
}
