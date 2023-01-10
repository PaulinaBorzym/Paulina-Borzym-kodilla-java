package com.kodilla.good.patterns.aireline;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

public class Flights {
    private String from;
    private String to;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;

    public Flights(String from, String to, LocalDateTime departureTime, LocalDateTime arrivalTime) {
        this.from = from;
        this.to = to;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public Flights(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public String toString() {
        return "Flights{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", departureTime=" + departureTime +
                ", arrivalTime=" + arrivalTime +
                '}';
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flights flights = (Flights) o;
        return Objects.equals(from, flights.from) && Objects.equals(to, flights.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to);
    }
}
