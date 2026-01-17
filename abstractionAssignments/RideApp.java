package abstractionAssignments;

public class RideApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ride r = new CarRide();
		r.calculateFare(20);
		r = new BikeRide();
		r.calculateFare(20);
		r = new AutoRide();
		r.calculateFare(20);
	}

}
