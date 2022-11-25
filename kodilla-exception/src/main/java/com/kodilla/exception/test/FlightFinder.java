package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public boolean findFilght(Flight flight) throws RouteNotFoundException {
        Map<String , Boolean> airport = new HashMap<>();

        airport.put("London",true);
        airport.put("Paris", true);
        airport.put("Moscow", false);
        airport.put("Berlin", false);

        return airport.entrySet().stream()
                .filter(a -> a.getKey().equals(flight.getArrivalAirport()))
                .map(a -> a.getValue())
                .findFirst()
                .orElseThrow(()->new RouteNotFoundException());
    }

    public static void main (String[] args){
        FlightFinder flightFinder = new FlightFinder();
        Flight flight = new Flight("Berlin", "Warsow");
        try {
            flightFinder.findFilght(flight);
        }catch (RouteNotFoundException e)
        { System.out.println("No airport find");
        }
    }
}
