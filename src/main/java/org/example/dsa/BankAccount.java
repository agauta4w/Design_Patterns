package org.example.dsa;

public class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        if(balance >= 0){
            this.balance = balance;
        }
        else{
            this.balance = 0.00;
            System.out.println("Insufficient funds!");
        }
    }

    void deposit (double amount){
        balance += amount;
    }

    void withdraw (double amount){
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    void displayDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.printf("Balance : %.2f\n", balance);

    }

    public static void main(String[] args) {
        String accountNumber = "9662375274869";
        double balance = 8655;
        double addBalance = 5854;
        double withdrawBalance = 9437;

        // Create BankAccount object
        BankAccount account = new BankAccount(accountNumber, balance);

        // Deposit and withdraw operations
        account.deposit(addBalance);
        account.withdraw(withdrawBalance);

        // Display final account details
        account.displayDetails();
    }
}
