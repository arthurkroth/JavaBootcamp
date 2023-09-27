/*
GettingInputFromUser
Arthur Kroth
27.09.23
*/
import java.util.Scanner;

public class GettingInputFromUser {
    public static void main(String[] args) {
        int currentYear = 2023;

        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e){
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    public static String getInputFromConsole(int currentYear){
        String name = System.console().readLine("Hi, What's your name?");
        System.out.println("Hello " + name + ", Thanks for taking the course!");

        String dateOfBirth = System.console().readLine("What year were you born?");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old.";
    }

    public static String getInputFromScanner(int currentYear){
        Scanner scanner = new Scanner(System.in);

        //Ask for name.
        System.out.println("Hi, what's your name?");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + ", Thanks for taking the course!");

        //Ask for DOB and calls the method checkData()
        System.out.println("What year were you born?");

        boolean validDOB = false;
        int age = 0;

        do {
            System.out.println("Enter a year of birth >= " + (currentYear - 125) + " and <= "+ currentYear);
            //Adds a try to handle the error if the user types text when it was supposed to type numbers.
            try {
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age < 0 ? false : true;
            //The catch will display the message to the user and give the user the option to try again without breaking the program.
            } catch (NumberFormatException badUserData) {
                System.out.println("Characters not allowed!!! Try again.");
            }
        } while (!validDOB);

        return "Hi " + name + ", you are " + age + " years old." ;
    }
    public static int checkData(int currentYear, String dateOfBirth){
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if ((dob < minimumYear) || (dob > currentYear)){
            return -1;
        }
        return (currentYear-dob);
    }
}
