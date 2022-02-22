import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class AirbusA318 extends JFrame {

	//SeatingPlanDesign p;
	private JPanel contentPane;
	public JToggleButton[] seatNumber;
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AirbusA318 frame = new AirbusA318();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AirbusA318() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 128), 6));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel airbusA318Label = new JLabel("Departure/Return: Airbus A318");
		airbusA318Label.setFont(new Font("Tahoma", Font.BOLD, 12));
		airbusA318Label.setForeground(new Color(0, 0, 255));
		airbusA318Label.setBounds(22, 30, 220, 28);
		contentPane.add(airbusA318Label);
		
		
		JLabel businessClassLabel = new JLabel("Business Class");
		businessClassLabel.setForeground(Color.BLUE);
		businessClassLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		businessClassLabel.setBounds(22, 122, 86, 28);
		contentPane.add(businessClassLabel);
		
		JLabel economyClassLabel = new JLabel("Economy Class");
		economyClassLabel.setForeground(Color.BLUE);
		economyClassLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		economyClassLabel.setBounds(22, 241, 86, 28);
		contentPane.add(economyClassLabel);
		
		
		
		//Button Array
		
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
			contentPane.add(seatNumber[i]);
		}
		
			for(int i=5;i<10;i++) {
				seatNumber[i]= new JToggleButton(Label[i]);
				seatNumber[i].setBackground(new Color(126, 192, 236));
				seatNumber[i].setForeground(new Color(255, 255, 255));
				seatNumber[i].setFont(new Font("Tahoma", Font.PLAIN, 9));
				seatNumber[i].setBounds(234,yCounter2+=20, 51, 21);
				seatNumber[i].addActionListener(listener);
				contentPane.add(seatNumber[i]);
			}
			
		//Economy Class
			
			for(int i=10;i<18;i++) {
				seatNumber[i]= new JToggleButton(Label[i]);
				seatNumber[i].setBackground(new Color(126, 192, 236));
				seatNumber[i].setForeground(new Color(255, 255, 255));
				seatNumber[i].setFont(new Font("Tahoma", Font.PLAIN, 9));
				seatNumber[i].setBounds(50,yCounter3+=20, 51, 21);
				seatNumber[i].addActionListener(listener);
				contentPane.add(seatNumber[i]);
			}
			
			for(int i=18;i<26;i++) {
				seatNumber[i]= new JToggleButton(Label[i]);
				seatNumber[i].setBackground(new Color(126, 192, 236));
				seatNumber[i].setForeground(new Color(255, 255, 255));
				seatNumber[i].setFont(new Font("Tahoma", Font.PLAIN, 9));
				seatNumber[i].setBounds(101,yCounter4+=20, 51, 21);
				seatNumber[i].addActionListener(listener);
				contentPane.add(seatNumber[i]);
			}
			
			for(int i=26;i<34;i++) {
				seatNumber[i]= new JToggleButton(Label[i]);
				seatNumber[i].setBackground(new Color(126, 192, 236));
				seatNumber[i].setForeground(new Color(255, 255, 255));
				seatNumber[i].setFont(new Font("Tahoma", Font.PLAIN, 9));
				seatNumber[i].setBounds(152,yCounter5+=20, 51, 21);
				seatNumber[i].addActionListener(listener);
				contentPane.add(seatNumber[i]);
			}
			
			for(int i=34;i<42;i++) {
				seatNumber[i]= new JToggleButton(Label[i]);
				seatNumber[i].setBackground(new Color(126, 192, 236));
				seatNumber[i].setForeground(new Color(255, 255, 255));
				seatNumber[i].setFont(new Font("Tahoma", Font.PLAIN, 9));
				seatNumber[i].setBounds(230,yCounter6+=20, 51, 21);
				seatNumber[i].addActionListener(listener);
				contentPane.add(seatNumber[i]);
			}
			
			for(int i=42;i<50;i++) {
				seatNumber[i]= new JToggleButton(Label[i]);
				seatNumber[i].setBackground(new Color(126, 192, 236));
				seatNumber[i].setForeground(new Color(255, 255, 255));
				seatNumber[i].setFont(new Font("Tahoma", Font.PLAIN, 9));
				seatNumber[i].setBounds(281,yCounter7+=20, 51, 21);
				seatNumber[i].addActionListener(listener);
				contentPane.add(seatNumber[i]);
			}
			
			for(int i=50;i<58;i++) {
				
				seatNumber[i]= new JToggleButton(Label[i]);
				seatNumber[i].setBackground(new Color(126, 192, 236));
				seatNumber[i].setForeground(new Color(255, 255, 255));
				seatNumber[i].setFont(new Font("Tahoma", Font.PLAIN, 9));
				seatNumber[i].setBounds(332,yCounter8+=20, 51, 21);
				seatNumber[i].addActionListener(listener);
				contentPane.add(seatNumber[i]);
			}
			
			
			ActionListener listener2 = new ActionListener() {
				
		        @Override
		        public void actionPerformed(ActionEvent e) {
		        	ArrayList<String> seatsSelected = new ArrayList<String>();
		        	for (int i =0; i < seatNumber.length; i++ ) {
		        			if (seatNumber[i].isSelected() == true) {
		        				seatsSelected.add(seatNumber[i].getText());
		        			}
		        	}
		        	SeatingPlanDesign p = new SeatingPlanDesign(seatsSelected);
					p.setVisible(true);
					

		        		
				    
		        }
		    };
		    
		    JButton btnBook = new JButton("Book Seats");
			btnBook.setFont(new Font("Tahoma", Font.BOLD, 11));
			btnBook.setBounds(155, 500, 107, 36);
			btnBook.setBackground(new Color(0, 0, 128));
			btnBook.setForeground(new Color(255, 255, 255));
			btnBook.addActionListener(listener2);
			contentPane.add(btnBook);

	
	}

	protected String getText() {
		// TODO Auto-generated method stub
		return null;
	}
			
}



		//Bussiness class
