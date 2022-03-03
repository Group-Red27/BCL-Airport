import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.Popup;
import javax.swing.SwingConstants;

public class Boeing747_JDiolog extends JDialog {

	private JPanel contentPanel = new JPanel();
	public JButton[] seatNumber;
	SeatingPlanDesign seatingPlan;
	public JLabel boeing747Label;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			Boeing747_JDiolog dialog = new Boeing747_JDiolog();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 * @param title 
	 */
	public Boeing747_JDiolog(String selectedTicketNum, String title) {
		setBounds(100, 100, 481, 736);
		contentPanel = new JPanel();
		getContentPane().setBackground(new Color(255, 255, 255));
		setContentPane(getContentPane());
		getContentPane().setLayout(null);
		
		JLabel boeing747Label = new JLabel(title);
		boeing747Label.setBounds(21, 22, 207, 28);
		boeing747Label.setForeground(new Color(0, 0, 255));
		boeing747Label.setFont(new Font("Tahoma", Font.BOLD, 12));
		getContentPane().add(boeing747Label);
		
		
		JLabel firstClassLabel = new JLabel("First Class");
		firstClassLabel.setHorizontalAlignment(SwingConstants.CENTER);
		firstClassLabel.setBounds(21, 130, 86, 28);
		firstClassLabel.setForeground(Color.BLUE);
		firstClassLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		getContentPane().add(firstClassLabel);
		
		JLabel businessClassLabel = new JLabel("Business Class");
		businessClassLabel.setHorizontalAlignment(SwingConstants.CENTER);
		businessClassLabel.setBounds(21, 260, 86, 28);
		businessClassLabel.setForeground(Color.BLUE);
		businessClassLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		getContentPane().add(businessClassLabel);
		
		JLabel economyClassLabel = new JLabel("Business Class");
		economyClassLabel.setHorizontalAlignment(SwingConstants.CENTER);
		economyClassLabel.setBounds(21, 410, 86, 28);
		economyClassLabel.setForeground(Color.BLUE);
		economyClassLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		getContentPane().add(economyClassLabel);
		
		//Buttons
		
		JToggleButton[] seatNumber = new JToggleButton[84];
				
		String[] Label= {"1A","2A","3A","4A","5A","1B","2B","3B","4B","5B", //First Class
		
									"6A","7A","8A","9A","10A", //Business Class
									"6B","7B","8B","9B","10B",
								    "6C","7C","8C","9C","10C",
									"6D","7D","8D","9D","10D",
		
								"11A","12A","13A","14A","15A","16A","17A","18A","19A", //Economy class
								"11B","12B","13B","14B","15B","16B","17B","18B","19B",
								"11C","12C","13C","14C","15C","16C","17C","18C","19C",
								"11D","12D","13D","14D","15D","16D","17D","18D","19D",
								"11E","12E","13E","14E","15E","16E","17E","18E","19E",
								"11F","12F","13F","14F","15F","16F","17F","18F","19F"};
		
		int yCounter =106,yCounter2 =106;
	
		int yCounter3 =280,yCounter4 =280,yCounter5 =280,yCounter6 =280;
		
		int yCounter7 =420,yCounter8 =420, yCounter9 =420, yCounter10 =420, yCounter11 =420,yCounter12 =420;


		ActionListener listener = new ActionListener() {

	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	
	        	for (int i=0;i<seatNumber.length;i++) {
	        		
	        		SeatingPlan seatingP = new SeatingPlan(null, null);

	        		if(seatingP.seatAvailability[i]==false) {
	        			seatNumber[i].setEnabled(false);
	        		}
	        		
	        		else
	        		{
	        			seatNumber[i].setEnabled(true);
	        			
	        		}	
	        		
	        		if(seatNumber[i].isSelected()) {
	        			seatNumber[i].setContentAreaFilled(false);
	        			seatNumber[i].setOpaque(true);
	        			seatNumber[i].setBackground(Color.LIGHT_GRAY);
	        			
				    }
	        		
	        		else {
	        			seatNumber[i].setContentAreaFilled(false);
	        			seatNumber[i].setOpaque(true);
	        			seatNumber[i].setBackground(new Color(126, 192, 236)); 
	        			
	        		}
				    	
	        	}
	        	
	        }
	    };

		

