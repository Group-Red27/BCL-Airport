import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
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
import java.util.ArrayList;

public class SeatingPlanDesign extends JFrame {
	
	private JPanel contentPane;
	public JComboBox numOfTicketsComboBox;
	public JLabel returnSeatNumbersLabel;
	public  JLabel departureSeatNumbersLabel;
	AirbusA318_JDiolog airbus;
	Boeing747_JDiolog boeing;
	SeatingPlan seatingPlan = new SeatingPlan(null, null);
	


	/**
	 * Launch the application.
	 
	
	 * Create the frame.
	 
	
	
	 * @param returnFlight 
	
	*/
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArrayList<String> SeatsSelected = new ArrayList<String>();
					
					HardCodedData data = new HardCodedData();
					Flightclass arrival = data.flights[0];
					Flightclass departure = data.flights[1];
					
					

					
					
					SeatingPlanDesign frame = new SeatingPlanDesign(SeatsSelected,departure,arrival);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public SeatingPlanDesign(ArrayList<String> SeatNumber,Flightclass departureflight, Flightclass returnFlight) {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 265);
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
		
		JComboBox <Integer> numOfTicketsComboBox = new JComboBox<Integer>();
		numOfTicketsComboBox.setModel(new DefaultComboBoxModel<Integer>(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12,
																						13,14,15,16,17,18,19,20,21,22,23,24,
																						25,26,27,28,29,30,31,32,33,34,35,36,37,
																						38,39,40,41,42,43,44,45,46,47,48,49,50,
																						51,52,53,54,55,56,57,58,59,60,61,62,63,64}));
		numOfTicketsComboBox.setBounds(150, 79, 38, 17);
		
		contentPane.add(numOfTicketsComboBox);
		
		JLabel numOfTicketsLabel = new JLabel("Number Of Tickets: ");
		numOfTicketsLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		numOfTicketsLabel.setForeground(new Color(0, 0, 255));
		numOfTicketsLabel.setBounds(34, 80, 121, 14);
		contentPane.add(numOfTicketsLabel);
		
		JButton viewSeatingPlanButton = new JButton("View Seating Plan");
		viewSeatingPlanButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		viewSeatingPlanButton.setBackground(new Color(0, 0, 128));
		viewSeatingPlanButton.setForeground(new Color(255, 255, 255));
		viewSeatingPlanButton.setBounds(50, 113, 138, 23);
		contentPane.add(viewSeatingPlanButton);
		
		viewSeatingPlanButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Flightclass[] flights = {departureflight, returnFlight};
				
				for (int i=0; i<2;i++) 
				{
					
					String Title;
					if(i==0) {
						Title = "Departure";
					}
					else {
						Title = "Arrival";
					}
					
					if(seatingPlan.planeSeatingPlan(flights[i])==true) 
					{
						
						String selectedTicketNum = numOfTicketsComboBox.getSelectedItem().toString();
						Title += " Boeing747";
						Boeing747_JDiolog b = new Boeing747_JDiolog(selectedTicketNum,Title);
						b.setVisible(true);
						setVisible(false);
						
					}
					
					else 
					{
						String selectedTicketNum = numOfTicketsComboBox.getSelectedItem().toString();
						Title += " AirbusA138";
						AirbusA318_JDiolog a = new AirbusA318_JDiolog(selectedTicketNum,Title);
						a.setVisible(true);
						setVisible(false);
					}
					
				}
			}
			
		});
		
		
		JLabel SeatsSelected = new JLabel("Seats Selected: ");
		SeatsSelected.setFont(new Font("Tahoma", Font.BOLD, 11));
		SeatsSelected.setForeground(new Color(0, 0, 255));
		SeatsSelected.setHorizontalAlignment(SwingConstants.CENTER);
		SeatsSelected.setBounds(300, 80, 100, 14);
		contentPane.add(SeatsSelected);
		
		
		JTextPane SelectedSeatsLabel = new JTextPane();
		if (SeatNumber != null) 
		{
			SelectedSeatsLabel.setText(java.lang.String.join(",", SeatNumber));
		}
		SelectedSeatsLabel.setForeground(new Color(0, 0, 255));
		SelectedSeatsLabel.setBounds(410, 80, 79, 17);
		contentPane.add(SelectedSeatsLabel);
	
		
		
		
		JButton completeTicketDetailsPlanButton = new JButton("Complete Ticket Details");
		completeTicketDetailsPlanButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		completeTicketDetailsPlanButton.setForeground(Color.WHITE);
		completeTicketDetailsPlanButton.setBackground(new Color(0, 0, 128));
		completeTicketDetailsPlanButton.setBounds(169, 163, 179, 23);
		completeTicketDetailsPlanButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(SelectedSeatsLabel==null)
				{
					pop_plane popup = new pop_plane();
					popup.showErrorMessage("Must select seats");
				}
				
				else
				{
					PassengerUI passenger = new PassengerUI();  
					passenger.setVisible(true);
					setVisible(false);

					
					
				}
				
			}			
		});
		
		contentPane.add(completeTicketDetailsPlanButton);
		
		
	}
}


