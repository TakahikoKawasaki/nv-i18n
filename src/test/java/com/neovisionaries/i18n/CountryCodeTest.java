/*
 * Copyright (C) 2014-2021 Neo Visionaries Inc.
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


import static com.neovisionaries.i18n.CountryCode.getByCode;
import static com.neovisionaries.i18n.CountryCode.getByCodeIgnoreCase;
import static com.neovisionaries.i18n.CountryCode.getByLocale;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.List;
import java.util.Locale;
import org.junit.Test;


public class CountryCodeTest
{
    @Test
    public void test1()
    {
        List<CountryCode> list = CountryCode.findByName(".*United.*");

        assertEquals(6, list.size());

        // AE: United Arab Emirates
        assertTrue(list.contains(CountryCode.AE));

        // GB: United Kingdom
        assertTrue(list.contains(CountryCode.GB));

        // TZ: Tanzania, United Republic of
        //assertTrue(list.contains(CountryCode.TZ));

        // UK: United Kingdom
        assertTrue(list.contains(CountryCode.UK));

        // UM: United States Minor Outlying Islands
        assertTrue(list.contains(CountryCode.UM));

        // US: United States
        assertTrue(list.contains(CountryCode.US));

        // XU: United Kingdom (excluding Northern Ireland)
        assertTrue(list.contains(CountryCode.XU));
    }


    @Test
    public void test2()
    {
        assertSame(Locale.CANADA, CountryCode.CA.toLocale());
    }


    @Test
    public void test3()
    {
        assertSame(Locale.CHINA, CountryCode.CN.toLocale());
    }


    @Test
    public void test4()
    {
        assertSame(Locale.GERMANY, CountryCode.DE.toLocale());
    }


    @Test
    public void test5()
    {
        assertSame(Locale.FRANCE, CountryCode.FR.toLocale());
    }


    @Test
    public void test6()
    {
        assertSame(Locale.UK, CountryCode.GB.toLocale());
    }


    @Test
    public void test7()
    {
        assertSame(Locale.ITALY, CountryCode.IT.toLocale());
    }


    @Test
    public void test8()
    {
        assertSame(Locale.JAPAN, CountryCode.JP.toLocale());
    }


    @Test
    public void test9()
    {
        assertSame(Locale.KOREA, CountryCode.KR.toLocale());
    }


    @Test
    public void test10()
    {
        assertSame(Locale.TAIWAN, CountryCode.TW.toLocale());
    }


    @Test
    public void test11()
    {
        assertSame(Locale.US, CountryCode.US.toLocale());
    }


    @Test
    public void test12()
    {
        Locale undefinedLocale = CountryCode.UNDEFINED.toLocale();

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
    public void test13()
    {
        assertSame(CountryCode.UNDEFINED, getByCode("UNDEFINED"));
    }


    @Test
    public void test14()
    {
        assertNull(getByCode("undefined"));
    }


    @Test
    public void test15()
    {
        assertSame(CountryCode.UNDEFINED, getByCodeIgnoreCase("undefined"));
    }


    @Test
    public void test16()
    {
        assertSame(CountryCode.UNDEFINED, getByLocale(new Locale("", "")));
    }


    @Test
    public void test17()
    {
        assertNull(getByCode(null));
    }


    @Test
    public void test18()
    {
        assertNull(getByCode(""));
    }


    @Test
    public void test19()
    {
        assertSame(CountryCode.AN, CountryCode.getByCode("ANT"));
    }


    @Test
    public void test20()
    {
        assertSame(CountryCode.AN, CountryCode.getByCode("ANHH"));
    }


    @Test
    public void test21()
    {
        assertSame(CountryCode.BU, CountryCode.getByCode("BUR"));
    }


    @Test
    public void test22()
    {
        assertSame(CountryCode.BU, CountryCode.getByCode("BUMM"));
    }


    @Test
    public void test23()
    {
        assertSame(CountryCode.CS, CountryCode.getByCode("SCG"));
    }


    @Test
    public void test24()
    {
        assertSame(CountryCode.CS, CountryCode.getByCode("CSXX"));
    }


    @Test
    public void test25()
    {
        assertSame(CountryCode.NT, CountryCode.getByCode("NTZ"));
    }


    @Test
    public void test26()
    {
        assertSame(CountryCode.NT, CountryCode.getByCode("NTHH"));
    }


    @Test
    public void test27()
    {
        assertSame(CountryCode.TP, CountryCode.getByCode("TMP"));
    }


    @Test
    public void test28()
    {
        assertSame(CountryCode.TP, CountryCode.getByCode("TPTL"));
    }


    @Test
    public void test29()
    {
        assertSame(CountryCode.YU, CountryCode.getByCode("YUG"));
    }


    @Test
    public void test30()
    {
        assertSame(CountryCode.YU, CountryCode.getByCode("YUCS"));
    }


    @Test
    public void test31()
    {
        assertSame(CountryCode.ZR, CountryCode.getByCode("ZAR"));
    }


    @Test
    public void test32()
    {
        assertSame(CountryCode.ZR, CountryCode.getByCode("ZRCD"));
    }


    @Test
    public void test33()
    {
        for (CountryCode cc : CountryCode.values())
        {
            String alpha3 = cc.getAlpha3();

            if (alpha3 == null)
            {
                continue;
            }

            assertEquals(3, alpha3.length());
        }
    }


    @Test
    public void test34()
    {
        // FI and SF have the same alpha-3 code "FIN".
        // FI should be returned for "FIN".
        assertSame(CountryCode.FI, CountryCode.getByCode("FIN"));
    }


    @Test
    public void test35()
    {
        // BU and MM have the same numeric code 104. MM should be used.
        assertSame(CountryCode.MM, CountryCode.getByCode(104));
        assertSame(CountryCode.MM, CountryCode.getByCode(CountryCode.BU.getNumeric()));
        assertSame(CountryCode.MM, CountryCode.getByCode(CountryCode.MM.getNumeric()));
    }


    @Test
    public void test36()
    {
        // CD and ZR have the same numeric code 180. CD should be used.
        assertSame(CountryCode.CD, CountryCode.getByCode(180));
        assertSame(CountryCode.CD, CountryCode.getByCode(CountryCode.CD.getNumeric()));
        assertSame(CountryCode.CD, CountryCode.getByCode(CountryCode.ZR.getNumeric()));
    }


    @Test
    public void test37()
    {
        // FI and SF have the same numeric code 246. FI should be used.
        assertSame(CountryCode.FI, CountryCode.getByCode(246));
        assertSame(CountryCode.FI, CountryCode.getByCode(CountryCode.FI.getNumeric()));
        assertSame(CountryCode.FI, CountryCode.getByCode(CountryCode.SF.getNumeric()));
    }


    @Test
    public void test38()
    {
        // GB and UK have the same numeric code 826. GB should be used.
        assertSame(CountryCode.GB, CountryCode.getByCode(826));
        assertSame(CountryCode.GB, CountryCode.getByCode(CountryCode.GB.getNumeric()));
        assertSame(CountryCode.GB, CountryCode.getByCode(CountryCode.UK.getNumeric()));
    }


    @Test
    public void test39()
    {
        // TL and TP have the same numeric code 626. GB should be used.
        assertSame(CountryCode.TL, CountryCode.getByCode(626));
        assertSame(CountryCode.TL, CountryCode.getByCode(CountryCode.TL.getNumeric()));
        assertSame(CountryCode.TL, CountryCode.getByCode(CountryCode.TP.getNumeric()));
    }


    @Test
    public void test40()
    {
        assertSame(CountryCode.JP, CountryCode.getByCode(392));
    }


    @Test
    public void test41()
    {
        // Checks changed made in version 1.17.
        assertEquals(249, CountryCode.FX.getNumeric());
        assertEquals(810, CountryCode.SU.getNumeric());
        assertEquals(626, CountryCode.TP.getNumeric());
        assertEquals(826, CountryCode.UK.getNumeric());
        assertEquals(180, CountryCode.ZR.getNumeric());
    }

    @Test
    public void test42() {
        // Country code 280 should map to 278, due to legacy applications in payment industry.
        assertEquals(CountryCode.DE, CountryCode.getByCode(280));
    }
}
