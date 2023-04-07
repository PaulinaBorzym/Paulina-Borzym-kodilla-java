package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.patterns2.decorator.taxiportal.BasicTaxiOrder;
import com.kodilla.patterns2.decorator.taxiportal.TaxiOrder;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        // When
        BigDecimal calculatedCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription(){
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Pizza dough, tomato sauce, cheese", description);
    }

    @Test
    public void testPizzaWithOnionAndHamPizzaOrderGetCost()
    {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new OnionDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(19), calculatedCost);
    }
    @Test
    public void testPizzaWithOnionAndHamPizzaOrderGetDescription()
    {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new OnionDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza dough, tomato sauce, cheese, onion, ham", description);
    }

    @Test
    public void testPizzaWithOlivesAndMushroomsAndExtraCheesePizzaOrderGetCost()
    {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new OlivesDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(27), calculatedCost);
    }
    @Test
    public void testPizzaWithOlivesAndMushroomsAndExtraCheesePizzaOrderGetDescription()
    {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new OlivesDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza dough, tomato sauce, cheese, olives, mushrooms, extra cheese", description);
    }
}
