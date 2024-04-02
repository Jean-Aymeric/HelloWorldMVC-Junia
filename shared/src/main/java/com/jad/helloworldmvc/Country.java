package com.jad.helloworldmvc;

public enum Country {
    UNITED_KINGDOM("United Kingdom"),
    FRANCE("France"),
    SPAIN("Spain"),
    GERMANY("Germany"),
    INDONESIA("Indonesia");
    private final String name;

    Country(String name) {
        this.name = name;
    }

    boolean isNamed(String name) {
        return this.name.equals(name);
    }

    static Country fromName(String name) {
        for (Country country : values()) {
            if (country.isNamed(name)) {
                return country;
            }
        }
        return UNITED_KINGDOM;
    }
}
