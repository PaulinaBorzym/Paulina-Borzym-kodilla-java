package com.kodilla.good.patterns.aireline;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindFlight {
    FlightList flightList = new FlightList();

    public List<Flights> flightFinderFrom(String from) {
        List<Flights> listOfFlights = flightList.getFlightsList();
        List<Flights> findFlights = listOfFlights.stream()
                .filter(f -> f.getFrom().equals(from))
                .collect(Collectors.toList());
        return findFlights;
    }

    public List<Flights> flightFinderTo(String to) {
        List<Flights> listOfFlights = flightList.getFlightsList();
        List<Flights> findFlights = listOfFlights.stream()
                .filter(f -> f.getTo().equals(to))
                .collect(Collectors.toList());
        return findFlights;
    }

    public List<FlightsViaResults> flightFinderWithConnectingFlights(String from, String via, String to) {
        List<Flights> listOfFlights = flightList.getFlightsList();
        Flights flights1 = new Flights(from, via);
        Flights flights2 = new Flights(via, to);
        List<Flights> firstFlight = listOfFlights.stream()
                .filter(f -> f.equals(flights1))
                .collect(Collectors.toList());

        List<Flights> secondFlight = listOfFlights.stream()
                .filter(f -> f.equals(flights2))
                .collect(Collectors.toList());

        List<FlightsViaResults> flightsViaResults = new ArrayList<>();

        for (Flights first : firstFlight) {
            for (Flights second : secondFlight) {
                if (first.getArrivalTime().isBefore(second.getDepartureTime().plusHours(1L))) {
                    flightsViaResults.add(new FlightsViaResults(first, second));
                }
            }
        }
        return flightsViaResults;
    }
}
