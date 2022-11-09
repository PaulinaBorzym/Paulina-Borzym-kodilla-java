package com.kodilla.testing.calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        if (calculator.subtract(5,3) == 2) {
            System.out.println("Subtract test is ok!");
        }else {
            System.out.println("Error!");
        }

        if (calculator.add(5,3) == 8) {
            System.out.println("Add test is ok!");
        }else {
            System.out.println("Error!");
        }


    }
}
