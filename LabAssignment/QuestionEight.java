// 8. Write a program to give a simple example for abstract class.

public class QuestionEight {
    public static void main(String[] args) {
        Student std = new Student();
        std.setName("Saiful Alam");
        std.showName();
    }
}

abstract class User {
    String name;

    abstract void setName(String str);

    void showName() {
        System.out.println("User name is: " + name);
    }
}

class Student extends User {
    void setName(String str) {
        this.name = str;
    }
}