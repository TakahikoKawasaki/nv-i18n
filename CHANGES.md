CHANGES
=======

### 1.14-SNAPSHOT

* Fixed CurrencyCode.XAF. It contained CD (Congo, the Democratic
  Republic of the), but it should be CG (Cong).


### 1.13 (2014-06-13)

* Added CountryCode.XK for "Kosovo, Republic of".

* Changes common to CountryCode, CurrencyCode, LanguageAlpha3Code,
  LanguageCode, LocaleCode and ScriptCode.

  - Added getByCodeIgnoreCase(String).

  - Changed the behavior of getByCode(String). In older versions,
    it was an alias of getByCode(String, false), but now it is
    an alias of getByCode(String, true).

* Changes common to CountryCode, CurrencyCode and ScriptCode.

  - Changed the behavior of getByCode(int). It now returns null
    when 0 or a negative integer is given.

* Changes common to CurrencyCode and LocaleCode.

  - Added getByCountryIgnoreCase(String).

  - Changed the behavior of getByCountry(String). In older versions,
    it was an alias of getByCountry(String, false), but now it is
    an alias of getByCountry(String, true).

* Changes on LocaleCode

  - Added getByCodeIgnoreCase(String, String).

  - Changed the behavior of getByCode(String, String). In older
    versions, it was an alias of getByCode(String, String, false),
	but now it is an alias of getByCode(String, String, true).

  - Added getByLanguageIgnoreCase(String).

  - Changed the behavior of getByLanguage(String). In older versions,
    it was an alias of getByLanguage(String, false), but now it is
	an alias of getByLanguage(String, true).
