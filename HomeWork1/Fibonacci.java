import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        // Operations
        Fibonacci instance = new Fibonacci();
        System.out.print("Choose Action (1: using for loop, 2: using while loop): ");
        int action = scanner.nextInt();
        if (action == 1) {
            instance.usingForLoop(number);
        } else {
            instance.usingWhileLoop(number);
        }
    }

    public void usingForLoop(int counter) {
        int i, num1 = 0, num2 = 1, result;

        System.out.print(num1 + " " + num2);
        for (i = 2; i < counter; ++i) {
            result = num1 + num2;
            System.out.print(" " + result);
            num1 = num2;
            num2 = result;
        }
        System.out.println(" ");
    }

    public void usingWhileLoop(int counter) {
        int i = 2, num1 = 0, num2 = 1, result;

        System.out.print(num1 + " " + num2);
        while (i < counter) {
            result = num1 + num2;
            System.out.print(" " + result);
            num1 = num2;
            num2 = result;
            i++;
        }
        System.out.println(" ");
    }
}