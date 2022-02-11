import java.util.ArrayList;

public class Data {
	private static Data instance = new Data();
	ArrayList<Object> flights;
	ArrayList<Ticket> tickets; 
	ArrayList<Object> users;
	static FoodItem[] itemsAvailable; // for restaurant component
	
	private Data() {
		FoodItem item1 = new FoodItem("Chicken Noodles","Marinated chicken with seasonal greens, menma, spring onion, rich chicken broth with miso",0,1);
		FoodItem item2 = new FoodItem("Rice & Beef","Beef brisket in teriyaki sauce shredded carrots. seasonal greens spring onion sesame seeds with rice",0,2);
		FoodItem item3 = new FoodItem("Tofu Stir Fry","Bold + fiery tofu, mangetout, red + green peppers, onion, hot red chillies, sesame seeds stir fry",100,3);
		FoodItem item4 = new FoodItem("Vegetable Dumpling","Yasai steamed dumplings served grilled with a dipping sauce and filled with vegtables",100,4);
		FoodItem item5 = new FoodItem("Crisps","Description",100,5);
		FoodItem item6 = new FoodItem("Peanuts","Description",100,6);
		FoodItem item7 = new FoodItem("Sweets","Description",100,7);
		FoodItem item8 = new FoodItem("Ice Cream","Description",100,8);
		FoodItem item9 = new FoodItem("Bottled Water","Description",100,9);
		FoodItem item10 = new FoodItem("Fizzy Drink","Description",100,10);
		FoodItem item11 = new FoodItem("Juice","Description",100,11);
		FoodItem item12 = new FoodItem("Beer","Description",100,12);
		FoodItem[] items = {item1,item2,item3,item4,item5,item6,item7,item8,item9,item10,item11,item12};
		this.itemsAvailable = items;
	} // the constructor, setting the itemsAvailable array since this will be fixed

	public static Data getInstance() {
		return instance;
    }
	
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
