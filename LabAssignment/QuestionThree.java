//3. Write a program for the following
// ->Example for call by value.
// ->Example for call by reference.

public class QuestionThree {
    public static void main(String[] args) {
        Reference ref = new Reference();

        System.out.println("Before call by ref the name is: " + ref.name);
        ref.setNameByReference(ref);
        System.out.println("After call by ref the name is: " + ref.name);

        // ref2.setNameByReference(ref1);
        // ref1.setNameByValue("Ashiq");

    }
}

/**
 * Reference
 */
class Reference {
    String name = "My Name Is Khan";

    void setNameByReference(Reference obj) {
        obj.name = "I'm changed by the Reference!";
    }

    void setNameByValue(String name) {
        this.name = name;
    }
}