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


import static com.neovisionaries.i18n.LocaleCode.getByCode;
import static com.neovisionaries.i18n.LocaleCode.getByCountry;
import static com.neovisionaries.i18n.LocaleCode.getByLanguage;
import static com.neovisionaries.i18n.LocaleCode.getByLocale;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.junit.Test;


public class LocaleCodeTest
{
    private static void assertListEquals(List<LocaleCode> list1, List<LocaleCode> list2)
    {
        if (list1 == null)
        {
            if (list2 == null)
            {
                // Equals
                return;
            }
            else
            {
                fail();
                return;
            }
        }
        else if (list2 == null)
        {
            fail();
            return;
        }

        int size = list1.size();

        if (size != list2.size())
        {
            fail();
            return;
        }

        for (int i = 0; i < size; ++i)
        {
            if (list1.get(i) != list2.get(i))
            {
                fail();
                return;
            }
        }
    }


    @Test
    public void test1()
    {
        List<LocaleCode> expected = new ArrayList<LocaleCode>();
        expected.add(LocaleCode.ar);
        expected.add(LocaleCode.ar_AE);
        expected.add(LocaleCode.ar_BH);
        expected.add(LocaleCode.ar_DZ);
        expected.add(LocaleCode.ar_EG);
        expected.add(LocaleCode.ar_IQ);
        expected.add(LocaleCode.ar_JO);
        expected.add(LocaleCode.ar_KW);
        expected.add(LocaleCode.ar_LB);
        expected.add(LocaleCode.ar_LY);
        expected.add(LocaleCode.ar_MA);
        expected.add(LocaleCode.ar_OM);
        expected.add(LocaleCode.ar_QA);
        expected.add(LocaleCode.ar_SA);
        expected.add(LocaleCode.ar_SD);
        expected.add(LocaleCode.ar_SY);
        expected.add(LocaleCode.ar_TN);
        expected.add(LocaleCode.ar_YE);

        List<LocaleCode> actual = getByLanguage(LanguageCode.ar);

        assertListEquals(expected, actual);
    }


    @Test
    public void test2()
    {
        List<LocaleCode> expected = new ArrayList<LocaleCode>();
        List<LocaleCode> actual = getByLanguage((LanguageCode)null);

        assertListEquals(expected, actual);
    }


    @Test
    public void test3()
    {
        List<LocaleCode> expected = new ArrayList<LocaleCode>();
        expected.add(LocaleCode.de_CH);
        expected.add(LocaleCode.fr_CH);
        expected.add(LocaleCode.it_CH);

        List<LocaleCode> actual = getByCountry(CountryCode.CH);

        assertListEquals(expected, actual);
    }


    @Test
    public void test4()
    {
        List<LocaleCode> expected = new ArrayList<LocaleCode>();
        List<LocaleCode> actual = getByCountry((CountryCode)null);

        assertListEquals(expected, actual);
    }


    @Test
    public void test5()
    {
        assertSame(Locale.GERMAN, LocaleCode.de.toLocale());
    }


    @Test
    public void test6()
    {
        assertSame(Locale.ENGLISH, LocaleCode.en.toLocale());
    }


    @Test
    public void test7()
    {
        assertSame(Locale.FRENCH, LocaleCode.fr.toLocale());
    }


    @Test
    public void test8()
    {
        assertSame(Locale.CANADA_FRENCH, LocaleCode.fr_CA.toLocale());
    }


    @Test
    public void test9()
    {
        assertSame(Locale.ITALIAN, LocaleCode.it.toLocale());
    }


    @Test
    public void test10()
    {
        assertSame(Locale.JAPANESE, LocaleCode.ja.toLocale());
    }


    @Test
    public void test11()
    {
        assertSame(Locale.KOREAN, LocaleCode.ko.toLocale());
    }


    @Test
    public void test12()
    {
        assertSame(Locale.CHINESE, LocaleCode.zh.toLocale());
    }


    @Test
    public void test13()
    {
        assertSame(Locale.SIMPLIFIED_CHINESE, LocaleCode.zh_CN.toLocale());
    }


