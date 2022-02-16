import java.time.LocalTime;    


public class Fooditem {
	String itemName;
	String description;
	int stockLevel;
	double price;
	LocalTime timePrompt = null;
	
	 public Fooditem(String newItemName, String newDescription, int newStock, double newPrice) {
			// TODO Auto-generated constructor stub
			 setItemName(newItemName);
			 setDescription(newDescription);
			 setPrice(newPrice);
			 setStockLevel(newStock);
			 
	 }
		 
	 public void setItemName(String newItemName) {
		 this.itemName = newItemName;
	 }
		 
	 public void setDescription(String newDescription) {
		 this.description = newDescription;
	 }
		 
	 public void setPrice(double newPrice) {
		 this.price = newPrice;
	 }
	
	 public void setStockLevel(int newStockLevel) {
		this.stockLevel = newStockLevel;
	 }
	 
	 public int getStockLevel() {
		 return this.stockLevel;
	 }
	 
	 public String getItemName() {
		 return this.itemName;
	 }
	 
	 public String getDescription() {
		 return this.description;
	 }
	 
	 public double getPrice() {
		 return this.price;
	 }
	 
	 public LocalTime getTimePrompt() {
		 return this.timePrompt;
	 }
	 
	 public void setTimePrompt() {
		 LocalTime currentTime = java.time.LocalTime.now(); 
		 LocalTime newTime = currentTime.plusMinutes(3);
		 this.timePrompt = newTime;
	
	 }
 
}