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


import java.util.Locale;


/**
 * Locale code.
 *
 * <p>
 * The entries of this enum was generated based on the output from
 * {@link java.util.Locale#getAvailableLocales()
 * Locale.getAvailableLocales()} of Java SE 7, but locales whose
 * format do not match either 'xx' or 'xx-XX' were excluded.
 * </p>
 *
 * <pre style="background-color: #EEEEEE; margin-left: 2em; margin-right: 2em; border: 1px solid black;">
 * <span style="color: darkgreen;">// List all the locale codes.</span>
 * for (LocaleCode code : LocaleCode.values())
 * {
 *     String language = code.{@link #getLanguage()}.{@link LanguageCode#getName() getName()};
 *     String country  = code.{@link #getCountry()} != null
 *                     ? code.{@link #getCountry()}.{@link CountryCode#getName() getName()} : null;
 *
 *     <span style="color: darkgreen;">// For example, "[de-DE] German, Germany" is printed.</span>
 *     System.out.format("[%s] %s, %s\n", code, language, country);
 * }
 *
 * <span style="color: darkgreen;">// Get a LocaleCode instance in various ways.</span>
 * LocaleCode code;
 * code = LocaleCode.{@link #getByCode(String) getByCode}("en-GB");
 * code = LocaleCode.{@link #getByCode(String, String) getByCode}("es", "ES");
 * code = LocaleCode.{@link #getByLocale(Locale) getByLocale}(new Locale("pt", "BR"));
 *
 * <span style="color: darkgreen;">// Convert to a Locale instance.</span>
 * Locale locale = LocaleCode.{@link #en}.{@link #toLocale()};
 *
 * <span style="color: darkgreen;">// toLocale() of some LocaleCode instances does not create</span>
 * <span style="color: darkgreen;">// a new Locale instance but returns a static variable of</span>
 * <span style="color: darkgreen;">// Locale class instead. See {@link #toLocale()} for details.</span>
 * if (locale == Locale.ENGLISH)
 * {
 *     System.out.println("Locale.en.toLocale() returned Locale.ENGLISH");
 * }
 * </pre>
 *
 * @author Takahiko Kawasaki
 */
public enum LocaleCode
{
    /**
     * {@link LanguageCode#ar Arabic}
     */
    ar(LanguageCode.ar, null),

    /**
     * {@link LanguageCode#ar Arabic}, {@link CountryCode#AE United Arab Emirates}
     */
    ar_AE(LanguageCode.ar, CountryCode.AE),

    /**
     * {@link LanguageCode#ar Arabic}, {@link CountryCode#BH Bahrain}
     */
    ar_BH(LanguageCode.ar, CountryCode.BH),

    /**
     * {@link LanguageCode#ar Arabic}, {@link CountryCode#DZ Algeria}
     */
    ar_DZ(LanguageCode.ar, CountryCode.DZ),

    /**
     * {@link LanguageCode#ar Arabic}, {@link CountryCode#EG Egypt}
     */
    ar_EG(LanguageCode.ar, CountryCode.EG),

    /**
     * {@link LanguageCode#ar Arabic}, {@link CountryCode#IQ Iraq}
     */
    ar_IQ(LanguageCode.ar, CountryCode.IQ),

    /**
     * {@link LanguageCode#ar Arabic}, {@link CountryCode#JO Jordan}
     */
    ar_JO(LanguageCode.ar, CountryCode.JO),

    /**
     * {@link LanguageCode#ar Arabic}, {@link CountryCode#KW Kuwait}
     */
    ar_KW(LanguageCode.ar, CountryCode.KW),

    /**
     * {@link LanguageCode#ar Arabic}, {@link CountryCode#LB Lebanon}
     */
    ar_LB(LanguageCode.ar, CountryCode.LB),

    /**
     * {@link LanguageCode#ar Arabic}, {@link CountryCode#LY Libya}
     */
    ar_LY(LanguageCode.ar, CountryCode.LY),

    /**
     * {@link LanguageCode#ar Arabic}, {@link CountryCode#MA Morocco}
     */
    ar_MA(LanguageCode.ar, CountryCode.MA),

    /**
     * {@link LanguageCode#ar Arabic}, {@link CountryCode#OM Oman}
     */
    ar_OM(LanguageCode.ar, CountryCode.OM),

    /**
     * {@link LanguageCode#ar Arabic}, {@link CountryCode#QA Qatar}
     */
    ar_QA(LanguageCode.ar, CountryCode.QA),

    /**
     * {@link LanguageCode#ar Arabic}, {@link CountryCode#SA Saudi Arabia}
     */
    ar_SA(LanguageCode.ar, CountryCode.SA),

