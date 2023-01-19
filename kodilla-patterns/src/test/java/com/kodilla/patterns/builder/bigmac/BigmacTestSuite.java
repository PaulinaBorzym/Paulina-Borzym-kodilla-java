package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {
    @Test
    void testBicMacNew(){
        //Given
        Bigmac bigmac = new Bigmac.BigMacBuilder()
                .bun("with sesame")
                .sauce("standard")
                .burgers(2)
                .ingredient("onion")
                .ingredient("chilli")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        assertEquals(2, howManyIngredients);

    }
}
