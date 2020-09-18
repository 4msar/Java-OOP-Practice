class Person {
    String name;
    int age;
    
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}

public class People {
    public static void main(String []args) {
        Person man = new Person("Akash", 23);
        System.out.println(man.getName());
    }
}
