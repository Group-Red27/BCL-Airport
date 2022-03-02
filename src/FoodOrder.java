import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JTextField;

public class FoodOrder {
	Ticket ticket; 
	Data data = Data.getInstance();
	int[] quantity;
	boolean[] itemsSelected; // items that have been selected for an order
	boolean[] itemsAmended; // items that had to be changed during the order 
	double[] netPrices;
	double totalCost;

	
	public void setTicket(String ticketNumber) {
		if (validateTicketNumber(ticketNumber) == true) {
			this.ticket = data.findTicket(ticketNumber);
		} else {
			this.ticket = null;
		}
	} // searches data to see if a ticket exists with correct ticket num, if not, set to null

	public Ticket getTicket() {
		return this.ticket;
	}

	public void setQuantity(int[] newQuantity) {
		this.quantity = newQuantity;
	}
	
	public int[] getQuantity() {
		return this.quantity;
	}
	
	public void setItemsSelected(boolean[] selected) {
		this.itemsSelected = selected;
	}
	
	public boolean[] getItemsSelected() {
		return this.itemsSelected;
	}
	
	public void setItemsAmended(boolean[] amended) {
		this.itemsAmended = amended;
	}
	
	public boolean[] getItemsAmended() {
		return this.itemsAmended;
	}
	
	public void setNetPrices(double[] newNetPrices) {
		this.netPrices = newNetPrices;
	}
	
	public double[] getNetPrices() {
		return this.netPrices;
	}
	
	public void setTotalCost(double total) {
		this.totalCost = total;
	}
	
	public double getTotalCost() {
		return totalCost;
	}
	
	////////////////// select items
	// carries out all functions on the restaurant selection screen:
	// get and validate quantities entered, calc net prices and total prices, items selected and amended
	public boolean selectItems(JTextField[] entryList) {
		boolean moveFrame = true;
		String[] quantity = new String[12];
		boolean[] selected = new boolean[12];
		boolean[] amended = new boolean[12];
		for (int i = 0; i < 12; i ++) {
			if (entryList[i].getText().equals("")) {
				quantity[i] = "0";
			} else {
				quantity[i] = entryList[i].getText();
			}
		}	// get the values entered in the entry list
			
		boolean valid = validateQuantity(quantity);
		if (valid == true) {
			// if statement used to check if quantities are valid and not all 0s
			int[] quantityInt = convertQuantityToInt(quantity);
			for (int i = 0; i < 12; i++) { // for each item
				if (quantityInt[i] > 0) {
					// if to check if item selected
					selected[i] = true;
					int stockLevel = data.getItemsAvailable()[i].getStockLevel();
					if (quantityInt[i] > stockLevel) {
						// if to adjust an order if stockLevel not high enough
						quantityInt[i] = stockLevel;
						amended[i] = true;
					} else {
						amended[i] = false;
					} // amended items recorded with this if statement
				} else {
					selected[i] = false;
				} // selected items recorded with this if statement
			}// validate the quantites entered
			double[] netPrices = calcNetPrices(data.getItemsAvailable(), quantityInt);
			double totalCost = calcTotalCost(netPrices);
			setQuantity(quantityInt);
			setNetPrices(netPrices);
			setTotalCost(totalCost);
			setItemsSelected(selected);
			setItemsAmended(amended);
			// set items selected, quantity, full prices attribute of object to the order
		} else {
			Popup popup = new Popup();
			popup.showErrorMessage("Invalid quantity, you will be returned to the SELECTION menu");
			moveFrame = false;
		}  // creates an error pop up and a false flag to indicate not to move screens
		return moveFrame; 
	}
	


	////////////////// confirm order
	// carries out all functions on the confirmation screen
	// validate name and ticket entry, sets the new stock level and starts restock timer when needed
	public boolean confirmOrder(JTextField ticketEntry, JTextField nameEntry, JTextField[] entryList) {
		boolean moveFrame = true;
		Popup popup = new Popup();
		String ticketNumber = ticketEntry.getText(); 
		setTicket(ticketNumber);
		String passengerName = nameEntry.getText();
		String errorString = validateDetails(passengerName);
		// gets the values entered from the confirmation screen
		// carries out validation and error checking
		if (errorString != "") {
			popup.showErrorMessage(errorString);
			moveFrame = false;
			// if any validation tests fail, whole process flags as false and does not procees
		} else {
			for (int i = 0; i < 12; i++) {
				int currentStock = data.getItemsAvailable()[i].getStockLevel();
				int newStock = currentStock - quantity[i];
				// calculates new stock based on quantity ordered
				if (newStock == 0) {
					restockTimer(data.getItemsAvailable()[i],entryList[i]);
					// if statement when an item gets put out of stock, restock with timer
				}  // for loop to change stockLevel based on order
				data.getItemsAvailable()[i].setStockLevel(newStock); // sets new stock
			}
			Ticket ticket = getTicket();
			addCostToTicket(ticket, totalCost);
			popup.showSuccessMessage("Purchase Successful, you will be returned to the SELECTION menu");
			// adds the cost of the order to the ticket
		} 
		return moveFrame;
	}
	
