public class BankAccount {
	private double balance;
	private int[] accountID = new int[2];
	private String password;

	public BankAccount(double b, int[] a, String p) {
		balance = b;
		accountID = a;
		password = p;
	}

	public double getBalance() {
		return (balance);
	}

	public int getAccountID() {
		return (accountID[0]);
	}

	public boolean deposit(double amount) {
		if (0 < amount) {
			balance += amount;
			return true;
		} else {
			return false;
		}
	}

	public boolean withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		return String.valueOf(accountID[0])+"\t"+String.valueOf(balance);
	}

}