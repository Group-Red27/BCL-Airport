
public class SeatingPlan {

	     Flightclass flight = Flightclass.getinstance();
		 int numOfTickets;
		 String planeType;
		 String[] seatNumber;
		 String[] selectedSeats;
		 AirbusA318 airbus = AirbusA318.getinstance();
		 Boeing747 boeing = Boeing747.getinstance();

		 
		 public String[] getSelectedSeats() {
			return selectedSeats;
		}

		public void setSelectedSeats(String[] selectedSeats) {
			this.selectedSeats = selectedSeats;
		}

		boolean[] seatAvailability;
		 String[][] seatClass;
		 
		
		
		public int getNumOfTickets() {
			return numOfTickets;
		}
		
		public void setNumOfTickets(int numOfTickets) {
			this.numOfTickets = numOfTickets;
		}
		
		public String getPlaneType() {
			return planeType;
		}
		
		public void setPlaneType(String planeType) {
			this.planeType = planeType;
		}
		
		public String[] getSeatNumber() {
			return seatNumber;
		}
		
		public void setSeatNumber(String[] seatNumber) {
			this.seatNumber = seatNumber;
		}
		public boolean[] getSeatAvailability() {
			return seatAvailability;
		}
		
		public void setSeatAvailability(boolean[] seatAvailability) {
			this.seatAvailability = seatAvailability;
		}
		
		public String[][] getSeatClass() {
			return seatClass;
		}
		
		public void setSeatClass(String[][] seatClass) {
			this.seatClass = seatClass;
		}
		
		
		//PlaneType
		public boolean planeSeatingPlan() {//Which one it displays, either airbus or boeing. 
			
			boolean valid=true;
			if(flight.getFlightduration()<=120)
			{
				valid=true;//frame change to airbus
				
				
			}
			if(flight.getFlightduration()>120)
			{
				valid=false;//frame change to boeing
			}
			
			return valid;
		}
		
		
		public boolean numberOfSeats() { //validate number of seats compared to number of ticktes.
			
			boolean valid;
			
		if (seatNumber.length!=numOfTickets)
		{
			valid=false;
		}
		else
		{
			valid=true; 
		}
		return valid;
}
		
		public void Index() //Index for Selected seats and seatNumber. 
		{
			int index=0;
			for(int i=0;i<=seatNumber.length;i++)
			{
				if(selectedSeats[i]==seatNumber[i])
				{
					index=i;
				}
			}
			
		}
		
		public static void selectSeats()
		{
			for(int i=0;i<=selectedSeats;i++)
			{
				
			}
		}
}
		

	

