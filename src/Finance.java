
public class Finance {
	
	Data data = Data.getInstance();
	Ticket ticket;
	SeatingPlan seatingPlan; 
	HardCodedFlightclass hardcodedFlightclass;
	
	
	
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
//		Try with this data while building the code step by step
//		this.ticket = ticket;
//		if (ticket == null) {
//			ticket = new Ticket();
//			ticket.setDepartureFlightNumber("TS4977");
//			ticket.setTravelDistDeparture(7021.04);
//			ticket.setDelaysInDeparture(179);
//			ticket.setReturnFlightNumber("ST4138");
//			ticket.setTravelDistReturn(11687.85);
//			ticket.setDepartureSeatNumber("1A");
//			ticket.setReturnSeatNumber("6A");
//			ticket.setNoOfBags(5);
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
	
	
	
	public String bagCostError(){
	return ("Invalid input for number of bags checked in, please go back to bookings & enter a valid number.If there is no bags then enter zero");
	}
	
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
			bagCost = 0.00;		
//			Checkout checkout = new Checkout();
			
			System.out.println(bagCostError());			
		}		
		return bagCost;
		
	}
	
	public double calCompensation(int delaysInDeparture) {
		
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
	public double declarePriceRating(String seatNumber,Flightclass flightclass) {				
		String seatClass = "";
		HardCodedFlightclass temp = new HardCodedFlightclass(flightclass.getdateofflight(),flightclass.getDeparturetime(),flightclass.getArrivaltime(),flightclass.getFlightduration(),
				flightclass.getDistance(),flightclass.getDelay(),flightclass.getDepartureairport(),flightclass.getDeparturecity(),flightclass.getArivalairport(),flightclass.getArrivalcity(),
				flightclass.getFlightnumber(),flightclass.getAirline());
		try {
			SeatingPlan seatingPlan = new SeatingPlan(flightclass.getAirline(), temp);
//			System.out.println(seatingPlan);
//			System.out.println(seatNumber);
//			System.out.println(flightclass.getFlightnumber());
			seatClass = seatingPlan.getSeatClass(seatNumber);
//			System.out.println(seatClass);
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

	
	public double calTicketCostDeparture(String departureSeatNumber,String departureFlightNumber, String airportDeparture, String airportArrival ) {		
//		Ticket ticketFound = data.findFinTicket(ticket.getTicketNumber());
		Flightclass departureFlight = data.findflightByAirport(departureFlightNumber,airportDeparture,airportArrival);	
		double travelDistDeparture = departureFlight.getDistance();
//		System.out.println(travelDistDeparture);
//		String departureSeatNumber = ticketFound.getDepartureSeatNumber();
		
		double classPriceRating = declarePriceRating(departureSeatNumber,departureFlight);
		ticketCostDeparture = departureFlight.getDistance() * classPriceRating;		
		return ticketCostDeparture;
		
	}
		
	public double calTicketCostReturn(String returnSeatNumber, String returnFlightNumber, String airporReturn, String airportDep) {
//		Ticket ticketFound = data.findFinTicket(ticket.getTicketNumber());
		Flightclass returnFlight = data.findflightByAirport(returnFlightNumber,airportDep ,airporReturn);	
		double travelDistReturn = returnFlight.getDistance();
//		String seatNumberReturn = ticketFound.getReturnSeatNumber();
		
		double classPriceRating = declarePriceRating(returnSeatNumber, returnFlight);		
		ticketCostReturn = travelDistReturn * classPriceRating;
//		System.out.println(returnFlight.getDistance());
		return ticketCostReturn;
		
	}
	
	public double calTicketPrice(Ticket ticket) {
//		System.out.println(String.format("ticket Number %s",ticket.getTicketNumber()));
//		System.out.println(ticket.getReturnairport());
		double ticketCostDeparture = calTicketCostDeparture(ticket.getDepartureSeatNumber(),ticket.getDepartureFlightNumber(),ticket.getDepartureairport(),ticket.getReturnairport());
		double ticketCostReturn = calTicketCostReturn(ticket.getReturnSeatNumber(),ticket.getReturnFlightNumber(),ticket.getDepartureairport(),ticket.getReturnairport());
		
		ticketPrice = 0;
		ticketPrice = ticketCostDeparture + ticketCostReturn;	
		return ticketPrice;	
	}
	
	public double calOverallTotalCost(Ticket ticket) {
		overallTotalCost = 0;
		double tempTotal = 0;
		double bagCost = calBagCost(ticket.getNoOfBags());
		ticketPrice = calTicketPrice(ticket);
		double compensation = calCompensation(ticket.getDelaysInDeparture());
		
		tempTotal = (bagCost + ticket.getFoodCost() + ticket.getProductCost() + ticketPrice ) ;
		return overallTotalCost = (tempTotal - compensation);		
	}
	
	public int defineNoTableRows() {			
		int purchasedTickets = data.tickets.size();
		return purchasedTickets;
	}
	
	
	
	}


