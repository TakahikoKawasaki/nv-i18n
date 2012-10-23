/*
 * Copyright (C) 2012 Neo Visionaries Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.neovisionaries.i18n;


import java.util.HashMap;
import java.util.Map;


/**
 * <a href="http://en.wikipedia.org/wiki/ISO_3166-1">ISO 3166-1</a>
 * country code.
 *
 * <p>
 * Enum names of this enum themselves are represented by
 * <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>
 * codes. There are instance methods to get the country name ({@link #getName()}), the
 * <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-3" >ISO 3166-1 alpha-3</a>
 * code ({@link #getAlpha3()}) and the
 * <a href="http://en.wikipedia.org/wiki/ISO_3166-1_numeric">ISO 3166-1 numeric</a>
 * code ({@link #getNumeric()}).
 * In addition, there are static methods to get a CountryCode instance that
 * corresponds to a given alpha-2/alpha-3/numeric code ({@link #getByCode(String)},
 * {@link #getByCode(int)}).
 * </p>
 *
 * <pre style="background-color: #EEEEEE; margin-left: 2em; margin-right: 2em; border: 1px solid black;">
 * <span style="color: darkgreen;">// EXAMPLE</span>
 *
 * CountryCode cc = CountryCode.{@link #getByCode(String) getByCode}("JP");
 *
 * <span style="color: darkgreen;">// Country name</span>
 * System.out.println("Country name = " + cc.{@link #getName()});                  <span style="color: darkgreen;">// "Japan"</span>
 *
 * <span style="color: darkgreen;">// ISO 3166-1 alpha-2 code</span>
 * System.out.println("ISO 3166-1 alpha-2 code = " + cc.{@link #getAlpha2()});     <span style="color: darkgreen;">// "JP"</span>
 *
 * <span style="color: darkgreen;">// ISO 3166-1 alpha-3 code</span>
 * System.out.println("ISO 3166-1 alpha-3 code = " + cc.{@link #getAlpha3()});     <span style="color: darkgreen;">// "JPN"</span>
 *
 * <span style="color: darkgreen;">// ISO 3166-1 numeric code</span>
 * System.out.println("ISO 3166-1 numeric code = " + cc.{@link #getNumeric()});    <span style="color: darkgreen;">// 392</span>
 * </pre>
 *
 * @author Takahiko Kawasaki
 */
public enum CountryCode
{
    /**
     * <a href="http://en.wikipedia.org/wiki/Andorra">Andorra</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#AD">AD</a>, AND, 16]
     */
    AD("Andorra", "AND", 16),

    /**
     * <a href="http://en.wikipedia.org/wiki/United_Arab_Emirates">United Arab Emirates</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#AE">AE</a>, AE, 784]
     */
    AE("United Arab Emirates", "ARE", 784),

    /**
     * <a href="http://en.wikipedia.org/wiki/Afghanistan">Afghanistan</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#AF">AF</a>, AFG, 4]
     */
    AF("Afghanistan", "AFG", 4),

    /**
     * <a href="http://en.wikipedia.org/wiki/Antigua_and_Barbuda">Antigua and Barbuda</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#AG">AG</a>, ATG, 28]
     */
    AG("Antigua and Barbuda", "ATG", 28),

    /**
     * <a href="http://en.wikipedia.org/wiki/Anguilla">Anguilla</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#AI">AI</a>, AIA, 660]
     */
    AI("Anguilla", "AIA", 660),

    /**
     * <a href="http://en.wikipedia.org/wiki/Armenia">Armenia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#AM">AM</a>, ARM, 51]
     */
    AM("Armenia", "ARM", 51),

    /**
     * <a href="http://en.wikipedia.org/wiki/Angola">Angola</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#AO">AO</a>, AGO, 24]
     */
    AO("Angola", "AGO", 24),

    /**
     * <a href="http://en.wikipedia.org/wiki/Antarctica">Antarctica</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#AQ">AQ</a>, ATA, 10]
     */
    AQ("Antarctica", "ATA", 10),

    /**
     * <a href="http://en.wikipedia.org/wiki/Argentina">Argentina</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#AR">AR</a>, ARG, 32]
     */
    AR("Argentina", "ARG", 32),

    /**
     * <a href="http://en.wikipedia.org/wiki/American_Samoa">American Samoa</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#AS">AS</a>, ASM, 16]
     */
    AS("American Samoa", "ASM", 16),

    /**
     * <a href="http://en.wikipedia.org/wiki/Austria">Austria</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#AT">AT</a>, AUT, 40]
     */
    AT("Austria", "AUT", 40),

    /**
     * <a href="http://en.wikipedia.org/wiki/Australia">Australia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#AU">AU</a>, AUS, 36]
     */
    AU("Australia", "AUS", 36),

    /**
     * <a href="http://en.wikipedia.org/wiki/Aruba">Aruba</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#AW">AW</a>, ABW, 533]
     */
    AW("Aruba", "ABW", 533),

    /**
     * <a href="http://en.wikipedia.org/wiki/%C3%85land_Islands">&Aring;land Islands</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#AX">AX</a>, ALA, 248]
     */
    AX("\u212Bland Islands", "ALA", 248),

    /**
     * <a href="http://en.wikipedia.org/wiki/Azerbaijan">Azerbaijan</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#AZ">AZ</a>, AZE, 31]
     */
    AZ("Azerbaijan", "AZE", 31),

    /**
     * <a href="http://en.wikipedia.org/wiki/Bosnia_and_Herzegovina">Bosnia and Herzegovina</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#BA">BA</a>, BIH, 70]
     */
    BA("Bosnia and Herzegovina", "BIH", 70),

    /**
     * <a href="http://en.wikipedia.org/wiki/Barbados">Barbados</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#BB">BB</a>, BRB, 52]
     */
    BB("Barbados", "BRB", 52),

    /**
     * <a href="http://en.wikipedia.org/wiki/Bangladesh">Bangladesh</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#BD">BD</a>, BGD, 50]
     */
    BD("Bangladesh", "BGD", 50),

    /**
     * <a href="http://en.wikipedia.org/wiki/Belgium">Belgium</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#BE">BE</a>, BEL, 56]
     */
    BE("Belgium", "BEL", 56),

    /**
     * <a href="http://en.wikipedia.org/wiki/Burkina_Faso">Burkina Faso</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#BF">BF</a>, BFA, 854]
     */
    BF("Burkina Faso", "BFA", 854),

    /**
     * <a href="http://en.wikipedia.org/wiki/Bulgaria">Bulgaria</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#BG">BG</a>, BGR, 100]
     */
    BG("Bulgaria", "BGR", 100),

    /**
     * <a href="http://en.wikipedia.org/wiki/Bahrain">Bahrain</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#BH">BH</a>, BHR, 48]
     */
    BH("Bahrain", "BHR", 48),

    /**
     * <a href="http://en.wikipedia.org/wiki/Burundi">Burundi</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#BI">BI</a>, BDI, 108]
     */
    BI("Burundi", "BDI", 108),

