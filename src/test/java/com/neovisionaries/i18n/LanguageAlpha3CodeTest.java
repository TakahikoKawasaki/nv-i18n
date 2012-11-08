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


import org.junit.Test;
import static org.junit.Assert.*;


public class LanguageAlpha3CodeTest
{
    private static LanguageAlpha3Code getByCode(String code)
    {
        return LanguageAlpha3Code.getByCode(code);
    }


    private static LanguageAlpha3Code getByCode(String code, boolean caseSensitive)
    {
        return LanguageAlpha3Code.getByCode(code, caseSensitive);
    }


    @Test
    public void test1()
    {
        assertNull(getByCode(null));
    }


    @Test
    public void test2()
    {
        assertNull(getByCode(""));
    }


    @Test
    public void test3()
    {
        assertNull(getByCode("?"));
    }


    @Test
    public void test4()
    {
        assertNull(getByCode("??"));
    }


    @Test
    public void test5()
    {
        assertNull(getByCode("???"));
    }


    @Test
    public void test6()
    {
        assertNull(getByCode("????"));
    }


    @Test
    public void test7()
    {
        assertEquals(getByCode("jpn"), LanguageAlpha3Code.jpn);
    }


    @Test
    public void test8()
    {
        assertEquals(getByCode("JPN"), LanguageAlpha3Code.jpn);
    }


    @Test
    public void test9()
    {
        assertEquals(getByCode("jpn", true), LanguageAlpha3Code.jpn);
    }


    @Test
    public void test10()
    {
        assertNull(getByCode("JPN", true));
    }


    @Test
    public void test11()
    {
        assertEquals(getByCode("jpn", false), LanguageAlpha3Code.jpn);
    }


    @Test
    public void test12()
    {
        assertEquals(getByCode("JPN", false), LanguageAlpha3Code.jpn);
    }


    @Test
    public void test13()
    {
        assertEquals(getByCode("he"), LanguageAlpha3Code.heb);
    }


    @Test
    public void test14()
    {
        assertEquals(getByCode("iw"), LanguageAlpha3Code.heb);
    }


    @Test
    public void test15()
    {
        assertEquals(getByCode("yi"), LanguageAlpha3Code.yid);
    }


    @Test
    public void test16()
    {
        assertEquals(getByCode("ji"), LanguageAlpha3Code.yid);
    }


    @Test
    public void test17()
    {
        assertEquals(getByCode("id"), LanguageAlpha3Code.ind);
    }


    @Test
    public void test18()
    {
        assertEquals(getByCode("in"), LanguageAlpha3Code.ind);
    }
}
