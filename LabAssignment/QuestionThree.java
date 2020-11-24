//3. Write a program for the following
// ->Example for call by value.
// ->Example for call by reference.

public class QuestionThree {
    public static void main(String[] args) {
        Reference ref1 = new Reference("Akash");
        Reference ref2 = new Reference("Batash");

        System.out.println("Before call by ref the name is: " + ref2.name);
        ref1.setNameByReference(ref2);
        System.out.println("After call by ref the name is: " + ref2.name);

        // ref2.setNameByReference(ref1);
        // ref1.setNameByValue("Ashiq");

    }
}

/**
 * Reference
 */
class Reference {
    String name;

    Reference(String name) {
        this.name = name;
    }

    void setNameByReference(Reference obj) {
        obj.name = name;
    }

    void setNameByValue(String name) {
        this.name = name;
    }
}