
public class Ticket {
	long ticketNumber;
	double foodCost;
	String firstName;
	String lastName;
	String departureFlightNumber;
	String returnFlightNumber;
	String departSeat;
	String returnSeat;
	int noOfBags;
	

	public Ticket() {
		
	}
	
//	public Ticket(String fname, String lname, String departureF, String returnF, String dSeat, String rSeat) {
//		this.ticketNumber = generateTicketNum();
//		this.firstName = fname;
//		this.lastName = lname;
//		this.departureFlightNumber = departureF;
//		this.returnFlightNumber = returnF;
//		this.departSeat = dSeat;
//		this.returnSeat = rSeat;
//		// constructor
//	}
	
	private long generateTicketNum() {
		// TODO Auto-generated method stub
		return 0;
	}

	public long getTicketNumber() {
		return this.ticketNumber;
	}
	
	public void setTicketNumber(long ticketNumber) {
		this.ticketNumber = ticketNumber;
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
	
	public String getFirstName() { 
		return this.firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName =firstName;
		}
	
	public String getLastName() { 
		return this.lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName =lastName;
		}
	
	public int getNoOfBags() {
		return noOfBags;
	}

	public void setNoOfBags(int noOfBags) {
		this.noOfBags = noOfBags;
	}
	public String getDepartureFlightNumber() {
		return departureFlightNumber;
	}

	public void setDepartureFlightNumber(String departureFlightNumber) {
		this.departureFlightNumber = departureFlightNumber;
	}

	public String getReturnFlightNumber() {
		return returnFlightNumber;
	}

	public void setReturnFlightNumber(String returnFlightNumber) {
		this.returnFlightNumber = returnFlightNumber;
	}

	
	public void addTicketToData() {
		Data data = Data.getInstance();
		data.addTicketToData(this);
		
	}
	
	
	
}
