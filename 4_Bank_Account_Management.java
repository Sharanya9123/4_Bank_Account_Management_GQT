package core_java_projects;

import java.util.Scanner;

// Class to manage a single bank account
class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    // Setter methods
    public void setAccountHolder(String name) {
        this.accountHolder = name;
    }

    public void setAccountNumber(int accNo) {
        this.accountNumber = accNo;
    }

    public void setInitialBalance(double balance) {
        this.balance = balance;
    }

    // Deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(" ₹" + amount + " deposited successfully.");
        } else {
            System.out.println(" Invalid deposit amount.");
        }
    }

    // Withdraw
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(" ₹" + amount + " withdrawn successfully.");
        } else {
            System.out.println(" Insufficient balance or invalid amount.");
        }
    }

    // Check balance
    public void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Available Balance: ₹" + balance);
    }
}

// Main class
public class Bank_Account_Management {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();
        int choice;

        // Friendly assistant-style greeting
        System.out.println("  Hello! Welcome to your Personal Banking Assistant.");
        System.out.println(" __________________________________________________");
        System.out.println("  Let's get you set up with your bank account!");
        System.out.println(" __________________________________________________");
 
        // Initial account setup
        System.out.print("Enter your Name: ");
        String name = sc.nextLine();

        System.out.print("Enter your Account Number: ");
        int accNo = sc.nextInt();

        System.out.print("Enter Opening Balance: ₹");
        double balance = sc.nextDouble();

        account.setAccountHolder(name);
        account.setAccountNumber(accNo);
        account.setInitialBalance(balance);

        // Menu loop
        do {
            System.out.println("\n Please choose an option:");
            System.out.println("1. Deposit Amount");
            System.out.println("2. Withdraw Amount");
            System.out.println("3. View Account Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ₹");
                    double dep = sc.nextDouble();
                    account.deposit(dep);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    double wit = sc.nextDouble();
                    account.withdraw(wit);
                    break;

                case 3:
                    System.out.println("\n Your Account Summary:");
                    System.out.println("------------------------");
                    account.displayDetails();
                    break;

                case 4:
                    System.out.println("\n"+ " Thank you, " + name + ", for using our banking system!");
                    System.out.println("Have a secure and prosperous day ahead! ");
                    break;

                default:
                    System.out.println(" Invalid option. Please try again.");
            }

        } while (choice != 4);
    }
}
