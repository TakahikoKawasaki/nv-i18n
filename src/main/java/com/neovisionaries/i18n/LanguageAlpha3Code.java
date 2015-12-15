/*
 * Copyright (C) 2012-2015 Neo Visionaries Inc.
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
import java.util.List;
import java.util.regex.Pattern;


/**
 * <a href="http://en.wikipedia.org/wiki/ISO_639-2">ISO 639-2</a>
 * language code (3-letter lowercase code).
 *
 * <p>
 * Most languages have just one ISO 639-2 code, but there are some languages
 * that have 2 codes, ISO 639-2/T code ("terminological" code) and ISO 639-2/B
 * code ("bibliographic" code). The table below lists up langueses having two
 * ISO 639-2 codes.
 * </p>
 *
 * <table border="1" style="border-collapse: collapse" cellpadding="5">
 * <tr bgcolor="orange">
 * <th>ISO 639-1</th>
 * <th>ISO 639-2/T</th>
 * <th>ISO 639-2/B</th>
 * <th>Language</th>
 * </tr>
 * <tr>
 * <td>{@link LanguageCode#bo bo}</td>
 * <td>{@link LanguageAlpha3Code#bod bod}</td>
 * <td>{@link LanguageAlpha3Code#tib tib}</td>
 * <td><a href="http://en.wikipedia.org/wiki/Standard_Tibetan">Tibetan</a></td>
 * </tr>
 * <tr>
 * <td>{@link LanguageCode#eu eu}</td>
 * <td>{@link LanguageAlpha3Code#eus eus}</td>
 * <td>{@link LanguageAlpha3Code#baq baq}</td>
 * <td><a href="http://en.wikipedia.org/wiki/Basque_language">Basque</a></td>
 * </tr>
 * <tr>
 * <td>{@link LanguageCode#cs cs}</td>
 * <td>{@link LanguageAlpha3Code#ces ces}</td>
 * <td>{@link LanguageAlpha3Code#cze cze}</td>
 * <td><a href="http://en.wikipedia.org/wiki/Czech_language">Czech</a></td>
 * </tr>
 * <tr>
 * <td>{@link LanguageCode#cy cy}</td>
 * <td>{@link LanguageAlpha3Code#cym cym}</td>
 * <td>{@link LanguageAlpha3Code#wel wel}</td>
 * <td><a href="http://en.wikipedia.org/wiki/Welsh_language">Welsh</a></td>
 * </tr>
 * <tr>
 * <td>{@link LanguageCode#de de}</td>
 * <td>{@link LanguageAlpha3Code#deu deu}</td>
 * <td>{@link LanguageAlpha3Code#ger ger}</td>
 * <td><a href="http://en.wikipedia.org/wiki/German_language">German</a></td>
 * </tr>
 * <tr>
 * <td>{@link LanguageCode#el el}</td>
 * <td>{@link LanguageAlpha3Code#ell ell}</td>
 * <td>{@link LanguageAlpha3Code#gre gre}</td>
 * <td><a href="http://en.wikipedia.org/wiki/Greek_language">Greek</a></td>
 * </tr>
 * <tr>
 * <td>{@link LanguageCode#fa fa}</td>
 * <td>{@link LanguageAlpha3Code#fas fas}</td>
 * <td>{@link LanguageAlpha3Code#per per}</td>
 * <td><a href="http://en.wikipedia.org/wiki/Persian_language">Persian</a></td>
 * </tr>
 * <tr>
 * <td>{@link LanguageCode#fr fr}</td>
 * <td>{@link LanguageAlpha3Code#fra fra}</td>
 * <td>{@link LanguageAlpha3Code#fre fre}</td>
 * <td><a href="http://en.wikipedia.org/wiki/French_language">French</a></td>
 * </tr>
 * <tr>
 * <td>{@link LanguageCode#hy hy}</td>
 * <td>{@link LanguageAlpha3Code#hye hye}</td>
 * <td>{@link LanguageAlpha3Code#arm arm}</td>
 * <td><a href="http://en.wikipedia.org/wiki/Armenian_language">Armenian</a></td>
 * </tr>
 * <tr>
 * <td>{@link LanguageCode#is is}</td>
 * <td>{@link LanguageAlpha3Code#isl isl}</td>
 * <td>{@link LanguageAlpha3Code#ice ice}</td>
 * <td><a href="http://en.wikipedia.org/wiki/Icelandic_language">Icelandic</a></td>
 * </tr>
 * <tr>
 * <td>{@link LanguageCode#ka ka}</td>
 * <td>{@link LanguageAlpha3Code#kat kat}</td>
 * <td>{@link LanguageAlpha3Code#geo geo}</td>
 * <td><a href="http://en.wikipedia.org/wiki/Georgian_language">Georgian</a></td>
 * </tr>
 * <tr>
 * <td>{@link LanguageCode#mi mi}</td>
 * <td>{@link LanguageAlpha3Code#mri mri}</td>
 * <td>{@link LanguageAlpha3Code#mao mao}</td>
 * <td><a href="http://en.wikipedia.org/wiki/M%C4%81ori_language">M&#257;ori</a>
 * </td>
 * </tr>
 * <tr>
 * <td>{@link LanguageCode#mk mk}</td>
 * <td>{@link LanguageAlpha3Code#mkd mkd}</td>
 * <td>{@link LanguageAlpha3Code#mac mac}</td>
 * <td><a href="http://en.wikipedia.org/wiki/Macedonian_language">Macedonian</a>
 * </td>
 * </tr>
 * <tr>
 * <td>{@link LanguageCode#ms ms}</td>
 * <td>{@link LanguageAlpha3Code#msa msa}</td>
 * <td>{@link LanguageAlpha3Code#may may}</td>
 * <td><a href="http://en.wikipedia.org/wiki/Malay_language">Malay</a></td>
 * </tr>
 * <tr>
 * <td>{@link LanguageCode#my my}</td>
 * <td>{@link LanguageAlpha3Code#mya mya}</td>
 * <td>{@link LanguageAlpha3Code#bur bur}</td>
 * <td><a href="http://en.wikipedia.org/wiki/Burmese_language">Burmese</a></td>
 * </tr>
 * <tr>
 * <td>{@link LanguageCode#nl nl}</td>
 * <td>{@link LanguageAlpha3Code#nld nld}</td>
 * <td>{@link LanguageAlpha3Code#dut dut}</td>
 * <td><a href="http://en.wikipedia.org/wiki/Dutch_language">Dutch</a></td>
 * </tr>
 * <tr>
 * <td>{@link LanguageCode#ro ro}</td>
 * <td>{@link LanguageAlpha3Code#ron ron}</td>
 * <td>{@link LanguageAlpha3Code#rum rum}</td>
 * <td><a href="http://en.wikipedia.org/wiki/Romanian_language">Romanian</a></td>
 * </tr>
 * <tr>
 * <td>{@link LanguageCode#sk sk}</td>
 * <td>{@link LanguageAlpha3Code#slk slk}</td>
 * <td>{@link LanguageAlpha3Code#slo slo}</td>
 * <td><a href="http://en.wikipedia.org/wiki/Slovak_language">Slovak</a></td>
 * </tr>
 * <tr>
 * <td>{@link LanguageCode#sq sq}</td>
 * <td>{@link LanguageAlpha3Code#sqi sqi}</td>
 * <td>{@link LanguageAlpha3Code#alb alb}</td>
 * <td><a href="http://en.wikipedia.org/wiki/Albanian_language">Albanian</a></td>
 * </tr>
 * </table>
 *
 * <p>
 * ISO 639-2 code for <a href="http://en.wikipedia.org/wiki/Newari_language"
 * >Newari</a> is {@code new}, but in this enum, the corresponding entry
 * is not {@code new} but {@link #New} (the first letter is capital),
 * because {@code new} is a special word for Java programming language.
 * </p>
 *
 * @since 1.1
 * @author Takahiko Kawasaki
 */