    @Test
    public void test14()
    {
        assertSame(Locale.TRADITIONAL_CHINESE, LocaleCode.zh_TW.toLocale());
    }


    @Test
    public void test15()
    {
        Locale undefinedLocale = LocaleCode.undefined.toLocale();

        try
        {
            Locale root = (Locale)Locale.class.getDeclaredField("ROOT").get(null);
            assertSame(root, undefinedLocale);
        }
        catch (Exception e)
        {
            assertEquals("", undefinedLocale.getLanguage());
            assertEquals("", undefinedLocale.getCountry());
        }
    }


    @Test
    public void test16()
    {
        assertSame(LocaleCode.ja, getByLocale(Locale.JAPANESE));
    }


    @Test
    public void test17()
    {
        assertSame(LocaleCode.ja_JP, getByLocale(Locale.JAPAN));
    }


    @Test
    public void test18()
    {
        assertSame(LocaleCode.undefined, getByLocale(new Locale("", "")));
    }


    @Test
    public void test19()
    {
        assertSame(LocaleCode.undefined, getByCode("undefined", (String)null));
    }


    @Test
    public void test20()
    {
        assertNull(LocaleCode.getByCode("UNDEFINED", (String)null));
    }


    @Test
    public void test21()
    {
        assertSame(LocaleCode.undefined, getByCode("UNDEFINED", (String)null, false));
    }


    @Test
    public void test22()
    {
        assertSame(LocaleCode.undefined, getByCode("undefined", "UNDEFINED"));
    }


    @Test
    public void test23()
    {
        assertNull(getByCode("undefined", "undefined"));
    }


    @Test
    public void test24()
    {
        assertSame(LocaleCode.undefined, getByCode("undefined", "undefined", false));
    }


    @Test
    public void test25()
    {
        assertSame(LocaleCode.undefined, getByCode("undefined"));
    }


    @Test
    public void test26()
    {
        assertNull(getByCode("UNDEFINED"));
    }


    @Test
    public void test27()
    {
        assertSame(LocaleCode.undefined, getByCode("UNDEFINED", false));
    }


    @Test
    public void test28()
    {
        assertSame(LocaleCode.undefined, getByCode("undefined-UNDEFINED"));
    }


    @Test
    public void test29()
    {
        assertNull(getByCode("undefined-undefined"));
    }


    @Test
    public void test30()
    {
        assertSame(LocaleCode.undefined, getByCode("undefined-undefined", false));
    }


    @Test
    public void test31()
    {
        assertSame(LocaleCode.undefined, getByCode("undefined_UNDEFINED"));
    }


    @Test
    public void test32()
    {
        assertNull(getByCode("undefined_undefined"));
    }


    @Test
    public void test33()
    {
        assertSame(LocaleCode.undefined, getByCode("undefined_undefined", false));
    }


    @Test
    public void test34()
    {
        assertSame(LocaleCode.ja, getByCode("ja"));
    }


    @Test
    public void test35()
    {
        assertNull(getByCode("JA"));
    }


    @Test
    public void test36()
    {
        assertSame(LocaleCode.ja, getByCode("JA", false));
    }


    @Test
    public void test37()
    {
        assertSame(LocaleCode.ja_JP, getByCode("ja-JP"));
    }


    @Test
    public void test38()
    {
        assertNull(getByCode("ja-jp"));
    }


    @Test
    public void test39()
    {
        assertSame(LocaleCode.ja_JP, getByCode("ja-jp", false));
    }


    @Test
    public void test40()
    {
        assertSame(LocaleCode.ja_JP, getByCode("ja_JP"));
    }


    @Test
    public void test41()
    {
        assertNull(getByCode("ja_jp"));
    }


    @Test
    public void test42()
    {
        assertSame(LocaleCode.ja_JP, getByCode("ja_jp", false));
    }


    @Test
    public void test43()
    {
        assertNull(getByCode("ja+JP"));
    }


    @Test
    public void test44()
    {
        assertNull(getByCode(null));
    }


    @Test
    public void test45()
    {
        assertNull(getByCode(""));
    }
}
