package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class Continent {

    List<Country> countries = new ArrayList<>();
    public void addCountry(Country country){
        countries.add(country);
    }

    public List<Country> getCountry() {
        return countries;
    }
}
