/*
DecimalComparator - 3 decimal places.
Arthur Kroth
9.9.2023
*/
public class Challenge5 {
    public static void main(String []args){
        //TESTING
        boolean test = areEqualByThreeDecimalPlaces(3.1755, 3.1756);
        System.out.println(test);
    }
    public static boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum){
        int firstCheck = (int)(firstNum * 1000);
        int secondCheck = (int)(secondNum * 1000);
        if (firstCheck - secondCheck == 0) {
            return true;
        } else {
            return false;
        }
    }
}

//DecimalComparator
//Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
//The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.