	//First Class
		for(int i=0;i<5;i++) { //For loop for array of JButton [0] to [4]
			seatNumber[i]= new JToggleButton(Label[i]);
			seatNumber[i].setBackground(new Color(126, 192, 236));
			seatNumber[i].setForeground(new Color(255, 255, 255));
			seatNumber[i].setFont(new Font("Tahoma", Font.PLAIN, 9));
			seatNumber[i].setBounds(139,yCounter+=20, 51, 21);
			seatNumber[i].addActionListener(listener);
			getContentPane().add(seatNumber[i]);
		}
		
			for(int i=5;i<10;i++) {//For loop for array of JButton [4] to [9]
				seatNumber[i]= new JToggleButton(Label[i]);
				seatNumber[i].setBackground(new Color(126, 192, 236));
				seatNumber[i].setForeground(new Color(255, 255, 255));
				seatNumber[i].setFont(new Font("Tahoma", Font.PLAIN, 9));
				seatNumber[i].setBounds(234,yCounter2+=20, 51, 21);
				seatNumber[i].addActionListener(listener);
				getContentPane().add(seatNumber[i]);
			}
			
		//Business Class
			
		for(int i=10;i<15;i++) {//For loop for array of JButton [0] to [5]
				seatNumber[i]= new JToggleButton(Label[i]);
				seatNumber[i].setBackground(new Color(126, 192, 236));
				seatNumber[i].setForeground(new Color(255, 255, 255));
				seatNumber[i].setFont(new Font("Tahoma", Font.PLAIN, 9));
				seatNumber[i].setBounds(110,yCounter3+=20, 51, 21);
				seatNumber[i].addActionListener(listener);
				getContentPane().add(seatNumber[i]);
			}
			
			for(int i=15;i<20;i++) {//For loop for array of JButton [8] to [16]
				seatNumber[i]= new JToggleButton(Label[i]);
				seatNumber[i].setBackground(new Color(126, 192, 236));
				seatNumber[i].setForeground(new Color(255, 255, 255));
				seatNumber[i].setFont(new Font("Tahoma", Font.PLAIN, 9));
				seatNumber[i].setBounds(170,yCounter4+=20, 51, 21);
				seatNumber[i].addActionListener(listener);
				getContentPane().add(seatNumber[i]);
			}
			
			for(int i=20;i<25;i++) {//For loop for array of JButton [16] to [24]
				seatNumber[i]= new JToggleButton(Label[i]);
				seatNumber[i].setBackground(new Color(126, 192, 236));
				seatNumber[i].setForeground(new Color(255, 255, 255));
				seatNumber[i].setFont(new Font("Tahoma", Font.PLAIN, 9));
				seatNumber[i].setBounds(230,yCounter5+=20, 51, 21);
				seatNumber[i].addActionListener(listener);
				getContentPane().add(seatNumber[i]);
			}
			
			for(int i=25;i<30;i++) {//For loop for array of JButton [24] to [32]
				seatNumber[i]= new JToggleButton(Label[i]);
				seatNumber[i].setBackground(new Color(126, 192, 236));
				seatNumber[i].setForeground(new Color(255, 255, 255));
				seatNumber[i].setFont(new Font("Tahoma", Font.PLAIN, 9));
				seatNumber[i].setBounds(290,yCounter6+=20, 51, 21);
				seatNumber[i].addActionListener(listener);
				getContentPane().add(seatNumber[i]);
			}
			
			//Economy class
			for(int i=30;i<39;i++) {
				seatNumber[i]= new JToggleButton(Label[i]);
				seatNumber[i].setBackground(new Color(126, 192, 236));
				seatNumber[i].setForeground(new Color(255, 255, 255));
				seatNumber[i].setFont(new Font("Tahoma", Font.PLAIN, 9));
				seatNumber[i].setBounds(80,yCounter7+=20, 51, 21);
				seatNumber[i].addActionListener(listener);
				getContentPane().add(seatNumber[i]);
			}
			