public enum LanguageAlpha3Code
{
    /**
     * Undefined.
     *
     * <p>
     * This is not an official ISO 639-2 code.
     * </p>
     *
     * @since 1.14
     * @see #und und: Undetermined
     * @see #zxx zxx: No linguistic content
     */
    undefined("Undefined")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.undefined;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Afar_language">Afar</a>
     * ({@link LanguageCode#aa aa}).
     */
    aar("Afar")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.aa;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Austro-Asiatic_languages">Austro-Asiatic languages</a>
     *
     * @since 1.10
     */
    aav("Austro-Asiatic languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Abkhaz_language">Abkhaz</a>
     * ({@link LanguageCode#ab ab}).
     */
    abk("Abkhaz")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.ab;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Achinese_language">Achinese</a>
     *
     * @since 1.10
     */
    ace("Achinese"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Acoli_language">Acoli</a>
     *
     * @since 1.10
     */
    ach("Acoli"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Adangme_language">Adangme</a>
     *
     * @since 1.10
     */
    ada("Adangme"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Adyghe_language">Adyghe</a>
     *
     * @since 1.10
     */
    ady("Adyghe"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Afro-Asiatic_languages">Afro-Asiatic languages</a>
     *
     * @since 1.10
     */
    afa("Afro-Asiatic languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Afrihili_language">Afrihili</a>
     *
     * @since 1.10
     */
    afh("Afrihili"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Afrikaans_language">Afrikaans</a>
     * ({@link LanguageCode#af af}).
     */
    afr("Afrikaans")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.af;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Ainu_language_(Japan)">Ainu (Japan)</a>
     *
     * @since 1.10
     */
    ain("Ainu (Japan)"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Akan_language">Akan</a>
     * ({@link LanguageCode#ak ak}).
     */
    aka("Akan")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.ak;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Akkadian_language">Akkadian</a>
     *
     * @since 1.10
     */
    akk("Akkadian"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Albanian_language">Albanian</a>
     * ({@link LanguageCode#sq sq}) for bibliographic applications.
     *
     * @see #sqi
     */
    alb("Albanian")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.sq;
        }


        @Override
        public Usage getUsage()
        {
            return Usage.BIBLIOGRAPHY;
        }


        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return sqi;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Aleut_language">Aleut</a>
     *
     * @since 1.10
     */
    ale("Aleut"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Algonquian_languages">Algonquian languages</a>
     *
     * @since 1.10
     */
    alg("Algonquian languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Southern_Altai_language">Southern Altai</a>
     *
     * @since 1.10
     */
    alt("Southern Altai"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Atlantic-Congo_languages">Atlantic-Congo languages<a/>
     *
     * @since 1.10
     */
    alv("Atlantic-Congo languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Amharic_language">Amharic</a>
     * ({@link LanguageCode#am am}).
     */
    amh("Amharic")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.am;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Old_English_language">Old English</a> (ca&#0046; 450-1100)
     *
     * @since 1.10
     */
    ang("Old English"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Angika_language">Angika</a>
     *
     * @since 1.10
     */
    anp("Angika"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Apache_languages">Apache languages</a>
     *
     * @since 1.10
     */
    apa("Apache languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Alacalufan_languages">Alacalufan languages</a>
     *
     * @since 1.10
     */
    aqa("Alacalufan languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Algic_languages">Algic languages</a>
     *
     * @since 1.10
     */
    aql("Algic languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Arabic_language">Arabic</a>
     * ({@link LanguageCode#ar ar}).
     */
    ara("Arabic")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.ar;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Official_Aramaic_language">Official Aramaic</a> (700-300 BCE)
     *
     * @since 1.10
     */
    arc("Official Aramaic"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Aragonese_language">Aragonese</a>
     * ({@link LanguageCode#an an}).
     */
    arg("Aragonese")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.an;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Armenian_language">Armenian</a>
     * ({@link LanguageCode#hy hy}) for bibliographic applications.
     *
     * @see #hye
     */
    arm("Armenian")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.hy;
        }


        @Override
        public Usage getUsage()
        {
            return Usage.BIBLIOGRAPHY;
        }


        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return hye;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Mapudungun_language">Mapudungun</a>
     *
     * @since 1.10
     */
    arn("Mapudungun"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Arapaho_language">Arapaho</a>
     *
     * @since 1.10
     */
    arp("Arapaho"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Artificial_languages">Artificial languages</a>
     *
     * @since 1.10
     */
    art("Artificial languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Arawak_language">Arawak</a>
     *
     * @since 1.10
     */
    arw("Arawak"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Assamese_language">Assamese</a>
     * ({@link LanguageCode#as as}).
     */
    asm("Assamese")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.as;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Asturian_language">Asturian</a>
     *
     * @since 1.10
     */
    ast("Asturian"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Athapascan_languages">Athapascan languages</a>
     *
     * @since 1.10
     */
    ath("Athapascan languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Arauan_languages">Arauan languages</a>
     *
     * @since 1.10
     */
    auf("Arauan languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Australian_languages">Australian languages</a>
     *
     * @since 1.10
     */
    aus("Australian languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Avar_language">Avaric</a>
     * ({@link LanguageCode#av av}).
     */
    ava("Avaric")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.av;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Avestan_language">Avestan</a>
     * ({@link LanguageCode#ae ae}).
     */
    ave("Avestan")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.ae;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Awadhi_language">Awadhi</a>
     *
     * @since 1.10
     */
    awa("Awadhi"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Arawakan_languages">Arawakan languages</a>
     *
     * @since 1.10
     */
    awd("Arawakan languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Aymara_language">Aymara</a>
     * ({@link LanguageCode#ay ay}).
     */
    aym("Aymara")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.ay;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Uto-Aztecan_languages">Uto-Aztecan languages</a>
     *
     * @since 1.10
     */
    azc("Uto-Aztecan languages"),

    /**
     * <a
     * href="http://en.wikipedia.org/wiki/Azerbaijani_language">Azerbaijani</a>
     * ({@link LanguageCode#az az}).
     */
    aze("Azerbaijani")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.az;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Banda_languages">Banda languages</a>
     *
     * @since 1.10
     */
    bad("Banda languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Bamileke_languages">Bamileke languages</a>
     *
     * @since 1.10
     */
    bai("Bamileke languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Bashkir_language">Bashkir</a>
     * ({@link LanguageCode#ba ba}).
     */
    bak("Bashkir")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.ba;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Baluchi_language">Baluchi</a>
     */
    bal("Baluchi"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Bambara_language">Bambara</a>
     * ({@link LanguageCode#bm bm}).
     */
    bam("Bambara")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.bm;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Balinese_language">Balinese</a>
     *
     * @since 1.10
     */
    ban("Balinese"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Basque_language">Basque</a>
     * ({@link LanguageCode#eu eu}) for bibliographic applications.
     *
     * @see #eus
     */
    baq("Basque")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.eu;
        }


        @Override
        public Usage getUsage()
        {
            return Usage.BIBLIOGRAPHY;
        }


        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return eus;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Basa_language_(Cameroon)">Basa (Cameroon)</a>
     *
     * @since 1.10
     */
    bas("Basa (Cameroon)"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Baltic_languages">Baltic languages</a>
     *
     * @since 1.10
     */
    bat("Baltic languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Beja_language">Beja</a>
     *
     * @since 1.10
     */
    bej("Beja"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Belarusian_language">Belarusian</a>
     * ({@link LanguageCode#be be}).
     */
    bel("Belarusian")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.be;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Bemba_language_(Zambia)">Bemba (Zambia)</a>
     *
     * @since 1.10
     */
    bem("Bemba (Zambia)"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Bengali_language">Bengali</a>
     * ({@link LanguageCode#bn bn}).
     */
    ben("Bengali")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.bn;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Berber_languages">Berber languages</a>
     *
     * @since 1.10
     */
    ber("Berber languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Bhojpuri_language">Bhojpuri</a>
     *
     * @since 1.10
     */
    bho("Bhojpuri"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Bihari_languages">Bihari</a>
     * ({@link LanguageCode#bh bh}).
     */
    bih("Bihari languages")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.bh;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Bikol_language">Bikol</a>
     *
     * @since 1.10
     */
    bik("Bikol"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Bini_language">Bini</a>
     *
     * @since 1.10
     */
    bin("Bini"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Bislama_language">Bislama</a>
     * ({@link LanguageCode#bi bi}).
     */
    bis("Bislama")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.bi;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Siksika_language">Siksika</a>
     *
     * @since 1.10
     */
    bla("Siksika"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Bantu_languages">Bantu languages</a>
     *
     * @since 1.10
     */
    bnt("Bantu languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Standard_Tibetan">Tibetan</a>
     * ({@link LanguageCode#bo bo}) for terminology applications.
     *
     * @see #tib
     */
    bod("Tibetan")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.bo;
        }


        @Override
        public Usage getUsage()
        {
            return Usage.TERMINOLOGY;
        }


        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return tib;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Bosnian_language">Bosnian</a>
     * ({@link LanguageCode#bs bs}).
     */
    bos("Bosnian")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.bs;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Braj_language">Braj</a>
     *
     * @since 1.10
     */
    bra("Braj"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Breton_language">Breton</a>
     * ({@link LanguageCode#br br}).
     */
    bre("Breton")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.br;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Batak_languages">Batak languages</a>
     *
     * @since 1.10
     */
    btk("Batak languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Buriat_language">Buriat</a>
     *
     * @since 1.10
     */
    bua("Buriat"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Buginese_language">Buginese</a>
     *
     * @since 1.10
     */
    bug("Buginese"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Bulgarian_language">Bulgarian</a>
     * ({@link LanguageCode#bg bg}).
     */
    bul("Bulgarian")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.bg;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Burmese_language">Burmese</a>
     * ({@link LanguageCode#my my}) for bibliographic applications.
     *
     * @see #mya
     */
    bur("Burmese")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.my;
        }


        @Override
        public Usage getUsage()
        {
            return Usage.BIBLIOGRAPHY;
        }


        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return mya;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Bilin_language">Bilin</a>
     *
     * @since 1.10
     */
    byn("Bilin"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Caddo_language">Caddo</a>
     *
     * @since 1.10
     */
    cad("Caddo"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Central_American_Indian_languages">Central American Indian languages</a>
     *
     * @since 1.10
     */
    cai("Central American Indian languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Galibi_Carib_language">Galibi Carib</a>
     *
     * @since 1.10
     */
    car("Galibi Carib"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Catalan_language">Catalan</a>
     * ({@link LanguageCode#ca ca}).
     */
    cat("Catalan")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.ca;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Caucasian_languages">Caucasian languages</a>
     *
     * @since 1.10
     */
    cau("Caucasian languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Chibchan_languages">Chibchan languages</a>
     *
     * @since 1.10
     */
    cba("Chibchan languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/North_Caucasian_languages">North Caucasian languages</a>
     *
     * @since 1.10
     */
    ccn("North Caucasian languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/South_Caucasian_languages">South Caucasian languages</a>
     *
     * @since 1.10
     */
    ccs("South Caucasian languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Chadic_languages">Chadic languages</a>
     *
     * @since 1.10
     */
    cdc("Chadic languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Caddoan_languages">Caddoan languages</a>
     *
     * @since 1.10
     */
    cdd("Caddoan languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Cebuano_language">Cebuano</a>
     *
     * @since 1.10
     */
    ceb("Cebuano"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Celtic_languages">Celtic languages</a>
     *
     * @since 1.10
     */
    cel("Celtic languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Czech_language">Czech</a>
     * ({@link LanguageCode#cs cs}) for terminology applications.
     *
     * @see #cze
     */
    ces("Czech")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.cs;
        }


        @Override
        public Usage getUsage()
        {
            return Usage.TERMINOLOGY;
        }


        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return cze;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Chamorro_language">Chamorro</a>
     * ({@link LanguageCode#ch ch}).
     */
    cha("Chamorro")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.ch;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Chibcha_language">Chibcha</a>
     *
     * @since 1.10
     */
    chb("Chibcha"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Chechen_language">Chechen</a>
     * ({@link LanguageCode#ce ce}).
     */
    che("Chechen")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.ce;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Chagatai_language">Chagatai</a>
     *
     * @since 1.10
     */
    chg("Chagatai"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Chinese_language">Chinese</a>
     * ({@link LanguageCode#zh zh}) for bibliographic applications.
     *
     * @see #zho
     */
    chi("Chinese")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.zh;
        }


        @Override
        public Usage getUsage()
        {
            return Usage.BIBLIOGRAPHY;
        }


        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return zho;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Chuukese_language">Chuukese</a>
     *
     * @since 1.10
     */
    chk("Chuukese"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Mari_language_(Russia)">Mari (Russia)</a>
     *
     * @since 1.10
     */
    chm("Mari (Russia)"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Chinook_jargon_language">Chinook jargon</a>
     *
     * @since 1.10
     */
    chn("Chinook jargon"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Choctaw_language">Choctaw</a>
     *
     * @since 1.10
     */
    cho("Choctaw"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Chipewyan_language">Chipewyan</a>
     *
     * @since 1.10
     */
    chp("Chipewyan"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Cherokee_language">Cherokee</a>
     *
     * @since 1.10
     */
    chr("Cherokee"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Old_Church_Slavonic">Church
     * Slavonic</a>
     * ({@link LanguageCode#cu cu}).
     */
    chu("Church Slavic")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.cu;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Chuvash_language">Chuvash</a>
     * ({@link LanguageCode#cv cv}).
     */
    chv("Chuvash")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.cv;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Cheyenne_language">Cheyenne</a>
     *
     * @since 1.10
     */
    chy("Cheyenne"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Chamic_languages">Chamic languages</a>
     *
     * @since 1.10
     */
    cmc("Chamic languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Coptic_language">Coptic</a>
     *
     * @since 1.1.0
     */
    cop("Coptic"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Cornish_language">Cornish</a>
     * ({@link LanguageCode#kw kw}).
     */
    cor("Comish")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.kw;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Corsican_language">Corsican</a>
     * ({@link LanguageCode#co co}).
     */
    cos("Corsican")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.co;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/English_based_Creoles"
     * >English based Creoles</a> and
     * <a href="http://en.wikipedia.org/wiki/English_based_pidgins"
     * >pidgins</a>
     *
     * @since 1.10
     */
    cpe("English based Creoles and pidgins"),

    /**
     * <a href="http://en.wikipedia.org/wiki/French-Based_Creoles"
     * >French-Based Creoles</a> and
     * <a href="http://en.wikipedia.org/wiki/French-Based_pidgins"
     * >pidgins</a>
     *
     * @since 1.10
     */
    cpf("French-Based Creoles and pidgins"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Portuguese-Based_Creoles"
     * >Portuguese-Based Creoles</a> and
     * <a href="http://en.wikipedia.org/wiki/Portuguese-Based_pidgins"
     * >pidgins</a>
     *
     * @since 1.10
     */
    cpp("Portuguese-Based Creoles and pidgins"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Cree_language">Cree</a>
     * ({@link LanguageCode#cr cr}).
     */
    cre("Cree")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.cr;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Crimean_Tatar_language">Crimean Tatar</a>
     *
     * @since 1.10
     */
    crh("Crimean Tatar"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Creole_language"
     * >Creoles</a> and
     * <a href="http://en.wikipedia.org/wiki/Pidgin_language"
     * >pidgins</a>
     *
     * @since 1.10
     */
    crp("Creoles and pidgins"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Kashubian_language">Kashubian</a>
     *
     * @since 1.10
     */
    csb("Kashubian"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Central_Sudanic_languages">Central Sudanic languages</a>
     *
     * @since 1.10
     */
    csu("Central Sudanic languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Cushitic_languages">Cushitic languages</a>
     *
     * @since 1.10
     */
    cus("Cushitic languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Welsh_language">Welsh</a>
     * ({@link LanguageCode#cy cy}) for terminology applications.
     *
     * @see #wel
     */
    cym("Welsh")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.cy;
        }


        @Override
        public Usage getUsage()
        {
            return Usage.TERMINOLOGY;
        }


        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return wel;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Czech_language">Czech</a>
     * ({@link LanguageCode#cs cs}) for bibliographic applications.
     *
     * @see #ces
     */
    cze("Czech")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.cs;
        }


        @Override
        public Usage getUsage()
        {
            return Usage.BIBLIOGRAPHY;
        }


        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return ces;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Dakota_language">Dakota</a>
     *
     * @since 1.10
     */
    dak("Dakota"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Danish_language">Danish</a>
     * {@link LanguageCode#da da}).
     */
    dan("Danish")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.da;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Dargwa_language">Dargwa</a>
     *
     * @since 1.10
     */
    dar("Dargwa"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Land_Dayak_languages">Land Dayak languages</a>
     *
     * @since 1.10
     */
    day("Land Dayak languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Delaware_language">Delaware</a>
     *
     * @since 1.10
     */
    del("Delaware"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Slave_language_(Athapascan)">Slave (Athapascan)</a>
     *
     * @since 1.10
     */
    den("Slave (Athapascan)"),

    /**
     * <a href="http://en.wikipedia.org/wiki/German_language">German</a>
     * ({@link LanguageCode#de de}) for terminology applications.
     *
     * @see #ger
     */
    deu("German")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.de;
        }


        @Override
        public Usage getUsage()
        {
            return Usage.TERMINOLOGY;
        }


        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return ger;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Dogrib_language">Dogrib</a>
     *
     * @since 1.10
     */
    dgr("Dogrib"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Dinka_language">Dinka</a>
     *
     * @since 1.10
     */
    din("Dinka"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Dhivehi_language">Dhivehi</a>
     * ({@link LanguageCode#dv dv}).
     */
    div("Dhivehi")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.dv;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Mande_languages">Mande languages</a>
     *
     * @since 1.10
     */
    dmn("Mande languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Dogri_language">Dogri</a> (macrolanguage)
     *
     * @since 1.10
     */
    doi("Dogri"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Dravidian_languages">Dravidian languages</a>
     *
     * @since 1.10
     */
    dra("Dravidian languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Lower_Sorbian_language">Lower Sorbian</a>
     *
     * @since 1.10
     */
    dsb("Lower Sorbian"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Duala_language">Duala</a>
     *
     * @since 1.10
     */
    dua("Duala"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Middle_Dutch_language">Middle Dutch</a> (ca. 1050-1350)
     *
     * @since 1.10
     */
    dum("Middle Dutch"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Dutch_language">Dutch</a>
     * ({@link LanguageCode#nl nl}) for bibliography applications.
     *
     * @see #nld
     */
    dut("Dutch")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.nl;
        }


        @Override
        public Usage getUsage()
        {
            return Usage.BIBLIOGRAPHY;
        }


        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return nld;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Dyula_language">Dyula</a>
     *
     * @since 1.10
     */
    dyu("Dyula"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Dzongkha_language">Dzongkha</a>
     * ({@link LanguageCode#dz dz}).
     */
    dzo("Dzongkha")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.dz;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Efik_language">Efik</a>
     *
     * @since 1.10
     */
    efi("Efik"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Egyptian_languages">Egyptian languages</a>
     *
     * @since 1.10
     */
    egx("Egyptian languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Egyptian_language_(Ancient)">Egyptian (Ancient)</a>
     *
     * @since 1.10
     */
    egy("Egyptian (Ancient)"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Ekajuk_language">Ekajuk</a>
     *
     * @since 1.10
     */
    eka("Ekajuk"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Modern_Greek_language"
     * >Modern Greek</a> (1453-)
     * ({@link LanguageCode#el el}) for terminology applications.
     *
     * @see #gre Modern Greek (gre)
     * @see #grc Acient Greek (grc)
     */
    ell("Modern Greek")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.el;
        }


        @Override
        public Usage getUsage()
        {
            return Usage.TERMINOLOGY;
        }


        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return gre;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Elamite_language">Elamite</a>
     *
     * @since 1.10
     */
    elx("Elamite"),

    /**
     * <a href="http://en.wikipedia.org/wiki/English_language">English</a>
     * ({@link LanguageCode#en en}).
     */
    eng("English")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.en;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Middle_English_language">Middle English</a> (1100-1500)
     */
    enm("Middle English"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Esperanto">Esperanto</a>
     * ({@link LanguageCode#eo eo}).
     */
    epo("Esperanto")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.eo;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Estonian_language">Estonian</a>
     * ({@link LanguageCode#et et}).
     */
    est("Estonian")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.et;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Eskimo-Aleut_languages">Eskimo-Aleut languages</a>
     *
     * @since 1.10
     */
    esx("Eskimo-Aleut languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Basque_language">Basque</a> (family)
     *
     * @since 1.10
     */
    euq("Basque"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Basque_language">Basque</a> (family)
     * ({@link LanguageCode#eu eu}) for terminology applications.
     *
     * @see #baq
     */
    eus("Basque (family)")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.eu;
        }


        @Override
        public Usage getUsage()
        {
            return Usage.TERMINOLOGY;
        }


        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return baq;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Ewe_language">Ewe</a>
     * ({@link LanguageCode#ee ee}).
     */
    ewe("Ewe")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.ee;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Ewondo_language">Ewondo</a>
     *
     * @since 1.10
     */
    ewo("Ewondo"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Fang_language_(Equatorial_Guinea)">Fang (Equatorial Guinea)</a>
     *
     * @since 1.10
     */
    fan("Fang (Equatorial Guinea)"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Faroese_language">Faroese</a>
     * ({@link LanguageCode#fo fo}).
     */
    fao("Faroese")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.fo;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Persian_language">Persian</a>
     * ({@link LanguageCode#fa fa}) for terminology applications.
     *
     * @see #per
     */
    fas("Persian")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.fa;
        }


        @Override
        public Usage getUsage()
        {
            return Usage.TERMINOLOGY;
        }


        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return per;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Fanti_language">Fanti</a>
     *
     * @since 1.10
     */
    fat("Fanti"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Fijian_language">Fijian</a>
     * ({@link LanguageCode#fj fj}).
     */
    fij("Fijian")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.fj;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Filipino_language">Filipino</a>
     *
     * @since 1.10
     */
    fil("Filipino"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Finnish_language">Finnish</a>
     * ({@link LanguageCode#fi fi}).
     */
    fin("Finnish")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.fi;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Finno-Ugrian_languages">Finno-Ugrian languages</a>
     *
     * @since 1.10
     */
    fiu("Finno-Ugrian languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Fon_language">Fon</a>
     *
     * @since 1.10
     */
    fon("Fon"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Formosan_languages">Formosan languages</a>
     *
     * @since 1.10
     */
    fox("Formosan languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/French_language">French</a>
     * ({@link LanguageCode#fr fr}) for terminology applications.
     *
     * @see #fre
     */
    fra("French")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.fr;
        }


        @Override
        public Usage getUsage()
        {
            return Usage.TERMINOLOGY;
        }


        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return fre;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/French_language">French</a>
     * ({@link LanguageCode#fr fr}) for bibliographic applications.
     *
     * @see #fra
     */
    fre("French")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.fr;
        }


        @Override
        public Usage getUsage()
        {
            return Usage.BIBLIOGRAPHY;
        }


        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return fra;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Middle_French_language">Middle French</a> (ca&#0046; 1400-1600)
     *
     * @since 1.10
     */
    frm("Middle French"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Old_French_language">Old French</a> (842-ca&#0046; 1400)
     *
     * @since 1.10
     */
    fro("Old French"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Northern_Frisian_language">Northern Frisian</a>
     *
     * @since 1.10
     */
    frr("Northern Frisian"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Eastern_Frisian_language">Eastern Frisian</a>
     *
     * @since 1.10
     */
    frs("Eastern Frisian"),

    /**
     * <a href="http://en.wikipedia.org/wiki/West_Frisian_language">West
     * Frisian</a>
     * ({@link LanguageCode#fy fy}).
     */
    fry("West Frisian")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.fy;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Fula_language">Fula</a>
     * ({@link LanguageCode#ff ff}).
     */
    ful("Fula")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.ff;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Friulian_language">Friulian</a>
     *
     * @since 1.10
     */
    fur("Friulian"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Ga_language">Ga</a>
     *
     * @since 1.10
     */
    gaa("Ga"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Gayo_language">Gayo</a>
     *
     * @since 1.10
     */
    gay("Gayo"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Gbaya_language_(Central_African_Republic)">Gbaya (Central African Republic)</a>
     *
     * @since 1.10
     */
    gba("Gbaya (Central African Republic)"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Germanic_languages">Germanic languages</a>
     *
     * @since 1.10
     */
    gem("Germanic languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Georgian_language">Georgian</a>
     * ({@link LanguageCode#ka ka}) for bibliographic applications.
     *
     * @see #kat
     */
    geo("Georgian")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.ka;
        }


        @Override
        public Usage getUsage()
        {
            return Usage.BIBLIOGRAPHY;
        }


        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return kat;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/German_language">German</a>
     * ({@link LanguageCode#de de}) for bibliographic applications.
     *
     * @see #deu
     */
    ger("German")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.de;
        }


        @Override
        public Usage getUsage()
        {
            return Usage.BIBLIOGRAPHY;
        }


        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return deu;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Geez_language">Geez</a>
     *
     * @since 1.10
     */
    gez("Geez"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Gilbertese_language">Gilbertese</a>
     *
     * @since 1.10
     */
    gil("Gilbertese"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Scottish_Gaelic_language">Scottish
     * Gaelic</a>
     * ({@link LanguageCode#gd gd}).
     */
    gla("Scottish Gaelic")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.gd;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Irish_language">Irish</a>
     * ({@link LanguageCode#ga ga}).
     */
    gle("Irish")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.ga;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Galician_language">Galician</a>
     * ({@link LanguageCode#gl gl}).
     */
    glg("Galician")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.gl;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Manx_language">Manx</a>
     * ({@link LanguageCode#gv gv}).
     */
    glv("Manx")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.gv;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/East_Germanic_languages">East Germanic languages</a>
     *
     * @since 1.10
     */
    gme("East Germanic languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Middle_High_German_language"
     * >Middle High German</a> (ca&#0046; 1050-1500)
     *
     * @since 1.10
     */
    gmh("Middle High German"),

    /**
     * <a href="http://en.wikipedia.org/wiki/North_Germanic_languages"
     * >North Germanic languages</a>
     *
     * @since 1.10
     */
    gmq("North Germanic languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/West_Germanic_languages"
     * >West Germanic languages</a>
     *
     * @since 1.10
     */
    gmw("West Germanic languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Old_High_German_language"
     * >Old High German</a> (ca&#0046; 750-1050)
     *
     * @since 1.10
     */
    goh("Old High German"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Gondi_language">Gondi</a>
     *
     * @since 1.10
     */
    gon("Gondi"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Gorontalo_language">Gorontalo</a>
     *
     * @since 1.10
     */
    gor("Gorontalo"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Gothic_language">Gothic</a>
     *
     * @since 1.10
     */
    got("Gothic"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Grebo_language">Grebo</a>
     *
     * @since 1.10
     */
    grb("Grebo"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Ancient_Greek_language"
     * >Ancient Greek</a> (to 1453)
     *
     * @see #ell Modern Greek (ell)
     * @since 1.10
     */
    grc("Ancient Greek"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Modern_Greek_language"
     * >Modern Greek</a> (1453-)
     * ({@link LanguageCode#el el}) for bibliographic applications.
     *
     * @see #ell Modern Greek (ell)
     * @see #grc Acient Greek (grc)
     */
    gre("Modern Greek")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.el;
        }


        @Override
        public Usage getUsage()
        {
            return Usage.BIBLIOGRAPHY;
        }


        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return ell;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Greek_languages">Greek languages</a>
     *
     * @since 1.10
     */
    grk("Greek languages"),

    /**
     * <a
     * href="http://en.wikipedia.org/wiki/Guaran%C3%AD_language">Guaran&iacute
     * ;</a>
     * ({@link LanguageCode#gn gn}).
     */
    grn("Guaran\u00ED")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.gn;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Swiss_German_language">Swiss German</a>
     *
     * @since 1.10
     */
    gsw("Swiss German"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Gujarati_language">Gujarati</a>
     * ({@link LanguageCode#gu gu}).
     */
    guj("Gujarati")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.gu;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Gwich%CA%BCin_language">Gwich&#x2bc;in</a>
     *
     * @since 1.10
     */
    gwi("Gwich\u02BCin"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Haida_language">Haida</a>
     *
     * @since 1.10
     */
    hai("Haida"),

    /**
     * <a
     * href="http://en.wikipedia.org/wiki/Haitian_Creole_language">Haitian</a>
     * ({@link LanguageCode#ht ht}).
     */
    hat("Haitian")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.ht;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Hausa_language">Hausa</a>
     * ({@link LanguageCode#ha ha}).
     */
    hau("Hausa")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.ha;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Hawaiian_language">Hawaiian</a>
     *
     * @since 1.10
     */
    haw("Hawaiian"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Hebrew_language">Hebrew</a>
     * ({@link LanguageCode#he he}).
     */
    heb("Hebrew")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.he;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Herero_language">Herero</a>
     * ({@link LanguageCode#hz hz}).
     */
    her("Herero")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.hz;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Hiligaynon_language">Hiligaynon</a>
     *
     * @since 1.10
     */
    hil("Hiligaynon"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Himachali_languages">Himachali languages</a>
     *
     * @since 1.10
     */
    him("Himachali languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Hindi">Hindi</a>
     * ({@link LanguageCode#hi hi}).
     */
    hin("Hindi")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.hi;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Hittite_language">Hittite</a>
     *
     * @since 1.10
     */
    hit("Hittite"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Hmong_language">Hmong</a>
     *
     * @since 1.10
     */
    hmn("Hmong"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Hiri_Motu_language">Hiri Motu</a>
     * ({@link LanguageCode#ho ho}).
     */
    hmo("Hiri Motu")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.ho;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Hmong-Mien_languages">Hmong-Mien languages</a>
     *
     * @since 1.10
     */
    hmx("Hmong-Mien languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Hokan_languages">Hokan languages</a>
     *
     * @since 1.10
     */
    hok("Hokan languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Croatian_language">Croatian</a>
     * ({@link LanguageCode#hr hr}).
     */
    hrv("Croatian")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.hr;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Upper_Sorbian_language">Upper Sorbian</a>
     *
     * @since 1.10
     */
    hsb("Upper Sorbian"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Hungarian_language">Hungarian</a>
     * ({@link LanguageCode#hu hu}).
     */
    hun("Hungarian")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.hu;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Hupa_language">Hupa</a>
     *
     * @since 1.10
     */
    hup("Hupa"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Armenian_language">Armenian</a>
     * ({@link LanguageCode#hy hy}) for terminology applications.
     *
     * @see #arm
     */
    hye("Armenian")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.hy;
        }


        @Override
        public Usage getUsage()
        {
            return Usage.TERMINOLOGY;
        }


        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return arm;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Armenian_language">Armenian</a> (family)
     *
     * @since 1.10
     */
    hyx("Armenian (family)"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Iban_language">Iban</a>
     *
     * @since 1.10
     */
    iba("Iban"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Igbo_language">Igbo</a>
     * ({@link LanguageCode#ig ig}).
     */
    ibo("Igbo")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.ig;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Icelandic_language">Icelandic</a>
     * ({@link LanguageCode#is is}) for biblioraphic applications.
     *
     * @see #isl
     */
    ice("Icelandic")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.is;
        }


        @Override
        public Usage getUsage()
        {
            return Usage.BIBLIOGRAPHY;
        }


        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return isl;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Ido">Ido</a>
     * ({@link LanguageCode#io io}).
     */
    ido("Ido")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.io;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Nuosu_language">Nuosu</a>
     * ({@link LanguageCode#ii ii}).
     */
    iii("Nuosu")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.ii;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Indo-Iranian_languages">Indo-Iranian languages</a>
     *
     * @since 1.10
     */
    iir("Indo-Iranian languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Ijo_languages">Ijo languages</a>
     *
     * @since 1.10
     */
    ijo("Ijo languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Inuktitut">Inuktitut</a>
     * ({@link LanguageCode#iu iu}).
     */
    iku("Inuktitut")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.iu;
        }
    },

    /**
     * <a
     * href="http://en.wikipedia.org/wiki/Interlingue_language">Interlingue</a>
     * ({@link LanguageCode#ie ie}).
     */
    ile("Interlingue")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.ie;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Iloko_language">Iloko</a>
     *
     * @since 1.10
     */
    ilo("Iloko"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Interlingua">Interlingua</a>
     * {@link LanguageCode#ia ia}).
     */
    ina("Interlingua")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.ia;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Interlingua_language_(International_Auxiliary_Language_Association)"
     * >Interlingua (International Auxiliary Language Association)</a>
     *
     * @since 1.10
     */
    inc("Interlingua (International Auxiliary Language Association)"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Indonesian_language">Indonesian</a>
     * ({@link LanguageCode#id id}).
     */
    ind("Indonesian")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.id;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Indo-European_languages">Indo-European languages</a>
     *
     * @since 1.10
     */
    ine("Indo-European languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Ingush_language">Ingush</a>
     *
     * @since 1.10
     */
    inh("Ingush"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Inupiaq_language">Inupiaq</a>
     * ({@link LanguageCode#ik ik}).
     */
    ipk("Inupiaq")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.ik;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Iranian_languages">Iranian languages</a>
     *
     * @since 1.10
     */
    ira("Iranian languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Iroquoian_languages">Iroquoian languages</a>
     *
     * @since 1.10
     */
    iro("Iroquoian languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Icelandic_language">Icelandic</a>
     * ({@link LanguageCode#is is}) for terminology applications.
     *
     * @see #ice
     */
    isl("Icelandic")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.is;
        }


        @Override
        public Usage getUsage()
        {
            return Usage.TERMINOLOGY;
        }


        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return ice;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Italian_language">Italian</a>
     * ({@link LanguageCode#it it}).
     */
    ita("Italian")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.it;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Italic_languages">Italic languages</a>
     *
     * @since 1.10
     */
    itc("Italic languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Javanese_language">Javanese</a>
     * ({@link LanguageCode#jv jv}).
     */
    jav("Javanese")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.jv;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Lojban_language">Lojban</a>
     *
     * @since 1.10
     */
    jbo("Lojban"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Japanese_language">Japanese</a>
     * ({@link LanguageCode#ja ja}).
     */
    jpn("Japanese")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.ja;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Judeo-Persian_language">Judeo-Persian</a>
     *
     * @since 1.10
     */
    jpr("Judeo-Persian"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Japanese_language">Japanese</a> (family)
     *
     * @since 1.10
     */
    jpx("Japanese (family)"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Judeo-Arabic_language">Judeo-Arabic</a>
     *
     * @since 1.10
     */
    jrb("Judeo-Arabic"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Kara-Kalpak_language">Kara-Kalpak</a>
     *
     * @since 1.10
     */
    kaa("Kara-Kalpak"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Kabyle_language">Kabyle</a>
     *
     * @since 1.10
     */
    kab("Kabyle"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Kachin_language">Kachin</a>
     *
     * @since 1.10
     */
    kac("Kachin"),

    /**
     * <a
     * href="http://en.wikipedia.org/wiki/Kalaallisut_language">Kalaallisut</a>
     * ({@link LanguageCode#kl kl}).
     */
    kal("Kalaallisut")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.kl;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Kamba_language_(Kenya)">Kamba (Kenya)</a>
     *
     * @since 1.10
     */
    kam("Kamba (Kenya)"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Kannada_language">Kannada</a>
     * ({@link LanguageCode#kn kn}).
     */
    kan("Kannada")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.kn;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Karen_languages">Karen languages</a>
     *
     * @since 1.10
     */
    kar("Karen languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Kashmiri_language">Kashmiri</a>
     * ({@link LanguageCode#ks ks}).
     */
    kas("Kashmiri")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.ks;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Georgian_language">Georgian</a>
     * ({@link LanguageCode#ka ka}) for terminology applications.
     *
     * @see #geo
     */
    kat("Georgian")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.ka;
        }


        @Override
        public Usage getUsage()
        {
            return Usage.TERMINOLOGY;
        }


        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return geo;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Kanuri_language">Kanuri</a>
     * ({@link LanguageCode#kr kr}).
     */
    kau("Kanuri")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.kr;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Kawi_language">Kawi</a>
     *
     * @since 1.10
     */
    kaw("Kawi"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Kazakh_language">Kazakh</a>
     * ({@link LanguageCode#kk kk}).
     */
    kaz("Kazakh")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.kk;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Kabardian_language">Kabardian</a>
     *
     * @since 1.10
     */
    kbd("Kabardian"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Kordofanian_languages">Kordofanian languages</a>
     *
     * @since 1.10
     */
    kdo("Kordofanian languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Khasi_language">Khasi</a>
     *
     * @since 1.10
     */
    kha("Khasi"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Khoisan_languages">Khoisan languages</a>
     *
     * @since 1.10
     */
    khi("Khoisan languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Khmer_language">Khmer</a>
     * ({@link LanguageCode#km km}).
     */
    khm("Central Khmer")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.km;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Khotanese_language">Khotanese</a>
     *
     * @since 1.10
     */
    kho("Khotanese"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Gikuyu_language">Kikuyu</a>
     * ({@link LanguageCode#ki ki}).
     */
    kik("Kikuyu")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.ki;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Kinyarwanda">Kinyarwanda</a>
     * ({@link LanguageCode#rw rw}).
     */
    kin("Kinyarwanda")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.rw;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Kyrgyz_language">Kyrgyz</a>
     * ({@link LanguageCode#ky ky}).
     */
    kir("Kirghiz")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.ky;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Kimbundu_language">Kimbundu</a>
     *
     * @since 1.10
     */
    kmb("Kimbundu"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Konkani_language">Konkani</a> (macrolanguage)
     *
     * @since 1.10
     */
    kok("Konkani"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Komi_language">Komi</a>
     * ({@link LanguageCode#kv kv}).
     */
    kom("Komi")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.kv;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Kongo_language">Kongo</a>
     * ({@link LanguageCode#kg kg}).
     */
    kon("Kongo")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.kg;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Korean_language">Korean</a>
     * ({@link LanguageCode#ko ko}).
     */
    kor("Korean")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.ko;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Kosraean_language">Kosraean</a>
     *
     * @since 1.10
     */
    kos("Kosraean"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Kpelle_language">Kpelle</a>
     *
     * @since 1.10
     */
    kpe("Kpelle"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Karachay-Balkar_language">Karachay-Balkar</a>
     *
     * @since 1.10
     */
    krc("Karachay-Balkar"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Karelian_language">Karelian</a>
     *
     * @since 1.10
     */
    krl("Karelian"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Kru_languages">Kru languages</a>
     *
     * @since 1.10
     */
    kro("Kru languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Kurukh_language">Kurukh</a>
     *
     * @since 1.10
     */
    kru("Kurukh"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Kwanyama">Kwanyama</a>
     * ({@link LanguageCode#kj kj}).
     */
    kua("Kuanyama")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.kj;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Kumyk_language">Kumyk</a>
     *
     * @since 1.10
     */
    kum("Kumyk"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Kurdish_language">Kurdish</a>
     * ({@link LanguageCode#ku ku}).
     */
    kur("Kurdish")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.ku;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Kutenai_language">Kutenai</a>
     *
     * @since 1.10
     */
    kut("Kutenai"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Ladino_language">Ladino</a>
     *
     * @since 1.10
     */
    lad("Ladino"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Lahnda_language">Lahnda</a>
     *
     * @since 1.10
     */
    lah("Lahnda"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Lamba_language">Lamba</a>
     *
     * @since 1.10
     */
    lam("Lamba"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Lao_language">Lao</a>
     * ({@link LanguageCode#lo lo}).
     */
    lao("Lao")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.lo;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Latin">Latin</a>
     * ({@link LanguageCode#la la}).
     */
    lat("Latin")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.la;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Latvian_language">Latvian</a>
     * ({@link LanguageCode#lv lv}).
     */
    lav("Latvian")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.lv;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Lezghian_language">Lezghian</a>
     *
     * @since 1.10
     */
    lez("Lezghian"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Limburgish_language">Limburgish</a>
     * ({@link LanguageCode#li li}).
     */
    lim("Limburgan")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.li;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Lingala_language">Lingala</a>
     * ({@link LanguageCode#ln ln}).
     */
    lin("Lingala")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.ln;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Lithuanian_language">Lithuanian</a>
     * ({@link LanguageCode#lt lt}).
     */
    lit("Lithuanian")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.lt;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Mongo_language">Mongo</a>
     *
     * @since 1.10
     */
    lol("Mongo"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Lozi_language">Lozi</a>
     *
     * @since 1.10
     */
    loz("Lozi"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Luxembourgish_language">
     * Luxembourgish</a>
     * ({@link LanguageCode#lb lb}).
     */
    ltz("Luxembourgish")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.lb;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Luba-Lulua_language">Luba-Lulua</a>
     *
     * @since 1.10
     */
    lua("Luba-Lulua"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tshiluba_language">Luba-Katanga</a>
     * ({@link LanguageCode#lu lu}).
     */
    lub("Luba-Katanga")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.lu;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Luganda">Ganda</a>
     * ({@link LanguageCode#lg lg}).
     */
    lug("Ganda")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.lg;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Luiseno_language">Luiseno</a>
     *
     * @since 1.10
     */
    lui("Luiseno"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Lunda_language">Lunda</a>
     *
     * @since 1.10
     */
    lun("Lunda"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Luo_language_(Kenya_and_Tanzania)">Luo (Kenya and Tanzania)</a>
     *
     * @since 1.10
     */
    luo("Luo (Kenya and Tanzania)"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Lushai_language">Lushai</a>
     *
     * @since 1.10
     */
    lus("Lushai"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Macedonian_language">Macedonian</a>
     * ({@link LanguageCode#mk mk}) for bibliographic applications.
     *
     * @see #mkd
     */
    mac("Macedonian")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.mk;
        }


        @Override
        public Usage getUsage()
        {
            return Usage.BIBLIOGRAPHY;
        }


        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return mkd;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Madurese_language">Madurese</a>
     *
     * @since 1.10
     */
    mad("Madurese"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Magahi_language">Magahi</a>
     *
     * @since 1.10
     */
    mag("Magahi"),

    /**
     * <a
     * href="http://en.wikipedia.org/wiki/Marshallese_language">Marshallese</a>
     * ({@link LanguageCode#mh mh}).
     */
    mah("Marshallese")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.mh;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Maithili_language">Maithili</a>
     *
     * @since 1.10
     */
    mai("Maithili"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Makasar_language">Makasar</a>
     *
     * @since 1.10
     */
    mak("Makasar"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Malayalam_language">Malayalam</a>
     * ({@link LanguageCode#ml ml}).
     */
    mal("Malayalam")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.ml;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Manding_languages">Mandingo</a>
     *
     * @since 1.10
     */
    man("Mandingo"),

    /**
     * <a href="http://en.wikipedia.org/wiki/M%C4%81ori_language">M&#257;ori</a>
     * ({@link LanguageCode#mi mi}) for bibliographic applications.
     *
     * @see #mri
     */
    mao("M\u0101ori")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.mi;
        }


        @Override
        public Usage getUsage()
        {
            return Usage.BIBLIOGRAPHY;
        }


        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return mri;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Austronesian_languages">Austronesian languages</a>
     *
     * @since 1.10
     */
    map("Austronesian languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Marathi_language">Marathi</a>
     * ({@link LanguageCode#mr mr}).
     */
    mar("Marathi")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.mr;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Masai_language">Masai</a>
     *
     * @since 1.10
     */
    mas("Masai"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Malay_language">Malay</a> (macrolanguage)
     * ({@link LanguageCode#ms ms}) for bibliographic applications.
     *
     * @see #msa
     */
    may("Malay")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.ms;
        }


        @Override
        public Usage getUsage()
        {
            return Usage.BIBLIOGRAPHY;
        }


        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return msa;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Moksha_language">Moksha</a>
     *
     * @since 1.10
     */
    mdf("Moksha"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Mandar_language">Mandar</a>
     *
     * @since 1.10
     */
    mdr("Mandar"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Mende_language_(Sierra_Leone)"
     * >Mende (Sierra Leone)</a>
     *
     * @since 1.10
     */
    men("Mende (Sierra Leone)"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Middle_Irish_language">Middle Irish</a> (900-1200)
     *
     * @since 1.10
     */
    mga("Middle Irish"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Mi%27kmaq_language">Mi'kmaq</a>
     *
     * @since 1.10
     */
    mic("Mi'kmaq"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Minangkabau_language">Minangkabau</a>
     *
     * @since 1.10
     */
    min("Minangkabau"),

    /**
     * Uncoded languages.
     *
     * @since 1.10
     */
    mis("Uncoded languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Macedonian_language">Macedonian</a>
     * ({@link LanguageCode#mk mk}) for terminology applications.
     *
     * @see #mac
     */
    mkd("Macedonian")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.mk;
        }


        @Override
        public Usage getUsage()
        {
            return Usage.TERMINOLOGY;
        }


        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return mac;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Mon-Khmer_languages">Mon-Khmer languages</a>
     *
     * @since 1.10
     */
    mkh("Mon-Khmer languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Malagasy_language">Malagasy</a>
     * ({@link LanguageCode#mg mg}).
     */
    mlg("Malagasy")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.mg;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Maltese_language">Maltese</a>
     * ({@link LanguageCode#mt mt}).
     */
    mlt("Maltese")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.mt;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Manchu_language">Manchu</a>
     *
     * @since 1.10
     */
    mnc("Manchu"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Manipuri_language">Manipuri</a>
     *
     * @since 1.10
     */
    mni("Manipuri"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Manobo_languages">Manobo languages</a>
     *
     * @since 1.10
     */
    mno("Manobo languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Mohawk_language">Mohawk</a>
     *
     * @since 1.10
     */
    moh("Mohawk"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Mongolian_language">Mongolian</a>
     * ({@link LanguageCode#mn mn}).
     */
    mon("Mongolian")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.mn;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Mossi_language">Mossi</a>
     *
     * @since 1.10
     */
    mos("Mossi"),

    /**
     * <a href="http://en.wikipedia.org/wiki/M%C4%81ori_language">M&#257;ori</a>
     * ({@link LanguageCode#mi mi}) for terminology applications.
     *
     * @see #mao
     */
    mri("M\u0101ori")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.mi;
        }


        @Override
        public Usage getUsage()
        {
            return Usage.TERMINOLOGY;
        }


        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return mao;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Malay_language">Malay</a>
     * ({@link LanguageCode#ms ms}) for terminology applications.
     *
     * @see #may
     */
    msa("Malay")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.ms;
        }


        @Override
        public Usage getUsage()
        {
            return Usage.TERMINOLOGY;
        }


        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return may;
        }
    },

    /**
     * Multiple languages.
     *
     * @since 1.10
     */
    mul("Multiple languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Munda_languages">Munda languages</a>
     *
     * @since 1.10
     */
    mun("Munda languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Creek_language">Creek</a>
     *
     * @since 1.10
     */
    mus("Creek"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Mirandese_language">Mirandese</a>
     *
     * @since 1.10
     */
    mwl("Mirandese"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Marwari_language">Marwari</a>
     *
     * @since 1.10
     */
    mwr("Marwari"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Burmese_language">Burmese</a>
     * ({@link LanguageCode#my my}) for terminology applications.
     *
     * @see #bur
     */
    mya("Burmese")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.my;
        }


        @Override
        public Usage getUsage()
        {
            return Usage.TERMINOLOGY;
        }


        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return bur;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Mayan_languages">Mayan languages</a>
     *
     * @since 1.10
     */
    myn("Mayan languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Erzya_language">Erzya</a>
     *
     * @since 1.10
     */
    myv("Erzya"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Nahuatl_languages">Nahuatl languages</a>
     *
     * @since 1.10
     */
    nah("Nahuatl languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/North_American_Indian_languages"
     * >North American Indian</a>
     *
     * @since 1.10
     */
    nai("North American Indian"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Neapolitan_language">Neapolitan</a>
     *
     * @since 1.10
     */
    nap("Neapolitan"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Nauruan_language">Nauru</a>
     * ({@link LanguageCode#na na}).
     */
    nau("Nauru")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.na;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Navajo_language">Navajo</a>
     * ({@link LanguageCode#nv nv}).
     */
    nav("Navajo")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.nv;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Southern_Ndebele_language">Southern
     * Ndebele</a>
     * ({@link LanguageCode#nr nr}).
     */
    nbl("South Ndebele")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.nr;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Northern_Ndebele_language">Northern
     * Ndebele</a>
     * ({@link LanguageCode#nd nd}).
     */
    nde("North Ndebele")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.nd;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Ndonga">Ndonga</a>
     * ({@link LanguageCode#ng ng}).
     */
    ndo("Ndonga")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.ng;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Low_German_language">Low German</a>
     *
     * @since 1.10
     */
    nds("Low German"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Nepali_language">Nepali</a> (macrolanguage)
     * ({@link LanguageCode#ne ne}).
     */
    nep("Nepali")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.ne;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Newari_language">Newari</a>
     *
     * <p>
     * Because {@code new} is a special word for Java programming
     * language, {@code new} cannot be used as an enum entry.
     * So, the first letter of this entry is a capital letter.
     * </p>
     *
     * <p>
     * {@code toString()} method of this instance ({@code New})
     * returns {@code "new"}.
     * </p>
     *
     * @since 1.10
     */
    New("Newari")
    {
        @Override
        public String toString()
        {
            return "new";
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Trans-New_Guinea_languages">Trans-New Guinea languages</a>
     *
     * @since 1.10
     */
    ngf("Trans-New Guinea languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Nias_language">Nias</a>
     *
     * @since 1.10
     */
    nia("Nias"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Niger-Kordofanian_languages"
     * >Niger-Kordofanian languages</a>
     *
     * @since 1.10
     */
    nic("Niger-Kordofanian languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Niuean_language">Niuean</a>
     *
     * @since 1.10
     */
    niu("Niuean"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Dutch_language">Dutch</a>
     * ({@link LanguageCode#nl nl}) for terminology applications.
     *
     * @see #dut
     */
    nld("Dutch")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.nl;
        }


        @Override
        public Usage getUsage()
        {
            return Usage.TERMINOLOGY;
        }


        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return dut;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Nynorsk">Norwegian Nynorsk</a>
     * ({@link LanguageCode#nn nn}).
     */
    nno("Norwegian Nynorsk")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.nn;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Bokm%C3%A5l">Norwegian
     * Bokm&aring;l</a>
     * ({@link LanguageCode#nb nb}).
     */
    nob("Norwegian Bokm\u00E5l")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.nb;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Nogai_language">Nogai</a>
     *
     * @since 1.10
     */
    nog("Nogai"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Old_Norse_language">Old Norse</a>
     *
     * @since 1.10
     */
    non("Old Norse"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Norwegian_language">Norwegian</a>
     * ({@link LanguageCode#no no}).
     */
    nor("Norwegian")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.no;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/N%27Ko_language">N'Ko</a>
     *
     * @since 1.10
     */
    nqo("N'Ko"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Pedi_language">Pedi</a>
     *
     * @since 1.10
     */
    nso("Pedi"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Nubian_languages">Nubian languages</a>
     *
     * @since 1.10
     */
    nub("Nubian languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Classical_Newari_language">Classical Newari</a>
     *
     * @since 1.10
     */
    nwc("Classical Newari"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Chichewa_language">Chichewa</a>
     * ({@link LanguageCode#ny ny}).
     */
    nya("Nyanja")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.ny;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Nyamwezi_language">Nyamwezi</a>
     *
     * @since 1.10
     */
    nym("Nyamwezi"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Nyankole_language">Nyankole</a>
     *
     * @since 1.10
     */
    nyn("Nyankole"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Nyoro_language">Nyoro</a>
     *
     * @since 1.10
     */
    nyo("Nyoro"),

    /**
     * <a href="Nzima">Nzima</a>
     *
     * @since 1.10
     */
    nzi("Nzima"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Occitan_language"
     * >Occitan</a> (post 1500)
     * ({@link LanguageCode#oc oc}).
     */
    oci("Occitan")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.oc;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Ojibwe_language">Ojibwe</a>
     * ({@link LanguageCode#oj oj}).
     */
    oji("Ojibwa")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.oj;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Oto-Manguean_languages">Oto-Manguean languages</a>
     *
     * @since 1.10
     */
    omq("Oto-Manguean languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Omotic_languages">Omotic languages</a>
     *
     * @since 1.10
     */
    omv("Omotic languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Oriya_language"
     * >Oriya</a> (macrolanguage)
     * ({@link LanguageCode#or or}).
     */
    ori("Oriya")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.or;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Oromo_language">Oromo</a>
     * ({@link LanguageCode#om om}).
     */
    orm("Oromo")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.om;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Osage_language">Osage</a>
     *
     * @since 1.10
     */
    osa("Osage"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Ossetic_language">Ossetian</a>
     * ({@link LanguageCode#os os}).
     */
    oss("Ossetian")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.os;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Ottoman_Turkish_language"
     * >Ottoman Turkish</a> (1500-1928)
     *
     * @since 1.10
     */
    ota("Ottoman Turkish"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Otomian_languages">Otomian languages</a>
     *
     * @since 1.10
     */
    oto("Otomian languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Papuan_languages">Papuan languages</a>
     *
     * @since 1.10
     */
    paa("Papuan languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Pangasinan_language">Pangasinan</a>
     *
     * @since 1.10
     */
    pag("Pangasinan"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Pahlavi_language">Pahlavi</a>
     *
     * @since 1.10
     */
    pal("Pahlavi"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Pampanga_language">Pampanga</a>
     *
     * @since 1.10
     */
    pam("Pampanga"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Punjabi_language">Punjabi</a>
     * ({@link LanguageCode#pa pa}).
     */
    pan("Panjabi")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.pa;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Papiamento_language">Papiamento</a>
     *
     * @since 1.10
     */
    pap("Papiamento"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Palauan_language">Palauan</a>
     *
     * @since 1.10
     */
    pau("Palauan"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Old_Persian_language"
     * >Old Persian</a> (ca. 600-400 B.C.)
     */
    peo("Old Persian"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Persian_language">Persian</a>
     * ({@link LanguageCode#fa fa}) for bibliographic applications.
     *
     * @see #fas
     */
    per("Persian")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.fa;
        }


        @Override
        public Usage getUsage()
        {
            return Usage.BIBLIOGRAPHY;
        }


        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return fas;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Philippine_languages">Philippine languages</a>
     *
     * @since 1.10
     */
    phi("Philippine languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Phoenician_language">Phoenician</a>
     *
     * @since 1.10
     */
    phn("Phoenician"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Central_Malayo-Polynesian_languages">Central Malayo-Polynesian languages</a>
     *
     * @since 1.10
     */
    plf("Central Malayo-Polynesian languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/P%C4%81li_language">P&#257;li</a>
     * ({@link LanguageCode#pi pi}).
     */
    pli("P\u0101li")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.pi;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Polish_language">Polish</a>
     * ({@link LanguageCode#pl pl}).
     */
    pol("Polish")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.pl;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Pohnpeian_language">Pohnpeian</a>
     *
     * @since 1.10
     */
    pon("Pohnpeian"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Portuguese_language">Portuguese</a>
     * ({@link LanguageCode#pt pt}).
     */
    por("Portuguese")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.pt;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Malayo-Polynesian_languages">Malayo-Polynesian languages</a>
     *
     * @since 1.10
     */
    poz("Malayo-Polynesian languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Eastern_Malayo-Polynesian_languages">Eastern Malayo-Polynesian languages</a>
     *
     * @since 1.10
     */
    pqe("Eastern Malayo-Polynesian languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Western_Malayo-Polynesian_languages">Western Malayo-Polynesian languages</a>
     *
     * @since 1.10
     */
    pqw("Western Malayo-Polynesian languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Prakrit_languages">Prakrit languages</a>
     *
     * @since 1.10
     */
    pra("Prakrit languages"),

    /**
     * <a href="">Old Proven&ccedil;al</a> (to 1500)
     *
     * @since 1.10
     */
    pro("Old Proven\u00E7al"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Pashto_language">Pashto</a>
     * ({@link LanguageCode#ps ps}).
     */
    pus("Pushto")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.ps;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Quechua_language">Quechua</a>
     * ({@link LanguageCode#qu qu}).
     */
    que("Quechua")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.qu;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Quechuan_language">Quechuan</a> (family)
     *
     * @since 1.10
     */
    qwe("Quechuan (family)"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Rajasthani_language">Rajasthani</a>
     *
     * @since 1.10
     */
    raj("Rajasthani"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Rapanui_language">Rapanui</a>
     *
     * @since 1.10
     */
    rap("Rapanui"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Rarotongan_language">Rarotongan</a>
     *
     * @since 1.10
     */
    rar("Rarotongan"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Romance_languages">Romance languages</a>
     *
     * @since 1.10
     */
    roa("Romance languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Romansh_language">Romansh</a>
     * ({@link LanguageCode#rm rm})
     */
    roh("Romansh")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.rm;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Romany_language">Romany</a>
     *
     * @since 1.10
     */
    rom("Romany"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Romanian_language">Romanian</a>
     * ({@link LanguageCode#ro ro}) for terminology applications.
     *
     * @see #rum
     */
    ron("Romanian")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.ro;
        }


        @Override
        public Usage getUsage()
        {
            return Usage.TERMINOLOGY;
        }


        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return rum;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Romanian_language">Romanian</a>
     * ({@link LanguageCode#ro ro}) for bibliographic applications.
     *
     * @see #ron
     */
    rum("Romansh")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.ro;
        }


        @Override
        public Usage getUsage()
        {
            return Usage.BIBLIOGRAPHY;
        }


        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return ron;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Kirundi">Kirundi</a>
     * ({@link LanguageCode#rn rn}).
     */
    run("Kirundi")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.rn;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Macedo-Romanian_language">Macedo-Romanian</a>
     *
     * @since 1.10
     */
    rup("Macedo-Romanian"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Russian_language">Russian</a>
     * ({@link LanguageCode#ru ru}).
     */
    rus("Russian")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.ru;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Sango_language">Sango</a>
     *
     * @since 1.10
     */
    sad("Sango"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Sango_language">Sango</a>
     * ({@link LanguageCode#sg sg}).
     */
    sag("Sango")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.sg;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Yakut_language">Yakut</a>
     *
     * @since 1.10
     */
    sah("Yakut"),

    /**
     * <a href="http://en.wikipedia.org/wiki/South_American_Indian_languages">South American Indian languages</a>
     *
     * @since 1.10
     */
    sai("South American Indian languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Salishan_languages">Salishan languages</a>
     *
     * @since 1.10
     */
    sal("Salishan languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Samaritan_Aramaic_language">Samaritan Aramaic</a>
     *
     * @since 1.10
     */
    sam("Samaritan Aramaic"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Sanskrit">Sanskrit</a>
     * ({@link LanguageCode#sa sa}).
     */
    san("Sanskrit")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.sa;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Sasak_language">Sasak</a>
     *
     * @since 1.10
     */
    sas("Sasak"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Santali_language">Santali</a>
     *
     * @since 1.10
     */
    sat("Santali"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Sicilian_language">Sicilian</a>
     *
     * @since 1.10
     */
    scn("Sicilian"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Scots_language">Scots</a>
     *
     * @since 1.10
     */
    sco("Scots"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Eastern_Sudanic_languages">Eastern Sudanic languages</a>
     *
     * @since 1.10
     */
    sdv("Eastern Sudanic languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Selkup_language">Selkup</a>
     *
     * @since 1.10
     */
    sel("Selkup"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Semitic_languages">Semitic languages</a>
     *
     * @since 1.10
     */
    sem("Semitic languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Old_Irish_language"
     * >Old Irish</a> (to 900)
     *
     * @since 1.10
     */
    sga("Old Irish"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Sign_languages">Sign languages</a>
     *
     * @since 1.10
     */
    sgn("Sign languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Shan_language">Shan</a>
     *
     * @since 1.10
     */
    shn("Shan"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Sidamo_language">Sidamo</a>
     *
     * @since 1.10
     */
    sid("Sidamo"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Sinhala_language">Sinhala</a>
     * ({@link LanguageCode#si si}).
     */
    sin("Sinhala")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.si;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Siouan_languages">Siouan languages</a>
     *
     * @since 1.10
     */
    sio("Siouan languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Sino-Tibetan_languages">Sino-Tibetan languages</a>
     *
     * @since 1.10
     */
    sit("Sino-Tibetan languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Slavic_languages">Slavic languages</a>
     *
     * @since 1.10
     */
    sla("Slavic languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Slovak_language">Slovak</a>
     * ({@link LanguageCode#sk sk}) for terminology aplications.
     *
     * @see #slo
     */
    slk("Slovak")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.sk;
        }


        @Override
        public Usage getUsage()
        {
            return Usage.TERMINOLOGY;
        }


        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return slo;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Slovak_language">Slovak</a>
     * ({@link LanguageCode#sk sk}) for bibliographic aplications.
     *
     * @see #slk
     */
    slo("Slovak")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.sk;
        }


        @Override
        public Usage getUsage()
        {
            return Usage.BIBLIOGRAPHY;
        }


        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return slk;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Slovene_language">Slovene</a>
     * ({@link LanguageCode#sl sl}).
     */
    slv("Slovene")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.sl;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Southern_Sami_language">Southern Sami</a>
     *
     * @since 1.10
     */
    sma("Southern Sami"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Northern_Sami">Northern Sami</a>
     * ({@link LanguageCode#se se}).
     */
    sme("Northern Sami")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.se;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Sami_languages">Sami languages</a>
     *
     * @since 1.10
     */
    smi("Sami languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Lule_Sami_language">Lule Sami</a>
     *
     * @since 1.10
     */
    smj("Lule Sami"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Inari_Sami_language">Inari Sami</a>
     *
     * @since 1.10
     */
    smn("Inari Sami"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Samoan_language">Samoan</a>
     * ({@link LanguageCode#sm sm}).
     */
    smo("Samoan")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.sm;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Skolt_Sami_language">Skolt Sami</a>
     *
     * @since 1.10
     */
    sms("Skolt Sami"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Shona_language">Shona</a>
     * ({@link LanguageCode#sn sn}).
     */
    sna("Shona")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.sn;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Sindhi_language">Sindhi</a>
     * ({@link LanguageCode#sd sd}).
     */
    snd("Sindhi")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.sd;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Soninke_language">Soninke</a>
     *
     * @since 1.10
     */
    snk("Soninke"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Sogdian_language">Sogdian</a>
     *
     * @since 1.10
     */
    sog("Sogdian"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Somali_language">Somali</a>
     * ({@link LanguageCode#so so}).
     */
    som("Somali")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.so;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Songhai_languages">Songhai languages</a>
     *
     * @since 1.10
     */
    son("Songhai languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Sotho_language">Southern Sotho</a>
     * ({@link LanguageCode#st st}).
     */
    sot("Southern Sotho")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.st;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Spanish_language">Spanish</a>
     * ({@link LanguageCode#es es}).
     */
    spa("Spanish")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.es;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Albanian_language">Albanian</a>
     * ({@link LanguageCode#sq sq}) for terminology applications.
     *
     * @see #alb
     */
    sqi("Albanian")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.sq;
        }


        @Override
        public Usage getUsage()
        {
            return Usage.TERMINOLOGY;
        }


        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return alb;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Albanian_languages">Albanian languages</a>
     *
     * @since 1.10
     */
    sqj("Albanian languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Sardinian_language">Sardinian</a>
     * ({@link LanguageCode#sc sc}).
     */
    srd("Sardinian")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.sc;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Sranan_Tongo_language">Sranan Tongo</a>
     *
     * @since 1.10
     */
    srn("Sranan Tongo"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Serbian_language">Serbian</a>
     * ({@link LanguageCode#sr sr}).
     */
    srp("Serbian")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.sr;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Serer_language">Serer</a>
     *
     * @since 1.10
     */
    srr("Serer"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Nilo-Saharan_languages">Nilo-Saharan languages</a>
     *
     * @since 1.10
     */
    ssa("Nilo-Saharan languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Swati_language">Swati</a>
     * ({@link LanguageCode#ss ss}).
     */
    ssw("Swati")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.ss;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Sukuma_language">Sukuma</a>
     *
     * @since 1.10
     */
    suk("Sukuma"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Sundanese_language">Sundanese</a>
     * ({@link LanguageCode#su su}).
     */
    sun("Sundanese")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.su;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Susu_language">Susu</a>
     *
     * @since 1.10
     */
    sus("Susu"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Sumerian_language">Sumerian</a>
     *
     * @since 1.10
     */
    sux("Sumerian"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Swahili_language"
     * >Swahili</a> (macrolanguage)
     * ({@link LanguageCode#sw sw}).
     */
    swa("Swahili")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.sw;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Swedish_language">Swedish</a>
     * ({@link LanguageCode#sv sv}).
     */
    swe("Swedish")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.sv;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Classical_Syriac_language">Classical Syriac</a>
     *
     * @since 1.10
     */
    syc("Classical Syriac"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Samoyedic_languages">Samoyedic languages</a>
     *
     * @since 1.10
     */
    syd("Samoyedic languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Syriac_language">Syriac</a>
     *
     * @since 1.10
     */
    syr("Syriac"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tahitian_language">Tahitian</a>
     * ({@link LanguageCode#ty ty}).
     */
    tah("Tahitian")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.ty;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Tai_languages">Tai languages</a>
     *
     * @since 1.10
     */
    tai("Tai languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tamil_language">Tamil</a>
     * ({@link LanguageCode#ta ta}).
     */
    tam("Tamil")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.ta;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Tatar_language">Tatar</a>
     * ({@link LanguageCode#tt tt}).
     */
    tat("Tatar")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.tt;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Tibeto-Burman_languages">Tibeto-Burman languages</a>
     *
     * @since 1.10
     */
    tbq("Tibeto-Burman languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Telugu_language">Telugu</a>
     * ({@link LanguageCode#te te}).
     */
    tel("Telugu")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.te;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Timne_language">Timne</a>
     *
     * @since 1.10
     */
    tem("Timne"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tereno_language">Tereno</a>
     *
     * @since 1.10
     */
    ter("Tereno"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tetum_language">Tetum</a>
     *
     * @since 1.10
     */
    tet("Tetum"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tajik_language">Tajik</a>
     * ({@link LanguageCode#tg tg}).
     */
    tgk("Tajik")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.tg;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Tagalog_language">Tagalog</a>
     * ({@link LanguageCode#tl tl}).
     */
    tgl("Tagalog")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.tl;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Thai_language">Thai</a>
     * ({@link LanguageCode#th th}).
     */
    tha("Thai")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.th;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Standard_Tibetan">Tibetan</a>
     * ({@link LanguageCode#bo bo}) for terminology applications.
     *
     * @see #bod
     */
    tib("Tibetan")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.bo;
        }


        @Override
        public Usage getUsage()
        {
            return Usage.BIBLIOGRAPHY;
        }


        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return bod;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Tigre_language">Tigre</a>
     *
     * @since 1.10
     */
    tig("Tigre"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tigrinya_language">Tigrinya</a>
     * ({@link LanguageCode#ti ti}).
     */
    tir("Tigrinya")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.ti;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Tiv_language">Tiv</a>
     *
     * @since 1.10
     */
    tiv("Tiv"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tokelau_language">Tokelau</a>
     *
     * @since 1.10
     */
    tkl("Tokelau"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Klingon_language">Klingon</a>
     *
     * @since 1.10
     */
    tlh("Klingon"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tlingit_language">Tlingit</a>
     *
     * @since 1.10
     */
    tli("Tlingit"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tamashek_language">Tamashek</a>
     *
     * @since 1.10
     */
    tmh("Tamashek"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tonga_language_(Nyasa)">Tonga (Nyasa)</a>
     *
     * @since 1.10
     */
    tog("Tonga (Nyasa)"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tonga_language_(Tonga_Islands)">Tonga (Tonga Islands)</a>
     * ({@link LanguageCode#to to}).
     */
    ton("Tonga (Tonga Islands)")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.to;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Tok_Pisin_language">Tok Pisin</a>
     *
     * @since 1.10
     */
    tpi("Tok Pisin"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Turkic_languages">Turkic languages</a>
     *
     * @since 1.10
     */
    trk("Turkic languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tsimshian_language">Tsimshian</a>
     *
     * @since 1.10
     */
    tsi("Tsimshian"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tswana_language">Tswana</a>
     * ({@link LanguageCode#tn tn}).
     */
    tsn("Tswana")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.tn;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Tsonga_language">Tsonga</a>
     * ({@link LanguageCode#ts ts}).
     */
    tso("Tsonga")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.ts;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Turkmen_language">Turkmen</a>
     * ({@link LanguageCode#tk tk}).
     */
    tuk("Turkmen")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.tk;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Tumbuka_language">Tumbuka</a>
     *
     * @since 1.10
     */
    tum("Tumbuka"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tupi_languages">Tupi languages</a>
     *
     * @since 1.10
     */
    tup("Tupi languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Turkish_language">Turkish</a>
     * ({@link LanguageCode#tr tr}).
     */
    tur("Turkish")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.tr;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Altaic_languages">Altaic languages</a>
     *
     * @since 1.10
     */
    tut("Altaic languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tungus_languages">Tungus languages</a>
     *
     * @since 1.10
     */
    tuw("Tungus languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tuvalu_language">Tuvalu</a>
     *
     * @since 1.10
     */
    tvl("Tuvalu"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Twi">Twi</a>
     * ({@link LanguageCode#tw tw}).
     */
    twi("Twi")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.tw;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Tuvinian_language">Tuvinian</a>
     *
     * @since 1.10
     */
    tyv("Tuvinian"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Udmurt_language">Udmurt</a>
     *
     * @since 1.10
     */
    udm("Udmurt"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Ugaritic_language">Ugaritic</a>
     *
     * @since 1.10
     */
    uga("Ugaritic"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Uyghur_language">Uighur</a>
     * ({@link LanguageCode#ug ug}).
     */
    uig("Uighur")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.ug;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Ukrainian_language">Ukrainian</a>
     * ({@link LanguageCode#uk uk}).
     */
    ukr("Ukrainian")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.uk;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Umbundu_language">Umbundu</a>
     *
     * @since 1.10
     */
    umb("Umbundu"),

    /**
     * Undetermined.
     *
     * @since 1.10
     */
    und("Undetermined"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Urdu">Urdu</a>
     * ({@link LanguageCode#ur ur}).
     */
    urd("Urdu")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.ur;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Uralic_languages">Uralic languages</a>
     *
     * @since 1.10
     */
    urj("Uralic languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Uzbek_language">Uzbek</a>
     * ({@link LanguageCode#uz uz}).
     */
    uzb("Uzbek")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.uz;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Vai_language">Vai</a>
     *
     * @since 1.10
     */
    vai("Vai"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Venda_language">Venda</a>
     * ({@link LanguageCode#ve ve}).
     */
    ven("Venda")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.ve;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Vietnamese_language">Vietnamese</a>
     * ({@link LanguageCode#vi vi}).
     */
    vie("Vietnamese")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.vi;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Volap%C3%BCk">Volap&uuml;k</a>
     * ({@link LanguageCode#vo vo}).
     */
    vol("Volap\u00FCk")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.vo;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Votic_language">Votic</a>
     *
     * @since 1.10
     */
    vot("Votic"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Wakashan_languages">Wakashan languages</a>
     *
     * @since 1.10
     */
    wak("Wakashan languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Wolaytta_language">Wolaytta</a>
     *
     * @since 1.10
     */
    wal("Wolaytta"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Waray_language_(Philippines)">Waray (Philippines)</a>
     *
     * @since 1.10
     */
    war("Waray (Philippines)"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Washo_language">Washo</a>
     *
     * @since 1.10
     */
    was("Washo"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Welsh_language">Welsh</a>
     * ({@link LanguageCode#cy cy}) for bibliographic applications.
     *
     * @see #cym
     */
    wel("Welsh")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.cy;
        }


        @Override
        public Usage getUsage()
        {
            return Usage.BIBLIOGRAPHY;
        }


        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return cym;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Sorbian_languages">Sorbian languages</a>
     *
     * @since 1.10
     */
    wen("Sorbian languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Walloon_language">Walloon</a>
     * ({@link LanguageCode#wa wa}).
     */
    wln("Walloon")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.wa;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Wolof_language">Wolof</a>
     * ({@link LanguageCode#wo wo}).
     */
    wol("Wolof")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.wo;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Kalmyk_language">Kalmyk</a>
     *
     * @since 1.10
     */
    xal("Kalmyk"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Mongolian_languages">Mongolian languages</a>
     *
     * @since 1.10
     */
    xgn("Mongolian languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Xhosa_language">Xhosa</a>
     * ({@link LanguageCode#xh xh}).
     */
    xho("Xhosa")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.xh;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Na-Dene_languages">Na-Dene languages</a>
     *
     * @since 1.10
     */
    xnd("Na-Dene languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Yao_language">Yao</a>
     *
     * @since 1.10
     */
    yao("Yao"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Yapese_language">Yapese</a>
     *
     * @since 1.10
     */
    yap("Yapese"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Yiddish_language">Yiddish</a>
     * ({@link LanguageCode#yi yi}).
     */
    yid("Yiddish")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.yi;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Yoruba_language">Yoruba</a>
     * ({@link LanguageCode#yo yo}).
     */
    yor("Yoruba")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.yo;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Yupik_languages">Yupik languages</a>
     *
     * @since 1.10
     */
    ypk("Yupik languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Zapotec_language">Zapotec</a>
     *
     * @since 1.10
     */
    zap("Zapotec"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Blissymbols_language">Blissymbols</a>
     *
     * @since 1.10
     */
    zbl("Blissymbols"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Zenaga_language">Zenaga</a>
     *
     * @since 1.10
     */
    zen("Zenaga"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Zhuang_languages">Zhuang</a>
     * ({@link LanguageCode#za za}).
     */
    zha("Zhuang")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.za;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Chinese_language">Chinese</a>
     * ({@link LanguageCode#zh zh}) for terminology applications.
     *
     * @see #chi
     */
    zho("Chinese")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.zh;
        }


        @Override
        public Usage getUsage()
        {
            return Usage.TERMINOLOGY;
        }


        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return chi;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Chinese_language">Chinese</a> (family)
     *
     * @since 1.10
     */
    zhx("Chinese (family)"),

    /**
     * <a href="http://en.wikipedia.org/wiki/East_Slavic_languages">East Slavic languages</a>
     *
     * @since 1.10
     */
    zle("East Slavic languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/South_Slavic_languages">South Slavic languages</a>
     *
     * @since 1.10
     */
    zls("South Slavic languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/West_Slavic_languages">West Slavic languages</a>
     *
     * @since 1.10
     */
    zlw("West Slavic languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Zande_languages">Zande languages</a>
     *
     * @since 1.10
     */
    znd("Zande languages"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Zulu_language">Zulu</a>
     * ({@link LanguageCode#zu zu}).
     */
    zul("Zulu")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.zu;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Zuni_language">Zuni</a>
     *
     * @since 1.10
     */
    zun("Zuni"),

    /**
     * No linguistic content.
     *
     * @since 1.10
     */
    zxx("No linguistic content"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Zaza_language">Zaza</a>
     *
     * @since 1.10
     */
    zza("Zaza")
    ;


    /**
     * The usage of this language code.
     *
     * @since 1.1
     */
    public enum Usage
    {
        /**
         * Code for terminology applications (ISO 639-2/T).
         */
        TERMINOLOGY,

        /**
         * Code for bibliographic applications (ISO 639-2/B).
         */
        BIBLIOGRAPHY,

        /**
         * For all applications including both terminology and
         * bibliographic applications.
         */
        COMMON
    };


    /**
     * Language name.
     */
    private final String name;


    private LanguageAlpha3Code(String name)
    {
        this.name = name;
    }


    /**
     * Get the language name.
     *
     * @return
     *         The language name.
     */
    public String getName()
    {
        return name;
    }


    /**
     * Get <a href="http://en.wikipedia.org/wiki/ISO_639-1">ISO 639-1</a>
     * language code.
     *
     * @return
     *         <a href="http://en.wikipedia.org/wiki/ISO_639-1">ISO 639-1</a>
     *         language code. This method may return {@code null}.
     */
    public LanguageCode getAlpha2()
    {
        return null;
    }


    /**
     * Get the usage of this language code.
     *
     * <p>
     * Most language codes return {@link Usage#COMMON Usage.COMMON}.
     * </p>
     *
     * @return
     *         The usage of this language code.
     */
    public Usage getUsage()
    {
        return Usage.COMMON;
    }


    /**
     * Get the synonym of this code.
     *
     * <p>
     * In most cases, this method simply returns <code>this</code> object. On
     * the other hand, language codes that have two alpha-3 codes, namely, ISO
     * 639-2/T code ("terminological" code) and ISO 639-2/B code
     * ("bibliographic" code), return their counterparts. For example,
     * {@link #deu LanguageAlpha3Code.deu}{@code .getSynonym()} returns
     * {@link #ger LanguageAlpha3Code.ger}.
     * </p>
     *
     * @return
     *         <a href="http://en.wikipedia.org/wiki/ISO_639-2">ISO 639-2</a>
     *         language code.
     */
    public LanguageAlpha3Code getSynonym()
    {
        return this;
    }


    /**
     * Get the bibliographic code of this language.
     *
     * <p>
     * Most languages have just one <a
     * href="http://en.wikipedia.org/wiki/ISO_639-2">ISO 639-2</a> code and they
     * simply return <code>this</code> object. Only ISO 639-2/T codes
     * ("terminological" codes) return counterpart objects. For example,
     * {@link LanguageAlpha3Code#fra LanguageAlpha3Code.fra}{@code .getAlpha3B()}
     * returns {@link LanguageAlpha3Code#fre LanguageAlpha3Code.fre}.
     * </p>
     *
     * @return
     *         The bibliographic code of this language.
     */
    public LanguageAlpha3Code getAlpha3B()
    {
        if (getUsage() == Usage.BIBLIOGRAPHY)
        {
            return this;
        }
        else
        {
            return getSynonym();
        }
    }


    /**
     * Get the terminological code of this language.
     *
     * <p>
     * Most languages have just one <a
     * href="http://en.wikipedia.org/wiki/ISO_639-2">ISO 639-2</a> code and they
     * simply return <code>this</code> object. Only ISO 639-2/B codes
     * ("bibliographic" codes) return counterpart objects. For example,
     * {@link LanguageAlpha3Code#fre LanguageAlpha3Code.fre}{@code .getAlpha3T()}
     * returns {@link LanguageAlpha3Code#fra LanguageAlpha3Code.fra}.
     *
     * </p>
     *
     * @return
     *         The terminological code of this language.
     */
    public LanguageAlpha3Code getAlpha3T()
    {
        if (getUsage() == Usage.TERMINOLOGY)
        {
            return this;
        }
        else
        {
            return getSynonym();
        }
    }


    /**
     * Get a {@code LanguageAlpha3Code} that corresponds to a given
     * <a href="http://en.wikipedia.org/wiki/ISO_639-1">ISO 639-1</a> code
     * (2-letter lowercase code) or
     * <a href="http://en.wikipedia.org/wiki/ISO_639-2">ISO 639-2</a> code
     * (3-letter lowercase code).
     *
     * <p>
     * This method calls {@link #getByCode(String, boolean) getByCode}{@code (code, true)}.
     * Note that the behavior has changed since the version 1.13. In the older versions,
     * this method was an alias of {@code getByCode(code, false)}.
     * </p>
     *
     * @param code
     *        An <a href="http://en.wikipedia.org/wiki/ISO_639-1">ISO 639-1</a>
     *        code (2-letter lowercase code) or an
     *        <a href="http://en.wikipedia.org/wiki/ISO_639-2">ISO 639-2</a>
     *        code (3-letter lowercase code). Or "undefined".
     *        Note that if the given code is one of legacy language codes
     *        ("iw", "ji" and "in"), it is treated as its official counterpart
     *        ("he", "yi" and "id"), respectively. For example, if "in" is
     *        given, this method returns {@link #ind LanguageAlpha3Code.ind}.
     *
     * @return
     *         A {@code LanguageAlpha3Code} instance, or {@code null} if not found.
     *         If <a href="http://en.wikipedia.org/wiki/ISO_639-1">ISO 639-1</a>
     *         code (2-letter code) is given and the language has two
     *         <a href="http://en.wikipedia.org/wiki/ISO_639-2">ISO 639-2</a>
     *         codes, ISO 639/T code ("terminological" code) is returned.
     */
    public static LanguageAlpha3Code getByCode(String code)
    {
        return getByCode(code, true);
    }


    /**
     * Get a {@code LanguageAlpha3Code} that corresponds to a given
     * <a href="http://en.wikipedia.org/wiki/ISO_639-1">ISO 639-1</a> code
     * (2-letter lowercase code) or
     * <a href="http://en.wikipedia.org/wiki/ISO_639-2">ISO 639-2</a> code
     * (3-letter lowercase code).
     *
     * <p>
     * This method calls {@link #getByCode(String, boolean) getByCode}{@code (code, false)}.
     * </p>
     *
     * @param code
     *        An <a href="http://en.wikipedia.org/wiki/ISO_639-1">ISO 639-1</a>
     *        code (2-letter lowercase code) or an
     *        <a href="http://en.wikipedia.org/wiki/ISO_639-2">ISO 639-2</a>
     *        code (3-letter lowercase code). Or "undefined" (case insensitive).
     *        Note that if the given code is one of legacy language codes
     *        ("iw", "ji" and "in"), it is treated as its official counterpart
     *        ("he", "yi" and "id"), respectively. For example, if "in" is
     *        given, this method returns {@link #ind LanguageAlpha3Code.ind}.
     *
     * @return
     *         A {@code LanguageAlpha3Code} instance, or {@code null} if not found.
     *         If <a href="http://en.wikipedia.org/wiki/ISO_639-1">ISO 639-1</a>
     *         code (2-letter code) is given and the language has two
     *         <a href="http://en.wikipedia.org/wiki/ISO_639-2">ISO 639-2</a>
     *         codes, ISO 639/T code ("terminological" code) is returned.
     *
     * @since 1.13
     */
    public static LanguageAlpha3Code getByCodeIgnoreCase(String code)
    {
        return getByCode(code, false);
    }


    /**
     * Get a {@code LanguageAlpha3Code} that corresponds to a given
     * <a href="http://en.wikipedia.org/wiki/ISO_639-1">ISO 639-1</a> code
     * (2-letter lowercase code) or
     * <a href="http://en.wikipedia.org/wiki/ISO_639-2">ISO 639-2</a> code
     * (3-letter lowercase code).
     *
     * @param code
     *         An <a href="http://en.wikipedia.org/wiki/ISO_639-1">ISO 639-1</a>
     *         code (2-letter lowercase code) or an
     *         <a href="http://en.wikipedia.org/wiki/ISO_639-2">ISO 639-2</a>
     *         code (3-letter lowercase code). Or "undefined" (its case
     *         sensitivity depends on the value of {@code caseSensitive}).
     *         Note that if the given code is one of legacy language codes
     *         ("iw", "ji" and "in"), it is treated as its official counterpart
     *         ("he", "yi" and "id"), respectively. For example, if "in" is
     *         given, this method returns {@link #ind LanguageAlpha3Code.ind}.
     *
     * @param caseSensitive
     *         If {@code true}, the given code should consist of lowercase letters only.
     *         If {@code false}, this method internally canonicalizes the given code by
     *         {@link String#toLowerCase()} and then performs search. For
     *         example, {@code getByCode("JPN", true)} returns {@code null}, but on the
     *         other hand, {@code getByCode("JPN", false)} returns {@link #jpn
     *         LanguageAlpha3Code.jpn}.
     *
     *         As an exceptional case, both {@code getByCode("New", true)} and
     *         {@code getByCode("new", true)} return {@link #New} (Newari).
     *
     * @return
     *         A {@code LanguageAlpha3Code} instance, or {@code null} if not found.
     *         If <a href="http://en.wikipedia.org/wiki/ISO_639-1">ISO 639-1</a>
     *         code (2-letter code) is given and the language has two
     *         <a href="http://en.wikipedia.org/wiki/ISO_639-2">ISO 639-2</a>
     *         codes, ISO 639/T code ("terminological" code) is returned.
     */
    public static LanguageAlpha3Code getByCode(String code, boolean caseSensitive)
    {
        code = canonicalize(code, caseSensitive);

        if (code == null)
        {
            return null;
        }

        switch (code.length())
        {
            case 2:
                break;

            case 3:
            case 9:
                return getByEnumName(code);

            default:
                return null;
        }

        code = LanguageCode.canonicalize(code, caseSensitive);
        LanguageCode alpha2 = LanguageCode.getByEnumName(code);

        if (alpha2 == null)
        {
            return null;
        }

        return alpha2.getAlpha3();
    }


    static LanguageAlpha3Code getByEnumName(String name)
    {
        try
        {
            return Enum.valueOf(LanguageAlpha3Code.class, name);
        }
        catch (IllegalArgumentException e)
        {
            return null;
        }
    }


    private static String canonicalize(String code, boolean caseSensitive)
    {
        if (code == null || code.length() == 0)
        {
            return null;
        }

        if (caseSensitive == false)
        {
            code = code.toLowerCase();
        }

        // A special case for Newari.
        if (code.equals("new")) {
            code = "New";
        }

        return code;
    }


    /**
     * Get a list of {@code LanguageAlpha3Code} by a name regular expression.
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
     *         List of {@code LanguageAlpha3Code}. If nothing has matched,
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
    public static List<LanguageAlpha3Code> findByName(String regex)
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
     * Get a list of {@code LanguageAlpha3Code} by a name pattern.
     *
     * <p>
     * For example, the list obtained by the code snippet below:
     * </p>
     *
     * <pre style="background-color: #EEEEEE; margin-left: 2em; margin-right: 2em; border: 1px solid black; padding: 0.5em;">
     * Pattern pattern = Pattern.compile(<span style="color: darkred;">"Old.*"</span>);
     * List&lt;LanguageAlpha3Code&gt; list = LanguageAlpha3Code.findByName(pattern);</pre>
     *
     * <p>
     * contains 7 {@code LanguageAlpha3Code}s as listed below.
     * </p>
     *
     * <ol>
     * <li>{@link #ang} : Old English
     * <li>{@link #fro} : Old French
     * <li>{@link #goh} : Old High German
     * <li>{@link #non} : Old Norse
     * <li>{@link #peo} : Old Persian
     * <li>{@link #pro} : Old Proven&ccedil;al
     * <li>{@link #sga} : Old Irish
     * </ol>
     *
     * @param pattern
     *         Pattern to match names.
     *
     * @return
     *         List of {@code LanguageAlpha3Code}. If nothing has matched,
     *         an empty list is returned.
     *
     * @throws IllegalArgumentException
     *         {@code pattern} is {@code null}.
     *
     * @since 1.11
     */
    public static List<LanguageAlpha3Code> findByName(Pattern pattern)
    {
        if (pattern == null)
        {
            throw new IllegalArgumentException("pattern is null.");
        }

        List<LanguageAlpha3Code> list = new ArrayList<LanguageAlpha3Code>();

        for (LanguageAlpha3Code entry : values())
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
