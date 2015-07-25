CHANGES
=======

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
