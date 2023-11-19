public class BankAccount {
    private String accountNumber;
    private  double accountBalance;
    private String customerName;
    private String customerEmail;
    private String phoneNumber;
    private double depositValue;
    private double withdrawValue;

    public BankAccount(){
        System.out.println("Empty constructor called!");
    }

    public BankAccount(String accountNumber, double accountBalance, String customerName, String customerEmail, String phoneNumber){
        System.out.println("Account constructor with parameters called!");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;
    }
    //Getters
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getAccountBalance() {
        return accountBalance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getCustomerEmail() {
        return customerEmail;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public double getDepositValue() {
        return depositValue;
    }
    public double getWithdrawValue() {
        return withdrawValue;
    }
    //SETTERS

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setDepositValue(double depositValue) {
        this.depositValue = depositValue;
    }
    public void setWithdrawValue(double withdrawValue) {
        this.withdrawValue = withdrawValue;
    }

    //METHODS
    public void depositFunds(double depositValue){
        this.depositValue = depositValue;
        accountBalance = accountBalance + depositValue;
        System.out.println(depositValue + " deposited in your bank account");
        System.out.println("Your new balance is: " + accountBalance);
    }

    public void withdrawingFunds(double withdrawValue){
        this.withdrawValue = withdrawValue;
        if (withdrawValue > accountBalance || accountBalance < 0.00){
            System.out.println("Withdraw not permitted as you dont have sufficient funds! Account Balance: " + accountBalance);
        } else {
            accountBalance = accountBalance - withdrawValue;
            System.out.println(withdrawValue + " withdrew from your bank account");
            System.out.println("Your new balance is: " + accountBalance);
        }
    }

    public void displayInfo(){
        System.out.println("Hello " + customerName + "\n" +
                "Phone number: " + phoneNumber + "\n" +
                "Account number: " + accountNumber + "\n" +
                "Balance: " + accountBalance + "\n" +
                "Email Address: " + customerEmail);
    }
}
