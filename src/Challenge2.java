/*
Converting Kilobytes to Megabytes
Arthur Kroth
7.9.2023
*/

public class Challenge2 {
    public static void main(String [] args){
        printMegaBytesAndKiloBytes(5000);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = (kiloBytes / 1024);
            int remainderKiloBytes = (kiloBytes % 1024);
            System.out.println(kiloBytes + " KB = "+ megaBytes + " MB and " + remainderKiloBytes +" KB");
        }
    }
}