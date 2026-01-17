package inheritence;

public class Triangle extends Shape{
	double base;
	double height;
	Triangle(){
		
	}
	Triangle(double base, double height){
		this.base = base;
		this.height = height; 
	}
	public void calculateArea() {
		area = (base*height)/2;
	}
	void display() {
		System.out.println("The base of triangle is: "+base);
		System.out.println("The height of triangle is: "+height);
		System.out.println("The area of triangle is: "+area);
	}
}
