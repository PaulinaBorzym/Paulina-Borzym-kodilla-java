package com.kodilla.test;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuit {
    @Test
    public void testSecondChallenge() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();
        // when & then
        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2.0, 2.0)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.9, 3.2)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.1, 1.5)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.1, 1.4))
        );
    }
}
