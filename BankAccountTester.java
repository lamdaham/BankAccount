public class BankAccountTester {
	public static void main(String[] args) {
		int[] acc = new int[] {111, 2};
		BankAccount a1 = new BankAccount(100.21, acc, "password123");
		System.out.println(a1.getBalance());
		System.out.println(a1.getAccountID());
		System.out.println(a1.deposit(100));
		System.out.println(a1.getBalance());
		System.out.println(a1.deposit(-200));
		System.out.println(a1.getBalance());
		System.out.println(a1.withdraw(100));
		System.out.println(a1.getBalance());
		System.out.println(a1.withdraw(200));
		System.out.println(a1.getBalance());
		System.out.println(a1.toString());
	}
}