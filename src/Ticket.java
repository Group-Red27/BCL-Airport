
public class Ticket {
	long ticketNumber;
	double foodCost;
	String firstName;
	String lastName;
	String departureFlightNumber;	
	String returnFlightNumber;
	int noOfBags;
	

	public Ticket() {
		// constructor
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
