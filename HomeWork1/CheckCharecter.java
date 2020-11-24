import java.util.*;

public class CheckCharecter {
    char theCharecter;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Charecter: ");
        char charecter = scanner.next().charAt(0);

        CheckCharecter instance = new CheckCharecter(charecter);
        instance.printResult();
        scanner.close();
    }

    CheckCharecter(char ch) {
        this.theCharecter = ch;
    }

    public void printResult() {
        if (this.isVowelOrConsonant()) {
            System.out.println("The Charecter is Vowel!");
        } else {
            System.out.println("The Charecter is Consonant!");
        }
    }

    public boolean isVowelOrConsonant() {
        boolean result = false;
        switch (theCharecter) {
            case 'a':
                result = true;
                break;
            case 'e':
                result = true;
                break;
            case 'i':
                result = true;
                break;
            case 'o':
                result = true;
                break;
            case 'u':
                result = true;
                break;
            default:
                result = false;
        }
        return result;
    }

}