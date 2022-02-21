
public class SeatingPlan {

	     Flightclass flight = Flightclass.getinstance();
	     private int numOfTickets;
		 public String planeType;
		 private String[] seatNumber;
		 private String[] selectedSeats;
		 private boolean[] seatAvailability;
		 private String[][] seatClass;
		 AirbusA318 airbus = AirbusA318.getinstance();
		 Boeing747 boeing = Boeing747.getinstance();

		 public SeatingPlan(String planeType) {
			 this.planeType = planeType;
			 if (this.planeType=="airbus")
				{
				
					this.seatClass = new String[][] {{"Business class","Economy"}, 
											  {"1A","30B"}, 
											  {"2B",""},};
				}
				else
				{
					this.seatClass= new String[][] {{"First Class", "Business Class","Economy"}};
				}
		}		
		 
		 public String[] getSelectedSeats() {
			return selectedSeats;
		}

		public void setSelectedSeats(String[] selectedSeats) {
			this.selectedSeats = selectedSeats;
		}

		 
		
		
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
		
		public int Index(String selectedSeats,String[] seatNumber ) //Index for Selected seats and seatNumber. 
		{
			int index=0;
			for(int i=0;i<=seatNumber.length;i++)
			{
				if(seatNumber[i]==selectedSeats)
					index=i;
				
			}
			return index;
		}
		
		
//		public boolean selectSeats(String selectedSeats)
//		{
//			for(int i=0;i<=selectedSeats.length();i++)
//			{
//				Index = getIndex(seatNumber,selectedSeats[i]);
//				
//			}
//		}
		
		public String getSeatClass(String seatNumber) throws Exception {
			
			String seatNumberClass = null; 
			for (int i=0;i<this.seatClass.length;i++)
			{
				for(int j=0;j<this.seatClass[i].length;j++)
				{
					if (seatNumber == seatClass[i][j])
					{
						seatNumberClass = seatClass[0][j];
					}
					
				}
				}
			
			if (seatNumberClass==null) {
				throw new Exception("The seat is not found!");
			}
			
			return seatNumberClass; 
			
		}
		
			
}
		

	

