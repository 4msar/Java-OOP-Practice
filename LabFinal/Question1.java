import java.util.*;

//Q: Write a Java method to find the smallest number among three numbers using Scanner method.

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();

        Compare instance = new Compare();
        int result = instance.getSmallNumber(number1, number2, number3);
        System.out.println("Small number is: " + result);
        scanner.close();
    }

}

class Compare {

    public int getSmallNumber(int one, int two, int three) {
        int smallNumber = this.compareNumber(this.compareNumber(one, two), three);
        return smallNumber;
    }

    public int compareNumber(int first, int second) {
        if (first < second) {
            return first;
        } else {
            return second;
        }
    }
}