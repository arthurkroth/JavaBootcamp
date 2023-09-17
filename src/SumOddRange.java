/*
SumOddRange
Arthur Kroth
16.09.23
*/
public class SumOddRange {
    public static void main(String[] args) {
        int test = sumOdd(1,100);
        System.out.println(test);
    }

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        } else if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end) {
        if (end < start || end < 0 || start < 0) {
            return -1;
        }
        int numberSum = 0;

        for (int i = start; i <= end; i++){
            if (isOdd(i)){
                numberSum += i;
            }
        }
        return numberSum;
    }
}


//    Sum Odd
//    Write a method called isOdd with an int parameter and call it number. The method needs to return a boolean.
//        Check that number is > 0, if it is not return false.
//        If number is odd return true, otherwise return false.

//        Write a second method called sumOdd that has 2 int parameters start and end, which represent a range of numbers.
//        The method should use a for loop to sum all odd numbers in that range including the end and return the sum.
//        It should call the method isOdd to check if each number is odd.
//        The parameter end needs to be greater than or equal to start and both start and end parameters have to be greater than 0.
//        If those conditions are not satisfied return -1 from the method to indicate invalid input.