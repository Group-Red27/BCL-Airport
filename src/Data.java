import java.util.ArrayList;

public class Data {
	private static Data instance = new Data();
	ArrayList<Object> flights;
	ArrayList<Ticket> tickets; 
	ArrayList<Object> users;
	static Fooditem[] itemsAvailable; // for restaurant component
	
	private Data() {
		flights = new ArrayList<Object>();
		tickets = new ArrayList<Ticket>();
		users = new ArrayList<Object>();
		
		Fooditem item1 = new Fooditem("Chicken Noodles","Marinated chicken with seasonal greens, menma, spring onion, rich chicken broth with miso",100,1);
		Fooditem item2 = new Fooditem("Rice & Beef","Beef brisket in teriyaki sauce shredded carrots. seasonal greens spring onion sesame seeds with rice",100,2);
		Fooditem item3 = new Fooditem("Tofu Stir Fry","Bold + fiery tofu, mangetout, red + green peppers, onion, hot red chillies, sesame seeds stir fry",100,3);
		Fooditem item4 = new Fooditem("Vegetable Dumpling","Yasai steamed dumplings served grilled with a dipping sauce and filled with vegtables",100,4);
		Fooditem item5 = new Fooditem("Crisps","Description",100,5);
		Fooditem item6 = new Fooditem("Peanuts","Description",100,6);
		Fooditem item7 = new Fooditem("Sweets","Description",100,7);
		Fooditem item8 = new Fooditem("Ice Cream","Description",100,8);
		Fooditem item9 = new Fooditem("Bottled Water","Description",100,9);
		Fooditem item10 = new Fooditem("Fizzy Drink","Description",100,10);
		Fooditem item11 = new Fooditem("Juice","Description",100,11);
		Fooditem item12 = new Fooditem("Beer","Description",100,12);
		Fooditem[] items = {item1,item2,item3,item4,item5,item6,item7,item8,item9,item10,item11,item12};
		itemsAvailable = items;
	} // the constructor, setting the itemsAvailable array since this will be fixed

	public static Data getInstance() {
		return instance;
    } // used when calling the Data class from other classes instead of creating a new instance
	
	public Ticket findTicket(String ticketNumber) {
		Ticket ticket = null;
		long ticketNo = Long.parseLong(ticketNumber);
		if (tickets.size() > 0) { 
			for (int i = 0; i < tickets.size(); i++) {
				if (ticketNo == tickets.get(i).getTicketNumber()) {
					ticket = tickets.get(i);
				}
			}
		} // if statement in case tickets array has no tickets in it yet.
		return ticket;
	} // finds a specific ticket object given a ticket number
	
	public void addTicketToData(Ticket ticket) {
		tickets.add(ticket);
	}
	
	public void addTicketToData(Object user) {
		users.add(user);
	}
	
}
