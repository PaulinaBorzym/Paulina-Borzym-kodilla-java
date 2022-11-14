package com.kodilla.testing.shape;

public class Square implements Shape{

    private String shapeName = "Square";
    private double field;

    public Square(double field) {
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
