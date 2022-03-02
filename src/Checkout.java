import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class Checkout extends JFrame {
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Checkout frame = new Checkout();
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
	public Checkout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 650)
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Ticket ticket;
		Finance finance = new Finance(null);
		
//		finance.anError();
//		finance.calBagCost();
	//	System.out.println("anything");
		
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Checkout.class.getResource("/Images_Finance/BrunelLogo.png")));
//		lblNewLabel.setIcon(new ImageIcon(Checkout.class.getResource("../BrunelLogo.png")));
		lblNewLabel.setBounds(0, 0, 390, 90);
		contentPane.add(lblNewLabel);
		
		JPanel header1 = new JPanel();
		header1.setBackground(Color.LIGHT_GRAY);
		header1.setBounds(0, 0, 1200, 30);
		contentPane.add(header1);
		header1.setLayout(null);
		
		JPanel header2 = new JPanel();
		header2.setBackground(new Color(25, 25, 112));
		header2.setBounds(0, 30, 1200, 30);
		contentPane.add(header2);
		header2.setLayout(null);
		
		JButton btnCheckout = new JButton("Checkout");
		btnCheckout.setBackground(new Color(112, 128, 144));
		btnCheckout.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCheckout.setBounds(1040, 2, 100, 26);
		header2.add(btnCheckout);
		
		JButton btnArrivals = new JButton("Arrivals");
		btnArrivals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FlightArrivalMap_UI ArrivalScreen = new FlightArrivalMap_UI();
				ArrivalScreen.setVisible(true); // not opening now, need to find out //
				setVisible(false);
			}
		});
		btnArrivals.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnArrivals.setBounds(930, 2, 100, 26);
		header2.add(btnArrivals);
		
		JButton btnDepartures = new JButton("Departures");
		btnDepartures.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDepartures.setBounds(820, 2, 100, 26);
		header2.add(btnDepartures);
		
		JButton btnRestaurant = new JButton("Restaurant");
		btnRestaurant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RestaurantSelectionScreen RestaurantScreen = new RestaurantSelectionScreen ();
				RestaurantScreen.setVisible(true);
				setVisible(false);
			}
		});
		btnRestaurant.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRestaurant.setBounds(710, 2, 100, 26);
		header2.add(btnRestaurant);
		
		JButton btnFlights = new JButton("Flights");
		btnFlights.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FlightUI FlightsScreen = new FlightUI();
				FlightsScreen.setVisible(true); // not opening flight page , need to find out //
				setVisible(false);
			}
		});
		btnFlights.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnFlights.setBounds(600, 2, 100, 26);
		header2.add(btnFlights);
		
		JPanel header3 = new JPanel();
		header3.setLayout(null);
		header3.setBackground(Color.LIGHT_GRAY);
		header3.setBounds(0, 60, 1200, 30);
		contentPane.add(header3);
		
		JPanel mainContentpanel = new JPanel();
		mainContentpanel.setBounds(0, 90, 1186, 523);
		contentPane.add(mainContentpanel);
		mainContentpanel.setLayout(null);
		
		JTextPane PaymentText = new JTextPane();
		PaymentText.setBounds(83, 445, 1020, 50);
		PaymentText.setFont(new Font("Tahoma", Font.BOLD, 14));
		PaymentText.setText("  All payments are calculated based on your selections. If you  don't agree to the totals, please visit flights & shop pages to reconfirm your details");
		mainContentpanel.add(PaymentText);
		
		JTextPane textborder = new JTextPane();
		textborder.setBounds(73, 440, 1040, 60);
		textborder.setBackground(new Color(25, 25, 112));
		mainContentpanel.add(textborder);
		
		JButton btnNewButton = new JButton("Proceed to payments");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PaymentConfirmation paymentScreen = new PaymentConfirmation();
				paymentScreen.setVisible(true);
//				setVisible(false); /// can I leave main screen not visible ???? ////
				
			}
		});
		btnNewButton.setIcon(new ImageIcon(Checkout.class.getResource("/Images_Finance/Payment Icon.png")));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(863, 384, 250, 50);
		mainContentpanel.add(btnNewButton);
	
		String[] columnNames = {"First Name", "Surname", "Date Of Birth","Ticket No","Bag Cost","Ticket Price","Food Cost", "Product Cost", "Compensation", "TotalCost"};
		int numRows = finance.defineNoTableRows();
		Object[][] tableData = new Object[numRows][10];
		Data data = Data.getInstance();
		for (int i = 0; i < numRows; i++) {
			
			// calculating what is needed with methods from finance			
			double compensation = finance.calcompensation(data.getTickets().get(i).getDelaysInDeparture());
			data.getTickets().get(i).setCompensation(compensation);
			double bagCost = finance.calBagCost(data.getTickets().get(i).getNoOfBags());
			data.getTickets().get(i).setBagCost(bagCost);			
			double ticketPrice = finance.calTicketPrice(); // what shall I pass in brackets
			data.getTickets().get(i).setTicketPrice(ticketPrice);
			
			
			// display data by getting from ticket
			tableData[i][0] = data.getTickets().get(i).getFirstName();
			tableData[i][1] = data.getTickets().get(i).getLastName();
			tableData[i][2] = data.getTickets().get(i).getDateOfBirth();
			tableData[i][3] = data.getTickets().get(i).getTicketNumber();
			tableData[i][4] = data.getTickets().get(i).getBagCost();
			tableData[i][5] = data.getTickets().get(i).getTicketPrice();
			tableData[i][6] = data.getTickets().get(i).getFoodCost();
			tableData[i][7] = data.getTickets().get(i).getProductCost();
			tableData[i][8] = data.getTickets().get(i).getCompensation(); 
			tableData[i][9] = data.getTickets().get(i).getTotalCost();
		}
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(43, 30, 1100, 300);
		scrollPane.setBackground(new Color(25, 25, 112));
		mainContentpanel.add(scrollPane);
		
		table = new JTable(tableData,columnNames);
		table.setEnabled(false);
		table.setForeground(new Color(255, 255, 255));
		table.setToolTipText("");
		table.setBackground(Color.LIGHT_GRAY);
		table.setFont(new Font("Tahoma", Font.PLAIN, 11));
		table.setFillsViewportHeight(true);
		scrollPane.setViewportView(table);
		
		
	
	};

	}

