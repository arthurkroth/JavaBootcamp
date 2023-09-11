/*
Feet/Inches to Centimeters.
Arthur Kroth
10.9.23
*/
public class Challenge9 {
    public static void main(String[] args) {
        System.out.println("5ft,8in = "+ (int)convertToCentimeters(5,8) + "cm");
        System.out.println("68in = " + convertToCentimeters(68) + "cm");
    }
    public static double convertToCentimeters(int heightInches){
        return (heightInches * 2.54);
    }
    public static double convertToCentimeters(int footValue, int inchValue){

        //return convertToCentimeters((footValue * 12) + inchValue);
        //OR

        int feetToInches = footValue * 12;
        int totalInches = feetToInches + inchValue;
        double result = convertToCentimeters(totalInches);
        return result;
    }
}

//1 inch = 2.54cm
//1 foot = 12 inches