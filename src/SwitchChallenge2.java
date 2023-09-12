/*
Switch Challenge 2
Arthur Kroth
12.09.23
*/
public class SwitchChallenge2 {
    public static void main(String[] args) {
    printDayOfWeek(0);
    printDayOfWeek(1);
    printDayOfWeek(2);
    printDayOfWeek(3);
    printDayOfWeek(4);
    printDayOfWeek(5);
    printDayOfWeek(6);
    printDayOfWeek(7);
    printWeekDay(2);
    }
    public static void printDayOfWeek(int day){
        String dayOfWeek = switch (day) {
                case 0 -> "Sunday";
                case 1 -> "Monday";
                case 2 -> "Tuesday";
                case 3 -> "Wednesday";
                case 4 -> "Thursday";
                case 5 -> "Friday";
                case 6 -> "Saturday";
                default -> "Invalid Day";
        };
        System.out.println(day + " stands for " + dayOfWeek);
    }
    public static void printWeekDay(int day){
        if (day == 0){
            System.out.println(day + " stands for Sunday");
        } else if (day == 1) {
            System.out.println(day + " stands for Monday");
        } else if (day == 2) {
            System.out.println(day + " stands for Tuesday");
        } else if (day == 3) {
            System.out.println(day + " stands for Wednesday");
        } else if (day == 4) {
            System.out.println(day + " stands for Thursday");
        } else if (day == 5) {
            System.out.println(day + " stands for Friday");
        } else if (day == 6) {
            System.out.println(day + " stands for Saturday");
        } else {
            System.out.println(day + " = Invalid Day");
        }
    }
}
