public class Main {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = 100;


        calculateScore(gameOver,score, levelCompleted, bonus);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        calculateScore(true, 10000, 8, 200);

        int age = calculateScore2(1994);
        System.out.println("You have " + age + " years old.");
    }
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }
    public static int calculateScore2(int dateOfBirth){
        return (2023 - dateOfBirth);

    }
}
