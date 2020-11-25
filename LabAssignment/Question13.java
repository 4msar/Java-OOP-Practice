import org.w3c.dom.TypeInfo;

// 13. Write a program to create automatic type conversions apply to
// overriding.

public class Question13 {
    public static void main(String[] args) {
        AutoTypeConversion autoTyper = new AutoTypeConversion();
        autoTyper.show("Saiful Alam");
        autoTyper.show(20);
        // we are called same method with different type of data
    }
}

class AutoTypeConversion {
    void show(String name) {
        System.out.println("This is string type data -> Name is: " + name);
    }

    void show(int age) {
        System.out.println("This is number type data -> Age is: " + age);
    }

}