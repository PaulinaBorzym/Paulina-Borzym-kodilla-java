package com.kodilla.testing.shape;

public class Circle implements Shape {

    private String shapeName = "Circle";
    private double field;

    public Circle(double field) {
        this.field = field;
    }
    @Override
    public String getShapeName() {
        return shapeName;
    }
    @Override
    public double getField() {
        return field;
    }
}
