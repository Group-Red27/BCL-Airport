import java.util.ArrayList;

public class Finance {
	
	Data data = Data.getInstance();
	Ticket ticket;
	
	double bagCost;
	double travelDistDeparture;
	double travelDistReturn;
	int delaysInDeparture;
	double ticketPrice;
	double ticketCostDeparture;
	double ticketCostReturn;
	double productCost;
	double compensationCost;
	double overallTotalCost;
	String departureFlightNumber;
	String returnFlightNumber;
	
	
	
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
	public double getProductCost() {
		return productCost;
	}
	public void setProductCost(double productCost) {
		this.productCost = productCost;
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
	
//	For all costs which has dispute
	private String anError(){
	return ("*****");
	}
	
	public double calBagCost(int noOfBags) {
		
		Ticket ticket = getTicket();
		noOfBags = ticket.getNoOfBags();
		String bagCostError = "";
		bagCost = 0; //Do I need this
		
		if (noOfBags > 0) {
			bagCost = noOfBags * 25.00;
		} else if (noOfBags == 0){
			bagCost = 0.00;
		} else 
			bagCostError = "Invalid input for number of bags checked in, please go back to bookings & enter a valid number.If there is no bags then enter zero";
			System.out.println(anError());
		return bagCost;
	}
	
	public double compensationCost(int delaysInDeparture) {
		
		Ticket ticket = getTicket();
		departureFlightNumber = ticket.getDepartureFlightNumber();	//How to do this
		delaysInDeparture = DepartureFlightNumber.getDelay();		//again same
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
		}

	public String ticketCostRating  (String seatClass) {
		double classPriceRating = 0;
		
		if (seatClass = "economy") {
			classPriceRating = 0.5;
		}else if (seatClass = "business") {
			classPriceRating = 1.0;
		}else
			classPriceRating = 1.5;		
	}
	
	 // how to get departureflighNumber & distance
	// do I need getFlight method?
	
	public double calTicketCostDeparture() {
		Ticket ticket = getTicket();
		
		String seatClass = SeatingPlan.getSeatClass(seatNumber);
		seatClass = SeatingPlan.seatClass;
		departureFlightNumber = ticket.getDepartureFlightNumber();
		travelDistDeparture = departureFlightNumbr.getdistance();
		
		ticketCostDeparture = travelDistDeparture * ticketCostRating().getClassPriceRating;
		
		return ticketCostDeparture;}
		
	
	
	

}