    /**
     * <a href="http://en.wikipedia.org/wiki/Benin">Benin</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#BJ">BJ</a>, BEN, 204]
     */
    BJ("Benin", "BEN", 204),

    /**
     * <a href="http://en.wikipedia.org/wiki/Saint_Barth%C3%A9lemy">Saint Barth&eacute;lemy</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#BL">BL</a>, BLM, 652]
     */
    BL("Saint Barth\u00E9lemy", "BLM", 652),

    /**
     * <a href="http://en.wikipedia.org/wiki/Bermuda">Bermuda</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#BM">BM</a>, BMU, 60]
     */
    BM("Bermuda", "BMU", 60),

    /**
     * <a href="http://en.wikipedia.org/wiki/Brunei">Brunei Darussalam</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#BN">BN</a>, BRN, 96]
     */
    BN("Brunei Darussalam", "BRN", 96),

    /**
     * <a href="http://en.wikipedia.org/wiki/Bolivia">Plurinational State of Bolivia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#BO">BO</a>, BOL, 68]
     */
    BO("Plurinational State of Bolivia", "BOL", 68),

    /**
     * <a href="http://en.wikipedia.org/wiki/Caribbean_Netherlands">Bonaire, Sint Eustatius and Saba</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#BQ">BQ</a>, BES, 535]
     */
    BQ("Bonaire, Sint Eustatius and Saba", "BES", 535),

    /**
     * <a href="http://en.wikipedia.org/wiki/Brazil">Brazil</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#BR">BR</a>, BRA, 76]
     */
    BR("Brazil", "BRA", 76),

    /**
     * <a href="http://en.wikipedia.org/wiki/The_Bahamas">Bahamas</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#BS">BS</a>, BHS, 44]
     */
    BS("Bahamas", "BHS", 44),

    /**
     * <a href="http://en.wikipedia.org/wiki/Bhutan">Bhutan</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#BT">BT</a>, BTN, 64]
     */
    BT("Bhutan", "BTN", 64),

    /**
     * <a href="http://en.wikipedia.org/wiki/Bouvet_Island">Bouvet Island</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#BV">BV</a>, BVT, 74]
     */
    BV("Bouvet Island", "BVT", 74),

    /**
     * <a href="http://en.wikipedia.org/wiki/Botswana">Botswana</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#BW">BW</a>, BWA, 72]
     */
    BW("Botswana", "BWA", 72),

    /**
     * <a href="http://en.wikipedia.org/wiki/Belarus">Belarus</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#BY">BY</a>, BLR, 112]
     */
    BY("Belarus", "BLR", 112),

    /**
     * <a href="http://en.wikipedia.org/wiki/Belize">Belize</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#BZ">BZ</a>, BLZ, 84]
     */
    BZ("Belize", "BLZ", 84),

    /**
     * <a href="http://en.wikipedia.org/wiki/Canada">Canada</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#CA">CA</a>, CAN, 124]
     */
    CA("Canada", "CAN", 124),

    /**
     * <a href="http://en.wikipedia.org/wiki/Cocos_(Keeling)_Islands">Cocos (Keeling) Islands</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#CC">CC</a>, CCK, 166]
     */
    CC("Cocos Islands", "CCK", 166),

    /**
     * <a href="http://en.wikipedia.org/wiki/Democratic_Republic_of_the_Congo">The Democratic Republic of the Congo</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#CD">CD</a>, COD, 180]
     */
    CD("The Democratic Republic of the Congo", "COD", 180),

    /**
     * <a href="http://en.wikipedia.org/wiki/Central_African_Republic">Central African Republic</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#CF">CF</a>, CAF, 140]
     */
    CF("Central African Republic", "CAF", 140),

    /**
     * <a href="http://en.wikipedia.org/wiki/Republic_of_the_Congo">Congo</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#CG">CG</a>, COG, 178]
     */
    CG("Congo", "COG", 178),

    /**
     * <a href="http://en.wikipedia.org/wiki/Switzerland">Switzerland</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#CH">CH</a>, CHE, 756]
     */
    CH("Switzerland", "CHE", 756),

    /**
     * <a href="http://en.wikipedia.org/wiki/C%C3%B4te_d%27Ivoire">C&ocirc;te d'Ivoire</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#CI">CI</a>, CIV, 384]
     */
    CI("C\u00F4te d'Ivoire", "CIV", 384),

    /**
     * <a href="http://en.wikipedia.org/wiki/Cook_Islands">Cook Islands</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#CK">CK</a>, COK, 184]
     */
    CK("Cook Islands", "COK", 184),

    /**
     * <a href="http://en.wikipedia.org/wiki/Chile">Chile</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#CL">CL</a>, CHL, 152]
     */
    CL("Chile", "CHL", 152),

    /**
     * <a href="http://en.wikipedia.org/wiki/Cameroon">Cameroon</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#CM">CM</a>, CMR, 120]
     */
    CM("Cameroon", "CMR", 120),

    /**
     * <a href="http://en.wikipedia.org/wiki/China">China</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#CN">CN</a>, CHN, 156]
     */
    CN("China", "CHN", 156),

    /**
     * <a href="http://en.wikipedia.org/wiki/Colombia">Colombia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#CO">CO</a>, COL, 170]
     */
    CO("Colombia", "COL", 170),

    /**
     * <a href="http://en.wikipedia.org/wiki/Costa_Rica">Costa Rica</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#CR">CR</a>, CRI, 188]
     */
    CR("Costa Rica", "CRI", 188),

    /**
     * <a href="http://en.wikipedia.org/wiki/Cuba">Cuba</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#CU">CU</a>, CUB, 192]
     */
    CU("Cuba", "CUB", 192),

    /**
     * <a href="http://en.wikipedia.org/wiki/Cape_Verde">Cape Verde</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#CV">CV</a>, CPV, 132]
     */
    CV("Cape Verde", "CPV", 132),

    /**
     * <a href="http://en.wikipedia.org/wiki/Cura%C3%A7ao">Cura&ccedil;ao</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#CW">CW</a>, CUW, 531]
     */
    CW("Cura/u00E7ao", "CUW", 531),

    /**
     * <a href="http://en.wikipedia.org/wiki/Christmas_Island">Christmas Island</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#CX">CX</a>, CXR, 162]
     */
    CX("Christmas Island", "CXR", 162),

    /**
     * <a href="http://en.wikipedia.org/wiki/Cyprus">Cyprus</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#CY">CY</a>, CYP, 196]
     */
    CY("Cyprus", "CYP", 196),

    /**
     * <a href="http://en.wikipedia.org/wiki/Czech_Republic">Czech Republic</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#CZ">CZ</a>, CZE, 203]
     */
    CZ("Czech Republic", "CZE", 203),

    /**
     * <a href="http://en.wikipedia.org/wiki/Germany">Germany</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#DE">DE</a>, DEU, 276]
     */
    DE("Germany", "DEU", 276),

