import java.util.ArrayList;

public class Data {
	ArrayList<Object> flights;
	ArrayList<Ticket> tickets; 
	ArrayList<Object> users;
	ArrayList<FoodItem> itemsAvailable; // for restaurant component
	
	
	public Ticket findTicket(String ticketNumber) {
		ArrayList<Ticket> allTickets = this.tickets;
		Ticket ticket = null;
		long ticketNo = Long.parseLong(ticketNumber);
		for (int i = 0; i < allTickets.size(); i++) {
			if (ticketNo == allTickets.get(i).getTicketNumber()) {
				ticket = allTickets.get(i);
			}
			
		}
		return ticket;
	}
	
	
	
}
