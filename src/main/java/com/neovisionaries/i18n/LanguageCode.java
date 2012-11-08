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


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;


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
 * <pre style="background-color: #EEEEEE; margin-left: 2em; margin-right: 2em; border: 1px solid black;">
 * <span style="color: darkgreen;">// List all the language codes.</span>
 * for (LanguageCode code : LanguageCode.values())
 * {
 *     <span style="color: darkgreen;">// For example, "[ar] Arabic" is printed.</span>
 *     System.out.format("[%s] %s\n", code, code.{@link #getName()});
 * }
 *
 * <span style="color: darkgreen;">// Get a LanguageCode instance by ISO 639-1 code.</span>
 * LanguageCode code = LanguageCode.{@link #getByCode(String) getByCode}("fr");
 *
 * <span style="color: darkgreen;">// Convert to a Locale instance.</span>
 * Locale locale = code.{@link #toLocale()};
 *
 * <span style="color: darkgreen;">// Get a LanguageCode by a Locale instance.</span>
 * code = LanguageCode.{@link #getByLocale(Locale) getByLocale}(locale);
 * </pre>
 *
 * @author Takahiko Kawasaki
 */
public enum LanguageCode
{
    /**
     * <a href="http://en.wikipedia.org/wiki/Afar_language">Afar</a>
     */
    aa()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.aar);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Abkhaz_language">Abkhaz</a>
     */
    ab()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.abk);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Avestan_language">Avestan</a>
     */
    ae()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.ave);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Afrikaans_language">Afrikaans</a>
     */
    af()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.afr);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Akan_language">Akan</a>
     */
    ak()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.aka);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Amharic_language">Amharic</a>
     */
    am()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.amh);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Aragonese_language">Aragonese</a>
     */
    an()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.arg);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Arabic_language">Arabic</a>
     */
    ar()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.ara);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Assamese_language">Assamese</a>
     */
    as()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.asm);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Avar_language">Avaric</a>
     */
    av()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.ava);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Aymara_language">Aymara</a>
     */
    ay()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.aym);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Azerbaijani_language">Azerbaijani</a>
     */
    az()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.aze);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Bashkir_language">Bashkir</a>
     */
    ba()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.bak);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Belarusian_language">Belarusian</a>
     */
    be()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.bel);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Bulgarian_language">Bulgarian</a>
     */
    bg()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.bul);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Bihari_languages">Bihari</a>
     */
    bh()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.bih);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Bislama_language">Bislama</a>
     */
    bi()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.bis);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Bambara_language">Bambara</a>
     */
    bm()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.bam);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Bengali_language">Bengali</a>
     */
    bn()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.ben);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Standard_Tibetan">Tibetan</a>
     */
    bo()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.bod, LanguageAlpha3Code.tib);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Breton_language">Breton</a>
     */
    br()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.bre);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Bosnian_language">Bosnian</a>
     */
    bs()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.bos);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Catalan_language">Catalan</a>
     */
    ca()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.cat);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Chechen_language">Chechen</a>
     */
    ce()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.che);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Chamorro_language">Chamorro</a>
     */
    ch()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.cha);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Corsican_language">Corsican</a>
     */
    co()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.cos);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Cree_language">Cree</a>
     */
    cr()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.cre);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Czech_language">Czech</a>
     */
    cs()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.ces, LanguageAlpha3Code.cze);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Old_Church_Slavonic">Church Slavonic</a>
     */
    cu()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.chu);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Chuvash_language">Chuvash</a>
     */
    cv()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.chv);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Welsh_language">Welsh</a>
     */
    cy()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.cym, LanguageAlpha3Code.wel);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Danish_language">Danish</a>
     */
    da()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.dan);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/German_language">German</a>
     */
    de()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.deu, LanguageAlpha3Code.ger);
        }

        @Override
        public Locale toLocale()
        {
            return Locale.GERMAN;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Dhivehi_language">Dhivehi</a>
     */
    dv()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.div);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Dzongkha_language">Dzongkha</a>
     */
    dz()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.dzo);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Ewe_language">Ewe</a>
     */
    ee()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.ewe);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Greek_language">Greek</a>
     */
    el()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.ell, LanguageAlpha3Code.gre);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/English_language">English</a>
     */
    en()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.eng);
        }


        @Override
        public Locale toLocale()
        {
            return Locale.ENGLISH;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Esperanto">Esperanto</a>
     */
    eo()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.epo);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Spanish_language">Spanish</a>
     */
    es()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.spa);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Estonian_language">Estonian</a>
     */
    et()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.est);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Basque_language">Basque</a>
     */
    eu()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.eus, LanguageAlpha3Code.baq);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Persian_language">Persian</a>
     */
    fa()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.fas, LanguageAlpha3Code.per);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Fula_language">Fula</a>
     */
    ff()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.ful);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Finnish_language">Finnish</a>
     */
    fi()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.fin);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Fijian_language">Fijian</a>
     */
    fj()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.fij);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Faroese_language">Faroese</a>
     */
    fo()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.fao);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/French_language">French</a>
     */
    fr()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.fra, LanguageAlpha3Code.fre);
        }

        @Override
        public Locale toLocale()
        {
            return Locale.FRENCH;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/West_Frisian_language">West Frisian</a>
     */
    fy()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.fry);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Irish_language">Irish</a>
     */
    ga()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.gle);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Scottish_Gaelic_language">Scottish Gaelic</a>
     */
    gd()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.gla);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Galician_language">Galician</a>
     */
    gl()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.glg);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Guaran%C3%AD_language">Guaran&iacute;</a>
     */
    gn()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.grn);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Gujarati_language">Gujarati</a>
     */
    gu()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.guj);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Manx_language">Manx</a>
     */
    gv()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.glv);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Hausa_language">Hausa</a>
     */
    ha()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.hau);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Hebrew_language">Hebrew</a>
     */
    he()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.heb);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Hindi">Hindi</a>
     */
    hi()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.hin);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Hiri_Motu_language">Hiri Motu</a>
     */
    ho()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.hmo);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Croatian_language">Croatian</a>
     */
    hr()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.hrv);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Haitian_Creole_language">Haitian</a>
     */
    ht()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.hat);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Hungarian_language">Hungarian</a>
     */
    hu()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.hun);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Armenian_language">Armenian</a>
     */
    hy()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.hye, LanguageAlpha3Code.arm);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Herero_language">Herero</a>
     */
    hz()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.her);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Interlingua">Interlingua</a>
     */
    ia()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.ina);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Indonesian_language">Indonesian</a>
     */
    id()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.ind);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Interlingue_language">Interlingue</a>
     */
    ie()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.ile);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Igbo_language">Igbo</a>
     */
    ig()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.ibo);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Nuosu_language">Nuosu</a>
     */
    ii()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.iii);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Inupiaq_language">Inupiaq</a>
     */
    ik()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.ipk);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Ido">Ido</a>
     */
    io()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.ido);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Icelandic_language">Icelandic</a>
     */
    is()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.isl, LanguageAlpha3Code.ice);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Italian_language">Italian</a>
     */
    it()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.ita);
        }

        @Override
        public Locale toLocale()
        {
            return Locale.ITALIAN;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Inuktitut">Inuktitut</a>
     */
    iu()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.iku);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Japanese_language">Japanese</a>
     */
    ja()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.jpn);
        }

        @Override
        public Locale toLocale()
        {
            return Locale.JAPANESE;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Javanese_language">Javanese</a>
     */
    jv()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.jav);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Georgian_language">Georgian</a>
     */
    ka()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.kat, LanguageAlpha3Code.geo);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Kongo_language">Kongo</a>
     */
    kg()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.kon);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Gikuyu_language">Kikuyu</a>
     */
    ki()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.kik);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Kwanyama">Kwanyama</a>
     */
    kj()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.kua);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Kazakh_language">Kazakh</a>
     */
    kk()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.kaz);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Kalaallisut_language">Kalaallisut</a>
     */
    kl()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.kal);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Khmer_language">Khmer</a>
     */
    km()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.khm);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Kannada_language">Kannada</a>
     */
    kn()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.kan);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Korean_language">Korean</a>
     */
    ko()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.kor);
        }

        @Override
        public Locale toLocale()
        {
            return Locale.KOREAN;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Kanuri_language">Kanuri</a>
     */
    kr()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.kau);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Kashmiri_language">Kashmiri</a>
     */
    ks()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.kas);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Kurdish_language">Kurdish</a>
     */
    ku()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.kur);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Komi_language">Komi</a>
     */
    kv()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.kom);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Cornish_language">Cornish</a>
     */
    kw()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.cor);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Kyrgyz_language">Kyrgyz</a>
     */
    ky()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.kir);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Latin">Latin</a>
     */
    la()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.lat);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Luxembourgish_language">Luxembourgish</a>
     */
    lb()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.ltz);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Luganda">Ganda</a>
     */
    lg()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.lug);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Limburgish_language">Limburgish</a>
     */
    li()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.lim);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Lingala_language">Lingala</a>
     */
    ln()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.lin);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Lao_language">Lao</a>
     */
    lo()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.lao);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Lithuanian_language">Lithuanian</a>
     */
    lt()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.lit);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Tshiluba_language">Luba-Katanga</a>
     */
    lu()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.lub);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Latvian_language">Latvian</a>
     */
    lv()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.lav);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Malagasy_language">Malagasy</a>
     */
    mg()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.mlg);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Marshallese_language">Marshallese</a>
     */
    mh()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.mah);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/M%C4%81ori_language">M&#257;ori</a>
     */
    mi()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.mri, LanguageAlpha3Code.mao);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Macedonian_language">Macedonian</a>
     */
    mk()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.mkd, LanguageAlpha3Code.mac);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Malayalam_language">Malayalam</a>
     */
    ml()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.mal);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Mongolian_language">Mongolian</a>
     */
    mn()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.mon);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Marathi_language">Marathi</a>
     */
    mr()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.mar);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Malay_language">Malay</a>
     */
    ms()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.msa, LanguageAlpha3Code.may);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Maltese_language">Maltese</a>
     */
    mt()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.mlt);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Burmese_language">Burmese</a>
     */
    my()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.mya, LanguageAlpha3Code.bur);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Nauruan_language">Nauru</a>
     */
    na()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.nau);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Bokm%C3%A5l">Norwegian Bokm&aring;l</a>
     */
    nb()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.nob);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Northern_Ndebele_language">Northern Ndebele</a>
     */
    nd()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.nde);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Nepali_language">Nepali</a>
     */
    ne()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.nep);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Ndonga">Ndonga</a>
     */
    ng()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.ndo);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Dutch_language">Dutch</a>
     */
    nl()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.nld, LanguageAlpha3Code.dut);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Nynorsk">Norwegian Nynorsk</a>
     */
    nn()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.nno);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Norwegian_language">Norwegian</a>
     */
    no()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.nor);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Southern_Ndebele_language">Southern Ndebele</a>
     */
    nr()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.nbl);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Navajo_language">Navajo</a>
     */
    nv()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.nav);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Chichewa_language">Chichewa</a>
     */
    ny()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.nya);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Occitan_language">Occitan</a>
     */
    oc()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.oci);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Ojibwe_language">Ojibwe</a>
     */
    oj()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.oji);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Oromo_language">Oromo</a>
     */
    om()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.orm);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Oriya_language">Oriya</a>
     */
    or()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.ori);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Ossetic_language">Ossetian</a>
     */
    os()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.oss);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Punjabi_language">Punjabi</a>
     */
    pa()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.pan);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/P%C4%81li_language">P&#257;li</a>
     */
    pi()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.pli);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Polish_language">Polish</a>
     */
    pl()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.pol);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Pashto_language">Pashto</a>
     */
    ps()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.pus);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Portuguese_language">Portuguese</a>
     */
    pt()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.por);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Quechua_language">Quechua</a>
     */
    qu()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.que);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Romansh_language">Romansh</a>
     */
    rm()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.roh);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Kirundi">Kirundi</a>
     */
    rn()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.run);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Romanian_language">Romanian</a>
     */
    ro()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.ron, LanguageAlpha3Code.rum);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Russian_language">Russian</a>
     */
    ru()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.rus);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Kinyarwanda">Kinyarwanda</a>
     */
    rw()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.kin);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Sanskrit">Sanskrit</a>
     */
    sa()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.san);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Sardinian_language">Sardinian</a>
     */
    sc()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.srd);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Sindhi_language">Sindhi</a>
     */
    sd()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.snd);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Northern_Sami">Northern Sami</a>
     */
    se()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.sme);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Sango_language">Sango</a>
     */
    sg()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.sag);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Sinhala_language">Sinhala</a>
     */
    si()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.sin);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Slovak_language">Slovak</a>
     */
    sk()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.slk, LanguageAlpha3Code.slo);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Slovene_language">Slovene</a>
     */
    sl()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.slv);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Samoan_language">Samoan</a>
     */
    sm()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.smo);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Shona_language">Shona</a>
     */
    sn()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.sna);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Somali_language">Somali</a>
     */
    so()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.som);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Albanian_language">Albanian</a>
     */
    sq()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.sqi, LanguageAlpha3Code.alb);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Serbian_language">Serbian</a>
     */
    sr()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.srp);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Swati_language">Swati</a>
     */
    ss()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.ssw);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Sotho_language">Southern Sotho</a>
     */
    st()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.sot);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Sundanese_language">Sundanese</a>
     */
    su()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.sun);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Swedish_language">Swedish</a>
     */
    sv()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.swe);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Swahili_language">Swahili</a>
     */
    sw()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.swa);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Tamil_language">Tamil</a>
     */
    ta()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.tam);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Telugu_language">Telugu</a>
     */
    te()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.tel);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Tajik_language">Tajik</a>
     */
    tg()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.tgk);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Thai_language">Thai</a>
     */
    th()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.tha);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Tigrinya_language">Tigrinya</a>
     */
    ti()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.tir);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Turkmen_language">Turkmen</a>
     */
    tk()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.tuk);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Tagalog_language">Tagalog</a>
     */
    tl()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.tgl);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Tswana_language">Tswana</a>
     */
    tn()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.tsn);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Tongan_language">Tongan</a>
     */
    to()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.ton);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Turkish_language">Turkish</a>
     */
    tr()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.tur);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Tsonga_language">Tsonga</a>
     */
    ts()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.tso);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Tatar_language">Tatar</a>
     */
    tt()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.tat);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Twi">Twi</a>
     */
    tw()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.twi);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Tahitian_language">Tahitian</a>
     */
    ty()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.tah);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Uyghur_language">Uighur</a>
     */
    ug()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.uig);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Ukrainian_language">Ukrainian</a>
     */
    uk()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.ukr);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Urdu">Urdu</a>
     */
    ur()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.urd);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Uzbek_language">Uzbek</a>
     */
    uz()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.uzb);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Venda_language">Venda</a>
     */
    ve()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.ven);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Vietnamese_language">Vietnamese</a>
     */
    vi()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.vie);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Volap%C3%BCk">Volap&uuml;k</a>
     */
    vo()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.vol);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Walloon_language">Walloon</a>
     */
    wa()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.wln);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Wolof_language">Wolof</a>
     */
    wo()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.wol);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Xhosa_language">Xhosa</a>
     */
    xh()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.xho);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Yiddish_language">Yiddish</a>
     */
    yi()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.yid);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Yoruba_language">Yoruba</a>
     */
    yo()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.yor);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Zhuang_languages">Zhuang</a>
     */
    za()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.zha);
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Chinese_language">Chinese</a>
     */
    zh()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.zho, LanguageAlpha3Code.chi);
        }


        @Override
        public Locale toLocale()
        {
            return Locale.CHINESE;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Zulu_language">Zulu</a>
     */
    zu()
    {
        @Override
        public List<LanguageAlpha3Code> getAlpha3()
        {
            return createList(LanguageAlpha3Code.zul);
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
        return getAlpha3().get(0).getName();
    }


    /**
     * Convert this LanguageCode instance to a {@link Locale} instance.
     *
     * <p>
     * In most cases, this method creates a new Locale instance
     * every time it is called, but some LanguageCode instances return
     * their corresponding entries in Locale class. For example,
     * {@link #ja LanguageCode.ja} always returns {@link Locale#JAPANESE}.
     * </p>
     *
     * <p>
     * The table below lists LanguageCode entries whose toLocale()
     * do not create new Locale instances but return entries in
     * Locale class.
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
     *         A Locale instance that matches this LanguageCode.
     */
    public Locale toLocale()
    {
        return new Locale(name());
    }


    /**
     * Get <a href="http://en.wikipedia.org/wiki/ISO_639-2">ISO 639-2</a>
     * language code(s) (3-letter lowercase code(s)).
     *
     * <p>
     * In most cases, the size of the returned list is one. On the other
     * hand, there are some languages having two 3-letter language codes.
     * They are known as "bibliographic" code (ISO 639-2/B) and
     * "terminological" code (ISO 639-2/T). When this method returns a
     * list of size 2, the first element is a terminological code and
     * the second element is a bibliographic code.  
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
     *         language code(s).
     *
     * @since 1.1
     */
    public List<LanguageAlpha3Code> getAlpha3()
    {
        return null;
    }


    /**
     * Get a LanguageCode that corresponds to a given
     * <a href="http://en.wikipedia.org/wiki/ISO_639-1">ISO 639-1</a> code
     * (2-letter lowercase code) or
     * <a href="http://en.wikipedia.org/wiki/ISO_639-2">ISO 639-2</a> code
     * (3-letter lowercase code).
     *
     * <p>
     * This method calls {@link #getByCode(String, boolean)
     * getByCode}(code, false), meaning the case of the given
     * code is ignored.
     * </p>
     *
     * @param code
     *         An <a href="http://en.wikipedia.org/wiki/ISO_639-1">ISO 639-1</a>
     *         code (2-letter lowercase code) or an
     *         <a href="http://en.wikipedia.org/wiki/ISO_639-2">ISO 639-2</a> code
     *         (3-letter lowercase code).
     *         Note that if the given code is one of legacy language codes
     *         ("iw", "ji" and "in"), it is treated as its official counterpart
     *         ("he", "yi" and "id", respectively). For example, if "in" is given,
     *         this method returns {@link #id LanguageCode.id}.
     *
     * @return
     *         A LanguageCode instance, or null if not found.
     */
    public static LanguageCode getByCode(String code)
    {
        return getByCode(code, false);
    }


    /**
     * Get a LanguageCode that corresponds to a given
     * <a href="http://en.wikipedia.org/wiki/ISO_639-1">ISO 639-1</a> code
     * (2-letter lowercase code) or
     * <a href="http://en.wikipedia.org/wiki/ISO_639-2">ISO 639-2</a> code
     * (3-letter lowercase code).
     *
     * @param code
     *         An <a href="http://en.wikipedia.org/wiki/ISO_639-1">ISO 639-1</a>
     *         code (2-letter lowercase code) or an
     *         <a href="http://en.wikipedia.org/wiki/ISO_639-2">ISO 639-2</a> code
     *         (3-letter lowercase code).
     *         Note that if the given code is one of legacy language codes
     *         ("iw", "ji" and "in"), it is treated as its official counterpart
     *         ("he", "yi" and "id", respectively). For example, if "in" is given,
     *         this method returns {@link #id LanguageCode.id}.
     *
     * @param caseSensitive
     *         If true, the given code should consist of lowercase letters only.
     *         If false, this method internally canonicalizes the given code by
     *         {@link String#toLowerCase()} and then performs search. For example,
     *         {@code getByCode("JA", true)} returns null, but on the other hand,
     *         {@code getByCode("JA", false)} returns {@link #ja LanguageCode.ja}.
     *
     * @return
     *         A LanguageCode instance, or null if not found.
     */
    public static LanguageCode getByCode(String code, boolean caseSensitive)
    {
        code = canonicalize(code, caseSensitive);

        if (code == null)
        {
            return null;
        }

        if (code.length() == 2)
        {
            return getByEnumName(code);
        }

        if (code.length() != 3)
        {
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
     * Get a LanguageCode that corresponds to the language code of
     * the given {@link Locale} instance.
     *
     * @param locale
     *         A Locale instance.
     *
     * @return
     *         A LanguageCode instance, or null if not found.
     *
     * @see Locale#getLanguage()
     */
    public static LanguageCode getByLocale(Locale locale)
    {
        if (locale == null)
        {
            return null;
        }

        // Locale.getLanguage() returns either an empty string or
        // a lowercase ISO 639 code.
        return getByCode(locale.getLanguage(), true);
    }


    /**
     * Canonicalize the given language code.
     *
     * <ol>
     * <li>If the given code is null or an empty string, null is returned.
     * <li>Otherwise, if the given code matches one of three legacy
     *     language code ("iw", "ji" and "in"), its official counterpart
     *     ("he", "yi" and "id", respectively) is returned. Note that
     *     String.equals(Object) is used for comparison if caseSensitive
     *     is true and that String.equalsIgnoreCase(String) is used if
     *     caseSensitive is false.
     * <li>Otherwise, if caseSensitive is true, the given code is returned
     *     as is.
     * <li>Otherwise, code.toLowercase() is returned.
     * </ol>
     *
     * @param code
     *         ISO 639-1 code.
     *
     * @param caseSensitive
     *         True if the code should be handled case-sensitively.
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


    private static List<LanguageAlpha3Code> createList(LanguageAlpha3Code alpha3)
    {
        List<LanguageAlpha3Code> list = new ArrayList<LanguageAlpha3Code>(1);

        list.add(alpha3);

        return Collections.unmodifiableList(list);
    }


    private static List<LanguageAlpha3Code> createList(LanguageAlpha3Code alpha3T, LanguageAlpha3Code alpha3B)
    {
        List<LanguageAlpha3Code> list = new ArrayList<LanguageAlpha3Code>(2);

        list.add(alpha3T);
        list.add(alpha3B);

        return Collections.unmodifiableList(list);
    }
}
