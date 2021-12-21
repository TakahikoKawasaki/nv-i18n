/*
 * Copyright (C) 2013-2014 Neo Visionaries Inc.
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
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;


/**
 * <a href="http://en.wikipedia.org/wiki/ISO_15924">ISO 15924<a> script code.
 *
 * @since 1.2
 * @author Takahiko Kawasaki
 */
public enum ScriptCode
{

    /**
     * Undefined [-1]
     *
     * <p>
     * This is not an official ISO 15924 code.
     * </p>
     *
     * @since 1.14
     * @see #Zxxx Zxxx: 997 Code for unwritten languages
     * @see #Zyyy Zyyy: 998 Code for undetermined script
     * @see #Zzzz Zzzz: 999 Code for uncoded script
     */
    Undefined(-1, "Undefined")
    {
        @Override
        public Locale toLocale()
        {
            return LocaleCode.undefined.toLocale();
        }
    },

    /**
     * Afaka [439]
     */
    Afak(439, "Afaka"),


    /**
     * Caucasian Albanian [239]
     */
    Aghb(239, "Caucasian Albanian"),


    /**
     * Arabic [160]
     */
    Arab(160, "Arabic"),


    /**
     * Imperial Aramaic [124]
     */
    Armi(124, "Imperial Aramaic"),


    /**
     * Armenian [230]
     */
    Armn(230, "Armenian"),


    /**
     * Avestan [134]
     */
    Avst(134, "Avestan"),


    /**
     * Balinese [360]
     */
    Bali(360, "Balinese"),


    /**
     * Bamum [435]
     */
    Bamu(435, "Bamum"),


    /**
     * Bassa Vah [259]
     */
    Bass(259, "Bassa Vah"),


    /**
     * Batak [365]
     */
    Batk(365, "Batak"),


    /**
     * Bengali [325]
     */
    Beng(325, "Bengali"),


    /**
     * Blissymbols [550]
     */
    Blis(550, "Blissymbols"),


    /**
     * Bopomofo [285]
     */
    Bopo(285, "Bopomofo"),


    /**
     * Brahmi [300]
     */
    Brah(300, "Brahmi"),


    /**
     * Braille [570]
     */
    Brai(570, "Braille"),


    /**
     * Buginese [367]
     */
    Bugi(367, "Buginese"),


    /**
     * Buhid [372]
     */
    Buhd(372, "Buhid"),


    /**
     * Chakma [349]
     */
    Cakm(349, "Chakma"),


    /**
     * Unified Canadian Aboriginal Syllabics [440]
     */
    Cans(440, "Unified Canadian Aboriginal Syllabics"),


    /**
     * Carian [201]
     */
    Cari(201, "Carian"),


    /**
     * Cham [358]
     */
    Cham(358, "Cham"),


    /**
     * Cherokee [445]
     */
    Cher(445, "Cherokee"),


    /**
     * Cirth [291]
     */
    Cirt(291, "Cirth"),


    /**
     * Coptic [204]
     */
    Copt(204, "Coptic"),


    /**
     * Cypriot [403]
     */
    Cprt(403, "Cypriot"),


    /**
     * Cyrillic [220]
     */
    Cyrl(220, "Cyrillic"),


    /**
     * Cyrillic [221]
     */
    Cyrs(221, "Cyrillic"),


    /**
     * Devanagari [315]
     */
    Deva(315, "Devanagari"),


    /**
     * Deseret [250]
     */
    Dsrt(250, "Deseret"),


    /**
     * Duployan shorthand, Duployan stenography [755]
     */
    Dupl(755, "Duployan shorthand, Duployan stenography"),


    /**
     * Egyptian demotic [070]
     */
    Egyd(070, "Egyptian demotic"),


    /**
     * Egyptian hieratic [060]
     */
    Egyh(060, "Egyptian hieratic"),


    /**
     * Egyptian hieroglyphs [050]
     */
    Egyp(050, "Egyptian hieroglyphs"),


