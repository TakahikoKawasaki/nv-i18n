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


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.Test;


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


    private static ScriptCode getByCodeIgnoreCase(String code)
    {
        return ScriptCode.getByCodeIgnoreCase(code);
    }


    @Test
    public void test1()
    {
        assertSame(getByCode("Jpan"), ScriptCode.Jpan);
    }


    @Test
    public void test2()
    {
        assertNull(getByCode("JPan"));
    }


    @Test
    public void test3()
    {
        assertNull(getByCode("JpAn"));
    }


    @Test
    public void test4()
    {
        assertNull(getByCode("JpaN"));
    }


    @Test
    public void test5()
    {
        assertNull(getByCode("jpan"));
    }


    @Test
    public void test6()
    {
        assertNull(getByCode("jPan"));
    }


    @Test
    public void test7()
    {
        assertNull(getByCode("jpAn"));
    }


    @Test
    public void test8()
    {
        assertNull(getByCode("jpaN"));
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


    @Test
    public void test33()
    {
        List<ScriptCode> list = ScriptCode.findByName("Egyptian.*");

        assertEquals(3, list.size());

        // Egyd : Egyptian demotic
        assertTrue(list.contains(ScriptCode.Egyd));

        // Egyh : Egyptian hieratic
        assertTrue(list.contains(ScriptCode.Egyh));

        // Egyp : Egyptian hieroglyps
        assertTrue(list.contains(ScriptCode.Egyp));
    }


    @Test
    public void test34()
    {
        assertSame(getByCode("Jpan", false), ScriptCode.Jpan);
    }


    @Test
    public void test35()
    {
        assertSame(getByCode("JPan", false), ScriptCode.Jpan);
    }


    @Test
    public void test36()
    {
        assertSame(getByCode("JpAn", false), ScriptCode.Jpan);
    }


    @Test
    public void test37()
    {
        assertSame(getByCode("JpaN", false), ScriptCode.Jpan);
    }


    @Test
    public void test38()
    {
        assertSame(getByCode("jpan", false), ScriptCode.Jpan);
    }


    @Test
    public void test39()
    {
        assertSame(getByCode("jPan", false), ScriptCode.Jpan);
    }


    @Test
    public void test40()
    {
        assertSame(getByCode("jpAn", false), ScriptCode.Jpan);
    }


    @Test
    public void test41()
    {
        assertSame(getByCode("jpaN", false), ScriptCode.Jpan);
    }


    @Test
    public void test42()
    {
        assertSame(getByCodeIgnoreCase("Jpan"), ScriptCode.Jpan);
    }


    @Test
    public void test43()
    {
        assertSame(getByCodeIgnoreCase("JPan"), ScriptCode.Jpan);
    }


    @Test
    public void test44()
    {
        assertSame(getByCodeIgnoreCase("JpAn"), ScriptCode.Jpan);
    }


    @Test
    public void test45()
    {
        assertSame(getByCodeIgnoreCase("JpaN"), ScriptCode.Jpan);
    }


    @Test
    public void test46()
    {
        assertSame(getByCodeIgnoreCase("jpan"), ScriptCode.Jpan);
    }


    @Test
    public void test47()
    {
        assertSame(getByCodeIgnoreCase("jPan"), ScriptCode.Jpan);
    }


    @Test
    public void test48()
    {
        assertSame(getByCodeIgnoreCase("jpAn"), ScriptCode.Jpan);
    }


    @Test
    public void test49()
    {
        assertSame(getByCodeIgnoreCase("jpaN"), ScriptCode.Jpan);
    }
}
