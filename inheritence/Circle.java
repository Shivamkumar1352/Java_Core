package inheritence;

public class Circle extends Shape{
	double radius;
	Circle(){
		
	}
	Circle(double radius){
		this.radius = radius;
	}
	public void calculateArea(){
		area = 3.14*radius*radius;
	}
	public void display() {
		System.out.println("The radius of circle is: "+radius);
		System.out.println("The area of circle is: "+area);
	}
}