    /**
     * Elbasan [226]
     */
    Elba(226, "Elbasan"),


    /**
     * Ethiopic [430]
     */
    Ethi(430, "Ethiopic"),


    /**
     * Georgian [240]
     */
    Geor(240, "Georgian"),


    /**
     * Khutsuri [241]
     */
    Geok(241, "Khutsuri"),


    /**
     * Glagolitic [225]
     */
    Glag(225, "Glagolitic"),


    /**
     * Gothic [206]
     */
    Goth(206, "Gothic"),


    /**
     * Grantha [343]
     */
    Gran(343, "Grantha"),


    /**
     * Greek [200]
     */
    Grek(200, "Greek"),


    /**
     * Gujarati [320]
     */
    Gujr(320, "Gujarati"),


    /**
     * Gurmukhi [310]
     */
    Guru(310, "Gurmukhi"),


    /**
     * Hangul [286]
     */
    Hang(286, "Hangul"),


    /**
     * Han [500]
     */
    Hani(500, "Han"),


    /**
     * Hanunoo [371]
     */
    Hano(371, "Hanunoo"),


    /**
     * Han [501]
     */
    Hans(501, "Han"),


    /**
     * Han [502]
     */
    Hant(502, "Han"),


    /**
     * Hebrew [125]
     */
    Hebr(125, "Hebrew"),


    /**
     * Hiragana [410]
     */
    Hira(410, "Hiragana"),


    /**
     * Anatolian Hieroglyphs [080]
     */
    Hluw(80, "Anatolian Hieroglyphs"),


    /**
     * Pahawh Hmong [450]
     */
    Hmng(450, "Pahawh Hmong"),


    /**
     * Japanese syllabaries [412]
     */
    Hrkt(412, "Japanese syllabaries"),


    /**
     * Old Hungarian [176]
     */
    Hung(176, "Old Hungarian"),


    /**
     * Indus [610]
     */
    Inds(610, "Indus"),


    /**
     * Old Italic [210]
     */
    Ital(210, "Old Italic"),


    /**
     * Javanese [361]
     */
    Java(361, "Javanese"),


    /**
     * Japanese [413]
     */
    Jpan(413, "Japanese"),


    /**
     * Jurchen [510]
     */
    Jurc(510, "Jurchen"),


    /**
     * Kayah Li [357]
     */
    Kali(357, "Kayah Li"),


    /**
     * Katakana [411]
     */
    Kana(411, "Katakana"),


    /**
     * Kharoshthi [305]
     */
    Khar(305, "Kharoshthi"),


    /**
     * Khmer [355]
     */
    Khmr(355, "Khmer"),


    /**
     * Khojki [322]
     */
    Khoj(322, "Khojki"),


    /**
     * Kannada [345]
     */
    Knda(345, "Kannada"),


    /**
     * Korean [287]
     */
    Kore(287, "Korean"),


    /**
     * Kpelle [436]
     */
    Kpel(436, "Kpelle"),


    /**
     * Kaithi [317]
     */
    Kthi(317, "Kaithi"),


    /**
     * Tai Tham [351]
     */
    Lana(351, "Tai Tham"),


    /**
     * Lao [356]
     */
    Laoo(356, "Lao"),


    /**
     * Latin [217]
     */
    Latf(217, "Latin"),


    /**
     * Latin [216]
     */
    Latg(216, "Latin"),


    /**
     * Latin [215]
     */
    Latn(215, "Latin"),


    /**
     * Lepcha [335]
     */
    Lepc(335, "Lepcha"),


    /**
     * Limbu [336]
     */
    Limb(336, "Limbu"),


    /**
     * Linear A [400]
     */
    Lina(400, "Linear A"),


    /**
     * Linear B [401]
     */
    Linb(401, "Linear B"),


    /**
     * Lisu [399]
     */
    Lisu(399, "Lisu"),


