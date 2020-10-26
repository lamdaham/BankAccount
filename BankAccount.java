public class BankAccount {
	//initialize
	private double balance;
	private int accountID;
	private String password;

	//constructors
	public BankAccount(int a, String p) {
		balance = 0;
		accountID = a;
		password = p;
	}


	//Returns Balance
	public double getBalance() {
		return (balance);
	}


	//Returns AccountID
	public int getAccountID() {
		return (accountID);
	}

	public String getPass() {
		return (password);
	}

	//Reset Password
	public void setPassword(String newPass) {
		password = newPass;
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
		if (amount <= balance && amount>=0) {
			balance -= amount;
			return true;
		} else {
			return false;
		}
	}


	//Returns Account Info
	public String toString() {
		return String.valueOf(accountID)+"\t"+String.valueOf(balance);
	}

}