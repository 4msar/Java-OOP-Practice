// 6. Create class named as ‘a’ and create a sub class ‘b’. Which is extends
// from class ‘a’. And use these classes in ‘inherit’ class.

public class QuestionSix { // Class name should be inherit
    public static void main(String[] args) {
        B obj = new B();
        obj.basicMethod();
        obj.anotherMethod();
    }
}

class A {
    void basicMethod() {
        System.out.println("This is a message from A");
    }
}

class B extends A {
    void anotherMethod() {
        System.out.println("This is a message from B");
    }
}
