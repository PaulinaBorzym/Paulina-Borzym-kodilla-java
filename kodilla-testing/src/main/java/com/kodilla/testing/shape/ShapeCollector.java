package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapeCollection = new ArrayList<>();

    public List<Shape> getShapeCollection() {
        return shapeCollection;
    }
    public void addFigure(Shape shape) {
        shapeCollection.add(shape);
    }
    public void removeFigure(Shape shape) {
        shapeCollection.remove(shape);
    }
    public Shape getFigure(int n) {
       return shapeCollection.get(n);
    }
    public String showFigures() {
        String result = "";
        for (int n = 0;n<shapeCollection.size();n++){
            if (n<shapeCollection.size()-1) {
                result = result + shapeCollection.get(n).getShapeName() + ",";
            }else{
                result =  result + shapeCollection.get(n).getShapeName();
            }
        }
        return result;
    }
}
