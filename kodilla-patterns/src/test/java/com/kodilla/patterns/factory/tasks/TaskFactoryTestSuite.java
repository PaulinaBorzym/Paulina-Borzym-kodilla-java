package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {

    @Test
    void testShoppingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPING);
        //Then
        assertEquals("Lidl", shopping.getTaskName());
        assertEquals(false, shopping.isTaskExecuted());
        assertEquals("Start the task name:Lidl buy banana quantity 3.0", shopping.executeTask());
    }
    @Test
    void testPaintingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task painting = taskFactory.makeTask(TaskFactory.PAINTING);
        //Then
        assertEquals("Kowalski house", painting.getTaskName());
        assertEquals(false, painting.isTaskExecuted());
        assertEquals("Start the task.", painting.executeTask());
    }
    @Test
    void testDrivingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.makeTask(TaskFactory.DRIVING);
        //Then
        assertEquals("Weekend", driving.getTaskName());
        assertEquals(false, driving.isTaskExecuted());
        assertEquals("Start the task.", driving.executeTask());
    }

}
