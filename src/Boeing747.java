import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Boeing747 extends JFrame {

	private JPanel contentPane;
	private JButton[] seatNumber;
	private static Boeing747 instance = new Boeing747();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Boeing747 frame = new Boeing747();
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
	public Boeing747() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 481, 736);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 128), 6));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel boeing747Label = new JLabel("Departure/Return: Boeing 747");
		boeing747Label.setBounds(21, 22, 207, 28);
		boeing747Label.setForeground(new Color(0, 0, 255));
		boeing747Label.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(boeing747Label);
		
		JLabel selectLabel = new JLabel("select x seats");
		selectLabel.setBounds(21, 45, 74, 28);
		selectLabel.setForeground(Color.BLUE);
		selectLabel.setFont(new Font("Tahoma", Font.BOLD, 9));
		contentPane.add(selectLabel);
		
		JLabel firstClassLabel = new JLabel("First Class");
		firstClassLabel.setHorizontalAlignment(SwingConstants.CENTER);
		firstClassLabel.setBounds(21, 130, 86, 28);
		firstClassLabel.setForeground(Color.BLUE);
		firstClassLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		contentPane.add(firstClassLabel);
		
		JLabel businessClassLabel = new JLabel("Business Class");
		businessClassLabel.setHorizontalAlignment(SwingConstants.CENTER);
		businessClassLabel.setBounds(21, 260, 86, 28);
		businessClassLabel.setForeground(Color.BLUE);
		businessClassLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		contentPane.add(businessClassLabel);
		
		JLabel economyClassLabel = new JLabel("Business Class");
		economyClassLabel.setHorizontalAlignment(SwingConstants.CENTER);
		economyClassLabel.setBounds(21, 410, 86, 28);
		economyClassLabel.setForeground(Color.BLUE);
		economyClassLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		contentPane.add(economyClassLabel);
		
		//Buttons
		
		JButton[] seatNumber = new JButton[84];
				
		String[] FirstClassLabel= {"1A","2A","3A","4A","5A","1B","2B","3B","4B","5B"};
		
		String[] BusinessClassLabel= {"6A","7A","8A","9A","10A",
									  "6B","7B","8B","9B","10B",
									  "6C","7C","8C","9C","10C",
									  "6D","7D","8D","9D","10D",};
		
		String[] EconomyLabel= {"11A","12A","13A","14A","15A","16A","17A","18A","19A",
								"11B","12B","13B","14B","15B","16B","17B","18B","19B",
								"11C","12C","13C","14C","15C","16C","17C","18C","19C",
								"11D","12D","13D","14D","15D","16D","17D","18D","19D",
								"11E","12E","13E","14E","15E","16E","17E","18E","19E",
								"11F","12F","13F","14F","15F","16F","17F","18F","19F"};
		
		int yCounter =106,yCounter2 =106;
	
		int yCounter3 =280,yCounter4 =280,yCounter5 =280,yCounter6 =280;
		
		int yCounter7 =420,yCounter8 =420, yCounter9 =420, yCounter10 =420, yCounter11 =420,yCounter12 =420;



		Handling h = new Handling();

	//First Class
		for(int i=0;i<5;i++) { //For loop for array of JButton [0] to [4]
			seatNumber[i]= new JButton(FirstClassLabel[i]);
			seatNumber[i].setBackground(new Color(126, 192, 236));
			seatNumber[i].setForeground(new Color(255, 255, 255));
			seatNumber[i].setFont(new Font("Tahoma", Font.PLAIN, 9));
			seatNumber[i].setBounds(139,yCounter+=20, 51, 21);
			seatNumber[i].addActionListener(h);
			contentPane.add(seatNumber[i]);
		}
		
			for(int i=5;i<10;i++) {//For loop for array of JButton [4] to [9]
				seatNumber[i]= new JButton(FirstClassLabel[i]);
				seatNumber[i].setBackground(new Color(126, 192, 236));
				seatNumber[i].setForeground(new Color(255, 255, 255));
				seatNumber[i].setFont(new Font("Tahoma", Font.PLAIN, 9));
				seatNumber[i].setBounds(234,yCounter2+=20, 51, 21);
				seatNumber[i].addActionListener(h);
				contentPane.add(seatNumber[i]);
			}
			
		//Business Class
			
		for(int i=0;i<5;i++) {//For loop for array of JButton [0] to [5]
				seatNumber[i]= new JButton(BusinessClassLabel[i]);
				seatNumber[i].setBackground(new Color(126, 192, 236));
				seatNumber[i].setForeground(new Color(255, 255, 255));
				seatNumber[i].setFont(new Font("Tahoma", Font.PLAIN, 9));
				seatNumber[i].setBounds(110,yCounter3+=20, 51, 21);
				seatNumber[i].addActionListener(h);
				contentPane.add(seatNumber[i]);
			}
			
			for(int i=5;i<10;i++) {//For loop for array of JButton [8] to [16]
				seatNumber[i]= new JButton(BusinessClassLabel[i]);
				seatNumber[i].setBackground(new Color(126, 192, 236));
				seatNumber[i].setForeground(new Color(255, 255, 255));
				seatNumber[i].setFont(new Font("Tahoma", Font.PLAIN, 9));
				seatNumber[i].setBounds(170,yCounter4+=20, 51, 21);
				seatNumber[i].addActionListener(h);
				contentPane.add(seatNumber[i]);
			}
			
			for(int i=10;i<15;i++) {//For loop for array of JButton [16] to [24]
				seatNumber[i]= new JButton(BusinessClassLabel[i]);
				seatNumber[i].setBackground(new Color(126, 192, 236));
				seatNumber[i].setForeground(new Color(255, 255, 255));
				seatNumber[i].setFont(new Font("Tahoma", Font.PLAIN, 9));
				seatNumber[i].setBounds(230,yCounter5+=20, 51, 21);
				seatNumber[i].addActionListener(h);
				contentPane.add(seatNumber[i]);
			}
			
			for(int i=15;i<20;i++) {//For loop for array of JButton [24] to [32]
				seatNumber[i]= new JButton(BusinessClassLabel[i]);
				seatNumber[i].setBackground(new Color(126, 192, 236));
				seatNumber[i].setForeground(new Color(255, 255, 255));
				seatNumber[i].setFont(new Font("Tahoma", Font.PLAIN, 9));
				seatNumber[i].setBounds(290,yCounter6+=20, 51, 21);
				seatNumber[i].addActionListener(h);
				contentPane.add(seatNumber[i]);
			}
			
			//Economy class
			for(int i=0;i<9;i++) {
				seatNumber[i]= new JButton(EconomyLabel[i]);
				seatNumber[i].setBackground(new Color(126, 192, 236));
				seatNumber[i].setForeground(new Color(255, 255, 255));
				seatNumber[i].setFont(new Font("Tahoma", Font.PLAIN, 9));
				seatNumber[i].setBounds(80,yCounter7+=20, 51, 21);
				seatNumber[i].addActionListener(h);
				contentPane.add(seatNumber[i]);
			}
			
			for(int i=9;i<18;i++) {
				seatNumber[i]= new JButton(EconomyLabel[i]);
				seatNumber[i].setBackground(new Color(126, 192, 236));
				seatNumber[i].setForeground(new Color(255, 255, 255));
				seatNumber[i].setFont(new Font("Tahoma", Font.PLAIN, 9));
				seatNumber[i].setBounds(131,yCounter8+=20, 51, 21);
				seatNumber[i].addActionListener(h);
				contentPane.add(seatNumber[i]);
			}
		
			for(int i=18;i<27;i++) {
				seatNumber[i]= new JButton(EconomyLabel[i]);
				seatNumber[i].setBackground(new Color(126, 192, 236));
				seatNumber[i].setForeground(new Color(255, 255, 255));
				seatNumber[i].setFont(new Font("Tahoma", Font.PLAIN, 9));
				seatNumber[i].setBounds(182,yCounter9+=20, 51, 21);
				seatNumber[i].addActionListener(h);
				contentPane.add(seatNumber[i]);
			}
			
			for(int i=27;i<36;i++) {
				seatNumber[i]= new JButton(EconomyLabel[i]);
				seatNumber[i].setBackground(new Color(126, 192, 236));
				seatNumber[i].setForeground(new Color(255, 255, 255));
				seatNumber[i].setFont(new Font("Tahoma", Font.PLAIN, 9));
				seatNumber[i].setBounds(254,yCounter10+=20, 51, 21);
				seatNumber[i].addActionListener(h);
				contentPane.add(seatNumber[i]);
			}
			
			for(int i=36;i<45;i++) {
				seatNumber[i]= new JButton(EconomyLabel[i]);
				seatNumber[i].setBackground(new Color(126, 192, 236));
				seatNumber[i].setForeground(new Color(255, 255, 255));
				seatNumber[i].setFont(new Font("Tahoma", Font.PLAIN, 9));
				seatNumber[i].setBounds(305,yCounter11+=20, 51, 21);
				seatNumber[i].addActionListener(h);
				contentPane.add(seatNumber[i]);
			}
			
			for(int i=45;i<54;i++) {
				seatNumber[i]= new JButton(EconomyLabel[i]);
				seatNumber[i].setBackground(new Color(126, 192, 236));
				seatNumber[i].setForeground(new Color(255, 255, 255));
				seatNumber[i].setFont(new Font("Tahoma", Font.PLAIN, 9));
				seatNumber[i].setBounds(356,yCounter12+=20, 51, 21);
				seatNumber[i].addActionListener(h);
				contentPane.add(seatNumber[i]);
			}
			
			JButton btnBook = new JButton("Book Seats");
			btnBook.setFont(new Font("Tahoma", Font.BOLD, 11));
			btnBook.setBounds(183, 650, 107, 36);
			btnBook.setBackground(new Color(0, 0, 128));
			btnBook.setForeground(new Color(255, 255, 255));
			contentPane.add(btnBook);
			

