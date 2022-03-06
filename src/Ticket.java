
public class Ticket {
	long ticketNumber;
	double foodCost;
	String firstName;
	String lastName;
	String departureFlightNumber;
	String returnFlightNumber;
	String departureSeatNumber;
	String returnSeatNumber;
	String departureairport;
	String returnairport;
	String dateOfBirth;
	double bagCost;
	double compensation;
	double ticketCostDeparture;
	double ticketCostReturn;
	double ticketPrice;
	double productCost;
	double overallTotalCost;
	int delaysInDeparture;
	double travelDistDeparture;
	double travelDistReturn;
	String seatClass;
	int noOfBags;
	

	public Ticket() {
		
	}
	
	public Ticket(String fname, String lname, String dob, String departureF, String returnF, String dSeat, String rSeat) {
		this.ticketNumber = generateTicketNum();
		this.firstName = fname;
		this.lastName = lname;
		this.departureFlightNumber = departureF;
		this.returnFlightNumber = returnF;
		this.departureSeatNumber = dSeat;
		this.returnSeatNumber = rSeat;
		// constructor
	}
	
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
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public double getBagCost() {
		return bagCost;
	}

	public void setBagCost(double bagCost) {
		this.bagCost = bagCost;
	}

	public double getCompensation() {
		return compensation;
	}

	public void setCompensation(double compensation) {
		this.compensation = compensation;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public double getProductCost() {
		return productCost;
	}

	public void setProductCost(double productCost) {
		this.productCost = 123.00 ;
	}
	public double getOverallTotalCost() {
		return overallTotalCost;
	}
	public void setOverallTotalCost(double overallTotalCost) {
		this.overallTotalCost = overallTotalCost;
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
	public String getDepartureairport() {
		return departureairport;
	}
	public void setDepartureairport(String departureairport) {
		this.departureairport = departureairport;
	}
	public String getReturnairport() {
		return returnairport;
	}
	public void setReturnCity(String returnairport) {
		this.returnairport = returnairport;
	}

	public int getNoOfBags() {
		return noOfBags;
	}
	public void setNoOfBags(int noOfBags) {
		this.noOfBags = noOfBags;
	}
	
	public String getDepartureSeatNumber() {
		return departureSeatNumber;
	}

	public void setDepartureSeatNumber(String departureSeatNumber) {
		this.departureSeatNumber = departureSeatNumber;
	}

	public String getReturnSeatNumber() {
		return returnSeatNumber;
	}

	public void setReturnSeatNumber(String returnSeatNumber) {
		this.returnSeatNumber = returnSeatNumber;
	}
	public int getDelaysInDeparture() {
		return delaysInDeparture;
	}
	public void setDelaysInDeparture(int delaysInDeparture) {
		this.delaysInDeparture = delaysInDeparture;
	}
	public double getTravelDistDeparture() {
		return travelDistDeparture;
	}
	public void setTravelDistDeparture(double travelDistDeparture) {
		this.travelDistDeparture = travelDistDeparture;
	}
	public double getTicketCostDeparture() {
		return ticketCostDeparture;
	}
	public void setTicketCostDeparture(double ticketCostDeparture) {
		this.ticketCostDeparture = ticketCostDeparture;
	}
	public double getTicketCostReturn() {
		return ticketCostReturn;
	}
	public void setTicketCostReturn(double ticketCostReturn) {
		this.ticketCostReturn = ticketCostReturn;
	}
	public double getTravelDistReturn() {
		return travelDistReturn;
	}
	public void setTravelDistReturn(double travelDistReturn) {
		this.travelDistReturn = travelDistReturn;
	}	
	public String getSeatClass() {
		return seatClass;
	}
	public void setSeatClass(String seatClass) {
		this.seatClass = seatClass;
	}
	public void addTicketToData() {
		Data data = Data.getInstance();
		data.addTicketToData(this);
		
	}
	
	
	
}
