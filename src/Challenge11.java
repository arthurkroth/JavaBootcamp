/*
Minutes To Years and Days Calculator
Arthur Kroth
11.9.23
*/
public class Challenge11 {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }
    public static void printYearsAndDays(long minutes){
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long hours = minutes / 60;
            long days = hours / 24;
            int years = (int) days / 365;
            long remainderDays = days % 365;
            System.out.println(minutes + " min = " + years + " y and " + remainderDays  + " d");
        }
    }


}


/*
Minutes To Years and Days Calculator
Write a method printYearsAndDays with parameter of type long named minutes.

The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.

If the parameter is less than 0, print text "Invalid Value".

Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".

XX represents the original value minutes.
YY represents the calculated years.
ZZ represents the calculated days.

TIPS:
Be extra careful about spaces in the printed message.
Use the remainder operator
1 hour = 60 minutes
1 day = 24 hours
1 year = 365 days
*/