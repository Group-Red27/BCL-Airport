import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JTextField;

public class FlightArrivalMap { 
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void main(String[] args) { // refresh screen every 5 mins
		FlightArrivalMap_UI newScreen = new FlightArrivalMap_UI();
		newScreen.setVisible(true);
			public void run() {
				//screen.setVisible(false);
				
				// when 5 mins is up, this code runs, the old screen removed and a new screen created to 'refresh' it
			}
			
		}; timer.scheduleAtFixedRate(refreshScreen, null,300000);
	}
	Data data = Data.getInstance();
	ArrayList<Flightclass> flights = data.getFlights();{
	
	//String Arrival = flights.get(i).get
		
	for (int i = 0; i < flights.size(); i++) {
		
		int delay = flights.get(i).getDelay();
		flights.get(i).getDepartureairport();
		if (delay >= 30) { 
			flights.get(i).getArivalairport();
			flights.get(i).getArrivaltime();
			flights.get(i).getDelay();
			flights.get(i).getDepartureairport();
			flights.get(i).getDateofflight();
			
			
		}
			
		// display the flight in the box thingy
		// get the delay for flight[i] 
		// if the delay is ... then setText = red
		
		
	   }
	}
	
	public static void Timer(String delays) { // refresh delays
		Timer timer = new Timer();
		TimerTask delay = new TimerTask() {
			public void run() {
				
				
			}
		}; timer.scheduleAtFixedRate(delay, null, 0);
		 
    } 


}
