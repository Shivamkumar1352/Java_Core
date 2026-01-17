package assignment4;

public class BankAccount {
	private long accNo;
	private double balance;
	
	public void deposite(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getAccInfo() {
		return accNo;
	}
}
