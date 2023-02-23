package Assignment3;
/*
    BANKING CLASS DRIVER
    I will be taking the request from the Account holder using the Scanner object
    I will also implement a while loop to keep the program running until terminated instead of 2 Objects
 */
import java.util.Scanner;

public class Main {
    static double balance;
    public static boolean keep_running = true;

    public static void main(String[] args) {
        demonstrate(new BankAccount("10981589", 3000.56));  // creating and passing object as parameter in one line
    }

    public static void demonstrate(BankAccount account) {
        Scanner requests = new Scanner(System.in);
        System.out.println("WelcomeTo Shedeur Banking\nAccount Number: " + account.getAccount_number());
        System.out.println("Current balance: GHc" + account.getBalance());
        System.out.println("-----------------------------------------");
        System.out.println();
        System.out.println("What would You like to do today?");

        while (keep_running) {
            System.out.println("1 - to Deposit into Account");
            System.out.println("2 - to Withdraw from Account");
            System.out.println("3 - to Query Your Account Balance and");
            System.out.println("0 - to Exit");
            System.out.print("Your Choice: ");
            int response = requests.nextInt();
            switch (response) {
                case 1 -> {
                    System.out.print("Enter Amount to Deposit: ");
                    int amount = requests.nextInt();
                    if (amount > 0) {
                        balance = account.deposit(amount);
                        System.out.println("Cash Deposited Successfully");
                    } else {
                        System.out.println("Sorry, Enter a valid amount");
                    }
                }
                case 2 -> {
                    System.out.print("Enter Amount to Withdraw: ");
                    int withdrawal_amount = requests.nextInt();
                    if (withdrawal_amount > 0) {
                        balance = account.withdraw(withdrawal_amount);        // method returns the balance either way
                    } else {
                        System.out.println("Sorry, Enter a valid amount");
                    }
                }
                case 3 -> System.out.println("Your Account Balance is: GHc" + account.getBalance());
                case 0 -> {
                    System.out.println();
                    System.out.println("-----------------------------------------");
                    System.out.println("Thank You For Banking With Us");
                    System.out.println("-----------------------------------------");
                    keep_running = false;
                }
                default -> System.out.println("Sorry, Invalid Choice");
            }
            if(keep_running) {
                System.out.println();
                System.out.println("-----------------------------------------");
                System.out.println("Current Balance : GHc" + account.getBalance());
                System.out.println("-----------------------------------------");
            }
        }
    }
}