    /**
     * {@link LanguageCode#ar Arabic}, {@link CountryCode#SD Sudan}
     */
    ar_SD(LanguageCode.ar, CountryCode.SD),

    /**
     * {@link LanguageCode#ar Arabic}, {@link CountryCode#SY Syrian Arab Republic}
     */
    ar_SY(LanguageCode.ar, CountryCode.SY),

    /**
     * {@link LanguageCode#ar Arabic}, {@link CountryCode#TN Tunisia}
     */
    ar_TN(LanguageCode.ar, CountryCode.TN),

    /**
     * {@link LanguageCode#ar Arabic}, {@link CountryCode#YE Yemen}
     */
    ar_YE(LanguageCode.ar, CountryCode.YE),

    /**
     * {@link LanguageCode#be Belarusian}
     */
    be(LanguageCode.be, null),

    /**
     * {@link LanguageCode#be Belarusian}, {@link CountryCode#BY Belarus}
     */
    be_BY(LanguageCode.be, CountryCode.BY),

    /**
     * {@link LanguageCode#bg Bulgarian}
     */
    bg(LanguageCode.bg, null),

    /**
     * {@link LanguageCode#bg Bulgarian}, {@link CountryCode#BG Bulgaria}
     */
    bg_BG(LanguageCode.bg, CountryCode.BG),

    /**
     * {@link LanguageCode#ca Catalan}
     */
    ca(LanguageCode.ca, null),

    /**
     * {@link LanguageCode#ca Catalan}, {@link CountryCode#ES Spain}
     */
    ca_ES(LanguageCode.ca, CountryCode.ES),

    /**
     * {@link LanguageCode#cs Czech}
     */
    cs(LanguageCode.cs, null),

    /**
     * {@link LanguageCode#cs Czech}, {@link CountryCode#CZ Czech Republic}
     */
    cs_CZ(LanguageCode.cs, CountryCode.CZ),

    /**
     * {@link LanguageCode#da Danish}
     */
    da(LanguageCode.da, null),

    /**
     * {@link LanguageCode#da Danish}, {@link CountryCode#DK Denmark}
     */
    da_DK(LanguageCode.da, CountryCode.DK),

    /**
     * {@link LanguageCode#de German}
     */
    de(LanguageCode.de, null)
    {
        @Override
        public Locale toLocale()
        {
            return Locale.GERMAN;
        }
    },

    /**
     * {@link LanguageCode#de German}, {@link CountryCode#AT Austria}
     */
    de_AT(LanguageCode.de, CountryCode.AT),

    /**
     * {@link LanguageCode#de German}, {@link CountryCode#CH Switzerland}
     */
    de_CH(LanguageCode.de, CountryCode.CH),

    /**
     * {@link LanguageCode#de German}, {@link CountryCode#DE Germany}
     */
    de_DE(LanguageCode.de, CountryCode.DE),

    /**
     * {@link LanguageCode#de German}, {@link CountryCode#LU Luxembourg}
     */
    de_LU(LanguageCode.de, CountryCode.LU),

    /**
     * {@link LanguageCode#el Greek}
     */
    el(LanguageCode.el, null),

    /**
     * {@link LanguageCode#el Greek}, {@link CountryCode#CY Cyprus}
     */
    el_CY(LanguageCode.el, CountryCode.CY),

    /**
     * {@link LanguageCode#el Greek}, {@link CountryCode#GR Greece}
     */
    el_GR(LanguageCode.el, CountryCode.GR),

    /**
     * {@link LanguageCode#en English}
     */
    en(LanguageCode.en, null)
    {
        @Override
        public Locale toLocale()
        {
            return Locale.ENGLISH;
        }
    },

    /**
     * {@link LanguageCode#en English}, {@link CountryCode#AU Australia}
     */
    en_AU(LanguageCode.en, CountryCode.AU),

    /**
     * {@link LanguageCode#en English}, {@link CountryCode#CA Canada}
     */
    en_CA(LanguageCode.en, CountryCode.CA),

    /**
     * {@link LanguageCode#en English}, {@link CountryCode#GB United Kingdom}
     */
    en_GB(LanguageCode.en, CountryCode.GB),

    /**
     * {@link LanguageCode#en English}, {@link CountryCode#IE Ireland}
     */
    en_IE(LanguageCode.en, CountryCode.IE),

    /**
     * {@link LanguageCode#en English}, {@link CountryCode#IN India}
     */
    en_IN(LanguageCode.en, CountryCode.IN),

