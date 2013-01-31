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


import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;


public class LocaleCodeTest
{
    private static void assertEquals(List<LocaleCode> list1, List<LocaleCode> list2)
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

        List<LocaleCode> actual = LocaleCode.getByLanguage(LanguageCode.ar);

        assertEquals(expected, actual);
    }


    @Test
    public void test2()
    {
        List<LocaleCode> expected = new ArrayList<LocaleCode>();
        List<LocaleCode> actual = LocaleCode.getByLanguage((LanguageCode)null);

        assertEquals(expected, actual);
    }


    @Test
    public void test3()
    {
        List<LocaleCode> expected = new ArrayList<LocaleCode>();
        expected.add(LocaleCode.de_CH);
        expected.add(LocaleCode.fr_CH);
        expected.add(LocaleCode.it_CH);

        List<LocaleCode> actual = LocaleCode.getByCountry(CountryCode.CH);

        assertEquals(expected, actual);
    }


    @Test
    public void test4()
    {
        List<LocaleCode> expected = new ArrayList<LocaleCode>();
        List<LocaleCode> actual = LocaleCode.getByCountry((CountryCode)null);

        assertEquals(expected, actual);
    }
}
