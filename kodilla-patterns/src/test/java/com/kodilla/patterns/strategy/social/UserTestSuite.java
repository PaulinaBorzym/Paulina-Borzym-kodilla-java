package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies(){
        //Given
        User a = new Millenials("Ala");
        User b = new YGeneration("Bala");
        User c = new ZGeneration("Cala");

        //When
        String aUse = a.sharePost();
        System.out.println("Ala use " + aUse);
        String bUse = b.sharePost();
        System.out.println("Bala use " + bUse);
        String cUse = c.sharePost();
        System.out.println("Cala use " + cUse);

        //Then
        assertEquals("Facebook", aUse);
        assertEquals("Twitter", bUse);
        assertEquals("Snapchat", cUse);
    }

    @Test
    void testIndividualSharingStrategy(){
        //Given
        User a = new Millenials("Ala");

        //When
        String aUse = a.sharePost();
        System.out.println("Ala use " + aUse);
        a.setSocialPublisher(new SnapchatPublisher());
        aUse = a.sharePost();
        System.out.println("Ala use " + aUse);

        //Then
        assertEquals("Snapchat", aUse);
    }
}