    /**
     * <a href="http://en.wikipedia.org/wiki/Djibouti">Djibouti</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#DJ">DJ</a>, DJI, 262]
     */
    DJ("Djibouti", "DJI", 262),

    /**
     * <a href="http://en.wikipedia.org/wiki/Denmark">Denmark</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#DK">DK</a>, DNK, 208]
     */
    DK("Denmark", "DNK", 208),

    /**
     * <a href="http://en.wikipedia.org/wiki/Dominica">Dominica</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#DM">DM</a>, DMA, 212]
     */
    DM("Dominica", "DMA", 212),

    /**
     * <a href="http://en.wikipedia.org/wiki/Dominican_Republic">Dominican Republic</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#DO">DO</a>, DOM, 214]
     */
    DO("Dominican Republic", "DOM", 214),

    /**
     * <a href="http://en.wikipedia.org/wiki/Algeria">Algeria</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#DZ">DZ</a>, DZA, 12]
     */
    DZ("Algeria", "DZA", 12),

    /**
     * <a href="http://en.wikipedia.org/wiki/Ecuador">Ecuador</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#EC">EC</a>, ECU, 218]
     */
    EC("Ecuador", "ECU", 218),

    /**
     * <a href="http://en.wikipedia.org/wiki/Estonia">Estonia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#EE">EE</a>, EST, 233]
     */
    EE("Estonia", "EST", 233),

    /**
     * <a href="http://en.wikipedia.org/wiki/Egypt">Egypt</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#EG">EG</a>, EGY, 818]
     */
    EG("Egypt", "EGY", 818),

    /**
     * <a href="http://en.wikipedia.org/wiki/Western_Sahara">Western Sahara</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#EH">EH</a>, ESH, 732]
     */
    EH("Western Sahara", "ESH", 732),

    /**
     * <a href="http://en.wikipedia.org/wiki/Eritrea">Eritrea</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#ER">ER</a>, ERI, 232]
     */
    ER("Eritrea", "ERI", 232),

    /**
     * <a href="http://en.wikipedia.org/wiki/Spain">Spain</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#ES">ES</a>, ESP, 724]
     */
    ES("Spain", "ESP", 724),

    /**
     * <a href="http://en.wikipedia.org/wiki/Ethiopia">Ethiopia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#ET">ET</a>, ETH, 231]
     */
    ET("Ethiopia", "ETH", 231),

    /**
     * <a href="http://en.wikipedia.org/wiki/Finland">Finland</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#FI">FI</a>, FIN, 246]
     */
    FI("Finland", "FIN", 246),

    /**
     * <a href="http://en.wikipedia.org/wiki/Fiji">Fiji</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#">FJ</a>, FJI, 242]
     */
    FJ("Fiji", "FJI", 242),

    /**
     * <a href="http://en.wikipedia.org/wiki/Falkland_Islands">Falkland Islands (Malvinas)</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#FK">FK</a>, FLK, 238]
     */
    FK("Falkland Islands", "FLK", 238),

    /**
     * <a href="http://en.wikipedia.org/wiki/Federated_States_of_Micronesia">Federated States of Micronesia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#FM">FM</a>, FSM, 583]
     */
    FM("Federated States of Micronesia", "FSM", 583),

    /**
     * <a href="http://en.wikipedia.org/wiki/Faroe_Islands">Faroe Islands</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#FO">FO</a>, FRO, 234]
     */
    FO("Faroe Islands", "FRO", 234),

    /**
     * <a href="http://en.wikipedia.org/wiki/France">France</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#FR">FR</a>, FRA, 250]
     */
    FR("France", "FRA", 250),

    /**
     * <a href="http://en.wikipedia.org/wiki/Gabon">Gabon </a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#GA">GA</a>, GAB, 266]
     */
    GA("Gabon", "GAB", 266),

    /**
     * <a href="http://en.wikipedia.org/wiki/United_Kingdom">United Kingdom</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#GB">GB</a>, GBR, 826]
     */
    GB("United Kingdom", "GBR", 826),

    /**
     * <a href="http://en.wikipedia.org/wiki/Grenada">Grenada</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#GD">GD</a>, GRD, 308]
     */
    GD("Grenada", "GRD", 308),

    /**
     * <a href="http://en.wikipedia.org/wiki/Georgia_(country)">Georgia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#GE">GE</a>, GEO, 268]
     */
    GE("Georgia", "GEO", 268),

    /**
     * <a href="http://en.wikipedia.org/wiki/French_Guiana">French Guiana</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#GF">GF</a>, GUF, 254]
     */
    GF("French Guiana", "GUF", 254),

    /**
     * <a href="http://en.wikipedia.org/wiki/Guernsey">Guemsey</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#GG">GG</a>, GGY, 831]
     */
    GG("Guemsey", "GGY", 831),

    /**
     * <a href="http://en.wikipedia.org/wiki/Ghana">Ghana</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#GH">GH</a>, GHA, 288]
     */
    GH("Ghana", "GHA", 288),

    /**
     * <a href="http://en.wikipedia.org/wiki/Gibraltar">Gibraltar</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#GI">GI</a>, GIB, 292]
     */
    GI("Gibraltar", "GIB", 292),

    /**
     * <a href="http://en.wikipedia.org/wiki/Greenland">Greenland</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#GL">GL</a>, GRL, 304]
     */
    GL("Greenland", "GRL", 304),

    /**
     * <a href="http://en.wikipedia.org/wiki/The_Gambia">Gambia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#GM">GM</a>, GMB, 270]
     */
    GM("Gambia", "GMB", 270),

    /**
     * <a href="http://en.wikipedia.org/wiki/Guadeloupe">Guadeloupe</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#GP">GP</a>, GLP, 312]
     */
    GP("Guadeloupe", "GLP", 312),

    /**
     * <a href="http://en.wikipedia.org/wiki/Equatorial_Guinea">Equatorial Guinea</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#GQ">GQ</a>, GNQ, 226]
     */
    GQ("Equatorial Guinea", "GNQ", 226),

    /**
     * <a href="http://en.wikipedia.org/wiki/Greece">Greece</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#GR">GR</a>, GRC, 300]
     */
    GR("Greece", "GRC", 300),

    /**
     * <a href="http://en.wikipedia.org/wiki/South_Georgia_and_the_South_Sandwich_Islands">South Georgia and the South Sandwich Islands</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#GS">GS</a>, SGS, 239]
     */
    GS("South Georgia and the South Sandwich Islands", "SGS", 239),

    /**
     * <a href="http://en.wikipedia.org/wiki/Guatemala">Guatemala</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#GT">GT</a>, GTM, 320]
     */
    GT("Guatemala", "GTM", 320),

    /**
     * <a href="http://en.wikipedia.org/wiki/Guam">Guam</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#GU">GU</a>, GUM, 316]
     */
    GU("Guam", "GUM", 316),

    /**
     * <a href="http://en.wikipedia.org/wiki/Guinea-Bissau">Guinea-Bissau</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#GW">GW</a>, GNB, 624]
     */
    GW("Guinea-Bissau", "GNB", 624),

