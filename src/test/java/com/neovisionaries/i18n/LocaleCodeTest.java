/*
 * Copyright 2013 Krzysztof Suszyński <krzysztof.suszynski@wavesoftware.pl>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.neovisionaries.i18n;

import java.util.Locale;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Krzysztof Suszyński <krzysztof.suszynski@wavesoftware.pl>
 */
public class LocaleCodeTest {
    
    /**
     * Test of values method, of class LocaleCode.
     */
    @Test
    public void testValues() {
        int expResult = 150;
        LocaleCode[] result = LocaleCode.values();
        assertEquals(expResult, result.length);
    }

    /**
     * Test of valueOf method, of class LocaleCode.
     */
    @Test
    public void testValueOf() {
        String name = "pl_PL";
        LocaleCode expResult = LocaleCode.pl_PL;
        LocaleCode result = LocaleCode.valueOf(name);
        assertEquals(expResult, result);
        name = "pl";
        expResult = LocaleCode.pl;
        result = LocaleCode.valueOf(name);
        assertEquals(expResult, result);
    }

    /**
     * Test of getLanguage method, of class LocaleCode.
     */
    @Test
    public void testGetLanguage() {
        LocaleCode instance = LocaleCode.pl_PL;
        LanguageCode expResult = LanguageCode.pl;
        LanguageCode result = instance.getLanguage();
        assertEquals(expResult, result);
        instance = LocaleCode.pl;
        expResult = LanguageCode.pl;
        result = instance.getLanguage();
        assertEquals(expResult, result);
        instance = LocaleCode.ja;
        expResult = LanguageCode.ja;
        result = instance.getLanguage();
        assertEquals(expResult, result);
        instance = LocaleCode.ja_JP;
        expResult = LanguageCode.ja;
        result = instance.getLanguage();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCountry method, of class LocaleCode.
     */
    @Test
    public void testGetCountry() {
        LocaleCode instance = LocaleCode.pl_PL;
        CountryCode expResult = CountryCode.PL;
        CountryCode result = instance.getCountry();
        assertEquals(expResult, result);
        instance = LocaleCode.ja_JP;
        expResult = CountryCode.JP;
        result = instance.getCountry();
        assertEquals(expResult, result);
        instance = LocaleCode.ja;
        expResult = null;
        result = instance.getCountry();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class LocaleCode.
     */
    @Test
    public void testToString() {
        LocaleCode instance = LocaleCode.pl_PL;
        String expResult = "pl-PL";
        String result = instance.toString();
        assertEquals(expResult, result);
        instance = LocaleCode.pl;
        expResult = "pl";
        result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of toLocale method, of class LocaleCode.
     */
    @Test
    public void testToLocale() {
        LocaleCode instance = LocaleCode.pl_PL;
        Locale expResult = new Locale("pl", "PL");
        Locale result = instance.toLocale();
        assertEquals(expResult, result);
        instance = LocaleCode.pl;
        expResult = new Locale("pl");
        result = instance.toLocale();
        assertEquals(expResult, result);
    }

    /**
     * Test of getByCode method, of class LocaleCode.
     */
    @Test
    public void testGetByCode_String() {
        String code = "";
        LocaleCode expResult = null;
        LocaleCode result = LocaleCode.getByCode(code);
        assertEquals(expResult, result);
        code = "ja_JP";
        expResult = LocaleCode.ja_JP;
        result = LocaleCode.getByCode(code);
        assertEquals(expResult, result);
        code = "ja";
        expResult = LocaleCode.ja;
        result = LocaleCode.getByCode(code);
        assertEquals(expResult, result);
    }

    /**
     * Test of getByCode method, of class LocaleCode.
     */
    @Test
    public void testGetByCode_String_boolean() {
        String code = "";
        boolean caseSensitive = false;
        LocaleCode expResult = null;
        LocaleCode result = LocaleCode.getByCode(code, caseSensitive);
        assertEquals(expResult, result);
        code = "ja_JP";
        caseSensitive = false;
        expResult = LocaleCode.ja_JP;
        result = LocaleCode.getByCode(code, caseSensitive);
        assertEquals(expResult, result);
        code = "ja";
        caseSensitive = false;
        expResult = LocaleCode.ja;
        result = LocaleCode.getByCode(code, caseSensitive);
        assertEquals(expResult, result);
    }

    /**
     * Test of getByCode method, of class LocaleCode.
     */
    @Test
    public void testGetByCode_String_String() {
        String language = "";
        String country = "";
        LocaleCode expResult = null;
        LocaleCode result = LocaleCode.getByCode(language, country);
        assertEquals(expResult, result);
        language = "zh";
        country = "TW";
        expResult = LocaleCode.zh_TW;
        result = LocaleCode.getByCode(language, country);
        assertEquals(expResult, result);
        language = "";
        country = "TW";
        expResult = LocaleCode.zh_TW;
        result = LocaleCode.getByCode(language, country);
        assertEquals(expResult, result);
        language = "";
        country = "pl";
        expResult = LocaleCode.pl_PL;
        result = LocaleCode.getByCode(language, country);
        assertEquals(expResult, result);
        language = "ja";
        country = "";
        expResult = LocaleCode.ja;
        result = LocaleCode.getByCode(language, country);
        assertEquals(expResult, result);
    }

    /**
     * Test of getByCode method, of class LocaleCode.
     */
    @Test
    public void testGetByCode_3args() {
        String language = "";
        String country = "";
        boolean caseSensitive = false;
        LocaleCode expResult = null;
        LocaleCode result = LocaleCode.getByCode(language, country, caseSensitive);
        assertEquals(expResult, result);
        language = "zh";
        country = "TW";
        caseSensitive = true;
        expResult = LocaleCode.zh_TW;
        result = LocaleCode.getByCode(language, country, caseSensitive);
        assertEquals(expResult, result);
        language = "";
        country = "TW";
        caseSensitive = true;
        expResult = LocaleCode.zh_TW;
        result = LocaleCode.getByCode(language, country, caseSensitive);
        assertEquals(expResult, result);
        language = "";
        country = "pl";
        caseSensitive = false;
        expResult = LocaleCode.pl_PL;
        result = LocaleCode.getByCode(language, country, caseSensitive);
        assertEquals(expResult, result);
        language = "ja";
        country = "";
        caseSensitive = false;
        expResult = LocaleCode.ja;
        result = LocaleCode.getByCode(language, country, caseSensitive);
        assertEquals(expResult, result);
    }

    /**
     * Test of getByLocale method, of class LocaleCode.
     */
    @Test
    public void testGetByLocale() {
        Locale locale = Locale.CANADA_FRENCH;
        LocaleCode expResult = LocaleCode.fr_CA;
        LocaleCode result = LocaleCode.getByLocale(locale);
        assertEquals(expResult, result);
        locale = Locale.CHINA;
        expResult = LocaleCode.zh_CN;
        result = LocaleCode.getByLocale(locale);
        assertEquals(expResult, result);
        locale = Locale.JAPAN;
        expResult = LocaleCode.ja_JP;
        result = LocaleCode.getByLocale(locale);
        assertEquals(expResult, result);
        locale = Locale.JAPANESE;
        expResult = LocaleCode.ja;
        result = LocaleCode.getByLocale(locale);
        assertEquals(expResult, result);
    }

    /**
     * Test of getByCountry method, of class LocaleCode.
     */
    @Test
    public void testGetByCountry() {
        String country = "pl";
        LocaleCode expResult = LocaleCode.pl_PL;
        LocaleCode result = LocaleCode.getByCountry(country, false);
        assertEquals(expResult, result);
        result = LocaleCode.getByCountry(country, true);
        assertNull(result);
        result = LocaleCode.getByCountry("JP", true);
        assertSame(LocaleCode.ja_JP, result);
    }
}
