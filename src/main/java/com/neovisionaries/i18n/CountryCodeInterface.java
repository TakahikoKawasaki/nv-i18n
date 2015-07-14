package com.neovisionaries.i18n;

import java.util.Currency;
import java.util.Locale;

import com.neovisionaries.i18n.CountryCode.Assignment;

public interface CountryCodeInterface {

	/**
	 * Get the country name.
	 *
	 * @return The country name.
	 */
	String getName();

	/**
	 * Get the <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2"
	 * >ISO 3166-1 alpha-2</a> code.
	 *
	 * @return The standard <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2"
	 *         >ISO 3166-1 alpha-2</a> code or one which is
	 * <a href="https://en.wikipedia.org/wiki/ISO_3166-1#Reserved_and_user-assigned_code_elements">reserved
	 * or user-assigned</a>. {@link CountryCode#UNDEFINED} returns
	 * {@code "UNDEFINED"} which is not an official ISO 3166-1 alpha-2 code.
	 */
	String getAlpha2();

	/**
	 * Get the <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-3"
	 * >ISO 3166-1 alpha-3</a> code.
	 *
	 * @return The standard <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-3"
	 *         >ISO 3166-1 alpha-3</a> code or one which is
	 * <a href="https://en.wikipedia.org/wiki/ISO_3166-1#Reserved_and_user-assigned_code_elements">reserved
	 * or user-assigned</a>. Some country codes reserved exceptionally (such as
	 * {@link #EU}) returns {@code null}. {@link CountryCode#UNDEFINED} returns
	 * {@code null}, too.
	 */
	String getAlpha3();

	/**
	 * Get the <a href="http://en.wikipedia.org/wiki/ISO_3166-1_numeric"
	 * >ISO 3166-1 numeric</a> code.
	 *
	 * @return The standard <a href="http://en.wikipedia.org/wiki/ISO_3166-1_numeric"
	 *         >ISO 3166-1 numeric</a> code or one which is
	 * <a href="https://en.wikipedia.org/wiki/ISO_3166-1#Reserved_and_user-assigned_code_elements">reserved
	 * or user-assigned</a>. Country codes reserved exceptionally (such as
	 * {@link #EU}) returns {@code -1}. {@link CountryCode#UNDEFINED} returns
	 * {@code -1}, too.
	 */
	int getNumeric();

	/**
	 * Get the assignment state of this country code in ISO 3166-1.
	 *
	 * @return The assignment state.
	 *
	 * @see <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#Decoding_table"
	 *       >Decoding table of ISO 3166-1 alpha-2 codes</a>
	 */
	Assignment getAssignment();

	/**
	 * Convert this {@code CountryCode} instance to a {@link Locale} instance.
	 *
	 * @return A {@code Locale} instance that matches this {@code CountryCode}.
	 */
	Locale toLocale();

	/**
	 * Get the currency.
	 *
	 * <p>
	 * This method is an alias of {@link Currency}{@code .}{@link
	 * Currency#getInstance(Locale) getInstance}{@code (}{@link
	 * #toLocale()}{@code )}. The only difference is that this method returns
	 * {@code null} when {@code Currency.getInstance(Locale)} throws
	 * {@code IllegalArgumentException}.
	 * </p>
	 *
	 * <p>
	 * This method returns {@code null} when the territory represented by this
	 * {@code CountryCode} instance does not have a currency. {@link #AQ}
	 * (Antarctica) is one example.
	 * </p>
	 *
	 * <p>
	 * In addition, this method returns {@code null} also when the ISO 3166 code
	 * represented by this {@code CountryCode} instance is not supported by the
	 * implementation of {@link
	 * Currency#getInstance(Locale)}. At the time of this writing, {@link #SS}
	 * (South Sudan) is one example.
	 * </p>
	 *
	 * @return A {@code Currency} instance. In some cases, null is returned.
	 *
	 * @see Currency#getInstance(Locale)
	 */
	Currency getCurrency();
}
