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


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.Test;


public class CurrencyCodeTest
{
    private static CurrencyCode getByCode(String code)
    {
        return CurrencyCode.getByCode(code);
    }


    private static CurrencyCode getByCode(String code, boolean caseSensitive)
    {
        return CurrencyCode.getByCode(code, caseSensitive);
    }


    @Test
    public void test1()
    {
        assertSame(getByCode("JPY"), CurrencyCode.JPY);
    }


    @Test
    public void test2()
    {
        assertNull(getByCode("jpy"));
    }


    @Test
    public void test3()
    {
        assertSame(getByCode("JPY", true), CurrencyCode.JPY);
    }


    @Test
    public void test4()
    {
        assertNull(getByCode("jpy", true));
    }


    @Test
    public void test5()
    {
        assertSame(getByCode("JPY", false), CurrencyCode.JPY);
    }


    @Test
    public void test6()
    {
        assertSame(getByCode("jpy", false), CurrencyCode.JPY);
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
    public void test11()
    {
        assertFalse(CurrencyCode.JPY.isPreciousMetal());

        assertTrue(CurrencyCode.XAG.isPreciousMetal());
        assertTrue(CurrencyCode.XAU.isPreciousMetal());
        assertTrue(CurrencyCode.XPD.isPreciousMetal());
        assertTrue(CurrencyCode.XPT.isPreciousMetal());
    }


    @Test
    public void test12()
    {
        List<CountryCode> list = CurrencyCode.JPY.getCountryList();

        assertTrue(list.size() == 1);
        assertSame(list.get(0), CountryCode.JP);
    }


    @Test
    public void test13()
    {
        List<CountryCode> list = CurrencyCode.XXX.getCountryList();

        assertTrue(list.size() == 0);
    }


    @Test
    public void test14()
    {
        List<CurrencyCode> list = CurrencyCode.findByName(".*Ruble");

        assertEquals(2, list.size());

        // BYR: Belarussian Ruble
        assertTrue(list.contains(CurrencyCode.BYR));

        // RUB: Russian Ruble
        assertTrue(list.contains(CurrencyCode.RUB));
    }
}