    /**
     * {@link LanguageCode#en English}, {@link CountryCode#MT Malta}
     */
    en_MT(LanguageCode.en, CountryCode.MT),

    /**
     * {@link LanguageCode#en English}, {@link CountryCode#NZ New Zealand}
     */
    en_NZ(LanguageCode.en, CountryCode.NZ),

    /**
     * {@link LanguageCode#en English}, {@link CountryCode#PH Philippines}
     */
    en_PH(LanguageCode.en, CountryCode.PH),

    /**
     * {@link LanguageCode#en English}, {@link CountryCode#SG Singapore}
     */
    en_SG(LanguageCode.en, CountryCode.SG),

    /**
     * {@link LanguageCode#en English}, {@link CountryCode#US United States}
     */
    en_US(LanguageCode.en, CountryCode.US),

    /**
     * {@link LanguageCode#en English}, {@link CountryCode#ZA South Africa}
     */
    en_ZA(LanguageCode.en, CountryCode.ZA),

    /**
     * {@link LanguageCode#es Spanish}
     */
    es(LanguageCode.es, null),

    /**
     * {@link LanguageCode#es Spanish}, {@link CountryCode#AR Argentina}
     */
    es_AR(LanguageCode.es, CountryCode.AR),

    /**
     * {@link LanguageCode#es Spanish}, {@link CountryCode#BO Plurinational State of Bolivia}
     */
    es_BO(LanguageCode.es, CountryCode.BO),

    /**
     * {@link LanguageCode#es Spanish}, {@link CountryCode#CL Chile}
     */
    es_CL(LanguageCode.es, CountryCode.CL),

    /**
     * {@link LanguageCode#es Spanish}, {@link CountryCode#CO Colombia}
     */
    es_CO(LanguageCode.es, CountryCode.CO),

    /**
     * {@link LanguageCode#es Spanish}, {@link CountryCode#CR Costa Rica}
     */
    es_CR(LanguageCode.es, CountryCode.CR),

    /**
     * {@link LanguageCode#es Spanish}, {@link CountryCode#DO Dominican Republic}
     */
    es_DO(LanguageCode.es, CountryCode.DO),

    /**
     * {@link LanguageCode#es Spanish}, {@link CountryCode#EC Ecuador}
     */
    es_EC(LanguageCode.es, CountryCode.EC),

    /**
     * {@link LanguageCode#es Spanish}, {@link CountryCode#ES Spain}
     */
    es_ES(LanguageCode.es, CountryCode.ES),

    /**
     * {@link LanguageCode#es Spanish}, {@link CountryCode#GT Guatemala}
     */
    es_GT(LanguageCode.es, CountryCode.GT),

    /**
     * {@link LanguageCode#es Spanish}, {@link CountryCode#HN Honduras}
     */
    es_HN(LanguageCode.es, CountryCode.HN),

    /**
     * {@link LanguageCode#es Spanish}, {@link CountryCode#MX Mexico}
     */
    es_MX(LanguageCode.es, CountryCode.MX),

    /**
     * {@link LanguageCode#es Spanish}, {@link CountryCode#NI Nicaragua}
     */
    es_NI(LanguageCode.es, CountryCode.NI),

    /**
     * {@link LanguageCode#es Spanish}, {@link CountryCode#PA Panama}
     */
    es_PA(LanguageCode.es, CountryCode.PA),

    /**
     * {@link LanguageCode#es Spanish}, {@link CountryCode#PE Peru}
     */
    es_PE(LanguageCode.es, CountryCode.PE),

    /**
     * {@link LanguageCode#es Spanish}, {@link CountryCode#PR Puerto Rico}
     */
    es_PR(LanguageCode.es, CountryCode.PR),

    /**
     * {@link LanguageCode#es Spanish}, {@link CountryCode#PY Paraguay}
     */
    es_PY(LanguageCode.es, CountryCode.PY),

    /**
     * {@link LanguageCode#es Spanish}, {@link CountryCode#SV El Salvador}
     */
    es_SV(LanguageCode.es, CountryCode.SV),

    /**
     * {@link LanguageCode#es Spanish}, {@link CountryCode#US United States}
     */
    es_US(LanguageCode.es, CountryCode.US),

    /**
     * {@link LanguageCode#es Spanish}, {@link CountryCode#UY Uruguay}
     */
    es_UY(LanguageCode.es, CountryCode.UY),

    /**
     * {@link LanguageCode#es Spanish}, {@link CountryCode#VE Bolivarian Republic of Venezuela}
     */
    es_VE(LanguageCode.es, CountryCode.VE),

    /**
     * {@link LanguageCode#et Estonian}
     */
    et(LanguageCode.et, null),

