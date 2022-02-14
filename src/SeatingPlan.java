import java.io.File;
import java.util.Scanner;

public class SeatingPlan {

		 Flightclass flight=new Flightclass();
		 int numOfTickets;
		 String planeType;
		 String[] seatNumber;
		 String[] selectedSeats;
		 
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
		
		//Importing CSV file
		public void File() {
		String fileName= "Flights.csv";
		File file = new File(fileName);//reads file
		try {
			Scanner scanner=new Scanner(file);
		}
		
		}
		
		//PlaneType
		public boolean planeSeatingPlan() {
			
			boolean valid;
			if(flight.flightduration<=120)
			{
				valid=true; 
			}
			else
			{
				valid=false;
			}
			
			return valid;
		}
		
		//isNumberOfSeats
		public boolean numberOfTickets() {
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
		
		//Index
		
//		public void Index() {
//			int index=0;
//			
//			 for (int i=0; index<=seatNumber.length;i++)
//			 {
//				 if(selectedSeats=seatNumber[i])
//				 {
//					 index=i;
//				 }
//			 }
//			
//		}
		
		
}
		

	

