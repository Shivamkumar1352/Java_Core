package polymorphismAssignment;

public class Pay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment p = new DebitCard();
		p.pay();
		p=new CreditCard();
		p.pay();
		p= new UPI();
		p.pay();
	}

}
