package Assignment3;
/*
BANK ACCOUNT CLASS
 */
public class BankAccount {

    private final String account_number;
    private double balance;

    // we are taking the liberty to add a constructor to make it easier
    public BankAccount(String account_number, double balance) {
        this.account_number = account_number;
        this.balance = balance;
    }

    public double deposit(double amount) {
        return this.balance = this.balance + amount;
    }

    public double withdraw(double amount) {
        if(amount > this.balance){
            System.out.println("Insufficient Balance");
            return this.balance;
        }
        else {
            System.out.print("GHc" + amount + " Withdrawn Successfully");
            return this.balance = this.balance - amount;
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public String getAccount_number() {
        return account_number;
    }

}