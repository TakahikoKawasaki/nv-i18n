/*
 * Copyright (C) 2015 Opes Software Inc.
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

import com.neovisionaries.i18n.CountryCode.Assignment;
import java.util.Currency;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 *
 * @author Derek Mahar <dmahar@opessoftware.com>
 */
public class StandardOrUserAssignedCountryCode implements CustomCountryCode
{

	public static Map<String, CustomCountryCode> alphaCountryCodes = new HashMap<String, CustomCountryCode>();
	public static Map<Integer, CustomCountryCode> numericCountryCodes = new HashMap<Integer, CustomCountryCode>();

	public static void addCode(CustomCountryCode code)
	{
		if (code.getNumeric() != -1)
		{
			numericCountryCodes.put(code.getNumeric(), code);
		}

		if (code.getAlpha2() != null)
		{
			alphaCountryCodes.put(code.getAlpha2(), code);
		}

		if (code.getAlpha3() != null)
		{
			alphaCountryCodes.put(code.getAlpha3(), code);
		}
	}

	public static CustomCountryCode getByCode(int code)
	{
		return new StandardOrUserAssignedCountryCode(CountryCode.getByCode(code),
				numericCountryCodes.get(code));
	}

	public static CustomCountryCode getByCode(String code)
	{
		return new StandardOrUserAssignedCountryCode(CountryCode.getByCode(code),
				alphaCountryCodes.get(code));
	}

	public static CustomCountryCode getByCodeIgnoreCase(String code)
	{
		return getByCode(code.toUpperCase());
	}

	private final CountryCode standardCountryCode;
	private final CustomCountryCode userAssignedCountryCode;

	public StandardOrUserAssignedCountryCode(CountryCode standardCountryCode)
	{
		assert standardCountryCode != null : "Requires standard country code.";

		this.standardCountryCode = standardCountryCode;
		this.userAssignedCountryCode = null;
	}

	public StandardOrUserAssignedCountryCode(CustomCountryCode userAssignedCountryCode)
	{
		assert userAssignedCountryCode != null : "Requires user-assigned country code.";

		this.standardCountryCode = null;
		this.userAssignedCountryCode = userAssignedCountryCode;
	}

	public StandardOrUserAssignedCountryCode(CountryCode standardCountryCode, CustomCountryCode userAssignedCountryCode)
	{
		assert standardCountryCode != null ^ userAssignedCountryCode != null :
				"Requires standard country code or user-assigned country code, but not both.";

		assert ! (standardCountryCode == null && userAssignedCountryCode == null) :
				"Requires either standard country code or user-assigned country code.";

		this.standardCountryCode = standardCountryCode;
		this.userAssignedCountryCode = userAssignedCountryCode;
	}

	public String getAlpha2()
	{
		return this.standardCountryCode != null ? this.standardCountryCode.getAlpha2()
				: this.userAssignedCountryCode.getAlpha2();
	}

	public String getAlpha3()
	{
		return this.standardCountryCode != null ? this.standardCountryCode.getAlpha3()
				: this.userAssignedCountryCode.getAlpha3();
	}

	public Assignment getAssignment()
	{
		return this.standardCountryCode != null ? this.standardCountryCode.getAssignment()
				: this.userAssignedCountryCode.getAssignment();
	}

	public Currency getCurrency()
	{
		return this.standardCountryCode != null ? this.standardCountryCode.getCurrency()
				: this.userAssignedCountryCode.getCurrency();
	}

	public String getName()
	{
		return this.standardCountryCode != null ? this.standardCountryCode.getName()
				: this.userAssignedCountryCode.getName();
	}

	public int getNumeric()
	{
		return this.standardCountryCode != null ? this.standardCountryCode.getNumeric()
				: this.userAssignedCountryCode.getNumeric();
	}

	public Locale toLocale()
	{
		return this.standardCountryCode != null ? this.standardCountryCode.toLocale()
				: this.userAssignedCountryCode.toLocale();
	}
}
