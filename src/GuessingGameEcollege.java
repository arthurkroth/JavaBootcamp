public class GuessingGameEcollege {
    public static void main(String[] args) {
        int randomNum = 0;
        int guess;

        if (args.length == 0 || args[0].compareTo("help") == 0){
            System.out.println("Usage: java GuessingGame [argument]");
            System.out.println();
            System.out.println("Enter a number from 1 - 5 as your guess");
        } else {
            randomNum = ((int)(Math.random()*5) +1);
            guess = Integer.parseInt(args[0]);
            if (guess < 1 || guess > 5){
                System.out.println("Invalid argument: Enter a value between 1 and 5 only");
            } else if (guess == randomNum) {
                System.out.println("Great guess, you got it right!!!");
            } else {
                System.out.println("Sorry, the number was " + randomNum + "Try again!");
            }
        }
    }
}