	//////////// validate quantity for being int, within range
	public boolean validateQuantity(String[] quantity) {
		boolean valid = true;
		int count = 0;
		try {
			for (int i = 0; i<12; i++) {
				
				int value = Integer.parseInt(quantity[i]); // convert to int
				if (value > 100 || value < 0) {
					valid = false;
				} else if (value > 0) {
					count += 1;
				}
			}
			if (count == 0) {
				valid = false; // ensues not all quanties entered are 0
			}
		} catch (NumberFormatException e) {
			valid = false;
		}
		return valid;
	}
	
	///////////// convert quantity to int
	public int[] convertQuantityToInt(String[] quantity) {
		int[] intQuantity = new int[12];
		for (int i = 0; i<12; i++) {
			intQuantity[i] = Integer.parseInt(quantity[i]); // convert to quantity
		}
		return intQuantity;
	}
	
	//////////// validate details
	public String validateDetails(String passengerName) {
		String errorString = "";
		Ticket ticket = getTicket();
		boolean validName = validatePassengerName(passengerName);
		if (validName == false) {
			errorString = "Invalid name, you will be returned to the CONFIRMATION menu";
		} else if (ticket == null) {
			errorString = "Invalid ticket number, you will be returned to the CONFIRMATION menu";
		} else 
			if (passengerName.equals(ticket.getPassengerName()) == false) {
			errorString = "Details don’t match, you will be returned to the CONFIRMATION menu";
			System.out.print(passengerName);
		}  // returns different error messsages based on which error occurs
		return errorString;
	}
	
	//////////// validate passenger name, regular expression to define only letters and space staring with a letter
	public boolean validatePassengerName(String passengerName) {
		boolean valid;
		if (passengerName.matches("[a-zA-Z][a-zA-Z\s]*")) {
			valid = true;
		} else {
			valid = false;
		}	
		return valid;
	}
	//////////// validate ticket number
	public boolean validateTicketNumber(String ticketNumber) {
		boolean valid = true;
		if (ticketNumber != null && ticketNumber.length() == 8) {
			try {
				Integer.parseInt(ticketNumber); // not null, correct length, all numbers
			} catch (NumberFormatException e) {
				valid = false;
			}
		} else {
			valid = false;
		}
		return valid;
	}
	
	// calcs net prices for all items 
	public double[] calcNetPrices(Fooditem[] itemsAvailable, int[] quantity) {
		double[] netPrices = new double[12];
		for (int i = 0; i < 12; i++) {
			double netPrice = 0;
			netPrice = (itemsAvailable[i]).getPrice() * quantity[i];
			netPrices[i] = netPrice;
		}
		return netPrices;
	}
	
	// sum of net prices
	public double calcTotalCost(double[] netPrices) {
		double total = 0;
		for (int i = 0; i<12; i++) {
			total += netPrices[i];
		}
		return total;
	}
	
	// timer task for restock
	public static void restockTimer(Fooditem item, JTextField entry) {
		Timer timer = new Timer();
		TimerTask restock = new TimerTask() {
			public void run() {
				item.setStockLevel(100);
				entry.enable(true);
				Popup popup = new Popup();
				popup.showSuccessMessage(item.getItemName()+" has been restocked. Refresh the screen to see changes");
				//System.out.println("restock this item");
				// a pop up is created to indicate to the user that a restock has occured, prompting them to 
				// refesh the page if wanted, or to continue with their order
			}
		}; timer.schedule(restock,180000);
		 //timer.schedule(restock,5000);
	} 
	
	public void addCostToTicket(Ticket ticket, double totalCost) {
		double foodCost = ticket.getFoodCost();
		totalCost = Double.parseDouble(String.format("%.2f",totalCost));
		System.out.println(ticket.firstName);
		System.out.println("Ticket foodCost before"+foodCost);
		foodCost += totalCost;
		// cumulative cost- allows for multiple orders to be made
		ticket.setFoodCost(foodCost);
		System.out.println("Ticket foodCost after "+ticket.getFoodCost());
	} // adds the order cost to existing foodCost on ticket cumulative
	

	

	
}
