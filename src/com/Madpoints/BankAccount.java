package com.Madpoints;

public class BankAccount {
    private String acctNumber;
    private double balance;
    private String acctName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this("1234", 5.00, "N/A", "N/A", "N/A");
    }

    public BankAccount(String acctNumber, double balance, String acctName, String email, String phoneNumber) {
        this.acctNumber = acctNumber;
        this.balance = balance;
        this. acctName = acctName;
        this. email = email;
        this.phoneNumber = phoneNumber;
    }

    // Get and Set account number
    public void setAcctNumber(String acctNumber) {
        this.acctNumber = acctNumber;
    }

    public String getAcctNumber() {
        return this.acctNumber;
    }

    // Get and Set balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getBalance() {
        return String.format("$%.2f", this.balance);
    }

    // Get and Set account name
    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }

    public String getAcctName() {
        return this.acctName;
    }

    // Get and Set email
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    // Get and Set phone number
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Cannot deposit funds.");
        } else {
            this.balance += amount;
            System.out.println("Deposited: " + amount + " New balance: " + this.balance);
        }
    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Transaction not completed. Insufficient funds.");
        } else {
            this.balance -= amount;
            System.out.println("Withdrew: " + amount + " New balance: " + this.balance);
        }
    }
}
