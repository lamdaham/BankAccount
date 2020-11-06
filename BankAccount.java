public class BankAccount {
	//initialize
	private double balance;
	private int accountID;
	private String password;

	//constructors
	public BankAccount(int a, String p) {
		balance = 0;
		this.accountID = a;
		this.password = p;
	}


	private boolean authenticate(String password) {
		return (password.equals(this.password));
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


	public boolean transferTo(BankAccount other, double amount, String password) {
		if (password.equals(this.password) && withdraw(amount)) {
			other.deposit(amount);
			return true;
			//System.out.println("Success. Transfered $" + amount + " to "+ getAccountID());
		}
		return false;
	}


	//Returns Account Info
	public String toString() {
		return String.valueOf(accountID)+"\t"+String.valueOf(balance);
	}

}