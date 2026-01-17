package inheritence;

public class Rectangle extends Shape{
	double length;
	double bredth;
	Rectangle(){
		
	}
	Rectangle(double length, double bredth){
		this.length = length;
		this.bredth = bredth;
	}
	public void calculateArea() {
		area = length*bredth;
	}
	void display() {
		System.out.println("The length of rectangle is: "+length);
		System.out.println("The bredth of rectangle is: "+bredth);
		System.out.println("The area of Rectangle is: "+area);
	}
}
