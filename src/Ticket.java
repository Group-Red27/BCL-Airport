
public class Ticket {
	long ticketNumber;
	double foodCost;
	String firstName;
	String lastName;
	Flightclass departureFlight;
	Flightclass returnFlight;
	String departSeat;
	String returnSeat;
	int noOfBags;
	

	public Ticket(String fname, String lname, Flightclass departureF, Flightclass returnF, String dSeat, String rSeat) {
		this.ticketNumber = generateTicketNum();
		this.firstName = fname;
		this.lastName = lname;
		this.departureFlight = departureF;
		this.returnFlight = returnF;
		this.departSeat = dSeat;
		this.returnSeat = rSeat;
		// constructor
	}
	
	private long generateTicketNum() {
		// TODO Auto-generated method stub
		return 0;
	}

	public long getTicketNumber() {
		return this.ticketNumber;
	}

	public double getFoodCost() {
		return this.foodCost;
	}

	public void setFoodCost(double cost) {
		this.foodCost = cost;
		
	}

	public String getPassengerName() {
		// TODO Auto-generated method stub
		return firstName+" "+lastName;
	}
	public int getNoOfBags() {
		return noOfBags;
	}

	public void setNoOfBags(int noOfBags) {
		this.noOfBags = noOfBags;
	}
	
	public void addTicketToData() {
		Data data = Data.getInstance();
		data.addTicketToData(this);
		
	}
	
}
