/*
Sum 3 and 5 challenge
Arthur Kroth
16.09.23
*/
public class Sum3And5Challenge {
    public static void main(String[] args) {
        int numbers = 0;
        int numbersFound = 0;
        for (int i = 1; i <= 1000; i++){
            if (i % 3 == 0 && i % 5 == 0){
                numbers += i;
                numbersFound++;
                System.out.println("The number is : " + i + " and the SUM of them is : " + numbers);
                if (numbersFound == 5){
                    System.out.println("5 numbers found - exiting loop");
                    break;
                }
            }

        }
        System.out.println("The total SUM of the 5 found numbers is: " + numbers);
    }
}