			for(int i=39;i<48;i++) {
				seatNumber[i]= new JToggleButton(Label[i]);
				seatNumber[i].setBackground(new Color(126, 192, 236));
				seatNumber[i].setForeground(new Color(255, 255, 255));
				seatNumber[i].setFont(new Font("Tahoma", Font.PLAIN, 9));
				seatNumber[i].setBounds(131,yCounter8+=20, 51, 21);
				seatNumber[i].addActionListener(listener);
				getContentPane().add(seatNumber[i]);
			}
		
			for(int i=48;i<57;i++) {
				seatNumber[i]= new JToggleButton(Label[i]);
				seatNumber[i].setBackground(new Color(126, 192, 236));
				seatNumber[i].setForeground(new Color(255, 255, 255));
				seatNumber[i].setFont(new Font("Tahoma", Font.PLAIN, 9));
				seatNumber[i].setBounds(182,yCounter9+=20, 51, 21);
				seatNumber[i].addActionListener(listener);
				getContentPane().add(seatNumber[i]);
			}
			
			for(int i=57;i<66;i++) {
				seatNumber[i]= new JToggleButton(Label[i]);
				seatNumber[i].setBackground(new Color(126, 192, 236));
				seatNumber[i].setForeground(new Color(255, 255, 255));
				seatNumber[i].setFont(new Font("Tahoma", Font.PLAIN, 9));
				seatNumber[i].setBounds(254,yCounter10+=20, 51, 21);
				seatNumber[i].addActionListener(listener);
				getContentPane().add(seatNumber[i]);
			}
			
			for(int i=66;i<75;i++) {
				seatNumber[i]= new JToggleButton(Label[i]);
				seatNumber[i].setBackground(new Color(126, 192, 236));
				seatNumber[i].setForeground(new Color(255, 255, 255));
				seatNumber[i].setFont(new Font("Tahoma", Font.PLAIN, 9));
				seatNumber[i].setBounds(305,yCounter11+=20, 51, 21);
				seatNumber[i].addActionListener(listener);
				getContentPane().add(seatNumber[i]);
			}
			
			for(int i=75;i<84;i++) {
				seatNumber[i]= new JToggleButton(Label[i]);
				seatNumber[i].setBackground(new Color(126, 192, 236));
				seatNumber[i].setForeground(new Color(255, 255, 255));
				seatNumber[i].setFont(new Font("Tahoma", Font.PLAIN, 9));
				seatNumber[i].setBounds(356,yCounter12+=20, 51, 21);
				seatNumber[i].addActionListener(listener);
				getContentPane().add(seatNumber[i]);
			}
			
			ActionListener listener2 = new ActionListener() 
			{
				
		        @Override
		        public void actionPerformed(ActionEvent e) 
		        {
		        	ArrayList<String> departSeatsSelected = new ArrayList<String>();
		        	ArrayList<String> returnSeatsSelected = new ArrayList<String>();

		        	int count=0;
		        	pop_plane popup = new pop_plane();
    				SeatingPlanDesign p = new SeatingPlanDesign(departSeatsSelected, returnSeatsSelected, null, null, null,null);
		        	
    				for (int i =0; i < seatNumber.length; i++ ) 
    				{
		        		
		        		
		        		if(seatNumber[i].isSelected())
		        		{
		        			count++;
		        		}
		        	}
		        		
		        		if (count != Integer.parseInt(selectedTicketNum)) 
		        		{  
		        			popup.showErrorMessage("You have to select the same number of tickets");
		        		}
		        		
		        		else 
		        		{

		        			for (int i =0; i < seatNumber.length; i++ ) 
		        			{
		        				if(seatNumber[i].isSelected()) 
		        				{

		        							departSeatsSelected.add(seatNumber[i].getText());
		    		        				seatNumber[i].setEnabled(false);
		    		        				SeatingPlanDesign b = new SeatingPlanDesign(departSeatsSelected, null, null, null, null, null);
		    		        				b.setVisible(true);
		    				        		setVisible(false);
		        						}
		        					}
		        		
		        			}
		        		}
		    };
			
			JButton btnBook = new JButton("Book Seats");
			btnBook.setFont(new Font("Tahoma", Font.BOLD, 11));
			btnBook.setBounds(183, 650, 107, 36);
			btnBook.setBackground(new Color(0, 0, 128));
			btnBook.setForeground(new Color(255, 255, 255));
			btnBook.addActionListener(listener2);
			getContentPane().add(btnBook);
			
	}


	
}


