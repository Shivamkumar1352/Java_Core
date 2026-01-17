package assignment4;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b = new BankAccount();
		b.deposite(4000);
		System.out.println(b.getBalance());
		b.withdraw(800);
		System.out.println(b.getBalance());
	}

}
