package abstractionAssignments;

public class NetBanking extends Payment{

	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Payment of "+amount+" has been done from netbanking.");
	}

}