    /**
     * {@link LanguageCode#et Estonian}, {@link CountryCode#EE Estonia}
     */
    et_EE(LanguageCode.et, CountryCode.EE),

    /**
     * {@link LanguageCode#fi Finnish}
     */
    fi(LanguageCode.fi, null),

    /**
     * {@link LanguageCode#fi Finnish}, {@link CountryCode#FI Finland}
     */
    fi_FI(LanguageCode.fi, CountryCode.FI),

    /**
     * {@link LanguageCode#fr French}
     */
    fr(LanguageCode.fr, null)
    {
        @Override
        public Locale toLocale()
        {
            return Locale.FRENCH;
        }
    },

    /**
     * {@link LanguageCode#fr French}, {@link CountryCode#BE Belgium}
     */
    fr_BE(LanguageCode.fr, CountryCode.BE),

    /**
     * {@link LanguageCode#fr French}, {@link CountryCode#CA Canada}
     */
    fr_CA(LanguageCode.fr, CountryCode.CA)
    {
        @Override
        public Locale toLocale()
        {
            return Locale.CANADA_FRENCH;
        }
    },

    /**
     * {@link LanguageCode#fr French}, {@link CountryCode#CH Switzerland}
     */
    fr_CH(LanguageCode.fr, CountryCode.CH),

    /**
     * {@link LanguageCode#fr French}, {@link CountryCode#FR France}
     */
    fr_FR(LanguageCode.fr, CountryCode.FR),

    /**
     * {@link LanguageCode#fr French}, {@link CountryCode#LU Luxembourg}
     */
    fr_LU(LanguageCode.fr, CountryCode.LU),

    /**
     * {@link LanguageCode#ga Irish}
     */
    ga(LanguageCode.ga, null),

    /**
     * {@link LanguageCode#ga Irish}, {@link CountryCode#IE Ireland}
     */
    ga_IE(LanguageCode.ga, CountryCode.IE),

    /**
     * {@link LanguageCode#he Hebrew}
     */
    he(LanguageCode.he, null),

    /**
     * {@link LanguageCode#he Hebrew}, {@link CountryCode#IL Israel}
     */
    he_IL(LanguageCode.he, CountryCode.IL),

    /**
     * {@link LanguageCode#hi Hindi}, {@link CountryCode#IN India}
     */
    hi_IN(LanguageCode.hi, CountryCode.IN),

    /**
     * {@link LanguageCode#hr Croatian}
     */
    hr(LanguageCode.hr, null),

    /**
     * {@link LanguageCode#hr Croatian}, {@link CountryCode#HR Croatia}
     */
    hr_HR(LanguageCode.hr, CountryCode.HR),

    /**
     * {@link LanguageCode#hu Hungarian}
     */
    hu(LanguageCode.hu, null),

    /**
     * {@link LanguageCode#hu Hungarian}, {@link CountryCode#HU Hungary}
     */
    hu_HU(LanguageCode.hu, CountryCode.HU),

    /**
     * {@link LanguageCode#id Indonesian}
     */
    id(LanguageCode.id, null),

    /**
     * {@link LanguageCode#id Indonesian}, {@link CountryCode#ID Indonesia}
     */
    id_ID(LanguageCode.id, CountryCode.ID),

    /**
     * {@link LanguageCode#is Icelandic}
     */
    is(LanguageCode.is, null),

    /**
     * {@link LanguageCode#is Icelandic}, {@link CountryCode#IS Iceland}
     */
    is_IS(LanguageCode.is, CountryCode.IS),

    /**
     * {@link LanguageCode#it Italian}
     */
    it(LanguageCode.it, null)
    {
        @Override
        public Locale toLocale()
        {
            return Locale.ITALIAN;
        }
    },

    /**
     * {@link LanguageCode#it Italian}, {@link CountryCode#CH Switzerland}
     */
    it_CH(LanguageCode.it, CountryCode.CH),

    /**
     * {@link LanguageCode#it Italian}, {@link CountryCode#IT Italy}
     */
    it_IT(LanguageCode.it, CountryCode.IT),

    /**
     * {@link LanguageCode#ja Japanese}
     */
    ja(LanguageCode.ja, null)
    {
        @Override
        public Locale toLocale()
        {
            return Locale.JAPANESE;
        }
    },

    /**
     * {@link LanguageCode#ja Japanese}, {@link CountryCode#JP Japan}
     */
    ja_JP(LanguageCode.ja, CountryCode.JP),

    /**
     * {@link LanguageCode#ko Korean}
     */
    ko(LanguageCode.ko, null)
    {
        @Override
        public Locale toLocale()
        {
            return Locale.KOREAN;
        }
    },