    /**
     * <a href="http://en.wikipedia.org/wiki/Guyana">Guyana</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#GY">GY</a>, GUY, 328]
     */
    GY("Guyana", "GUY", 328),

    /**
     * <a href="http://en.wikipedia.org/wiki/Hong_Kong">Hong Kong</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#HK">HK</a>, HKG, 344]
     */
    HK("Hong Kong", "HKG", 344),

    /**
     * <a href="http://en.wikipedia.org/wiki/Heard_Island_and_McDonald_Islands">Heard Island and McDonald Islands</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#HM">HM</a>, HMD, 334]
     */
    HM("Heard Island and McDonald Islands", "HMD", 334),

    /**
     * <a href="http://en.wikipedia.org/wiki/Honduras">Honduras</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#HN">HN</a>, HND, 340]
     */
    HN("Honduras", "HND", 340),

    /**
     * <a href="http://en.wikipedia.org/wiki/Croatia">Croatia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#HR">HR</a>, HRV, 191]
     */
    HR("Croatia", "HRV", 191),

    /**
     * <a href="http://en.wikipedia.org/wiki/Haiti">Haiti</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#HT">HT</a>, HTI, 332]
     */
    HT("Haiti", "HTI", 332),

    /**
     * <a href="http://en.wikipedia.org/wiki/Hungary">Hungary</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#HU">HU</a>, HUN, 348]
     */
    HU("Hungary", "HUN", 348),

    /**
     * <a href="http://en.wikipedia.org/wiki/Indonesia">Indonesia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#ID">ID</a>, IDN, 360]
     */
    ID("Indonesia", "IDN", 360),

    /**
     * <a href="http://en.wikipedia.org/wiki/Republic_of_Ireland">Ireland</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#IE">IE</a>, IRL, 372]
     */
    IE("Ireland", "IRL", 372),

    /**
     * <a href="http://en.wikipedia.org/wiki/Israel">Israel</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#IL">IL</a>, ISR, 376]
     */
    IL("Israel", "ISR", 376),

    /**
     * <a href="http://en.wikipedia.org/wiki/Isle_of_Man">Isle of Man</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#IM">IM</a>, IMN, 833]
     */
    IM("Isle of Man", "IMN", 833),

    /**
     * <a href="http://en.wikipedia.org/wiki/India">India</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#IN">IN</a>, IND, 356]
     */
    IN("India", "IND", 356),

    /**
     * <a href="http://en.wikipedia.org/wiki/British_Indian_Ocean_Territory">British Indian Ocean Territory</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#IO">IO</a>, IOT, 86]
     */
    IO("British Indian Ocean Territory", "IOT", 86),

    /**
     * <a href="http://en.wikipedia.org/wiki/Iraq">Iraq</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#IQ">IQ</a>, IRQ, 368]
     */
    IQ("Iraq", "IRQ", 368),

    /**
     * <a href="http://en.wikipedia.org/wiki/Iran">Islamic Republic of Iran</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#IR">IR</a>, IRN, 364]
     */
    IR("Islamic Republic of Iran", "IRN", 364),

    /**
     * <a href="http://en.wikipedia.org/wiki/Iceland">Iceland</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#IS">IS</a>, ISL, 352]
     */
    IS("Iceland", "ISL", 352),

    /**
     * <a href="http://en.wikipedia.org/wiki/Italy">Italy</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#IT">IT</a>, ITA, 380]
     */
    IT("Italy", "ITA", 380),

    /**
     * <a href="http://en.wikipedia.org/wiki/Jersey">Jersey</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#JE">JE</a>, JEY, 832]
     */
    JE("Jersey", "JEY", 832),

    /**
     * <a href="http://en.wikipedia.org/wiki/Jamaica">Jamaica</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#JM">JM</a>, JAM, 388]
     */
    JM("Jamaica", "JAM", 388),

    /**
     * <a href="http://en.wikipedia.org/wiki/Jordan">Jordan</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#JO">JO</a>, JOR, 400]
     */
    JO("Jordan", "JOR", 400),

    /**
     * <a href="http://en.wikipedia.org/wiki/Japan">Japan</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#JP">JP</a>, JPN, 392]
     */
    JP("Japan", "JPN", 392),

    /**
     * <a href="http://en.wikipedia.org/wiki/Kenya">Kenya</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#KE">KE</a>, KEN, 404]
     */
    KE("Kenya", "KEN", 404),

    /**
     * <a href="http://en.wikipedia.org/wiki/Kyrgyzstan">Kyrgyzstan</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#KG">KG</a>, KGZ, 417]
     */
    KG("Kyrgyzstan", "KGZ", 417),

    /**
     * <a href="http://en.wikipedia.org/wiki/Cambodia">Cambodia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#KH">KH</a>, KHM, 116]
     */
    KH("Cambodia", "KHM", 116),

    /**
     * <a href="http://en.wikipedia.org/wiki/Kiribati">Kiribati</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#KI">KI</a>, KIR, 296]
     */
    KI("Kiribati", "KIR", 296),

    /**
     * <a href="http://en.wikipedia.org/wiki/Comoros">Comoros</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#KM">KM</a>, COM, 174]
     */
    KM("Comoros", "COM", 174),

    /**
     * <a href="http://en.wikipedia.org/wiki/Saint_Kitts_and_Nevis">Saint Kitts and Nevis</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#KN">KN</a>, KNA, 659]
     */
    KN("Saint Kitts and Nevis", "KNA", 659),

    /**
     * <a href="http://en.wikipedia.org/wiki/North_Korea">Democratic People's Republic of Korea</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#KP">KP</a>, PRK, 408]
     */
    KP("Democratic People's Republic of Korea", "PRK", 408),

    /**
     * <a href="http://en.wikipedia.org/wiki/South_Korea">Republic of Korea</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#KR">KR</a>, KOR, 410]
     */
    KR("Republic of Korea", "KOR", 410),

    /**
     * <a href="http://en.wikipedia.org/wiki/Kuwait">Kuwait</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#KW">KW</a>, KWT, 414]
     */
    KW("Kuwait", "KWT", 414),

    /**
     * <a href="http://en.wikipedia.org/wiki/Cayman_Islands">Cayman Islands</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#KY">KY</a>, CYM, 136]
     */
    KY("Cayman Islands", "CYM", 136),

    /**
     * <a href="http://en.wikipedia.org/wiki/Kazakhstan">Kazakhstan</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#KZ">KZ</a>, KAZ, 398]
     */
    KZ("Kazakhstan", "KAZ", 398),

    /**
     * <a href="http://en.wikipedia.org/wiki/Laos">Lao People's Democratic Republic</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#LA">LA</a>, LAO, 418]
     */
    LA("Lao People's Democratic Republic", "LAO", 418),

    /**
     * <a href="http://en.wikipedia.org/wiki/Lebanon">Lebanon</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#LB">LB</a>, LBN, 422]
     */
    LB("Lebanon", "LBN", 422),

