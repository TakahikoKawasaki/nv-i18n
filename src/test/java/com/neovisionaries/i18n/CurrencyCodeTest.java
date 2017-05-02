/*
 * Copyright (C) 2014 Neo Visionaries Inc.
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


import static com.neovisionaries.i18n.CurrencyCode.getByCode;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.List;
import java.util.regex.Pattern;

import org.junit.Test;


public class CurrencyCodeTest
{
    @Test
    public void test1()
    {
        assertSame(CurrencyCode.JPY, getByCode("JPY"));
    }


    @Test
    public void test2()
    {
        assertNull(getByCode("jpy"));
    }


    @Test
    public void test3()
    {
        assertSame(CurrencyCode.JPY, getByCode("JPY", true));
    }


    @Test
    public void test4()
    {
        assertNull(getByCode("jpy", true));
    }


    @Test
    public void test5()
    {
        assertSame(CurrencyCode.JPY, getByCode("JPY", false));
    }


    @Test
    public void test6()
    {
        assertSame(CurrencyCode.JPY, getByCode("jpy", false));
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
        assertNull(getByCode("???"));
    }

    @Test
    public void test10()
    {
        assertNull(getByCode(123));
    }

    @Test
    public void test11()
    {
        assertEquals(getByCode(969), CurrencyCode.MGA);
    }

    @Test
    public void test12()
    {
        assertFalse(CurrencyCode.JPY.isFund());

        assertTrue(CurrencyCode.BOV.isFund());
        assertTrue(CurrencyCode.CHE.isFund());
        assertTrue(CurrencyCode.CHW.isFund());
        assertTrue(CurrencyCode.CLF.isFund());
        assertTrue(CurrencyCode.COU.isFund());
        assertTrue(CurrencyCode.MXV.isFund());
        assertTrue(CurrencyCode.USN.isFund());
        assertTrue(CurrencyCode.USS.isFund());
        assertTrue(CurrencyCode.UYI.isFund());
    }


    @Test
    public void test13()
    {
        assertFalse(CurrencyCode.JPY.isPreciousMetal());

        assertTrue(CurrencyCode.XAG.isPreciousMetal());
        assertTrue(CurrencyCode.XAU.isPreciousMetal());
        assertTrue(CurrencyCode.XPD.isPreciousMetal());
        assertTrue(CurrencyCode.XPT.isPreciousMetal());
    }


    @Test
    public void test14()
    {
        List<CountryCode> list = CurrencyCode.JPY.getCountryList();

        assertTrue(list.size() == 1);
        assertSame(CountryCode.JP, list.get(0));
    }


    @Test
    public void test15()
    {
        List<CountryCode> list = CurrencyCode.XXX.getCountryList();

        assertTrue(list.size() == 0);
    }


    @Test
    public void test16()
    {
        List<CurrencyCode> list = CurrencyCode.findByName(".*Ruble");

        assertEquals(4, list.size());

        // BYN: Belarusian Ruble
        assertTrue(list.contains(CurrencyCode.BYN));

        // BYR: Belarusian Ruble
        assertTrue(list.contains(CurrencyCode.BYR));

        // RUB: Russian Ruble
        assertTrue(list.contains(CurrencyCode.RUB));

        // RUR: Russian Ruble before the 1998 denomination
        assertTrue(list.contains(CurrencyCode.RUR));
    }


    @Test
    public void test17()
    {
        assertSame(CurrencyCode.UNDEFINED, getByCode("UNDEFINED"));
    }


    @Test
    public void test18()
    {
        assertNull(getByCode("undefined"));
    }


    @Test
    public void test19()
    {
        assertSame(CurrencyCode.UNDEFINED, getByCode("undefined", false));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test20()
    {
        CurrencyCode.findByName((String) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test21()
    {
        CurrencyCode.findByName((Pattern) null);
    }

    @Test
    public void test22()
    {
        List<CurrencyCode> list = CurrencyCode.getByCountry(CountryCode.EE);

        assertEquals(1, list.size());

        // EUR: Euro
        assertTrue(list.contains(CurrencyCode.EUR));
    }

    @Test
    public void test23()
    {
        List<CurrencyCode> listRetrievedCaseSensitiveSearch = CurrencyCode.getByCountry("EE");

        assertEquals(1, listRetrievedCaseSensitiveSearch.size());

        // EUR: Euro
        assertTrue(listRetrievedCaseSensitiveSearch.contains(CurrencyCode.EUR));
    }

    @Test
    public void test24()
    {      
        List<CurrencyCode> listRetrievedCaseInsensitiveSearch1 = CurrencyCode.getByCountry("eE", false);
        List<CurrencyCode> listRetrievedCaseInsensitiveSearch2 = CurrencyCode.getByCountryIgnoreCase("By");

        assertEquals(1, listRetrievedCaseInsensitiveSearch1.size());
        assertEquals(2, listRetrievedCaseInsensitiveSearch2.size());

        // EUR: Euro
        assertTrue(listRetrievedCaseInsensitiveSearch1.contains(CurrencyCode.EUR));
        // BYN: Belarusian ruble
        assertTrue(listRetrievedCaseInsensitiveSearch2.contains(CurrencyCode.BYN));
    }

    @Test
    public void test25()
    {
        List<CurrencyCode> list = CurrencyCode.getByCountry((CountryCode) null);

        assertTrue(list.isEmpty());
    }
}