    /**
     * {@link LanguageCode#ko Korean}, {@link CountryCode#KR Republic of Korea}
     */
    ko_KR(LanguageCode.ko, CountryCode.KR),

    /**
     * {@link LanguageCode#lt Lithuanian}
     */
    lt(LanguageCode.lt, null),

    /**
     * {@link LanguageCode#lt Lithuanian}, {@link CountryCode#LT Lithuania}
     */
    lt_LT(LanguageCode.lt, CountryCode.LT),

    /**
     * {@link LanguageCode#lv Latvian}
     */
    lv(LanguageCode.lv, null),

    /**
     * {@link LanguageCode#lv Latvian}, {@link CountryCode#LV Latvia}
     */
    lv_LV(LanguageCode.lv, CountryCode.LV),

    /**
     * {@link LanguageCode#mk Macedonian}
     */
    mk(LanguageCode.mk, null),

    /**
     * {@link LanguageCode#mk Macedonian}, {@link CountryCode#MK The former Yugoslav Republic of Macedonia}
     */
    mk_MK(LanguageCode.mk, CountryCode.MK),

    /**
     * {@link LanguageCode#ms Malay}
     */
    ms(LanguageCode.ms, null),

    /**
     * {@link LanguageCode#ms Malay}, {@link CountryCode#MY Malaysia}
     */
    ms_MY(LanguageCode.ms, CountryCode.MY),

    /**
     * {@link LanguageCode#mt Maltese}
     */
    mt(LanguageCode.mt, null),

    /**
     * {@link LanguageCode#mt Maltese}, {@link CountryCode#MT Malta}
     */
    mt_MT(LanguageCode.mt, CountryCode.MT),

    /**
     * {@link LanguageCode#nl Dutch}
     */
    nl(LanguageCode.nl, null),

    /**
     * {@link LanguageCode#nl Dutch}, {@link CountryCode#BE Belgium}
     */
    nl_BE(LanguageCode.nl, CountryCode.BE),

    /**
     * {@link LanguageCode#nl Dutch}, {@link CountryCode#NL Netherlands}
     */
    nl_NL(LanguageCode.nl, CountryCode.NL),

    /**
     * {@link LanguageCode#nn Norwegian Nynorsk}, {@link CountryCode#NO Norway}
     */
    nn_NO(LanguageCode.nn, CountryCode.NO),

    /**
     * {@link LanguageCode#no Norwegian}
     */
    no(LanguageCode.no, null),

    /**
     * {@link LanguageCode#no Norwegian}, {@link CountryCode#NO Norway}
     */
    no_NO(LanguageCode.no, CountryCode.NO),

    /**
     * {@link LanguageCode#pl Polish}
     */
    pl(LanguageCode.pl, null),

    /**
     * {@link LanguageCode#pl Polish}, {@link CountryCode#PL Poland}
     */
    pl_PL(LanguageCode.pl, CountryCode.PL),

    /**
     * {@link LanguageCode#pt Portuguese}
     */
    pt(LanguageCode.pt, null),

    /**
     * {@link LanguageCode#pt Portuguese}, {@link CountryCode#BR Brazil}
     */
    pt_BR(LanguageCode.pt, CountryCode.BR),

    /**
     * {@link LanguageCode#pt Portuguese}, {@link CountryCode#PT Portugal}
     */
    pt_PT(LanguageCode.pt, CountryCode.PT),

    /**
     * {@link LanguageCode#ro Romanian}
     */
    ro(LanguageCode.ro, null),

    /**
     * {@link LanguageCode#ro Romanian}, {@link CountryCode#RO Romania}
     */
    ro_RO(LanguageCode.ro, CountryCode.RO),

    /**
     * {@link LanguageCode#ru Russian}
     */
    ru(LanguageCode.ru, null),

    /**
     * {@link LanguageCode#ru Russian}, {@link CountryCode#RU Russian Federation}
     */
    ru_RU(LanguageCode.ru, CountryCode.RU),

    /**
     * {@link LanguageCode#sk Slovak}
     */
    sk(LanguageCode.sk, null),

    /**
     * {@link LanguageCode#sk Slovak}, {@link CountryCode#SK Slovakia}
     */
    sk_SK(LanguageCode.sk, CountryCode.SK),

    /**
     * {@link LanguageCode#sl Slovene}
     */
    sl(LanguageCode.sl, null),

    /**
     * {@link LanguageCode#sl Slovene}, {@link CountryCode#SI Slovenia}
     */
    sl_SI(LanguageCode.sl, CountryCode.SI),

