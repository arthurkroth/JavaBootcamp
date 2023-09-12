/*
Equality Printer
Arthur Kroth
11.9.23
*/
public class Challenge13 {
    public static void main(String[] args) {
        boolean test1 = isCatPlaying(false, 25);
        System.out.println(test1);
    }
    public static boolean isCatPlaying(boolean summer, int temperature){
        if (!summer && temperature >= 25 && temperature <= 35) {
            return true;
        } else if (summer && temperature >= 25 && temperature <= 45){
            return true;
        } else {
            return false;
        }
    }

}
/*
Playing Cat
The cats spend most of the day playing. In particular, they play if the temperature is between 25 and 35 (inclusive). Unless it is summer,
then the upper limit is 45 (inclusive) instead of 35.

Write a method isCatPlaying that has 2 parameters. Method needs to return true if the cat is playing, otherwise return false

1st parameter should be of type boolean and be named summer it represents if it is summer.
2nd parameter represents the temperature and is of type int with the name temperature.
*/