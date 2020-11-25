// 11. Write a program to create interface named test. In this interface
// the member function is square. Implement this interface in
// arithmetic class. Create one new class called ToTestInt in this class
// use the object of arithmetic class.

public class Question11 { // the class name should be ToTestInt
    public static void main(String[] args) {
        Test sub = new Arithmetic();
        sub.square(4);
    }
}

interface Test {
    public void square(float value);
}

class Arithmetic implements Test {
    public void square(float value) {
        float result = value * value;
        System.out.println("Square result is :" + result);
    }
}
