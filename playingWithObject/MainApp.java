package playingWithObject;

public class MainApp {

	public static void main(String[] args) {
		Animal a1 = new Animal("dog");
		
		Animal a2 = a1;
		System.out.println(a2.name);
		
		a2.name = "cat";
		System.out.println(a1.name);
		System.out.println(a2.name);
	}

}
