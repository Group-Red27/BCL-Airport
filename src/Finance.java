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
	double compensationCost;
	double overallTotalCost;
	String departureFlightNumber;
	String returnFlightNumber;
	int classPriceRating;
	
	
	
	public Finance(Ticket ticket) {
		if (ticket == null) {
			ticket = new Ticket();
			ticket.setDepartureFlightNumber("TA8112");
			ticket.setReturnFlightNumber("TM5422");
			ticket.setNoOfBags(4);
			ticket.setFoodCost(45.00);
			ticket.setFirstName("John");
			ticket.setLastName("Smith");
			ticket.setTicketNumber(12345678);
			ticket.addTicketToData();
		}
		this.ticket = ticket; 
		
		Ticket ticketFound = data.findFinTicket(ticket.getTicketNumber());
//		System.out.print(ticketFound.getTicketNumber());
//		System.out.println(ticketFound.noOfBags);

		Flightclass departureFlight = data.findflight(ticketFound.getDepartureFlightNumber());
//		System.out.println(departureFlight.getDistance());
//		System.out.println(departureFlight.getDelay());
		
		Flightclass returnFlight = data.findflight(ticketFound.getReturnFlightNumber());
//		System.out.println(returnFlight.getDistance());	
	}
	
//	Object tableData [] = {ticketFound.getFoodCost(), getProductCost(), getBagCost()};
		
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
	public double getFoodCost() {
		return foodCost;
	}
//	public void setFoodCost(double foodCost) {
//		this.foodCost = Ticket.getFoodCost();		// Is this right for calling from data class
//	}
	public double getProductCost() {
		return productCost;
		
	}
	public void setProductCost(double productCost) {
		this.productCost = 0.00;						// I want to set this to zero
	}
	public double getCompensationCost() {
		return compensationCost;
	}
	public void setCompensationCost(double compensationCost) {
		this.compensationCost = compensationCost;
	}
	public double getOverallTotalCost() {
		return overallTotalCost;
	}
	public void setOverallTotalCost(double overallTotalCost) {
		this.overallTotalCost = overallTotalCost;
	}
	
	
	
//	For all costs which has dispute - error messages
	private String anError(){
	return ("**Error**");
	}
	
	private String bagCostError(){
		return ("Invalid input for number of bags checked in, please go back to bookings & enter a valid number.If there is no bags then enter zero");
		}
	
//	calculation of bag cost
	public double calBagCost(int noOfBags) {
		
//		Ticket ticket = getTicket();
		Ticket ticketFound = data.findFinTicket(ticket.getTicketNumber());	//is this right??
		noOfBags = ticketFound.noOfBags;	// will it get no of bags ??
		System.out.println(ticket.noOfBags);
		bagCost = 0; 
		
		if (noOfBags > 0) {
			bagCost = noOfBags * 25.00;
			
		} else if (noOfBags == 0){
			bagCost = 0.00;
		} else 
			System.out.println(anError());
			System.out.println(bagCostError());
			System.out.format("%.2f", bagCost);
		return bagCost;
		
	}
	
	public double compensationCost(int delaysInDeparture) {
		
		Ticket ticketFound = data.findFinTicket(ticket.getTicketNumber());
		Flightclass departureFlight = data.findflight(ticketFound.getDepartureFlightNumber());	
		delaysInDeparture = departureFlight.getDelay();
		compensationCost = 0;
		
		if (delaysInDeparture > 60 && delaysInDeparture <= 120) {
			compensationCost = 100.00;
		}else if (delaysInDeparture > 120 && delaysInDeparture <= 180) {
			compensationCost = 200.00;
		}else if (delaysInDeparture > 180) {
			compensationCost = 300.00;
		}else 
			compensationCost = 300.00;
		
		return compensationCost;
		System.out.format("%.2f", compensationCost);
		}


	private String declarePriceRating  (String SeatNumber) {		
		String seatClass = seatingPlan.getSeatClass(SeatNumber);
		double classPriceRating = 0;
		
		if (seatClass == "Economy") {
			classPriceRating = 0.5;
		}else if (seatClass == "Business class") {
			classPriceRating = 1.0;
		}else
			classPriceRating = 1.5;		
	}
	
	
	private double calTicketCostDeparture() {
		Ticket ticketFound = data.findFinTicket(ticket.getTicketNumber());
		Flightclass departureFlight = data.findflight(ticketFound.getDepartureFlightNumber());	
		travelDistDeparture = departureFlight.getDistance();
		seatNumberDeparture = ticketFound.getSeatNumber();
		
		ticketCostDeparture = travelDistDeparture * classPriceRating;		
		return ticketCostDeparture;
	}
		
	private double calTicketCostReturn() {
		Ticket ticketFound = data.findFinTicket(ticket.getTicketNumber());
		Flightclass returnFlight = data.findflight(ticketFound.getReturnFlightNumber());	
		travelDistReturn = returnFlight.getDistance();
		seatNumberReturn = ticketFound.getSeatNumber();;
		
		ticketCostReturn = travelDistReturn * classPriceRating;
		return ticketCostReturn;		
	}
	
	private double calTicketPrice(Ticket ticket) {
		double tempTicketPrice = 0;
		tempTicketPrice = ticketCostDeparture + ticketCostReturn;	
		System.out.format("%.2f",tempTicketPrice); // berfore return or after ???
		return ticketPrice;
		
	}
	
	

}
