// 5. Write a Java program using overriding method where Parent class
// name Bank and child classes are EximBank, JanataBank and SonaliBank.
// Parent class has a variable named salary which holds 22000 taka and a
// string variable. Child class will extend this salary 10% for EximBank, 9%
// for JanataBank and 12% for SonaliBank. After increasing salary for each
// child class, output should be printed from main method. -6
public class QuestionFive {
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
        return salary + salary * .09;
    }
}

class SonaliBank extends Bank {
    SonaliBank() {
        this.bankName = "Sonali Bank";
    }

    @Override
    double getSalary() {
        return salary + salary * .12;
    }
}