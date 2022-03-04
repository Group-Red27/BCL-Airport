
public class Finance {
	
	Data data = Data.getInstance();
	Ticket ticket;
	SeatingPlan seatingPlan; 
	
	
	double bagCost;
	double travelDistDeparture;
	double travelDistReturn;
	String departureSeatNumber;
	String returnSeatNumber;
	int delaysInDeparture;
	double ticketPrice;
	double ticketCostDeparture;
	double ticketCostReturn;
	double compensation;
	double overallTotalCost;
	String departureFlightNumber;
	String returnFlightNumber;
	int classPriceRating;
	
	
	
	public Finance(Ticket ticket) {	
//		this.ticket = ticket;
//		if (ticket == null) {
//			ticket = new Ticket();
//			ticket.setDepartureFlightNumber("TA8112");
//			ticket.setDelaysInDeparture(120);
//			ticket.setReturnFlightNumber("TM5422");
//			ticket.setDepartureSeatNumber("1A");
//			ticket.setReturnSeatNumber("6A");
//			ticket.setNoOfBags(4);
//			ticket.setFoodCost(45.00);
//			ticket.setFirstName("John");
//			ticket.setLastName("Smith");
//			ticket.setTicketNumber(12345678);
//			ticket.addTicketToData();
//		}
//		this.ticket = ticket; 
		
//		Ticket ticketFound = data.findFinTicket(ticket.getTicketNumber());
//		System.out.print(ticketFound.getTicketNumber());
//		System.out.println(ticketFound.noOfBags);

	}
		
		
	public Ticket getTicket() {
		return ticket;
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
	public double getBagCost() {
		return bagCost;
	}
	public void setBagCost(double bagCost) {
		this.bagCost = bagCost;
	}
	public double getTravelDistDeparture() {
		return travelDistDeparture;
	}
	public void setTravelDistDeparture(double travelDistDeparture) {
	this.travelDistDeparture = travelDistDeparture;
	}
	public double getTravelDistReturn() {
		return travelDistReturn;
	}
	public void setTravelDistReturn(double travelDistReturn) {
		this.travelDistReturn = travelDistReturn;
	}
	public int getDelaysInDeparture() {
		return delaysInDeparture;
	}
	public void setDelaysInDeparture(int delaysInDeparture) {
		this.delaysInDeparture = delaysInDeparture;
	}
	public double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
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
	public double getCompensation() {
		return compensation;
	}
	public void setCompensation(double compensation) {
		this.compensation = compensation;
	}
	public double getOverallTotalCost() {
		return overallTotalCost;
	}
	public void setOverallTotalCost(double overallTotalCost) {
		this.overallTotalCost = overallTotalCost;
	}
	
	
	
//	For all costs which has dispute - error messages
	public String anError(){
	return ("**Error**");
	}	
	private String bagCostError(){
		return ("Invalid input for number of bags checked in, please go back to bookings & enter a valid number.If there is no bags then enter zero");
	}
	
	// calculation of bag cost
	public double calBagCost(int noOfBags) {
		
//		Ticket ticketFound = data.findFinTicket(ticket.getTicketNumber());	
//		System.out.println(ticketFound);
//		int noOfBags = ticketFound.noOfBags;		
		bagCost = 0; 
		
		if (noOfBags > 0) {
			bagCost = (noOfBags-1) * 25.00;
			
		} else if (noOfBags == 0){
			bagCost = 0.00;
		} else {
			System.out.println(anError());
			System.out.println(bagCostError());			
		}
		System.out.format("%.2f", bagCost);
		return bagCost;
		
	}
	
	public double calcompensation(int delaysInDeparture) {
		
//		Ticket ticketFound = data.findFinTicket(ticket.getTicketNumber());
//		System.out.println(ticketFound);
//		Flightclass departureFlight = data.findflight(ticketFound.getDepartureFlightNumber());	
//		int delaysInDeparture = departureFlight.getDelay();
		compensation = 0;
		
		if (delaysInDeparture > 60 && delaysInDeparture <= 120) {
			compensation = 100.00;
		}else if (delaysInDeparture > 120 && delaysInDeparture <= 180) {
			compensation = 200.00;
		}else if (delaysInDeparture > 180) {
			compensation = 300.00;
		}else {
			compensation = 0.00;}	
		return compensation;		
		}



	@SuppressWarnings("unused")
	public double declarePriceRating(String seatNumber) {				
		String seatClass = "";
		try {
			seatClass = seatingPlan.getSeatClass(seatNumber);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		double classPriceRating = 0;
		
		if (seatClass == "Economy") {
			classPriceRating = 0.5;
		}else if (seatClass == "Business class") {
			classPriceRating = 1.0;
		}else {
			classPriceRating = 1.5;}
		
		return classPriceRating;		
	}

	public double calTicketCostDeparture(double travelDistanceDeparture, String departureSeatNumber) {
//		Ticket ticketFound = data.findFinTicket(ticket.getTicketNumber());
//		Flightclass departureFlight = data.findflight(ticketFound.getDepartureFlightNumber());		
//		double travelDistDeparture = departureFlight.getDistance();
//		String departureSeatNumber = ticketFound.getDepartureSeatNumber();
		
		double classPriceRating = declarePriceRating(departureSeatNumber);
		
		ticketCostDeparture = travelDistDeparture * classPriceRating;
		return ticketCostDeparture;
	}
		
	public double calTicketCostReturn(double travelDistanceReturn, String returnSeatNumber) {
//		Ticket ticketFound = data.findFinTicket(ticket.getTicketNumber());
//		Flightclass returnFlight = data.findflight(ticketFound.getReturnFlightNumber());	
//		double travelDistReturn = returnFlight.getDistance();
//		String seatNumberReturn = ticketFound.getReturnSeatNumber();
		
		double classPriceRating = declarePriceRating(returnSeatNumber);		
		
		ticketCostReturn = travelDistReturn * classPriceRating;
		return ticketCostReturn;
		
	}
	
	public double calTicketPrice() {
		double ticketCostDeparture = calTicketCostDeparture(travelDistDeparture, departureSeatNumber);
		double ticketCostReturn = calTicketCostReturn(travelDistReturn, returnSeatNumber);
		ticketPrice = 0;
		ticketPrice = ticketCostDeparture + ticketCostReturn;	
		System.out.format("%.2f",ticketPrice);
		return ticketPrice;	
	}
	
	public double calOverallTotalCost() {
		overallTotalCost = 0;
		double tempTotal = 0; 
		
		tempTotal = ( getBagCost() + ticket.foodCost + ticket.productCost + getTicketPrice() ) ;
		System.out.format("%.2f",overallTotalCost);
		return overallTotalCost = (tempTotal - compensation) ;		
	}
	
	public int defineNoTableRows() {			
		int purchasedTickets = data.tickets.size();
		return purchasedTickets;
	}
	
	
	
	}


