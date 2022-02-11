import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Handling implements ActionListener{
			
		    public void actionPerformed(ActionEvent e){
		    	
		    	((JButton) e.getSource()).setBackground(Color.LIGHT_GRAY);
		    }
		}