    /**
     * <a href="http://en.wikipedia.org/wiki/Saint_Lucia">Saint Lucia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#LC">LC</a>, LCA, 662]
     */
    LC("Saint Lucia", "LCA", 662),

    /**
     * <a href="http://en.wikipedia.org/wiki/Liechtenstein">Liechtenstein</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#LI">LI</a>, LIE, 438]
     */
    LI("Liechtenstein", "LIE", 438),

    /**
     * <a href="http://en.wikipedia.org/wiki/Sri_Lanka">Sri Lanka</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#LK">LK</a>, LKA, 144]
     */
    LK("Sri Lanka", "LKA", 144),

    /**
     * <a href="http://en.wikipedia.org/wiki/Liberia">Liberia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#LR">LR</a>, LBR, 430]
     */
    LR("Liberia", "LBR", 430),

    /**
     * <a href="http://en.wikipedia.org/wiki/Lesotho">Lesotho</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#LS">LS</a>, LSO, 426]
     */
    LS("Lesotho", "LSO", 426),

    /**
     * <a href="http://en.wikipedia.org/wiki/Lithuania">Lithuania</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#LT">LT</a>, LTU, 440]
     */
    LT("Lithuania", "LTU", 440),

    /**
     * <a href="http://en.wikipedia.org/wiki/Luxembourg">Luxembourg</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#LU">LU</a>, LUX, 442]
     */
    LU("Luxembourg", "LUX", 442),

    /**
     * <a href="http://en.wikipedia.org/wiki/Latvia">Latvia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#LV">LV</a>, LVA, 428]
     */
    LV("Latvia", "LVA", 428),

    /**
     * <a href="http://en.wikipedia.org/wiki/Libya">Libya</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#LY">LY</a>, LBY, 434]
     */
    LY("Libya", "LBY", 434),

    /**
     * <a href="http://en.wikipedia.org/wiki/Morocco">Morocco</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#MA">MA</a>, MAR, 504]
     */
    MA("Morocco", "MAR", 504),

    /**
     * <a href="http://en.wikipedia.org/wiki/Monaco">Monaco</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#MC">MC</a>, MCO, 492]
     */
    MC("Monaco", "MCO", 492),

    /**
     * <a href="http://en.wikipedia.org/wiki/Moldova">Republic of Moldova</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#MD">MD</a>, MDA, 498]
     */
    MD("Republic of Moldova", "MDA", 498),

    /**
     * <a href="http://en.wikipedia.org/wiki/Montenegro">Montenegro</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#ME">ME</a>, MNE, 499]
     */
    ME("Montenegro", "MNE", 499),

    /**
     * <a href="http://en.wikipedia.org/wiki/Collectivity_of_Saint_Martin">Saint Martin (French part)</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#MF">MF</a>, MAF, 663]
     */
    MF("Saint Martin", "MAF", 663),

    /**
     * <a href="http://en.wikipedia.org/wiki/Madagascar">Madagascar</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#MG">MG</a>, MDG, 450]
     */
    MG("Madagascar", "MDG", 450),

    /**
     * <a href="http://en.wikipedia.org/wiki/Marshall_Islands">Marshall Islands</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#MH">MH</a>, MHL, 584]
     */
    MH("Marshall Islands", "MHL", 584),

    /**
     * <a href="http://en.wikipedia.org/wiki/Republic_of_Macedonia">The former Yugoslav Republic of Macedonia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#MK">MK</a>, MKD, 807]
     */
    MK("The former Yugoslav Republic of Macedonia", "MKD", 807),

    /**
     * <a href="http://en.wikipedia.org/wiki/Mali">Mali</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#ML">ML</a>, MLI, 466]
     */
    ML("Mali", "MLI", 466),

    /**
     * <a href="http://en.wikipedia.org/wiki/Myanmar">Myanmar</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#MM">MM</a>, MMR, 104]
     */
    MM("Myanmar", "MMR", 104),

    /**
     * <a href="http://en.wikipedia.org/wiki/Mongolia">Mongolia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#MN">MN</a>, MNG, 496]
     */
    MN("Mongolia", "MNG", 496),

    /**
     * <a href="http://en.wikipedia.org/wiki/Macau">Macao</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#MO">MO</a>, MCO, 492]
     */
    MO("Macao", "MCO", 492),

    /**
     * <a href="http://en.wikipedia.org/wiki/Northern_Mariana_Islands">Northern Mariana Islands</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#MP">MP</a>, MNP, 580]
     */
    MP("Northern Mariana Islands", "MNP", 580),

    /**
     * <a href="http://en.wikipedia.org/wiki/Martinique">Martinique</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#MQ">MQ</a>, MTQ, 474]
     */
    MQ("Martinique", "MTQ", 474),

    /**
     * <a href="http://en.wikipedia.org/wiki/Mauritania">Mauritania</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#MR">MR</a>, MRT, 478]
     */
    MR("Mauritania", "MRT", 478),

    /**
     * <a href="http://en.wikipedia.org/wiki/Montserrat">Montserrat</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#MS">MS</a>, MSR, 500]
     */
    MS("Montserrat", "MSR", 500),

    /**
     * <a href="http://en.wikipedia.org/wiki/Malta">Malta</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#MT">MT</a>, MLT, 470]
     */
    MT("Malta", "MLT", 470),

    /**
     * <a href="http://en.wikipedia.org/wiki/Mauritius">Mauritius</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#MU">MU</a>, MUS, 480]
     */
    MU("Mauritius", "MUS", 480),

    /**
     * <a href="http://en.wikipedia.org/wiki/Maldives">Maldives</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#MV">MV</a>, MDV, 462]
     */
    MV("Maldives", "MDV", 462),

    /**
     * <a href="http://en.wikipedia.org/wiki/Malawi">Malawi</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#MW">MW</a>, MWI, 454]
     */
    MW("Malawi", "MWI", 454),

    /**
     * <a href="http://en.wikipedia.org/wiki/Mexico">Mexico</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#MX">MX</a>, MEX, 484]
     */
    MX("Mexico", "MEX", 484),

    /**
     * <a href="http://en.wikipedia.org/wiki/Malaysia">Malaysia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#MY">MY</a>, MYS, 458]
     */
    MY("Malaysia", "MYS", 458),

    /**
     * <a href="http://en.wikipedia.org/wiki/Mozambique">Mozambique</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#MZ">MZ</a>, MOZ, 508]
     */
    MZ("Mozambique", "MOZ", 508),

    /**
     * <a href="http://en.wikipedia.org/wiki/Namibia">Namibia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#NA">NA</a>, NAM, 516]
     */
    NA("Namibia", "NAM", 516),

    /**
     * <a href="http://en.wikipedia.org/wiki/New_Caledonia">New Caledonia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#NC">NC</a>, NCL, 540]
     */
    NC("New Caledonia", "NCL", 540),

    /**
     * <a href="http://en.wikipedia.org/wiki/Niger">Niger</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#NE">NE</a>, NER, 562]
     */
    NE("Niger", "NER", 562),

