// 7. Write a program to create a class named shape. In this class we have
// three sub classes circle, triangle and square each class has two-member
// function named draw () and erase (). Create these using polymorphism
// concepts.

public class QuestionSeven {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();
        Shape triangle = new Triangle();
        triangle.draw();
        Shape square = new Square();
        square.draw();

    }
}

class Shape {
    void draw() {
        System.out.println("Drawing Shape!");
    }

    void erase() {
        System.out.println("Erasing the Shape!");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Round Shape!");
    }

    void erase() {
        System.out.println("Erasing the Round Shape!");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("Drawing Triangle Shape!");
    }

    void erase() {
        System.out.println("Erasing the Triangle Shape!");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing Square Shape!");
    }

    void erase() {
        System.out.println("Erasing the Square Shape!");
    }
}
