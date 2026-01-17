package polymorphismAssignment;

public class CreditCard extends Payment{

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println("Payment done through Credit card");
	}

}