    /**
     * <a href="http://en.wikipedia.org/wiki/Norfolk_Island">Norfolk Island</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#NF">NF</a>, NFK, 574]
     */
    NF("Norfolk Island", "NFK", 574),

    /**
     * <a href="http://en.wikipedia.org/wiki/Nigeria">Nigeria</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#NG">NG</a>, NGA, 566]
     */
    NG("Nigeria","NGA", 566),

    /**
     * <a href="http://en.wikipedia.org/wiki/Nicaragua">Nicaragua</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#NI">NI</a>, NIC, 558]
     */
    NI("Nicaragua", "NIC", 558),

    /**
     * <a href="http://en.wikipedia.org/wiki/Netherlands">Netherlands</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#NL">NL</a>, NLD, 528]
     */
    NL("Netherlands", "NLD", 528),

    /**
     * <a href="http://en.wikipedia.org/wiki/Norway">Norway</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#NO">NO</a>, NOR, 578]
     */
    NO("Norway", "NOR", 578),

    /**
     * <a href="http://en.wikipedia.org/wiki/Nepal">Nepal</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#NP">NP</a>, NPL, 524]
     */
    NP("Nepal", "NPL", 524),

    /**
     * <a href="http://en.wikipedia.org/wiki/Nauru">Nauru</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#NR">NR</a>, NRU, 520]
     */
    NR("Nauru", "NRU", 520),

    /**
     * <a href="http://en.wikipedia.org/wiki/Niue">Niue</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#NU">NU</a>, NIU, 570]
     */
    NU("Niue", "NIU", 570),

    /**
     * <a href="http://en.wikipedia.org/wiki/New_Zealand">New Zealand</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#NZ">NZ</a>, NZL, 554]
     */
    NZ("New Zealand", "NZL", 554),

    /**
     * <a href=http://en.wikipedia.org/wiki/Oman"">Oman</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#OM">OM</a>, OMN, 512]
     */
    OM("Oman", "OMN", 512),

    /**
     * <a href="http://en.wikipedia.org/wiki/Panama">Panama</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#PA">PA</a>, PAN, 591]
     */
    PA("Panama", "PAN", 591),

    /**
     * <a href="http://en.wikipedia.org/wiki/Peru">Peru</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#PE">PE</a>, PER, 604]
     */
    PE("Peru", "PER", 604),

    /**
     * <a href="http://en.wikipedia.org/wiki/French_Polynesia">French Polynesia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#PF">PF</a>, PYF, 258]
     */
    PF("French Polynesia", "PYF", 258),

    /**
     * <a href="http://en.wikipedia.org/wiki/Papua_New_Guinea">Papua New Guinea</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#PG">PG</a>, PNG, 598]
     */
    PG("Papua New Guinea", "PNG", 598),

    /**
     * <a href="http://en.wikipedia.org/wiki/Philippines">Philippines</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#PH">PH</a>, PHL, 608]
     */
    PH("Philippines", "PHL", 608),

    /**
     * <a href="http://en.wikipedia.org/wiki/Pakistan">Pakistan</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#PK">PK</a>, PAK, 586]
     */
    PK("Pakistan", "PAK", 586),

    /**
     * <a href="http://en.wikipedia.org/wiki/Poland">Poland</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#PL">PL</a>, POL, 616]
     */
    PL("Poland", "POL", 616),

    /**
     * <a href="http://en.wikipedia.org/wiki/Saint_Pierre_and_Miquelon">Saint Pierre and Miquelon</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#PM">PM</a>, SPM, 666]
     */
    PM("Saint Pierre and Miquelon", "SPM", 666),

    /**
     * <a href="http://en.wikipedia.org/wiki/Pitcairn_Islands">Pitcairn</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#PN">PN</a>, PCN, 612]
     */
    PN("Pitcairn", "PCN", 612),

    /**
     * <a href="http://en.wikipedia.org/wiki/Puerto_Rico">Puerto Rico</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#PR">PR</a>, PRI, 630]
     */
    PR("Puerto Rico", "PRI", 630),

    /**
     * <a href="http://en.wikipedia.org/wiki/Palestinian_territories">Occupied Palestinian Territory</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#PS">PS</a>, PSE, 275]
     */
    PS("Occupied Palestinian Territory", "PSE", 275),

    /**
     * <a href="http://en.wikipedia.org/wiki/Portugal">Portugal</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#PT">PT</a>, PRT, 620]
     */
    PT("Portugal", "PRT", 620),

    /**
     * <a href="http://en.wikipedia.org/wiki/Palau">Palau</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#PW">PW</a>, PLW, 585]
     */
    PW("Palau", "PLW", 585),

    /**
     * <a href="http://en.wikipedia.org/wiki/Paraguay">Paraguay</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#PY">PY</a>, PRY, 600]
     */
    PY("Paraguay", "PRY", 600),

    /**
     * <a href="http://en.wikipedia.org/wiki/Qatar">Qatar</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#QA">QA</a>, QAT, 634]
     */
    QA("Qatar", "QAT", 634),

    /**
     * <a href="http://en.wikipedia.org/wiki/R%C3%A9union">R&eacute;union</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#RE">RE</a>, REU, 638]
     */
    RE("R\u00E9union", "REU", 638),

    /**
     * <a href="http://en.wikipedia.org/wiki/Romania">Romania</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#RO">RO</a>, ROU, 642]
     */
    RO("Romania", "ROU", 642),

    /**
     * <a href="http://en.wikipedia.org/wiki/Serbia">Serbia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#RS">RS</a>, SRB, 688]
     */
    RS("Serbia", "SRB", 688),

    /**
     * <a href="http://en.wikipedia.org/wiki/Russia">Russian Federation</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#RU">RU</a>, RUS, 643]
     */
    RU("Russian Federation", "RUS", 643),

    /**
     * <a href="http://en.wikipedia.org/wiki/Rwanda">Rwanda</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#RW">RW</a>, RWA, 646]
     */
    RW("Rwanda", "RWA", 646),

    /**
     * <a href="http://en.wikipedia.org/wiki/Saudi_Arabia">Saudi Arabia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#SA">SA</a>, SAU, 682]
     */
    SA("Saudi Arabia", "SAU", 682),

    /**
     * <a href="http://en.wikipedia.org/wiki/Solomon_Islands">Solomon Islands</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#SB">SB</a>, SLB, 90]
     */
    SB("Solomon Islands", "SLB", 90),

    /**
     * <a href="http://en.wikipedia.org/wiki/Seychelles">Seychelles</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#SC">SC</a>, SYC, 690]
     */
    SC("Seychelles", "SYC", 690),

    /**
     * <a href="http://en.wikipedia.org/wiki/Sudan">Sudan</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#SD">SD</a>, SDN, 729]
     */
    SD("Sudan", "SDN", 729),

    /**
     * <a href="http://en.wikipedia.org/wiki/Sweden">Sweden</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#SE">SE</a>, SWE, 752]
     */
    SE("Sweden", "SWE", 752),