    /**
     * {@link LanguageCode#sq Albanian}
     */
    sq(LanguageCode.sq, null),

    /**
     * {@link LanguageCode#sq Albanian}, {@link CountryCode#AL Albania}
     */
    sq_AL(LanguageCode.sq, CountryCode.AL),

    /**
     * {@link LanguageCode#sr Serbian}
     */
    sr(LanguageCode.sr, null),

    /**
     * {@link LanguageCode#sr Serbian}, {@link CountryCode#BA Bosnia and Herzegovina}
     */
    sr_BA(LanguageCode.sr, CountryCode.BA),

    /**
     * {@link LanguageCode#sr Serbian}, {@link CountryCode#CS Serbia and Montenegro}
     */
    sr_CS(LanguageCode.sr, CountryCode.CS),

    /**
     * {@link LanguageCode#sr Serbian}, {@link CountryCode#ME Montenegro}
     */
    sr_ME(LanguageCode.sr, CountryCode.ME),

    /**
     * {@link LanguageCode#sr Serbian}, {@link CountryCode#RS Serbia}
     */
    sr_RS(LanguageCode.sr, CountryCode.RS),

    /**
     * {@link LanguageCode#sv Swedish}
     */
    sv(LanguageCode.sv, null),

    /**
     * {@link LanguageCode#sv Swedish}, {@link CountryCode#SE Sweden}
     */
    sv_SE(LanguageCode.sv, CountryCode.SE),

    /**
     * {@link LanguageCode#th Thai}
     */
    th(LanguageCode.th, null),

    /**
     * {@link LanguageCode#th Thai}, {@link CountryCode#TH Thailand}
     */
    th_TH(LanguageCode.th, CountryCode.TH),

    /**
     * {@link LanguageCode#tr Turkish}
     */
    tr(LanguageCode.tr, null),

    /**
     * {@link LanguageCode#tr Turkish}, {@link CountryCode#TR Turkey}
     */
    tr_TR(LanguageCode.tr, CountryCode.TR),

    /**
     * {@link LanguageCode#uk Ukrainian}
     */
    uk(LanguageCode.uk, null),

    /**
     * {@link LanguageCode#uk Ukrainian}, {@link CountryCode#UA Ukraine}
     */
    uk_UA(LanguageCode.uk, CountryCode.UA),

    /**
     * {@link LanguageCode#vi Vietnamese}
     */
    vi(LanguageCode.vi, null),

    /**
     * {@link LanguageCode#vi Vietnamese}, {@link CountryCode#VN Viet Nam}
     */
    vi_VN(LanguageCode.vi, CountryCode.VN),

    /**
     * {@link LanguageCode#zh Chinese}
     */
    zh(LanguageCode.zh, null)
    {
        @Override
        public Locale toLocale()
        {
            return Locale.CHINESE;
        }
    },

    /**
     * {@link LanguageCode#zh Chinese}, {@link CountryCode#CN China}
     */
    zh_CN(LanguageCode.zh, CountryCode.CN)
    {
        @Override
        public Locale toLocale()
        {
            return Locale.SIMPLIFIED_CHINESE;
        }
    },

    /**
     * {@link LanguageCode#zh Chinese}, {@link CountryCode#HK Hong Kong}
     */
    zh_HK(LanguageCode.zh, CountryCode.HK),

    /**
     * {@link LanguageCode#zh Chinese}, {@link CountryCode#SG Singapore}
     */
    zh_SG(LanguageCode.zh, CountryCode.SG),

    /**
     * {@link LanguageCode#zh Chinese}, {@link CountryCode#TW Taiwan, Province of China}
     */
    zh_TW(LanguageCode.zh, CountryCode.TW)
    {
        @Override
        public Locale toLocale()
        {
            return Locale.TRADITIONAL_CHINESE;
        }
    }
    ;


    private final LanguageCode language;
    private final CountryCode country;
    private final String string;


    private LocaleCode(LanguageCode language, CountryCode country)
    {
        this.language = language;
        this.country = country;

        if (country == null)
        {
            string = language.name();
        }
        else
        {
            string = language.name() + "-" + country.name();
        }
    }


    /**
     * Get the language code.
     *
     * @return
     *         The language code. This method always returns a non-null value.
     */
    public LanguageCode getLanguage()
    {
        return language;
    }


    /**
     * Get the country code.
     *
     * @return
     *         The country code. This method may return null.
     *         For example, LocaleCode.{@link #en}.getCountry() returns null.
     */
    public CountryCode getCountry()
    {
        return country;
    }


