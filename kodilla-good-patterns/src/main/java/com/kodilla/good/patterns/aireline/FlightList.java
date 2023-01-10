package com.kodilla.good.patterns.aireline;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class FlightList {
    List<Flights> flightsList = new ArrayList<>();

    public FlightList() {
        addFlights();
    }

    public List<Flights> getFlightsList() {
        return flightsList;
    }

    private void addFlights() {
        Flights flight1 = new Flights("Warsaw", "Gdansk",
                LocalDateTime.of(LocalDate.of(2023, 2, 2), LocalTime.of(10, 10, 0, 0)),
                LocalDateTime.of(LocalDate.of(2023, 2, 2), LocalTime.of(12, 30, 0, 0)));
        Flights flight2 = new Flights("Gdansk", "Warsaw",
                LocalDateTime.of(LocalDate.of(2023, 2, 5), LocalTime.of(10, 10, 0, 0)),
                LocalDateTime.of(LocalDate.of(2023, 2, 5), LocalTime.of(12, 30, 0, 0)));
        Flights flight3 = new Flights("Warsaw", "Wroclaw",
                LocalDateTime.of(LocalDate.of(2023, 2, 5), LocalTime.of(15, 30, 0, 0)),
                LocalDateTime.of(LocalDate.of(2023, 2, 5), LocalTime.of(17, 10, 0, 0)));
        Flights flight4 = new Flights("Wroclaw", "Gdansk",
                LocalDateTime.of(LocalDate.of(2023, 2, 8), LocalTime.of(10, 10, 0, 0)),
                LocalDateTime.of(LocalDate.of(2023, 2, 8), LocalTime.of(12, 30, 0, 0)));

        flightsList.add(flight1);
        flightsList.add(flight2);
        flightsList.add(flight3);
        flightsList.add(flight4);

    }


}
