CHANGES
=======

### 1.23 (2018-04-25)

* Added `EZ` (Eurozone) to `CountryCode`
  ([Issue 45](https://github.com/TakahikoKawasaki/nv-i18n/issues/45)).

* Added `MRU` (Ouguiya) and `STN` (Dobra) to `CurrencyCode`, and
  marked `MRO` and `STD` as deprecated
  ([Issue 48](https://github.com/TakahikoKawasaki/nv-i18n/issues/48)).

* Made `getByAlpha?Code(String)` methods in `CountryCode` class public
  ([Issue 49](https://github.com/TakahikoKawasaki/nv-i18n/issues/49)).


### 1.22 (2017-03-12)

* Added `en_HK` (English, Hong Kong) to `LocaleCode`
  ([Issue 36](https://github.com/TakahikoKawasaki/nv-i18n/issues/36)).

* Added `kk_KZ` (Kazakh, Kazakhstan) and `ru_KZ` (Russian, Kazakhstan) to `LocaleCode`
  ([Issue 37](https://github.com/TakahikoKawasaki/nv-i18n/issues/37)).


### 1.21 (2016-07-12)

* Added `fa` (Farsi) and `fa_IR` (Farsi, Iran) to `LocaleCode`.
  ([PR 33](https://github.com/TakahikoKawasaki/nv-i18n/pull/33)).


### 1.20 (2016-06-09)

* Added a new currency code, RUR (Russian Ruble before the 1998 denomination).
  ([Issue 32](https://github.com/TakahikoKawasaki/nv-i18n/issues/32)).


### 1.19 (2016-06-04)

* Added a new currency code, BYN (Belarusian Ruble)
  ([Issue 31](https://github.com/TakahikoKawasaki/nv-i18n/issues/31)).
  See [ISO 4217 AMENDMENT NUMBER 161](http://www.currency-iso.org/dam/isocy/downloads/dl_currency_iso_amendment_161.pdf).
* Corrected the currency name of `CurrencyCode.BYR` from
  `"Belarussian Ruble"` to `"Belarusian Ruble"`.


### 1.18 (2015-12-15)

* Corrected the language name of `LanguageAlpha3Code.ron` from
  `"Romansh"` to `"Romanian"`.
  ([Issue 29](https://github.com/TakahikoKawasaki/nv-i18n/issues/29))


### 1.17 (2015-07-25)

* Changed the numeric code of `CountryCode.FX` from -1 to 249.
* Changed the numeric code of `CountryCode.SU` from -1 to 810.
* Changed the numeric code of `CountryCode.TP` from  0 to 626.
* Changed the numeric code of `CountryCode.UK` from -1 to 826.
* Changed the numeric code of `CountryCode.ZR` from  0 to 180.
* Changed the behavior of `CountryCode.getByCode(int)` for shared
  numeric codes. See its JavaDoc for details.


### 1.16 (2015-07-25)

* Changed the value returned from `CountryCode.getByAlpha3()` of some
  `CountryCode` entries that had previously returned a 4-letter string
  ([Issue 28](https://github.com/TakahikoKawasaki/nv-i18n/issues/28)).
  To be concrete, the changes made are as follows. For backward
  compatibility, `CountryCode.getByCode(String, boolean)` and its
  variants accept the old 4-letter values listed here.

|  `CountryCode`   | Old Value  | New Value |
|:----------------:|:----------:|:---------:|
| `CountryCode.AN` |   `ANHH`   |   `ANT`   |
| `CountryCode.BU` |   `BUMM`   |   `BUR`   |
| `CountryCode.CS` |   `CSXX`   |   `SCG`   |
| `CountryCode.NT` |   `NTHH`   |   `NTZ`   |
| `CountryCode.TP` |   `TPTL`   |   `TMP`   |
| `CountryCode.YU` |   `YUCS`   |   `YUG`   |
| `CountryCode.ZR` |   `ZRCD`   |   `ZAR`   |

* Changed the implementation of `CountryCode.getByCode(String, boolean)`
  to return `CountryCode.FI` instead of `CountryCode.SF` when `"FIN"`
  is given.


### 1.15 (2015-04-25)

* Changed the country name of `CountryCode.AX` from "\u212Bland Islands"
  to "\u00C5land Islands".
  ([Issue 24](https://github.com/TakahikoKawasaki/nv-i18n/issues/24))


### 1.14 (2014-11-07)

* Fixed `CurrencyCode.XAF`. It contained `CD` (Congo, the Democratic
  Republic of the), but it should be `CG` (Cong).

* Added `CountryCode.UNDEFINED`.
* Added `CurrencyCode.UNDEFINED`.
* Added `LanguageAlpha3Code.undefined`.
* Added `LanguageCode.undefined`.
* Added `LocaleCode.undefined`.
* Added `ScriptCode.Undefined`.


### 1.13 (2014-06-13)

* Added `CountryCode.XK` for "Kosovo, Republic of".

* Changes common to `CountryCode`, `CurrencyCode`, `LanguageAlpha3Code`,
  `LanguageCode`, `LocaleCode` and `ScriptCode`.

  - Added `getByCodeIgnoreCase(String)`.

  - Changed the behavior of `getByCode(String)`. In older versions,
    it was an alias of `getByCode(String, false)`, but now it is
    an alias of `getByCode(String, true)`.

* Changes common to `CountryCode`, `CurrencyCode` and `ScriptCode`.

  - Changed the behavior of `getByCode(int)`. It now returns null
    when 0 or a negative integer is given.

* Changes common to `CurrencyCode` and `LocaleCode`.

  - Added `getByCountryIgnoreCase(String)`.

  - Changed the behavior of `getByCountry(String)`. In older versions,
    it was an alias of `getByCountry(String, false)`, but now it is
    an alias of `getByCountry(String, true)`.

* Changes on `LocaleCode`

  - Added `getByCodeIgnoreCase(String, String)`.

  - Changed the behavior of `getByCode(String, String)`. In older
    versions, it was an alias of `getByCode(String, String, false)`,
    but now it is an alias of `getByCode(String, String, true)`.

  - Added `getByLanguageIgnoreCase(String)`.

  - Changed the behavior of `getByLanguage(String)`. In older versions,
    it was an alias of `getByLanguage(String, false)`, but now it is
    an alias of `getByLanguage(String, true)`.