    /**
     * Loma [437]
     */
    Loma(437, "Loma"),


    /**
     * Lycian [202]
     */
    Lyci(202, "Lycian"),


    /**
     * Lydian [116]
     */
    Lydi(116, "Lydian"),


    /**
     * Mahajani [314]
     */
    Mahj(314, "Mahajani"),


    /**
     * Mandaic, Mandaean [140]
     */
    Mand(140, "Mandaic, Mandaean"),


    /**
     * Manichaean [139]
     */
    Mani(139, "Manichaean"),


    /**
     * Mayan hieroglyphs [090]
     */
    Maya(90, "Mayan hieroglyphs"),


    /**
     * Mende [438]
     */
    Mend(438, "Mende"),


    /**
     * Meroitic Cursive [101]
     */
    Merc(101, "Meroitic Cursive"),


    /**
     * Meroitic Hieroglyphs [100]
     */
    Mero(100, "Meroitic Hieroglyphs"),


    /**
     * Malayalam [347]
     */
    Mlym(347, "Malayalam"),


    /**
     * Moon [218]
     */
    Moon(218, "Moon"),


    /**
     * Mongolian [145]
     */
    Mong(145, "Mongolian"),


    /**
     * Mro, Mru [199]
     */
    Mroo(199, "Mro, Mru"),


    /**
     * Meitei Mayek [337]
     */
    Mtei(337, "Meitei Mayek"),


    /**
     * Myanmar [350]
     */
    Mymr(350, "Myanmar"),


    /**
     * Old North Arabian [106]
     */
    Narb(106, "Old North Arabian"),


    /**
     * Nabataean [159]
     */
    Nbat(159, "Nabataean"),


    /**
     * Nakhi Geba [420]
     */
    Nkgb(420, "Nakhi Geba"),


    /**
     * N’Ko [165]
     */
    Nkoo(165, "N’Ko"),


    /**
     * Nushu [499]
     */
    Nshu(499, "Nushu"),


    /**
     * Ogham [212]
     */
    Ogam(212, "Ogham"),


    /**
     * Ol Chiki [261]
     */
    Olck(261, "Ol Chiki"),


    /**
     * Old Turkic, Orkhon Runic [175]
     */
    Orkh(175, "Old Turkic, Orkhon Runic"),


    /**
     * Oriya [327]
     */
    Orya(327, "Oriya"),


    /**
     * Osmanya [260]
     */
    Osma(260, "Osmanya"),


    /**
     * Palmyrene [126]
     */
    Palm(126, "Palmyrene"),


    /**
     * Old Permic [227]
     */
    Perm(227, "Old Permic"),


    /**
     * Phags-pa [331]
     */
    Phag(331, "Phags-pa"),


    /**
     * Inscriptional Pahlavi [131]
     */
    Phli(131, "Inscriptional Pahlavi"),


    /**
     * Psalter Pahlavi [132]
     */
    Phlp(132, "Psalter Pahlavi"),


    /**
     * Book Pahlavi [133]
     */
    Phlv(133, "Book Pahlavi"),


    /**
     * Phoenician [115]
     */
    Phnx(115, "Phoenician"),


    /**
     * Miao [282]
     */
    Plrd(282, "Miao"),


    /**
     * Inscriptional Parthian [130]
     */
    Prti(130, "Inscriptional Parthian"),


    /**
     * Reserved for private use [900]
     */
    Qaaa(900, "Reserved for private use"),


    /**
     * Reserved for private use [949]
     */
    Qabx(949, "Reserved for private use"),


    /**
     * Rejang [363]
     */
    Rjng(363, "Rejang"),


    /**
     * Rongorongo [620]
     */
    Roro(620, "Rongorongo"),


    /**
     * Runic [211]
     */
    Runr(211, "Runic"),


    /**
     * Samaritan [123]
     */
    Samr(123, "Samaritan"),


