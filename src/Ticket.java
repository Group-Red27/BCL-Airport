
public class Ticket {
	long ticketNumber;
	double foodCost;
	String firstName;
	String lastName;
	
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

}
