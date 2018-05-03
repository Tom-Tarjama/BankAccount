package com.codingdojo.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount a = new BankAccount();
		a.depositMoney(5.00, 10.00);
		BankAccount b = new BankAccount(25.00, 50.00);
		BankAccount.showTotals();
		a.withdrawMoney(20.0, 0.0);
		BankAccount.showTotals();
		System.out.println(a.showBalance());
		b.withdrawMoney(5.0, 10.0);
		System.out.println(b.showBalance());
		BankAccount.showTotals();
		System.out.println(b.getSavingsBalance());
		System.out.println(b.getCheckingBalance());
		System.out.println(b.getAccountNumber());
		System.out.println(a.getAccountNumber());
		BankAccount c = new BankAccount();
		System.out.println(c.getAccountNumber());
	}

}
