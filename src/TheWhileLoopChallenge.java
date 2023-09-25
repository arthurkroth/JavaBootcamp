/*
TheWhileLoopChallenge
Arthur Kroth
17.09.23
*/
public class TheWhileLoopChallenge {
    public static void main(String[] args) {
        int numbers = 5;
        int oddNumbers = 0;
        int evenNumbers= 0;
        while (numbers <= 20){
            if (isEvenNumber(numbers)) {
                evenNumbers++;
                System.out.println(numbers);
            } else {
                oddNumbers++;
            }
            numbers++;
            if (evenNumbers == 5 ){
                System.out.println(evenNumbers + " even numbers found - Exiting the loop!");
                System.out.println("Total of " + evenNumbers + " even and " + oddNumbers +" found!");
                break;
            }
        }
    }
    public static boolean isEvenNumber(int number){
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
