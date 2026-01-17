package encapsulation;

public class Outer2 {
	 private class Inner2{
		static void display() {
			System.out.println("Static method in not static class");
		}
	}
	 void test() {
			Inner2.display();
		}
}
