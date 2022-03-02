import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class SeatingPlan {

	     HardCodedFlightclass flight;
	     private int numOfTickets;
		 public String planeType;
		 private String[] seatNumber;
		 public String[] selectedSeats;
		 public boolean[] seatAvailability;
		 private String[][] seatClass;
		 HardCodedData data;
			
		


			
		 public SeatingPlan(String planeType, HardCodedFlightclass flight) { //constructor 
			 this.flight = flight;
			 this.planeType = planeType;
			 if (this.planeType=="AirbusA318")
				{
			this.seatAvailability = new boolean[]  {true,true,true,true,true,true,true,true,
													true,true,true,true,true,true,true,true,
													true,true,true,true,true,true,true,true,
													true,true,true,true,true,true,true,true,
													true,true,true,true,true,true,true,true,
													true,true,true,true,true,true,true,true,
													true,true,true,true,true,true,true,true,
													true,true,true,true,true,true,true,true};
				
					this.seatClass = new String[][] {{"Business class","Economy"}, //assigning seat to a class Airbus
											  					{"1A","6A"}, 
											  					{"2A","7A"},
											  					{"3A","8A"},
											  					{"4A","9A"},
											  					{"5A","10A"},
											  					{"1A","11A"},
											  					{"2A","12A"},
											  					{"3A","13A"},
											  					{"4A","6B"},
											  					{"5A","7B"},
											  					{null,"8B"},
											  					{null,"9B"},
											  					{null,"10B"},
											  					{null,"11B"},
											  					{null,"12B"},
											  					{null,"13B"},
											  					{null,"6C"},
											  					{null,"7C"},
											  					{null,"8C"},
											  					{null,"9C"},
											  					{null,"10C"},
											  					{null,"11C"},
											  					{null,"12C"},
											  					{null,"13C"},
											  					{null,"6D"},
											  					{null,"7D"},
											  					{null,"8D"},
											  					{null,"9D"},
											  					{null,"10D"},
											  					{null,"11D"},
											  					{null,"12D"},
											  					{null,"13D"},
											  					{null,"6E"},
											  					{null,"7E"},
											  					{null,"8E"},
											  					{null,"9E"},
											  					{null,"10E"},
											  					{null,"11E"},
											  					{null,"12E"},
											  					{null,"13E"},
											  					{null,"6F"},
											  					{null,"7F"},
											  					{null,"8F"},
											  					{null,"9F"},
											  					{null,"10F"},
											  					{null,"11F"},
											  					{null,"12"},
											  					{null,"13F"}};
				}
				else
				{
					this.seatAvailability = new boolean[]  {true,true,true,true,true,true,true,true,
															true,true,true,true,true,true,true,true,
															true,true,true,true,true,true,true,true,
															true,true,true,true,true,true,true,true,
															true,true,true,true,true,true,true,true,
															true,true,true,true,true,true,true,true,
															true,true,true,true,true,true,true,true,
															true,true,true,true,true,true,true,true,
															true,true,true,true,true,true,true,true,
															true,true,true,true,true,true,true,true,
															true,true,true,true};
					
					this.seatClass= new String[][] {{"First Class", "Business class","Economy"}, //assigning seat to a class Boeing
																	{"1A","6A","11A"},
																	{"2A","7A","12A"},
																	{"3A","8A","13A"},
																	{"4A","9A","14A"},
																	{"5A","10A","15A"},
																	{"1B","6B","16A"},
																	{"2B","7B","17A"},
																	{"3B","8B","18A"},
																	{"4B","9B","19A"},
																	{"5B","10B","11B"},
																	{null,"6C","12B"},
																	{null,"7C","13B"},
																	{null,"8C","14B"},
																	{null,"9C","15B"},
																	{null,"10C","16B"},
																	{null,"6D","17B"},
																	{null,"7D","18B"},
																	{null,"8D","19B"},
																	{null,"9D","11C"},
																	{null,"10D","12C"},
																	{null,null,"13C"},
																	{null,null,"14C"},
																	{null,null,"15C"},
																	{null,null,"16C"},
																	{null,null,"17C"},
																	{null,null,"18C"},
																	{null,null,"19C"},
																	{null,null,"11D"},
																	{null,null,"12D"},
																	{null,null,"13D"},
																	{null,null,"14D"},
																	{null,null,"15D"},
																	{null,null,"16D"},
																	{null,null,"17D"},
																	{null,null,"18D"},
																	{null,null,"19D"},
																	{null,null,"11E"},
																	{null,null,"12E"},
																	{null,null,"13E"},
																	{null,null,"14E"},
																	{null,null,"15E"},
																	{null,null,"16E"},
																	{null,null,"17E"},
																	{null,null,"18E"},
																	{null,null,"19E"},
																	{null,null,"11F"},
																	{null,null,"12F"},
																	{null,null,"13F"},
																	{null,null,"14F"},
																	{null,null,"15F"},
																	{null,null,"16F"},
																	{null,null,"17F"},
																	{null,null,"18F"},
																	{null,null,"19F"},
					}; 
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
		public boolean planeSeatingPlan(HardCodedFlightclass flight) {//Which one it displays, either airbus or boeing. 
		
			
			 String time = flight.getFlightduration().split(":")[0];
			 Integer hour = Integer.parseInt(time);
			 
			
			boolean valid=true;
			
			
			if(hour>2)
			{
				
				valid=true;//frame change to boeing
				planeType="Boeing747";
				
				
			}
			else
			{
				valid=false;//frame change to airbus
				planeType="AirbusA318";

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
		
		public int getIndex(String selectedSeats,String[] seatNumber ) //Index for Selected seats and seatNumber. 
		{
			int index=0;
			for(int i=0;i<=seatNumber.length;i++)
			{
				if(seatNumber[i]==selectedSeats)
					index=i;
				
			}
			return index;
		}
		
		
		public void selectSeats() //Checks selected seats
		{
			for(int i=0;i<=selectedSeats.length;i++)
			{
				int Index = getIndex(selectedSeats[i],seatNumber);
				seatAvailability[Index]=true;
			}
		}
		
		
		public boolean isSeatNumberAvailable(String[] seatNumber) //Check if seatNumber is available. 
		{
			boolean valid=true;
			
			for (int i=0;i<=selectedSeats.length;i++)
			{
				int Index = getIndex(selectedSeats[i],seatNumber);
					if(seatAvailability[Index]=false)
					{
						valid=false;
					}
			}
			return valid;
		}
		

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
		

	