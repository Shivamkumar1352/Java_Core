package polymorphismAssignment;

public class Notify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Notifications n = new Email();
		n.send();
		n = new Sms();
		n.send();
		n = new Push();
		n.send();
	}

}
