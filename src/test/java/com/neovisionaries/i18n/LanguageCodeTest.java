/*
 * Copyright (C) 2012-2013 Neo Visionaries Inc.
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
import org.junit.Test;
import static org.junit.Assert.*;


public class LanguageCodeTest
{
    private static LanguageCode getByCode(String code)
    {
        return LanguageCode.getByCode(code);
    }


    private static LanguageCode getByCode(String code, boolean caseSensitive)
    {
        return LanguageCode.getByCode(code, caseSensitive);
    }


    private static LanguageCode getByLocale(Locale locale)
    {
        return LanguageCode.getByLocale(locale);
    }


    @Test
    public void test1()
    {
        assertSame(getByCode("ja"), LanguageCode.ja);
    }


    @Test
    public void test2()
    {
        assertSame(getByCode("JA"), LanguageCode.ja);
    }


    @Test
    public void test3()
    {
        assertSame(getByCode("ja", true), LanguageCode.ja);
    }


    @Test
    public void test4()
    {
        assertNull(getByCode("JA", true));
    }


    @Test
    public void test5()
    {
        assertSame(getByCode("ja", false), LanguageCode.ja);
    }


    @Test
    public void test6()
    {
        assertSame(getByCode("JA", false), LanguageCode.ja);
    }


    @Test
    public void test7()
    {
        assertNull(getByCode(null));
    }


    @Test
    public void test8()
    {
        assertNull(getByCode(""));
    }


    @Test
    public void test9()
    {
        assertNull(getByCode("?"));
    }


    @Test
    public void test10()
    {
        assertNull(getByCode("??"));
    }


    @Test
    public void test11()
    {
        assertNull(getByCode("???"));
    }


    @Test
    public void test12()
    {
        assertNull(getByCode("????"));
    }


    @Test
    public void test13()
    {
        assertSame(getByCode("he"), LanguageCode.he);
    }


    @Test
    public void test14()
    {
        assertSame(getByCode("iw"), LanguageCode.he);
    }


    @Test
    public void test15()
    {
        assertSame(getByCode("yi"), LanguageCode.yi);
    }


    @Test
    public void test16()
    {
        assertSame(getByCode("ji"), LanguageCode.yi);
    }


    @Test
    public void test17()
    {
        assertSame(getByCode("id"), LanguageCode.id);
    }


    @Test
    public void test18()
    {
        assertSame(getByCode("in"), LanguageCode.id);
    }


    @Test
    public void test19()
    {
        assertSame(LanguageCode.de.toLocale(), Locale.GERMAN);
    }


    @Test
    public void test20()
    {
        assertSame(LanguageCode.en.toLocale(), Locale.ENGLISH);
    }


    @Test
    public void test21()
    {
        assertSame(LanguageCode.fr.toLocale(), Locale.FRENCH);
    }


    @Test
    public void test22()
    {
        assertSame(LanguageCode.it.toLocale(), Locale.ITALIAN);
    }


    @Test
    public void test23()
    {
        assertSame(LanguageCode.ja.toLocale(), Locale.JAPANESE);
    }


    @Test
    public void test24()
    {
        assertSame(LanguageCode.ko.toLocale(), Locale.KOREAN);
    }


    @Test
    public void test25()
    {
        assertSame(LanguageCode.zh.toLocale(), Locale.CHINESE);
    }


    @Test
    public void test26()
    {
        assertNull(getByLocale(null));
    }


    @Test
    public void test27()
    {
        assertNull(getByLocale(new Locale("")));
    }


    @Test
    public void test28()
    {
        assertSame(getByLocale(Locale.CANADA_FRENCH), LanguageCode.fr);
    }


    @Test
    public void test29()
    {
        assertSame(getByLocale(Locale.CHINESE), LanguageCode.zh);
    }


    @Test
    public void test30()
    {
        assertSame(getByLocale(Locale.ENGLISH), LanguageCode.en);
    }


    @Test
    public void test31()
    {
        assertSame(getByLocale(Locale.FRENCH), LanguageCode.fr);
    }


    @Test
    public void test32()
    {
        assertSame(getByLocale(Locale.GERMAN), LanguageCode.de);
    }


    @Test
    public void test33()
    {
        assertSame(getByLocale(Locale.ITALIAN), LanguageCode.it);
    }


    @Test
    public void test34()
    {
        assertSame(getByLocale(Locale.JAPANESE), LanguageCode.ja);
    }


    @Test
    public void test35()
    {
        assertSame(getByLocale(Locale.KOREAN), LanguageCode.ko);
    }


    @Test
    public void test36()
    {
        assertSame(getByLocale(Locale.SIMPLIFIED_CHINESE), LanguageCode.zh);
    }


    @Test
    public void test37()
    {
        assertSame(getByLocale(Locale.TRADITIONAL_CHINESE), LanguageCode.zh);
    }


    @Test
    public void test38()
    {
        assertSame(getByLocale(new Locale("ja")), LanguageCode.ja);
    }


    @Test
    public void test39()
    {
        assertSame(getByLocale(new Locale("ja", "JP")), LanguageCode.ja);
    }


    @Test
    public void test40()
    {
        assertSame(getByCode("bo"), LanguageCode.bo);
    }


    @Test
    public void test41()
    {
        assertSame(getByCode("bod"), LanguageCode.bo);
    }


    @Test
    public void test42()
    {
        assertSame(getByCode("tib"), LanguageCode.bo);
    }


    @Test
    public void test43()
    {
        assertSame(getByCode("eu"), LanguageCode.eu);
    }


    @Test
    public void test44()
    {
        assertSame(getByCode("eus"), LanguageCode.eu);
    }


    @Test
    public void test45()
    {
        assertSame(getByCode("baq"), LanguageCode.eu);
    }


    @Test
    public void test46()
    {
        assertSame(getByCode("cs"), LanguageCode.cs);
    }


    @Test
    public void test47()
    {
        assertSame(getByCode("ces"), LanguageCode.cs);
    }


    @Test
    public void test48()
    {
        assertSame(getByCode("cze"), LanguageCode.cs);
    }


    @Test
    public void test49()
    {
        assertSame(getByCode("cy"), LanguageCode.cy);
    }


    @Test
    public void test50()
    {
        assertSame(getByCode("cym"), LanguageCode.cy);
    }


    @Test
    public void test51()
    {
        assertSame(getByCode("wel"), LanguageCode.cy);
    }


    @Test
    public void test52()
    {
        assertSame(getByCode("de"), LanguageCode.de);
    }


    @Test
    public void test53()
    {
        assertSame(getByCode("deu"), LanguageCode.de);
    }


    @Test
    public void test54()
    {
        assertSame(getByCode("ger"), LanguageCode.de);
    }


    @Test
    public void test55()
    {
        assertSame(getByCode("el"), LanguageCode.el);
    }


    @Test
    public void test56()
    {
        assertSame(getByCode("ell"), LanguageCode.el);
    }


    @Test
    public void test57()
    {
        assertSame(getByCode("gre"), LanguageCode.el);
    }


    @Test
    public void test58()
    {
        assertSame(getByCode("fa"), LanguageCode.fa);
    }


    @Test
    public void test59()
    {
        assertSame(getByCode("per"), LanguageCode.fa);
    }


    @Test
    public void test60()
    {
        assertSame(getByCode("fas"), LanguageCode.fa);
    }


    @Test
    public void test61()
    {
        assertSame(getByCode("fr"), LanguageCode.fr);
    }


    @Test
    public void test62()
    {
        assertSame(getByCode("fra"), LanguageCode.fr);
    }


    @Test
    public void test63()
    {
        assertSame(getByCode("fre"), LanguageCode.fr);
    }


    @Test
    public void test64()
    {
        assertSame(getByCode("hy"), LanguageCode.hy);
    }


    @Test
    public void test65()
    {
        assertSame(getByCode("hye"), LanguageCode.hy);
    }


    @Test
    public void test66()
    {
        assertSame(getByCode("arm"), LanguageCode.hy);
    }


    @Test
    public void test67()
    {
        assertSame(getByCode("is"), LanguageCode.is);
    }


    @Test
    public void test68()
    {
        assertSame(getByCode("isl"), LanguageCode.is);
    }


    @Test
    public void test69()
    {
        assertSame(getByCode("ice"), LanguageCode.is);
    }


    @Test
    public void test70()
    {
        assertSame(getByCode("ka"), LanguageCode.ka);
    }


    @Test
    public void test71()
    {
        assertSame(getByCode("kat"), LanguageCode.ka);
    }


    @Test
    public void test72()
    {
        assertSame(getByCode("geo"), LanguageCode.ka);
    }


    @Test
    public void test73()
    {
        assertSame(getByCode("mi"), LanguageCode.mi);
    }


    @Test
    public void test74()
    {
        assertSame(getByCode("mri"), LanguageCode.mi);
    }


    @Test
    public void test75()
    {
        assertSame(getByCode("mao"), LanguageCode.mi);
    }


    @Test
    public void test76()
    {
        assertSame(getByCode("mk"), LanguageCode.mk);
    }


    @Test
    public void test77()
    {
        assertSame(getByCode("mkd"), LanguageCode.mk);
    }


    @Test
    public void test78()
    {
        assertSame(getByCode("mac"), LanguageCode.mk);
    }


    @Test
    public void test79()
    {
        assertSame(getByCode("ms"), LanguageCode.ms);
    }


    @Test
    public void test80()
    {
        assertSame(getByCode("msa"), LanguageCode.ms);
    }


    @Test
    public void test81()
    {
        assertSame(getByCode("may"), LanguageCode.ms);
    }


    @Test
    public void test82()
    {
        assertSame(getByCode("my"), LanguageCode.my);
    }


    @Test
    public void test83()
    {
        assertSame(getByCode("mya"), LanguageCode.my);
    }


    @Test
    public void test84()
    {
        assertSame(getByCode("bur"), LanguageCode.my);
    }


    @Test
    public void test85()
    {
        assertSame(getByCode("nl"), LanguageCode.nl);
    }


    @Test
    public void test86()
    {
        assertSame(getByCode("nld"), LanguageCode.nl);
    }


    @Test
    public void test87()
    {
        assertSame(getByCode("dut"), LanguageCode.nl);
    }


    @Test
    public void test88()
    {
        assertSame(getByCode("ro"), LanguageCode.ro);
    }


    @Test
    public void test89()
    {
        assertSame(getByCode("ron"), LanguageCode.ro);
    }


    @Test
    public void test90()
    {
        assertSame(getByCode("rum"), LanguageCode.ro);
    }


    @Test
    public void test91()
    {
        assertSame(getByCode("sk"), LanguageCode.sk);
    }


    @Test
    public void test92()
    {
        assertSame(getByCode("slk"), LanguageCode.sk);
    }


    @Test
    public void test93()
    {
        assertSame(getByCode("slo"), LanguageCode.sk);
    }


    @Test
    public void test94()
    {
        assertSame(getByCode("sq"), LanguageCode.sq);
    }


    @Test
    public void test95()
    {
        assertSame(getByCode("sqi"), LanguageCode.sq);
    }


    @Test
    public void test96()
    {
        assertSame(getByCode("alb"), LanguageCode.sq);
    }


    @Test
    public void test97()
    {
        assertSame(LanguageCode.bo.getAlpha3(), LanguageAlpha3Code.bod);
    }


    @Test
    public void test98()
    {
        assertSame(LanguageCode.eu.getAlpha3(), LanguageAlpha3Code.eus);
    }


    @Test
    public void test99()
    {
        assertSame(LanguageCode.cs.getAlpha3(), LanguageAlpha3Code.ces);
    }


    @Test
    public void test100()
    {
        assertSame(LanguageCode.cy.getAlpha3(), LanguageAlpha3Code.cym);
    }


    @Test
    public void test101()
    {
        assertSame(LanguageCode.de.getAlpha3(), LanguageAlpha3Code.deu);
    }


    @Test
    public void test102()
    {
        assertSame(LanguageCode.el.getAlpha3(), LanguageAlpha3Code.ell);
    }


    @Test
    public void test103()
    {
        assertSame(LanguageCode.fa.getAlpha3(), LanguageAlpha3Code.fas);
    }


    @Test
    public void test104()
    {
        assertSame(LanguageCode.fr.getAlpha3(), LanguageAlpha3Code.fra);
    }


    @Test
    public void test105()
    {
        assertSame(LanguageCode.hy.getAlpha3(), LanguageAlpha3Code.hye);
    }


    @Test
    public void test106()
    {
        assertSame(LanguageCode.is.getAlpha3(), LanguageAlpha3Code.isl);
    }


    @Test
    public void test107()
    {
        assertSame(LanguageCode.ka.getAlpha3(), LanguageAlpha3Code.kat);
    }


    @Test
    public void test108()
    {
        assertSame(LanguageCode.mi.getAlpha3(), LanguageAlpha3Code.mri);
    }


    @Test
    public void test109()
    {
        assertSame(LanguageCode.mk.getAlpha3(), LanguageAlpha3Code.mkd);
    }


    @Test
    public void test110()
    {
        assertSame(LanguageCode.ms.getAlpha3(), LanguageAlpha3Code.msa);
    }


    @Test
    public void test111()
    {
        assertSame(LanguageCode.my.getAlpha3(), LanguageAlpha3Code.mya);
    }


    @Test
    public void test112()
    {
        assertSame(LanguageCode.nl.getAlpha3(), LanguageAlpha3Code.nld);
    }


    @Test
    public void test113()
    {
        assertSame(LanguageCode.ro.getAlpha3(), LanguageAlpha3Code.ron);
    }


    @Test
    public void test114()
    {
        assertSame(LanguageCode.sk.getAlpha3(), LanguageAlpha3Code.slk);
    }


    @Test
    public void test115()
    {
        assertSame(LanguageCode.sq.getAlpha3(), LanguageAlpha3Code.sqi);
    }


    @Test
    public void test116()
    {
        assertSame(LanguageCode.ja.getAlpha3(), LanguageAlpha3Code.jpn);
    }


    @Test
    public void test117()
    {
        assertSame(LanguageCode.ja.getName(), "Japanese");
    }
}
