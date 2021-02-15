nv-i18n
=======

Overview
--------

Package to support internationalization, containing ISO 3166-1 country code enum,
ISO 639-1 language code enum, ISO 15924 script code enum, etc.

| Class                | Description                                                  |
|:---------------------|:-------------------------------------------------------------|
| `CountryCode`        | ISO 3166-1 country code.                                     |
| `LanguageCode`       | ISO 639-1 language code.                                     |
| `LanguageAlpha3Code` | ISO 639-2 language code.                                     |
| `LocaleCode`         | Available locales whose format match either 'xx' or 'xx-XX'. |
| `ScriptCode`         | ISO 15924 script code.                                       |
| `CurrencyCode`       | ISO 4217 currency code.                                      |


License
-------

  Apache License, Version 2.0


Maven
-----

```xml
<dependency>
    <groupId>com.metronom</groupId>
    <artifactId>nv-i18n</artifactId>
    <version>1.28</version>
</dependency>
```


Gradle
------

```gradle
dependencies {
    compile 'com.metronom:nv-i18n:1.28'
}
```


OSGi
----

    Bundle-SymbolicName: com.metronom.i18n
    Export-Package: com.metronom.i18n;version="1.28"


Source Code
-----------

  <code>https://github.com/MetroSteffenPaul/nv-i18n.git</code>


JavaDoc
-------

  <code>http://MetroSteffenPaul.github.io/nv-i18n/</code>


Example
-------

```java
// List all the country codes.
for (CountryCode code : CountryCode.values())
{
    System.out.format("[%s] %s\n", code, code.getName());
}

// List all the language codes.
for (LanguageCode code : LanguageCode.values())
{
    System.out.format("[%s] %s\n", code, code.getName());
}

// List all the locale codes.
for (LocaleCode code : LocaleCode.values())
{
    String language = code.getLanguage().getName();
    String country  = code.getCountry() != null
                    ? code.getCountry().getName() : null;

    System.out.format("[%s] %s, %s\n", code, language, country);
}

// List all the script codes.
for (ScriptCode code : ScriptCode.values())
{
    System.out.format("[%s] %03d %s\n", code, code.getNumeric(), code.getName());
}

// List all the currency codes.
for (CurrencyCode code : CurrencyCode.values())
{
    System.out.format("[%s] %03d %s\n", code, code.getNumeric(), code.getName());
}
```


See Also
--------

* [nv-i18n @ GitHub](https://github.com/TakahikoKawasaki/nv-i18n)
* Country Code [ISO 3166-1](http://en.wikipedia.org/wiki/ISO_3166-1)
* Country Code [ISO 3166-1 alpha-2](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)
* Country Code [ISO 3166-1 alpha-3](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-3)
* Country Code [ISO 3166-1 numeric](http://en.wikipedia.org/wiki/ISO_3166-1_numeric)
* Language Code [ISO 639-1](http://en.wikipedia.org/wiki/ISO_639-1)
* Language Alpha3 Code [ISO 639-2](http://en.wikipedia.org/wiki/ISO_639-2)
* Script Code [ISO 15924](http://en.wikipedia.org/wiki/ISO_15924)
* Currency Code [ISO 4217](http://en.wikipedia.org/wiki/ISO_4217)


TODO
----

* To add missing entries to CountryCode.
* To add international telephone dial number.


Note
----

This nv-i18n was forked from https://github.com/TakahikoKawasaki/nv-i18n due to inactivity of the former maintainer.


Author
------

Steffen Paul, [Metro Digital](https://www.metro.digital/)
