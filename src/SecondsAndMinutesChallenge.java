/*
Hours and minutes from seconds.
Arthur Kroth
11.9.23
*/
public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(65,145));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Not a value number of seconds: " + seconds;
        }
        return getDurationString(seconds /60, seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || (seconds < 0 || seconds > 59)) {
            return "Not a valid amount of seconds("+seconds+") and minutes(" + minutes + ")";
        }
        int hours = minutes / 60;

        int remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }
}
