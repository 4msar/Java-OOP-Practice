class Person {
    String firstName;
    String lastName;
    Person father;
    Person mother;

    public void setLastName(String name) {
        this.lastName = name;
    }

    public String getLastName() {
        return lastName;
    }

}

class Child extends Person {
    Person guardian;
    int age;
    int height;
    double weight;

    public void setGuardian(Person guardian) {
        this.guardian = guardian;
    }

    public Person getGuardian() {
        return guardian;
    }
}

class Main {
    public static void main(String[] args) {
        // rest of the code is here...
    }
}