// Q: Write a Java program using overriding method where Parent class name Bank and child
// classes are EximBank and DhakaBank. Parent class has a variable named salary which
// holds 25000 taka. Child class will extends this salary 10% for EximBank and 12% for
// DhakaBank. After increasing salary for each child class, output should be printed from
// main method.

class Question3 {
    public static void main(String[] args) {
        Bank exim = new EximBank();
        System.out.println(exim.bankName + " paying salary : " + exim.getSalary());

        Bank dhaka = new DhakaBank();
        System.out.println(dhaka.bankName + " paying salary : " + dhaka.getSalary());
    }
}

/**
 * Bank
 */
class Bank {
    double salary = 25000;
    String bankName = "Bank";

    double getSalary() {
        return salary;
    }
}

class EximBank extends Bank {
    EximBank() {
        this.bankName = "Exim Bank";
    }

    @Override
    double getSalary() {
        return salary + salary * .10;
    }
}

class DhakaBank extends Bank {
    DhakaBank() {
        this.bankName = "Dhaka Bank";
    }

    @Override
    double getSalary() {
        return salary + salary * .12;
    }
}