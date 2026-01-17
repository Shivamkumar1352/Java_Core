package abstractionAssignments;

public abstract class Payment {
	public abstract void processPayment(double amount);
	public void printReciept() {
		System.out.print("Your reciept.");
	}
}
