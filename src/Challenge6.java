/*
Equal Sum Checker
Arthur Kroth
10.9.2023
*/
public class Challenge6 {
    public static void main(String[] args) {
        boolean result = hasEqualSum(1,2,4);
        System.out.println(result);

    }
    public static boolean hasEqualSum(int firstNumber, int secondNumber, int thirdNumber){
        if ((firstNumber + secondNumber) == thirdNumber){
            return true;
        } else {
            return false;
        }
    }

}

//    Equal Sum Checker
//        Write a method hasEqualSum with 3 parameters of type int.
//
//        The method should return boolean and it needs to return true if the sum of the first and second parameter is equal to the third parameter.
//        Otherwise, return false.

