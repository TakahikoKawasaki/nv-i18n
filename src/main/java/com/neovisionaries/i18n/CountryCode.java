/*
 * Copyright (C) 2012-2019 Neo Visionaries Inc.
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


import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;


/**
 * <a href="http://en.wikipedia.org/wiki/ISO_3166-1">ISO 3166-1</a> country code.
 *
 * <p>
 * Enum names of this enum themselves are represented by
 * <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>
 * code (2-letter upper-case alphabets). There are instance methods to get the
 * country name ({@link #getName()}), the
 * <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-3" >ISO 3166-1 alpha-3</a>
 * code ({@link #getAlpha3()}) and the
 * <a href="http://en.wikipedia.org/wiki/ISO_3166-1_numeric">ISO 3166-1 numeric</a>
 * code ({@link #getNumeric()}).
 * In addition, there are static methods to get a {@code CountryCode} instance that
 * corresponds to a given alpha-2/alpha-3/numeric code ({@link #getByCode(String)},
 * {@link #getByCode(int)}).
 * </p>
 *
 * <pre style="background-color: #EEEEEE; margin-left: 2em; margin-right: 2em; border: 1px solid black; padding: 0.5em;">
 * <span style="color: darkgreen;">// List all the country codes.</span>
 * for (CountryCode code : CountryCode.values())
 * {
 *     <span style="color: darkgreen;">// For example, "[US] United States" is printed.</span>
 *     System.out.format(<span style="color: darkred;">"[%s] %s\n"</span>, code, code.{@link #getName()});
 * }
 *
 * <span style="color: darkgreen;">// Get a CountryCode instance by ISO 3166-1 code.</span>
 * CountryCode code = CountryCode.{@link #getByCode(String) getByCode}(<span style="color: darkred;">"JP"</span>);
 *
 * <span style="color: darkgreen;">// Print all the information. Output will be:</span>
 * <span style="color: darkgreen;">//</span>
 * <span style="color: darkgreen;">//     Country name            = Japan</span>
 * <span style="color: darkgreen;">//     ISO 3166-1 alpha-2 code = JP</span>
 * <span style="color: darkgreen;">//     ISO 3166-1 alpha-3 code = JPN</span>
 * <span style="color: darkgreen;">//     ISO 3166-1 numeric code = 392</span>
 * <span style="color: darkgreen;">//     Assignment state        = OFFICIALLY_ASSIGNED</span>
 * <span style="color: darkgreen;">//</span>
 * System.out.println(<span style="color: darkred;">"Country name            = "</span> + code.{@link #getName()});
 * System.out.println(<span style="color: darkred;">"ISO 3166-1 alpha-2 code = "</span> + code.{@link #getAlpha2()});
 * System.out.println(<span style="color: darkred;">"ISO 3166-1 alpha-3 code = "</span> + code.{@link #getAlpha3()});
 * System.out.println(<span style="color: darkred;">"ISO 3166-1 numeric code = "</span> + code.{@link #getNumeric()});
 * System.out.println(<span style="color: darkred;">"Assignment state        = "</span> + code.{@link #getAssignment()});
 *
 * <span style="color: darkgreen;">// Convert to a Locale instance.</span>
 * {@link Locale} locale = code.{@link #toLocale()};
 *
 * <span style="color: darkgreen;">// Get a CountryCode by a Locale instance.</span>
 * code = CountryCode.{@link #getByLocale(Locale) getByLocale}(locale);
 *
 * <span style="color: darkgreen;">// Get the currency of the country.</span>
 * {@link Currency} currency = code.{@link #getCurrency()};
 *
 * <span style="color: darkgreen;">// Get a list by a regular expression for names.
 * //
 * // The list will contain:
 * //
 * //     CountryCode.AE : United Arab Emirates
 * //     CountryCode.GB : United Kingdom
 * //     CountryCode.TZ : Tanzania, United Republic of
 * //     CountryCode.UK : United Kingdom
 * //     CountryCode.UM : United States Minor Outlying Islands
 * //     CountryCode.US : United States
 * //</span>
 * List&lt;CountryCode&gt; list = CountryCode.{@link #findByName(String) findByName}(<span style="color: darkred;">".*United.*"</span>);
 *
 * <span style="color: darkgreen;">
 * // For backward compatibility for older versions than 1.16, some
 * // 4-letter ISO 3166-3 codes are accepted by getByCode(String, boolean)
 * // and its variants. To be concrete:
 * //
 * //     <a href="https://en.wikipedia.org/wiki/ISO_3166-3#ANHH">ANHH</a> : CountryCode.AN
 * //     <a href="https://en.wikipedia.org/wiki/ISO_3166-3#BUMM">BUMM</a> : CountryCode.BU
 * //     <a href="https://en.wikipedia.org/wiki/ISO_3166-3#CSXX">CSXX</a> : CountryCode.CS
 * //     <a href="https://en.wikipedia.org/wiki/ISO_3166-3#NTHH">NTHH</a> : CountryCode.NT
 * //     <a href="https://en.wikipedia.org/wiki/ISO_3166-3#TPTL">TPTL</a> : CountryCode.TP
 * //     <a href="https://en.wikipedia.org/wiki/ISO_3166-3#YUCS">YUCS</a> : CountryCode.YU
 * //     <a href="https://en.wikipedia.org/wiki/ISO_3166-3#ZRCD">ZRCD</a> : CountryCode.ZR
 * //</span>
 * code = CountryCode.{@link #getByCode(String) getByCode}(<span style="color: darkred;">"ANHH"</span>);
 * </pre>
 *
 * @author Takahiko Kawasaki
 */
public enum CountryCode
{

