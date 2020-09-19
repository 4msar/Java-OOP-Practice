import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        // Operations

        Factorial instance = new Factorial();
        System.out.print("Choose Action (1: using for loop, 2: using while loop): ");
        int action = scanner.nextInt();
        if (action == 1) {
            instance.usingForLoop(number);
        } else {
            instance.usingWhileLoop(number);
        }
    }

    public void usingForLoop(int number) {
        if (number < 0)
            System.out.println("Error! Factorial of a negative number doesn't exist.");
        else {
            int factorial = 1;
            for (int i = 1; i <= number; ++i) {
                factorial *= i;
            }
            System.out.println("Factorial of " + number + " is " + factorial);
        }
    }

    public void usingWhileLoop(int number) {
        if (number < 0)
            System.out.println("Error! Factorial of a negative number doesn't exist.");
        else {
            int i = 1, factorial = 1;
            while (i <= number) {
                factorial *= i;
                i++;
            }
            System.out.println("Factorial of " + number + " is " + factorial);
        }
    }

}