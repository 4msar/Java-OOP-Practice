// 4. Write a program to create a class named “shape”. In this class we
// have a method named “area”. Now you have to calculate area of the
// circle, rectangular and square using the same method.

public class QuestionFour {
    public static void main(String[] args) {
        Shape rectangle = new Rectangular();
        rectangle.area(20, 15);

        Shape circle = new Circle();
        circle.area(2.5);

        Shape square = new Square();
        square.area(15);
    }
}

/**
 * Shape
 */
class Shape {
    void area(double radiusOrArm) {
    }

    void area(double height, double width) {
    }
}

class Circle extends Shape {
    final double PI_VALUE = 3.1416;

    @Override
    void area(double radius) {
        double result = PI_VALUE * (radius * radius);
        System.out.println("Circle area is: " + result);
    }
}

class Square extends Shape {
    @Override
    void area(double arm) {
        double result = (arm * arm);
        System.out.println("Square area is: " + result);
    }
}

class Rectangular extends Shape {
    @Override
    void area(double height, double width) {
        double result = (height * width);
        System.out.println("Rectangular area are is: " + result);
    }
}