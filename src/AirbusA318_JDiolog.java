import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.border.EmptyBorder;

public class AirbusA318_JDiolog extends JDialog {

	private JPanel contentPanel = new JPanel();
	public JToggleButton[] seatNumber;
	SeatingPlanDesign seatingPlan;
	public JLabel airbusA318Label;


	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		try {
			AirbusA318_JDiolog dialog = new AirbusA318_JDiolog("3");
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 * @param title 
	 */
	public AirbusA318_JDiolog(String selectedTicketNum, String title) {
		
		setBounds(100, 100, 450, 600);
		contentPanel = new JPanel();
		getContentPane().setBackground(new Color(255, 255, 255));
		setContentPane(getContentPane());
		getContentPane().setLayout(null);
		
		JLabel airbusA318Label = new JLabel(title);
		airbusA318Label.setFont(new Font("Tahoma", Font.BOLD, 12));
		airbusA318Label.setForeground(new Color(0, 0, 255));
		airbusA318Label.setBounds(22, 30, 220, 28);
		getContentPane().add(airbusA318Label);
		
		
		JLabel businessClassLabel = new JLabel("Business Class");
		businessClassLabel.setForeground(Color.BLUE);
		businessClassLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		businessClassLabel.setBounds(22, 122, 86, 28);
		getContentPane().add(businessClassLabel);
		
		JLabel economyClassLabel = new JLabel("Economy Class");
		economyClassLabel.setForeground(Color.BLUE);
		economyClassLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		economyClassLabel.setBounds(22, 241, 86, 28);
		getContentPane().add(economyClassLabel);
		
		JToggleButton[] seatNumber = new JToggleButton[58];
		String[] Label= {"1A","2A","3A","4A","5A","1B","2B","3B","4B","5B",//Business
				
				"6A","7A","8A","9A","10A","11A","12A","13A",//Economy
				"6B","7B","8B","9B","10B","11B","12B","13B",
				"6C","7C","8C","9C","10C","11C","12C","13C",
				"6D","7D","8D","9D","10D","11D","12D","13D",
				"6E","7E","8E","9E","10E","11E","12E","13E",
				"6F","7F","8F","9F","10F","11F","12F","13F"};
		
		int yCounter =106;
		int yCounter2 =106;
		int yCounter3 =280;
		int yCounter4 =280;
		int yCounter5 =280;
		int yCounter6 =280;
		int yCounter7 =280;
		int yCounter8 =280;
		
		
		ActionListener listener = new ActionListener() {

	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	
	        	for (int i=0;i<seatNumber.length;i++) {
	        		
//	        		SeatingPlan seatingP = new SeatingPlan(null, null);
//	        	    if(seatingP.isSeatNumberAvailable(seatNumber[i].getText())==false) {
//	        	    	// check if seat avialb,e if not, seatbutton[i].setenabled = false
//	        	    }
//	        		
	        		
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
	   

	    
	    
	//Business Class
		for(int i=0;i<5;i++) { 
			seatNumber[i]= new JToggleButton(Label[i]);
			seatNumber[i].setBackground(new Color(126, 192, 236));
			seatNumber[i].setForeground(new Color(255, 255, 255));
			seatNumber[i].setFont(new Font("Tahoma", Font.PLAIN, 9));
			seatNumber[i].setBounds(139,yCounter+=20, 51, 21);
			seatNumber[i].addActionListener(listener);
			getContentPane().add(seatNumber[i]);
		}
		
			for(int i=5;i<10;i++) {
				seatNumber[i]= new JToggleButton(Label[i]);
				seatNumber[i].setBackground(new Color(126, 192, 236));
				seatNumber[i].setForeground(new Color(255, 255, 255));
				seatNumber[i].setFont(new Font("Tahoma", Font.PLAIN, 9));
				seatNumber[i].setBounds(234,yCounter2+=20, 51, 21);
				seatNumber[i].addActionListener(listener);
				getContentPane().add(seatNumber[i]);
			}
			
		//Economy Class
			
			for(int i=10;i<18;i++) {
				seatNumber[i]= new JToggleButton(Label[i]);
				seatNumber[i].setBackground(new Color(126, 192, 236));
				seatNumber[i].setForeground(new Color(255, 255, 255));
				seatNumber[i].setFont(new Font("Tahoma", Font.PLAIN, 9));
				seatNumber[i].setBounds(50,yCounter3+=20, 51, 21);
				seatNumber[i].addActionListener(listener);
				getContentPane().add(seatNumber[i]);
			}
			
			for(int i=18;i<26;i++) {
				seatNumber[i]= new JToggleButton(Label[i]);
				seatNumber[i].setBackground(new Color(126, 192, 236));
				seatNumber[i].setForeground(new Color(255, 255, 255));
				seatNumber[i].setFont(new Font("Tahoma", Font.PLAIN, 9));
				seatNumber[i].setBounds(101,yCounter4+=20, 51, 21);
				seatNumber[i].addActionListener(listener);
				getContentPane().add(seatNumber[i]);
			}
			
			for(int i=26;i<34;i++) {
				seatNumber[i]= new JToggleButton(Label[i]);
				seatNumber[i].setBackground(new Color(126, 192, 236));
				seatNumber[i].setForeground(new Color(255, 255, 255));
				seatNumber[i].setFont(new Font("Tahoma", Font.PLAIN, 9));
				seatNumber[i].setBounds(152,yCounter5+=20, 51, 21);
				seatNumber[i].addActionListener(listener);
				getContentPane().add(seatNumber[i]);
			}
			
			for(int i=34;i<42;i++) {
				seatNumber[i]= new JToggleButton(Label[i]);
				seatNumber[i].setBackground(new Color(126, 192, 236));
				seatNumber[i].setForeground(new Color(255, 255, 255));
				seatNumber[i].setFont(new Font("Tahoma", Font.PLAIN, 9));
				seatNumber[i].setBounds(230,yCounter6+=20, 51, 21);
				seatNumber[i].addActionListener(listener);
				getContentPane().add(seatNumber[i]);
			}
			
			for(int i=42;i<50;i++) {
				seatNumber[i]= new JToggleButton(Label[i]);
				seatNumber[i].setBackground(new Color(126, 192, 236));
				seatNumber[i].setForeground(new Color(255, 255, 255));
				seatNumber[i].setFont(new Font("Tahoma", Font.PLAIN, 9));
				seatNumber[i].setBounds(281,yCounter7+=20, 51, 21);
				seatNumber[i].addActionListener(listener);
				getContentPane().add(seatNumber[i]);
			}
			
			for(int i=50;i<58;i++) {
				
				seatNumber[i]= new JToggleButton(Label[i]);
				seatNumber[i].setBackground(new Color(126, 192, 236));
				seatNumber[i].setForeground(new Color(255, 255, 255));
				seatNumber[i].setFont(new Font("Tahoma", Font.PLAIN, 9));
				seatNumber[i].setBounds(332,yCounter8+=20, 51, 21);
				seatNumber[i].addActionListener(listener);
				getContentPane().add(seatNumber[i]);
			}
			
			
			ActionListener listener2 = new ActionListener() {
				
		        @Override
		        public void actionPerformed(ActionEvent e) {
		        	ArrayList<String> seatsSelected = new ArrayList<String>();
		        	int count=0;
		        	Popup Pop = new Popup();

		        	
		        	for (int i =0; i < seatNumber.length; i++ ) {
		        		
		        		
		        		if(seatNumber[i].isSelected())
		        		{
		        			count++;
		        		}
		        	}
		        		
		        		if (count != Integer.parseInt(selectedTicketNum)) { //I Have to change this to the value of the combobox. 
		        			Pop.showErrorMessage("You have to select the same number of tickets");
		        		}
		        		
		        		else {

		        			for (int i =0; i < seatNumber.length; i++ ) {
		        				if(seatNumber[i].isSelected()) {
		        			
		        				seatsSelected.add(seatNumber[i].getText());
		        				seatNumber[i].setEnabled(false);
		        				SeatingPlanDesign p = new SeatingPlanDesign(seatsSelected, null, null, null, null, null);
		        				p.setVisible(true);
				        		setVisible(false);
				        		
		        					
		        			}
		        		}
		        	}
			        	
		        }
						
					
		         
		    };
		    
		    JButton btnBook = new JButton("Book Seats");
			btnBook.setFont(new Font("Tahoma", Font.BOLD, 11));
			btnBook.setBounds(155, 500, 107, 36);
			btnBook.setBackground(new Color(0, 0, 128));
			btnBook.setForeground(new Color(255, 255, 255));
			btnBook.addActionListener(listener2);
			getContentPane().add(btnBook);

	
			}
	

	protected String getText() {
		
		return null;
	}
			
}