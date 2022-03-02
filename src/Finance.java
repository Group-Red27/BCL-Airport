import java.util.ArrayList;

public class Finance {
	
	Data data = Data.getInstance();
	Ticket ticket;
	SeatingPlan seatingPlan; 
	
	
	double bagCost;
	double travelDistDeparture;
	double travelDistReturn;
	String seatNumberDeparture;
	String seatNumberReturn;
	int delaysInDeparture;
	double ticketPrice;
	double ticketCostDeparture;
	double ticketCostReturn;
	double productCost;
	double foodCost;
	double compensation;
	double overallTotalCost;
	String departureFlightNumber;
	String returnFlightNumber;
	int classPriceRating;
	
//	private Finance ticketFound;
	
	
	public Finance(Ticket ticket) {
//		if (ticket == null) {
//			ticket = new Ticket();
//			ticket.setDepartureFlightNumber("TA8112");
//			ticket.setReturnFlightNumber("TM5422");
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
	
//	Ticket ticketFound = data.findFinTicket(ticket.getTicketNumber());  // line 47 = 48 
//	Ticket ticketFound = this.ticket;
	
//	Flightclass departureFlight = data.findflight(ticketFound.getDepartureFlightNumber());	// line 51 =52 , will return departureFlightNumber
//	String departureFlight = ticketFound.getDepartureFlightNumber();
	
		
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
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
//	public double getFoodCost() {
//		return foodCost;
//	}
//	public void setFoodCost(Ticket ticketFound) {
//		this.foodCost = ticketFound.getFoodCost();		
//	}
	public double getProductCost() {
		return productCost;
		
	}
	public void setProductCost(double productCost) {
		this.productCost = 100.00;						
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
		
//		Ticket ticketFound = this.ticket;
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
		
//		Ticket ticketFound = this.ticket;
//		Flightclass departureFlight = data.findflight(ticketFound.getDepartureFlightNumber());	
//		delaysInDeparture = departureFlight.getDelay();
		compensation = 0;
		
		if (delaysInDeparture > 60 && delaysInDeparture <= 120) {
			compensation = 100.00;
		}else if (delaysInDeparture > 120 && delaysInDeparture <= 180) {
			compensation = 200.00;
		}else if (delaysInDeparture > 180) {
			compensation = 300.00;
		}else 
			compensation = 300.00;
		
		return compensation;		
		}



	public double declarePriceRating(String seatNumber) {				
		String seatClass = null;
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

	public double calTicketCostDeparture(double travelDistDeparture) {
		Ticket ticketFound = this.ticket;
		Flightclass departureFlight = data.findflight(ticketFound.getDepartureFlightNumber());
		travelDistDeparture = departureFlight.getDistance();
		String departureSeatNumber = ticketFound.departureSeatNumber;

		double classPriceRating = declarePriceRating(ticketFound.departureSeatNumber);
		ticketCostDeparture = travelDistDeparture * classPriceRating;
		return ticketCostDeparture;
	}
		
	public double calTicketCostReturn(double travelDistReturn) {
		Ticket ticketFound = data.findFinTicket(ticket.getTicketNumber());
		Flightclass returnFlight = data.findflight(ticketFound.getReturnFlightNumber());	
		travelDistReturn = returnFlight.getDistance();
		String seatNumberReturn = ticketFound.getReturnSeatNumber();
		
		double classPriceRating = declarePriceRating(ticketFound.returnSeatNumber);		
		ticketCostReturn = travelDistReturn * classPriceRating;
		return ticketCostReturn;		
	}
	
	public double calTicketPrice() {
		double ticketCostDeparture = calTicketCostDeparture(travelDistDeparture);
		double ticketCostReturn = calTicketCostReturn(travelDistReturn);
		ticketPrice = 0;
		ticketPrice = ticketCostDeparture + ticketCostReturn;	
		System.out.format("%.2f",ticketPrice);
		return ticketPrice;	
	}
	
	public double calOverallTotalCost() {
		overallTotalCost = 0;
		double tempTotal = 0;
		
		tempTotal = (bagCost + ticket.foodCost + productCost +ticketPrice) ;
		System.out.format("%.2f",overallTotalCost);
		return overallTotalCost = (tempTotal - compensation) ;		
	}
	
	public int defineNoTableRows() {			
		int purchasedTickets = data.tickets.size();
		return purchasedTickets;
	}
	
	
	
	}


