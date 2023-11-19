public class Main2 {
    public static void main(String[] args) {
        BankAccount arthur = new BankAccount("45", 500.00, "Arthur Kroth", "kroth.sc@gmail.com", "083-431 4871" );

//        BankAccount arthur = new BankAccount();
//        arthur.setAccountBalance(500.00);
//        arthur.setAccountNumber("45");
//        arthur.setCustomerEmail("kroth.sc@gmail.com");
//        arthur.setPhoneNumber("083-431 4871");
//        arthur.setCustomerName("Arthur Kroth");
        arthur.displayInfo();

        System.out.println();
        arthur.withdrawingFunds(700.00);

        System.out.println();
        arthur.depositFunds(250.00);

        System.out.println();
        arthur.withdrawingFunds(700.00);


    }
}