    /**
     * <a href="http://en.wikipedia.org/wiki/Singapore">Singapore</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#SG">SG</a>, SGP, 702]
     */
    SG("Singapore", "SGP", 702),

    /**
     * <a href="http://en.wikipedia.org/wiki/Saint_Helena,_Ascension_and_Tristan_da_Cunha">Saint Helena, Ascension and Tristan da Cunha</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#SH">SH</a>, SHN, 654]
     */
    SH("Saint Helena, Ascension and Tristan da Cunha", "SHN", 654),

    /**
     * <a href="http://en.wikipedia.org/wiki/Slovenia">Slovenia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#SI">SI</a>, SVN, 705]
     */
    SI("Slovenia", "SVN", 705),

    /**
     * <a href="http://en.wikipedia.org/wiki/Svalbard_and_Jan_Mayen">Svalbard and Jan Mayen</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#SJ">SJ</a>, SJM, 744]
     */
    SJ("Svalbard and Jan Mayen", "SJM", 744),

    /**
     * <a href="http://en.wikipedia.org/wiki/Slovakia">Slovakia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#SK">SK</a>, SVK, 703]
     */
    SK("Slovakia", "SVK", 703),

    /**
     * <a href="http://en.wikipedia.org/wiki/Sierra_Leone">Sierra Leone</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#SL">SL</a>, SLE, 694]
     */
    SL("Sierra Leone", "SLE", 694),

    /**
     * <a href="http://en.wikipedia.org/wiki/San_Marino">San Marino</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#SM">SM</a>, SMR, 674]
     */
    SM("San Marino", "SMR", 674),

    /**
     * <a href="http://en.wikipedia.org/wiki/Senegal">Senegal</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#SN">SN</a>, SEN, 686]
     */
    SN("Senegal", "SEN", 686),

    /**
     * <a href="http://en.wikipedia.org/wiki/Somalia">Somalia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#SO">SO</a>, SOM, 706]
     */
    SO("Somalia", "SOM", 706),

    /**
     * <a href="http://en.wikipedia.org/wiki/Suriname">Suriname</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#SR">SR</a>, SUR, 740]
     */
    SR("Suriname", "SUR", 740),

    /**
     * <a href="http://en.wikipedia.org/wiki/South_Sudan">South Sudan</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#SS">SS</a>, SSD, 728]
     */
    SS("South Sudan", "SSD", 728),

    /**
     * <a href="http://en.wikipedia.org/wiki/S%C3%A3o_Tom%C3%A9_and_Pr%C3%ADncipe">Sao Tome and Principe</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#ST">ST</a>, STP, 678]
     */
    ST("Sao Tome and Principe", "STP", 678),

    /**
     * <a href="http://en.wikipedia.org/wiki/El_Salvador">El Salvador</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#SV">SV</a>, SLV, 222]
     */
    SV("El Salvador", "SLV", 222),

    /**
     * <a href="http://en.wikipedia.org/wiki/Sint_Maarten">Sint Maarten (Dutch part)</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#SX">SX</a>, SXM, 534]
     */
    SX("Sint Maarten", "SXM", 534),

    /**
     * <a href="http://en.wikipedia.org/wiki/Syria">Syrian Arab Republic</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#SY">SY</a>, SYR, 760]
     */
    SY("Syrian Arab Republic", "SYR", 760),

    /**
     * <a href="http://en.wikipedia.org/wiki/Swaziland">Swaziland</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#SZ">SZ</a>, SWZ, 748]
     */
    SZ("Swaziland", "SWZ", 748),

    /**
     * <a href="http://en.wikipedia.org/wiki/Turks_and_Caicos_Islands">Turks and Caicos Islands</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#TC">TC</a>, TCA, 796]
     */
    TC("Turks and Caicos Islands", "TCA", 796),

    /**
     * <a href="http://en.wikipedia.org/wiki/Chad">Chad</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#TD">TD</a>, TCD, 148]
     */
    TD("Chad", "TCD", 148),

    /**
     * <a href="http://en.wikipedia.org/wiki/French_Southern_and_Antarctic_Lands">French Southern Territories</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#TF">TF</a>, ATF, 260]
     */
    TF("French Southern Territories", "ATF", 260),

    /**
     * <a href="http://en.wikipedia.org/wiki/Togo">Togo</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#TG">TG</a>, TGO, 768]
     */
    TG("Togo", "TGO", 768),

