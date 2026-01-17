package abstractionAssignments;

public class PaymentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment p = new Credit();
		p.processPayment(5000);
		p = new UPI();
		p.processPayment(4000);
		p = new NetBanking();
		p.processPayment(60000);
	}

}
