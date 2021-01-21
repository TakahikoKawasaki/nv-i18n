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
    public void testArabic()
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
    public void testGetLanguageWithLanguageCodeNull()
    {
        List<LocaleCode> expected = new ArrayList<LocaleCode>();
        List<LocaleCode> actual = getByLanguage((LanguageCode)null);

        assertListEquals(expected, actual);
    }

    @Test
    public void testSwitzerland()
    {
        List<LocaleCode> expected = new ArrayList<LocaleCode>();
        expected.add(LocaleCode.de_CH);
        expected.add(LocaleCode.fr_CH);
        expected.add(LocaleCode.it_CH);

        List<LocaleCode> actual = getByCountry(CountryCode.CH);

        assertListEquals(expected, actual);
    }

    @Test
    public void testGetCountryWithCountryCodeNull()
    {
        List<LocaleCode> expected = new ArrayList<LocaleCode>();
        List<LocaleCode> actual = getByCountry((CountryCode)null);

        assertListEquals(expected, actual);
    }

    @Test
    public void testGerman()
    {
        assertSame(Locale.GERMAN, LocaleCode.de.toLocale());
    }

    @Test
    public void testEnglish()
    {
        assertSame(Locale.ENGLISH, LocaleCode.en.toLocale());
    }

    @Test
    public void testFrench()
    {
        assertSame(Locale.FRENCH, LocaleCode.fr.toLocale());
    }

    @Test
    public void testCandianFrench()
    {
        assertSame(Locale.CANADA_FRENCH, LocaleCode.fr_CA.toLocale());
    }

    @Test
    public void testItalian()
    {
        assertSame(Locale.ITALIAN, LocaleCode.it.toLocale());
    }

    @Test
    public void testJapanese()
    {
        assertSame(Locale.JAPANESE, LocaleCode.ja.toLocale());
    }

    @Test
    public void testKorean()
    {
        assertSame(Locale.KOREAN, LocaleCode.ko.toLocale());
    }

    @Test
    public void testChinese()
    {
        assertSame(Locale.CHINESE, LocaleCode.zh.toLocale());
    }

    @Test
    public void testSimplifiedChinese()
    {
        assertSame(Locale.SIMPLIFIED_CHINESE, LocaleCode.zh_CN.toLocale());
    }

    @Test
    public void testTraditionalChinese()
    {
        assertSame(Locale.TRADITIONAL_CHINESE, LocaleCode.zh_TW.toLocale());
    }

    @Test
    public void testUndefined()
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
    public void testGetByLocaleJapanese()
    {
        assertSame(LocaleCode.ja, getByLocale(Locale.JAPANESE));
    }

    @Test
    public void testGetByLocaleJapan()
    {
        assertSame(LocaleCode.ja_JP, getByLocale(Locale.JAPAN));
    }

    @Test
    public void testGetByLocaleEmptyLanguageAndCountry()
    {
        assertSame(LocaleCode.undefined, getByLocale(new Locale("", "")));
    }

    @Test
    public void testGetByCodeLanguageUndefinedCountryNull()
    {
        assertSame(LocaleCode.undefined, getByCode("undefined", (String)null));
    }

    @Test
    public void testGetByCodeLanguageUndefinedUpperCaseCountryNull()
    {
        assertNull(LocaleCode.getByCode("UNDEFINED", (String)null));
    }

    @Test
    public void testGetByCodeLanguageUndefinedCaseInsensitiveCountryNull()
    {
        assertSame(LocaleCode.undefined, getByCode("UNDEFINED", (String)null, false));
    }

    @Test
    public void testGetByCodeLanguageAndCountryUpperCaseUndefined()
    {
        assertSame(LocaleCode.undefined, getByCode("undefined", "UNDEFINED"));
    }

    @Test
    public void testGetByCodeLanguageAndCountryLowerCaseUndefined()
    {
        assertNull(getByCode("undefined", "undefined"));
    }

    @Test
    public void testGetByCodeLanguageAndCountryLowerCaseUndefinedCaseInsensitive()
    {
        assertSame(LocaleCode.undefined, getByCode("undefined", "undefined", false));
    }

    @Test
    public void testGetByCodeLowerCaseUndefined()
    {
        assertSame(LocaleCode.undefined, getByCode("undefined"));
    }

    @Test
    public void testGetByCodeUpperCaseUndefined()
    {
        assertNull(getByCode("UNDEFINED"));
    }

    @Test
    public void testGetByCodeUpperCaseUndefinedCaseInsensitive()
    {
        assertSame(LocaleCode.undefined, getByCode("UNDEFINED", false));
    }

    @Test
    public void testGetByCodeLanguageAndCountryUpperCaseUndefinedCombinedString()
    {
        assertSame(LocaleCode.undefined, getByCode("undefined-UNDEFINED"));
    }

    @Test
    public void testGetByCodeLanguageAndCountryLowerCaseUndefinedCombinedString()
    {
        assertNull(getByCode("undefined-undefined"));
    }

    @Test
    public void testGetByCodeUpperCaseUndefinedCaseInsensitiveCombinedString()
    {
        assertSame(LocaleCode.undefined, getByCode("undefined-undefined", false));
    }

    @Test
    public void testGetByCodeLanguageAndCountryUpperCaseUndefinedCombinedWithLowDashString()
    {
        assertSame(LocaleCode.undefined, getByCode("undefined_UNDEFINED"));
    }

    @Test
    public void testGetByCodeLanguageAndCountryLowerCaseUndefinedCombinedWithLowDashString()
    {
        assertNull(getByCode("undefined_undefined"));
    }

    @Test
    public void testGetByCodeUpperCaseUndefinedCaseInsensitiveCombinedWithLowDashString()
    {
        assertSame(LocaleCode.undefined, getByCode("undefined_undefined", false));
    }

    @Test
    public void testGetByCodeJapaneseLowerCase()
    {
        assertSame(LocaleCode.ja, getByCode("ja"));
    }

    @Test
    public void testGetByCodeJapaneseUpperCase()
    {
        assertNull(getByCode("JA"));
    }

    @Test
    public void testGetByCodeJapaneseUpperCaseCaseInsensitive()
    {
        assertSame(LocaleCode.ja, getByCode("JA", false));
    }

    @Test
    public void testGetByCodeJapaneseCombinedWithDashString()
    {
        assertSame(LocaleCode.ja_JP, getByCode("ja-JP"));
    }

    @Test
    public void testGetByCodeJapaneseCountryLowerCaseCombinedWithDashString()
    {
        assertNull(getByCode("ja-jp"));
    }

    @Test
    public void testGetByCodeJapaneseCountryLowerCaseCombinedWithDashStringCaseInsensitive()
    {
        assertSame(LocaleCode.ja_JP, getByCode("ja-jp", false));
    }

    @Test
    public void testGetByCodeJapaneseCombinedWithLowDashString()
    {
        assertSame(LocaleCode.ja_JP, getByCode("ja_JP"));
    }

    @Test
    public void testGetByCodeJapaneseCountryLowerCaseCombinedWithLowDashString()
    {
        assertNull(getByCode("ja_jp"));
    }

    @Test
    public void testGetByCodeJapaneseCountryLowerCaseCombinedWithLowDashStringCaseInsensitive()
    {
        assertSame(LocaleCode.ja_JP, getByCode("ja_jp", false));
    }

    @Test
    public void testGetByCodeJapaneseCombinedWithUnsupportedSeparatorString()
    {
        assertNull(getByCode("ja+JP"));
    }

    @Test
    public void testGetByCodeNull()
    {
        assertNull(getByCode(null));
    }

    @Test
    public void testGetByCodeEmptyString()
    {
        assertNull(getByCode(""));
    }

    @Test
    public void testGetByCodeRomanianMoldovaCombinedWithLowDashCaseInsenstive()
    {
        assertSame(LocaleCode.ro_MD, getByCode("ro_MD", false));
    }

    @Test
    public void testGetByCodeUrduPakistan()
    {
        assertSame(LocaleCode.ur_PK, getByCode("ur_PK", false));
    }

    @Test
    public void testGetByLanguageWithLanguageStringLowerCaseUrdu()
    {
        final List<LocaleCode> expected = new ArrayList<LocaleCode>();
        expected.add(LocaleCode.ur_AE);
        expected.add(LocaleCode.ur_PK);
        assertEquals(expected, getByLanguage("ur"));
    }

    @Test
    public void testGetByLanguageWithLanguageCodeUrdu()
    {
        final List<LocaleCode> expected = new ArrayList<LocaleCode>();
        expected.add(LocaleCode.ur_AE);
        expected.add(LocaleCode.ur_PK);
        assertEquals(expected, getByLanguage(LanguageCode.ur));
    }

    @Test
    public void testGetByLanguageWithLanguageStringUpperCaseCaseInsensitiveUrdu()
    {
        final List<LocaleCode> expected = new ArrayList<LocaleCode>();
        expected.add(LocaleCode.ur_AE);
        expected.add(LocaleCode.ur_PK);
        assertEquals(expected, getByLanguage("UR", false));
    }

    @Test
    public void testGetByCountryUrduPakistan()
    {
        final List<LocaleCode> expected = new ArrayList<LocaleCode>();
        expected.add(LocaleCode.ur_PK);
        assertEquals(expected, getByCountry(CountryCode.PK));
    }


    @Test
    public void testGetByCodeCatalanAndorra()
    {
        assertSame(LocaleCode.ca_AD, getByCode("ca_AD", false));
    }

    @Test
    public void testGetByLanguageWithLanguageStringLowerCaseCatalan()
    {
        final List<LocaleCode> expected = new ArrayList<LocaleCode>();
        expected.add(LocaleCode.ca);
        expected.add(LocaleCode.ca_ES);
        expected.add(LocaleCode.ca_AD);
        assertEquals(expected, getByLanguage("ca"));
    }

    @Test
    public void testGetByLanguageWithLanguageCodeCatalan()
    {
        final List<LocaleCode> expected = new ArrayList<LocaleCode>();
        expected.add(LocaleCode.ca);
        expected.add(LocaleCode.ca_ES);
        expected.add(LocaleCode.ca_AD);
        assertEquals(expected, getByLanguage(LanguageCode.ca));
    }

    @Test
    public void testGetByLanguageWithLanguageStringUpperCaseCaseInsensitiveCatalan()
    {
        final List<LocaleCode> expected = new ArrayList<LocaleCode>();
        expected.add(LocaleCode.ca);
        expected.add(LocaleCode.ca_ES);
        expected.add(LocaleCode.ca_AD);
        assertEquals(expected, getByLanguage("CA", false));
    }

    @Test
    public void testGetByCountryCatalanAndorra()
    {
        final List<LocaleCode> expected = new ArrayList<LocaleCode>();
        expected.add(LocaleCode.ca_AD);
        assertEquals(expected, getByCountry(CountryCode.AD));
    }


    @Test
    public void testGetByCodeUnitedArabEmirates()
    {
        assertSame(LocaleCode.ar_AE, getByCode("ar_AE", false));
        assertSame(LocaleCode.en_AE, getByCode("en_AE", false));
        assertSame(LocaleCode.fa_AE, getByCode("fa_AE", false));
        assertSame(LocaleCode.hi_AE, getByCode("hi_AE", false));
        assertSame(LocaleCode.ur_AE, getByCode("ur_AE", false));
    }

    @Test
    public void testGetByLanguageWithLanguageStringLowerCaseFarsi()
    {
        final List<LocaleCode> expected = new ArrayList<LocaleCode>();
        expected.add(LocaleCode.fa);
        expected.add(LocaleCode.fa_AF);
        expected.add(LocaleCode.fa_IR);
        expected.add(LocaleCode.fa_AE);
        assertEquals(expected, getByLanguage("fa"));
    }

    @Test
    public void testGetByLanguageWithLanguageCodeFarsi()
    {
        final List<LocaleCode> expected = new ArrayList<LocaleCode>();
        expected.add(LocaleCode.fa);
        expected.add(LocaleCode.fa_AF);
        expected.add(LocaleCode.fa_IR);
        expected.add(LocaleCode.fa_AE);
        assertEquals(expected, getByLanguage(LanguageCode.fa));
    }

    @Test
    public void testGetByLanguageWithLanguageStringUpperCaseCaseInsensitiveFarsi()
    {
        final List<LocaleCode> expected = new ArrayList<LocaleCode>();
        expected.add(LocaleCode.fa);
        expected.add(LocaleCode.fa_AF);
        expected.add(LocaleCode.fa_IR);
        expected.add(LocaleCode.fa_AE);
        assertEquals(expected, getByLanguage("FA", false));
    }

    @Test
    public void testGetByCountryUnitedArabEmirates()
    {
        final List<LocaleCode> expected = new ArrayList<LocaleCode>();
        expected.add(LocaleCode.ar_AE);
        expected.add(LocaleCode.en_AE);
        expected.add(LocaleCode.fa_AE);
        expected.add(LocaleCode.hi_AE);
        expected.add(LocaleCode.ur_AE);
        assertEquals(expected, getByCountry(CountryCode.AE));
    }


    @Test
    public void testGetByCodeAfghanistan()
    {
        assertSame(LocaleCode.fa_AF, getByCode("fa_AF", false));
        assertSame(LocaleCode.ps_AF, getByCode("ps_AF", false));
        assertSame(LocaleCode.tk_AF, getByCode("tk_AF", false));
        assertSame(LocaleCode.uz_AF, getByCode("uz_AF", false));
    }

    @Test
    public void testGetByCountryAfghanistan()
    {
        final List<LocaleCode> expected = new ArrayList<LocaleCode>();
        expected.add(LocaleCode.fa_AF);
        expected.add(LocaleCode.ps_AF);
        expected.add(LocaleCode.tk_AF);
        expected.add(LocaleCode.uz_AF);
        assertEquals(expected, getByCountry(CountryCode.AF));
    }


    @Test
    public void testGetByCodeAntiguaAndBarbuda()
    {
        assertSame(LocaleCode.en_AG, getByCode("en_AG", false));
    }

    @Test
    public void testGetByCountryAntiguaAndBarbuda()
    {
        final List<LocaleCode> expected = new ArrayList<LocaleCode>();
        expected.add(LocaleCode.en_AG);
        assertEquals(expected, getByCountry(CountryCode.AG));
    }


    @Test
    public void testGetByCodeAnguilla()
    {
        assertSame(LocaleCode.en_AI, getByCode("en_AI", false));
    }

    @Test
    public void testGetByCountryAnguilla()
    {
        final List<LocaleCode> expected = new ArrayList<LocaleCode>();
        expected.add(LocaleCode.en_AI);
        assertEquals(expected, getByCountry(CountryCode.AI));
    }


    @Test
    public void testGetByCodeAlbania()
    {
        assertSame(LocaleCode.el_AL, getByCode("el_AL", false));
        assertSame(LocaleCode.sq_AL, getByCode("sq_AL", false));
    }

    @Test
    public void testGetByCountryAlbania()
    {
        final List<LocaleCode> expected = new ArrayList<LocaleCode>();
        expected.add(LocaleCode.el_AL);
        expected.add(LocaleCode.sq_AL);
        assertEquals(expected, getByCountry(CountryCode.AL));
    }


    @Test
    public void testGetByCodeArmenia()
    {
        assertSame(LocaleCode.hy_AM, getByCode("hy_AM", false));
    }

    @Test
    public void testGetByCountryArmenia()
    {
        final List<LocaleCode> expected = new ArrayList<LocaleCode>();
        expected.add(LocaleCode.hy_AM);
        assertEquals(expected, getByCountry(CountryCode.AM));
    }


    @Test
    public void testGetByCodeAngola()
    {
        assertSame(LocaleCode.pt_AO, getByCode("pt_AO", false));
    }

    @Test
    public void testGetByCountryAngola()
    {
        final List<LocaleCode> expected = new ArrayList<LocaleCode>();
        expected.add(LocaleCode.pt_AO);
        assertEquals(expected, getByCountry(CountryCode.AO));
    }


    @Test
    public void testGetByLanguageWithLanguageCodePashto()
    {
        final List<LocaleCode> expected = new ArrayList<LocaleCode>();
        expected.add(LocaleCode.ps);
        expected.add(LocaleCode.ps_AF);
        assertEquals(expected, getByLanguage(LanguageCode.ps));
    }


    @Test
    public void testGetByLanguageWithLanguageCodeTurkmen()
    {
        final List<LocaleCode> expected = new ArrayList<LocaleCode>();
        expected.add(LocaleCode.tk);
        expected.add(LocaleCode.tk_AF);
        assertEquals(expected, getByLanguage(LanguageCode.tk));
    }


    @Test
    public void testGetByLanguageWithLanguageCodeUzbek()
    {
        final List<LocaleCode> expected = new ArrayList<LocaleCode>();
        expected.add(LocaleCode.uz);
        expected.add(LocaleCode.uz_AF);
        assertEquals(expected, getByLanguage(LanguageCode.uz));
    }


    @Test
    public void testGetByLanguageWithLanguageEnglish()
    {
        final List<LocaleCode> expected = new ArrayList<LocaleCode>();
        expected.add(LocaleCode.en);
        expected.add(LocaleCode.en_AE);
        expected.add(LocaleCode.en_AG);
        expected.add(LocaleCode.en_AI);
        expected.add(LocaleCode.en_AU);
        expected.add(LocaleCode.en_CA);
        expected.add(LocaleCode.en_GB);
        expected.add(LocaleCode.en_HK);
        expected.add(LocaleCode.en_IE);
        expected.add(LocaleCode.en_IN);
        expected.add(LocaleCode.en_MT);
        expected.add(LocaleCode.en_NZ);
        expected.add(LocaleCode.en_PH);
        expected.add(LocaleCode.en_SG);
        expected.add(LocaleCode.en_US);
        expected.add(LocaleCode.en_ZA);
        assertEquals(expected, getByLanguage(LanguageCode.en));
    }


    @Test
    public void testGetByLanguageWithLanguageCodeGreek()
    {
        final List<LocaleCode> expected = new ArrayList<LocaleCode>();
        expected.add(LocaleCode.el);
        expected.add(LocaleCode.el_AL);
        expected.add(LocaleCode.el_CY);
        expected.add(LocaleCode.el_GR);
        assertEquals(expected, getByLanguage(LanguageCode.el));
    }


    @Test
    public void testGetByLanguageWithLanguageCodeAlbanian()
    {
        final List<LocaleCode> expected = new ArrayList<LocaleCode>();
        expected.add(LocaleCode.sq);
        expected.add(LocaleCode.sq_AL);
        assertEquals(expected, getByLanguage(LanguageCode.sq));
    }


    @Test
    public void testGetByLanguageWithLanguageCodeArmenian()
    {
        final List<LocaleCode> expected = new ArrayList<LocaleCode>();
        expected.add(LocaleCode.hy);
        expected.add(LocaleCode.hy_AM);
        assertEquals(expected, getByLanguage(LanguageCode.hy));
    }


    @Test
    public void testGetByLanguageWithLanguageCodePortuguese()
    {
        final List<LocaleCode> expected = new ArrayList<LocaleCode>();
        expected.add(LocaleCode.pt);
        expected.add(LocaleCode.pt_AO);
        expected.add(LocaleCode.pt_BR);
        expected.add(LocaleCode.pt_PT);
        assertEquals(expected, getByLanguage(LanguageCode.pt));
    }
}
