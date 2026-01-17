package abstractionAssignments;

public class BikeRide extends Ride{

	@Override
	public void calculateFare(int distance) {
		// TODO Auto-generated method stub
		System.out.println("your total fare is: "+distance*250);
	}

}
