/*
TheWhileLoopChallenge - SUM up the digits provided, i.e 1234 = 1+2+3+4 = 10.
Arthur Kroth
17.09.23
*/
public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(1234));
    }
    public static int sumDigits(int number){
        int sum = 0;
        if (number < 0) {
            return -1;
        }
        while (number >= 1){
            sum = sum + (number % 10);
//      or    sum += number % 10;
            number = number / 10;
//      or    number /= 10;

        }
        return sum;
    }
}

//n % 10 to extract the last digit/most right digit
//n = n / 10  to drop the last digit as looping