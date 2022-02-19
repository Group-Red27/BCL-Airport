import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SeatingPlanDesign extends JFrame {
	
	private JPanel contentPane;
	public static SeatingPlanDesign instance;
	private JComboBox numOfTicketsComboBox;
	public JLabel returnSeatNumbersLabel;
	public JLabel departureSeatNumbersLabel;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeatingPlanDesign frame = new SeatingPlanDesign();
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
	public SeatingPlanDesign() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 387);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 139), 6, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel flightLabel = new JLabel("Flight Plan");
		flightLabel.setForeground(new Color(0, 0, 255));
		flightLabel.setHorizontalAlignment(SwingConstants.CENTER);
		flightLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		flightLabel.setBounds(10, 11, 514, 28);
		contentPane.add(flightLabel);
		
		JComboBox numOfTicketsComboBox = new JComboBox();
		numOfTicketsComboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		numOfTicketsComboBox.setBounds(140, 218, 38, 17);
		contentPane.add(numOfTicketsComboBox);
		
		JLabel numOfTicketsLabel = new JLabel("Number Of Tickets: ");
		numOfTicketsLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		numOfTicketsLabel.setForeground(new Color(0, 0, 255));
		numOfTicketsLabel.setBounds(24, 219, 121, 14);
		contentPane.add(numOfTicketsLabel);
		
		JButton viewSeatingPlanButton = new JButton("View Seating Plan");
		viewSeatingPlanButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		viewSeatingPlanButton.setBackground(new Color(0, 0, 128));
		viewSeatingPlanButton.setForeground(new Color(255, 255, 255));
		viewSeatingPlanButton.setBounds(40, 252, 138, 23);
		contentPane.add(viewSeatingPlanButton);
		
		
		viewSeatingPlanButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AirbusA318_JDiolog A = new AirbusA318_JDiolog();
				A.setVisible(true);
			}	
			});
		
		
		JLabel departureSeatsLabel = new JLabel("Departure Seats: ");
		departureSeatsLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		departureSeatsLabel.setForeground(new Color(0, 0, 255));
		departureSeatsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		departureSeatsLabel.setBounds(290, 219, 100, 14);
		contentPane.add(departureSeatsLabel);
		
		JLabel returnSeatsLabel = new JLabel("Return Seats: ");
		returnSeatsLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		returnSeatsLabel.setForeground(new Color(0, 0, 255));
		returnSeatsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		returnSeatsLabel.setBounds(290, 256, 100, 14);
		contentPane.add(returnSeatsLabel);
		
		
		
		JLabel departureSeatNumbersLabel = new JLabel("..............");
		departureSeatNumbersLabel.setForeground(new Color(0, 0, 255));
		departureSeatNumbersLabel.setBounds(416, 219, 46, 14);
		contentPane.add(departureSeatNumbersLabel);
	
		
		JLabel returnSeatNumbersLabel = new JLabel("..............");
		returnSeatNumbersLabel.setForeground(new Color(0, 0, 255));
		returnSeatNumbersLabel.setBounds(416, 256, 46, 14);
		contentPane.add(returnSeatNumbersLabel);
		
		JButton completeTicketDetailsPlanButton = new JButton("Complete Ticket Details");
		completeTicketDetailsPlanButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		completeTicketDetailsPlanButton.setForeground(Color.WHITE);
		completeTicketDetailsPlanButton.setBackground(new Color(0, 0, 128));
		completeTicketDetailsPlanButton.setBounds(159, 302, 179, 23);
		contentPane.add(completeTicketDetailsPlanButton);
		
		
	instance=this;}
	

}
