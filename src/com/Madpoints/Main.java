package com.Madpoints;

public class Main {

    public static void main(String[] args) {

    	VipCustomer vip1 = new VipCustomer("James", "james@email.com", 1300.00);
		VipCustomer vip2 = new VipCustomer("Rachel", "rachel@email.com");
		VipCustomer vip3 = new VipCustomer();

		System.out.println(vip1.getName());
		System.out.println(vip1.getEmail());
		System.out.println(String.format("%.2f\n", vip1.getCreditLimit()));

		System.out.println(vip2.getName());
		System.out.println(vip2.getEmail());
		System.out.println(String.format("%.2f\n", vip2.getCreditLimit()));

		System.out.println(vip3.getName());
		System.out.println(vip3.getEmail());
		System.out.println(String.format("%.2f", vip3.getCreditLimit()));


//    	BankAccount account = new BankAccount("2143658709", 27_653,"John", "email@thisemail.com", "555-555-5555");
//		BankAccount emptyAcct = new BankAccount();
//
//		System.out.println(account.getAcctName());
//		System.out.println(account.getAcctNumber());
//		System.out.println(account.getBalance());
//		System.out.println(account.getEmail());
//		System.out.println(account.getPhoneNumber());
//
//		account.deposit(1);
//		account.withdraw(20000);
//
//		System.out.println("------------------------------------");
//
//		System.out.println(emptyAcct.getAcctName());
//		System.out.println(emptyAcct.getBalance());
//
//		System.out.println("------------------------------------");
//
//		BankAccount anotherAcct = new BankAccount("Sally", "sally@email.com", "54321");
//
//		System.out.println(anotherAcct.getAcctNumber() + " name " + anotherAcct.getAcctName());
    }
}