    /**
     * Get the string representation of this locale code. Its format is
     * either of the following:
     *
     * <ul>
     * <li><i>language</i></li>
     * <li><i>language</i><code>-</code><i>country</i>
     * </ul>
     *
     * <p>
     * where <i>language</i> is an <a
     * href="http://en.wikipedia.org/wiki/ISO_639-1">ISO 639-1</a> code
     * and <i>country</i> is an <a
     * href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1
     * alpha-2</a> code. 
     * </p>
     *
     * @return
     *         The string representation of this locale code.
     */
    @Override
    public String toString()
    {
        return string;
    }


    /**
     * Convert this LocaleCode instance to a {@link Locale} instance.
     *
     * <p>
     * In most cases, this method creates a new Locale instance
     * every time it is called, but some LocaleCode instancess
     * return their corresponding entries in Locale class.
     * For example, {@link #it LocaleCode.it} always returns
     * {@link Locale#ITALIAN}.
     * </p>
     *
     * <p>
     * The table below lists LocaleCode entries whose toLocale()
     * do not create new Locale instances but return entries in
     * Locale class.
     * </p>
     *
     * <table border="1" style="border-collapse: collapse;" cellpadding="5">
     * <tr bgcolor="#FF8C00">
     *   <th>LocaleCode</th>
     *   <th>Locale</th>
     * </tr>
     * <tr>
     *   <td>{@link LocaleCode#de LocaleCode.de}</td>
     *   <td>{@link Locale#GERMAN}</td>
     * </tr>
     * <tr>
     *   <td>{@link LocaleCode#en LocaleCode.en}</td>
     *   <td>{@link Locale#ENGLISH}</td>
     * </tr>
     * <tr>
     *   <td>{@link LocaleCode#fr LocaleCode.fr}</td>
     *   <td>{@link Locale#FRENCH}</td>
     * </tr>
     * <tr>
     *   <td>{@link LocaleCode#fr_CA LocaleCode.fr_CA}</td>
     *   <td>{@link Locale#CANADA_FRENCH}</td>
     * </tr>
     * <tr>
     *   <td>{@link LocaleCode#it LocaleCode.it}</td>
     *   <td>{@link Locale#ITALIAN}</td>
     * </tr>
     * <tr>
     *   <td>{@link LocaleCode#ja LocaleCode.ja}</td>
     *   <td>{@link Locale#JAPANESE}</td>
     * </tr>
     * <tr>
     *   <td>{@link LocaleCode#ko LocaleCode.ko}</td>
     *   <td>{@link Locale#KOREAN}</td>
     * </tr>
     * <tr>
     *   <td>{@link LocaleCode#zh LocaleCode.zh}</td>
     *   <td>{@link Locale#CHINESE}</td>
     * </tr>
     * <tr>
     *   <td>{@link LocaleCode#zh_CN LocaleCode.zh_CN}</td>
     *   <td>{@link Locale#SIMPLIFIED_CHINESE}</td>
     * </tr>
     * <tr>
     *   <td>{@link LocaleCode#zh_TW LocaleCode.zh_TW}</td>
     *   <td>{@link Locale#TRADITIONAL_CHINESE}</td>
     * </tr>
     * </table>
     *
     * @return
     *         A Locale instance that matches this LocaleCode.
     */
    public Locale toLocale()
    {
        if (country != null)
        {
            return new Locale(language.name(), country.name());
        }
        else
        {
            return new Locale(language.name());
        }
    }


    /**
     * Get a LocaleCode instance that corresponds to the given code.
     *
     * <p>
     * This method just calls {@link #getByCode(String, boolean)
     * getByCode}(code, false).
     * </p>
     *
     * @param code
     *         A locale code.
     *
     * @return
     *         A LocaleCode instance, or null if not found.
     *
     * @see #getByCode(String, boolean)
     */
    public static LocaleCode getByCode(String code)
    {
        return getByCode(code, false);
    }


