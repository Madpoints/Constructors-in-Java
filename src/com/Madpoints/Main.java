package com.Madpoints;

public class Main {

    public static void main(String[] args) {
    	BankAccount account = new BankAccount("2143658709", 27_653,"John", "email@thisemail.com", "555-555-5555");
		BankAccount emptyAcct = new BankAccount();

		System.out.println(account.getAcctName());
		System.out.println(account.getAcctNumber());
		System.out.println(account.getBalance());
		System.out.println(account.getEmail());
		System.out.println(account.getPhoneNumber());

		account.deposit(1);
		account.withdraw(20000);

		System.out.println("------------------------------------");

		System.out.println(emptyAcct.getAcctName());
		System.out.println(emptyAcct.getBalance());

    }
}