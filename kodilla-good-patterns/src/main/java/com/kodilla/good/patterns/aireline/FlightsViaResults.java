package com.kodilla.good.patterns.aireline;

public class FlightsViaResults {
    private Flights firstFlight;
    private Flights secondFlight;

    public FlightsViaResults(Flights firstFlight, Flights secondFlight) {
        this.firstFlight = firstFlight;
        this.secondFlight = secondFlight;
    }

    @Override
    public String toString() {
        return "FlightsViaResults{" +
                "firstFlight=" + firstFlight +
                ", secondFlight=" + secondFlight +
                '}';
    }

    public Flights getFirstFlight() {
        return firstFlight;
    }

    public void setFirstFlight(Flights firstFlight) {
        this.firstFlight = firstFlight;
    }

    public Flights getSecondFlight() {
        return secondFlight;
    }

    public void setSecondFlight(Flights secondFlight) {
        this.secondFlight = secondFlight;
    }
}
