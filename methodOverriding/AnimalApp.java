package methodOverriding;

public class AnimalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1 = new Dog();
		a1.walk();
		a1.sound();
		
		Animal a2 = new Cat();
		a2.walk();
		a2.sound();
	}

}
