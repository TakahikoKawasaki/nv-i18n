nv-i18n
=======

Overview
--------

Package to support internationalization, containing ISO 3166-1 country code enum,
ISO 639-1 language code enum, etc.

* CountryCode  : ISO 3166-1 country code.
* LanguageCode : ISO 639-1 language code.
* LocaleCode   : Available locales whose format match either 'xx' or 'xx-XX'.


License
-------

Apache License, Version 2.0


Download
--------

    git clone https://github.com/TakahikoKawasaki/nv-i18n.git


Javadoc
-------

[com.neovisionaris.i18n javadoc](http://TakahikoKawasaki.github.com/nv-i18n/)


Example
-------

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


Maven
-----

    <dependency>
        <groupId>com.neovisionaries</groupId>
        <artifactId>nv-i18n</artifactId>
        <version>1.0</version>
    </depenency>


See Also
--------

* [nv-i18n @ GitHub](https://github.com/TakahikoKawasaki/nv-i18n)
* [ISO 3166-1](http://en.wikipedia.org/wiki/ISO_3166-1)
* [ISO 3166-1 alpha-2](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)
* [ISO 3166-1 alpha-3](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-3)
* [ISO 3166-1 numeric](http://en.wikipedia.org/wiki/ISO_3166-1_numeric)
* [ISO 639-1](http://en.wikipedia.org/wiki/ISO_639-1)


TODO
----

* To register this to Maven Central Repository.
* To add missing entries to CountryCode.
* To add ScriptCode if time allows.


Note
----

This nv-i18n deprecates https://github.com/TakahikoKawasaki/CountryCode


Author
------

Takahiko Kawasaki, Neo Visionaries Inc.