    /**
     * Sarati [292]
     */
    Sara(292, "Sarati"),


    /**
     * Old South Arabian [105]
     */
    Sarb(105, "Old South Arabian"),


    /**
     * Saurashtra [344]
     */
    Saur(344, "Saurashtra"),


    /**
     * SignWriting [095]
     */
    Sgnw(95, "SignWriting"),


    /**
     * Shavian [281]
     */
    Shaw(281, "Shavian"),


    /**
     * Sharada [319]
     */
    Shrd(319, "Sharada"),


    /**
     * Khudawadi, Sindhi [318]
     */
    Sind(318, "Khudawadi, Sindhi"),


    /**
     * Sinhala [348]
     */
    Sinh(348, "Sinhala"),


    /**
     * Sora Sompeng [398]
     */
    Sora(398, "Sora Sompeng"),


    /**
     * Sundanese [362]
     */
    Sund(362, "Sundanese"),


    /**
     * Syloti Nagri [316]
     */
    Sylo(316, "Syloti Nagri"),


    /**
     * Syriac [135]
     */
    Syrc(135, "Syriac"),


    /**
     * Syriac [138]
     */
    Syre(138, "Syriac"),


    /**
     * Syriac [137]
     */
    Syrj(137, "Syriac"),


    /**
     * Syriac [136]
     */
    Syrn(136, "Syriac"),


    /**
     * Tagbanwa [373]
     */
    Tagb(373, "Tagbanwa"),


    /**
     * Takri [321]
     */
    Takr(321, "Takri"),


    /**
     * Tai Le [353]
     */
    Tale(353, "Tai Le"),


    /**
     * New Tai Lue [354]
     */
    Talu(354, "New Tai Lue"),


    /**
     * Tamil [346]
     */
    Taml(346, "Tamil"),


    /**
     * Tangut [520]
     */
    Tang(520, "Tangut"),


    /**
     * Tai Viet [359]
     */
    Tavt(359, "Tai Viet"),


    /**
     * Telugu [340]
     */
    Telu(340, "Telugu"),


    /**
     * Tengwar [290]
     */
    Teng(290, "Tengwar"),


    /**
     * Tifinagh [120]
     */
    Tfng(120, "Tifinagh"),


    /**
     * Tagalog [370]
     */
    Tglg(370, "Tagalog"),


    /**
     * Thaana [170]
     */
    Thaa(170, "Thaana"),


    /**
     * Thai [352]
     */
    Thai(352, "Thai"),


    /**
     * Tibetan [330]
     */
    Tibt(330, "Tibetan"),


    /**
     * Tirhuta [326]
     */
    Tirh(326, "Tirhuta"),


    /**
     * Ugaritic [040]
     */
    Ugar(040, "Ugaritic"),


    /**
     * Vai [470]
     */
    Vaii(470, "Vai"),


    /**
     * Visible Speech [280]
     */
    Visp(280, "Visible Speech"),


    /**
     * Warang Citi [262]
     */
    Wara(262, "Warang Citi"),


    /**
     * Woleai [480]
     */
    Wole(480, "Woleai"),


    /**
     * Old Persian [030]
     */
    Xpeo(030, "Old Persian"),


    /**
     * Cuneiform, Sumero-Akkadian [020]
     */
    Xsux(020, "Cuneiform, Sumero-Akkadian"),


    /**
     * Yi [460]
     */
    Yiii(460, "Yi"),


    /**
     * Code for inherited script [994]
     */
    Zinh(994, "Code for inherited script"),


    /**
     * Mathematical notation [995]
     */
    Zmth(995, "Mathematical notation"),


    /**
     * Symbols [996]
     */
    Zsym(996, "Symbols"),


    /**
     * Code for unwritten documents [997]
     */
    Zxxx(997, "Code for unwritten documents"),


    /**
     * Code for undetermined script [998]
     */
    Zyyy(998, "Code for undetermined script"),


