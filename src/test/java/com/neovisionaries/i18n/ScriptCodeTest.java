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


import static com.neovisionaries.i18n.ScriptCode.getByLocale;
import static com.neovisionaries.i18n.ScriptCode.getByCode;
import static com.neovisionaries.i18n.ScriptCode.getByCodeIgnoreCase;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.List;
import java.util.Locale;
import org.junit.Test;

public class ScriptCodeTest
{
    @Test
    public void test1()
    {
        assertSame(ScriptCode.Jpan, getByCode("Jpan"));
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
        assertSame(ScriptCode.Jpan, getByCode("Jpan", true));
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
        assertSame(ScriptCode.Jpan, getByCode(413));
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
        assertSame(ScriptCode.Jpan, getByCode("Jpan", false));
    }


    @Test
    public void test35()
    {
        assertSame(ScriptCode.Jpan, getByCode("JPan", false));
    }


    @Test
    public void test36()
    {
        assertSame(ScriptCode.Jpan, getByCode("JpAn", false));
    }


    @Test
    public void test37()
    {
        assertSame(ScriptCode.Jpan, getByCode("JpaN", false));
    }


    @Test
    public void test38()
    {
        assertSame(ScriptCode.Jpan, getByCode("jpan", false));
    }


    @Test
    public void test39()
    {
        assertSame(ScriptCode.Jpan, getByCode("jPan", false));
    }


    @Test
    public void test40()
    {
        assertSame(ScriptCode.Jpan, getByCode("jpAn", false));
    }


    @Test
    public void test41()
    {
        assertSame(ScriptCode.Jpan, getByCode("jpaN", false));
    }


    @Test
    public void test42()
    {
        assertSame(ScriptCode.Jpan, getByCodeIgnoreCase("Jpan"));
    }


    @Test
    public void test43()
    {
        assertSame(ScriptCode.Jpan, getByCodeIgnoreCase("JPan"));
    }


    @Test
    public void test44()
    {
        assertSame(ScriptCode.Jpan, getByCodeIgnoreCase("JpAn"));
    }


    @Test
    public void test45()
    {
        assertSame(ScriptCode.Jpan, getByCodeIgnoreCase("JpaN"));
    }


    @Test
    public void test46()
    {
        assertSame(ScriptCode.Jpan, getByCodeIgnoreCase("jpan"));
    }


    @Test
    public void test47()
    {
        assertSame(ScriptCode.Jpan, getByCodeIgnoreCase("jPan"));
    }


    @Test
    public void test48()
    {
        assertSame(ScriptCode.Jpan, getByCodeIgnoreCase("jpAn"));
    }


    @Test
    public void test49()
    {
        assertSame(ScriptCode.Jpan, getByCodeIgnoreCase("jpaN"));
    }


    @Test
    public void test50()
    {
        assertSame(ScriptCode.Undefined, getByCode("Undefined"));
    }


    @Test
    public void test51()
    {
        assertNull(getByCode("UNDEFINED"));
    }


    @Test
    public void test52()
    {
        assertSame(ScriptCode.Undefined, getByCodeIgnoreCase("UNDEFINED"));
    }

    @Test
    public void test53()
    {
        assertSame(ScriptCode.Undefined, getByLocale(new Locale.Builder().build()));
    }

    @Test
    public void test54()
    {
        assertSame(ScriptCode.Jpan, getByLocale(new Locale.Builder().setScript(ScriptCode.Jpan.name()).build()));
    }

    @Test
    public void test55()
    {
        assertSame(ScriptCode.Undefined.toLocale(), new Locale.Builder().build());
    }

    @Test
    public void test56()
    {
        assertSame(ScriptCode.Jpan.toLocale(), new Locale.Builder().setScript(ScriptCode.Jpan.name()).build());
    }
}
