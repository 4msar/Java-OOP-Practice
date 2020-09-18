import java.util.*;

public class PositiveNegative {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        if( number > 0 ){
            System.out.print("The number is Positive!");
        }else{
            System.out.print("The number is Negative!");
        }
    }
}