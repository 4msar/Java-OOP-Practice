// 9. Write a program to create interface A, in this interface we have
// two method meth1 and meth2. Implements this interface in another
// class named MyClass.

public class QuestionNine {
    public static void main(String[] args) {
        MyClass cls = new MyClass();
        cls.method1();
        cls.method2();
    }
}

interface A {
    public void method1();

    public void method2();
}

class MyClass implements A {
    public void method1() {
        System.out.println("Implemented method 1");
    }

    public void method2() {
        System.out.println("Implemented method 2");
    }
}