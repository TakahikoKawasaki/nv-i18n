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
 * Most languages have just one ISO 639-2 code, but there are some languages
 * that have 2 codes, ISO 639-2/T code ("terminological" code) and ISO 639-2/B
 * code ("bibliographic" code). The table below list up langueses having two ISO
 * 639-2 codes.
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
 * <td>{@link LanguageAlpha3Code#per per}</td>
 * <td>{@link LanguageAlpha3Code#fas fas}</td>
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
 * @since 1.1
 * @author Takahiko Kawasaki
 */
public enum LanguageAlpha3Code
{
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
     * <a href="http://en.wikipedia.org/wiki/Greek_language">Greek</a>
     * ({@link LanguageCode#el el}) for terminology applications.
     * 
     * #gre
     */
    ell("Greek")
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
     * <a href="http://en.wikipedia.org/wiki/Basque_language">Basque</a>
     * ({@link LanguageCode#eu eu}) for terminology applications.
     * 
     * @see #baq
     */
    eus("Basque")
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
     * ({@link LanguageCode#fa fa}) for bibliographic applications.
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
            return Usage.BIBLIOGRAPHY;
        }


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
    fij("Fijian")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.fj;
        }
    },

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
     * <a href="http://en.wikipedia.org/wiki/French_language">French</a>
     * ({@link LanguageCode#fr fr}) for terminology applications.
     * 
     * #fre
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
     * #fra
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
     * <a href="http://en.wikipedia.org/wiki/Greek_language">Greek</a>
     * ({@link LanguageCode#el el}) for bibliographic applications.
     * 
     * #ell
     */
    gre("Greek")
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
     * <a href="http://en.wikipedia.org/wiki/Malay_language">Malay</a>
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
     * <a href="http://en.wikipedia.org/wiki/Nepali_language">Nepali</a>
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
     * <a href="http://en.wikipedia.org/wiki/Occitan_language">Occitan</a>
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
     * <a href="http://en.wikipedia.org/wiki/Oriya_language">Oriya</a>
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
     * <a href="http://en.wikipedia.org/wiki/Persian_language">Persian</a>
     * ({@link LanguageCode#fa fa}) for terminology applications.
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
            return Usage.TERMINOLOGY;
        }


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
     * <a href="http://en.wikipedia.org/wiki/Romanian_language">Romanian</a>
     * ({@link LanguageCode#ro ro}) for terminology applications.
     * 
     * @see #rum
     */
    ron("Romansh")
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
     * <a href="http://en.wikipedia.org/wiki/Swahili_language">Swahili</a>
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
     * <a href="http://en.wikipedia.org/wiki/Tongan_language">Tongan</a>
     * ({@link LanguageCode#to to}).
     */
    ton("Tonga")
    {
        @Override
        public LanguageCode getAlpha2()
        {
            return LanguageCode.to;
        }
    },

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
    }
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
     *         language code. This method may return null.
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
     * {@link #deu LanguageAlpha3Code.deu}.getSynonym() returns {@link #ger
     * LanguageAlpha3Code.ger}.
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
     * {@link LanguageAlpha3Code#fra LanguageAlpha3Code.fra} returns
     * {@link LanguageAlpha3Code#fre LanguageAlpha3Code.fre}.
     * 
     * </p>
     * 
     * @return
     *         The bibliographic code of this language.
     */
    public LanguageAlpha3Code getAlpha3B()
    {
        if (getUsage() == Usage.BIBLIOGRAPHY)
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
     * Most languages have just one <a
     * href="http://en.wikipedia.org/wiki/ISO_639-2">ISO 639-2</a> code and they
     * simply return <code>this</code> object. Only ISO 639-2/B codes
     * ("bibliographic" codes) return counterpart objects. For example,
     * {@link LanguageAlpha3Code#fre LanguageAlpha3Code.fre} returns
     * {@link LanguageAlpha3Code#fra LanguageAlpha3Code.fra}.
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
     * getByCode}(code, false), meaning the case of the given code is ignored.
     * </p>
     * 
     * @param code
     *        An <a href="http://en.wikipedia.org/wiki/ISO_639-1">ISO 639-1</a>
     *        code (2-letter lowercase code) or an
     *        <a href="http://en.wikipedia.org/wiki/ISO_639-2">ISO 639-2</a>
     *        code
     *        (3-letter lowercase code).
     *        Note that if the given code is one of legacy language codes
     *        ("iw", "ji" and "in"), it is treated as its official counterpart
     *        ("he", "yi" and "id", respectively). For example, if "in" is
     *        given,
     *        this method returns {@link #ind LanguageAlpha3Code.ind}.
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
     *        An <a href="http://en.wikipedia.org/wiki/ISO_639-1">ISO 639-1</a>
     *        code (2-letter lowercase code) or an
     *        <a href="http://en.wikipedia.org/wiki/ISO_639-2">ISO 639-2</a>
     *        code
     *        (3-letter lowercase code).
     *        Note that if the given code is one of legacy language codes
     *        ("iw", "ji" and "in"), it is treated as its official counterpart
     *        ("he", "yi" and "id", respectively). For example, if "in" is
     *        given,
     *        this method returns {@link #ind LanguageAlpha3Code.ind}.
     * 
     * @param caseSensitive
     *        If true, the given code should consist of lowercase letters only.
     *        If false, this method internally canonicalizes the given code by
     *        {@link String#toLowerCase()} and then performs search. For
     *        example, {@code getByCode("JPN", true)} returns null, but on the
     *        other hand, {@code getByCode("JPN", false)} returns {@link #jpn
     *        LanguageAlpha3Code.jpn}.
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
