/*
GettingInputFromUserChallenge
Arthur Kroth
28.09.23
*/
import java.util.InputMismatchException;
import java.util.Scanner;
public class GettingInputFromUserChallenge {
    public static void main(String[] args) {
    getInputFromScanner();
    }
    public static void getInputFromScanner(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int []numbers = new int[5];
        int counter = 0;
        while (counter < 5) {
            try {
                System.out.println("Enter number #" + (counter + 1) + ": ");
                numbers[counter] = scanner.nextInt();
                counter++;
            } catch (InputMismatchException test1) {
                System.out.println("Invalid number");
                scanner.next();
            }
        }
        sum = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4];
        System.out.println("The SUM of your 5 numbers is: " + sum);
    }
}

/*
Read 5 valid numbers from the console, entered by the user and print the SUM of those 5 numbers.
Check if the numbers entered are valid integer numbers
If not, print the message "Invalid Number" to the console, but continue looping, until you do have 5 valid numbers.
We should display a text to the user when receiving the number "Enter number #x:" Where x represent the count 1,2,3, etc.
*/