package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country poland = new Country(new BigDecimal(54644));
        Country germany = new Country(new BigDecimal(5464877));
        Country argentina = new Country(new BigDecimal(5444));
        Country brazil = new Country(new BigDecimal(45744));
        Country spain = new Country(new BigDecimal(46557));
        Continent europe = new Continent();
        Continent southAmerica = new Continent();
        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(spain);
        southAmerica.addCountry(argentina);
        southAmerica.addCountry(brazil);
        World world = new World();
        world.addContinent(europe);
        world.addContinent(southAmerica);
        //When
        BigDecimal result = world.getPeopleQuantity();
        //Then
        Assertions.assertEquals(new BigDecimal(5617266),result);
    }
}
