import java.time.LocalTime;
import java.util.ArrayList;

import javax.swing.JTextField;

public class FoodOrder {
	Ticket ticket; 
	Data data;
	ArrayList<Integer> quantity;
	boolean[] itemsSelected;
	double totalCost;

	
	public void setTicket(String ticketNumber) {
		if (validateTicketNumber(ticketNumber) == true) {
			this.ticket = data.findTicket(ticketNumber);
		} else {
			this.ticket = null;
		}
	}


	public Ticket getTicket() {
		return this.ticket;
	}

	public void setQuantity(ArrayList<Integer> newQuantity) {
		this.quantity = newQuantity;
	}
	
	public ArrayList<Integer> getQuantity() {
		return this.quantity;
	}
	
	public void setItemsSelected(boolean[] selected) {
		this.itemsSelected = selected;
	}
	
	public boolean[] getItemsSelected() {
		return this.itemsSelected;
	}
	
	public void setTotalCost(double total) {
		this.totalCost = total;
	}
	
	public double getTotalCost() {
		return totalCost;
	}
	
	//////// from the bottom up 
	//////////////////////////
	
	////////////////// select items
	public boolean selectItems(JTextField[] entryList) {
		boolean moveFrame = true;
		ArrayList<String> quantity = new ArrayList<String>();
		ArrayList<Boolean> amended = new ArrayList<Boolean>();
		for (int i = 0; i < 12; i ++) {
			if (entryList[i].getText().equals("")) {
				quantity.add("0");
			} else {
				quantity.add(entryList[i].getText());
			}
		}	// get the values entered in the entry list
			
		boolean valid = validateQuantity(quantity);
		if (valid == true) {
			// if to check if quantities are valid and not all 0s
			boolean[] selected = {false,false,false,false,false,false,false,false,false,false,false,false};
			ArrayList<Integer> quantityInt = convertQuantityToInt(quantity);
			for (int i = 0; i < 12; i++) {
				if (quantityInt.get(i) > 0) {
					// if to check if item selected
					selected[i] = true;
					int stockLevel = data.itemsAvailable.get(i).getStockLevel();
					if (quantityInt.get(i) > stockLevel) {
						// if statement to adjust selected according to stock level
						quantityInt.set(i,stockLevel);
						amended.set(i, true);
					}
				}
			}
			setQuantity(quantityInt);
			setItemsSelected(selected);
		// validate the quantites entered and set items selected and quantity attribute of object
		} else {
			Popup popup = new Popup();
			popup.showErrorMessage("Invalid quantity, you will be returned to the SELECTION menu");
			moveFrame = false;
		} 
		return moveFrame; 
	}
	
	
	
	////////////////// confirm order
	public void confirmOrder(JTextField ticketEntry, JTextField nameEntry, ArrayList<Integer> quantityInt, double totalCost) {
		Popup popup = new Popup();
		String ticketNumber = ticketEntry.getText(); 
		setTicket(ticketNumber);
		String passengerName = nameEntry.getText();
		String errorString = validateDetails(passengerName);
		if (errorString != "") {
			popup.showErrorMessage(errorString);
		} else {
			for (int i = 0; i < 12; i++) {
				int currentStock = data.itemsAvailable.get(i).getStockLevel();
				int newStock = currentStock - quantity.get(i);
				if (newStock == 0) {
					data.itemsAvailable.get(i).markOutOfStock();
				}
			}
			Ticket ticket = getTicket();
			setTotalCost(totalCost);
			addCostToTicket(ticket, totalCost);
			popup.showSuccessMessage("Purchase Successful, you will be returned to the SELECTION menu");
		}
	}
	
	//////////// validate quantity
	public boolean validateQuantity(ArrayList<String> quantity) {
		boolean valid = true;
		int count = 0;
		try {
			for (int i = 0; i<12; i++) {
				int value = Integer.parseInt(quantity.get(i));
				if (value > 100 || value < 0) {
					if (value > 0) {
						count += 1;
					}
					valid = false;
				}
			}
		} catch (NumberFormatException e) {
			valid = false;
		}
		if (count == 0) {
			valid = false;
		}
		return valid;
	}
	
	///////////// convert quantity to int
	public ArrayList<Integer> convertQuantityToInt(ArrayList<String> quantity) {
		ArrayList<Integer> intQuantity = new ArrayList<Integer>();
		for (int i = 0; i<12; i++) {
			intQuantity.add(Integer.parseInt(quantity.get(i)));
		}
		return intQuantity;
	}
	
	//////////// validate details
	public String validateDetails(String passengerName) {
		String errorString = "";
		Ticket ticket = getTicket();
		boolean validName = validatePassengerName(passengerName);
		if (ticket == null) {
			errorString = "Invalid ticket number, you will be returned to the CONFIRMATION menu";
		} else if (validName == false) {
			errorString = "Invalid name, you will be returned to the CONFIRMATION menu";
		} else 
			if (passengerName != ticket.getPassengerName()) {
			errorString = "Details don’t match, you will be returned to the CONFIRMATION menu";
		} 
		return errorString;
	}
	
	//////////// validate passenger name
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
				Integer.parseInt(ticketNumber);
			} catch (NumberFormatException e) {
				valid = false;
			}
		} else {
			valid = false;
		}
		return valid;
	}
	
	public ArrayList<Double> calcNetPrice(ArrayList<FoodItem> items, ArrayList<Integer> quantity) {
		ArrayList<Double> netPrices = new ArrayList<Double>();
		double netPrice = 0;
		for (int i = 0; i < 12; i++) {
			netPrice = (items.get(i)).getPrice();
			netPrices.add(netPrice);
		}
		return netPrices;
	}
	
	public double calcTotalCost(ArrayList<Double> netPrices) {
		double total = 0;
		for (int i = 0; i<netPrices.size(); i++) {
			total += netPrices.get(i);
		}
		return total;
	}
	
	public void checkForRestock() {
		for (int i = 0; i < 12; i++) {
			int stockLevel = data.itemsAvailable.get(i).getStockLevel();
			if (stockLevel == 0) {
				restock(data.itemsAvailable.get(i));
			}
		}
	}
	
	public void restock(FoodItem item) {
		LocalTime currentTime = java.time.LocalTime.now();
		LocalTime restockTime = item.getTimePrompt();
		if (currentTime.compareTo(restockTime) >= 0) {
			item.setStockLevel(100);
			item.markInStock();
		}
	}
	
	public void addCostToTicket(Ticket ticket, double totalCost) {
		double foodCost = ticket.getFoodCost();
		foodCost += totalCost;
		ticket.setFoodCost(foodCost);
	}
	

	

	
}
