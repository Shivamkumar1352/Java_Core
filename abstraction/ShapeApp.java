package abstraction;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
		r.setLength(54);
		r.setBredth(24);
		r.setColor("Blue");
		System.out.println("Rectangle area: "+r.getArea()+" ,Color: "+r.getColor());
		
		Circle c = new Circle();
		c.setRadius(14);
		c.setColor("Red");
		System.out.println("Circle area: "+c.getArea()+" ,Color: "+c.getColor());
	}

}
