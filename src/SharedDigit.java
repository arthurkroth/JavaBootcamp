public class SharedDigit{
    public static void main(String []args){
        hasSharedDigit(12, 23);
    }
    public static boolean hasSharedDigit(int number1, int number2){
        int firstDigitNum1 = 0;
        int secondDigitNum1 = 0;
        int firstDigitNum2 = 0;
        int secondDigitNum2 = 0;
        if ((number1 <= 10 || number1 >= 100) || (number2 <= 10 || number2 >= 100)){
            return false;
        } 
        secondDigitNum1 = number1 % 10;
        firstDigitNum1 = number1 / 10;
        secondDigitNum2 = number2 % 10;
        firstDigitNum2 = number2 / 10;
        if (firstDigitNum1 == firstDigitNum2 || firstDigitNum1 == secondDigitNum2 || secondDigitNum1 == firstDigitNum2 || secondDigitNum1 == secondDigitNum2){
            return true;
        }
        return false;
    }
}

/**
Shared Digit
Write a method named hasSharedDigit with two parameters of type int. 
Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.


EXAMPLE INPUT/OUTPUT:
hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers

NOTE: The method hasSharedDigit​ should be defined as public static like we have been doing so far in the course.
NOTE: Do not add a main method to the solution code.
 */