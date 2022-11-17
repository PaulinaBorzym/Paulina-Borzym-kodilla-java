package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    private final BigDecimal quantity;

    public Country(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public  BigDecimal getPeopleQuantity(){
        return quantity;
    }
}
