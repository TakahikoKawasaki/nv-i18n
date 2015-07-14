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


import static com.neovisionaries.i18n.CountryCode.getByCode;
import static com.neovisionaries.i18n.CountryCode.getByCodeIgnoreCase;
import static com.neovisionaries.i18n.CountryCode.getByLocale;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.Currency;
import java.util.List;
import java.util.Locale;
import org.junit.Test;

import com.neovisionaries.i18n.CountryCode.Assignment;


public class CountryCodeTest
{
	private static CountryCodeInterface createUserAssignedCountryCode() {
		return new CountryCodeInterface() {
			public String getName() {
				return "USER_COUNTRY_CODE_1";
			}

			public String getAlpha2() {
				return "ZZ";
			}

			public String getAlpha3() {
				return "ZZZ";
			}

			public int getNumeric() {
				return 999;
			}

			public Assignment getAssignment() {
				return Assignment.USER_ASSIGNED;
			}

			public Locale toLocale() {
				return null;
			}

			public Currency getCurrency() {
				return null;
			}
		};
	}

    @Test
    public void test1()
    {
        List<CountryCodeInterface> list = CountryCode.findByName(".*United.*");

        assertEquals(6, list.size());

        // AE: United Arab Emirates
        assertTrue(list.contains(CountryCode.AE));

        // GB: United Kingdom
        assertTrue(list.contains(CountryCode.GB));

        // TZ: Tanzania, United Republic of
        assertTrue(list.contains(CountryCode.TZ));

        // UK: United Kingdom
        assertTrue(list.contains(CountryCode.UK));

        // UM: United States Minor Outlying Islands
        assertTrue(list.contains(CountryCode.UM));

        // US: United States
        assertTrue(list.contains(CountryCode.US));
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
	public void testUserAssignedCountryCodeGetByCodeAlpha2() {
		final CountryCodeInterface expected = createUserAssignedCountryCode();
		CountryCode.addUserAssigned(expected);
		final CountryCodeInterface actual = CountryCode.getByCode("ZZ");
		assertEquals("ZZ", actual.getAlpha2());
		assertEquals("ZZZ", actual.getAlpha3());
		assertEquals(999, actual.getNumeric());
		assertEquals(Assignment.USER_ASSIGNED, actual.getAssignment());
	}

	@Test
	public void testUserAssignedCountryCodeGetByCodeAlpha3() {
		final CountryCodeInterface expected = createUserAssignedCountryCode();
		CountryCode.addUserAssigned(expected);
		final CountryCodeInterface actual = CountryCode.getByCode("ZZZ");
		assertEquals("ZZ", actual.getAlpha2());
		assertEquals("ZZZ", actual.getAlpha3());
		assertEquals(999, actual.getNumeric());
		assertEquals(Assignment.USER_ASSIGNED, actual.getAssignment());
	}

	@Test
	public void testUserAssignedCountryCodeGetByCodeNumeric() {
		final CountryCodeInterface expected = createUserAssignedCountryCode();
		CountryCode.addUserAssigned(expected);
		final CountryCodeInterface actual = CountryCode.getByCode(999);
		assertEquals("ZZ", actual.getAlpha2());
		assertEquals("ZZZ", actual.getAlpha3());
		assertEquals(999, actual.getNumeric());
		assertEquals(Assignment.USER_ASSIGNED, actual.getAssignment());
	}
}
