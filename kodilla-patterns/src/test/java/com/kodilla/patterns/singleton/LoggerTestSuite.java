package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {
    private static Logger logger;

    @BeforeAll
    public static void logExample() {
        logger = Logger.INSTANCE;
        logger.log("Log 123");
    }

    @Test
    void TestGetLastLog() {
        //Given & When
        String lastLog = logger.getLastLog();
        System.out.println("Log: [" + lastLog + "]");
        //Then
        assertEquals("Log 123", lastLog);
    }
}
