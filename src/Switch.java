/*
Switch in JAVA
Arthur Kroth
12.09.23
*/
public class Switch {
    public static void main(String[] args) {
        String month = "OCTOBER";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter of the year!");
          int value = 3;
//        if (value == 1){
//            System.out.println("Value was 1");
//        } else if (value == 2){
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Value was not 1 or 2");
//        }
//      DEFAULT SWITCH STATEMENT
//        switch (value){
//            case 1:
//                System.out.println("Value was 1");
//                break;
//            case 2:
//                System.out.println("Value was 2");
//                break;
//            case 3: case 4: case 5:
//                System.out.println("Was a 3, a 4 or a 5");
//                System.out.println("Actually it was a " + value);
//                break;
//            default:
//                System.out.println("Value was not 1, 2, 3, 4, or 5");
//                break;
//        }
//      ENHANCED SWITCH STATEMENT
        switch (value) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was a 3, a 4 or a 5");
                System.out.println("Actually it was a " + value);
            }
            default -> System.out.println("Value was not 1, 2, 3, 4, or 5");
        }
    }

    public static String getQuarter(String month){
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
    }
}
