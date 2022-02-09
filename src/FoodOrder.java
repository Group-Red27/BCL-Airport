import java.time.LocalTime;
import java.util.ArrayList;

import javax.swing.JTextField;

public class FoodOrder {
	Ticket ticket; 
	Data data;
	int[] quantity;
	boolean[] itemsSelected;
	double[] netPrices;
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
		String[] quantity = new String[12];
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
			// if to check if quantities are valid and not all 0s
			boolean[] selected = {false,false,false,false,false,false,false,false,false,false,false,false};
			int[] quantityInt = convertQuantityToInt(quantity);
			for (int i = 0; i < 12; i++) {
				if (quantityInt[i] > 0) {
					// if to check if item selected
					selected[i] = true;
					int stockLevel = data.itemsAvailable.get(i).getStockLevel();
					if (quantityInt[i] > stockLevel) {
						// if statement to adjust selected according to stock level
						quantityInt[i] = stockLevel;
						amended[i] = true;
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
	public void confirmOrder(JTextField ticketEntry, JTextField nameEntry, int[] quantityInt, double totalCost) {
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
				int newStock = currentStock - quantity[i];
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
	public boolean validateQuantity(String[] quantity) {
		boolean valid = true;
		int count = 0;
		try {
			for (int i = 0; i<12; i++) {
				
				int value = Integer.parseInt(quantity[i]);
				if (value > 100 || value < 0) {
					valid = false;
				} else if (value > 0) {
					count += 1;
				}
			}
			if (count == 0) {
				valid = false;
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
			intQuantity[i] = Integer.parseInt(quantity[i]);
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
	
	public double[] calcNetPrice(ArrayList<FoodItem> items, int[] quantity) {
		double[] netPrices = new double[12];
		for (int i = 0; i < 12; i++) {
			double netPrice = 0;
			netPrice = (items.get(i)).getPrice() * quantity[i];
			netPrices[i] = netPrice;
		}
		return netPrices;
	}
	
	public double calcTotalCost(double[] netPrices) {
		double total = 0;
		for (int i = 0; i<12; i++) {
			total += netPrices[i];
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