    /**
     * Code for uncoded script [999]
     */
    Zzzz(999, "Code for uncoded script")
    ;


    /**
     * Map to look up ScriptCode by numeric code.
     */
    private static final Map<Integer, ScriptCode> numericMap = new HashMap<Integer, ScriptCode>();


    static
    {
        for (ScriptCode sc : values())
        {
            if (sc.getNumeric() != -1)
            {
                numericMap.put(sc.getNumeric(), sc);
            }
        }
    }


    /**
     * The numeric code of this script code.
     */
    private final int numeric;


    /**
     * English name of this script code.
     */
    private final String name;


    /**
     * Constructor.
     */
    private ScriptCode(int numeric, String name)
    {
        this.numeric = numeric;
        this.name = name;
    }


    /**
     * Get the numeric code of this script code.
     *
     * @return
     *         Numeric code.
     */
    public int getNumeric()
    {
        return numeric;
    }


    /**
     * Get English name of this script code.
     *
     * @return
     *         English name.
     */
    public String getName()
    {
        return name;
    }


    /**
     * Convert this {@code ScriptCode} instance to a {@link Locale} instance.
     *
     * <p>
     * This method creates a new {@code Locale} instance
     * every time it is called.
     * </p>
     *
     * @return
     *         A {@code Locale} instance that matches this {@code ScriptCode}.
     * @since 1.30
     */
    public Locale toLocale()
    {
        return new Locale.Builder().setScript(name()).build();
    }

    /**
     * Get a {@code ScriptCode} instance that corresponds to the given
     * ISO 15924 alpha-4 code.
     *
     * <p>
     * This method calls {@link #getByCode(String, boolean) getByCode}{@code (code, true)}.
     * Note that the behavior has changed since the version 1.13. In the older versions,
     * this method was an alias of {@code getByCode(code, false)}.
     * </p>
     *
     * @param code
     *         ISO 15924 alpha-4 code. Or "Undefined" (case sensitive).
     *
     * @return
     *         A {@code ScriptCode} instance, or {@code null} if not found.
     */
    public static ScriptCode getByCode(String code)
    {
        return getByCode(code, true);
    }


    /**
     * Get a {@code ScriptCode} instance that corresponds to the given
     * ISO 15924 alpha-4 code.
     *
     * <p>
     * This method calls {@link #getByCode(String, boolean) getByCode}{@code (code, false)}.
     * </p>
     *
     * @param code
     *         ISO 15924 alpha-4 code. Or "Undefined" (case insensitive).
     *
     * @return
     *         A {@code ScriptCode} instance, or {@code null} if not found.
     *
     * @since 1.13
     */
    public static ScriptCode getByCodeIgnoreCase(String code)
    {
        return getByCode(code, false);
    }


    /**
     * Get a {@code ScriptCode} instance that corresponds to the given
     * ISO 15924 alpha-4 code.
     *
     * @param code
     *         ISO 15924 alpha-4 code. Or "Undefined" (its case sensitivity
     *         depends on the value of {@code caseSensitive}).
     *
     * @param caseSensitive
     *         If {@code true}, the first letter of the given code should be
     *         capital and the other letters should be small. If {@code false},
     *         whether letters are capital or small does not matter.
     *         For example, {@code getByCode("JPAN", true)} returns
     *         {@code null} but {@code getByCode("JPAN", false)} returns
     *         {@link #Jpan}.
     *
     * @return
     *         A {@code ScriptCode} instance, or {@code null} if not found.
     */
    public static ScriptCode getByCode(String code, boolean caseSensitive)
    {
        if (code == null)
        {
            return null;
        }

        switch (code.length())
        {
            case 4:
            case 9:
                break;

            default:
                return null;
        }

        code = canonicalize(code, caseSensitive);

        try
        {
            return Enum.valueOf(ScriptCode.class, code);
        }
        catch (IllegalArgumentException e)
        {
            return null;
        }
    }


