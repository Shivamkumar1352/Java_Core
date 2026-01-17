package abstractionAssignments;

public class UPI extends Payment{

	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("payment of "+amount+" has been done from UPI");
	}

}
