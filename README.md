nv-i18n
=======

Overview
--------

Package to support internationalization, containing ISO 3166-1 country code enum,
ISO 639-1 language code enum, etc.

License
-------

Apache License, Version 2.0

Download
--------

    https://github.com/TakahikoKawasaki/nv-i18n.git

Javadoc
-------

Example
-------

    CountryCode cc = CountryCode.getByCode("JP");

    System.out.println("Country name = " + cc.getName());                  // "Japan"
    System.out.println("ISO 3166-1 alpha-2 code = " + cc.getAlpha2());     // "JP"
    System.out.println("ISO 3166-1 alpha-3 code = " + cc.getAlpha3());     // "JPN"
    System.out.println("ISO 3166-1 numeric code = " + cc.getNumeric());    // 392

See Also
--------

* [ISO 3166-1](http://en.wikipedia.org/wiki/ISO_3166-1)
* [ISO 3166-1 alpha-2](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)
* [ISO 3166-1 alpha-3](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-3)
* [ISO 3166-1 numeric](http://en.wikipedia.org/wiki/ISO_3166-1_numeric)
* [ISO 639-1](http://en.wikipedia.org/wiki/ISO_639-1)

TODO
----

* To register this to Maven Central Repository.

Note
----

This deprecates https://github.com/TakahikoKawasaki/CountryCode.git

Author
------

Takahiko Kawasaki, Neo Visionaries Inc.