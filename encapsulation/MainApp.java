package encapsulation;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product();
		System.out.println(p1.getPrice());
		p1.setPrice(7);
		System.out.println(p1.getPrice());
	}

}
