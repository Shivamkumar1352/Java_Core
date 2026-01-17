package inheritence;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t = new Triangle(21,12);
		t.calculateArea();
		Rectangle r = new Rectangle(21,16);
		r.calculateArea();
		Circle c = new Circle(7);
		c.calculateArea();
		
		t.display();
		r.display();
		c.display();
	}

}
