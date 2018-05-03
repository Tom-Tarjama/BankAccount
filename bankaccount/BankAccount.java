package com.codingdojo.bankaccount;

import java.util.Random; 

public class BankAccount {
	private String accountNumber;
	private Double checkingBalance;
	private Double savingsBalance;
	private static Integer numberOfAccounts = 0;
	private static Double totalMoney =0.0;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public BankAccount() {
		this.checkingBalance = 0.0;
		this.savingsBalance = 0.0;
		accountNumber = generateAcctNumber();
		numberOfAccounts +=1;
	}
	
	public BankAccount(Double checkingParam, Double savingsParam) {
		accountNumber = generateAcctNumber();
		this.checkingBalance = checkingParam;
		this.savingsBalance = savingsParam;
		numberOfAccounts +=1;
		totalMoney+=(savingsParam+checkingParam);
	}
	
	
	public Double getCheckingBalance() {
		return checkingBalance;
	}
	
	public Double getSavingsBalance() {
		return savingsBalance;
	}
	
	public void depositMoney(Double checkingDeposit, Double savingsDeposit) {
		this.checkingBalance += checkingDeposit;
		this.savingsBalance += savingsDeposit;
		totalMoney+=(checkingDeposit+savingsDeposit);
		System.out.println("Deposit complete");
		System.out.println("Current funds: "+this.showBalance());
	}
	
	public void withdrawMoney(Double checkingWithdrawal, Double savingsWithdrawal) {
		if(this.checkingBalance < checkingWithdrawal || this.savingsBalance < savingsWithdrawal) {
			System.out.println("Insufficient funds");
		}
		else {
			this.checkingBalance -= checkingWithdrawal;
			this.savingsBalance -= savingsWithdrawal;
			System.out.println("Withdrawal complete");
			System.out.println("Remaining funds: "+this.showBalance());
			totalMoney -=(checkingWithdrawal+savingsWithdrawal);
		}
	}
	
	public Double showBalance() {
		return this.checkingBalance+this.savingsBalance;
	}
	
	public static void showTotals() {
		System.out.println("Total number of accounts: "+numberOfAccounts);
		System.out.println("Total funds across all accounts: "+totalMoney);
	}
	
	private String generateAcctNumber() {
		String output = "";
		Random rand = new Random();
		for(int i = 0; i < 10; i++) {
			int x = rand.nextInt(10);
			String y = String.valueOf(x);
			output+=y;
		}
		return output;
	}
	
}
