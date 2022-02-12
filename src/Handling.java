import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Handling implements ActionListener{
	
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
}