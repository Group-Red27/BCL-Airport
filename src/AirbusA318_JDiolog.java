import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class AirbusA318_JDiolog extends JDialog {

	private JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AirbusA318_JDiolog dialog = new AirbusA318_JDiolog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AirbusA318_JDiolog() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		setBounds(100, 100, 450, 515);
		contentPanel = new JPanel();
		getContentPane().setBackground(new Color(255, 255, 255));
		setContentPane(getContentPane());
		getContentPane().setLayout(null);
		
		JLabel airbusA318Label = new JLabel("Departure/Return: Airbus A318");
		airbusA318Label.setFont(new Font("Tahoma", Font.BOLD, 12));
		airbusA318Label.setForeground(new Color(0, 0, 255));
		airbusA318Label.setBounds(22, 30, 220, 28);
		getContentPane().add(airbusA318Label);
		
		JLabel selectLabel = new JLabel("select x seats");
		selectLabel.setForeground(Color.BLUE);
		selectLabel.setFont(new Font("Tahoma", Font.BOLD, 9));
		selectLabel.setBounds(22, 59, 74, 28);
		getContentPane().add(selectLabel);
		
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
		
		//Button Array
		
		JButton[] seatNumber = new JButton[58];
		String[] BusinessLabel= {"1A","2A","3A","4A","5A","1B","2B","3B","4B","5B"};
		String[] Economy= {"6A","7A","8A","9A","10A","11A","12A","13A",
				"6B","7B","8B","9B","10B","11B","12B","13B",
				"6C","7C","8C","9C","10C","11C","12C","13C",
				"6D","7D","8D","9D","10D","11D","12D","13D",
				"6E","7E","8E","9E","10E","11E","12E","13E",
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



	//Business Class
		for(int i=0;i<5;i++) { //For loop for array of JButton [0] to [4]
			seatNumber[i]= new JButton(BusinessLabel[i]);
			seatNumber[i].setBackground(new Color(126, 192, 236));
			seatNumber[i].setForeground(new Color(255, 255, 255));
			seatNumber[i].setFont(new Font("Tahoma", Font.PLAIN, 9));
			seatNumber[i].setBounds(139,yCounter+=20, 51, 21);
			getContentPane().add(seatNumber[i]);
		}
		
			for(int i=5;i<10;i++) {//For loop for array of JButton [4] to [9]
				seatNumber[i]= new JButton(BusinessLabel[i]);
				seatNumber[i].setBackground(new Color(126, 192, 236));
				seatNumber[i].setForeground(new Color(255, 255, 255));
				seatNumber[i].setFont(new Font("Tahoma", Font.PLAIN, 9));
				seatNumber[i].setBounds(234,yCounter2+=20, 51, 21);
				getContentPane().add(seatNumber[i]);
			}
			
		//Economy Class
			
			for(int i=0;i<8;i++) {//For loop for array of JButton [0] to [8]
				seatNumber[i]= new JButton(Economy[i]);
				seatNumber[i].setBackground(new Color(126, 192, 236));
				seatNumber[i].setForeground(new Color(255, 255, 255));
				seatNumber[i].setFont(new Font("Tahoma", Font.PLAIN, 9));
				seatNumber[i].setBounds(50,yCounter3+=20, 51, 21);
				seatNumber[i].addMouseListener((MouseListener) new MouseAdapter() {
	                @Override
	                public void mousePressed(MouseEvent e) {
	                	System.out.println("HI");
	                }           
	            });
				getContentPane().add(seatNumber[i]);
			}
			
			for(int i=8;i<16;i++) {//For loop for array of JButton [8] to [16]
				seatNumber[i]= new JButton(Economy[i]);
				seatNumber[i].setBackground(new Color(126, 192, 236));
				seatNumber[i].setForeground(new Color(255, 255, 255));
				seatNumber[i].setFont(new Font("Tahoma", Font.PLAIN, 9));
				seatNumber[i].setBounds(101,yCounter4+=20, 51, 21);
				getContentPane().add(seatNumber[i]);
			}
			
			for(int i=16;i<24;i++) {//For loop for array of JButton [16] to [24]
				seatNumber[i]= new JButton(Economy[i]);
				seatNumber[i].setBackground(new Color(126, 192, 236));
				seatNumber[i].setForeground(new Color(255, 255, 255));
				seatNumber[i].setFont(new Font("Tahoma", Font.PLAIN, 9));
				seatNumber[i].setBounds(152,yCounter5+=20, 51, 21);
				getContentPane().add(seatNumber[i]);
			}
			
			for(int i=24;i<32;i++) {//For loop for array of JButton [24] to [32]
				seatNumber[i]= new JButton(Economy[i]);
				seatNumber[i].setBackground(new Color(126, 192, 236));
				seatNumber[i].setForeground(new Color(255, 255, 255));
				seatNumber[i].setFont(new Font("Tahoma", Font.PLAIN, 9));
				seatNumber[i].setBounds(230,yCounter6+=20, 51, 21);
				getContentPane().add(seatNumber[i]);
			}
			
			for(int i=32;i<40;i++) {//For loop for array of JButton [32] to [40]
				seatNumber[i]= new JButton(Economy[i]);
				seatNumber[i].setBackground(new Color(126, 192, 236));
				seatNumber[i].setForeground(new Color(255, 255, 255));
				seatNumber[i].setFont(new Font("Tahoma", Font.PLAIN, 9));
				seatNumber[i].setBounds(281,yCounter7+=20, 51, 21);
				getContentPane().add(seatNumber[i]);
			}
			
			for(int i=40;i<48;i++) {//For loop for array of JButton [40] to [48]
				seatNumber[i]= new JButton(Economy[i]);
				seatNumber[i].setBackground(new Color(126, 192, 236));
				seatNumber[i].setForeground(new Color(255, 255, 255));
				seatNumber[i].setFont(new Font("Tahoma", Font.PLAIN, 9));
				seatNumber[i].setBounds(332,yCounter8+=20, 51, 21);
				getContentPane().add(seatNumber[i]);
			}
	}
}