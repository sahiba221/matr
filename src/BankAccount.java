public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName =ownerName;
        this.balance =balance;
    }

    getter public String getAccountNumber() {
        return accountNumber;
    }
    setter public void getAccountNumbar(String accountNumber){
        this.accountNumber =accountNumber;
    }

    getter public String getOwnerName() {
        return ownerName;
    }
    setter public void getOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    getter readonly public double getBalance() {
        return balance;
    }
    void deposit(double amount){
        validation 
    }
}
