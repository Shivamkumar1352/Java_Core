package encapsulation;

public class EncapsulationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.Inner.display();
		Outer.Inner obj = new Outer.Inner();
		obj.test();
		Outer2 ob = new Outer2();
		ob.test();
		
	}

}
