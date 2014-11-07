/*
 * Copyright (C) 2012-2014 Neo Visionaries Inc.
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
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;


/**
 * <a href="http://en.wikipedia.org/wiki/ISO_639-1">ISO 639-1</a>
 * language code.
 *
 * <p>
 * Enum names of this enum themselves are represented by
 * <a href="http://en.wikipedia.org/wiki/ISO_639-1">ISO 639-1</a> code
 * (2-letter lower-case alphabets).
 * </p>
 *
 * <pre style="background-color: #EEEEEE; margin-left: 2em; margin-right: 2em; border: 1px solid black; padding: 0.5em;">
 * <span style="color: darkgreen;">// List all the language codes.</span>
 * for (LanguageCode code : LanguageCode.values())
 * {
 *     <span style="color: darkgreen;">// For example, "[ar] Arabic" is printed.</span>
 *     System.out.format(<span style="color: darkred;">"[%s] %s\n"</span>, code, code.{@link #getName()});
 * }
 *
 * <span style="color: darkgreen;">// Get a LanguageCode instance by ISO 639-1 code.</span>
 * LanguageCode code = LanguageCode.{@link #getByCode(String) getByCode}(<span style="color: darkred;">"fr"</span>);
 *
 * <span style="color: darkgreen;">// Convert to a Locale instance.</span>
 * Locale locale = code.{@link #toLocale()};
 *
 * <span style="color: darkgreen;">// Get a LanguageCode by a Locale instance.</span>
 * code = LanguageCode.{@link #getByLocale(Locale) getByLocale}(locale);
 *
 * <span style="color: darkgreen;">// Get a list by a regular expression for names.
 * //
 * // The list will contain:
 * //
 * //     LanguageCode.an : Aragonese
 * //     LanguageCode.ja : Japanese
 * //     LanguageCode.jv : Javanese
 * //     LanguageCode.su : Sundanese
 * //     LanguageCode.zh : Chinese
 * //</span>
 * List&lt;LanguageCode&gt; list = LanguageCode.{@link #findByName(String) findByName}(<span style="color: darkred;">".*nese"</span>);
 * </pre>
 *
 * @author Takahiko Kawasaki
 */
