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
    de(LanguageCode.de, null),

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
    en(LanguageCode.en, null),

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
    fr(LanguageCode.fr, null),

    /**
     * {@link LanguageCode#fr French}, {@link CountryCode#BE Belgium}
     */
    fr_BE(LanguageCode.fr, CountryCode.BE),

    /**
     * {@link LanguageCode#fr French}, {@link CountryCode#CA Canada}
     */
    fr_CA(LanguageCode.fr, CountryCode.CA),

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
    it(LanguageCode.it, null),

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
    ja(LanguageCode.ja, null),

    /**
     * {@link LanguageCode#ja Japanese}, {@link CountryCode#JP Japan}
     */
    ja_JP(LanguageCode.ja, CountryCode.JP),

    /**
     * {@link LanguageCode#ko Korian}
     */
    ko(LanguageCode.ko, null),

    /**
     * {@link LanguageCode#ko Korian}, {@link CountryCode#KR Republic of Korea}
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
    zh(LanguageCode.zh, null),

    /**
     * {@link LanguageCode#zh Chinese}, {@link CountryCode#CN China}
     */
    zh_CN(LanguageCode.zh, CountryCode.CN),

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
    zh_TW(LanguageCode.zh, CountryCode.TW),
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


    public LanguageCode getLanguage()
    {
        return language;
    }


    public CountryCode getCountry()
    {
        return country;
    }


    @Override
    public String toString()
    {
        return string;
    }
}
