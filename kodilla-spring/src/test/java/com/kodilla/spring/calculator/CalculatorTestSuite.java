package com.kodilla.spring.calculator;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    public void testCalculations(){
        //Given
        //When
        double add = calculator.add(2.5,2.7);
        double sub = calculator.sub(3,1);
        double mul = calculator.mul(2,2);
        double div = calculator.div(2,2);
        //Then
       assertEquals(5.2,add);
       assertEquals(2,sub);
       assertEquals(4,mul);
       assertEquals(1,div);
    }
}
