/*
Converting KM/h to Mi/h
Arthur Kroth
7.9.2023
*/
public class Challenge1 {
    public static void main(String[] args) {
        printConversion(-25.42);
    }
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0){
            return -1;
        } else {
            return Math.round(kilometersPerHour / 1.609);
        }
    }
    public static void printConversion(double kilometersPerHour){
        double milesPerHour = toMilesPerHour(kilometersPerHour);
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }
}