//		seatNumber[0] = new JButton("1A");
//		seatNumber[0].setBackground(new Color(126, 192, 236));
//		seatNumber[0].setForeground(new Color(255, 255, 255));
//		seatNumber[0].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[0].setBounds(139, 126, 51, 21);
//		contentPane.add(seatNumber[0]);
//		
//		seatNumber[1] = new JButton("2A");
//		seatNumber[1].setForeground(Color.WHITE);
//		seatNumber[1].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[1].setBackground(new Color(126, 192, 236));
//		seatNumber[1].setBounds(139, 146, 51, 21);
//		contentPane.add(seatNumber[1]);
//		
//		seatNumber[2] = new JButton("3A");
//		seatNumber[2].setForeground(Color.WHITE);
//		seatNumber[2].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[2].setBackground(new Color(126, 192, 236));
//		seatNumber[2].setBounds(139, 167, 51, 21);
//		contentPane.add(seatNumber[2]);
//		
//		seatNumber[3] = new JButton("4A");
//		seatNumber[3].setForeground(Color.WHITE);
//		seatNumber[3].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[3].setBackground(new Color(126, 192, 236));
//		seatNumber[3].setBounds(139, 188, 51, 21);
//		contentPane.add(seatNumber[3]);
//		
//		seatNumber[4] = new JButton("5A");
//		seatNumber[4].setForeground(Color.WHITE);
//		seatNumber[4].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[4].setBackground(new Color(126, 192, 236));
//		seatNumber[4].setBounds(139, 208, 51, 21);
//		contentPane.add(seatNumber[4]);
		