public enum LanguageCode
{
    /**
     * Undefined.
     *
     * <p>
     * This is not an official ISO 639-1 code.
     * </p>
     *
     * @since 1.14
     */
    undefined()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.undefined;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Afar_language">Afar</a>
     * ({@link LanguageAlpha3Code#aar aar}).
     */
    aa()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.aar;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Abkhaz_language">Abkhaz</a>
     * ({@link LanguageAlpha3Code#abk abk}).
     */
    ab()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.abk;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Avestan_language">Avestan</a>
     * ({@link LanguageAlpha3Code#ave ave}).
     */
    ae()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.ave;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Afrikaans_language">Afrikaans</a>
     * ({@link LanguageAlpha3Code#afr afr}).
     */
    af()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.afr;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Akan_language">Akan</a>
     * ({@link LanguageAlpha3Code#aka aka}).
     */
    ak()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.aka;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Amharic_language">Amharic</a>
     * ({@link LanguageAlpha3Code#amh amh}).
     */
    am()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.amh;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Aragonese_language">Aragonese</a>
     * ({@link LanguageAlpha3Code#arg arg}).
     */
    an()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.arg;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Arabic_language">Arabic</a>
     * ({@link LanguageAlpha3Code#ara ara}).
     */
    ar()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.ara;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Assamese_language">Assamese</a>
     * ({@link LanguageAlpha3Code#asm asm}).
     */
    as()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.asm;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Avar_language">Avaric</a>
     * ({@link LanguageAlpha3Code#ava ava}).
     */
    av()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.ava;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Aymara_language">Aymara</a>
     * ({@link LanguageAlpha3Code#aym aym}).
     */
    ay()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.aym;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Azerbaijani_language">Azerbaijani</a>
     * ({@link LanguageAlpha3Code#aze aze}).
     */
    az()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.aze;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Bashkir_language">Bashkir</a>
     * ({@link LanguageAlpha3Code#bak bak}).
     */
    ba()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.bak;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Belarusian_language">Belarusian</a>
     * ({@link LanguageAlpha3Code#bel bel}).
     */
    be()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.bel;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Bulgarian_language">Bulgarian</a>
     * ({@link LanguageAlpha3Code#bul bul}).
     */
    bg()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.bul;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Bihari_languages">Bihari</a>
     * ({@link LanguageAlpha3Code#bih bih}).
     */
    bh()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.bih;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Bislama_language">Bislama</a>
     * ({@link LanguageAlpha3Code#bis bis}).
     */
    bi()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.bis;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Bambara_language">Bambara</a>
     * ({@link LanguageAlpha3Code#bam bam}).
     */
    bm()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.bam;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Bengali_language">Bengali</a>
     * ({@link LanguageAlpha3Code#ben ben}).
     */
    bn()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.ben;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Standard_Tibetan">Tibetan</a>
     * ({@link LanguageAlpha3Code#bod bod}, {@link LanguageAlpha3Code#tib tib}).
     */
    bo()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.bod;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Breton_language">Breton</a>
     * ({@link LanguageAlpha3Code#bre bre}).
     */
    br()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.bre;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Bosnian_language">Bosnian</a>
     * ({@link LanguageAlpha3Code#bos bos}).
     */
    bs()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.bos;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Catalan_language">Catalan</a>
     * ({@link LanguageAlpha3Code#cat cat}).
     */
    ca()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.cat;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Chechen_language">Chechen</a>
     * ({@link LanguageAlpha3Code#che che}).
     */
    ce()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.che;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Chamorro_language">Chamorro</a>
     * ({@link LanguageAlpha3Code#cha cha}).
     */
    ch()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.cha;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Corsican_language">Corsican</a>
     * ({@link LanguageAlpha3Code#cos cos}).
     */
    co()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.cos;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Cree_language">Cree</a>
     * ({@link LanguageAlpha3Code#cre cre}).
     */
    cr()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.cre;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Czech_language">Czech</a>
     * ({@link LanguageAlpha3Code#ces ces}, {@link LanguageAlpha3Code#cze cze}).
     */
    cs()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.ces;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Old_Church_Slavonic">Church Slavonic</a>
     * ({@link LanguageAlpha3Code#chu chu}).
     */
    cu()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.chu;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Chuvash_language">Chuvash</a>
     * ({@link LanguageAlpha3Code#chv chv}).
     */
    cv()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.chv;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Welsh_language">Welsh</a>
     * ({@link LanguageAlpha3Code#cym cym}, {@link LanguageAlpha3Code#wel wel}).
     */
    cy()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.cym;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Danish_language">Danish</a>
     * ({@link LanguageAlpha3Code#dan dan}).
     */
    da()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.dan;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/German_language">German</a>
     * ({@link LanguageAlpha3Code#deu deu}, {@link LanguageAlpha3Code#ger ger}).
     */
    de()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.deu;
        }

        @Override
        public Locale toLocale()
        {
            return Locale.GERMAN;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Dhivehi_language">Dhivehi</a>
     * ({@link LanguageAlpha3Code#div div}).
     */
    dv()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.div;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Dzongkha_language">Dzongkha</a>
     * ({@link LanguageAlpha3Code#dzo dzo}).
     */
    dz()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.dzo;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Ewe_language">Ewe</a>
     * ({@link LanguageAlpha3Code#ewe ewe}).
     */
    ee()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.ewe;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Greek_language">Greek</a>
     * ({@link LanguageAlpha3Code#ell ell}, {@link LanguageAlpha3Code#gre gre}).
     */
    el()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.ell;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/English_language">English</a>
     * ({@link LanguageAlpha3Code#eng eng}).
     */
    en()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.eng;
        }


        @Override
        public Locale toLocale()
        {
            return Locale.ENGLISH;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Esperanto">Esperanto</a>
     * ({@link LanguageAlpha3Code#epo epo}).
     */
    eo()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.epo;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Spanish_language">Spanish</a>
     * ({@link LanguageAlpha3Code#spa spa}).
     */
    es()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.spa;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Estonian_language">Estonian</a>
     * ({@link LanguageAlpha3Code#est est}).
     */
    et()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.est;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Basque_language">Basque</a>
     * ({@link LanguageAlpha3Code#eus eus}, {@link LanguageAlpha3Code#baq baq}).
     */
    eu()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.eus;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Persian_language">Persian</a>
     * ({@link LanguageAlpha3Code#fas fas}, {@link LanguageAlpha3Code#per per}).
     */
    fa()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.fas;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Fula_language">Fula</a>
     * ({@link LanguageAlpha3Code#ful ful}).
     */
    ff()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.ful;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Finnish_language">Finnish</a>
     * ({@link LanguageAlpha3Code#fin fin}).
     */
    fi()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.fin;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Fijian_language">Fijian</a>
     * ({@link LanguageAlpha3Code#fij fij}).
     */
    fj()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.fij;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Faroese_language">Faroese</a>
     * ({@link LanguageAlpha3Code#fao fao}).
     */
    fo()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.fao;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/French_language">French</a>
     * ({@link LanguageAlpha3Code#fra fra}, {@link LanguageAlpha3Code#fre fre}).
     */
    fr()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.fra;
        }

        @Override
        public Locale toLocale()
        {
            return Locale.FRENCH;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/West_Frisian_language">West Frisian</a>
     * ({@link LanguageAlpha3Code#fry fry}).
     */
    fy()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.fry;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Irish_language">Irish</a>
     * ({@link LanguageAlpha3Code#gle gle}).
     */
    ga()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.gle;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Scottish_Gaelic_language">Scottish Gaelic</a>
     * ({@link LanguageAlpha3Code#gla gla}).
     */
    gd()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.gla;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Galician_language">Galician</a>
     * ({@link LanguageAlpha3Code#glg glg}).
     */
    gl()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.glg;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Guaran%C3%AD_language">Guaran&iacute;</a>
     * ({@link LanguageAlpha3Code#grn grn}).
     */
    gn()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.grn;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Gujarati_language">Gujarati</a>
     * ({@link LanguageAlpha3Code#guj guj}).
     */
    gu()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.guj;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Manx_language">Manx</a>
     * ({@link LanguageAlpha3Code#glv glv}).
     */
    gv()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.glv;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Hausa_language">Hausa</a>
     * ({@link LanguageAlpha3Code#hau hau}).
     */
    ha()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.hau;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Hebrew_language">Hebrew</a>
     * ({@link LanguageAlpha3Code#heb heb}).
     */
    he()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.heb;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Hindi">Hindi</a>
     * ({@link LanguageAlpha3Code#hin hin}).
     */
    hi()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.hin;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Hiri_Motu_language">Hiri Motu</a>
     * ({@link LanguageAlpha3Code#hmo hmo}).
     */
    ho()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.hmo;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Croatian_language">Croatian</a>
     * ({@link LanguageAlpha3Code#hrv hrv}).
     */
    hr()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.hrv;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Haitian_Creole_language">Haitian</a>
     * ({@link LanguageAlpha3Code#hat hat}).
     */
    ht()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.hat;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Hungarian_language">Hungarian</a>
     * ({@link LanguageAlpha3Code#hun hun}).
     */
    hu()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.hun;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Armenian_language">Armenian</a>
     * ({@link LanguageAlpha3Code#hye hye}, {@link LanguageAlpha3Code#arm arm}).
     */
    hy()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.hye;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Herero_language">Herero</a>
     * ({@link LanguageAlpha3Code#her her}).
     */
    hz()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.her;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Interlingua">Interlingua</a>
     * ({@link LanguageAlpha3Code#ina ina}).
     */
    ia()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.ina;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Indonesian_language">Indonesian</a>
     * ({@link LanguageAlpha3Code#ind ind}).
     */
    id()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.ind;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Interlingue_language">Interlingue</a>
     * ({@link LanguageAlpha3Code#ile ile}).
     */
    ie()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.ile;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Igbo_language">Igbo</a>
     * ({@link LanguageAlpha3Code#ibo ibo}).
     */
    ig()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.ibo;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Nuosu_language">Nuosu</a>
     * ({@link LanguageAlpha3Code#iii iii}).
     */
    ii()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.iii;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Inupiaq_language">Inupiaq</a>
     * ({@link LanguageAlpha3Code#ipk ipk}).
     */
    ik()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.ipk;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Ido">Ido</a>
     * ({@link LanguageAlpha3Code#ido ido}).
     */
    io()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.ido;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Icelandic_language">Icelandic</a>
     * ({@link LanguageAlpha3Code#isl isl}, {@link LanguageAlpha3Code#ice ice}).
     */
    is()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.isl;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Italian_language">Italian</a>
     * ({@link LanguageAlpha3Code#ita ita}).
     */
    it()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.ita;
        }

        @Override
        public Locale toLocale()
        {
            return Locale.ITALIAN;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Inuktitut">Inuktitut</a>
     * ({@link LanguageAlpha3Code#iku iku}).
     */
    iu()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.iku;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Japanese_language">Japanese</a>
     * ({@link LanguageAlpha3Code#jpn jpn}).
     */
    ja()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.jpn;
        }

        @Override
        public Locale toLocale()
        {
            return Locale.JAPANESE;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Javanese_language">Javanese</a>
     * ({@link LanguageAlpha3Code#jav jav}).
     */
    jv()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.jav;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Georgian_language">Georgian</a>
     * ({@link LanguageAlpha3Code#kat kat}, {@link LanguageAlpha3Code#geo geo}).
     */
    ka()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.kat;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Kongo_language">Kongo</a>
     * ({@link LanguageAlpha3Code#kon kon}).
     */
    kg()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.kon;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Gikuyu_language">Kikuyu</a>
     * ({@link LanguageAlpha3Code#kik kik}).
     */
    ki()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.kik;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Kwanyama">Kwanyama</a>
     * ({@link LanguageAlpha3Code#kua kua}).
     */
    kj()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.kua;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Kazakh_language">Kazakh</a>
     * ({@link LanguageAlpha3Code#kaz kaz}).
     */
    kk()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.kaz;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Kalaallisut_language">Kalaallisut</a>
     * ({@link LanguageAlpha3Code#kal kal}).
     */
    kl()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.kal;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Khmer_language">Khmer</a>
     * ({@link LanguageAlpha3Code#khm khm}).
     */
    km()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.khm;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Kannada_language">Kannada</a>
     * ({@link LanguageAlpha3Code#kan kan}).
     */
    kn()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.kan;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Korean_language">Korean</a>
     * ({@link LanguageAlpha3Code#kor kor}).
     */
    ko()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.kor;
        }

        @Override
        public Locale toLocale()
        {
            return Locale.KOREAN;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Kanuri_language">Kanuri</a>
     * ({@link LanguageAlpha3Code#kau kau}).
     */
    kr()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.kau;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Kashmiri_language">Kashmiri</a>
     * ({@link LanguageAlpha3Code#kas kas}).
     */
    ks()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.kas;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Kurdish_language">Kurdish</a>
     * ({@link LanguageAlpha3Code#kur kur}).
     */
    ku()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.kur;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Komi_language">Komi</a>
     * ({@link LanguageAlpha3Code#kom kom}).
     */
    kv()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.kom;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Cornish_language">Cornish</a>
     * ({@link LanguageAlpha3Code#cor cor}).
     */
    kw()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.cor;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Kyrgyz_language">Kyrgyz</a>
     * ({@link LanguageAlpha3Code#kir kir}).
     */
    ky()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.kir;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Latin">Latin</a>
     * ({@link LanguageAlpha3Code#lat lat}).
     */
    la()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.lat;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Luxembourgish_language">Luxembourgish</a>
     * ({@link LanguageAlpha3Code#ltz ltz}).
     */
    lb()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.ltz;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Luganda">Ganda</a>
     * ({@link LanguageAlpha3Code#lug lug}).
     */
    lg()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.lug;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Limburgish_language">Limburgish</a>
     * ({@link LanguageAlpha3Code#lim lim}).
     */
    li()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.lim;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Lingala_language">Lingala</a>
     * ({@link LanguageAlpha3Code#lin lin}).
     */
    ln()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.lin;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Lao_language">Lao</a>
     * ({@link LanguageAlpha3Code#lao lao}).
     */
    lo()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.lao;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Lithuanian_language">Lithuanian</a>
     * ({@link LanguageAlpha3Code#lit lit}).
     */
    lt()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.lit;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Tshiluba_language">Luba-Katanga</a>
     * ({@link LanguageAlpha3Code#lub lub}).
     */
    lu()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.lub;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Latvian_language">Latvian</a>
     * ({@link LanguageAlpha3Code#lav lav}).
     */
    lv()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.lav;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Malagasy_language">Malagasy</a>
     * ({@link LanguageAlpha3Code#mlg mlg}).
     */
    mg()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.mlg;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Marshallese_language">Marshallese</a>
     * ({@link LanguageAlpha3Code#mah mah}).
     */
    mh()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.mah;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/M%C4%81ori_language">M&#257;ori</a>
     * ({@link LanguageAlpha3Code#mri mir}, {@link LanguageAlpha3Code#mao mao}).
     */
    mi()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.mri;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Macedonian_language">Macedonian</a>
     * ({@link LanguageAlpha3Code#mkd mkd}, {@link LanguageAlpha3Code#mac mac})).
     */
    mk()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.mkd;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Malayalam_language">Malayalam</a>
     * ({@link LanguageAlpha3Code#mal mal}).
     */
    ml()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.mal;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Mongolian_language">Mongolian</a>
     * ({@link LanguageAlpha3Code#mon mon}).
     */
    mn()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.mon;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Marathi_language">Marathi</a>
     * ({@link LanguageAlpha3Code#mar mar}).
     */
    mr()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.mar;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Malay_language">Malay</a>
     * ({@link LanguageAlpha3Code#msa msa}, {@link LanguageAlpha3Code#may may}).
     */
    ms()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.msa;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Maltese_language">Maltese</a>
     * ({@link LanguageAlpha3Code#mlt mlt}).
     */
    mt()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.mlt;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Burmese_language">Burmese</a>
     * ({@link LanguageAlpha3Code#mya may}, {@link LanguageAlpha3Code#bur bur}).
     */
    my()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.mya;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Nauruan_language">Nauru</a>
     * ({@link LanguageAlpha3Code#nau nau}).
     */
    na()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.nau;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Bokm%C3%A5l">Norwegian Bokm&aring;l</a>
     * ({@link LanguageAlpha3Code#nob nob}).
     */
    nb()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.nob;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Northern_Ndebele_language">Northern Ndebele</a>
     * ({@link LanguageAlpha3Code#nde nde}).
     */
    nd()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.nde;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Nepali_language">Nepali</a>
     * ({@link LanguageAlpha3Code#nep nep}).
     */
    ne()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.nep;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Ndonga">Ndonga</a>
     * ({@link LanguageAlpha3Code#ndo ndo}).
     */
    ng()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.ndo;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Dutch_language">Dutch</a>
     * ({@link LanguageAlpha3Code#nld nld}, {@link LanguageAlpha3Code#dut dut}).
     */
    nl()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.nld;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Nynorsk">Norwegian Nynorsk</a>
     * ({@link LanguageAlpha3Code#nno nno}).
     */
    nn()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.nno;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Norwegian_language">Norwegian</a>
     * ({@link LanguageAlpha3Code#nor nor}).
     *
     * @deprecated {@link #nb} should be used.
     * @see <a href="http://i18n.skolelinux.no/localekoder.txt"
     *      >Spr&aring;kkoder for POSIX locale i Norge</a>
     * @see <a href="https://bugzilla.redhat.com/show_bug.cgi?id=532487"
     *      >Red Hat Bugzilla – Bug 532487 Legacy Norwegian locale (no_NO)
     *      should be removed from language selection menu</a>
     */
    no()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.nor;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Southern_Ndebele_language">Southern Ndebele</a>
     * ({@link LanguageAlpha3Code#nbl nbl}).
     */
    nr()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.nbl;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Navajo_language">Navajo</a>
     * ({@link LanguageAlpha3Code#nav nav}).
     */
    nv()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.nav;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Chichewa_language">Chichewa</a>
     * ({@link LanguageAlpha3Code#nya nya}).
     */
    ny()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.nya;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Occitan_language">Occitan</a>
     * ({@link LanguageAlpha3Code#oci oci}).
     */
    oc()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.oci;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Ojibwe_language">Ojibwe</a>
     * ({@link LanguageAlpha3Code#oji oji}).
     */
    oj()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.oji;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Oromo_language">Oromo</a>
     * ({@link LanguageAlpha3Code#orm orm}).
     */
    om()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.orm;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Oriya_language">Oriya</a>
     * ({@link LanguageAlpha3Code#ori ori}).
     */
    or()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.ori;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Ossetic_language">Ossetian</a>
     * ({@link LanguageAlpha3Code#oss oss}).
     */
    os()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.oss;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Punjabi_language">Punjabi</a>
     * ({@link LanguageAlpha3Code#pan pan}).
     */
    pa()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.pan;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/P%C4%81li_language">P&#257;li</a>
     * ({@link LanguageAlpha3Code#pli pli}).
     */
    pi()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.pli;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Polish_language">Polish</a>
     * ({@link LanguageAlpha3Code#pol pol}).
     */
    pl()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.pol;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Pashto_language">Pashto</a>
     * ({@link LanguageAlpha3Code#pus pus}).
     */
    ps()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.pus;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Portuguese_language">Portuguese</a>
     * ({@link LanguageAlpha3Code#por por}).
     */
    pt()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.por;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Quechua_language">Quechua</a>
     * ({@link LanguageAlpha3Code#que que}).
     */
    qu()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.que;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Romansh_language">Romansh</a>
     * ({@link LanguageAlpha3Code#roh roh}).
     */
    rm()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.roh;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Kirundi">Kirundi</a>
     * ({@link LanguageAlpha3Code#run run}).
     */
    rn()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.run;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Romanian_language">Romanian</a>
     * ({@link LanguageAlpha3Code#ron ron}, {@link LanguageAlpha3Code#rum rum}).
     */
    ro()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.ron;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Russian_language">Russian</a>
     * ({@link LanguageAlpha3Code#run run}).
     */
    ru()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.rus;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Kinyarwanda">Kinyarwanda</a>
     * ({@link LanguageAlpha3Code#kin kin}).
     */
    rw()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.kin;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Sanskrit">Sanskrit</a>
     * ({@link LanguageAlpha3Code#san san}).
     */
    sa()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.san;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Sardinian_language">Sardinian</a>
     * ({@link LanguageAlpha3Code#srd srd}).
     */
    sc()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.srd;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Sindhi_language">Sindhi</a>
     * ({@link LanguageAlpha3Code#snd snd}).
     */
    sd()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.snd;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Northern_Sami">Northern Sami</a>
     * ({@link LanguageAlpha3Code#sme sme}).
     */
    se()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.sme;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Sango_language">Sango</a>
     * ({@link LanguageAlpha3Code#sag sag}).
     */
    sg()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.sag;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Sinhala_language">Sinhala</a>
     * ({@link LanguageAlpha3Code#sin sin}).
     */
    si()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.sin;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Slovak_language">Slovak</a>
     * ({@link LanguageAlpha3Code#slk slk}, {@link LanguageAlpha3Code#slo slo}).
     */
    sk()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.slk;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Slovene_language">Slovene</a>
     * ({@link LanguageAlpha3Code#slv slv}).
     */
    sl()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.slv;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Samoan_language">Samoan</a>
     * ({@link LanguageAlpha3Code#smo smo}).
     */
    sm()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.smo;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Shona_language">Shona</a>
     * ({@link LanguageAlpha3Code#sna sna}).
     */
    sn()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.sna;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Somali_language">Somali</a>
     * ({@link LanguageAlpha3Code#som som}).
     */
    so()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.som;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Albanian_language">Albanian</a>
     * ({@link LanguageAlpha3Code#sqi sqi}, {@link LanguageAlpha3Code#alb alb}).
     */
    sq()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.sqi;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Serbian_language">Serbian</a>
     * ({@link LanguageAlpha3Code#srp srp}).
     */
    sr()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.srp;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Swati_language">Swati</a>
     * ({@link LanguageAlpha3Code#ssw ssw}).
     */
    ss()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.ssw;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Sotho_language">Southern Sotho</a>
     * ({@link LanguageAlpha3Code#sot sot}).
     */
    st()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.sot;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Sundanese_language">Sundanese</a>
     * ({@link LanguageAlpha3Code#sun sun}).
     */
    su()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.sun;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Swedish_language">Swedish</a>
     * ({@link LanguageAlpha3Code#swe swe}).
     */
    sv()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.swe;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Swahili_language">Swahili</a>
     * ({@link LanguageAlpha3Code#swa swa}).
     */
    sw()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.swa;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Tamil_language">Tamil</a>
     * ({@link LanguageAlpha3Code#tam tam}).
     */
    ta()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.tam;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Telugu_language">Telugu</a>
     * ({@link LanguageAlpha3Code#tel tel}).
     */
    te()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.tel;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Tajik_language">Tajik</a>
     * ({@link LanguageAlpha3Code#tgk tgk}).
     */
    tg()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.tgk;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Thai_language">Thai</a>
     * ({@link LanguageAlpha3Code#tha tha}).
     */
    th()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.tha;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Tigrinya_language">Tigrinya</a>
     * ({@link LanguageAlpha3Code#tir tir}).
     */
    ti()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.tir;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Turkmen_language">Turkmen</a>
     * ({@link LanguageAlpha3Code#tuk tuk}).
     */
    tk()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.tuk;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Tagalog_language">Tagalog</a>
     * ({@link LanguageAlpha3Code#tgl tgl}).
     */
    tl()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.tgl;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Tswana_language">Tswana</a>
     * ({@link LanguageAlpha3Code#tsn tsn}).
     */
    tn()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.tsn;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Tongan_language">Tongan</a>
     * ({@link LanguageAlpha3Code#ton ton}).
     */
    to()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.ton;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Turkish_language">Turkish</a>
     * ({@link LanguageAlpha3Code#tur tur}).
     */
    tr()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.tur;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Tsonga_language">Tsonga</a>
     * ({@link LanguageAlpha3Code#tso tso}).
     */
    ts()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.tso;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Tatar_language">Tatar</a>
     * ({@link LanguageAlpha3Code#tat tat}).
     */
    tt()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.tat;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Twi">Twi</a>
     * ({@link LanguageAlpha3Code#twi twi}).
     */
    tw()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.twi;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Tahitian_language">Tahitian</a>
     * ({@link LanguageAlpha3Code#tah tah}).
     */
    ty()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.tah;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Uyghur_language">Uighur</a>
     * ({@link LanguageAlpha3Code#uig uig}).
     */
    ug()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.uig;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Ukrainian_language">Ukrainian</a>
     * ({@link LanguageAlpha3Code#ukr ukr}).
     */
    uk()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.ukr;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Urdu">Urdu</a>
     * ({@link LanguageAlpha3Code#urd urd}).
     */
    ur()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.urd;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Uzbek_language">Uzbek</a>
     * ({@link LanguageAlpha3Code#uzb uzb}).
     */
    uz()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.uzb;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Venda_language">Venda</a>
     * ({@link LanguageAlpha3Code#ven ven}).
     */
    ve()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.ven;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Vietnamese_language">Vietnamese</a>
     * ({@link LanguageAlpha3Code#vie vie}).
     */
    vi()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.vie;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Volap%C3%BCk">Volap&uuml;k</a>
     * ({@link LanguageAlpha3Code#vol vol}).
     */
    vo()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.vol;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Walloon_language">Walloon</a>
     * ({@link LanguageAlpha3Code#wln wln}).
     */
    wa()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.wln;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Wolof_language">Wolof</a>
     * ({@link LanguageAlpha3Code#wol wol}).
     */
    wo()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.wol;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Xhosa_language">Xhosa</a>
     * ({@link LanguageAlpha3Code#xho xho}).
     */
    xh()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.xho;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Yiddish_language">Yiddish</a>
     * ({@link LanguageAlpha3Code#yid yid}).
     */
    yi()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.yid;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Yoruba_language">Yoruba</a>
     * ({@link LanguageAlpha3Code#yor yor}).
     */
    yo()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.yor;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Zhuang_languages">Zhuang</a>
     * ({@link LanguageAlpha3Code#zha zha}).
     */
    za()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.zha;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Chinese_language">Chinese</a>
     * ({@link LanguageAlpha3Code#zho zho}, {@link LanguageAlpha3Code#chi chi}).
     */
    zh()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.zho;
        }


        @Override
        public Locale toLocale()
        {
            return Locale.CHINESE;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Zulu_language">Zulu</a>
     * ({@link LanguageAlpha3Code#zul zul}).
     */
    zu()
    {
        @Override
        public LanguageAlpha3Code getAlpha3()
        {
            return LanguageAlpha3Code.zul;
        }
    }
    ;


    private LanguageCode()
    {
    }


    /**
     * Get the language name.
     *
     * @return
     *         The language name.
     */
    public String getName()
    {
        return getAlpha3().getName();
    }


    /**
     * Convert this {@code LanguageCode} instance to a {@link Locale} instance.
     *
     * <p>
     * In most cases, this method creates a new {@code Locale} instance
     * every time it is called, but some {@code LanguageCode} instances return
     * their corresponding entries in {@code Locale} class. For example,
     * {@link #ja LanguageCode.ja} always returns {@link Locale#JAPANESE}.
     * </p>
     *
     * <p>
     * The table below lists {@code LanguageCode} entries whose {@code toLocale()}
     * do not create new {@code Locale} instances but return entries in
     * {@code Locale} class.
     * </p>
     *
     * <table border="1" style="border-collapse: collapse;" cellpadding="5">
     * <tr bgcolor="#FF8C00">
     *   <th>LanguageCode</th>
     *   <th>Locale</th>
     * </tr>
     * <tr>
     *   <td>{@link LanguageCode#de LanguageCode.de}</td>
     *   <td>{@link Locale#GERMAN}</td>
     * </tr>
     * <tr>
     *   <td>{@link LanguageCode#en LanguageCode.en}</td>
     *   <td>{@link Locale#ENGLISH}</td>
     * </tr>
     * <tr>
     *   <td>{@link LanguageCode#fr LanguageCode.fr}</td>
     *   <td>{@link Locale#FRENCH}</td>
     * </tr>
     * <tr>
     *   <td>{@link LanguageCode#it LanguageCode.it}</td>
     *   <td>{@link Locale#ITALIAN}</td>
     * </tr>
     * <tr>
     *   <td>{@link LanguageCode#ja LanguageCode.ja}</td>
     *   <td>{@link Locale#JAPANESE}</td>
     * </tr>
     * <tr>
     *   <td>{@link LanguageCode#ko LanguageCode.ko}</td>
     *   <td>{@link Locale#KOREAN}</td>
     * </tr>
     * <tr>
     *   <td>{@link LanguageCode#zh LanguageCode.zh}</td>
     *   <td>{@link Locale#CHINESE}</td>
     * </tr>
     * </table>
     *
     * @return
     *         A {@code Locale} instance that matches this {@code LanguageCode}.
     */
    public Locale toLocale()
    {
        return new Locale(name());
    }


    /**
     * Get <a href="http://en.wikipedia.org/wiki/ISO_639-2">ISO 639-2</a>
     * language code (3-letter lowercase code(s)).
     *
     * <p>
     * Most languages have just one corresponding ISO 639-2 code, but
     * some languages have two ISO 639-2 codes. They are known as
     * "bibliographic" code (ISO 639-2/B code) and "terminological"
     * code (ISO 639-2/T code). This method returns ISO 639-2/T code.
     * If you want to get ISO 639-2/B code, write like below.
     * </p>
     *
     * <pre style="background-color: #EEEEEE; margin-left: 2em; margin-right: 2em; border: 1px solid black;">
     *
     * LanguageCode alpha2 = ...;
     *
     * {@link LanguageAlpha3Code} alpha3B = alpha2.{@link #getAlpha3()}.{@link
     * LanguageAlpha3Code#getAlpha3B() getAlpha3B()};
     * </pre>
     *
     * <p>
     * The above code does no harm for most {@code LanguageCode}s that have
     * just one ISO 639-2 code. {@link LanguageAlpha3Code#getAlpha3B()
     * getAlpha3B()} of such {@code LanguageAlpha3Code} instances just return
     * themselves (= <code>this</code> object).
     * </p>
     *
     * <p>
     * The table below lists languages having two ISO 639-2 codes.
     * </p>
     *
     * <table border="1" style="border-collapse: collapse" cellpadding="5">
     * <tr bgcolor="orange">
     *   <th>ISO 639-1</th>
     *   <th>ISO 639-2/T</th>
     *   <th>ISO 639-2/B</th>
     *   <th>Language</th>
     * </tr>
     * <tr>
     *   <td>{@link LanguageCode#bo bo}</td>
     *   <td>{@link LanguageAlpha3Code#bod bod}</td>
     *   <td>{@link LanguageAlpha3Code#tib tib}</td>
     *   <td><a href="http://en.wikipedia.org/wiki/Standard_Tibetan">Tibetan</a></td>
     * </tr>
     * <tr>
     *   <td>{@link LanguageCode#eu eu}</td>
     *   <td>{@link LanguageAlpha3Code#eus eus}</td>
     *   <td>{@link LanguageAlpha3Code#baq baq}</td>
     *   <td><a href="http://en.wikipedia.org/wiki/Basque_language">Basque</a></td>
     * </tr>
     * <tr>
     *   <td>{@link LanguageCode#cs cs}</td>
     *   <td>{@link LanguageAlpha3Code#ces ces}</td>
     *   <td>{@link LanguageAlpha3Code#cze cze}</td>
     *   <td><a href="http://en.wikipedia.org/wiki/Czech_language">Czech</a></td>
     * </tr>
     * <tr>
     *   <td>{@link LanguageCode#cy cy}</td>
     *   <td>{@link LanguageAlpha3Code#cym cym}</td>
     *   <td>{@link LanguageAlpha3Code#wel wel}</td>
     *   <td><a href="http://en.wikipedia.org/wiki/Welsh_language">Welsh</a></td>
     * </tr>
     * <tr>
     *   <td>{@link LanguageCode#de de}</td>
     *   <td>{@link LanguageAlpha3Code#deu deu}</td>
     *   <td>{@link LanguageAlpha3Code#ger ger}</td>
     *   <td><a href="http://en.wikipedia.org/wiki/German_language">German</a></td>
     * </tr>
     * <tr>
     *   <td>{@link LanguageCode#el el}</td>
     *   <td>{@link LanguageAlpha3Code#ell ell}</td>
     *   <td>{@link LanguageAlpha3Code#gre gre}</td>
     *   <td><a href="http://en.wikipedia.org/wiki/Greek_language">Greek</a></td>
     * </tr>
     * <tr>
     *   <td>{@link LanguageCode#fa fa}</td>
     *   <td>{@link LanguageAlpha3Code#fas fas}</td>
     *   <td>{@link LanguageAlpha3Code#per per}</td>
     *   <td><a href="http://en.wikipedia.org/wiki/Persian_language">Persian</a></td>
     * </tr>
     * <tr>
     *   <td>{@link LanguageCode#fr fr}</td>
     *   <td>{@link LanguageAlpha3Code#fra fra}</td>
     *   <td>{@link LanguageAlpha3Code#fre fre}</td>
     *   <td><a href="http://en.wikipedia.org/wiki/French_language">French</a></td>
     * </tr>
     * <tr>
     *   <td>{@link LanguageCode#hy hy}</td>
     *   <td>{@link LanguageAlpha3Code#hye hye}</td>
     *   <td>{@link LanguageAlpha3Code#arm arm}</td>
     *   <td><a href="http://en.wikipedia.org/wiki/Armenian_language">Armenian</a></td>
     * </tr>
     * <tr>
     *   <td>{@link LanguageCode#is is}</td>
     *   <td>{@link LanguageAlpha3Code#isl isl}</td>
     *   <td>{@link LanguageAlpha3Code#ice ice}</td>
     *   <td><a href="http://en.wikipedia.org/wiki/Icelandic_language">Icelandic</a></td>
     * </tr>
     * <tr>
     *   <td>{@link LanguageCode#ka ka}</td>
     *   <td>{@link LanguageAlpha3Code#kat kat}</td>
     *   <td>{@link LanguageAlpha3Code#geo geo}</td>
     *   <td><a href="http://en.wikipedia.org/wiki/Georgian_language">Georgian</a></td>
     * </tr>
     * <tr>
     *   <td>{@link LanguageCode#mi mi}</td>
     *   <td>{@link LanguageAlpha3Code#mri mri}</td>
     *   <td>{@link LanguageAlpha3Code#mao mao}</td>
     *   <td><a href="http://en.wikipedia.org/wiki/M%C4%81ori_language">M&#257;ori</a></td>
     * </tr>
     * <tr>
     *   <td>{@link LanguageCode#mk mk}</td>
     *   <td>{@link LanguageAlpha3Code#mkd mkd}</td>
     *   <td>{@link LanguageAlpha3Code#mac mac}</td>
     *   <td><a href="http://en.wikipedia.org/wiki/Macedonian_language">Macedonian</a></td>
     * </tr>
     * <tr>
     *   <td>{@link LanguageCode#ms ms}</td>
     *   <td>{@link LanguageAlpha3Code#msa msa}</td>
     *   <td>{@link LanguageAlpha3Code#may may}</td>
     *   <td><a href="http://en.wikipedia.org/wiki/Malay_language">Malay</a></td>
     * </tr>
     * <tr>
     *   <td>{@link LanguageCode#my my}</td>
     *   <td>{@link LanguageAlpha3Code#mya mya}</td>
     *   <td>{@link LanguageAlpha3Code#bur bur}</td>
     *   <td><a href="http://en.wikipedia.org/wiki/Burmese_language">Burmese</a></td>
     * </tr>
     * <tr>
     *   <td>{@link LanguageCode#nl nl}</td>
     *   <td>{@link LanguageAlpha3Code#nld nld}</td>
     *   <td>{@link LanguageAlpha3Code#dut dut}</td>
     *   <td><a href="http://en.wikipedia.org/wiki/Dutch_language">Dutch</a></td>
     * </tr>
     * <tr>
     *   <td>{@link LanguageCode#ro ro}</td>
     *   <td>{@link LanguageAlpha3Code#ron ron}</td>
     *   <td>{@link LanguageAlpha3Code#rum rum}</td>
     *   <td><a href="http://en.wikipedia.org/wiki/Romanian_language">Romanian</a></td>
     * </tr>
     * <tr>
     *   <td>{@link LanguageCode#sk sk}</td>
     *   <td>{@link LanguageAlpha3Code#slk slk}</td>
     *   <td>{@link LanguageAlpha3Code#slo slo}</td>
     *   <td><a href="http://en.wikipedia.org/wiki/Slovak_language">Slovak</a></td>
     * </tr>
     * <tr>
     *   <td>{@link LanguageCode#sq sq}</td>
     *   <td>{@link LanguageAlpha3Code#sqi sqi}</td>
     *   <td>{@link LanguageAlpha3Code#alb alb}</td>
     *   <td><a href="http://en.wikipedia.org/wiki/Albanian_language">Albanian</a></td>
     * </tr>
     * </table>
     *
     *
     * @return
     *         <a href="http://en.wikipedia.org/wiki/ISO_639-2">ISO 639-2</a>
     *         language code.
     *
     * @since 1.1
     */
    public LanguageAlpha3Code getAlpha3()
    {
        return null;
    }


    /**
     * Get a {@code LanguageCode} that corresponds to a given
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
     *         An <a href="http://en.wikipedia.org/wiki/ISO_639-1">ISO 639-1</a>
     *         code (2-letter lowercase code) or an
     *         <a href="http://en.wikipedia.org/wiki/ISO_639-2">ISO 639-2</a> code
     *         (3-letter lowercase code). Or "undefined" (case sensitive).
     *         Note that if the given code is one of legacy language codes
     *         ("iw", "ji" and "in"), it is treated as its official counterpart
     *         ("he", "yi" and "id", respectively). For example, if "in" is given,
     *         this method returns {@link #id LanguageCode.id}.
     *
     * @return
     *         A {@code LanguageCode} instance, or {@code null} if not found.
     */
    public static LanguageCode getByCode(String code)
    {
        return getByCode(code, true);
    }


    /**
     * Get a {@code LanguageCode} that corresponds to a given
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
     *         An <a href="http://en.wikipedia.org/wiki/ISO_639-1">ISO 639-1</a>
     *         code (2-letter lowercase code) or an
     *         <a href="http://en.wikipedia.org/wiki/ISO_639-2">ISO 639-2</a> code
     *         (3-letter lowercase code). Or "undefined" (case insensitive).
     *         Note that if the given code is one of legacy language codes
     *         ("iw", "ji" and "in"), it is treated as its official counterpart
     *         ("he", "yi" and "id", respectively). For example, if "in" is given,
     *         this method returns {@link #id LanguageCode.id}.
     *
     * @return
     *         A {@code LanguageCode} instance, or {@code null} if not found.
     *
     * @since 1.13
     */
    public static LanguageCode getByCodeIgnoreCase(String code)
    {
        return getByCode(code, false);
    }


    /**
     * Get a {@code LanguageCode} that corresponds to a given
     * <a href="http://en.wikipedia.org/wiki/ISO_639-1">ISO 639-1</a> code
     * (2-letter lowercase code) or
     * <a href="http://en.wikipedia.org/wiki/ISO_639-2">ISO 639-2</a> code
     * (3-letter lowercase code).
     *
     * @param code
     *         An <a href="http://en.wikipedia.org/wiki/ISO_639-1">ISO 639-1</a>
     *         code (2-letter lowercase code) or an
     *         <a href="http://en.wikipedia.org/wiki/ISO_639-2">ISO 639-2</a> code
     *         (3-letter lowercase code). Or "undefined" (its case sensitivity
     *         depends on the value of {@code caseSensitive}).
     *         Note that if the given code is one of legacy language codes
     *         ("iw", "ji" and "in"), it is treated as its official counterpart
     *         ("he", "yi" and "id", respectively). For example, if "in" is given,
     *         this method returns {@link #id LanguageCode.id}.
     *
     * @param caseSensitive
     *         If {@code true}, the given code should consist of lowercase letters only.
     *         If {@code false}, this method internally canonicalizes the given code by
     *         {@link String#toLowerCase()} and then performs search. For example,
     *         {@code getByCode("JA", true)} returns {@code null}, but on the other hand,
     *         {@code getByCode("JA", false)} returns {@link #ja LanguageCode.ja}.
     *
     * @return
     *         A {@code LanguageCode} instance, or {@code null} if not found.
     */
    public static LanguageCode getByCode(String code, boolean caseSensitive)
    {
        code = canonicalize(code, caseSensitive);

        if (code == null)
        {
            return null;
        }

        switch (code.length())
        {
            case 2:
            case 9:
                return getByEnumName(code);

            case 3:
                break;

            default:
                return null;
        }

        LanguageAlpha3Code alpha3 = LanguageAlpha3Code.getByEnumName(code);

        if (alpha3 == null)
        {
            return null;
        }

        // LanguageAlpha3Code.getAlpha2() may return null.
        return alpha3.getAlpha2();
    }


    static LanguageCode getByEnumName(String name)
    {
        try
        {
            return Enum.valueOf(LanguageCode.class, name);
        }
        catch (IllegalArgumentException e)
        {
            return null;
        }
    }


    /**
     * Get a {@code LanguageCode} that corresponds to the language code of
     * the given {@link Locale} instance.
     *
     * @param locale
     *         A {@code Locale} instance.
     *
     * @return
     *         A {@code LanguageCode} instance, or {@code null} if not found.
     *         When {@link Locale#getLanguage() getLanguage()} method of the
     *         given {@code Locale} instance returns {@code null} or an
     *         empty string, {@link #undefined LanguageCode.undefined} is
     *         returned.
     *
     * @see Locale#getLanguage()
     */
    public static LanguageCode getByLocale(Locale locale)
    {
        if (locale == null)
        {
            return null;
        }

        // Locale.getLanguage() returns a lowercase ISO 639 code.
        String language = locale.getLanguage();

        if (language == null || language.length() == 0)
        {
            return LanguageCode.undefined;
        }

        return getByCode(language, true);
    }


    /**
     * Canonicalize the given language code.
     *
     * <ol>
     * <li>If the given code is {@code null} or an empty string,
     *     {@code null} is returned.
     * <li>Otherwise, if the given code matches one of three legacy
     *     language code ("iw", "ji" and "in"), its official counterpart
     *     ("he", "yi" and "id", respectively) is returned. Note that
     *     {@code String.equals(Object)} is used for comparison if
     *     {@code  caseSensitive} is {@code true} and that
     *     {@code  String.equalsIgnoreCase(String)} is used if
     *     {@code caseSensitive} is {@code false}.
     * <li>Otherwise, if {@code caseSensitive} is {@code true},
     *     the given code is returned as is.
     * <li>Otherwise, {@code code.toLowercase()} is returned.
     * </ol>
     *
     * @param code
     *         ISO 639-1 code.
     *
     * @param caseSensitive
     *         {@code true} if the code should be handled case-sensitively.
     *
     * @return
     *         Canonicalized language code.
     */
    static String canonicalize(String code, boolean caseSensitive)
    {
        if (code == null || code.length() == 0)
        {
            return null;
        }

        // Support legacy language codes. Map three obsolete language codes
        // { "iw", "ji", "in" } to new official ones { "he", "yi", "id" }.
        final String[] legacy = { "iw", "ji", "in" };
        final String[] official = { "he", "yi", "id" };

        for (int i = 0; i < legacy.length; ++i)
        {
            if (caseSensitive)
            {
                if (code.equals(legacy[i]))
                {
                    return official[i];
                }
            }
            else
            {
                if (code.equalsIgnoreCase(legacy[i]))
                {
                    return official[i];
                }
            }
        }

        if (caseSensitive)
        {
            return code;
        }
        else
        {
            return code.toLowerCase();
        }
    }


    /**
     * Get a list of {@code LanguageCode} by a name regular expression.
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
     *         List of {@code LanguageCode}. If nothing has matched,
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
    public static List<LanguageCode> findByName(String regex)
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
     * Get a list of {@code LanguageCode} by a name pattern.
     *
     * <p>
     * For example, the list obtained by the code snippet below:
     * </p>
     *
     * <pre style="background-color: #EEEEEE; margin-left: 2em; margin-right: 2em; border: 1px solid black; padding: 0.5em;">
     * Pattern pattern = Pattern.compile(<span style="color: darkred;">".*nese"</span>);
     * List&lt;LanguageCode&gt; list = LanguageCode.findByName(pattern);</pre>
     *
     * <p>
     * contains 5 {@code LanguageCode}s as listed below.
     * </p>
     *
     * <ol>
     * <li>{@link #an} : Aragonese
     * <li>{@link #ja} : Japanese
     * <li>{@link #jv} : Javanese
     * <li>{@link #su} : Sundanese
     * <li>{@link #zh} : Chinese
     * </ol>
     *
     * @param pattern
     *         Pattern to match names.
     *
     * @return
     *         List of {@code LanguageCode}. If nothing has matched,
     *         an empty list is returned.
     *
     * @throws IllegalArgumentException
     *         {@code pattern} is {@code null}.
     *
     * @since 1.11
     */
    public static List<LanguageCode> findByName(Pattern pattern)
    {
        if (pattern == null)
        {
            throw new IllegalArgumentException("pattern is null.");
        }

        List<LanguageCode> list = new ArrayList<LanguageCode>();

        for (LanguageCode entry : values())
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
