package com.kodilla.exception.test;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(0.0,0.0);
        }catch (Exception e){
            System.out.println("Problem with numbers");
        }
    }
}
