package polymorphismAssignment;

public class VehicleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new Car();
		v.calculateRent();
		v = new Bike();
		v.calculateRent();
		v = new Truck();
		v.calculateRent();
	}

}
