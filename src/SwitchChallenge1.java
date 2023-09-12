/*
Switch Challenge 1
Arthur Kroth
12.09.23
*/
public class SwitchChallenge1 {
    public static void main(String[] args) {
        char natoLetter = 'B';
        switch (natoLetter) {
            case 'A' :
                System.out.println(natoLetter + " = Able");
                break;
            case 'B':
                System.out.println(natoLetter + " = Baker");
                break;
            case 'C':
                System.out.println(natoLetter + " = Charlie");
                break;
            case 'D':
                System.out.println(natoLetter + " = Dog");
                break;
            case 'E':
                System.out.println(natoLetter + " = Easy");
                break;
            default :
                System.out.println("Your letter is not found on our alphabet!");
                break;
        }
    }
}
