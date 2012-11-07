/*
 * Copyright (C) 2012 Neo Visionaries Inc.
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


/**
 * <a href="http://en.wikipedia.org/wiki/ISO_639-2">ISO 639-2</a>
 * language code (3-letter lowercase code).
 *
 * <p>
 * Most languages have just one ISO 639-2 code, but there are some
 * languages that have 2 codes, ISO 639-2/T code ("terminological" code)
 * and ISO 639-2/B code ("bibliographic" code). The table below
 * list up langueses having two ISO 639-2 codes.
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
 *   <td>{@link LanguageAlpha3Code#per per}</td>
 *   <td>{@link LanguageAlpha3Code#fas fas}</td>
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
 * @since 1.1
 * @author Takahiko Kawasaki
 */
public enum LanguageAlpha3Code
{
    /**
     * <a href="http://en.wikipedia.org/wiki/Afar_language">Afar</a>
     * ({@link LanguageCode#aa aa}).
     */
    aar("Afar", LanguageCode.aa),

    /**
     * <a href="http://en.wikipedia.org/wiki/Abkhaz_language">Abkhaz</a>
     * ({@link LanguageCode#ab ab}).
     */
    abk("Abkhaz", LanguageCode.ab),

    /**
     * <a href="http://en.wikipedia.org/wiki/Afrikaans_language">Afrikaans</a>
     * ({@link LanguageCode#af af}).
     */
    afr("Afrikaans", LanguageCode.af),

    /**
     * <a href="http://en.wikipedia.org/wiki/Akan_language">Akan</a>
     * ({@link LanguageCode#ak ak}).
     */
    aka("Akan", LanguageCode.ak),

