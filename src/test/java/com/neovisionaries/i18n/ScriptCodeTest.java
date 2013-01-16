/*
 * Copyright (C) 2013 Neo Visionaries Inc.
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


public class ScriptCodeTest
{
    private static ScriptCode getByCode(int code)
    {
        return ScriptCode.getByCode(code);
    }


    private static ScriptCode getByCode(String code)
    {
        return ScriptCode.getByCode(code);
    }


    private static ScriptCode getByCode(String code, boolean caseSensitive)
    {
        return ScriptCode.getByCode(code, caseSensitive);
    }


    @Test
    public void test1()
    {
        assertSame(getByCode("Jpan"), ScriptCode.Jpan);
    }


    @Test
    public void test2()
    {
        assertSame(getByCode("JPan"), ScriptCode.Jpan);
    }


    @Test
    public void test3()
    {
        assertSame(getByCode("JpAn"), ScriptCode.Jpan);
    }


    @Test
    public void test4()
    {
        assertSame(getByCode("JpaN"), ScriptCode.Jpan);
    }


    @Test
    public void test5()
    {
        assertSame(getByCode("jpan"), ScriptCode.Jpan);
    }


    @Test
    public void test6()
    {
        assertSame(getByCode("jPan"), ScriptCode.Jpan);
    }


    @Test
    public void test7()
    {
        assertSame(getByCode("jpAn"), ScriptCode.Jpan);
    }


    @Test
    public void test8()
    {
        assertSame(getByCode("jpaN"), ScriptCode.Jpan);
    }


    @Test
    public void test9()
    {
        assertSame(getByCode("Jpan", true), ScriptCode.Jpan);
    }


    @Test
    public void test10()
    {
        assertNull(getByCode("JPan", true));
    }


    @Test
    public void test11()
    {
        assertNull(getByCode("JpAn", true));
    }


    @Test
    public void test12()
    {
        assertNull(getByCode("JpaN", true));
    }


    @Test
    public void test13()
    {
        assertNull(getByCode("jpan", true));
    }


    @Test
    public void test14()
    {
        assertNull(getByCode("jPan", true));
    }


    @Test
    public void test15()
    {
        assertNull(getByCode("jpAn", true));
    }


    @Test
    public void test16()
    {
        assertNull(getByCode("jpaN", true));
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
        assertNull(getByCode("?"));
    }


    @Test
    public void test20()
    {
        assertNull(getByCode("??"));
    }


    @Test
    public void test21()
    {
        assertNull(getByCode("???"));
    }


    @Test
    public void test22()
    {
        assertNull(getByCode("????"));
    }


    @Test
    public void test23()
    {
        assertNull(getByCode("?????"));
    }


    @Test
    public void test24()
    {
        assertNull(getByCode(null, true));
    }


    @Test
    public void test25()
    {
        assertNull(getByCode("", true));
    }


    @Test
    public void test26()
    {
        assertNull(getByCode("?", true));
    }


    @Test
    public void test27()
    {
        assertNull(getByCode("??", true));
    }


    @Test
    public void test28()
    {
        assertNull(getByCode("???", true));
    }


    @Test
    public void test29()
    {
        assertNull(getByCode("????", true));
    }


    @Test
    public void test30()
    {
        assertNull(getByCode("?????", true));
    }


    @Test
    public void test31()
    {
        assertNull(getByCode(0));
    }


    @Test
    public void test32()
    {
        assertSame(getByCode(413), ScriptCode.Jpan);
    }
}
