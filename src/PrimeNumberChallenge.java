/*
Prime Number Challenge - For loop
Arthur Kroth
16.09.23
*/
public class PrimeNumberChallenge {
    public static void main(String[] args) {
        int primeNumbersFound = 0;

        for (int i = 10 ; i <= 50 ; i++) {
            if (isPrime(i)) {
                System.out.println("Number " + i + " is a prime number");
                primeNumbersFound++;
                if (primeNumbersFound == 3){
                    System.out.println("Found 3 - exiting loop!");
                    break;
                }
            }
        }
    }
    public static boolean isPrime(int wholeNumber){

        if (wholeNumber <= 2){
            return (wholeNumber == 2);
        }
        for (int divisor = 2; divisor < wholeNumber; divisor++){
            if (wholeNumber % divisor == 0){
                return false;
            }
        }
        return true;
    }
}