    /**
     * <a href="http://en.wikipedia.org/wiki/Albanian_language">Albanian</a>
     * ({@link LanguageCode#sq sq}) for bibliographic applications.
     *
     * @see #sqi
     */
    alb("Albanian", LanguageCode.sq, Usage.BIBLIOGRAPHY)
    {
        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return sqi;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Amharic_language">Amharic</a>
     * ({@link LanguageCode#am am}).
     */
    amh("Amharic", LanguageCode.am),

    /**
     * <a href="http://en.wikipedia.org/wiki/Arabic_language">Arabic</a>
     * ({@link LanguageCode#ar ar}).
     */
    ara("Arabic", LanguageCode.ar),

    /**
     * <a href="http://en.wikipedia.org/wiki/Aragonese_language">Aragonese</a>
     * ({@link LanguageCode#an an}).
     */
    arg("Aragonese", LanguageCode.an),

    /**
     * <a href="http://en.wikipedia.org/wiki/Armenian_language">Armenian</a>
     * ({@link LanguageCode#hy hy}) for bibliographic applications.
     *
     * @see #hye
     */
    arm("Armenian", LanguageCode.hy, Usage.BIBLIOGRAPHY)
    {
        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return hye;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Assamese_language">Assamese</a>
     * ({@link LanguageCode#as as}).
     */
    asm("Assamese", LanguageCode.as),

    /**
     * <a href="http://en.wikipedia.org/wiki/Avar_language">Avaric</a>
     * ({@link LanguageCode#av av}).
     */
    ava("Avaric", LanguageCode.av),

    /**
     * <a href="http://en.wikipedia.org/wiki/Avestan_language">Avestan</a>
     * ({@link LanguageCode#ae ae}).
     */
    ave("Avestan", LanguageCode.ae),

    /**
     * <a href="http://en.wikipedia.org/wiki/Aymara_language">Aymara</a>
     * ({@link LanguageCode#ay ay}).
     */
    aym("Aymara", LanguageCode.ay),

    /**
     * <a href="http://en.wikipedia.org/wiki/Azerbaijani_language">Azerbaijani</a>
     * ({@link LanguageCode#az az}).
     */
    aze("Azerbaijani", LanguageCode.az),

    /**
     * <a href="http://en.wikipedia.org/wiki/Bashkir_language">Bashkir</a>
     * ({@link LanguageCode#ba ba}).
     */
    bak("Bashkir", LanguageCode.ba),

    /**
     * <a href="http://en.wikipedia.org/wiki/Bambara_language">Bambara</a>
     * ({@link LanguageCode#bm bm}).
     */
    bam("Bambara", LanguageCode.bm),

    /**
     * <a href="http://en.wikipedia.org/wiki/Basque_language">Basque</a>
     * ({@link LanguageCode#eu eu}) for bibliographic applications.
     *
     * @see #eus
     */
    baq("Basque", LanguageCode.eu, Usage.BIBLIOGRAPHY)
    {
        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return eus;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Belarusian_language">Belarusian</a>
     * ({@link LanguageCode#be be}).
     */
    bel("Belarusian", LanguageCode.be),

    /**
     * <a href="http://en.wikipedia.org/wiki/Bengali_language">Bengali</a>
     * ({@link LanguageCode#bn bn}).
     */
    ben("Bengali", LanguageCode.bn),

    /**
     * <a href="http://en.wikipedia.org/wiki/Bihari_languages">Bihari</a>
     * ({@link LanguageCode#bh bh}).
     */
    bih("Bihari languages", LanguageCode.bh),

    /**
     * <a href="http://en.wikipedia.org/wiki/Bislama_language">Bislama</a>
     * ({@link LanguageCode#bi bi}).
     */
    bis("Bislama", LanguageCode.bi),

    /**
     * <a href="http://en.wikipedia.org/wiki/Standard_Tibetan">Tibetan</a>
     * ({@link LanguageCode#bo bo}) for terminology applications.
     *
     * @see #tib
     */
    bod("Tibetan", LanguageCode.bo, Usage.TERMINOLOGY)
    {
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
    bos("Bosnian", LanguageCode.bs),

    /**
     * <a href="http://en.wikipedia.org/wiki/Breton_language">Breton</a>
     * ({@link LanguageCode#br br}).
     */
    bre("Breton", LanguageCode.br),

    /**
     * <a href="http://en.wikipedia.org/wiki/Bulgarian_language">Bulgarian</a>
     * ({@link LanguageCode#bg bg}).
     */
    bul("Bulgarian", LanguageCode.bg),

    /**
     * <a href="http://en.wikipedia.org/wiki/Burmese_language">Burmese</a>
     * ({@link LanguageCode#my my}) for bibliographic applications.
     *
     * @see #mya
     */
    bur("Burmese", LanguageCode.my, Usage.BIBLIOGRAPHY)
    {
        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return mya;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Catalan_language">Catalan</a>
     * ({@link LanguageCode#ca ca}).
     */
    cat("Catalan", LanguageCode.ca),

    /**
     * <a href="http://en.wikipedia.org/wiki/Czech_language">Czech</a>
     * ({@link LanguageCode#cs cs}) for terminology applications.
     *
     * @see #cze
     */
    ces("Czech", LanguageCode.cs, Usage.TERMINOLOGY)
    {
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
    cha("Chamorro", LanguageCode.ch),

    /**
     * <a href="http://en.wikipedia.org/wiki/Chechen_language">Chechen</a>
     * ({@link LanguageCode#ce ce}).
     */
    che("Chechen", LanguageCode.ce),

    /**
     * <a href="http://en.wikipedia.org/wiki/Chinese_language">Chinese</a>
     * ({@link LanguageCode#zh zh}) for bibliographic applications.
     *
     * @see #zho
     */
    chi("Chinese", LanguageCode.zh, Usage.BIBLIOGRAPHY)
    {
        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return zho;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Old_Church_Slavonic">Church Slavonic</a>
     * ({@link LanguageCode#cu cu}).
     */
    chu("Church Slavic", LanguageCode.cu),

    /**
     * <a href="http://en.wikipedia.org/wiki/Chuvash_language">Chuvash</a>
     * ({@link LanguageCode#cv cv}).
     */
    chv("Chuvash", LanguageCode.cv),

    /**
     * <a href="http://en.wikipedia.org/wiki/Cornish_language">Cornish</a>
     * ({@link LanguageCode#kw kw}).
     */
    cor("Comish", LanguageCode.kw),

    /**
     * <a href="http://en.wikipedia.org/wiki/Corsican_language">Corsican</a>
     * ({@link LanguageCode#co co}).
     */
    cos("Corsican", LanguageCode.co),

    /**
     * <a href="http://en.wikipedia.org/wiki/Cree_language">Cree</a>
     * ({@link LanguageCode#cr cr}).
     */
    cre("Cree", LanguageCode.cr),

    /**
     * <a href="http://en.wikipedia.org/wiki/Welsh_language">Welsh</a>
     * ({@link LanguageCode#cy cy}) for terminology applications.
     *
     * @see #wel
     */
    cym("Welsh", LanguageCode.cy, Usage.TERMINOLOGY)
    {
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
    cze("Czech", LanguageCode.cs, Usage.BIBLIOGRAPHY)
    {
        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return ces;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Danish_language">Danish</a>
     * {@link LanguageCode#da da}).
     */
    dan("Danish", LanguageCode.da),

    /**
     * <a href="http://en.wikipedia.org/wiki/German_language">German</a>
     * ({@link LanguageCode#de de}) for terminology applications.
     *
     * @see #ger
     */
    deu("German", LanguageCode.de, Usage.TERMINOLOGY)
    {
        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return ger;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Dhivehi_language">Dhivehi</a>
     * ({@link LanguageCode#dv dv}).
     */
    div("Dhivehi", LanguageCode.dv),

    /**
     * <a href="http://en.wikipedia.org/wiki/Dutch_language">Dutch</a>
     * ({@link LanguageCode#nl nl}) for bibliography applications.
     *
     * @see #nld
     */
    dut("Dutch", LanguageCode.nl, Usage.BIBLIOGRAPHY)
    {
        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return nld;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Dzongkha_language">Dzongkha</a>
     * ({@link LanguageCode#dz dz}).
     */
    dzo("Dzongkha", LanguageCode.dz),

    /**
     * <a href="http://en.wikipedia.org/wiki/Greek_language">Greek</a>
     * ({@link LanguageCode#el el}) for terminology applications.
     *
     * #gre
     */
    ell("Greek", LanguageCode.el, Usage.TERMINOLOGY)
    {
        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return gre;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/English_language">English</a>
     * ({@link LanguageCode#en en}).
     */
    eng("English", LanguageCode.en),

    /**
     * <a href="http://en.wikipedia.org/wiki/Esperanto">Esperanto</a>
     * ({@link LanguageCode#eo eo}).
     */
    epo("Esperanto", LanguageCode.eo),

    /**
     * <a href="http://en.wikipedia.org/wiki/Estonian_language">Estonian</a>
     * ({@link LanguageCode#et et}).
     */
    est("Estonian", LanguageCode.et),

    /**
     * <a href="http://en.wikipedia.org/wiki/Basque_language">Basque</a>
     * ({@link LanguageCode#eu eu}) for terminology applications.
     *
     * @see #baq
     */
    eus("Basque", LanguageCode.eu, Usage.TERMINOLOGY)
    {
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
    ewe("Ewe", LanguageCode.ee),

    /**
     * <a href="http://en.wikipedia.org/wiki/Faroese_language">Faroese</a>
     * ({@link LanguageCode#fo fo}).
     */
    fao("Faroese", LanguageCode.fo),

    /**
     * <a href="http://en.wikipedia.org/wiki/Persian_language">Persian</a>
     * ({@link LanguageCode#fa fa}) for bibliographic applications.
     *
     * @see #per
     */
    fas("Persian", LanguageCode.fa, Usage.BIBLIOGRAPHY)
    {
        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return per;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Fijian_language">Fijian</a>
     * ({@link LanguageCode#fj fj}).
     */
    fij("Fijian", LanguageCode.fj),

    /**
     * <a href="http://en.wikipedia.org/wiki/Finnish_language">Finnish</a>
     * ({@link LanguageCode#fi fi}).
     */
    fin("Finnish", LanguageCode.fi),

    /**
     * <a href="http://en.wikipedia.org/wiki/French_language">French</a>
     * ({@link LanguageCode#fr fr}) for terminology applications.
     *
     * #fre
     */
    fra("French", LanguageCode.fr, Usage.TERMINOLOGY)
    {
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
     * #fra
     */
    fre("French", LanguageCode.fr, Usage.BIBLIOGRAPHY)
    {
        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return fra;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/West_Frisian_language">West Frisian</a>
     * ({@link LanguageCode#fy fy}).
     */
    fry("West Frisian", LanguageCode.fy),

    /**
     * <a href="http://en.wikipedia.org/wiki/Fula_language">Fula</a>
     * ({@link LanguageCode#ff ff}).
     */
    ful("Fula", LanguageCode.ff),

    /**
     * <a href="http://en.wikipedia.org/wiki/Georgian_language">Georgian</a>
     * ({@link LanguageCode#ka ka}) for bibliographic applications.
     *
     * @see #kat
     */
    geo("Georgian", LanguageCode.ka, Usage.BIBLIOGRAPHY)
    {
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
    ger("German", LanguageCode.de, Usage.BIBLIOGRAPHY)
    {
        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return deu;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Scottish_Gaelic_language">Scottish Gaelic</a>
     * ({@link LanguageCode#gd gd}).
     */
    gla("Scottish Gaelic", LanguageCode.gd),

    /**
     * <a href="http://en.wikipedia.org/wiki/Irish_language">Irish</a>
     * ({@link LanguageCode#ga ga}).
     */
    gle("Irish", LanguageCode.ga),

    /**
     * <a href="http://en.wikipedia.org/wiki/Galician_language">Galician</a>
     * ({@link LanguageCode#gl gl}).
     */
    glg("Galician", LanguageCode.gl),

    /**
     * <a href="http://en.wikipedia.org/wiki/Manx_language">Manx</a>
     * ({@link LanguageCode#gv gv}).
     */
    glv("Manx", LanguageCode.gv),

    /**
     * <a href="http://en.wikipedia.org/wiki/Greek_language">Greek</a>
     * ({@link LanguageCode#el el}) for bibliographic applications.
     *
     * #ell
     */
    gre("Greek", LanguageCode.el, Usage.BIBLIOGRAPHY)
    {
        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return ell;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Guaran%C3%AD_language">Guaran&iacute;</a>
     * ({@link LanguageCode#gn gn}).
     */
    grn("Guaran\u00ED", LanguageCode.gn),

    /**
     * <a href="http://en.wikipedia.org/wiki/Gujarati_language">Gujarati</a>
     * ({@link LanguageCode#gu gu}).
     */
    guj("Gujarati", LanguageCode.gu),

    /**
     * <a href="http://en.wikipedia.org/wiki/Haitian_Creole_language">Haitian</a>
     * ({@link LanguageCode#ht ht}).
     */
    hat("Haitian", LanguageCode.ht),

    /**
     * <a href="http://en.wikipedia.org/wiki/Hausa_language">Hausa</a>
     * ({@link LanguageCode#ha ha}).
     */
    hau("Hausa", LanguageCode.ha),

    /**
     * <a href="http://en.wikipedia.org/wiki/Hebrew_language">Hebrew</a>
     * ({@link LanguageCode#he he}).
     */
    heb("Hebrew", LanguageCode.he),

    /**
     * <a href="http://en.wikipedia.org/wiki/Herero_language">Herero</a>
     * ({@link LanguageCode#hz hz}).
     */
    her("Herero", LanguageCode.hz),

    /**
     * <a href="http://en.wikipedia.org/wiki/Hindi">Hindi</a>
     * ({@link LanguageCode#hi hi}).
     */
    hin("Hindi", LanguageCode.hi),

    /**
     * <a href="http://en.wikipedia.org/wiki/Hiri_Motu_language">Hiri Motu</a>
     * ({@link LanguageCode#ho ho}).
     */
    hmo("Hiri Motu", LanguageCode.ho),

    /**
     * <a href="http://en.wikipedia.org/wiki/Croatian_language">Croatian</a>
     * ({@link LanguageCode#hr hr}).
     */
    hrv("Croatian", LanguageCode.hr),

    /**
     * <a href="http://en.wikipedia.org/wiki/Hungarian_language">Hungarian</a>
     * ({@link LanguageCode#hu hu}).
     */
    hun("Hungarian", LanguageCode.hu),

    /**
     * <a href="http://en.wikipedia.org/wiki/Armenian_language">Armenian</a>
     * ({@link LanguageCode#hy hy}) for terminology applications.
     *
     * @see #arm
     */
    hye("Armenian", LanguageCode.hy, Usage.TERMINOLOGY)
    {
        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return arm;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Igbo_language">Igbo</a>
     * ({@link LanguageCode#ig ig}).
     */
    ibo("Igbo", LanguageCode.ig),

    /**
     * <a href="http://en.wikipedia.org/wiki/Icelandic_language">Icelandic</a>
     * ({@link LanguageCode#is is}) for biblioraphic applications.
     *
     * @see #isl
     */
    ice("Icelandic", LanguageCode.is, Usage.BIBLIOGRAPHY)
    {
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
    ido("Ido", LanguageCode.io),

    /**
     * <a href="http://en.wikipedia.org/wiki/Nuosu_language">Nuosu</a>
     * ({@link LanguageCode#ii ii}).
     */
    iii("Nuosu", LanguageCode.ii),

    /**
     * <a href="http://en.wikipedia.org/wiki/Inuktitut">Inuktitut</a>
     * ({@link LanguageCode#iu iu}).
     */
    iku("Inuktitut", LanguageCode.iu),

    /**
     * <a href="http://en.wikipedia.org/wiki/Interlingue_language">Interlingue</a>
     * ({@link LanguageCode#ie ie}).
     */
    ile("Interlingue", LanguageCode.ie),

    /**
     * <a href="http://en.wikipedia.org/wiki/Interlingua">Interlingua</a>
     * {@link LanguageCode#ia ia}).
     */
    ina("Interlingua", LanguageCode.ia),

    /**
     * <a href="http://en.wikipedia.org/wiki/Indonesian_language">Indonesian</a>
     * ({@link LanguageCode#id id}).
     */
    ind("Indonesian", LanguageCode.id),

    /**
     * <a href="http://en.wikipedia.org/wiki/Inupiaq_language">Inupiaq</a>
     * ({@link LanguageCode#ik ik}).
     */
    ipk("Inupiaq", LanguageCode.ik),

    /**
     * <a href="http://en.wikipedia.org/wiki/Icelandic_language">Icelandic</a>
     * ({@link LanguageCode#is is}) for terminology applications.
     *
     * @see #ice
     */
    isl("Icelandic", LanguageCode.is, Usage.TERMINOLOGY)
    {
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
    ita("Italian", LanguageCode.it),

    /**
     * <a href="http://en.wikipedia.org/wiki/Javanese_language">Javanese</a>
     * ({@link LanguageCode#jv jv}).
     */
    jav("Javanese", LanguageCode.jv),

    /**
     * <a href="http://en.wikipedia.org/wiki/Japanese_language">Japanese</a>
     * ({@link LanguageCode#ja ja}).
     */
    jpn("Japanese", LanguageCode.ja),

    /**
     * <a href="http://en.wikipedia.org/wiki/Kalaallisut_language">Kalaallisut</a>
     * ({@link LanguageCode#kl kl}).
     */
    kal("Kalaallisut", LanguageCode.kl),

    /**
     * <a href="http://en.wikipedia.org/wiki/Kannada_language">Kannada</a>
     * ({@link LanguageCode#kn kn}).
     */
    kan("Kannada", LanguageCode.kn),

    /**
     * <a href="http://en.wikipedia.org/wiki/Kashmiri_language">Kashmiri</a>
     * ({@link LanguageCode#ks ks}).
     */
    kas("Kashmiri", LanguageCode.ks),

    /**
     * <a href="http://en.wikipedia.org/wiki/Georgian_language">Georgian</a>
     * ({@link LanguageCode#ka ka}) for terminology applications.
     *
     * @see #geo
     */
    kat("Georgian", LanguageCode.ka, Usage.TERMINOLOGY)
    {
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
    kau("Kanuri", LanguageCode.kr),

    /**
     * <a href="http://en.wikipedia.org/wiki/Kazakh_language">Kazakh</a>
     * ({@link LanguageCode#kk kk}).
     */
    kaz("Kazakh", LanguageCode.kk),

    /**
     * <a href="http://en.wikipedia.org/wiki/Khmer_language">Khmer</a>
     * ({@link LanguageCode#km km}).
     */
    khm("Central Khmer", LanguageCode.km),

    /**
     * <a href="http://en.wikipedia.org/wiki/Gikuyu_language">Kikuyu</a>
     * ({@link LanguageCode#ki ki}).
     */
    kik("Kikuyu", LanguageCode.ki),

    /**
     * <a href="http://en.wikipedia.org/wiki/Kinyarwanda">Kinyarwanda</a>
     * ({@link LanguageCode#rw rw}).
     */
    kin("Kinyarwanda", LanguageCode.rw),

    /**
     * <a href="http://en.wikipedia.org/wiki/Kyrgyz_language">Kyrgyz</a>
     * ({@link LanguageCode#ky ky}).
     */
    kir("Kirghiz", LanguageCode.ky),

    /**
     * <a href="http://en.wikipedia.org/wiki/Komi_language">Komi</a>
     * ({@link LanguageCode#kv kv}).
     */
    kom("Komi", LanguageCode.kv),

    /**
     * <a href="http://en.wikipedia.org/wiki/Kongo_language">Kongo</a>
     * ({@link LanguageCode#kg kg}).
     */
    kon("Kongo", LanguageCode.kg),

    /**
     * <a href="http://en.wikipedia.org/wiki/Korean_language">Korean</a>
     * ({@link LanguageCode#ko ko}).
     */
    kor("Korean", LanguageCode.ko),

    /**
     * <a href="http://en.wikipedia.org/wiki/Kwanyama">Kwanyama</a>
     * ({@link LanguageCode#kj kj}).
     */
    kua("Kuanyama", LanguageCode.kj),

    /**
     * <a href="http://en.wikipedia.org/wiki/Kurdish_language">Kurdish</a>
     * ({@link LanguageCode#ku ku}).
     */
    kur("Kurdish", LanguageCode.ku),

    /**
     * <a href="http://en.wikipedia.org/wiki/Lao_language">Lao</a>
     * ({@link LanguageCode#lo lo}).
     */
    lao("Lao", LanguageCode.lo),

    /**
     * <a href="http://en.wikipedia.org/wiki/Latin">Latin</a>
     * ({@link LanguageCode#la la}).
     */
    lat("Latin", LanguageCode.la),

    /**
     * <a href="http://en.wikipedia.org/wiki/Latvian_language">Latvian</a>
     * ({@link LanguageCode#lv lv}).
     */
    lav("Latvian", LanguageCode.lv),

    /**
     * <a href="http://en.wikipedia.org/wiki/Limburgish_language">Limburgish</a>
     * ({@link LanguageCode#li li}).
     */
    lim("Limburgan", LanguageCode.li),

    /**
     * <a href="http://en.wikipedia.org/wiki/Lingala_language">Lingala</a>
     * ({@link LanguageCode#ln ln}).
     */
    lin("Lingala", LanguageCode.ln),

    /**
     * <a href="http://en.wikipedia.org/wiki/Lithuanian_language">Lithuanian</a>
     * ({@link LanguageCode#lt lt}).
     */
    lit("Lithuanian", LanguageCode.lt),

    /**
     * <a href="http://en.wikipedia.org/wiki/Luxembourgish_language">Luxembourgish</a>
     * ({@link LanguageCode#lb lb}).
     */
    ltz("Luxembourgish", LanguageCode.lb),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tshiluba_language">Luba-Katanga</a>
     * ({@link LanguageCode#lu lu}).
     */
    lub("Luba-Katanga", LanguageCode.lu),

    /**
     * <a href="http://en.wikipedia.org/wiki/Luganda">Ganda</a>
     * ({@link LanguageCode#lg lg}).
     */
    lug("Ganda", LanguageCode.lg),

    /**
     * <a href="http://en.wikipedia.org/wiki/Macedonian_language">Macedonian</a>
     * ({@link LanguageCode#mk mk}) for bibliographic applications.
     *
     * @see #mkd
     */
    mac("Macedonian", LanguageCode.mk, Usage.BIBLIOGRAPHY)
    {
        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return mkd;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Marshallese_language">Marshallese</a>
     * ({@link LanguageCode#mh mh}).
     */
    mah("Marshallese", LanguageCode.mh),

    /**
     * <a href="http://en.wikipedia.org/wiki/Malayalam_language">Malayalam</a>
     * ({@link LanguageCode#ml ml}).
     */
    mal("Malayalam", LanguageCode.ml),

    /**
     * <a href="http://en.wikipedia.org/wiki/M%C4%81ori_language">M&#257;ori</a>
     * ({@link LanguageCode#mi mi}) for bibliographic applications.
     *
     * @see #mri
     */
    mao("M\u0101ori", LanguageCode.mi, Usage.BIBLIOGRAPHY)
    {
        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return mri;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Marathi_language">Marathi</a>
     * ({@link LanguageCode#mr mr}).
     */
    mar("Marathi", LanguageCode.mr),

    /**
     * <a href="http://en.wikipedia.org/wiki/Malay_language">Malay</a>
     * ({@link LanguageCode#ms ms}) for bibliographic applications.
     *
     * @see #msa
     */
    may("Malay", LanguageCode.ms, Usage.BIBLIOGRAPHY)
    {
        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return msa;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Macedonian_language">Macedonian</a>
     * ({@link LanguageCode#mk mk}) for terminology applications.
     *
     * @see #mac
     */
    mkd("Macedonian", LanguageCode.mk, Usage.TERMINOLOGY)
    {
        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return mac;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Malagasy_language">Malagasy</a>
     * ({@link LanguageCode#mg mg}).
     */
    mlg("Malagasy", LanguageCode.mg),

    /**
     * <a href="http://en.wikipedia.org/wiki/Maltese_language">Maltese</a>
     * ({@link LanguageCode#mt mt}).
     */
    mlt("Maltese", LanguageCode.mt),

    /**
     * <a href="http://en.wikipedia.org/wiki/Mongolian_language">Mongolian</a>
     * ({@link LanguageCode#mn mn}).
     */
    mon("Mongolian", LanguageCode.mn),

    /**
     * <a href="http://en.wikipedia.org/wiki/M%C4%81ori_language">M&#257;ori</a>
     * ({@link LanguageCode#mi mi}) for terminology applications.
     *
     * @see #mao
     */
    mri("M\u0101ori", LanguageCode.mi, Usage.TERMINOLOGY)
    {
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
    msa("Malay", LanguageCode.ms, Usage.TERMINOLOGY)
    {
        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return may;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Burmese_language">Burmese</a>
     * ({@link LanguageCode#my my}) for terminology applications.
     *
     * @see #bur
     */
    mya("Burmese", LanguageCode.my, Usage.TERMINOLOGY)
    {
        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return bur;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Nauruan_language">Nauru</a>
     * ({@link LanguageCode#na na}).
     */
    nau("Nauru", LanguageCode.na),

    /**
     * <a href="http://en.wikipedia.org/wiki/Navajo_language">Navajo</a>
     * ({@link LanguageCode#nv nv}).
     */
    nav("Navajo", LanguageCode.nv),

    /**
     * <a href="http://en.wikipedia.org/wiki/Southern_Ndebele_language">Southern Ndebele</a>
     * ({@link LanguageCode#nr nr}).
     */
    nbl("South Ndebele", LanguageCode.nr),

    /**
     * <a href="http://en.wikipedia.org/wiki/Northern_Ndebele_language">Northern Ndebele</a>
     * ({@link LanguageCode#nd nd}).
     */
    nde("North Ndebele", LanguageCode.nd),

    /**
     * <a href="http://en.wikipedia.org/wiki/Ndonga">Ndonga</a>
     * ({@link LanguageCode#ng ng}).
     */
    ndo("Ndonga", LanguageCode.ng),

    /**
     * <a href="http://en.wikipedia.org/wiki/Nepali_language">Nepali</a>
     * ({@link LanguageCode#ne ne}).
     */
    nep("Nepali", LanguageCode.ne),

    /**
     * <a href="http://en.wikipedia.org/wiki/Dutch_language">Dutch</a>
     * ({@link LanguageCode#nl nl}) for terminology applications.
     *
     * @see #dut
     */
    nld("Dutch", LanguageCode.nl, Usage.TERMINOLOGY)
    {
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
    nno("Norwegian Nynorsk", LanguageCode.nn),

    /**
     * <a href="http://en.wikipedia.org/wiki/Bokm%C3%A5l">Norwegian Bokm&aring;l</a>
     * ({@link LanguageCode#nb nb}).
     */
    nob("Norwegian Bokm\u00E5l", LanguageCode.nb),

    /**
     * <a href="http://en.wikipedia.org/wiki/Norwegian_language">Norwegian</a>
     * ({@link LanguageCode#no no}).
     */
    nor("Norwegian", LanguageCode.no),

    /**
     * <a href="http://en.wikipedia.org/wiki/Chichewa_language">Chichewa</a>
     * ({@link LanguageCode#ny ny}).
     */
    nya("Nyanja", LanguageCode.ny),

    /**
     * <a href="http://en.wikipedia.org/wiki/Occitan_language">Occitan</a>
     * ({@link LanguageCode#oc oc}).
     */
    oci("Occitan", LanguageCode.oc),

    /**
     * <a href="http://en.wikipedia.org/wiki/Ojibwe_language">Ojibwe</a>
     * ({@link LanguageCode#oj oj}).
     */
    oji("Ojibwa", LanguageCode.oj),

    /**
     * <a href="http://en.wikipedia.org/wiki/Oriya_language">Oriya</a>
     * ({@link LanguageCode#or or}).
     */
    ori("Oriya", LanguageCode.or),

    /**
     * <a href="http://en.wikipedia.org/wiki/Oromo_language">Oromo</a>
     * ({@link LanguageCode#om om}).
     */
    orm("Oromo", LanguageCode.om),

    /**
     * <a href="http://en.wikipedia.org/wiki/Ossetic_language">Ossetian</a>
     * ({@link LanguageCode#os os}).
     */
    oss("Ossetian", LanguageCode.os),

    /**
     * <a href="http://en.wikipedia.org/wiki/Punjabi_language">Punjabi</a>
     * ({@link LanguageCode#pa pa}).
     */
    pan("Panjabi", LanguageCode.pa),

    /**
     * <a href="http://en.wikipedia.org/wiki/Persian_language">Persian</a>
     * ({@link LanguageCode#fa fa}) for terminology applications.
     *
     * @see #fas
     */
    per("Persian", LanguageCode.fa, Usage.TERMINOLOGY)
    {
        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return fas;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/P%C4%81li_language">P&#257;li</a>
     * ({@link LanguageCode#pi pi}).
     */
    pli("P\u0101li", LanguageCode.pi),

    /**
     * <a href="http://en.wikipedia.org/wiki/Polish_language">Polish</a>
     * ({@link LanguageCode#pl pl}).
     */
    pol("Polish", LanguageCode.pl),

    /**
     * <a href="http://en.wikipedia.org/wiki/Portuguese_language">Portuguese</a>
     * ({@link LanguageCode#pt pt}).
     */
    por("Portuguese", LanguageCode.pt),

    /**
     * <a href="http://en.wikipedia.org/wiki/Pashto_language">Pashto</a>
     * ({@link LanguageCode#ps ps}).
     */
    pus("Pushto", LanguageCode.ps),

    /**
     * <a href="http://en.wikipedia.org/wiki/Quechua_language">Quechua</a>
     * ({@link LanguageCode#qu qu}).
     */
    que("Quechua", LanguageCode.qu),

    /**
     * <a href="http://en.wikipedia.org/wiki/Romansh_language">Romansh</a>
     * ({@link LanguageCode#rm rm})
     */
    roh("Romansh", LanguageCode.rm),

    /**
     * <a href="http://en.wikipedia.org/wiki/Romanian_language">Romanian</a>
     * ({@link LanguageCode#ro ro}) for terminology applications.
     *
     * @see #rum
     */
    ron("Romansh", LanguageCode.ro, Usage.TERMINOLOGY)
    {
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
    rum("Romansh", LanguageCode.ro, Usage.BIBLIOGRAPHY)
    {
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
    run("Kirundi", LanguageCode.rn),

    /**
     * <a href="http://en.wikipedia.org/wiki/Russian_language">Russian</a>
     * ({@link LanguageCode#ru ru}).
     */
    rus("Russian", LanguageCode.ru),

    /**
     * <a href="http://en.wikipedia.org/wiki/Sango_language">Sango</a>
     * ({@link LanguageCode#sg sg}).
     */
    sag("Sango", LanguageCode.sg),

    /**
     * <a href="http://en.wikipedia.org/wiki/Sanskrit">Sanskrit</a>
     * ({@link LanguageCode#sa sa}).
     */
    san("Sanskrit", LanguageCode.sa),

    /**
     * <a href="http://en.wikipedia.org/wiki/Sinhala_language">Sinhala</a>
     * ({@link LanguageCode#si si}).
     */
    sin("Sinhala", LanguageCode.si),

    /**
     * <a href="http://en.wikipedia.org/wiki/Slovak_language">Slovak</a>
     * ({@link LanguageCode#sk sk}) for terminology aplications.
     *
     * @see #slo
     */
    slk("Slovak", LanguageCode.sk, Usage.TERMINOLOGY)
    {
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
    slo("Slovak", LanguageCode.sk, Usage.BIBLIOGRAPHY)
    {
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
    slv("Slovene", LanguageCode.sl),

    /**
     * <a href="http://en.wikipedia.org/wiki/Northern_Sami">Northern Sami</a>
     * ({@link LanguageCode#se se}).
     */
    sme("Northern Sami", LanguageCode.se),

    /**
     * <a href="http://en.wikipedia.org/wiki/Samoan_language">Samoan</a>
     * ({@link LanguageCode#sm sm}).
     */
    smo("Samoan", LanguageCode.sm),

    /**
     * <a href="http://en.wikipedia.org/wiki/Shona_language">Shona</a>
     * ({@link LanguageCode#sn sn}).
     */
    sna("Shona", LanguageCode.sn),

    /**
     * <a href="http://en.wikipedia.org/wiki/Sindhi_language">Sindhi</a>
     * ({@link LanguageCode#sd sd}).
     */
    snd("Sindhi", LanguageCode.sd),

    /**
     * <a href="http://en.wikipedia.org/wiki/Somali_language">Somali</a>
     * ({@link LanguageCode#so so}).
     */
    som("Somali", LanguageCode.so),

    /**
     * <a href="http://en.wikipedia.org/wiki/Sotho_language">Southern Sotho</a>
     * ({@link LanguageCode#st st}).
     */
    sot("Southern Sotho", LanguageCode.st),

    /**
     * <a href="http://en.wikipedia.org/wiki/Spanish_language">Spanish</a>
     * ({@link LanguageCode#es es}).
     */
    spa("Spanish", LanguageCode.es),

    /**
     * <a href="http://en.wikipedia.org/wiki/Albanian_language">Albanian</a>
     * ({@link LanguageCode#sq sq}) for terminology applications.
     *
     * @see #alb
     */
    sqi("Albanian", LanguageCode.sq, Usage.TERMINOLOGY)
    {
        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return alb;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Sardinian_language">Sardinian</a>
     * ({@link LanguageCode#sc sc}).
     */
    srd("Sardinian", LanguageCode.sc),

    /**
     * <a href="http://en.wikipedia.org/wiki/Serbian_language">Serbian</a>
     * ({@link LanguageCode#sr sr}).
     */
    srp("Serbian", LanguageCode.sr),

    /**
     * <a href="http://en.wikipedia.org/wiki/Swati_language">Swati</a>
     * ({@link LanguageCode#ss ss}).
     */
    ssw("Swati", LanguageCode.ss),

    /**
     * <a href="http://en.wikipedia.org/wiki/Sundanese_language">Sundanese</a>
     * ({@link LanguageCode#su su}).
     */
    sun("Sundanese", LanguageCode.su),

    /**
     * <a href="http://en.wikipedia.org/wiki/Swahili_language">Swahili</a>
     * ({@link LanguageCode#sw sw}).
     */
    swa("Swahili", LanguageCode.sw),

    /**
     * <a href="http://en.wikipedia.org/wiki/Swedish_language">Swedish</a>
     * ({@link LanguageCode#sv sv}).
     */
    swe("Swedish", LanguageCode.sv),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tahitian_language">Tahitian</a>
     * ({@link LanguageCode#ty ty}).
     */
    tah("Tahitian", LanguageCode.ty),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tamil_language">Tamil</a>
     * ({@link LanguageCode#ta ta}).
     */
    tam("Tamil", LanguageCode.ta),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tatar_language">Tatar</a>
     * ({@link LanguageCode#tt tt}).
     */
    tat("Tatar", LanguageCode.tt),

    /**
     * <a href="http://en.wikipedia.org/wiki/Telugu_language">Telugu</a>
     * ({@link LanguageCode#te te}).
     */
    tel("Telugu", LanguageCode.te),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tajik_language">Tajik</a>
     * ({@link LanguageCode#tg tg}).
     */
    tgk("Tajik", LanguageCode.tg),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tagalog_language">Tagalog</a>
     * ({@link LanguageCode#tl tl}).
     */
    tgl("Tagalog", LanguageCode.tl),

    /**
     * <a href="http://en.wikipedia.org/wiki/Thai_language">Thai</a>
     * ({@link LanguageCode#th th}).
     */
    tha("Thai", LanguageCode.th),

    /**
     * <a href="http://en.wikipedia.org/wiki/Standard_Tibetan">Tibetan</a>
     * ({@link LanguageCode#bo bo}) for terminology applications.
     *
     * @see #bod
     */
    tib("Tibetan", LanguageCode.bo, Usage.BIBLIOGRAPHY)
    {
        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return bod;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Tigrinya_language">Tigrinya</a>
     * ({@link LanguageCode#ti ti}).
     */
    tir("Tigrinya", LanguageCode.ti),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tongan_language">Tongan</a>
     * ({@link LanguageCode#to to}).
     */
    ton("Tonga", LanguageCode.to),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tswana_language">Tswana</a>
     * ({@link LanguageCode#tn tn}).
     */
    tsn("Tswana", LanguageCode.tn),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tsonga_language">Tsonga</a>
     * ({@link LanguageCode#ts ts}).
     */
    tso("Tsonga", LanguageCode.ts),

    /**
     * <a href="http://en.wikipedia.org/wiki/Turkmen_language">Turkmen</a>
     * ({@link LanguageCode#tk tk}).
     */
    tuk("Turkmen", LanguageCode.tk),

    /**
     * <a href="http://en.wikipedia.org/wiki/Turkish_language">Turkish</a>
     * ({@link LanguageCode#tr tr}).
     */
    tur("Turkish", LanguageCode.tr),

    /**
     * <a href="http://en.wikipedia.org/wiki/Twi">Twi</a>
     * ({@link LanguageCode#tw tw}).
     */
    twi("Twi", LanguageCode.tw),

    /**
     * <a href="http://en.wikipedia.org/wiki/Uyghur_language">Uighur</a>
     * ({@link LanguageCode#ug ug}).
     */
    uig("Uighur", LanguageCode.ug),

    /**
     * <a href="http://en.wikipedia.org/wiki/Ukrainian_language">Ukrainian</a>
     * ({@link LanguageCode#uk uk}).
     */
    ukr("Ukrainian", LanguageCode.uk),

    /**
     * <a href="http://en.wikipedia.org/wiki/Urdu">Urdu</a>
     * ({@link LanguageCode#ur ur}).
     */
    urd("Urdu", LanguageCode.ur),

    /**
     * <a href="http://en.wikipedia.org/wiki/Uzbek_language">Uzbek</a>
     * ({@link LanguageCode#uz uz}).
     */
    uzb("Uzbek", LanguageCode.uz),

    /**
     * <a href="http://en.wikipedia.org/wiki/Venda_language">Venda</a>
     * ({@link LanguageCode#ve ve}).
     */
    ven("Venda", LanguageCode.ve),

    /**
     * <a href="http://en.wikipedia.org/wiki/Vietnamese_language">Vietnamese</a>
     * ({@link LanguageCode#vi vi}).
     */
    vie("Vietnamese", LanguageCode.vi),

    /**
     * <a href="http://en.wikipedia.org/wiki/Volap%C3%BCk">Volap&uuml;k</a>
     * ({@link LanguageCode#vo vo}).
     */
    vol("Volap\u00FCk", LanguageCode.vo),

    /**
     * <a href="http://en.wikipedia.org/wiki/Welsh_language">Welsh</a>
     * ({@link LanguageCode#cy cy}) for bibliographic applications.
     *
     * @see #cym
     */
    wel("Welsh", LanguageCode.cy, Usage.BIBLIOGRAPHY)
    {
        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return cym;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Walloon_language">Walloon</a>
     * ({@link LanguageCode#wa wa}).
     */
    wln("Walloon", LanguageCode.wa),

    /**
     * <a href="http://en.wikipedia.org/wiki/Wolof_language">Wolof</a>
     * ({@link LanguageCode#wo wo}).
     */
    wol("Wolof", LanguageCode.wo),

    /**
     * <a href="http://en.wikipedia.org/wiki/Xhosa_language">Xhosa</a>
     * ({@link LanguageCode#xh xh}).
     */
    xho("Xhosa", LanguageCode.xh),

    /**
     * <a href="http://en.wikipedia.org/wiki/Yiddish_language">Yiddish</a>
     * ({@link LanguageCode#yi yi}).
     */
    yid("Yiddish", LanguageCode.yi),

    /**
     * <a href="http://en.wikipedia.org/wiki/Yoruba_language">Yoruba</a>
     * ({@link LanguageCode#yo yo}).
     */
    yor("Yoruba", LanguageCode.yo),

    /**
     * <a href="http://en.wikipedia.org/wiki/Zhuang_languages">Zhuang</a>
     * ({@link LanguageCode#za za}).
     */
    zha("Zhuang", LanguageCode.za),

    /**
     * <a href="http://en.wikipedia.org/wiki/Chinese_language">Chinese</a>
     * ({@link LanguageCode#zh zh}) for terminology applications.
     *
     * @see #chi
     */
    zho("Chinese", LanguageCode.zh, Usage.TERMINOLOGY)
    {
        @Override
        public LanguageAlpha3Code getSynonym()
        {
            return chi;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Zulu_language">Zulu</a>
     * ({@link LanguageCode#zu zu}).
     */
    zul("Zulu", LanguageCode.zu)
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


    /**
     * ISO 639-1 code (2-letter lowercase code).
     */
    private final LanguageCode alpha2;


    /**
     * Usage of this ISO 639-3 language code.
     */
    private final Usage usage;


    private LanguageAlpha3Code(String name, LanguageCode alpha2)
    {
        this(name, alpha2, Usage.COMMON);
    }


    private LanguageAlpha3Code(String name, LanguageCode alpha2, Usage usage)
    {
        this.name = name;
        this.alpha2 = alpha2;
        this.usage = usage;
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
     *         language code. This method may return null.
     */
    public LanguageCode getAlpha2()
    {
        return alpha2;
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
        return usage;
    }


    /**
     * Get the synonym of this code.
     *
     * <p>
     * In most cases, this method simply returns <code>this</code> object.
     * On the other hand, language codes that have two alpha-3 codes, namely,
     * ISO 639-2/T code ("terminological" code) and ISO 639-2/B code
     * ("bibliographic" code), return their counterparts. For example,
     * {@link #deu LanguageAlpha3Code.deu}.getSynonym() returns
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
     * Most languages have just one
     * <a href="http://en.wikipedia.org/wiki/ISO_639-2">ISO 639-2</a>
     * code and they simply return <code>this</code> object.
     * Only ISO 639-2/T codes ("terminological" codes) return
     * counterpart objects. For example, {@link
     * LanguageAlpha3Code#fra LanguageAlpha3Code.fra} returns {@link
     * LanguageAlpha3Code#fre LanguageAlpha3Code.fre}.
     * 
     * </p>
     *
     * @return
     *         The bibliographic code of this language. 
     */
    public LanguageAlpha3Code getAlpha3B()
    {
        if (usage == Usage.BIBLIOGRAPHY)
        {
            return getSynonym();
        }
        else
        {
            return this;
        }
    }


    /**
     * Get the terminological code of this language.
     *
     * <p>
     * Most languages have just one
     * <a href="http://en.wikipedia.org/wiki/ISO_639-2">ISO 639-2</a>
     * code and they simply return <code>this</code> object.
     * Only ISO 639-2/B codes ("bibliographic" codes) return
     * counterpart objects. For example, {@link
     * LanguageAlpha3Code#fre LanguageAlpha3Code.fre} returns {@link
     * LanguageAlpha3Code#fra LanguageAlpha3Code.fra}.
     * 
     * </p>
     *
     * @return
     *         The terminological code of this language. 
     */
    public LanguageAlpha3Code getAlpha3T()
    {
        if (usage == Usage.TERMINOLOGY)
        {
            return getSynonym();
        }
        else
        {
            return this;
        }
    }


    /**
     * Get a LanguageAlpha3Code that corresponds to a given
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
     *         this method returns {@link #ind LanguageAlpha3Code.ind}.
     *
     * @return
     *         A LanguageAlpha3Code instance, or null if not found.
     *         If <a href="http://en.wikipedia.org/wiki/ISO_639-1">ISO 639-1</a>
     *         code (2-letter code) is given and the language has two
     *         <a href="http://en.wikipedia.org/wiki/ISO_639-2">ISO 639-2</a>
     *         codes, ISO 639/T code ("terminological" code) is returned.
     */
    public static LanguageAlpha3Code getByCode(String code)
    {
        return getByCode(code, false);
    }


    /**
     * Get a LanguageAlpha3Code that corresponds to a given
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
     *         this method returns {@link #ind LanguageAlpha3Code.ind}.
     *
     * @param caseSensitive
     *         If true, the given code should consist of lowercase letters only.
     *         If false, this method internally canonicalizes the given code by
     *         {@link String#toLowerCase()} and then performs search. For example,
     *         {@code getByCode("JPN", true)} returns null, but on the other hand,
     *         {@code getByCode("JPN", false)} returns {@link #jpn
     *         LanguageAlpha3Code.jpn}.
     *
     * @return
     *         A LanguageAlpha3Code instance, or null if not found.
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

        if (code.length() == 3)
        {
            return getByEnumName(code);
        }

        if (code.length() != 2)
        {
            return null;
        }

        LanguageCode alpha2 = LanguageCode.getByEnumName(code);

        if (alpha2 == null)
        {
            return null;
        }

        return alpha2.getAlpha3().get(0);
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

        if (caseSensitive)
        {
            return code;
        }
        else
        {
            return code.toLowerCase();
        }
    }
}
