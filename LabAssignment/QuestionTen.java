// 10. Write a program to create an interface “A”, abstract class “B” and
// a class “C”. In interface “A” has a method named display () and
// abstract class has also a display () method. If C class implements both
// A and B then how to access the display method?

public class QuestionTen {
    public static void main(String[] args) {
        C cls = new C();
        cls.display();
    }
}

interface A {
    public void display();
}

// we can implement the interface here also.
abstract class B {
    public void display() {
        System.out.println("I'm displaying this message from abstract class!");
    }
}

/*
 * here we are extend the abstract method and implement the interface A, we are
 * added a method in our abstract class and our C class extend the abstract
 * class, so we no need to implement our display method in our class, cause
 * class C own the display method from B
 */
class C extends B implements A {
    // no need to implement again the display method
}