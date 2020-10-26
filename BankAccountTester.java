public class BankAccountTester {
	public static void main(String[] args) {
		BankAccount a1 = new BankAccount(100.21, 12454234, "password123");
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