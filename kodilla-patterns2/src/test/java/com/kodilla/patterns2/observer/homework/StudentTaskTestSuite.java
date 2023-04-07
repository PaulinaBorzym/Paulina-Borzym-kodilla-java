package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Equals;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTaskTestSuite {

    @Test
    public void testUpdate(){
        //Given
        StudentTask aniaKania = new AniaKania();
        StudentTask haniaBania = new HaniaBania();
        Mentor piotrKot = new Mentor("Piotr Kot");
        Mentor adamTam = new Mentor("Adam Tam");
        aniaKania.registerObserver(piotrKot);
        haniaBania.registerObserver(adamTam);
        //When
        aniaKania.addTask("Task1");
        aniaKania.addTask("Task2");
        haniaBania.addTask("Task 1");
        haniaBania.addTask("Task 2");
        haniaBania.addTask("Task 3");
        //Then
        assertEquals(2, piotrKot.getUpdateCount());
        assertEquals(3, adamTam.getUpdateCount());

    }
}
