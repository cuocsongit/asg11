package oop.asg11;

import java.io.File;

public class TransactionRecord {
	
	private int accountNumber;
	private double amountTransaction;
	
	public TransactionRecord(int account, double amount) {
		accountNumber = account;
		amountTransaction = amount;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(int setAccountNumber) {
		accountNumber = setAccountNumber;
	}
	
	public double getAmountTransaction() {
		return amountTransaction;
	}
	
	public void setAmountTransaction(int transaction) {
		amountTransaction = transaction;
	}
	
	public String toString() {
		return String.format("%d %.2f", accountNumber, amountTransaction);
	}
}