    /**
     * Get a {@code ScriptCode} instance that corresponds to the given
     * ISO 15924 numeric code.
     *
     * @param code
     *         ISO 15924 numeric code.
     *
     * @return
     *         A {@code ScriptCode} instance, or {@code null} if not found.
     *         If 0 or a negative value is given, {@code null} is returned.
     */
    public static ScriptCode getByCode(int code)
    {
        if (code <= 0)
        {
            return null;
        }

        return numericMap.get(code);
    }

    /**
     * Get a {@code ScriptCode} that corresponds to the script code of
     * the given {@link Locale} instance.
     *
     * @param locale
     *         A {@code Locale} instance.
     *
     * @return
     *         A {@code ScriptCode} instance, or {@code null} if not found.
     *         When {@link Locale#getScript() getScript()} method of the
     *         given {@code Locale} instance returns {@code null} or an
     *         empty string, {@link #Undefined ScriptCode.Undefined} is
     *         returned.
     *
     * @see Locale#getScript()
     */
    public static ScriptCode getByLocale(Locale locale)
    {
        if (locale == null)
        {
            return null;
        }

        String script = locale.getScript();

        if (script.isEmpty())
        {
            return ScriptCode.Undefined;
        }

        return ScriptCode.getByCode(script, true);
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

        // A new instance is assigned to this variable
        // if modification is needed.
        StringBuilder sb = null;

        for (int i = 0; i < code.length(); ++i)
        {
            char ch = code.charAt(i);

            // The first letter.
            if (i == 0)
            {
                if (Character.isUpperCase(ch) == false)
                {
                    // Modification is needed.
                    sb = new StringBuilder();
                    sb.append(Character.toUpperCase(ch));
                }
            }
            // The second and subsequent letters.
            else
            {
                if (sb == null)
                {
                    if (Character.isLowerCase(ch) == false)
                    {
                        // Modification is needed.
                        sb = new StringBuilder();

                        // Copy all the previous letters so far.
                        sb.append(code.substring(0, i));

                        // Lower the current letter.
                        sb.append(Character.toLowerCase(ch));
                    }
                }
                else
                {
                    sb.append(Character.toLowerCase(ch));
                }
            }
        }

        if (sb == null)
        {
            return code;
        }
        else
        {
            return sb.toString();
        }
    }


    /**
     * Get a list of {@code ScriptCode} by a name regular expression.
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
     *         List of {@code ScriptCode}. If nothing has matched,
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
    public static List<ScriptCode> findByName(String regex)
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
     * Get a list of {@code ScriptCode} by a name pattern.
     *
     * <p>
     * For example, the list obtained by the code snippet below:
     * </p>
     *
     * <pre style="background-color: #EEEEEE; margin-left: 2em; margin-right: 2em; border: 1px solid black; padding: 0.5em;">
     * Pattern pattern = Pattern.compile(<span style="color: darkred;">"Egyptian.*"</span>);
     * List&lt;ScriptCode&gt; list = ScriptCode.findByName(pattern);</pre>
     *
     * <p>
     * contains 3 {@code ScriptCode}s as listed below.
     * </p>
     *
     * <ol>
     * <li>{@link #Egyd} : Egyptian demotic
     * <li>{@link #Egyh} : Egyptian hieratic
     * <li>{@link #Egyp} : Egyptian hieroglyps
     * </ol>
     *
     * @param pattern
     *         Pattern to match names.
     *
     * @return
     *         List of {@code ScriptCode}. If nothing has matched,
     *         an empty list is returned.
     *
     * @throws IllegalArgumentException
     *         {@code pattern} is {@code null}.
     *
     * @since 1.11
     */
    public static List<ScriptCode> findByName(Pattern pattern)
    {
        if (pattern == null)
        {
            throw new IllegalArgumentException("pattern is null.");
        }

        List<ScriptCode> list = new ArrayList<ScriptCode>();

        for (ScriptCode entry : values())
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
