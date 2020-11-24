import java.util.*;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();

        LargestNumber instance = new LargestNumber();
        int result = instance.getLargeNumber(number1, number2, number3);
        System.out.println("Result is: " + result);
        scanner.close();
    }

    public int getLargeNumber(int one, int two, int three) {
        int largeNumber = this.compareNumber(this.compareNumber(one, two), three);
        return largeNumber;
    }

    public int compareNumber(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }
}