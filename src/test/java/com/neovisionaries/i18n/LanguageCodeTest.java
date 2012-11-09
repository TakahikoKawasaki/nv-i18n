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
        assertEquals(getByCode("ja"), LanguageCode.ja);
    }


    @Test
    public void test2()
    {
        assertEquals(getByCode("JA"), LanguageCode.ja);
    }


    @Test
    public void test3()
    {
        assertEquals(getByCode("ja", true), LanguageCode.ja);
    }


    @Test
    public void test4()
    {
        assertNull(getByCode("JA", true));
    }


    @Test
    public void test5()
    {
        assertEquals(getByCode("ja", false), LanguageCode.ja);
    }


    @Test
    public void test6()
    {
        assertEquals(getByCode("JA", false), LanguageCode.ja);
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
        assertEquals(getByCode("he"), LanguageCode.he);
    }


    @Test
    public void test14()
    {
        assertEquals(getByCode("iw"), LanguageCode.he);
    }


    @Test
    public void test15()
    {
        assertEquals(getByCode("yi"), LanguageCode.yi);
    }


    @Test
    public void test16()
    {
        assertEquals(getByCode("ji"), LanguageCode.yi);
    }


    @Test
    public void test17()
    {
        assertEquals(getByCode("id"), LanguageCode.id);
    }


    @Test
    public void test18()
    {
        assertEquals(getByCode("in"), LanguageCode.id);
    }


    @Test
    public void test19()
    {
        assertEquals(LanguageCode.de.toLocale(), Locale.GERMAN);
    }


    @Test
    public void test20()
    {
        assertEquals(LanguageCode.en.toLocale(), Locale.ENGLISH);
    }


    @Test
    public void test21()
    {
        assertEquals(LanguageCode.fr.toLocale(), Locale.FRENCH);
    }


    @Test
    public void test22()
    {
        assertEquals(LanguageCode.it.toLocale(), Locale.ITALIAN);
    }


    @Test
    public void test23()
    {
        assertEquals(LanguageCode.ja.toLocale(), Locale.JAPANESE);
    }


    @Test
    public void test24()
    {
        assertEquals(LanguageCode.ko.toLocale(), Locale.KOREAN);
    }


    @Test
    public void test25()
    {
        assertEquals(LanguageCode.zh.toLocale(), Locale.CHINESE);
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
        assertEquals(getByLocale(Locale.CANADA_FRENCH), LanguageCode.fr);
    }


    @Test
    public void test29()
    {
        assertEquals(getByLocale(Locale.CHINESE), LanguageCode.zh);
    }


    @Test
    public void test30()
    {
        assertEquals(getByLocale(Locale.ENGLISH), LanguageCode.en);
    }


    @Test
    public void test31()
    {
        assertEquals(getByLocale(Locale.FRENCH), LanguageCode.fr);
    }


    @Test
    public void test32()
    {
        assertEquals(getByLocale(Locale.GERMAN), LanguageCode.de);
    }


    @Test
    public void test33()
    {
        assertEquals(getByLocale(Locale.ITALIAN), LanguageCode.it);
    }


    @Test
    public void test34()
    {
        assertEquals(getByLocale(Locale.JAPANESE), LanguageCode.ja);
    }


    @Test
    public void test35()
    {
        assertEquals(getByLocale(Locale.KOREAN), LanguageCode.ko);
    }


    @Test
    public void test36()
    {
        assertEquals(getByLocale(Locale.SIMPLIFIED_CHINESE), LanguageCode.zh);
    }


    @Test
    public void test37()
    {
        assertEquals(getByLocale(Locale.TRADITIONAL_CHINESE), LanguageCode.zh);
    }


    @Test
    public void test38()
    {
        assertEquals(getByLocale(new Locale("ja")), LanguageCode.ja);
    }


    @Test
    public void test39()
    {
        assertEquals(getByLocale(new Locale("ja", "JP")), LanguageCode.ja);
    }


    @Test
    public void test40()
    {
        assertEquals(getByCode("bo"), LanguageCode.bo);
    }


    @Test
    public void test41()
    {
        assertEquals(getByCode("bod"), LanguageCode.bo);
    }


    @Test
    public void test42()
    {
        assertEquals(getByCode("tib"), LanguageCode.bo);
    }


    @Test
    public void test43()
    {
        assertEquals(getByCode("eu"), LanguageCode.eu);
    }


    @Test
    public void test44()
    {
        assertEquals(getByCode("eus"), LanguageCode.eu);
    }


    @Test
    public void test45()
    {
        assertEquals(getByCode("baq"), LanguageCode.eu);
    }


    @Test
    public void test46()
    {
        assertEquals(getByCode("cs"), LanguageCode.cs);
    }


    @Test
    public void test47()
    {
        assertEquals(getByCode("ces"), LanguageCode.cs);
    }


    @Test
    public void test48()
    {
        assertEquals(getByCode("cze"), LanguageCode.cs);
    }


    @Test
    public void test49()
    {
        assertEquals(getByCode("cy"), LanguageCode.cy);
    }


    @Test
    public void test50()
    {
        assertEquals(getByCode("cym"), LanguageCode.cy);
    }


    @Test
    public void test51()
    {
        assertEquals(getByCode("wel"), LanguageCode.cy);
    }


    @Test
    public void test52()
    {
        assertEquals(getByCode("de"), LanguageCode.de);
    }


    @Test
    public void test53()
    {
        assertEquals(getByCode("deu"), LanguageCode.de);
    }


    @Test
    public void test54()
    {
        assertEquals(getByCode("ger"), LanguageCode.de);
    }


    @Test
    public void test55()
    {
        assertEquals(getByCode("el"), LanguageCode.el);
    }


    @Test
    public void test56()
    {
        assertEquals(getByCode("ell"), LanguageCode.el);
    }


    @Test
    public void test57()
    {
        assertEquals(getByCode("gre"), LanguageCode.el);
    }


    @Test
    public void test58()
    {
        assertEquals(getByCode("fa"), LanguageCode.fa);
    }


    @Test
    public void test59()
    {
        assertEquals(getByCode("per"), LanguageCode.fa);
    }


    @Test
    public void test60()
    {
        assertEquals(getByCode("fas"), LanguageCode.fa);
    }


    @Test
    public void test61()
    {
        assertEquals(getByCode("fr"), LanguageCode.fr);
    }


    @Test
    public void test62()
    {
        assertEquals(getByCode("fra"), LanguageCode.fr);
    }


    @Test
    public void test63()
    {
        assertEquals(getByCode("fre"), LanguageCode.fr);
    }


    @Test
    public void test64()
    {
        assertEquals(getByCode("hy"), LanguageCode.hy);
    }


    @Test
    public void test65()
    {
        assertEquals(getByCode("hye"), LanguageCode.hy);
    }


    @Test
    public void test66()
    {
        assertEquals(getByCode("arm"), LanguageCode.hy);
    }


    @Test
    public void test67()
    {
        assertEquals(getByCode("is"), LanguageCode.is);
    }


    @Test
    public void test68()
    {
        assertEquals(getByCode("isl"), LanguageCode.is);
    }


    @Test
    public void test69()
    {
        assertEquals(getByCode("ice"), LanguageCode.is);
    }


    @Test
    public void test70()
    {
        assertEquals(getByCode("ka"), LanguageCode.ka);
    }


    @Test
    public void test71()
    {
        assertEquals(getByCode("kat"), LanguageCode.ka);
    }


    @Test
    public void test72()
    {
        assertEquals(getByCode("geo"), LanguageCode.ka);
    }


    @Test
    public void test73()
    {
        assertEquals(getByCode("mi"), LanguageCode.mi);
    }


    @Test
    public void test74()
    {
        assertEquals(getByCode("mri"), LanguageCode.mi);
    }


    @Test
    public void test75()
    {
        assertEquals(getByCode("mao"), LanguageCode.mi);
    }


    @Test
    public void test76()
    {
        assertEquals(getByCode("mk"), LanguageCode.mk);
    }


    @Test
    public void test77()
    {
        assertEquals(getByCode("mkd"), LanguageCode.mk);
    }


    @Test
    public void test78()
    {
        assertEquals(getByCode("mac"), LanguageCode.mk);
    }


    @Test
    public void test79()
    {
        assertEquals(getByCode("ms"), LanguageCode.ms);
    }


    @Test
    public void test80()
    {
        assertEquals(getByCode("msa"), LanguageCode.ms);
    }


    @Test
    public void test81()
    {
        assertEquals(getByCode("may"), LanguageCode.ms);
    }


    @Test
    public void test82()
    {
        assertEquals(getByCode("my"), LanguageCode.my);
    }


    @Test
    public void test83()
    {
        assertEquals(getByCode("mya"), LanguageCode.my);
    }


    @Test
    public void test84()
    {
        assertEquals(getByCode("bur"), LanguageCode.my);
    }


    @Test
    public void test85()
    {
        assertEquals(getByCode("nl"), LanguageCode.nl);
    }


    @Test
    public void test86()
    {
        assertEquals(getByCode("nld"), LanguageCode.nl);
    }


    @Test
    public void test87()
    {
        assertEquals(getByCode("dut"), LanguageCode.nl);
    }


    @Test
    public void test88()
    {
        assertEquals(getByCode("ro"), LanguageCode.ro);
    }


    @Test
    public void test89()
    {
        assertEquals(getByCode("ron"), LanguageCode.ro);
    }


    @Test
    public void test90()
    {
        assertEquals(getByCode("rum"), LanguageCode.ro);
    }


    @Test
    public void test91()
    {
        assertEquals(getByCode("sk"), LanguageCode.sk);
    }


    @Test
    public void test92()
    {
        assertEquals(getByCode("slk"), LanguageCode.sk);
    }


    @Test
    public void test93()
    {
        assertEquals(getByCode("slo"), LanguageCode.sk);
    }


    @Test
    public void test94()
    {
        assertEquals(getByCode("sq"), LanguageCode.sq);
    }


    @Test
    public void test95()
    {
        assertEquals(getByCode("sqi"), LanguageCode.sq);
    }


    @Test
    public void test96()
    {
        assertEquals(getByCode("alb"), LanguageCode.sq);
    }


    @Test
    public void test97()
    {
        assertEquals(LanguageCode.bo.getAlpha3(), LanguageAlpha3Code.bod);
    }


    @Test
    public void test98()
    {
        assertEquals(LanguageCode.eu.getAlpha3(), LanguageAlpha3Code.eus);
    }


    @Test
    public void test99()
    {
        assertEquals(LanguageCode.cs.getAlpha3(), LanguageAlpha3Code.ces);
    }


    @Test
    public void test100()
    {
        assertEquals(LanguageCode.cy.getAlpha3(), LanguageAlpha3Code.cym);
    }


    @Test
    public void test101()
    {
        assertEquals(LanguageCode.de.getAlpha3(), LanguageAlpha3Code.deu);
    }


    @Test
    public void test102()
    {
        assertEquals(LanguageCode.el.getAlpha3(), LanguageAlpha3Code.ell);
    }


    @Test
    public void test103()
    {
        assertEquals(LanguageCode.fa.getAlpha3(), LanguageAlpha3Code.fas);
    }


    @Test
    public void test104()
    {
        assertEquals(LanguageCode.fr.getAlpha3(), LanguageAlpha3Code.fra);
    }


    @Test
    public void test105()
    {
        assertEquals(LanguageCode.hy.getAlpha3(), LanguageAlpha3Code.hye);
    }


    @Test
    public void test106()
    {
        assertEquals(LanguageCode.is.getAlpha3(), LanguageAlpha3Code.isl);
    }


    @Test
    public void test107()
    {
        assertEquals(LanguageCode.ka.getAlpha3(), LanguageAlpha3Code.kat);
    }


    @Test
    public void test108()
    {
        assertEquals(LanguageCode.mi.getAlpha3(), LanguageAlpha3Code.mri);
    }


    @Test
    public void test109()
    {
        assertEquals(LanguageCode.mk.getAlpha3(), LanguageAlpha3Code.mkd);
    }


    @Test
    public void test110()
    {
        assertEquals(LanguageCode.ms.getAlpha3(), LanguageAlpha3Code.msa);
    }


    @Test
    public void test111()
    {
        assertEquals(LanguageCode.my.getAlpha3(), LanguageAlpha3Code.mya);
    }


    @Test
    public void test112()
    {
        assertEquals(LanguageCode.nl.getAlpha3(), LanguageAlpha3Code.nld);
    }


    @Test
    public void test113()
    {
        assertEquals(LanguageCode.ro.getAlpha3(), LanguageAlpha3Code.ron);
    }


    @Test
    public void test114()
    {
        assertEquals(LanguageCode.sk.getAlpha3(), LanguageAlpha3Code.slk);
    }


    @Test
    public void test115()
    {
        assertEquals(LanguageCode.sq.getAlpha3(), LanguageAlpha3Code.sqi);
    }


    @Test
    public void test116()
    {
        assertEquals(LanguageCode.ja.getAlpha3(), LanguageAlpha3Code.jpn);
    }


    @Test
    public void test117()
    {
        assertEquals(LanguageCode.ja.getName(), "Japanese");
    }
}
