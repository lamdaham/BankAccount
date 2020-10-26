public class BankAccount {
	//initialize
	private double balance;
	private int[] accountID = new int[2];
	private String password;

	//constructors
	public BankAccount(double b, int[] a, String p) {
		balance = b;
		accountID = a;
		password = p;
	}


	//Returns Balance
	public double getBalance() {
		return (balance);
	}


	//Returns AccountID
	public int getAccountID() {
		return (accountID[0]);
	}


	//Deposits into Balance
	public boolean deposit(double amount) {
		if (0 < amount) {
			balance += amount;
			return true;
		} else {
			return false;
		}
	}


	//Withdraws from Balance
	public boolean withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			return true;
		} else {
			return false;
		}
	}


	//Returns Account Info
	public String toString() {
		return String.valueOf(accountID[0])+"\t"+String.valueOf(balance);
	}

}