    /**
     * <a href="http://en.wikipedia.org/wiki/Thailand">Thailand</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#TH">TH</a>, THA, 764]
     */
    TH("Thailand", "THA", 764),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tajikistan">Tajikistan</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#TJ">TJ</a>, TJK, 762]
     */
    TJ("Tajikistan", "TJK", 762),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tokelau">Tokelau</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#TK">TK</a>, TKL, 772]
     */
    TK("Tokelau", "TKL", 772),

    /**
     * <a href="http://en.wikipedia.org/wiki/East_Timor">Timor-Leste</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#TL">TL</a>, TLS, 626]
     */
    TL("Timor-Leste", "TLS", 626),

    /**
     * <a href="http://en.wikipedia.org/wiki/Turkmenistan">Turkmenistan</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#TM">TM</a>, TKM, 795]
     */
    TM("Turkmenistan", "TKM", 795),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tunisia">Tunisia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#TN">TN</a>, TUN, 788]
     */
    TN("Tunisia", "TUN", 788),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tonga">Tonga</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#TO">TO</a>, TON, 776]
     */
    TO("Tonga", "TON", 776),

    /**
     * <a href="http://en.wikipedia.org/wiki/Turkey">Turkey</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#TR">TR</a>, TUR, 792]
     */
    TR("Turkey", "TUR", 792),

    /**
     * <a href="http://en.wikipedia.org/wiki/Trinidad_and_Tobago">Trinidad and Tobago</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#TT">TT</a>, TTO, 780]
     */
    TT("Trinidad and Tobago", "TTO", 780),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tuvalu">Tuvalu</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#TV">TV</a>, TUV, 798]
     */
    TV("Tuvalu", "TUV", 798),

    /**
     * <a href="http://en.wikipedia.org/wiki/Taiwan">Taiwan, Province of China</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#TW">TW</a>, TWN, 158]
     */
    TW("Taiwan, Province of China", "TWN", 158),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tanzania">United Republic of Tanzania</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#TZ">TZ</a>, TZA, 834]
     */
    TZ("United Republic of Tanzania", "TZA", 834),

    /**
     * <a href="http://en.wikipedia.org/wiki/Ukraine">Ukraine</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#UA">UA</a>, UKR, 804]
     */
    UA("Ukraine", "UKR", 804),

    /**
     * <a href="http://en.wikipedia.org/wiki/Uganda">Uganda</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#UG">UG</a>, UGA, 800]
     */
    UG("Uganda", "UGA", 800),

    /**
     * <a href="http://en.wikipedia.org/wiki/United_States_Minor_Outlying_Islands">United States Minor Outlying Islands</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#UM">UM</a>, UMI, 581]
     */
    UM("United States Minor Outlying Islands", "UMI", 581),

    /**
     * <a href="http://en.wikipedia.org/wiki/United_States">United States</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#US">US</a>, USA, 840]
     */
    US("United States", "USA", 840),

    /**
     * <a href="http://en.wikipedia.org/wiki/Uruguay">Uruguay</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#UY">UY</a>, URY, 858]
     */
    UY("Uruguay", "URY", 858),

    /**
     * <a href="http://en.wikipedia.org/wiki/Uzbekistan">Uzbekistan</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#UZ">UZ</a>, UZB, 860]
     */
    UZ("Uzbekistan", "UZB", 860),

    /**
     * <a href="http://en.wikipedia.org/wiki/Vatican_City">Holy See (Vatican City State)</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#VA">VA</a>, VAT, 336]
     */
    VA("Holy See", "VAT", 336),

    /**
     * <a href="http://en.wikipedia.org/wiki/Saint_Vincent_and_the_Grenadines">Saint Vincent and the Grenadines</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#VC">VC</a>, VCT, 670]
     */
    VC("Saint Vincent and the Grenadines", "VCT", 670),

    /**
     * <a href="http://en.wikipedia.org/wiki/Venezuela">Bolivarian Republic of Venezuela</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#VE">VE</a>, VEN, 862]
     */
    VE("Bolivarian Republic of Venezuela", "VEN", 862),

    /**
     * <a href="http://en.wikipedia.org/wiki/British_Virgin_Islands">British Virgin Islands</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#VG">VG</a>, VGB, 92]
     */
    VG("British Virgin Islands", "VGB", 92),

    /**
     * <a href="http://en.wikipedia.org/wiki/United_States_Virgin_Islands">Virgin Islands, U.S.</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#VI">VI</a>, VIR, 850]
     */
    VI("Virgin Islands, U.S.", "VIR", 850),

    /**
     * <a href="http://en.wikipedia.org/wiki/Vietnam">Viet Nam</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#VN">VN</a>, VNM, 704]
     */
    VN("Viet Nam", "VNM", 704),

    /**
     * <a href="http://en.wikipedia.org/wiki/Vanuatu">Vanuatu</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#VU">VU</a>, VUT, 548]
     */
    VU("Vanuatu", "VUT", 548),

    /**
     * <a href="http://en.wikipedia.org/wiki/Wallis_and_Futuna">Wallis and Futuna</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#WF">WF</a>, WLF, 876]
     */
    WF("Wallis and Futuna", "WLF", 876),

    /**
     * <a href="http://en.wikipedia.org/wiki/Samoa">Samoa</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#WS">WS</a>, WSM, 882]
     */
    WS("Samoa", "WSM", 882),

    /**
     * <a href="http://en.wikipedia.org/wiki/Yemen">Yemen</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#YE">YE</a>, YEM, 887]
     */
    YE("Yemen", "YEM", 887),

    /**
     * <a href="http://en.wikipedia.org/wiki/Mayotte">Mayotte</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#YT">YT</a>, MYT, 175]
     */
    YT("Mayotte", "MYT", 175),

    /**
     * <a href="http://en.wikipedia.org/wiki/South_Africa">South Africa</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#ZA">ZA</a>, ZAF, 710]
     */
    ZA("South Africa", "ZAF", 710),

    /**
     * <a href="http://en.wikipedia.org/wiki/Zambia">Zambia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#ZM">ZM</a>, ZMB, 894]
     */
    ZM("Zambia", "ZMB", 894),

    /**
     * <a href="http://en.wikipedia.org/wiki/Zimbabwe">Zimbabwe</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#ZW">ZW</a>, ZWE, 716]
     */
    ZW("Zimbabwe", "ZWE", 716),
    ;


    private static final Map<String, CountryCode> alpha3Map = new HashMap<String, CountryCode>();
    private static final Map<Integer, CountryCode> numericMap = new HashMap<Integer, CountryCode>();


    static
    {
        for (CountryCode cc : values())
        {
            alpha3Map.put(cc.getAlpha3(), cc);
            numericMap.put(cc.getNumeric(), cc);
        }
    }


    private final String name;
    private final String alpha3;
    private final int numeric;


    private CountryCode(String name, String alpha3, int numeric)
    {
        this.name = name;
        this.alpha3 = alpha3;
        this.numeric = numeric;
    }


    /**
     * Get the country name.
     *
     * @return
     *         The country name.
     */
    public String getName()
    {
        return name;
    }


    /**
     * Get the <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2"
     * >ISO 3166-1 alpha-2</a> code.
     *
     * @return
     *         The <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2"
     *         >ISO 3166-1 alpha-2</a> code.
     */
    public String getAlpha2()
    {
        return name();
    }


    /**
     * Get the <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-3"
     * >ISO 3166-1 alpha-3</a> code.
     *
     * @return
     *         The <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-3"
     *         >ISO 3166-1 alpha-3</a> code.
     */
    public String getAlpha3()
    {
        return alpha3;
    }


    /**
     * Get the <a href="http://en.wikipedia.org/wiki/ISO_3166-1_numeric"
     * >ISO 3166-1 numeric</a> code.
     *
     * @return
     *         The <a href="http://en.wikipedia.org/wiki/ISO_3166-1_numeric"
     *         >ISO 3166-1 numeric</a> code.
     */
    public int getNumeric()
    {
        return numeric;
    }


    /**
     * Get a CountryCode that corresponds to a given ISO 3166-1
     * <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">alpha-2</a> or
     * <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-3">alpha-3</a> code.
     *
     * @param code
     *         An ISO 3166-1 <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2"
     *         >alpha-2</a> or <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-3"
     *         >alpha-3</a> code.
     *
     * @return
     *         A CountryCode instance, or null if not found.
     */
    public static CountryCode getByCode(String code)
    {
        if (code == null)
        {
            return null;
        }

        switch (code.length())
        {
            case 2:
                return getByAlpha2Code(code);

            case 3:
                return getByAlpha3Code(code);

            default:
                return null;
        }
    }


    private static CountryCode getByAlpha2Code(String code)
    {
        try
        {
            return Enum.valueOf(CountryCode.class, code);
        }
        catch (IllegalArgumentException e)
        {
            return null;
        }
    }


    private static CountryCode getByAlpha3Code(String code)
    {
        return alpha3Map.get(code);
    }


    /**
     * Get a CountryCode that corresponds to a given
     * <a href="http://en.wikipedia.org/wiki/ISO_3166-1_numeric">ISO 3166-1
     * numeric</a> code.
     *
     * @param code
     *         An <a href="http://en.wikipedia.org/wiki/ISO_3166-1_numeric"
     *         >ISO 3166-1 numeric</a> code.
     *
     * @return
     *         A CountryCode instance, or null if not found.
     */
    public static CountryCode getByCode(int code)
    {
        return numericMap.get(code);
    }
}
