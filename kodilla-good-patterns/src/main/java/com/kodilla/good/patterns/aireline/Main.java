package com.kodilla.good.patterns.aireline;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        FindFlight findFlight = new FindFlight();
        List<FlightsViaResults> results = findFlight.flightFinderWithConnectingFlights("Warsaw", "Wroclaw", "Gdansk");
        System.out.println(results);
        System.out.println(findFlight.flightFinderTo("Warsaw"));
        System.out.println(findFlight.flightFinderFrom("Warsaw"));
    }
}