//		seatNumber[5] = new JButton("1B");
//		seatNumber[5].setForeground(Color.WHITE);
//		seatNumber[5].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[5].setBackground(new Color(126, 192, 236));
//		seatNumber[5].setBounds(234, 126, 51, 21);
//		contentPane.add(seatNumber[5]);
//		
//		seatNumber[6] = new JButton("2B");
//		seatNumber[6].setForeground(Color.WHITE);
//		seatNumber[6].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[6].setBackground(new Color(126, 192, 236));
//		seatNumber[6].setBounds(234, 146, 51, 21);
//		contentPane.add(seatNumber[6]);
//		
//		seatNumber[7] = new JButton("3B");
//		seatNumber[7].setForeground(Color.WHITE);
//		seatNumber[7].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[7].setBackground(new Color(126, 192, 236));
//		seatNumber[7].setBounds(234, 167, 51, 21);
//		contentPane.add(seatNumber[7]);
//		
//		seatNumber[8] = new JButton("4B");
//		seatNumber[8].setForeground(Color.WHITE);
//		seatNumber[8].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[8].setBackground(new Color(126, 192, 236));
//		seatNumber[8].setBounds(234, 188, 51, 21);
//		contentPane.add(seatNumber[8]);
//		
//		seatNumber[9] = new JButton("5B");
//		seatNumber[9].setForeground(Color.WHITE);
//		seatNumber[9].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[9].setBackground(new Color(126, 192, 236));
//		seatNumber[9].setBounds(234, 208, 51, 21);
//		contentPane.add(seatNumber[9]);
//		
//		//Economy Class
//		
//		seatNumber[10] = new JButton("6A");
//		seatNumber[10].setForeground(Color.WHITE);
//		seatNumber[10].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[10].setBackground(new Color(126, 192, 236));
//		seatNumber[10].setBounds(234, 271, 51, 21);
//		contentPane.add(seatNumber[10]);
//		
////		seatNumber[11] = new JButton("7A");
////		seatNumber[11].setForeground(Color.WHITE);
////		seatNumber[11].setFont(new Font("Tahoma", Font.PLAIN, 9));
////		seatNumber[11].setBackground(new Color(126, 192, 236));
////		seatNumber[11].setBounds(234, 291, 51, 21);
////		contentPane.add(seatNumber[11]);
////		
//		seatNumber[12] = new JButton("8A");
//		seatNumber[12].setForeground(Color.WHITE);
//		seatNumber[12].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[12].setBackground(new Color(126, 192, 236));
//		seatNumber[12].setBounds(234, 312, 51, 21);
//		contentPane.add(seatNumber[12]);
//		
//		seatNumber[13] = new JButton("9A");
//		seatNumber[13].setForeground(Color.WHITE);
//		seatNumber[13].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[13].setBackground(new Color(126, 192, 236));
//		seatNumber[13].setBounds(234, 333, 51, 21);
//		contentPane.add(seatNumber[13]);
//		
//		seatNumber[14] = new JButton("10A");
//		seatNumber[14].setForeground(Color.WHITE);
//		seatNumber[14].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[14].setBackground(new Color(126, 192, 236));
//		seatNumber[14].setBounds(234, 353, 51, 21);
//		contentPane.add(seatNumber[14]);
//		
//		seatNumber[15] = new JButton("1A");
//		seatNumber[15].setForeground(Color.WHITE);
//		seatNumber[15].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[15].setBackground(new Color(126, 192, 236));
//		seatNumber[15].setBounds(282, 271, 51, 21);
//		contentPane.add(seatNumber[15]);
//		
//		seatNumber[16] = new JButton("1A");
//		seatNumber[16].setForeground(Color.WHITE);
//		seatNumber[16].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[16].setBackground(new Color(126, 192, 236));
//		seatNumber[16].setBounds(282, 291, 51, 21);
//		contentPane.add(seatNumber[16]);
//		
//		seatNumber[17] = new JButton("1A");
//		seatNumber[17].setForeground(Color.WHITE);
//		seatNumber[17].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[17].setBackground(new Color(126, 192, 236));
//		seatNumber[17].setBounds(282, 312, 51, 21);
//		contentPane.add(seatNumber[17]);
//		
//		seatNumber[18] = new JButton("1A");
//		seatNumber[18].setForeground(Color.WHITE);
//		seatNumber[18].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[18].setBackground(new Color(126, 192, 236));
//		seatNumber[18].setBounds(282, 333, 51, 21);
//		contentPane.add(seatNumber[18]);
//		
//		seatNumber[19] = new JButton("1A");
//		seatNumber[19].setForeground(Color.WHITE);
//		seatNumber[19].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[19].setBackground(new Color(126, 192, 236));
//		seatNumber[19].setBounds(282, 353, 51, 21);
//		contentPane.add(seatNumber[19]);
//		
//		seatNumber[20] = new JButton("1A");
//		seatNumber[20].setForeground(Color.WHITE);
//		seatNumber[20].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[20].setBackground(new Color(126, 192, 236));
//		seatNumber[20].setBounds(332, 271, 51, 21);
//		contentPane.add(seatNumber[20]);
//		
//		seatNumber[21] = new JButton("1A");
//		seatNumber[21].setForeground(Color.WHITE);
//		seatNumber[21].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[21].setBackground(new Color(126, 192, 236));
//		seatNumber[21].setBounds(332, 291, 51, 21);
//		contentPane.add(seatNumber[21]);
//		
//		seatNumber[22] = new JButton("1A");
//		seatNumber[22].setForeground(Color.WHITE);
//		seatNumber[22].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[22].setBackground(new Color(126, 192, 236));
//		seatNumber[22].setBounds(332, 312, 51, 21);
//		contentPane.add(seatNumber[22]);
//		
//		seatNumber[23] = new JButton("1A");
//		seatNumber[23].setForeground(Color.WHITE);
//		seatNumber[23].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[23].setBackground(new Color(126, 192, 236));
//		seatNumber[23].setBounds(332, 333, 51, 21);
//		contentPane.add(seatNumber[23]);
//		
//		seatNumber[24] = new JButton("1A");
//		seatNumber[24].setForeground(Color.WHITE);
//		seatNumber[24].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[24].setBackground(new Color(126, 192, 236));
//		seatNumber[24].setBounds(332, 353, 51, 21);
//		contentPane.add(seatNumber[24]);
//		
//		seatNumber[25] = new JButton("1A");
//		seatNumber[25].setForeground(Color.WHITE);
//		seatNumber[25].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[25].setBackground(new Color(126, 192, 236));
//		seatNumber[25].setBounds(234, 373, 51, 21);
//		contentPane.add(seatNumber[25]);
//		
//		seatNumber[26] = new JButton("1A");
//		seatNumber[26].setForeground(Color.WHITE);
//		seatNumber[26].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[26].setBackground(new Color(126, 192, 236));
//		seatNumber[26].setBounds(282, 373, 51, 21);
//		contentPane.add(seatNumber[26]);
//		
//		seatNumber[27] = new JButton("1A");
//		seatNumber[27].setForeground(Color.WHITE);
//		seatNumber[27].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[27].setBackground(new Color(126, 192, 236));
//		seatNumber[27].setBounds(332, 373, 51, 21);
//		contentPane.add(seatNumber[27]);
//		
//		seatNumber[28] = new JButton("1A");
//		seatNumber[28].setForeground(Color.WHITE);
//		seatNumber[28].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[28].setBackground(new Color(126, 192, 236));
//		seatNumber[28].setBounds(63, 271, 51, 21);
//		contentPane.add(seatNumber[28]);
//		
//		seatNumber[29] = new JButton("1A");
//		seatNumber[29].setForeground(Color.WHITE);
//		seatNumber[29].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[29].setBackground(new Color(126, 192, 236));
//		seatNumber[29].setBounds(111, 271, 51, 21);
//		contentPane.add(seatNumber[29]);
//		
//		seatNumber[30] = new JButton("1A");
//		seatNumber[30].setForeground(Color.WHITE);
//		seatNumber[30].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[30].setBackground(new Color(126, 192, 236));
//		seatNumber[30].setBounds(161, 271, 51, 21);
//		contentPane.add(seatNumber[30]);
//		
//		seatNumber[31] = new JButton("1A");
//		seatNumber[31].setForeground(Color.WHITE);
//		seatNumber[31].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[31].setBackground(new Color(126, 192, 236));
//		seatNumber[31].setBounds(63, 291, 51, 21);
//		contentPane.add(seatNumber[31]);
//		
//		seatNumber[32] = new JButton("1A");
//		seatNumber[32].setForeground(Color.WHITE);
//		seatNumber[32].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[32].setBackground(new Color(126, 192, 236));
//		seatNumber[32].setBounds(111, 291, 51, 21);
//		contentPane.add(seatNumber[32]);
//		
//		seatNumber[33] = new JButton("1A");
//		seatNumber[33].setForeground(Color.WHITE);
//		seatNumber[33].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[33].setBackground(new Color(126, 192, 236));
//		seatNumber[33].setBounds(161, 291, 51, 21);
//		contentPane.add(seatNumber[33]);
//		
//		seatNumber[34] = new JButton("1A");
//		seatNumber[34].setForeground(Color.WHITE);
//		seatNumber[34].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[34].setBackground(new Color(126, 192, 236));
//		seatNumber[34].setBounds(63, 312, 51, 21);
//		contentPane.add(seatNumber[34]);
//		
//		seatNumber[35] = new JButton("1A");
//		seatNumber[35].setForeground(Color.WHITE);
//		seatNumber[35].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[35].setBackground(new Color(126, 192, 236));
//		seatNumber[35].setBounds(111, 312, 51, 21);
//		contentPane.add(seatNumber[35]);
//		
//		seatNumber[36] = new JButton("1A");
//		seatNumber[36].setForeground(Color.WHITE);
//		seatNumber[36].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[36].setBackground(new Color(126, 192, 236));
//		seatNumber[36].setBounds(161, 312, 51, 21);
//		contentPane.add(seatNumber[36]);
//		
//		seatNumber[37] = new JButton("1A");
//		seatNumber[37].setForeground(Color.WHITE);
//		seatNumber[37].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[37].setBackground(new Color(126, 192, 236));
//		seatNumber[37].setBounds(63, 333, 51, 21);
//		contentPane.add(seatNumber[37]);
//		
//		seatNumber[38] = new JButton("1A");
//		seatNumber[38].setForeground(Color.WHITE);
//		seatNumber[38].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[38].setBackground(new Color(126, 192, 236));
//		seatNumber[38].setBounds(111, 333, 51, 21);
//		contentPane.add(seatNumber[38]);
//		
//		seatNumber[39] = new JButton("1A");
//		seatNumber[39].setForeground(Color.WHITE);
//		seatNumber[39].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[39].setBackground(new Color(126, 192, 236));
//		seatNumber[39].setBounds(161, 333, 51, 21);
//		contentPane.add(seatNumber[39]);
//		
//		seatNumber[40] = new JButton("1A");
//		seatNumber[40].setForeground(Color.WHITE);
//		seatNumber[40].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[40].setBackground(new Color(126, 192, 236));
//		seatNumber[40].setBounds(63, 353, 51, 21);
//		contentPane.add(seatNumber[40]);
//		
//		seatNumber[41] = new JButton("1A");
//		seatNumber[41].setForeground(Color.WHITE);
//		seatNumber[41].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[41].setBackground(new Color(126, 192, 236));
//		seatNumber[41].setBounds(111, 353, 51, 21);
//		contentPane.add(seatNumber[41]);
//		
//		seatNumber[42] = new JButton("1A");
//		seatNumber[42].setForeground(Color.WHITE);
//		seatNumber[42].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[42].setBackground(new Color(126, 192, 236));
//		seatNumber[42].setBounds(161, 353, 51, 21);
//		contentPane.add(seatNumber[42]);
//		
//		seatNumber[43] = new JButton("1A");
//		seatNumber[43].setForeground(Color.WHITE);
//		seatNumber[43].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[43].setBackground(new Color(126, 192, 236));
//		seatNumber[43].setBounds(63, 373, 51, 21);
//		contentPane.add(seatNumber[43]);
//		
//		seatNumber[44] = new JButton("1A");
//		seatNumber[44].setForeground(Color.WHITE);
//		seatNumber[44].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[44].setBackground(new Color(126, 192, 236));
//		seatNumber[44].setBounds(111, 373, 51, 21);
//		contentPane.add(seatNumber[44]);
//		
//		seatNumber[45] = new JButton("1A");
//		seatNumber[45].setForeground(Color.WHITE);
//		seatNumber[45].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[45].setBackground(new Color(126, 192, 236));
//		seatNumber[45].setBounds(161, 373, 51, 21);
//		contentPane.add(seatNumber[45]);
//		
//		seatNumber[46] = new JButton("1A");
//		seatNumber[46].setForeground(Color.WHITE);
//		seatNumber[46].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[46].setBackground(new Color(126, 192, 236));
//		seatNumber[46].setBounds(63, 412, 51, 21);
//		contentPane.add(seatNumber[46]);
//		
//		seatNumber[47] = new JButton("1A");
//		seatNumber[47].setForeground(Color.WHITE);
//		seatNumber[47].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[47].setBackground(new Color(126, 192, 236));
//		seatNumber[47].setBounds(63, 392, 51, 21);
//		contentPane.add(seatNumber[47]);
//		
//		seatNumber[48] = new JButton("1A");
//		seatNumber[48].setForeground(Color.WHITE);
//		seatNumber[48].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[48].setBackground(new Color(126, 192, 236));
//		seatNumber[48].setBounds(111, 392, 51, 21);
//		contentPane.add(seatNumber[48]);
//		
//		seatNumber[49] = new JButton("1A");
//		seatNumber[49].setForeground(Color.WHITE);
//		seatNumber[49].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[49].setBackground(new Color(126, 192, 236));
//		seatNumber[49].setBounds(111, 412, 51, 21);
//		contentPane.add(seatNumber[49]);
//		
//		seatNumber[50] = new JButton("1A");
//		seatNumber[50].setForeground(Color.WHITE);
//		seatNumber[50].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[50].setBackground(new Color(126, 192, 236));
//		seatNumber[50].setBounds(161, 392, 51, 21);
//		contentPane.add(seatNumber[50]);
//		
//		seatNumber[51] = new JButton("1A");
//		seatNumber[51].setForeground(Color.WHITE);
//		seatNumber[51].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[51].setBackground(new Color(126, 192, 236));
//		seatNumber[51].setBounds(161, 412, 51, 21);
//		contentPane.add(seatNumber[51]);
//		
//		seatNumber[52] = new JButton("1A");
//		seatNumber[52].setForeground(Color.WHITE);
//		seatNumber[52].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[52].setBackground(new Color(126, 192, 236));
//		seatNumber[52].setBounds(234, 392, 51, 21);
//		contentPane.add(seatNumber[52]);
//		
//		seatNumber[53] = new JButton("1A");
//		seatNumber[53].setForeground(Color.WHITE);
//		seatNumber[53].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[53].setBackground(new Color(126, 192, 236));
//		seatNumber[53].setBounds(282, 392, 51, 21);
//		contentPane.add(seatNumber[53]);
//		
//		seatNumber[54] = new JButton("1A");
//		seatNumber[54].setForeground(Color.WHITE);
//		seatNumber[54].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[54].setBackground(new Color(126, 192, 236));
//		seatNumber[54].setBounds(332, 392, 51, 21);
//		contentPane.add(seatNumber[54]);
//		
//		seatNumber[55] = new JButton("1A");
//		seatNumber[55].setForeground(Color.WHITE);
//		seatNumber[55].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[55].setBackground(new Color(126, 192, 236));
//		seatNumber[55].setBounds(234, 412, 51, 21);
//		contentPane.add(seatNumber[55]);
//		
//		seatNumber[56] = new JButton("1A");
//		seatNumber[56].setForeground(Color.WHITE);
//		seatNumber[56].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[56].setBackground(new Color(126, 192, 236));
//		seatNumber[56].setBounds(282, 412, 51, 21);
//		contentPane.add(seatNumber[56]);
//		
//		seatNumber[57] = new JButton("13F");
//		seatNumber[57].setForeground(Color.WHITE);
//		seatNumber[57].setFont(new Font("Tahoma", Font.PLAIN, 9));
//		seatNumber[57].setBackground(new Color(126, 192, 236));
//		seatNumber[57].setBounds(332, 412, 51, 21);
//		contentPane.add(seatNumber[57]);
//		
		




