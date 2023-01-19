package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask (final String taskClass){
        return switch (taskClass){
            case SHOPPING -> new ShoppingTask("Lidl", "banana", 3);
            case PAINTING -> new PaintingTask("Kowalski house", "blue","Room 1");
            case DRIVING -> new DrivingTask("Weekend", "Wroclaw", "Car");
            default -> null;
        };
    }
}
