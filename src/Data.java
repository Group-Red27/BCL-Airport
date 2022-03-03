import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
//import Flightclass;

public class Data {
	private static Data instance = new Data();
	ArrayList<Flightclass> flights;
	ArrayList<Ticket> tickets; 
	ArrayList<Object> users;
	static Fooditem[] itemsAvailable;// for restaurant component
	Seat SeatClasses;// for seat component
	
	
	private Data() {
		flights = new ArrayList<Flightclass>();
		tickets = new ArrayList<Ticket>();
		users = new ArrayList<Object>();
		
		Ticket ticket1 = new Ticket();
		ticket1.setFirstName("Aaron"); ticket1.setLastName("Samuels"); ticket1.setTicketNumber(83746578);ticket1.setDateOfBirth("01/01/1990");ticket1.setNoOfBags(4);
		ticket1.setDelaysInDeparture(179);ticket1.setTravelDistDeparture(7021.04);ticket1.setDepartureFlightNumber("TS4977");ticket1.setDepartureSeatNumber("1A");
		ticket1.setReturnFlightNumber("ST4138");ticket1.setTravelDistReturn(11687.85);ticket1.setReturnSeatNumber("1A");ticket1.setSeatClass("First");
		
		Ticket ticket2 = new Ticket();
		ticket2.setFirstName("Regina"); ticket2.setLastName("George"); ticket2.setTicketNumber(27475839);ticket2.setDateOfBirth("28/02/1995");ticket2.setNoOfBags(0);
		ticket2.setDelaysInDeparture(179);ticket2.setTravelDistDeparture(7021.04);ticket2.setDepartureFlightNumber("TS4977");ticket2.setDepartureSeatNumber("6A");
		ticket2.setReturnFlightNumber("ST4138");ticket2.setTravelDistReturn(11687.85);ticket2.setReturnSeatNumber("6A");ticket2.setSeatClass("Business");
		
		Ticket ticket3 = new Ticket();
		ticket3.setFirstName("Cady"); ticket3.setLastName("Heron"); ticket3.setTicketNumber(95738494);ticket3.setDateOfBirth("21/08/1997");ticket3.setNoOfBags(3);
		ticket3.setDelaysInDeparture(179);ticket3.setTravelDistDeparture(7021.04);ticket3.setDepartureFlightNumber("TS4977");ticket3.setDepartureSeatNumber("11A");
		ticket3.setReturnFlightNumber("ST4138");ticket3.setTravelDistReturn(11687.85);ticket3.setReturnSeatNumber("1A");ticket3.setSeatClass("Economy");
		
		this.addTicketToData(ticket1); this.addTicketToData(ticket2); this.addTicketToData(ticket3);
		
		Fooditem item1 = new Fooditem("Chicken Noodles","Marinated chicken with seasonal greens, menma, spring onion, rich chicken broth with miso",100,10.99);
		Fooditem item2 = new Fooditem("Rice & Beef","Beef brisket in teriyaki sauce shredded carrots. seasonal greens spring onion sesame seeds",100,8.99);
		Fooditem item3 = new Fooditem("Tofu Stir Fry","Bold + fiery tofu, mangetout, red + green peppers, onion, hot red chillies, sesame seeds stir fry",100,9.99);
		Fooditem item4 = new Fooditem("Vegetable Dumpling","Yasai steamed dumplings served grilled with a dipping sauce and filled with vegtables",100,8.99);
		Fooditem item5 = new Fooditem("Crisps","Hand Cooked Potato Chips, Lightly Salted",100,1.15);
		Fooditem item6 = new Fooditem("Peanuts","Mixed Nuts (49%) Bar with Peanut Butter (3%) and Dark Chocolate (18%).",100,2.45);
		Fooditem item7 = new Fooditem("Sweets","Assorted fruit flavour gums. CHEWY & JUICY Inspired by a traditional sweet shop recipe ",100,1.15);
		Fooditem item8 = new Fooditem("Ice Cream","Vanilla ice cream choc-full of chocolatey cookie swirl, chocolatey cookie sandwiches",100,3.99);
		Fooditem item9 = new Fooditem("Bottled Water","Still Spring Water",100,1.50);
		Fooditem item10 = new Fooditem("Fizzy Drink","Low Calorie Cola Flavoured Soft Drink with Sweeteners",100,1.55);
		Fooditem item11 = new Fooditem("Juice","Apple and mango juice not from concentrate",100,1.50);
		Fooditem item12 = new Fooditem("Beer","American Lager, ABV: 4.5%. Light bodied lager with clean, crisp, dry finish",100,3.45);
		Fooditem[] items = {item1,item2,item3,item4,item5,item6,item7,item8,item9,item10,item11,item12};
		itemsAvailable = items;
		
		try {
			this.main(null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
//	} // finds a specific ticket object given a ticket number,
	
	}
	public Ticket findFinTicket(long ticketNumber) {
		Ticket ticketF = new Ticket();
//		System.out.println(flights);
//		System.out.println(ticketNumber);
//		System.out.println(tickets.get(0));
		for (int i = 0; i < tickets.size(); i++ ) {
			long currentTicketNumber = tickets.get(i).getTicketNumber();
					if (ticketNumber == currentTicketNumber)   {
						return tickets.get(i);
					}
					
		}return ticketF;
	}
	
//	This is for finance class 
	public Flightclass findflight(String flightNumber) {
		Flightclass flight = new Flightclass();
//		System.out.println(flights);
//		System.out.println(flightNumber);
		for (int i = 0; i < flights.size(); i++ ) {
			String currentFlightNumber = flights.get(i).getFlightnumber();
					if (flightNumber.equals(currentFlightNumber)) {
						return flights.get(i);
					}
					
		}return flight;
		
	}

//Read CSV	
	  public void main(String[] args) throws Exception {
	    try {
	      File myObj = new File("Flights.csv");
	      Scanner myReader = new Scanner(myObj);
	      
	      while (myReader.hasNextLine()) {
	        String[] data = myReader.nextLine().split(",");
	        Flightclass flightC = new Flightclass();
	        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm");
	        
	        flightC.setDateofflight(LocalDate.parse(data[0],dateFormat));
	        flightC.setDeparturetime(LocalTime.parse(data[1],timeFormat));
	        flightC.setArrivaltime(LocalTime.parse(data[2],timeFormat));
	        flightC.setFlightduration(LocalTime.parse(data[3],timeFormat));
	        flightC.setDistance(Double.parseDouble(data[4]));
	        flightC.setDelay(Integer.parseInt(data[5]));
	        flightC.setDepartureairport(data[6]);
	        flightC.setDeparturecity(data[7]);
	        flightC.setArivalairport(data[8]);
	        flightC.setArrivalcity(data[9]);
	        flightC.setFlightnumber(data[10]);
	        flightC.setAirline(data[11]);
	        
	        flights.add(flightC); 
	        
	      }
	      myReader.close();
	    } catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	  }
	 

	public void addTicketToData(Ticket ticket) {
		tickets.add(ticket);
	}
	
//	public void addTicketToData(Object user) {
//		users.add(user);
//	}

	public ArrayList<Flightclass> getFlights() {		
		return this.flights;
	}
	
	public Fooditem[] getItemsAvailable() {
		return this.itemsAvailable;
	}
		
	public ArrayList<Ticket> getTickets() {
		return this.tickets;
	}
	

}
