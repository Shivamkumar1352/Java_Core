package playingWithObject;

class Box{
	
}

class Bottle{
	
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b1 = new Box();
		printRef(b1);
		Box b2 = new Box();
		printRef(b2);
		Bottle a1 = new Bottle();
		printRef(a1);
		
	}
	public static void printRef(Box b) {
		System.out.println(b);
	}
	public static void printRef(Bottle b) {
		System.out.println(b);
	}
}
