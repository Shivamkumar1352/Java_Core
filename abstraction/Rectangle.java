package abstraction;

public class Rectangle extends Shape{
	private double length;
	private double bredth;

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBredth() {
		return bredth;
	}

	public void setBredth(double bredth) {
		this.bredth = bredth;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length*bredth;
	}
	
}
