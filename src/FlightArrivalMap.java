import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JTextField;

public class FlightArrivalMap {
	
	public static void Timer1(refreshScreen) {
		Timer timer = new Timer();
		TimerTask update  = new TimerTask() {
			public void run() {
			}
			
		}; timer.scheduleAtFixedRate(refeshScreen, null, 0);
		 
	} 
	public static void Timer(delays) {
		Timer timer = new Timer();
		TimerTask delays = new TimerTask() {
			public void run() {
				
				
			}
		}; timer.scheduleAtFixedRate(delays, null, 0);
		 
	} 


}

