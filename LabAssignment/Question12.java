// 12. Create a class named “A” with a function display (), again create
// another class inside the “A” class named “B” with a function called
// display () and call the two functions in the main class.

public class Question12 {// class name should be Main
    public static void main(String[] args) {
        A root = new A();
        root.display();
        A.B inter = root.new B();
        inter.display();
    }
}

class A {
    void display() {
        System.out.println("Showing the data from Root Class!");
    }

    class B {
        void display() {
            System.out.println("Showing the data from Internal Class!");
        }
    }
}