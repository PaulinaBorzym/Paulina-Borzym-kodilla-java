package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class World {
    List<Continent> continents = new ArrayList<>();
    public void addContinent(Continent continent){
        continents.add(continent);
    }

    public BigDecimal getPeopleQuantity(){
        //private final BigDecimal sum = BigDecimal.ZERO;
        return continents.stream()
                .flatMap(continent -> continent.getCountry().stream())
                        .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }

}
