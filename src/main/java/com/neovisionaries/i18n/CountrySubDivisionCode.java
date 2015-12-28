package com.neovisionaries.i18n;

public interface CountrySubDivisionCode {
    String getCode();

    CountryCode getCountryCode();

    boolean isRealRegion();

}