//		//SeatClass Buttons
//		
//		JButton oneAButton = new JButton("1A");
//		oneAButton.setBounds(175, 134, 51, 21);
//		oneAButton.setForeground(Color.WHITE);
//		oneAButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		oneAButton.setBackground(new Color(126, 192, 236));
//		contentPane.add(oneAButton);
//		
//		JButton oneBButton = new JButton("1B");
//		oneBButton.setBounds(286, 134, 51, 21);
//		oneBButton.setForeground(Color.WHITE);
//		oneBButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		oneBButton.setBackground(new Color(126, 192, 236));
//		contentPane.add(oneBButton);
//		
//		JButton twoAButton = new JButton("2A");
//		twoAButton.setBounds(175, 154, 51, 21);
//		twoAButton.setForeground(Color.WHITE);
//		twoAButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		twoAButton.setBackground(new Color(126, 192, 236));
//		contentPane.add(twoAButton);
//		
//		JButton twoBButton = new JButton("2B");
//		twoBButton.setBounds(286, 154, 51, 21);
//		twoBButton.setForeground(Color.WHITE);
//		twoBButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		twoBButton.setBackground(new Color(126, 192, 236));
//		contentPane.add(twoBButton);
//		
//		JButton threeAButton = new JButton("3A");
//		threeAButton.setBounds(175, 175, 51, 21);
//		threeAButton.setForeground(Color.WHITE);
//		threeAButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		threeAButton.setBackground(new Color(126, 192, 236));
//		contentPane.add(threeAButton);
//		
//		JButton threeBButton = new JButton("3B");
//		threeBButton.setBounds(286, 175, 51, 21);
//		threeBButton.setForeground(Color.WHITE);
//		threeBButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		threeBButton.setBackground(new Color(126, 192, 236));
//		contentPane.add(threeBButton);
//		
//		JButton fourAButton = new JButton("4A");
//		fourAButton.setBounds(175, 196, 51, 21);
//		fourAButton.setForeground(Color.WHITE);
//		fourAButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		fourAButton.setBackground(new Color(126, 192, 236));
//		contentPane.add(fourAButton);
//		
//		JButton fourBButton = new JButton("4B");
//		fourBButton.setBounds(286, 196, 51, 21);
//		fourBButton.setForeground(Color.WHITE);
//		fourBButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		fourBButton.setBackground(new Color(126, 192, 236));
//		contentPane.add(fourBButton);
//		
//		JButton fiveAButton = new JButton("5A");
//		fiveAButton.setBounds(175, 216, 51, 21);
//		fiveAButton.setForeground(Color.WHITE);
//		fiveAButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		fiveAButton.setBackground(new Color(126, 192, 236));
//		contentPane.add(fiveAButton);
//		
//		JButton fiveBButton = new JButton("5B");
//		fiveBButton.setBounds(286, 216, 51, 21);
//		fiveBButton.setForeground(Color.WHITE);
//		fiveBButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		fiveBButton.setBackground(new Color(126, 192, 236));
//		contentPane.add(fiveBButton);
//		
//		JLabel businessClassLabel = new JLabel("Business Class");
//		businessClassLabel.setHorizontalAlignment(SwingConstants.CENTER);
//		businessClassLabel.setForeground(Color.BLUE);
//		businessClassLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
//		businessClassLabel.setBounds(21, 309, 86, 28);
//		contentPane.add(businessClassLabel);
//		
//		JButton oneAButton_1 = new JButton("1A");
//		oneAButton_1.setForeground(Color.WHITE);
//		oneAButton_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		oneAButton_1.setBackground(new Color(126, 192, 236));
//		oneAButton_1.setBounds(143, 316, 51, 21);
//		contentPane.add(oneAButton_1);
//		
//		JButton twoAButton_1 = new JButton("2A");
//		twoAButton_1.setForeground(Color.WHITE);
//		twoAButton_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		twoAButton_1.setBackground(new Color(126, 192, 236));
//		twoAButton_1.setBounds(143, 336, 51, 21);
//		contentPane.add(twoAButton_1);
//		
//		JButton threeAButton_1 = new JButton("3A");
//		threeAButton_1.setForeground(Color.WHITE);
//		threeAButton_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		threeAButton_1.setBackground(new Color(126, 192, 236));
//		threeAButton_1.setBounds(143, 357, 51, 21);
//		contentPane.add(threeAButton_1);
//		
//		JButton fourAButton_1 = new JButton("4A");
//		fourAButton_1.setForeground(Color.WHITE);
//		fourAButton_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		fourAButton_1.setBackground(new Color(126, 192, 236));
//		fourAButton_1.setBounds(143, 378, 51, 21);
//		contentPane.add(fourAButton_1);
//		
//		JButton fiveAButton_1 = new JButton("5A");
//		fiveAButton_1.setForeground(Color.WHITE);
//		fiveAButton_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		fiveAButton_1.setBackground(new Color(126, 192, 236));
//		fiveAButton_1.setBounds(143, 398, 51, 21);
//		contentPane.add(fiveAButton_1);
//		
//		JButton oneAButton_1_1 = new JButton("1A");
//		oneAButton_1_1.setForeground(Color.WHITE);
//		oneAButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		oneAButton_1_1.setBackground(new Color(126, 192, 236));
//		oneAButton_1_1.setBounds(203, 316, 51, 21);
//		contentPane.add(oneAButton_1_1);
//		
//		JButton twoAButton_1_1 = new JButton("2A");
//		twoAButton_1_1.setForeground(Color.WHITE);
//		twoAButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		twoAButton_1_1.setBackground(new Color(126, 192, 236));
//		twoAButton_1_1.setBounds(203, 336, 51, 21);
//		contentPane.add(twoAButton_1_1);
//		
//		JButton threeAButton_1_1 = new JButton("3A");
//		threeAButton_1_1.setForeground(Color.WHITE);
//		threeAButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		threeAButton_1_1.setBackground(new Color(126, 192, 236));
//		threeAButton_1_1.setBounds(203, 357, 51, 21);
//		contentPane.add(threeAButton_1_1);
//		
//		JButton fourAButton_1_1 = new JButton("4A");
//		fourAButton_1_1.setForeground(Color.WHITE);
//		fourAButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		fourAButton_1_1.setBackground(new Color(126, 192, 236));
//		fourAButton_1_1.setBounds(203, 378, 51, 21);
//		contentPane.add(fourAButton_1_1);
//		
//		JButton fiveAButton_1_1 = new JButton("5A");
//		fiveAButton_1_1.setForeground(Color.WHITE);
//		fiveAButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		fiveAButton_1_1.setBackground(new Color(126, 192, 236));
//		fiveAButton_1_1.setBounds(203, 398, 51, 21);
//		contentPane.add(fiveAButton_1_1);
//		
//		JButton oneAButton_1_2 = new JButton("1A");
//		oneAButton_1_2.setForeground(Color.WHITE);
//		oneAButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		oneAButton_1_2.setBackground(new Color(126, 192, 236));
//		oneAButton_1_2.setBounds(264, 316, 51, 21);
//		contentPane.add(oneAButton_1_2);
//		
//		JButton twoAButton_1_2 = new JButton("2A");
//		twoAButton_1_2.setForeground(Color.WHITE);
//		twoAButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		twoAButton_1_2.setBackground(new Color(126, 192, 236));
//		twoAButton_1_2.setBounds(264, 336, 51, 21);
//		contentPane.add(twoAButton_1_2);
//		
//		JButton threeAButton_1_2 = new JButton("3A");
//		threeAButton_1_2.setForeground(Color.WHITE);
//		threeAButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		threeAButton_1_2.setBackground(new Color(126, 192, 236));
//		threeAButton_1_2.setBounds(264, 357, 51, 21);
//		contentPane.add(threeAButton_1_2);
//		
//		JButton fourAButton_1_2 = new JButton("4A");
//		fourAButton_1_2.setForeground(Color.WHITE);
//		fourAButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		fourAButton_1_2.setBackground(new Color(126, 192, 236));
//		fourAButton_1_2.setBounds(264, 378, 51, 21);
//		contentPane.add(fourAButton_1_2);
//		
//		JButton fiveAButton_1_2 = new JButton("5A");
//		fiveAButton_1_2.setForeground(Color.WHITE);
//		fiveAButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		fiveAButton_1_2.setBackground(new Color(126, 192, 236));
//		fiveAButton_1_2.setBounds(264, 398, 51, 21);
//		contentPane.add(fiveAButton_1_2);
//		
//		JButton oneAButton_1_3 = new JButton("1A");
//		oneAButton_1_3.setForeground(Color.WHITE);
//		oneAButton_1_3.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		oneAButton_1_3.setBackground(new Color(126, 192, 236));
//		oneAButton_1_3.setBounds(325, 316, 51, 21);
//		contentPane.add(oneAButton_1_3);
//		
//		JButton twoAButton_1_3 = new JButton("2A");
//		twoAButton_1_3.setForeground(Color.WHITE);
//		twoAButton_1_3.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		twoAButton_1_3.setBackground(new Color(126, 192, 236));
//		twoAButton_1_3.setBounds(325, 336, 51, 21);
//		contentPane.add(twoAButton_1_3);
//		
//		JButton threeAButton_1_3 = new JButton("3A");
//		threeAButton_1_3.setForeground(Color.WHITE);
//		threeAButton_1_3.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		threeAButton_1_3.setBackground(new Color(126, 192, 236));
//		threeAButton_1_3.setBounds(325, 357, 51, 21);
//		contentPane.add(threeAButton_1_3);
//		
//		JButton fourAButton_1_3 = new JButton("4A");
//		fourAButton_1_3.setForeground(Color.WHITE);
//		fourAButton_1_3.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		fourAButton_1_3.setBackground(new Color(126, 192, 236));
//		fourAButton_1_3.setBounds(325, 378, 51, 21);
//		contentPane.add(fourAButton_1_3);
//		
//		JButton fiveAButton_1_3 = new JButton("5A");
//		fiveAButton_1_3.setForeground(Color.WHITE);
//		fiveAButton_1_3.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		fiveAButton_1_3.setBackground(new Color(126, 192, 236));
//		fiveAButton_1_3.setBounds(325, 398, 51, 21);
//		contentPane.add(fiveAButton_1_3);
//		
//		JLabel economyClassLabel = new JLabel("Economy Class");
//		economyClassLabel.setHorizontalAlignment(SwingConstants.CENTER);
//		economyClassLabel.setForeground(Color.BLUE);
//		economyClassLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
//		economyClassLabel.setBounds(21, 484, 86, 28);
//		contentPane.add(economyClassLabel);
//		
//		JButton oneAButton_1_4 = new JButton("1A");
//		oneAButton_1_4.setForeground(Color.WHITE);
//		oneAButton_1_4.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		oneAButton_1_4.setBackground(new Color(126, 192, 236));
//		oneAButton_1_4.setBounds(117, 488, 51, 21);
//		contentPane.add(oneAButton_1_4);
//		
//		JButton twoAButton_1_4 = new JButton("2A");
//		twoAButton_1_4.setForeground(Color.WHITE);
//		twoAButton_1_4.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		twoAButton_1_4.setBackground(new Color(126, 192, 236));
//		twoAButton_1_4.setBounds(117, 508, 51, 21);
//		contentPane.add(twoAButton_1_4);
//		
//		JButton threeAButton_1_4 = new JButton("3A");
//		threeAButton_1_4.setForeground(Color.WHITE);
//		threeAButton_1_4.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		threeAButton_1_4.setBackground(new Color(126, 192, 236));
//		threeAButton_1_4.setBounds(117, 529, 51, 21);
//		contentPane.add(threeAButton_1_4);
//		
//		JButton fourAButton_1_4 = new JButton("4A");
//		fourAButton_1_4.setForeground(Color.WHITE);
//		fourAButton_1_4.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		fourAButton_1_4.setBackground(new Color(126, 192, 236));
//		fourAButton_1_4.setBounds(117, 550, 51, 21);
//		contentPane.add(fourAButton_1_4);
//		
//		JButton fiveAButton_1_4 = new JButton("5A");
//		fiveAButton_1_4.setForeground(Color.WHITE);
//		fiveAButton_1_4.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		fiveAButton_1_4.setBackground(new Color(126, 192, 236));
//		fiveAButton_1_4.setBounds(117, 570, 51, 21);
//		contentPane.add(fiveAButton_1_4);
//		
//		JButton oneAButton_1_4_1 = new JButton("1A");
//		oneAButton_1_4_1.setForeground(Color.WHITE);
//		oneAButton_1_4_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		oneAButton_1_4_1.setBackground(new Color(126, 192, 236));
//		oneAButton_1_4_1.setBounds(117, 591, 51, 21);
//		contentPane.add(oneAButton_1_4_1);
//		
//		JButton twoAButton_1_4_1 = new JButton("2A");
//		twoAButton_1_4_1.setForeground(Color.WHITE);
//		twoAButton_1_4_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		twoAButton_1_4_1.setBackground(new Color(126, 192, 236));
//		twoAButton_1_4_1.setBounds(117, 612, 51, 21);
//		contentPane.add(twoAButton_1_4_1);
//		
//		JButton threeAButton_1_4_1 = new JButton("3A");
//		threeAButton_1_4_1.setForeground(Color.WHITE);
//		threeAButton_1_4_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		threeAButton_1_4_1.setBackground(new Color(126, 192, 236));
//		threeAButton_1_4_1.setBounds(117, 633, 51, 21);
//		contentPane.add(threeAButton_1_4_1);
//		
//		JButton fourAButton_1_4_1 = new JButton("4A");
//		fourAButton_1_4_1.setForeground(Color.WHITE);
//		fourAButton_1_4_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		fourAButton_1_4_1.setBackground(new Color(126, 192, 236));
//		fourAButton_1_4_1.setBounds(117, 654, 51, 21);
//		contentPane.add(fourAButton_1_4_1);
//		
//		JButton oneAButton_1_4_2 = new JButton("1A");
//		oneAButton_1_4_2.setForeground(Color.WHITE);
//		oneAButton_1_4_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		oneAButton_1_4_2.setBackground(new Color(126, 192, 236));
//		oneAButton_1_4_2.setBounds(166, 488, 51, 21);
//		contentPane.add(oneAButton_1_4_2);
//		
//		JButton twoAButton_1_4_2 = new JButton("2A");
//		twoAButton_1_4_2.setForeground(Color.WHITE);
//		twoAButton_1_4_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		twoAButton_1_4_2.setBackground(new Color(126, 192, 236));
//		twoAButton_1_4_2.setBounds(166, 508, 51, 21);
//		contentPane.add(twoAButton_1_4_2);
//		
//		JButton threeAButton_1_4_2 = new JButton("3A");
//		threeAButton_1_4_2.setForeground(Color.WHITE);
//		threeAButton_1_4_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		threeAButton_1_4_2.setBackground(new Color(126, 192, 236));
//		threeAButton_1_4_2.setBounds(166, 529, 51, 21);
//		contentPane.add(threeAButton_1_4_2);
//		
//		JButton fourAButton_1_4_2 = new JButton("4A");
//		fourAButton_1_4_2.setForeground(Color.WHITE);
//		fourAButton_1_4_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		fourAButton_1_4_2.setBackground(new Color(126, 192, 236));
//		fourAButton_1_4_2.setBounds(166, 550, 51, 21);
//		contentPane.add(fourAButton_1_4_2);
//		
//		JButton fiveAButton_1_4_1 = new JButton("5A");
//		fiveAButton_1_4_1.setForeground(Color.WHITE);
//		fiveAButton_1_4_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		fiveAButton_1_4_1.setBackground(new Color(126, 192, 236));
//		fiveAButton_1_4_1.setBounds(166, 570, 51, 21);
//		contentPane.add(fiveAButton_1_4_1);
//		
//		JButton oneAButton_1_4_1_1 = new JButton("1A");
//		oneAButton_1_4_1_1.setForeground(Color.WHITE);
//		oneAButton_1_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		oneAButton_1_4_1_1.setBackground(new Color(126, 192, 236));
//		oneAButton_1_4_1_1.setBounds(166, 591, 51, 21);
//		contentPane.add(oneAButton_1_4_1_1);
//		
//		JButton twoAButton_1_4_1_1 = new JButton("2A");
//		twoAButton_1_4_1_1.setForeground(Color.WHITE);
//		twoAButton_1_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		twoAButton_1_4_1_1.setBackground(new Color(126, 192, 236));
//		twoAButton_1_4_1_1.setBounds(166, 612, 51, 21);
//		contentPane.add(twoAButton_1_4_1_1);
//		
//		JButton threeAButton_1_4_1_1 = new JButton("3A");
//		threeAButton_1_4_1_1.setForeground(Color.WHITE);
//		threeAButton_1_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		threeAButton_1_4_1_1.setBackground(new Color(126, 192, 236));
//		threeAButton_1_4_1_1.setBounds(166, 633, 51, 21);
//		contentPane.add(threeAButton_1_4_1_1);
//		
//		JButton fourAButton_1_4_1_1 = new JButton("4A");
//		fourAButton_1_4_1_1.setForeground(Color.WHITE);
//		fourAButton_1_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		fourAButton_1_4_1_1.setBackground(new Color(126, 192, 236));
//		fourAButton_1_4_1_1.setBounds(166, 654, 51, 21);
//		contentPane.add(fourAButton_1_4_1_1);
//		
//		JButton oneAButton_1_4_2_1 = new JButton("1A");
//		oneAButton_1_4_2_1.setForeground(Color.WHITE);
//		oneAButton_1_4_2_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		oneAButton_1_4_2_1.setBackground(new Color(126, 192, 236));
//		oneAButton_1_4_2_1.setBounds(215, 488, 51, 21);
//		contentPane.add(oneAButton_1_4_2_1);
//		
//		JButton twoAButton_1_4_2_1 = new JButton("2A");
//		twoAButton_1_4_2_1.setForeground(Color.WHITE);
//		twoAButton_1_4_2_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		twoAButton_1_4_2_1.setBackground(new Color(126, 192, 236));
//		twoAButton_1_4_2_1.setBounds(215, 508, 51, 21);
//		contentPane.add(twoAButton_1_4_2_1);
//		
//		JButton threeAButton_1_4_2_1 = new JButton("3A");
//		threeAButton_1_4_2_1.setForeground(Color.WHITE);
//		threeAButton_1_4_2_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		threeAButton_1_4_2_1.setBackground(new Color(126, 192, 236));
//		threeAButton_1_4_2_1.setBounds(215, 529, 51, 21);
//		contentPane.add(threeAButton_1_4_2_1);
//		
//		JButton fourAButton_1_4_2_1 = new JButton("4A");
//		fourAButton_1_4_2_1.setForeground(Color.WHITE);
//		fourAButton_1_4_2_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		fourAButton_1_4_2_1.setBackground(new Color(126, 192, 236));
//		fourAButton_1_4_2_1.setBounds(215, 550, 51, 21);
//		contentPane.add(fourAButton_1_4_2_1);
//		
//		JButton fiveAButton_1_4_1_1 = new JButton("5A");
//		fiveAButton_1_4_1_1.setForeground(Color.WHITE);
//		fiveAButton_1_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		fiveAButton_1_4_1_1.setBackground(new Color(126, 192, 236));
//		fiveAButton_1_4_1_1.setBounds(215, 570, 51, 21);
//		contentPane.add(fiveAButton_1_4_1_1);
//		
//		JButton oneAButton_1_4_1_1_1 = new JButton("1A");
//		oneAButton_1_4_1_1_1.setForeground(Color.WHITE);
//		oneAButton_1_4_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		oneAButton_1_4_1_1_1.setBackground(new Color(126, 192, 236));
//		oneAButton_1_4_1_1_1.setBounds(215, 591, 51, 21);
//		contentPane.add(oneAButton_1_4_1_1_1);
//		
//		JButton twoAButton_1_4_1_1_1 = new JButton("2A");
//		twoAButton_1_4_1_1_1.setForeground(Color.WHITE);
//		twoAButton_1_4_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		twoAButton_1_4_1_1_1.setBackground(new Color(126, 192, 236));
//		twoAButton_1_4_1_1_1.setBounds(215, 612, 51, 21);
//		contentPane.add(twoAButton_1_4_1_1_1);
//		
//		JButton threeAButton_1_4_1_1_1 = new JButton("3A");
//		threeAButton_1_4_1_1_1.setForeground(Color.WHITE);
//		threeAButton_1_4_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		threeAButton_1_4_1_1_1.setBackground(new Color(126, 192, 236));
//		threeAButton_1_4_1_1_1.setBounds(215, 633, 51, 21);
//		contentPane.add(threeAButton_1_4_1_1_1);
//		
//		JButton fourAButton_1_4_1_1_1 = new JButton("4A");
//		fourAButton_1_4_1_1_1.setForeground(Color.WHITE);
//		fourAButton_1_4_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		fourAButton_1_4_1_1_1.setBackground(new Color(126, 192, 236));
//		fourAButton_1_4_1_1_1.setBounds(215, 654, 51, 21);
//		contentPane.add(fourAButton_1_4_1_1_1);
//		
//		JButton oneAButton_1_4_2_1_1 = new JButton("1A");
//		oneAButton_1_4_2_1_1.setForeground(Color.WHITE);
//		oneAButton_1_4_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		oneAButton_1_4_2_1_1.setBackground(new Color(126, 192, 236));
//		oneAButton_1_4_2_1_1.setBounds(374, 488, 51, 21);
//		contentPane.add(oneAButton_1_4_2_1_1);
//		
//		JButton oneAButton_1_4_2_2 = new JButton("1A");
//		oneAButton_1_4_2_2.setForeground(Color.WHITE);
//		oneAButton_1_4_2_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		oneAButton_1_4_2_2.setBackground(new Color(126, 192, 236));
//		oneAButton_1_4_2_2.setBounds(325, 488, 51, 21);
//		contentPane.add(oneAButton_1_4_2_2);
//		
//		JButton oneAButton_1_4_3 = new JButton("1A");
//		oneAButton_1_4_3.setForeground(Color.WHITE);
//		oneAButton_1_4_3.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		oneAButton_1_4_3.setBackground(new Color(126, 192, 236));
//		oneAButton_1_4_3.setBounds(276, 488, 51, 21);
//		contentPane.add(oneAButton_1_4_3);
//		
//		JButton twoAButton_1_4_3 = new JButton("2A");
//		twoAButton_1_4_3.setForeground(Color.WHITE);
//		twoAButton_1_4_3.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		twoAButton_1_4_3.setBackground(new Color(126, 192, 236));
//		twoAButton_1_4_3.setBounds(276, 508, 51, 21);
//		contentPane.add(twoAButton_1_4_3);
//		
//		JButton twoAButton_1_4_2_2 = new JButton("2A");
//		twoAButton_1_4_2_2.setForeground(Color.WHITE);
//		twoAButton_1_4_2_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		twoAButton_1_4_2_2.setBackground(new Color(126, 192, 236));
//		twoAButton_1_4_2_2.setBounds(325, 508, 51, 21);
//		contentPane.add(twoAButton_1_4_2_2);
//		
//		JButton twoAButton_1_4_2_1_1 = new JButton("2A");
//		twoAButton_1_4_2_1_1.setForeground(Color.WHITE);
//		twoAButton_1_4_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		twoAButton_1_4_2_1_1.setBackground(new Color(126, 192, 236));
//		twoAButton_1_4_2_1_1.setBounds(374, 508, 51, 21);
//		contentPane.add(twoAButton_1_4_2_1_1);
//		
//		JButton threeAButton_1_4_3 = new JButton("3A");
//		threeAButton_1_4_3.setForeground(Color.WHITE);
//		threeAButton_1_4_3.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		threeAButton_1_4_3.setBackground(new Color(126, 192, 236));
//		threeAButton_1_4_3.setBounds(276, 529, 51, 21);
//		contentPane.add(threeAButton_1_4_3);
//		
//		JButton threeAButton_1_4_2_2 = new JButton("3A");
//		threeAButton_1_4_2_2.setForeground(Color.WHITE);
//		threeAButton_1_4_2_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		threeAButton_1_4_2_2.setBackground(new Color(126, 192, 236));
//		threeAButton_1_4_2_2.setBounds(325, 529, 51, 21);
//		contentPane.add(threeAButton_1_4_2_2);
//		
//		JButton threeAButton_1_4_2_1_1 = new JButton("3A");
//		threeAButton_1_4_2_1_1.setForeground(Color.WHITE);
//		threeAButton_1_4_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		threeAButton_1_4_2_1_1.setBackground(new Color(126, 192, 236));
//		threeAButton_1_4_2_1_1.setBounds(374, 529, 51, 21);
//		contentPane.add(threeAButton_1_4_2_1_1);
//		
//		JButton fourAButton_1_4_3 = new JButton("4A");
//		fourAButton_1_4_3.setForeground(Color.WHITE);
//		fourAButton_1_4_3.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		fourAButton_1_4_3.setBackground(new Color(126, 192, 236));
//		fourAButton_1_4_3.setBounds(276, 550, 51, 21);
//		contentPane.add(fourAButton_1_4_3);
//		
//		JButton fourAButton_1_4_2_2 = new JButton("4A");
//		fourAButton_1_4_2_2.setForeground(Color.WHITE);
//		fourAButton_1_4_2_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		fourAButton_1_4_2_2.setBackground(new Color(126, 192, 236));
//		fourAButton_1_4_2_2.setBounds(325, 550, 51, 21);
//		contentPane.add(fourAButton_1_4_2_2);
//		
//		JButton fourAButton_1_4_2_1_1 = new JButton("4A");
//		fourAButton_1_4_2_1_1.setForeground(Color.WHITE);
//		fourAButton_1_4_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		fourAButton_1_4_2_1_1.setBackground(new Color(126, 192, 236));
//		fourAButton_1_4_2_1_1.setBounds(374, 550, 51, 21);
//		contentPane.add(fourAButton_1_4_2_1_1);
//		
//		JButton fiveAButton_1_4_2 = new JButton("5A");
//		fiveAButton_1_4_2.setForeground(Color.WHITE);
//		fiveAButton_1_4_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		fiveAButton_1_4_2.setBackground(new Color(126, 192, 236));
//		fiveAButton_1_4_2.setBounds(276, 570, 51, 21);
//		contentPane.add(fiveAButton_1_4_2);
//		
//		JButton fiveAButton_1_4_1_2 = new JButton("5A");
//		fiveAButton_1_4_1_2.setForeground(Color.WHITE);
//		fiveAButton_1_4_1_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		fiveAButton_1_4_1_2.setBackground(new Color(126, 192, 236));
//		fiveAButton_1_4_1_2.setBounds(325, 570, 51, 21);
//		contentPane.add(fiveAButton_1_4_1_2);
//		
//		JButton fiveAButton_1_4_1_1_1 = new JButton("5A");
//		fiveAButton_1_4_1_1_1.setForeground(Color.WHITE);
//		fiveAButton_1_4_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		fiveAButton_1_4_1_1_1.setBackground(new Color(126, 192, 236));
//		fiveAButton_1_4_1_1_1.setBounds(374, 570, 51, 21);
//		contentPane.add(fiveAButton_1_4_1_1_1);
//		
//		JButton oneAButton_1_4_1_2 = new JButton("1A");
//		oneAButton_1_4_1_2.setForeground(Color.WHITE);
//		oneAButton_1_4_1_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		oneAButton_1_4_1_2.setBackground(new Color(126, 192, 236));
//		oneAButton_1_4_1_2.setBounds(276, 591, 51, 21);
//		contentPane.add(oneAButton_1_4_1_2);
//		
//		JButton oneAButton_1_4_1_1_2 = new JButton("1A");
//		oneAButton_1_4_1_1_2.setForeground(Color.WHITE);
//		oneAButton_1_4_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		oneAButton_1_4_1_1_2.setBackground(new Color(126, 192, 236));
//		oneAButton_1_4_1_1_2.setBounds(325, 591, 51, 21);
//		contentPane.add(oneAButton_1_4_1_1_2);
//		
//		JButton oneAButton_1_4_1_1_1_1 = new JButton("1A");
//		oneAButton_1_4_1_1_1_1.setForeground(Color.WHITE);
//		oneAButton_1_4_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		oneAButton_1_4_1_1_1_1.setBackground(new Color(126, 192, 236));
//		oneAButton_1_4_1_1_1_1.setBounds(374, 591, 51, 21);
//		contentPane.add(oneAButton_1_4_1_1_1_1);
//		
//		JButton twoAButton_1_4_1_2 = new JButton("2A");
//		twoAButton_1_4_1_2.setForeground(Color.WHITE);
//		twoAButton_1_4_1_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		twoAButton_1_4_1_2.setBackground(new Color(126, 192, 236));
//		twoAButton_1_4_1_2.setBounds(276, 612, 51, 21);
//		contentPane.add(twoAButton_1_4_1_2);
//		
//		JButton twoAButton_1_4_1_1_2 = new JButton("2A");
//		twoAButton_1_4_1_1_2.setForeground(Color.WHITE);
//		twoAButton_1_4_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		twoAButton_1_4_1_1_2.setBackground(new Color(126, 192, 236));
//		twoAButton_1_4_1_1_2.setBounds(325, 612, 51, 21);
//		contentPane.add(twoAButton_1_4_1_1_2);
//		
//		JButton twoAButton_1_4_1_1_1_1 = new JButton("2A");
//		twoAButton_1_4_1_1_1_1.setForeground(Color.WHITE);
//		twoAButton_1_4_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		twoAButton_1_4_1_1_1_1.setBackground(new Color(126, 192, 236));
//		twoAButton_1_4_1_1_1_1.setBounds(374, 612, 51, 21);
//		contentPane.add(twoAButton_1_4_1_1_1_1);
//		
//		JButton threeAButton_1_4_1_2 = new JButton("3A");
//		threeAButton_1_4_1_2.setForeground(Color.WHITE);
//		threeAButton_1_4_1_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		threeAButton_1_4_1_2.setBackground(new Color(126, 192, 236));
//		threeAButton_1_4_1_2.setBounds(276, 633, 51, 21);
//		contentPane.add(threeAButton_1_4_1_2);
//		
//		JButton threeAButton_1_4_1_1_2 = new JButton("3A");
//		threeAButton_1_4_1_1_2.setForeground(Color.WHITE);
//		threeAButton_1_4_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		threeAButton_1_4_1_1_2.setBackground(new Color(126, 192, 236));
//		threeAButton_1_4_1_1_2.setBounds(325, 633, 51, 21);
//		contentPane.add(threeAButton_1_4_1_1_2);
//		
//		JButton threeAButton_1_4_1_1_1_1 = new JButton("3A");
//		threeAButton_1_4_1_1_1_1.setForeground(Color.WHITE);
//		threeAButton_1_4_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		threeAButton_1_4_1_1_1_1.setBackground(new Color(126, 192, 236));
//		threeAButton_1_4_1_1_1_1.setBounds(374, 633, 51, 21);
//		contentPane.add(threeAButton_1_4_1_1_1_1);
//		
//		JButton fourAButton_1_4_1_2 = new JButton("4A");
//		fourAButton_1_4_1_2.setForeground(Color.WHITE);
//		fourAButton_1_4_1_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		fourAButton_1_4_1_2.setBackground(new Color(126, 192, 236));
//		fourAButton_1_4_1_2.setBounds(276, 654, 51, 21);
//		contentPane.add(fourAButton_1_4_1_2);
//		
//		JButton fourAButton_1_4_1_1_2 = new JButton("4A");
//		fourAButton_1_4_1_1_2.setForeground(Color.WHITE);
//		fourAButton_1_4_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		fourAButton_1_4_1_1_2.setBackground(new Color(126, 192, 236));
//		fourAButton_1_4_1_1_2.setBounds(325, 654, 51, 21);
//		contentPane.add(fourAButton_1_4_1_1_2);
//		
//		JButton fourAButton_1_4_1_1_1_1 = new JButton("4A");
//		fourAButton_1_4_1_1_1_1.setForeground(Color.WHITE);
//		fourAButton_1_4_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
//		fourAButton_1_4_1_1_1_1.setBackground(new Color(126, 192, 236));
//		fourAButton_1_4_1_1_1_1.setBounds(374, 654, 51, 21);
//		contentPane.add(fourAButton_1_4_1_1_1_1);
	}


	public static Boeing747 getinstance() {
		// TODO Auto-generated method stub
		return instance;
	}
}

