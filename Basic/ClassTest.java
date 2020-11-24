// Write a java program using overriding method where parent class name Bank and child classes are EximBank, JanataBank and SonaliBank. Parent class has a variable named salary which holds 22000 taka and a string variable. Child class will extends this salary 10% for EximBank, 15% for JanataBank and 20% for SonaliBank. After increasing salary for each child class, output should be printed from main method

/**
 * ClassTest
 */
public class ClassTest {
    public static void main(String[] args) {
        Bank exim = new EximBank();
        System.out.println(exim.bankName + " paying salary : " + exim.getSalary());

        Bank janata = new JanataBank();
        System.out.println(janata.bankName + " paying salary : " + janata.getSalary());

        Bank sonali = new SonaliBank();
        System.out.println(sonali.bankName + " paying salary : " + sonali.getSalary());

    }
}

/**
 * Bank
 */
class Bank {
    double salary = 22000;
    String bankName = "Bank";

    double getSalary() {
        return salary;
    }
}

/**
 * EximBank
 */
class EximBank extends Bank {
    EximBank() {
        this.bankName = "Exim Bank";
    }

    @Override
    double getSalary() {
        return salary + salary * .10;
    }
}

class JanataBank extends Bank {
    JanataBank() {
        this.bankName = "Janata Bank";
    }

    @Override
    double getSalary() {
        return salary + salary * .15;
    }
}

class SonaliBank extends Bank {
    SonaliBank() {
        this.bankName = "Sonali Bank";
    }

    @Override
    double getSalary() {
        return salary + salary * .20;
    }
}