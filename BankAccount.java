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

}