import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Data {
	private static Data instance = new Data();
	ArrayList<Object> flights = new ArrayList<Object>();
	ArrayList<Ticket> tickets = new ArrayList<Ticket>(); 
	ArrayList<Object> users = new ArrayList<Object>();
	static FoodItem[] itemsAvailable; // for restaurant component
	
	private Data() {
		FoodItem item1 = new FoodItem("Chicken Noodles","Marinated chicken with seasonal greens, menma, spring onion, rich chicken broth with miso",1,1);
		FoodItem item2 = new FoodItem("Rice & Beef","Beef brisket in teriyaki sauce shredded carrots. seasonal greens spring onion sesame seeds with rice",1,2);
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
	
	public class ReadCSV {
	static ArrayList<Flightclass> allFlights = new ArrayList<Flightclass>();
	  public void main(String[] args) throws Exception {
	    try {
	      File myObj = new File("Flights.csv");
	      Scanner myReader = new Scanner(myObj);
	      
	      while (myReader.hasNextLine()) {
	        String[] data = myReader.nextLine().split(",");
	        Flightclass flight = new Flightclass();
	        //flight.set(data[10]); Waiting for the Flightclass setter and getters......
	        
	        allFlights.add(flight); 
	        
	      }
	      myReader.close();
	    } catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	  }
	} 
	
}
