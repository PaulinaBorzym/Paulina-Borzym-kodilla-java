package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }
    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }
    @Test
    @DisplayName ("Test odd numbers exterminator empty list. New list should be empty.")
    void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> numbers =  new ArrayList<>();
        //When
        List<Integer> evenList = exterminator.exterminate(numbers);
        //Then
        Assertions.assertEquals(evenList.size(),0);
    }
    @Test
    @DisplayName("Test odd numbers exterminator normal list. New list should have 2 items.")
    void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> numbers =  new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        //When
        List<Integer> evenList = exterminator.exterminate(numbers);
        //Then
        Assertions.assertEquals(evenList.size(),2);
    }
}
