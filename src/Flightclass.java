public class Flightclass {

	private static Flightclass flightInstance = new Flightclass();
	int dateofflight;
	int departuretime;
	int arrivaltime;
	
	public static Flightclass getFlightInstance() {
		return flightInstance;
	}
	public static void setFlightInstance(Flightclass flightInstance) {
		Flightclass.flightInstance = flightInstance;
	}
	int flightduration;
	public int getFlightduration() {
		return flightduration;
	}
	public void setFlightduration(int flightduration) {
		this.flightduration = flightduration;
	}
	double distance;
	int delay;
	int departdate;
	int returndate;
	String departureairport;
	String departurecity;
	String arrivalairport;
	String arrivalcity;
	String flightnumber;
	String airline;
	String[] returnfligth;
	String[] departureflight;
	
	
	
	
	
	
	
	
	
	
	
}
