/*
Teen Number Checker
Arthur Kroth
10.9.23
*/
public class Challenge7 {
    public static void main(String[] args) {
        boolean test = hasTeen(9,99,19);
        System.out.println(test);
    }
    public static boolean hasTeen(int age1, int age2, int age3){
        if ((age1 >= 13 && age1 <= 19) || (age2 >= 13 && age2 <= 19) || (age3 >= 13 && age3 <= 19)){
            return true;
        } else {
            return false;
        }
    }
    public static boolean isTeen(int age){
        if (age >=13 && age <= 19) {
            return true;
        } else {
            return false;
        }
    }
}



//    Teen Number Checker
//        We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
//
//        Write a method named hasTeen with 3 parameters of type int.
//
//        The method should return boolean and it needs to return true if one of the parameters is in range 13(inclusive) - 19 (inclusive).
//        Otherwise return false.


//    Write another method named isTeen with 1 parameter of type int.
//
//        The method should return boolean and it needs to return true if the parameter is in range 13(inclusive) - 19 (inclusive).
//        Otherwise return false.