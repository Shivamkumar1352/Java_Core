package objectProgram;

public class Box {
	
	double length;
	double bredth;
	
	//constructor
	Box(double length, double bredth){
		this.length = length;
		this.bredth = bredth;
	}
	
	//non-static method
	public double getArea() {
		return length*bredth;
	}

}
