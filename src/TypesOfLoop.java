/*
Types of loop
Arthur Kroth
17.09.23
*/
public class TypesOfLoop {
    public static void main(String[] args) {

        //FOR LOOP
        for (int i = 1; i <= 5; i++){
            System.out.println(i);
        }

        //WHILE LOOP
        int h = 1;
        while (h <= 5){
            System.out.println(h);
            h++;
        }

        //DO WHILE LOOP
        int j = 1;
        boolean isReady = false;
        do {
            if (j>5){
                break;
            }
            System.out.println(j);
            j++;
            isReady = (j > 0);
        } while (isReady);

        //WHILE LOOP USING CONTINUE STATEMENT
        int x =0;
        while (x < 50){
            x += 5;
            //THE CONTINUE IS SKIPPING EVERY NUMBER EVENLY DIVISIBLE BY 25 WITHIN THE LOOP
            if (x % 25 == 0){
                continue;
            }
            System.out.print(x + "_");
        }
    }
}
