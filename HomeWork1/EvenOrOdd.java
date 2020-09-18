import java.util.*;

public class EvenOrOdd {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        if( number % 2 == 0 ){
            System.out.print("The number is Even!");
        }else{
            System.out.print("The number is Odd!");
        }
    }
}