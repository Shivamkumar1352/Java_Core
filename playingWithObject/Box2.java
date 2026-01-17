package playingWithObject;

public class Box2 {
	double length;
	
	Box2(){
		
	}
	
	Box2(double length){
		this.length = length;
	}
	
	//helper method //factory method
	public static Box2 createBox() {
		return new Box2();
	}
	public static Box2 createBox(double length) {
		return new Box2(length);
	}
}
