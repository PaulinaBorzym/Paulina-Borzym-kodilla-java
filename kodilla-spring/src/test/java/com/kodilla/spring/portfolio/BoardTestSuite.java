package com.kodilla.spring.portfolio;

import com.kodilla.spring.reader.Reader;
import com.kodilla.spring.reader.ReaderConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {
    @Test
    void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().addTask("Task 1");
        board.getInProgressList().addTask("Task 2");
        board.getDoneList().addTask("Task 3");
        String toDoTask = board.getToDoList().getTask(0);
        String inProgressTask = board.getInProgressList().getTask(0);
        String doneTask = board.getDoneList().getTask(0);
        //Then
        Assertions.assertEquals("Task 1", toDoTask);
        Assertions.assertEquals("Task 2", inProgressTask);
        Assertions.assertEquals("Task 3", doneTask);
    }
}
