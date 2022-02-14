import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Handling implements ActionListener{
	
	Flightclass flight = Flightclass.getFlightInstance();
	boolean clicked = false;
			
		    public void actionPerformed(ActionEvent e){
		    	
		    	if(! clicked) {
		    	((JButton) e.getSource()).setBackground(Color.LIGHT_GRAY);
		    	clicked =true;
		    }
		    	else {
			    ((JButton) e.getSource()).setBackground(new Color(126, 192, 236));
		    	clicked =false;

		    	}
		}
		    
			public void Duration () {
				if(flight.flightduration<=120) {
						AirbusA318_JDiolog A = new AirbusA318_JDiolog();
						A.setVisible(true);
				
				}
				else {
					Boeing747 B = new Boeing747();
					B.setVisible(true);

				}
			}
				
}