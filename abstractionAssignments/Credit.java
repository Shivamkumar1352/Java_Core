package abstractionAssignments;

public class Credit extends Payment{

	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Payment of "+amount+" has been done from credit card.");
	}

}
