package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

@DisplayName("TDD: Shape Collector Test Suite")
    class ShapeTestSuite {
        private static int testCounter = 0;

        @BeforeAll
        public static void beforeAllTests() {
            System.out.println("This is the beginning of tests.");
        }

        @AfterAll
        public static void afterAllTests() {
            System.out.println("All tests are finished.");
        }

        @BeforeEach
        public void beforeEveryTest() {
            testCounter++;
            System.out.println("Preparing to execute test #" + testCounter);
        }
    @Nested
    @DisplayName("Tests for shapes.")
    class TestShapes {
        @Test
        void TestAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle(24.0);
            // When
            shapeCollector.addFigure(circle);
            // Then
            Assertions.assertEquals (shapeCollector.getShapeCollection().size(),1);
        }
        @Test
        void TestRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle(24.0);
            shapeCollector.addFigure(circle);
            // When
            shapeCollector.removeFigure(circle);
            // Then
            Assertions.assertEquals (shapeCollector.getShapeCollection().size(),0);
        }
        @Test
        void TestGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle(24.0);
            shapeCollector.addFigure(circle);
            // When
            Shape result = shapeCollector.getFigure(0);
            // Then
            Assertions.assertEquals(circle,result);
        }
        @Test
        void TestShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle(24.0);
            Square square = new Square(34.9);
            Triangle triangle = new Triangle(11.6);
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(triangle);
            // When
            String result = shapeCollector.showFigures();
            // Then
            Assertions.assertEquals("Circle,Square,Triangle", result);
        }
    }
}
