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
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.Test;


public class CountryCodeTest
{
    @Test
    public void test1()
    {
        List<CountryCode> list = CountryCode.findByName(".*United.*");

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
}