    /**
     * Get a LocaleCode instance that corresponds to the given code.
     *
     * <p>
     * The format of the code should be either of the following:
     * </p>
     *
     * <ul>
     * <li><i>language</i></li>
     * <li><i>language</i><code>-</code><i>country</i>
     * </ul>
     *
     * <p>
     * where <i>language</i> is an <a
     * href="http://en.wikipedia.org/wiki/ISO_639-1">ISO 639-1</a> code
     * and <i>country</i> is an <a
     * href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1
     * alpha-2</a> code. The separator between <i>language</i> and
     * <i>country</i> should be a hyphen (<code>-</code>) or an underscore
     * (<code>_</code>).
     * </p>
     *
     * <p>
     * Note that if the language part of the given code is one of legacy
     * ones { "iw", "ji" and "in" }, it is regarded as its newer official
     * counterpart { "he", "yi" and "id", respectively }.
     * </p>
     *
     * @param code
     *         A locale code.
     *
     * @param caseSensitive
     *         If true, the <i>language</i> part of the given code must be
     *         lower-case and the <i>country</i> part, if not null, must be
     *         upper-case. If false, this method internally canonicalizes
     *         the given code and then performs search.
     *
     * @return
     *         A LocaleCode instance, or null if not found.
     */
    public static LocaleCode getByCode(String code, boolean caseSensitive)
    {
        if (code == null)
        {
            return null;
        }

        switch (code.length())
        {
            case 2:
                // The given code is regarded as a language code.
                return getByCode(code, null, caseSensitive);

            case 5:
                return getByCode5(code, caseSensitive);

            default:
                return null;
        }
    }


    /**
     * Get a LocaleCode instance that corresponds to the given pair of
     * language code and country code.
     *
     * <p>
     * This method just calls {@link #getByCode(String, String, boolean)
     * getByCode}(language, country, false).
     * </p>
     *
     * @param language
     *         <a href="href="http://en.wikipedia.org/wiki/ISO_639-1"
     *         >ISO 639-1</a> language code. If the given language code
     *         is one of legacy ones { "iw", "ji" and "in" }, it is
     *         regarded as its newer official counterpart { "he", "yi"
     *         and "id", respectively }.
     *
     * @param country
     *         <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2"
     *         >ISO 3166-1 alpha-2</a> country code.
     *
     * @return
     *         A LocaleCode, or null if not found.
     *
     * @see #getByCode(String, String, boolean)
     */
    public static LocaleCode getByCode(String language, String country)
    {
        return getByCode(language, country, false);
    }


    /**
     * Get a LocaleCode instance that corresponds to the given pair of
     * language code and country code.
     *
     * @param language
     *         <a href="href="http://en.wikipedia.org/wiki/ISO_639-1"
     *         >ISO 639-1</a> language code. If the given language code
     *         is one of legacy ones { "iw", "ji" and "in" }, it is
     *         regarded as its newer official counterpart { "he", "yi"
     *         and "id", respectively }.
     *
     * @param country
     *         <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2"
     *         >ISO 3166-1 alpha-2</a> country code.
     *
     * @param caseSensitive
     *         If true, the given language code must be lower-case and
     *         the given country code, if not null, must be upper-case.
     *         If false, this method internally canonicalizes the given
     *         codes and then performs search.
     *
     * @return
     *         A LocaleCode, or null if not found.
     */
    public static LocaleCode getByCode(String language, String country, boolean caseSensitive)
    {
        // Canonicalize the given language code.
        language = LanguageCode.canonicalize(language, caseSensitive);

        if (language == null)
        {
            // There is no LocaleCode whose language is not given.
            return null;
        }

        // Canonicalize the given country code.
        country = CountryCode.canonicalize(country, caseSensitive);

        if (country == null)
        {
            return getByEnumName(language);
        }
        else
        {
            return getByEnumName(language + "_" + country);
        }

    }


    /**
     * Get a LocaleCode instance that corresponds to the given
     * {@link Locale} instance.
     *
     * @param locale
     *         A Locale instance.
     *
     * @return
     *         A LocaleCode instance, or null if not found.
     */
    public static LocaleCode getByLocale(Locale locale)
    {
        if (locale == null)
        {
            return null;
        }

        // Locale.getLanguage() returns either an empty string or
        // a lower-case ISO 639 code.
        String language = locale.getLanguage();

        // Locale.getCountry() returns either an empty string or
        // a upper-case ISO 3166-1 alphe-2 code.
        String country = locale.getCountry();

        // 'language' and 'country' are already lower-case and upper-case,
        // so true can be given as the third argument.
        return getByCode(language, country, true);
    }


    private static LocaleCode getByCode5(String code, boolean caseSensitive)
    {
        // Get the character that separates the language code from the country code.
        char separator = code.charAt(2);

        if (separator == '_')
        {
            if (caseSensitive)
            {
                // The given code can be handled as enum name.
                return getByEnumName(code);
            }
        }
        else if (separator != '-')
        {
            // Bad format.
            return null;
        }

        // Extract the language part and the country part from the given code.
        String language = code.substring(0, 2);
        String country = code.substring(3);

        return getByCode(language, country, caseSensitive);
    }


    private static LocaleCode getByEnumName(String name)
    {
        try
        {
            return Enum.valueOf(LocaleCode.class, name);
        }
        catch (IllegalArgumentException e)
        {
            return null;
        }
    }
}
