/*
Area Calculator.
Arthur Kroth
11.9.23
*/
public class Challenge10 {
    public static void main(String[] args) {
        double test1 = area(-5.0);
        System.out.println(test1);
        double test2 = area(5.0,4.0);
        System.out.println(test2);
    }
    public static double area(double radius){
        if (radius < 0){
            return -1.0;
        }
        return radius * radius * Math.PI;
    }
    public static double area(double x, double y){
        if (x < 0 || y< 0){
            return -1.0;
        }
        return x * y;
    }
}


//    Area Calculator
//    Write a method named area with one double parameter named radius.
//
//        The method needs to return a double value that represents the area of a circle.
//
//        If the parameter radius is negative then return -1.0 to represent an invalid value.
//
//        Write another overloaded method with 2 parameters x and y (both doubles), where x and y represent the sides of a rectangle.
//
//        The method needs to return an area of a rectangle.
//
//        If either or both parameters is/are a negative return -1.0 to indicate an invalid value.
//
//        For formulas and PI value please check the tips below.
//
//        TIP: The formula for calculating the area of a rectangle is x * y.
//
//        TIP: The formula for calculating a circle area is radius * radius * PI.
//
//        TIP: For PI use a constant from Math class e.g. Math.PI