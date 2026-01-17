package method;

public class Area {
	
	public static void areaOfCircle() {
		int r = 21;
		double area = 3.14*r*r;
		System.out.println("Area of circle is: "+area+" sq. unit");
		
	}
	
	public static void areaOfTriangle() {
		int b = 10;
		int h = 20;
		double area = (b*h)/2;
		System.out.println("Area of triangle is: "+area+" sq. unit");
	}
	
	public static void areaOfSquare() {
		int s = 10;
		int area = s*s;
		System.out.println("Area of square is: "+area+ " sq. unit");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		areaOfCircle();
		areaOfTriangle();
		areaOfSquare();
	}

}
