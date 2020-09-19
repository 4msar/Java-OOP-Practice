import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int second = scanner.nextInt();

        System.out.println("What do you want to do?");
        System.out.println("+ for addition.");
        System.out.println("- for substract.");
        System.out.println("* for multiply.");
        System.out.println("/ for divission.");
        System.out.print("Type operation: ");

        char action = scanner.next().charAt(0);
        // Operations

        Calculator instance = new Calculator();
        instance.calculate(action, first, second);
    }

    public void calculate(char action, int first, int second) {
        double result = 0;
        boolean performed = false;
        Operations operation = new Operations(first, second);
        switch (action) {
            case '+':
                operation.add();
                result = operation.getResult();
                performed = true;
                break;
            case '-':
                operation.substract();
                result = operation.getResult();
                performed = true;
            case '*':
                operation.multiply();
                result = operation.getResult();
                performed = true;
            case '/':
                operation.divission();
                result = operation.getResult();
                performed = true;
            default:
                System.out.println("Invalid Operation!");
                break;
        }
        if (performed) {
            System.out.println("Result is: " + result);
        } else {
            System.out.println("No Action is performed!");
        }
    }
}

class Operations {
    int first;
    int second;
    double result;

    Operations(int one, int two) {
        this.first = one;
        this.second = two;
    }

    public void add() {
        this.result = first + second;
    }

    public void substract() {
        this.result = first > second ? first - second : second - first;
    }

    public void multiply() {
        this.result = first * second;
    }

    public void divission() {
        this.result = first > second ? first / second : second / first;
    }

    public double getResult() {
        return result;
    }
}