    /**
     * Undefined [UNDEFINED, null, -1, User assigned]
     *
     * <p>
     * This is not an official ISO 3166-1 code.
     * </p>
     *
     * @since 1.14
     */
    UNDEFINED("Undefined", null, -1, Assignment.USER_ASSIGNED)
    {
        @Override
        public Locale toLocale()
        {
            return LocaleCode.undefined.toLocale();
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Ascension_Island">Ascension Island</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#AC">AC</a>, ASC, -1,
     * Exceptionally reserved]
     */
    AC("Ascension Island", "ASC", -1, Assignment.EXCEPTIONALLY_RESERVED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Andorra">Andorra</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#AD">AD</a>, AND, 16,
     * Officially assigned]
     */
    AD("Andorra", "AND", 20, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/United_Arab_Emirates">United Arab Emirates</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#AE">AE</a>, AE, 784,
     * Officially assigned]
     */
    AE("United Arab Emirates", "ARE", 784, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Afghanistan">Afghanistan</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#AF">AF</a>, AFG, 4,
     * Officially assigned]
     */
    AF("Afghanistan", "AFG", 4, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Antigua_and_Barbuda">Antigua and Barbuda</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#AG">AG</a>, ATG, 28,
     * Officially assigned]
     */
    AG("Antigua and Barbuda", "ATG", 28, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Anguilla">Anguilla</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#AI">AI</a>, AIA, 660,
     * Officially assigned]
     */
    AI("Anguilla", "AIA", 660, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Albania">Albania</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#AL">AL</a>, ALB, 8,
     * Officially assigned]
     */
    AL("Albania", "ALB", 8, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Armenia">Armenia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#AM">AM</a>, ARM, 51,
     * Officially assigned]
     */
    AM("Armenia", "ARM", 51, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Netherlands_Antilles">Netherlands Antilles</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#AN">AN</a>, ANT, 530,
     * Traditionally reserved]
     *
     * <p>
     * Since version 1.16, the value of alpha-3 code of this entry is {@code ANT}
     * (not <code><a href="http://en.wikipedia.org/wiki/ISO_3166-3#ANHH">ANHH</a></code>).
     * </p>
     */
    AN("Netherlands Antilles", "ANT", 530, Assignment.TRANSITIONALLY_RESERVED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Angola">Angola</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#AO">AO</a>, AGO, 24,
     * Officially assigned]
     */
    AO("Angola", "AGO", 24, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Antarctica">Antarctica</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#AQ">AQ</a>, ATA, 10,
     * Officially assigned]
     */
    AQ("Antarctica", "ATA", 10, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Argentina">Argentina</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#AR">AR</a>, ARG, 32,
     * Officially assigned]
     */
    AR("Argentina", "ARG", 32, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/American_Samoa">American Samoa</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#AS">AS</a>, ASM, 16,
     * Officially assigned]
     */
    AS("American Samoa", "ASM", 16, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Austria">Austria</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#AT">AT</a>, AUT, 40,
     * Officially assigned]
     */
    AT("Austria", "AUT", 40, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Australia">Australia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#AU">AU</a>, AUS, 36,
     * Officially assigned]
     */
    AU("Australia", "AUS", 36, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Aruba">Aruba</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#AW">AW</a>, ABW, 533,
     * Officially assigned]
     */
    AW("Aruba", "ABW", 533, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/%C3%85land_Islands">&Aring;land Islands</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#AX">AX</a>, ALA, 248,
     * Officially assigned]
     *
     * <p>
     * The country name was changed from "\u212Bland Islands" (up to 1.14)
     * to "\u00C5land Islands" (since 1.15).
     * </p>
     */
    AX("\u00C5land Islands", "ALA", 248, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Azerbaijan">Azerbaijan</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#AZ">AZ</a>, AZE, 31,
     * Officially assigned]
     */
    AZ("Azerbaijan", "AZE", 31, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Bosnia_and_Herzegovina">Bosnia and Herzegovina</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#BA">BA</a>, BIH, 70,
     * Officially assigned]
     */
    BA("Bosnia and Herzegovina", "BIH", 70, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Barbados">Barbados</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#BB">BB</a>, BRB, 52,
     * Officially assigned]
     */
    BB("Barbados", "BRB", 52, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Bangladesh">Bangladesh</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#BD">BD</a>, BGD, 50,
     * Officially assigned]
     */
    BD("Bangladesh", "BGD", 50, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Belgium">Belgium</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#BE">BE</a>, BEL, 56,
     * Officially assigned]
     */
    BE("Belgium", "BEL", 56, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Burkina_Faso">Burkina Faso</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#BF">BF</a>, BFA, 854,
     * Officially assigned]
     */
    BF("Burkina Faso", "BFA", 854, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Bulgaria">Bulgaria</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#BG">BG</a>, BGR, 100,
     * Officially assigned]
     */
    BG("Bulgaria", "BGR", 100, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Bahrain">Bahrain</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#BH">BH</a>, BHR, 48,
     * Officially assigned]
     */
    BH("Bahrain", "BHR", 48, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Burundi">Burundi</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#BI">BI</a>, BDI, 108,
     * Officially assigned]
     */
    BI("Burundi", "BDI", 108, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Benin">Benin</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#BJ">BJ</a>, BEN, 204,
     * Officially assigned]
     */
    BJ("Benin", "BEN", 204, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Saint_Barth%C3%A9lemy">Saint Barth&eacute;lemy</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#BL">BL</a>, BLM, 652,
     * Officially assigned]
     */
    BL("Saint Barth\u00E9lemy", "BLM", 652, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Bermuda">Bermuda</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#BM">BM</a>, BMU, 60,
     * Officially assigned]
     */
    BM("Bermuda", "BMU", 60, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Brunei">Brunei Darussalam</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#BN">BN</a>, BRN, 96,
     * Officially assigned]
     */
    BN("Brunei Darussalam", "BRN", 96, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Bolivia">Bolivia, Plurinational State of</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#BO">BO</a>, BOL, 68,
     * Officially assigned]
     */
    BO("Bolivia, Plurinational State of", "BOL", 68, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Caribbean_Netherlands">Bonaire, Sint Eustatius and Saba</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#BQ">BQ</a>, BES, 535,
     * Officially assigned]
     */
    BQ("Bonaire, Sint Eustatius and Saba", "BES", 535, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Brazil">Brazil</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#BR">BR</a>, BRA, 76,
     * Officially assigned]
     */
    BR("Brazil", "BRA", 76, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/The_Bahamas">Bahamas</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#BS">BS</a>, BHS, 44,
     * Officially assigned]
     */
    BS("Bahamas", "BHS", 44, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Bhutan">Bhutan</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#BT">BT</a>, BTN, 64,
     * Officially assigned]
     */
    BT("Bhutan", "BTN", 64, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Burma">Burma</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#BU">BU</a>, BUMM, 104,
     * Officially assigned]
     *
     * <p>
     * Since version 1.16, the value of alpha-3 code of this entry is {@code BUR}
     * (not <code><a href="http://en.wikipedia.org/wiki/ISO_3166-3#BUMM">BUMM</a></code>).
     * </p>
     *
     * @see #MM
     */
    BU("Burma", "BUR", 104, Assignment.TRANSITIONALLY_RESERVED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Bouvet_Island">Bouvet Island</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#BV">BV</a>, BVT, 74,
     * Officially assigned]
     */
    BV("Bouvet Island", "BVT", 74, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Botswana">Botswana</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#BW">BW</a>, BWA, 72,
     * Officially assigned]
     */
    BW("Botswana", "BWA", 72, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Belarus">Belarus</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#BY">BY</a>, BLR, 112,
     * Officially assigned]
     */
    BY("Belarus", "BLR", 112, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Belize">Belize</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#BZ">BZ</a>, BLZ, 84,
     * Officially assigned]
     */
    BZ("Belize", "BLZ", 84, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Canada">Canada</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#CA">CA</a>, CAN, 124,
     * Officially assigned]
     */
    CA("Canada", "CAN", 124, Assignment.OFFICIALLY_ASSIGNED)
    {
        @Override
        public Locale toLocale()
        {
            return Locale.CANADA;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Cocos_(Keeling)_Islands">Cocos (Keeling) Islands</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#CC">CC</a>, CCK, 166,
     * Officially assigned]
     */
    CC("Cocos (Keeling) Islands", "CCK", 166, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Democratic_Republic_of_the_Congo">Congo, the Democratic Republic of the</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#CD">CD</a>, COD, 180,
     * Officially assigned]
     *
     * @see #ZR
     */
    CD("Congo, the Democratic Republic of the", "COD", 180, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Central_African_Republic">Central African Republic</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#CF">CF</a>, CAF, 140,
     * Officially assigned]
     */
    CF("Central African Republic", "CAF", 140, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Republic_of_the_Congo">Congo</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#CG">CG</a>, COG, 178,
     * Officially assigned]
     */
    CG("Congo", "COG", 178, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Switzerland">Switzerland</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#CH">CH</a>, CHE, 756,
     * Officially assigned]
     */
    CH("Switzerland", "CHE", 756, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/C%C3%B4te_d%27Ivoire">C&ocirc;te d'Ivoire</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#CI">CI</a>, CIV, 384,
     * Officially assigned]
     */
    CI("C\u00F4te d'Ivoire", "CIV", 384, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Cook_Islands">Cook Islands</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#CK">CK</a>, COK, 184,
     * Officially assigned]
     */
    CK("Cook Islands", "COK", 184, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Chile">Chile</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#CL">CL</a>, CHL, 152,
     * Officially assigned]
     */
    CL("Chile", "CHL", 152, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Cameroon">Cameroon</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#CM">CM</a>, CMR, 120,
     * Officially assigned]
     */
    CM("Cameroon", "CMR", 120, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/China">China</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#CN">CN</a>, CHN, 156,
     * Officially assigned]
     */
    CN("China", "CHN", 156, Assignment.OFFICIALLY_ASSIGNED)
    {
        @Override
        public Locale toLocale()
        {
            return Locale.CHINA;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Colombia">Colombia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#CO">CO</a>, COL, 170,
     * Officially assigned]
     */
    CO("Colombia", "COL", 170, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Clipperton_Island">Clipperton Island</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#CP">CP</a>, CPT, -1,
     * Exceptionally reserved]
     */
    CP("Clipperton Island", "CPT", -1, Assignment.EXCEPTIONALLY_RESERVED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Costa_Rica">Costa Rica</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#CR">CR</a>, CRI, 188,
     * Officially assigned]
     */
    CR("Costa Rica", "CRI", 188, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Serbia_and_Montenegro">Serbia and Montenegro</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#CS">CS</a>, SCG, 891,
     * Traditionally reserved]
     *
     * <p>
     * Since version 1.16, the value of alpha-3 code of this entry is {@code SCG}
     * (not <code><a href="http://en.wikipedia.org/wiki/ISO_3166-3#CSXX">CSXX</a></code>).
     * </p>
     */
    CS("Serbia and Montenegro", "SCG", 891, Assignment.TRANSITIONALLY_RESERVED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Cuba">Cuba</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#CU">CU</a>, CUB, 192,
     * Officially assigned]
     */
    CU("Cuba", "CUB", 192, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Cape_Verde">Cape Verde</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#CV">CV</a>, CPV, 132,
     * Officially assigned]
     */
    CV("Cape Verde", "CPV", 132, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Cura%C3%A7ao">Cura&ccedil;ao</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#CW">CW</a>, CUW, 531,
     * Officially assigned]
     */
    CW("Cura\u00E7ao", "CUW", 531, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Christmas_Island">Christmas Island</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#CX">CX</a>, CXR, 162,
     * Officially assigned]
     */
    CX("Christmas Island", "CXR", 162, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Cyprus">Cyprus</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#CY">CY</a>, CYP, 196,
     * Officially assigned]
     */
    CY("Cyprus", "CYP", 196, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Czech_Republic">Czech Republic</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#CZ">CZ</a>, CZE, 203,
     * Officially assigned]
     */
    CZ("Czech Republic", "CZE", 203, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Germany">Germany</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#DE">DE</a>, DEU, 276,
     * Officially assigned]
     */
    DE("Germany", "DEU", 276, Assignment.OFFICIALLY_ASSIGNED)
    {
        @Override
        public Locale toLocale()
        {
            return Locale.GERMANY;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Diego_Garcia">Diego Garcia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#DG">DG</a>, DGA, -1,
     * Exceptionally reserved]
     */
    DG("Diego Garcia", "DGA", -1, Assignment.EXCEPTIONALLY_RESERVED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Djibouti">Djibouti</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#DJ">DJ</a>, DJI, 262,
     * Officially assigned]
     */
    DJ("Djibouti", "DJI", 262, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Denmark">Denmark</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#DK">DK</a>, DNK, 208,
     * Officially assigned]
     */
    DK("Denmark", "DNK", 208, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Dominica">Dominica</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#DM">DM</a>, DMA, 212,
     * Officially assigned]
     */
    DM("Dominica", "DMA", 212, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Dominican_Republic">Dominican Republic</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#DO">DO</a>, DOM, 214,
     * Officially assigned]
     */
    DO("Dominican Republic", "DOM", 214, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Algeria">Algeria</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#DZ">DZ</a>, DZA, 12,
     * Officially assigned]
     */
    DZ("Algeria", "DZA", 12, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Ceuta">Ceuta</a>,
     * <a href="http://en.wikipedia.org/wiki/Melilla">Melilla</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#EA">EA</a>, null, -1,
     * Exceptionally reserved]
     */
    EA("Ceuta, Melilla", null, -1, Assignment.EXCEPTIONALLY_RESERVED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Ecuador">Ecuador</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#EC">EC</a>, ECU, 218,
     * Officially assigned]
     */
    EC("Ecuador", "ECU", 218, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Estonia">Estonia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#EE">EE</a>, EST, 233,
     * Officially assigned]
     */
    EE("Estonia", "EST", 233, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Egypt">Egypt</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#EG">EG</a>, EGY, 818,
     * Officially assigned]
     */
    EG("Egypt", "EGY", 818, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Western_Sahara">Western Sahara</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#EH">EH</a>, ESH, 732,
     * Officially assigned]
     */
    EH("Western Sahara", "ESH", 732, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Eritrea">Eritrea</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#ER">ER</a>, ERI, 232,
     * Officially assigned]
     */
    ER("Eritrea", "ERI", 232, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Spain">Spain</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#ES">ES</a>, ESP, 724,
     * Officially assigned]
     */
    ES("Spain", "ESP", 724, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Ethiopia">Ethiopia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#ET">ET</a>, ETH, 231,
     * Officially assigned]
     */
    ET("Ethiopia", "ETH", 231, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/European_Union">European Union</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#EU">EU</a>, null, -1,
     * Exceptionally reserved]
     */
    EU("European Union", null, -1, Assignment.EXCEPTIONALLY_RESERVED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Eurozone">Eurozone</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#EZ">EZ</a>, null, -1,
     * Exceptionally reserved]
     *
     * @since 1.23
     */
    EZ("Eurozone", null, -1, Assignment.EXCEPTIONALLY_RESERVED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Finland">Finland</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#FI">FI</a>, FIN, 246,
     * Officially assigned]
     *
     * @see #SF
     */
    FI("Finland", "FIN", 246, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Fiji">Fiji</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#">FJ</a>, FJI, 242,
     * Officially assigned]
     */
    FJ("Fiji", "FJI", 242, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Falkland_Islands">Falkland Islands (Malvinas)</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#FK">FK</a>, FLK, 238,
     * Officially assigned]
     */
    FK("Falkland Islands (Malvinas)", "FLK", 238, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Federated_States_of_Micronesia">Micronesia, Federated States of</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#FM">FM</a>, FSM, 583,
     * Officially assigned]
     */
    FM("Micronesia, Federated States of", "FSM", 583, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Faroe_Islands">Faroe Islands</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#FO">FO</a>, FRO, 234,
     * Officially assigned]
     */
    FO("Faroe Islands", "FRO", 234, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/France">France</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#FR">FR</a>, FRA, 250,
     * Officially assigned]
     */
    FR("France", "FRA", 250, Assignment.OFFICIALLY_ASSIGNED)
    {
        @Override
        public Locale toLocale()
        {
            return Locale.FRANCE;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Metropolitan_France">France, Metropolitan</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#FX">FX</a>, FXX, 249,
     * Exceptionally reserved]
     *
     * <p>
     * Since version 1.17, the numeric code of this entry is 249.
     * </p>
     */
    FX("France, Metropolitan", "FXX", 249, Assignment.EXCEPTIONALLY_RESERVED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Gabon">Gabon </a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#GA">GA</a>, GAB, 266,
     * Officially assigned]
     */
    GA("Gabon", "GAB", 266, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/United_Kingdom">United Kingdom</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#GB">GB</a>, GBR, 826,
     * Officially assigned]
     *
     * @see #UK
     */
    GB("United Kingdom", "GBR", 826, Assignment.OFFICIALLY_ASSIGNED)
    {
        @Override
        public Locale toLocale()
        {
            return Locale.UK;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Grenada">Grenada</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#GD">GD</a>, GRD, 308,
     * Officially assigned]
     */
    GD("Grenada", "GRD", 308, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Georgia_(country)">Georgia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#GE">GE</a>, GEO, 268,
     * Officially assigned]
     */
    GE("Georgia", "GEO", 268, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/French_Guiana">French Guiana</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#GF">GF</a>, GUF, 254,
     * Officially assigned]
     */
    GF("French Guiana", "GUF", 254, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Guernsey">Guernsey</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#GG">GG</a>, GGY, 831,
     * Officially assigned]
     */
    GG("Guernsey", "GGY", 831, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Ghana">Ghana</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#GH">GH</a>, GHA, 288,
     * Officially assigned]
     */
    GH("Ghana", "GHA", 288, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Gibraltar">Gibraltar</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#GI">GI</a>, GIB, 292,
     * Officially assigned]
     */
    GI("Gibraltar", "GIB", 292, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Greenland">Greenland</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#GL">GL</a>, GRL, 304,
     * Officially assigned]
     */
    GL("Greenland", "GRL", 304, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/The_Gambia">Gambia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#GM">GM</a>, GMB, 270,
     * Officially assigned]
     */
    GM("Gambia", "GMB", 270, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Guinea">Guinea</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#GN">GN</a>, GIN, 324,
     * Officially assigned]
     */
    GN("Guinea", "GIN", 324, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Guadeloupe">Guadeloupe</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#GP">GP</a>, GLP, 312,
     * Officially assigned]
     */
    GP("Guadeloupe", "GLP", 312, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Equatorial_Guinea">Equatorial Guinea</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#GQ">GQ</a>, GNQ, 226,
     * Officially assigned]
     */
    GQ("Equatorial Guinea", "GNQ", 226, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Greece">Greece</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#GR">GR</a>, GRC, 300,
     * Officially assigned]
     */
    GR("Greece", "GRC", 300, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/South_Georgia_and_the_South_Sandwich_Islands">South Georgia and the South Sandwich Islands</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#GS">GS</a>, SGS, 239,
     * Officially assigned]
     */
    GS("South Georgia and the South Sandwich Islands", "SGS", 239, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Guatemala">Guatemala</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#GT">GT</a>, GTM, 320,
     * Officially assigned]
     */
    GT("Guatemala", "GTM", 320, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Guam">Guam</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#GU">GU</a>, GUM, 316,
     * Officially assigned]
     */
    GU("Guam", "GUM", 316, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Guinea-Bissau">Guinea-Bissau</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#GW">GW</a>, GNB, 624,
     * Officially assigned]
     */
    GW("Guinea-Bissau", "GNB", 624, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Guyana">Guyana</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#GY">GY</a>, GUY, 328,
     * Officially assigned]
     */
    GY("Guyana", "GUY", 328, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Hong_Kong">Hong Kong</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#HK">HK</a>, HKG, 344,
     * Officially assigned]
     */
    HK("Hong Kong", "HKG", 344, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Heard_Island_and_McDonald_Islands">Heard Island and McDonald Islands</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#HM">HM</a>, HMD, 334,
     * Officially assigned]
     */
    HM("Heard Island and McDonald Islands", "HMD", 334, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Honduras">Honduras</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#HN">HN</a>, HND, 340,
     * Officially assigned]
     */
    HN("Honduras", "HND", 340, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Croatia">Croatia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#HR">HR</a>, HRV, 191,
     * Officially assigned]
     */
    HR("Croatia", "HRV", 191, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Haiti">Haiti</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#HT">HT</a>, HTI, 332,
     * Officially assigned]
     */
    HT("Haiti", "HTI", 332, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Hungary">Hungary</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#HU">HU</a>, HUN, 348,
     * Officially assigned]
     */
    HU("Hungary", "HUN", 348, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Canary_Islands">Canary Islands</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#IC">IC</a>, null, -1,
     * Exceptionally reserved]
     */
    IC("Canary Islands", null, -1, Assignment.EXCEPTIONALLY_RESERVED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Indonesia">Indonesia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#ID">ID</a>, IDN, 360,
     * Officially assigned]
     */
    ID("Indonesia", "IDN", 360, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Republic_of_Ireland">Ireland</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#IE">IE</a>, IRL, 372,
     * Officially assigned]
     */
    IE("Ireland", "IRL", 372, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Israel">Israel</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#IL">IL</a>, ISR, 376,
     * Officially assigned]
     */
    IL("Israel", "ISR", 376, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Isle_of_Man">Isle of Man</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#IM">IM</a>, IMN, 833,
     * Officially assigned]
     */
    IM("Isle of Man", "IMN", 833, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/India">India</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#IN">IN</a>, IND, 356,
     * Officially assigned]
     */
    IN("India", "IND", 356, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/British_Indian_Ocean_Territory">British Indian Ocean Territory</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#IO">IO</a>, IOT, 86,
     * Officially assigned]
     */
    IO("British Indian Ocean Territory", "IOT", 86, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Iraq">Iraq</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#IQ">IQ</a>, IRQ, 368,
     * Officially assigned]
     */
    IQ("Iraq", "IRQ", 368, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Iran">Iran, Islamic Republic of</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#IR">IR</a>, IRN, 364,
     * Officially assigned]
     */
    IR("Iran, Islamic Republic of", "IRN", 364, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Iceland">Iceland</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#IS">IS</a>, ISL, 352,
     * Officially assigned]
     */
    IS("Iceland", "ISL", 352, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Italy">Italy</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#IT">IT</a>, ITA, 380,
     * Officially assigned]
     */
    IT("Italy", "ITA", 380, Assignment.OFFICIALLY_ASSIGNED)
    {
        @Override
        public Locale toLocale()
        {
            return Locale.ITALY;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Jersey">Jersey</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#JE">JE</a>, JEY, 832,
     * Officially assigned]
     */
    JE("Jersey", "JEY", 832, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Jamaica">Jamaica</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#JM">JM</a>, JAM, 388,
     * Officially assigned]
     */
    JM("Jamaica", "JAM", 388, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Jordan">Jordan</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#JO">JO</a>, JOR, 400,
     * Officially assigned]
     */
    JO("Jordan", "JOR", 400, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Japan">Japan</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#JP">JP</a>, JPN, 392,
     * Officially assigned]
     */
    JP("Japan", "JPN", 392, Assignment.OFFICIALLY_ASSIGNED)
    {
        @Override
        public Locale toLocale()
        {
            return Locale.JAPAN;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Kenya">Kenya</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#KE">KE</a>, KEN, 404,
     * Officially assigned]
     */
    KE("Kenya", "KEN", 404, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Kyrgyzstan">Kyrgyzstan</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#KG">KG</a>, KGZ, 417,
     * Officially assigned]
     */
    KG("Kyrgyzstan", "KGZ", 417, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Cambodia">Cambodia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#KH">KH</a>, KHM, 116,
     * Officially assigned]
     */
    KH("Cambodia", "KHM", 116, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Kiribati">Kiribati</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#KI">KI</a>, KIR, 296,
     * Officially assigned]
     */
    KI("Kiribati", "KIR", 296, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Comoros">Comoros</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#KM">KM</a>, COM, 174,
     * Officially assigned]
     */
    KM("Comoros", "COM", 174, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Saint_Kitts_and_Nevis">Saint Kitts and Nevis</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#KN">KN</a>, KNA, 659,
     * Officially assigned]
     */
    KN("Saint Kitts and Nevis", "KNA", 659, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/North_Korea">Korea, Democratic People's Republic of</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#KP">KP</a>, PRK, 408,
     * Officially assigned]
     */
    KP("Korea, Democratic People's Republic of", "PRK", 408, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/South_Korea">Korea, Republic of</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#KR">KR</a>, KOR, 410,
     * Officially assigned]
     */
    KR("Korea, Republic of", "KOR", 410, Assignment.OFFICIALLY_ASSIGNED)
    {
        @Override
        public Locale toLocale()
        {
            return Locale.KOREA;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Kuwait">Kuwait</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#KW">KW</a>, KWT, 414,
     * Officially assigned]
     */
    KW("Kuwait", "KWT", 414, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Cayman_Islands">Cayman Islands</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#KY">KY</a>, CYM, 136,
     * Officially assigned]
     */
    KY("Cayman Islands", "CYM", 136, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Kazakhstan">Kazakhstan</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#KZ">KZ</a>, KAZ, 398,
     * Officially assigned]
     */
    KZ("Kazakhstan", "KAZ", 398, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Laos">Lao People's Democratic Republic</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#LA">LA</a>, LAO, 418,
     * Officially assigned]
     */
    LA("Lao People's Democratic Republic", "LAO", 418, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Lebanon">Lebanon</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#LB">LB</a>, LBN, 422,
     * Officially assigned]
     */
    LB("Lebanon", "LBN", 422, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Saint_Lucia">Saint Lucia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#LC">LC</a>, LCA, 662,
     * Officially assigned]
     */
    LC("Saint Lucia", "LCA", 662, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Liechtenstein">Liechtenstein</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#LI">LI</a>, LIE, 438,
     * Officially assigned]
     */
    LI("Liechtenstein", "LIE", 438, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Sri_Lanka">Sri Lanka</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#LK">LK</a>, LKA, 144,
     * Officially assigned]
     */
    LK("Sri Lanka", "LKA", 144, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Liberia">Liberia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#LR">LR</a>, LBR, 430,
     * Officially assigned]
     */
    LR("Liberia", "LBR", 430, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Lesotho">Lesotho</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#LS">LS</a>, LSO, 426,
     * Officially assigned]
     */
    LS("Lesotho", "LSO", 426, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Lithuania">Lithuania</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#LT">LT</a>, LTU, 440,
     * Officially assigned]
     */
    LT("Lithuania", "LTU", 440, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Luxembourg">Luxembourg</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#LU">LU</a>, LUX, 442,
     * Officially assigned]
     */
    LU("Luxembourg", "LUX", 442, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Latvia">Latvia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#LV">LV</a>, LVA, 428,
     * Officially assigned]
     */
    LV("Latvia", "LVA", 428, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Libya">Libya</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#LY">LY</a>, LBY, 434,
     * Officially assigned]
     */
    LY("Libya", "LBY", 434, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Morocco">Morocco</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#MA">MA</a>, MAR, 504,
     * Officially assigned]
     */
    MA("Morocco", "MAR", 504, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Monaco">Monaco</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#MC">MC</a>, MCO, 492,
     * Officially assigned]
     */
    MC("Monaco", "MCO", 492, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Moldova">Moldova, Republic of</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#MD">MD</a>, MDA, 498,
     * Officially assigned]
     */
    MD("Moldova, Republic of", "MDA", 498, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Montenegro">Montenegro</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#ME">ME</a>, MNE, 499,
     * Officially assigned]
     */
    ME("Montenegro", "MNE", 499, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Collectivity_of_Saint_Martin">Saint Martin (French part)</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#MF">MF</a>, MAF, 663,
     * Officially assigned]
     */
    MF("Saint Martin (French part)", "MAF", 663, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Madagascar">Madagascar</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#MG">MG</a>, MDG, 450,
     * Officially assigned]
     */
    MG("Madagascar", "MDG", 450, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Marshall_Islands">Marshall Islands</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#MH">MH</a>, MHL, 584,
     * Officially assigned]
     */
    MH("Marshall Islands", "MHL", 584, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="https://en.wikipedia.org/wiki/North_Macedonia">North Macedonia, Republic of</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#MK">MK</a>, MKD, 807,
     * Officially assigned]
     */
    MK("North Macedonia, Republic of", "MKD", 807, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Mali">Mali</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#ML">ML</a>, MLI, 466,
     * Officially assigned]
     */
    ML("Mali", "MLI", 466, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Myanmar">Myanmar</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#MM">MM</a>, MMR, 104,
     * Officially assigned]
     *
     * @see #BU
     */
    MM("Myanmar", "MMR", 104, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Mongolia">Mongolia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#MN">MN</a>, MNG, 496,
     * Officially assigned]
     */
    MN("Mongolia", "MNG", 496, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Macau">Macao</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#MO">MO</a>, MCO, 492,
     * Officially assigned]
     */
    MO("Macao", "MAC", 446, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Northern_Mariana_Islands">Northern Mariana Islands</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#MP">MP</a>, MNP, 580,
     * Officially assigned]
     */
    MP("Northern Mariana Islands", "MNP", 580, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Martinique">Martinique</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#MQ">MQ</a>, MTQ, 474,
     * Officially assigned]
     */
    MQ("Martinique", "MTQ", 474, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Mauritania">Mauritania</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#MR">MR</a>, MRT, 478,
     * Officially assigned]
     */
    MR("Mauritania", "MRT", 478, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Montserrat">Montserrat</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#MS">MS</a>, MSR, 500,
     * Officially assigned]
     */
    MS("Montserrat", "MSR", 500, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Malta">Malta</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#MT">MT</a>, MLT, 470,
     * Officially assigned]
     */
    MT("Malta", "MLT", 470, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Mauritius">Mauritius</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#MU">MU</a>, MUS, 480,
     * Officially assigned]]
     */
    MU("Mauritius", "MUS", 480, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Maldives">Maldives</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#MV">MV</a>, MDV, 462,
     * Officially assigned]
     */
    MV("Maldives", "MDV", 462, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Malawi">Malawi</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#MW">MW</a>, MWI, 454,
     * Officially assigned]
     */
    MW("Malawi", "MWI", 454, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Mexico">Mexico</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#MX">MX</a>, MEX, 484,
     * Officially assigned]
     */
    MX("Mexico", "MEX", 484, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Malaysia">Malaysia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#MY">MY</a>, MYS, 458,
     * Officially assigned]
     */
    MY("Malaysia", "MYS", 458, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Mozambique">Mozambique</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#MZ">MZ</a>, MOZ, 508,
     * Officially assigned]
     */
    MZ("Mozambique", "MOZ", 508, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Namibia">Namibia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#NA">NA</a>, NAM, 516,
     * Officially assigned]
     */
    NA("Namibia", "NAM", 516, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/New_Caledonia">New Caledonia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#NC">NC</a>, NCL, 540,
     * Officially assigned]
     */
    NC("New Caledonia", "NCL", 540, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Niger">Niger</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#NE">NE</a>, NER, 562,
     * Officially assigned]
     */
    NE("Niger", "NER", 562, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Norfolk_Island">Norfolk Island</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#NF">NF</a>, NFK, 574,
     * Officially assigned]
     */
    NF("Norfolk Island", "NFK", 574, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Nigeria">Nigeria</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#NG">NG</a>, NGA, 566,
     * Officially assigned]
     */
    NG("Nigeria","NGA", 566, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Nicaragua">Nicaragua</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#NI">NI</a>, NIC, 558,
     * Officially assigned]
     */
    NI("Nicaragua", "NIC", 558, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Netherlands">Netherlands</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#NL">NL</a>, NLD, 528,
     * Officially assigned]
     */
    NL("Netherlands", "NLD", 528, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Norway">Norway</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#NO">NO</a>, NOR, 578,
     * Officially assigned]
     */
    NO("Norway", "NOR", 578, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Nepal">Nepal</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#NP">NP</a>, NPL, 524,
     * Officially assigned]
     */
    NP("Nepal", "NPL", 524, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Nauru">Nauru</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#NR">NR</a>, NRU, 520,
     * Officially assigned]
     */
    NR("Nauru", "NRU", 520, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Saudi%E2%80%93Iraqi_neutral_zone">Neutral Zone</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#NT">NT</a>, NTZ, 536,
     * Traditionally reserved]
     *
     * <p>
     * Since version 1.16, the value of alpha-3 code of this entry is {@code NTZ}
     * (not <code><a href="http://en.wikipedia.org/wiki/ISO_3166-3#NTHH">NTHH</a></code>).
     * </p>
     */
    NT("Neutral Zone", "NTZ", 536, Assignment.TRANSITIONALLY_RESERVED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Niue">Niue</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#NU">NU</a>, NIU, 570,
     * Officially assigned]
     */
    NU("Niue", "NIU", 570, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/New_Zealand">New Zealand</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#NZ">NZ</a>, NZL, 554,
     * Officially assigned]
     */
    NZ("New Zealand", "NZL", 554, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href=http://en.wikipedia.org/wiki/Oman"">Oman</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#OM">OM</a>, OMN, 512,
     * Officially assigned]
     */
    OM("Oman", "OMN", 512, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Panama">Panama</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#PA">PA</a>, PAN, 591,
     * Officially assigned]
     */
    PA("Panama", "PAN", 591, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Peru">Peru</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#PE">PE</a>, PER, 604,
     * Officially assigned]
     */
    PE("Peru", "PER", 604, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/French_Polynesia">French Polynesia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#PF">PF</a>, PYF, 258,
     * Officially assigned]
     */
    PF("French Polynesia", "PYF", 258, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Papua_New_Guinea">Papua New Guinea</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#PG">PG</a>, PNG, 598,
     * Officially assigned]
     */
    PG("Papua New Guinea", "PNG", 598, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Philippines">Philippines</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#PH">PH</a>, PHL, 608,
     * Officially assigned]
     */
    PH("Philippines", "PHL", 608, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Pakistan">Pakistan</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#PK">PK</a>, PAK, 586,
     * Officially assigned]
     */
    PK("Pakistan", "PAK", 586, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Poland">Poland</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#PL">PL</a>, POL, 616,
     * Officially assigned]
     */
    PL("Poland", "POL", 616, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Saint_Pierre_and_Miquelon">Saint Pierre and Miquelon</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#PM">PM</a>, SPM, 666,
     * Officially assigned]
     */
    PM("Saint Pierre and Miquelon", "SPM", 666, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Pitcairn_Islands">Pitcairn</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#PN">PN</a>, PCN, 612,
     * Officially assigned]
     */
    PN("Pitcairn", "PCN", 612, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Puerto_Rico">Puerto Rico</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#PR">PR</a>, PRI, 630,
     * Officially assigned]
     */
    PR("Puerto Rico", "PRI", 630, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Palestinian_territories">Palestine, State of</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#PS">PS</a>, PSE, 275,
     * Officially assigned]
     */
    PS("Palestine, State of", "PSE", 275, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Portugal">Portugal</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#PT">PT</a>, PRT, 620,
     * Officially assigned]
     */
    PT("Portugal", "PRT", 620, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Palau">Palau</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#PW">PW</a>, PLW, 585,
     * Officially assigned]
     */
    PW("Palau", "PLW", 585, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Paraguay">Paraguay</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#PY">PY</a>, PRY, 600,
     * Officially assigned]
     */
    PY("Paraguay", "PRY", 600, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Qatar">Qatar</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#QA">QA</a>, QAT, 634,
     * Officially assigned]
     */
    QA("Qatar", "QAT", 634, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/R%C3%A9union">R&eacute;union</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#RE">RE</a>, REU, 638,
     * Officially assigned]
     */
    RE("R\u00E9union", "REU", 638, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Romania">Romania</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#RO">RO</a>, ROU, 642,
     * Officially assigned]
     */
    RO("Romania", "ROU", 642, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Serbia">Serbia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#RS">RS</a>, SRB, 688,
     * Officially assigned]
     */
    RS("Serbia", "SRB", 688, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Russia">Russian Federation</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#RU">RU</a>, RUS, 643,
     * Officially assigned]
     */
    RU("Russian Federation", "RUS", 643, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Rwanda">Rwanda</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#RW">RW</a>, RWA, 646,
     * Officially assigned]
     */
    RW("Rwanda", "RWA", 646, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Saudi_Arabia">Saudi Arabia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#SA">SA</a>, SAU, 682,
     * Officially assigned]
     */
    SA("Saudi Arabia", "SAU", 682, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Solomon_Islands">Solomon Islands</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#SB">SB</a>, SLB, 90,
     * Officially assigned]
     */
    SB("Solomon Islands", "SLB", 90, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Seychelles">Seychelles</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#SC">SC</a>, SYC, 690,
     * Officially assigned]
     */
    SC("Seychelles", "SYC", 690, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Sudan">Sudan</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#SD">SD</a>, SDN, 729,
     * Officially assigned]
     */
    SD("Sudan", "SDN", 729, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Sweden">Sweden</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#SE">SE</a>, SWE, 752,
     * Officially assigned]
     */
    SE("Sweden", "SWE", 752, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Finland">Finland</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#SF">SF</a>, FIN, 246,
     * Traditionally reserved]
     *
     * @see #FI
     */
    SF("Finland", "FIN", 246, Assignment.TRANSITIONALLY_RESERVED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Singapore">Singapore</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#SG">SG</a>, SGP, 702,
     * Officially assigned]
     */
    SG("Singapore", "SGP", 702, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Saint_Helena,_Ascension_and_Tristan_da_Cunha">Saint Helena, Ascension and Tristan da Cunha</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#SH">SH</a>, SHN, 654,
     * Officially assigned]
     */
    SH("Saint Helena, Ascension and Tristan da Cunha", "SHN", 654, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Slovenia">Slovenia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#SI">SI</a>, SVN, 705,
     * Officially assigned]
     */
    SI("Slovenia", "SVN", 705, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Svalbard_and_Jan_Mayen">Svalbard and Jan Mayen</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#SJ">SJ</a>, SJM, 744,
     * Officially assigned]
     */
    SJ("Svalbard and Jan Mayen", "SJM", 744, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Slovakia">Slovakia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#SK">SK</a>, SVK, 703,
     * Officially assigned]
     */
    SK("Slovakia", "SVK", 703, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Sierra_Leone">Sierra Leone</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#SL">SL</a>, SLE, 694,
     * Officially assigned]
     */
    SL("Sierra Leone", "SLE", 694, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/San_Marino">San Marino</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#SM">SM</a>, SMR, 674,
     * Officially assigned]
     */
    SM("San Marino", "SMR", 674, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Senegal">Senegal</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#SN">SN</a>, SEN, 686,
     * Officially assigned]
     */
    SN("Senegal", "SEN", 686, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Somalia">Somalia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#SO">SO</a>, SOM, 706,
     * Officially assigned]
     */
    SO("Somalia", "SOM", 706, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Suriname">Suriname</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#SR">SR</a>, SUR, 740,
     * Officially assigned]
     */
    SR("Suriname", "SUR", 740, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/South_Sudan">South Sudan</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#SS">SS</a>, SSD, 728,
     * Officially assigned]
     */
    SS("South Sudan", "SSD", 728, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/S%C3%A3o_Tom%C3%A9_and_Pr%C3%ADncipe">Sao Tome and Principe</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#ST">ST</a>, STP, 678,
     * Officially assigned]
     */
    ST("Sao Tome and Principe", "STP", 678, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Soviet_Union">USSR</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#SU">SU</a>, SUN, 810,
     * Exceptionally reserved]
     *
     * <p>
     * Since version 1.17, the numeric code of this entry is 810.
     * </p>
     */
    SU("USSR", "SUN", 810, Assignment.EXCEPTIONALLY_RESERVED),

    /**
     * <a href="http://en.wikipedia.org/wiki/El_Salvador">El Salvador</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#SV">SV</a>, SLV, 222,
     * Officially assigned]
     */
    SV("El Salvador", "SLV", 222, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Sint_Maarten">Sint Maarten (Dutch part)</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#SX">SX</a>, SXM, 534,
     * Officially assigned]
     */
    SX("Sint Maarten (Dutch part)", "SXM", 534, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Syria">Syrian Arab Republic</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#SY">SY</a>, SYR, 760,
     * Officially assigned]
     */
    SY("Syrian Arab Republic", "SYR", 760, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Eswatini">Eswatini</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#SZ">SZ</a>, SWZ, 748,
     * Officially assigned]
     */
    SZ("Eswatini", "SWZ", 748, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tristan_da_Cunha">Tristan da Cunha</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#TA">TA</a>, TAA, -1,
     * Exceptionally reserved.
     */
    TA("Tristan da Cunha", "TAA", -1, Assignment.EXCEPTIONALLY_RESERVED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Turks_and_Caicos_Islands">Turks and Caicos Islands</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#TC">TC</a>, TCA, 796,
     * Officially assigned]
     */
    TC("Turks and Caicos Islands", "TCA", 796, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Chad">Chad</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#TD">TD</a>, TCD, 148,
     * Officially assigned]
     */
    TD("Chad", "TCD", 148, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/French_Southern_and_Antarctic_Lands">French Southern Territories</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#TF">TF</a>, ATF, 260,
     * Officially assigned]
     */
    TF("French Southern Territories", "ATF", 260, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Togo">Togo</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#TG">TG</a>, TGO, 768,
     * Officially assigned]
     */
    TG("Togo", "TGO", 768, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Thailand">Thailand</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#TH">TH</a>, THA, 764,
     * Officially assigned]
     */
    TH("Thailand", "THA", 764, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tajikistan">Tajikistan</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#TJ">TJ</a>, TJK, 762,
     * Officially assigned]
     */
    TJ("Tajikistan", "TJK", 762, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tokelau">Tokelau</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#TK">TK</a>, TKL, 772,
     * Officially assigned]
     */
    TK("Tokelau", "TKL", 772, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/East_Timor">Timor-Leste</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#TL">TL</a>, TLS, 626,
     * Officially assigned]
     *
     * @see #TM
     */
    TL("Timor-Leste", "TLS", 626, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Turkmenistan">Turkmenistan</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#TM">TM</a>, TKM, 795,
     * Officially assigned]
     */
    TM("Turkmenistan", "TKM", 795, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tunisia">Tunisia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#TN">TN</a>, TUN, 788,
     * Officially assigned]
     */
    TN("Tunisia", "TUN", 788, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tonga">Tonga</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#TO">TO</a>, TON, 776,
     * Officially assigned]
     */
    TO("Tonga", "TON", 776, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/East_Timor">East Timor</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#TP">TP</a>, TMP, 626,
     * Traditionally reserved]
     *
     * <p>
     * Since version 1.16, the value of alpha-3 code of this entry is {@code TMP}
     * (not <code><a href="http://en.wikipedia.org/wiki/ISO_3166-3#TPTL">TPTL</a></code>).
     * </p>
     *
     * <p>
     * Since version 1.17, the numeric code of this entry is 626.
     * </p>
     *
     * @see #TL
     */
    TP("East Timor", "TMP", 626, Assignment.TRANSITIONALLY_RESERVED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Turkey">Turkey</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#TR">TR</a>, TUR, 792,
     * Officially assigned]
     */
    TR("Turkey", "TUR", 792, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Trinidad_and_Tobago">Trinidad and Tobago</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#TT">TT</a>, TTO, 780,
     * Officially assigned]
     */
    TT("Trinidad and Tobago", "TTO", 780, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tuvalu">Tuvalu</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#TV">TV</a>, TUV, 798,
     * Officially assigned]
     */
    TV("Tuvalu", "TUV", 798, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Taiwan">Taiwan, Province of China</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#TW">TW</a>, TWN, 158,
     * Officially assigned]
     */
    TW("Taiwan, Province of China", "TWN", 158, Assignment.OFFICIALLY_ASSIGNED)
    {
        @Override
        public Locale toLocale()
        {
            return Locale.TAIWAN;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Tanzania">Tanzania, United Republic of</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#TZ">TZ</a>, TZA, 834,
     * Officially assigned]
     */
    TZ("Tanzania, United Republic of", "TZA", 834, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Ukraine">Ukraine</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#UA">UA</a>, UKR, 804,
     * Officially assigned]
     */
    UA("Ukraine", "UKR", 804, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Uganda">Uganda</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#UG">UG</a>, UGA, 800,
     * Officially assigned]
     */
    UG("Uganda", "UGA", 800, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/United_Kingdom">United Kingdom</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#UK">UK</a>, null, 826,
     * Exceptionally reserved]
     *
     * <p>
     * Since version 1.17, the numeric code of this entry is 826.
     * </p>
     *
     * @see #GB
     */
    UK("United Kingdom", null, 826, Assignment.EXCEPTIONALLY_RESERVED)
    {
        @Override
        public Locale toLocale()
        {
            return Locale.UK;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/United_States_Minor_Outlying_Islands">United States Minor Outlying Islands</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#UM">UM</a>, UMI, 581,
     * Officially assigned]
     */
    UM("United States Minor Outlying Islands", "UMI", 581, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/United_States">United States</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#US">US</a>, USA, 840,
     * Officially assigned]
     */
    US("United States", "USA", 840, Assignment.OFFICIALLY_ASSIGNED)
    {
        @Override
        public Locale toLocale()
        {
            return Locale.US;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Uruguay">Uruguay</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#UY">UY</a>, URY, 858,
     * Officially assigned]
     */
    UY("Uruguay", "URY", 858, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Uzbekistan">Uzbekistan</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#UZ">UZ</a>, UZB, 860,
     * Officially assigned]
     */
    UZ("Uzbekistan", "UZB", 860, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Vatican_City">Holy See (Vatican City State)</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#VA">VA</a>, VAT, 336,
     * Officially assigned]
     */
    VA("Holy See (Vatican City State)", "VAT", 336, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Saint_Vincent_and_the_Grenadines">Saint Vincent and the Grenadines</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#VC">VC</a>, VCT, 670,
     * Officially assigned]
     */
    VC("Saint Vincent and the Grenadines", "VCT", 670, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Venezuela">Venezuela, Bolivarian Republic of</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#VE">VE</a>, VEN, 862,
     * Officially assigned]
     */
    VE("Venezuela, Bolivarian Republic of", "VEN", 862, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/British_Virgin_Islands">Virgin Islands, British</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#VG">VG</a>, VGB, 92,
     * Officially assigned]
     */
    VG("Virgin Islands, British", "VGB", 92, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/United_States_Virgin_Islands">Virgin Islands, U.S.</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#VI">VI</a>, VIR, 850,
     * Officially assigned]
     */
    VI("Virgin Islands, U.S.", "VIR", 850, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Vietnam">Viet Nam</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#VN">VN</a>, VNM, 704,
     * Officially assigned]
     */
    VN("Viet Nam", "VNM", 704, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Vanuatu">Vanuatu</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#VU">VU</a>, VUT, 548,
     * Officially assigned]
     */
    VU("Vanuatu", "VUT", 548, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Wallis_and_Futuna">Wallis and Futuna</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#WF">WF</a>, WLF, 876,
     * Officially assigned]
     */
    WF("Wallis and Futuna", "WLF", 876, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Samoa">Samoa</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#WS">WS</a>, WSM, 882,
     * Officially assigned]
     */
    WS("Samoa", "WSM", 882, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Northern_Ireland">Northern Ireland</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#XI">XI</a>, XXI, -1,
     * User assigned]
     *
     * @since 1.28
     */
    XI("Northern Ireland", "XXI", -1, Assignment.USER_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/United_Kingdom">United Kingdom (excluding Northern Ireland)</a>
     * [<a href="https://ec.europa.eu/taxation_customs/sites/taxation/files/use_of_gb_and_xi_codes_guidance.pdf">XU</a>, XXU, -1,
     * User assigned]
     *
     * @since 1.29
     */
    XU("United Kingdom (excluding Northern Ireland)", "XXU", -1, Assignment.USER_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Kosovo">Kosovo, Republic of</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#XK">XK</a>, XXK, -1,
     * User assigned]
     */
    XK("Kosovo, Republic of", "XKX", -1, Assignment.USER_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Yemen">Yemen</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#YE">YE</a>, YEM, 887,
     * Officially assigned]
     */
    YE("Yemen", "YEM", 887, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Mayotte">Mayotte</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#YT">YT</a>, MYT, 175,
     * Officially assigned]
     */
    YT("Mayotte", "MYT", 175, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Yugoslavia">Yugoslavia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#YU">YU</a>, YUG, 890,
     * Traditionally reserved]
     *
     * <p>
     * Since version 1.16, the value of alpha-3 code of this entry is {@code YUG}
     * (not <code><a href="http://en.wikipedia.org/wiki/ISO_3166-3#YUCS">YUCS</a></code>).
     * </p>
     */
    YU("Yugoslavia", "YUG", 890, Assignment.TRANSITIONALLY_RESERVED),

    /**
     * <a href="http://en.wikipedia.org/wiki/South_Africa">South Africa</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#ZA">ZA</a>, ZAF, 710,
     * Officially assigned]
     */
    ZA("South Africa", "ZAF", 710, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Zambia">Zambia</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#ZM">ZM</a>, ZMB, 894,
     * Officially assigned]
     */
    ZM("Zambia", "ZMB", 894, Assignment.OFFICIALLY_ASSIGNED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Zaire">Zaire</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#ZR">ZR</a>, ZAR, 180,
     * Traditionally reserved]
     *
     * <p>
     * Since version 1.16, the value of alpha-3 code of this entry is {@code ZAR}
     * (not <code><a href="http://en.wikipedia.org/wiki/ISO_3166-3#ZRCD">ZRCD</a></code>).
     * </p>
     *
     * <p>
     * Since version 1.17, the numeric code of this entry is 180.
     * </p>
     *
     * @see #CD
     */
    ZR("Zaire", "ZAR", 180, Assignment.TRANSITIONALLY_RESERVED),

    /**
     * <a href="http://en.wikipedia.org/wiki/Zimbabwe">Zimbabwe</a>
     * [<a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#ZW">ZW</a>, ZWE, 716,
     * Officially assigned]
     */
    ZW("Zimbabwe", "ZWE", 716, Assignment.OFFICIALLY_ASSIGNED),
    ;


    /**
     * Code assignment state in <a href="http://en.wikipedia.org/wiki/ISO_3166-1"
     * >ISO 3166-1</a>.
     *
     * @see <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#Decoding_table"
     *       >Decoding table of ISO 3166-1 alpha-2 codes</a>
     */
    public enum Assignment
    {
        /**
         * <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#Officially_assigned_code_elements"
         * >Officially assigned</a>.
         *
         * Assigned to a country, territory, or area of geographical interest.
         */
        OFFICIALLY_ASSIGNED,

        /**
         * <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#User-assigned_code_elements"
         * >User assigned</a>.
         *
         * Free for assignment at the disposal of users.
         */
        USER_ASSIGNED,

        /**
         * <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#Exceptional_reservations"
         * >Exceptionally reserved</a>.
         *
         * Reserved on request for restricted use.
         */
        EXCEPTIONALLY_RESERVED,

        /**
         * <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#Transitional_reservations"
         * >Transitionally reserved</a>.
         *
         * Deleted from ISO 3166-1 but reserved transitionally.
         */
        TRANSITIONALLY_RESERVED,

        /**
         * <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#Indeterminate_reservations"
         * >Indeterminately reserved</a>.
         *
         * Used in coding systems associated with ISO 3166-1.
         */
        INDETERMINATELY_RESERVED,

        /**
         * <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#Codes_currently_agreed_not_to_use"
         * >Not used</a>.
         *
         * Not used in ISO 3166-1 in deference to international property
         * organization names.
         */
        NOT_USED
    }


    private static final Map<String, CountryCode> alpha3Map = new HashMap<String, CountryCode>();
    private static final Map<String, CountryCode> alpha4Map = new HashMap<String, CountryCode>();
    private static final Map<Integer, CountryCode> numericMap = new HashMap<Integer, CountryCode>();


    static
    {
        for (CountryCode cc : values())
        {
            if (cc.getAlpha3() != null)
            {
                alpha3Map.put(cc.getAlpha3(), cc);
            }

            if (cc.getNumeric() != -1)
            {
                numericMap.put(Integer.valueOf(cc.getNumeric()), cc);
            }
        }

        // FI and SF have the same alpha-3 code "FIN". FI should be used.
        alpha3Map.put("FIN", FI);

        // For backward compatibility.
        alpha4Map.put("ANHH", AN);
        alpha4Map.put("BUMM", BU);
        alpha4Map.put("CSXX", CS);
        alpha4Map.put("NTHH", NT);
        alpha4Map.put("TPTL", TP);
        alpha4Map.put("YUCS", YU);
        alpha4Map.put("ZRCD", ZR);

        // BU and MM have the same numeric code 104. MM should be used.
        numericMap.put(Integer.valueOf(104), MM);

        // CD and ZR have the same numeric code 180. CD should be used.
        numericMap.put(Integer.valueOf(180), CD);

        // FI and SF have the same numeric code 246. FI should be used.
        numericMap.put(Integer.valueOf(246), FI);

        // GB and UK have the same numeric code 826. GB should be used.
        numericMap.put(Integer.valueOf(826), GB);

        // TL and TP have the same numeric code 626. TL should be used.
        numericMap.put(Integer.valueOf(626), TL);

        // County code 280 is also used for DE by the German banking industry.
        numericMap.put(Integer.valueOf(280), DE);
    }


    private final String name;
    private final String alpha3;
    private final int numeric;
    private final Assignment assignment;


    private CountryCode(String name, String alpha3, int numeric, Assignment assignment)
    {
        this.name = name;
        this.alpha3 = alpha3;
        this.numeric = numeric;
        this.assignment = assignment;
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
     *         {@link CountryCode#UNDEFINED} returns {@code "UNDEFINED"}
     *         which is not an official ISO 3166-1 alpha-2 code.
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
     *         Some country codes reserved exceptionally (such as {@link #EU})
     *         returns {@code null}.
     *         {@link CountryCode#UNDEFINED} returns {@code null}, too.
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
     *         Country codes reserved exceptionally (such as {@link #EU})
     *         returns {@code -1}.
     *         {@link CountryCode#UNDEFINED} returns {@code -1}, too.
     */
    public int getNumeric()
    {
        return numeric;
    }


    /**
     * Get the assignment state of this country code in ISO 3166-1.
     *
     * @return
     *         The assignment state.
     *
     * @see <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#Decoding_table"
     *       >Decoding table of ISO 3166-1 alpha-2 codes</a>
     */
    public Assignment getAssignment()
    {
        return assignment;
    }


    /**
     * Convert this {@code CountryCode} instance to a {@link Locale} instance.
     *
     * <p>
     * In most cases, this method creates a new {@code Locale} instance
     * every time it is called, but some {@code CountryCode} instances return
     * their corresponding entries in {@code Locale} class. For example,
     * {@link #CA CountryCode.CA} always returns {@link Locale#CANADA}.
     * </p>
     *
     * <p>
     * The table below lists {@code CountryCode} entries whose {@code toLocale()}
     * do not create new Locale instances but return entries in
     * {@code Locale} class.
     * </p>
     *
     * <table border="1" style="border-collapse: collapse;" cellpadding="5">
     * <tr bgcolor="#FF8C00">
     *   <th>CountryCode</th>
     *   <th>Locale</th>
     * </tr>
     * <tr>
     *   <td>{@link CountryCode#CA CountryCode.CA}</td>
     *   <td>{@link Locale#CANADA}</td>
     * </tr>
     * <tr>
     *   <td>{@link CountryCode#CN CountryCode.CN}</td>
     *   <td>{@link Locale#CHINA}</td>
     * </tr>
     * <tr>
     *   <td>{@link CountryCode#DE CountryCode.DE}</td>
     *   <td>{@link Locale#GERMANY}</td>
     * </tr>
     * <tr>
     *   <td>{@link CountryCode#FR CountryCode.FR}</td>
     *   <td>{@link Locale#FRANCE}</td>
     * </tr>
     * <tr>
     *   <td>{@link CountryCode#GB CountryCode.GB}</td>
     *   <td>{@link Locale#UK}</td>
     * </tr>
     * <tr>
     *   <td>{@link CountryCode#IT CountryCode.IT}</td>
     *   <td>{@link Locale#ITALY}</td>
     * </tr>
     * <tr>
     *   <td>{@link CountryCode#JP CountryCode.JP}</td>
     *   <td>{@link Locale#JAPAN}</td>
     * </tr>
     * <tr>
     *   <td>{@link CountryCode#KR CountryCode.KR}</td>
     *   <td>{@link Locale#KOREA}</td>
     * </tr>
     * <tr>
     *   <td>{@link CountryCode#TW CountryCode.TW}</td>
     *   <td>{@link Locale#TAIWAN}</td>
     * </tr>
     * <tr>
     *   <td>{@link CountryCode#US CountryCode.US}</td>
     *   <td>{@link Locale#US}</td>
     * </tr>
     * </table>
     *
     * <p>
     * In addition, {@code toLocale()} of {@link CountryCode#UNDEFINED
     * CountryCode.UNDEFINED} behaves a bit differently. It returns
     * {@link Locale#ROOT Locale.ROOT} when it is available (i.e. when
     * the version of Java SE is 1.6 or higher). Otherwise, it returns
     * a {@code Locale} instance whose language and country are empty
     * strings. Even in the latter case, the same instance is returned
     * on every call.
     * </p>
     *
     * @return
     *         A {@code Locale} instance that matches this {@code CountryCode}.
     */
    public Locale toLocale()
    {
        return new Locale("", name());
    }


    /**
     * Get the currency.
     *
     * <p>
     * This method is an alias of {@link Currency}{@code .}{@link
     * Currency#getInstance(Locale) getInstance}{@code (}{@link
     * #toLocale()}{@code )}. The only difference is that this method
     * returns {@code null} when {@code Currency.getInstance(Locale)}
     * throws {@code IllegalArgumentException}.
     * </p>
     *
     * <p>
     * This method returns {@code null} when the territory represented by
     * this {@code CountryCode} instance does not have a currency.
     * {@link #AQ} (Antarctica) is one example.
     * </p>
     *
     * <p>
     * In addition, this method returns {@code null} also when the ISO 3166
     * code represented by this {@code CountryCode} instance is not
     * supported by the implementation of {@link
     * Currency#getInstance(Locale)}. At the time of this writing,
     * {@link #SS} (South Sudan) is one example.
     * </p>
     *
     * @return
     *         A {@code Currency} instance. In some cases, null
     *         is returned.
     *
     * @since 1.4
     *
     * @see Currency#getInstance(Locale)
     */
    public Currency getCurrency()
    {
        try
        {
            return Currency.getInstance(toLocale());
        }
        catch (IllegalArgumentException e)
        {
            // Currency.getInstance(Locale) throws IllegalArgumentException
            // when the given ISO 3166 code is not supported.
            return null;
        }
    }


    /**
     * Get a {@code CountryCode} that corresponds to the given ISO 3166-1
     * <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">alpha-2</a> or
     * <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-3">alpha-3</a> code.
     *
     * <p>
     * This method calls {@link #getByCode(String, boolean) getByCode}{@code (code, true)}.
     * Note that the behavior has changed since the version 1.13. In the older versions,
     * this method was an alias of {@code getByCode(code, false)}.
     * </p>
     *
     * @param code
     *         An ISO 3166-1 <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2"
     *         >alpha-2</a> or <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-3"
     *         >alpha-3</a> code.
     *         When {@code "UNDEFINED"} is given, {@link #UNDEFINED CountryCode.UNDEFINED}
     *         is returned.
     *         In addition, for backward compatibility, some 4-letter <a href=
     *         "https://en.wikipedia.org/wiki/ISO_3166-3">ISO 3166-3</a> codes such
     *         as {@code "ANHH"} are accepted.
     *
     * @return
     *         A {@code CountryCode} instance, or {@code null} if not found.
     *
     * @see #getByCode(String, boolean)
     */
    public static CountryCode getByCode(String code)
    {
        return getByCode(code, true);
    }


    /**
     * Get a {@code CountryCode} that corresponds to the given ISO 3166-1
     * <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">alpha-2</a> or
     * <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-3">alpha-3</a> code.
     *
     * <p>
     * This method calls {@link #getByCode(String, boolean) getByCode}{@code (code, false)}.
     * </p>
     *
     * @param code
     *         An ISO 3166-1 <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2"
     *         >alpha-2</a> or <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-3"
     *         >alpha-3</a> code. Or {@code "UNDEFINED"} (case insensitive).
     *         In addition, for backward compatibility, some 4-letter <a href=
     *         "https://en.wikipedia.org/wiki/ISO_3166-3">ISO 3166-3</a> codes such
     *         as {@code "ANHH"} are accepted.
     *
     * @return
     *         A {@code CountryCode} instance, or {@code null} if not found.
     *
     * @since 1.13
     *
     * @see #getByCode(String, boolean)
     */
    public static CountryCode getByCodeIgnoreCase(String code)
    {
        return getByCode(code, false);
    }


    /**
     * Get a {@code CountryCode} that corresponds to the given ISO 3166-1
     * <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">alpha-2</a> or
     * <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-3">alpha-3</a> code.
     *
     * @param code
     *         An ISO 3166-1 <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2"
     *         >alpha-2</a> or <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-3"
     *         >alpha-3</a> code.
     *         Or {@code "UNDEFINED"} (its case sensitivity depends on the value of
     *         {@code caseSensitive}).
     *         In addition, for backward compatibility, some 4-letter <a href=
     *         "https://en.wikipedia.org/wiki/ISO_3166-3">ISO 3166-3</a> codes such
     *         as {@code "ANHH"} are accepted.
     *
     * @param caseSensitive
     *         If {@code true}, the given code should consist of upper-case letters only.
     *         If {@code false}, this method internally canonicalizes the given code by
     *         {@link String#toUpperCase()} and then performs search. For example,
     *         {@code getByCode("jp", true)} returns {@code null}, but on the other hand,
     *         {@code getByCode("jp", false)} returns {@link #JP CountryCode.JP}.
     *
     * @return
     *         A {@code CountryCode} instance, or {@code null} if not found.
     */
    public static CountryCode getByCode(String code, boolean caseSensitive)
    {
        if (code == null)
        {
            return null;
        }

        switch (code.length())
        {
            case 2:
                code = canonicalize(code, caseSensitive);
                return getByAlpha2Code(code);

            case 3:
                code = canonicalize(code, caseSensitive);
                return getByAlpha3Code(code);

            case 4:
                code = canonicalize(code, caseSensitive);
                return getByAlpha4Code(code);

            case 9:
                code = canonicalize(code, caseSensitive);
                if ("UNDEFINED".equals(code))
                {
                    return CountryCode.UNDEFINED;
                }
                // FALLTHROUGH

            default:
                return null;
        }
    }


    /**
     * Get a {@code CountryCode} that corresponds to the country code of
     * the given {@link Locale} instance.
     *
     * @param locale
     *         A {@code Locale} instance.
     *
     * @return
     *         A {@code CountryCode} instance, or {@code null} if not found.
     *         When {@link Locale#getCountry() getCountry()} method of the
     *         given {@code Locale} instance returns {@code null} or an
     *         empty string, {@link #UNDEFINED CountryCode.UNDEFINED} is
     *         returned.
     *
     * @see Locale#getCountry()
     */
    public static CountryCode getByLocale(Locale locale)
    {
        if (locale == null)
        {
            return null;
        }

        // Locale.getCountry() returns an uppercase ISO 3166 2-letter code.
        String country = locale.getCountry();

        if (country == null || country.length() == 0)
        {
            return CountryCode.UNDEFINED;
        }

        return getByCode(country, true);
    }


    /**
     * Canonicalize the given country code.
     *
     * @param code
     *         ISO 3166-1 alpha-2 or alpha-3 country code.
     *
     * @param caseSensitive
     *         {@code true} if the code should be handled case-sensitively.
     *
     * @return
     *         If {@code code} is {@code null} or an empty string,
     *         {@code null} is returned.
     *         Otherwise, if {@code caseSensitive} is {@code true},
     *         {@code code} is returned as is.
     *         Otherwise, {@code code.toUpperCase()} is returned.
     */
    static String canonicalize(String code, boolean caseSensitive)
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
     * Get a {@code CountryCode} that corresponds to the given ISO 3166-1
     * <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">alpha-2</a> code.
     *
     * @param code
     *         An ISO 3166-1 <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2"
     *         >alpha-2</a> code.
     *
     * @return
     *         A {@code CountryCode} instance, or {@code null} if not found.
     *
     * @since 1.23
     */
    public static CountryCode getByAlpha2Code(String code)
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


    /**
     * Get a {@code CountryCode} that corresponds to the given ISO 3166-1
     * <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-3">alpha-3</a> code.
     *
     * @param code
     *         An ISO 3166-1 <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-3"
     *         >alpha-3</a> code.
     *
     * @return
     *         A {@code CountryCode} instance, or {@code null} if not found.
     *
     * @since 1.23
     */
    public static CountryCode getByAlpha3Code(String code)
    {
        return alpha3Map.get(code);
    }


    /**
     * Get a {@code CountryCode} that corresponds to the given alpha-4 code.
     *
     * <p>
     * Recognized alpha-4 codes are listed in the table below.
     * </p>
     *
     * <br>
     * <blockquote>
     * <table border="1" style="border-collapse: collapse" cellpadding="5">
     * <tr bgcolor="orange">
     *   <th>Alpha-4 Code</th>
     *   <th><code>CountryCode</code></th>
     * </tr>
     * <tr align="center">
     *   <td><code>ANHH</code></td>
     *   <td>{@link #AN}</td>
     * </tr>
     * <tr align="center">
     *   <td><code>BUMM</code></td>
     *   <td>{@link #BU}</td>
     * </tr>
     * <tr align="center">
     *   <td><code>CSXX</code></td>
     *   <td>{@link #CS}</td>
     * </tr>
     * <tr align="center">
     *   <td><code>NTHH</code></td>
     *   <td>{@link #NT}</td>
     * </tr>
     * <tr align="center">
     *   <td><code>TPTL</code></td>
     *   <td>{@link #TP}</td>
     * </tr>
     * <tr align="center">
     *   <td><code>YUCS</code></td>
     *   <td>{@link #YU}</td>
     * </tr>
     * <tr align="center">
     *   <td><code>ZRCD</code></td>
     *   <td>{@link #ZR}</td>
     * </tr>
     * </table>
     * </blockquote>
     *
     * @param code
     *         Alpha-4 code.
     *
     * @return
     *         A {@code CountryCode} instance, or {@code null} if not found.
     *
     * @since 1.23
     */
    public static CountryCode getByAlpha4Code(String code)
    {
        return alpha4Map.get(code);
    }


    /**
     * Get a {@code CountryCode} that corresponds to the given
     * <a href="http://en.wikipedia.org/wiki/ISO_3166-1_numeric">ISO 3166-1
     * numeric</a> code.
     *
     * <p>
     * Note that there are some pairs each of which shares the same numeric code.
     * The following table shows such pairs and which {@code CountryCode} instance
     * is returned from this method.
     * </p>
     *
     * <br>
     * <blockquote>
     * <table border="1" style="border-collapse: collapse" cellpadding="5">
     * <tr bgcolor="orange">
     *   <th>Shared Numeric Code</th>
     *   <th colspan="2">Alpha-3 Codes</th>
     *   <th>Returned Alpha-3 Code</th>
     * </tr>
     * <tr>
     *   <td align="center">104</td>
     *   <td align="center">{@link #BU}</td>
     *   <td align="center">{@link #MM}</td>
     *   <td align="center">{@link #MM}</td>
     * </tr>
     * <tr>
     *   <td align="center">180</td>
     *   <td align="center">{@link #CD}</td>
     *   <td align="center">{@link #ZR}</td>
     *   <td align="center">{@link #CD}</td>
     * </tr>
     * <tr>
     *   <td align="center">246</td>
     *   <td align="center">{@link #FI}</td>
     *   <td align="center">{@link #SF}</td>
     *   <td align="center">{@link #FI}</td>
     * </tr>
     * <tr>
     *   <td align="center">826</td>
     *   <td align="center">{@link #GB}</td>
     *   <td align="center">{@link #UK}</td>
     *   <td align="center">{@link #GB}</td>
     * </tr>
     * <tr>
     *   <td align="center">626</td>
     *   <td align="center">{@link #TL}</td>
     *   <td align="center">{@link #TP}</td>
     *   <td align="center">{@link #TL}</td>
     * </tr>
     * </table>
     * </blockquote>
     * <br>
     *
     * @param code
     *         An <a href="http://en.wikipedia.org/wiki/ISO_3166-1_numeric"
     *         >ISO 3166-1 numeric</a> code.
     *
     * @return
     *         A {@code CountryCode} instance, or {@code null} if not found.
     *         If 0 or a negative value is given, {@code null} is returned.
     */
    public static CountryCode getByCode(int code)
    {
        if (code <= 0)
        {
            return null;
        }

        return numericMap.get(code);
    }


    /**
     * Get a list of {@code CountryCode} by a name regular expression.
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
     *         List of {@code CountryCode}. If nothing has matched,
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
    public static List<CountryCode> findByName(String regex)
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
     * Get a list of {@code CountryCode} by a name pattern.
     *
     * <p>
     * For example, the list obtained by the code snippet below:
     * </p>
     *
     * <pre style="background-color: #EEEEEE; margin-left: 2em; margin-right: 2em; border: 1px solid black; padding: 0.5em;">
     * Pattern pattern = Pattern.compile(<span style="color: darkred;">".*United.*"</span>);
     * List&lt;CountryCode&gt; list = CountryCode.findByName(pattern);</pre>
     *
     * <p>
     * contains 6 {@code CountryCode}s as listed below.
     * </p>
     *
     * <ol>
     * <li>{@link #AE} : United Arab Emirates
     * <li>{@link #GB} : United Kingdom
     * <li>{@link #TZ} : Tanzania, United Republic of
     * <li>{@link #UK} : United Kingdom
     * <li>{@link #UM} : United States Minor Outlying Islands
     * <li>{@link #US} : United States
     * </ol>
     *
     * @param pattern
     *         Pattern to match names.
     *
     * @return
     *         List of {@code CountryCode}. If nothing has matched,
     *         an empty list is returned.
     *
     * @throws IllegalArgumentException
     *         {@code pattern} is {@code null}.
     *
     * @since 1.11
     */
    public static List<CountryCode> findByName(Pattern pattern)
    {
        if (pattern == null)
        {
            throw new IllegalArgumentException("pattern is null.");
        }

        List<CountryCode> list = new ArrayList<CountryCode>();

        for (CountryCode entry : values())
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
