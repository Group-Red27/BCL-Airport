import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JTabbedPane;

public class FlightArrivalMap_UI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final JComponent Button = null;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FlightArrivalMap_UI frame = new FlightArrivalMap_UI();
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
	@SuppressWarnings("null")
	public FlightArrivalMap_UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 650);
		ImageIcon Image= new ImageIcon(this.getClass().getResource("map.png"));
	
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JPanel toppanel = new JPanel();
		toppanel.setBackground(new Color(25, 25, 112));
		toppanel.setBounds(0, 0, 1000, 60);
		contentPane.add(toppanel);
		toppanel.setLayout(null);
		
		JButton btnNewButton = new JButton("Departure");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(847, 0, 143, 60);
		toppanel.add(btnNewButton);
		
		JButton btnArrivals = new JButton("Arrivals");
		btnArrivals.setForeground(new Color(248, 248, 255));
		btnArrivals.setBackground(new Color(0, 0, 205));
		btnArrivals.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnArrivals.setBounds(700, 0, 143, 60);
		toppanel.add(btnArrivals);
		
		JButton btnFinance = new JButton("Finance");
		btnFinance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Checkout Finance = new Checkout();
				Finance.setVisible(true);
				setVisible (false);
			}
		});
		btnFinance.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnFinance.setBounds(553, 0, 143, 60);
		toppanel.add(btnFinance);
		
		JButton btnRestaurant = new JButton("Restaurant");
		btnRestaurant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RestaurantSelectionScreen RSSpage= new RestaurantSelectionScreen();
				RSSpage.setVisible(true);
				setVisible (false);
			}
		});
		btnRestaurant.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRestaurant.setBounds(405, 0, 143, 60);
		toppanel.add(btnRestaurant);
		
		JButton btnFlights = new JButton("Flights");
		btnFlights.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FlightUI Flightpage = new FlightUI();
				Flightpage.setVisible(true);
				setVisible(false);
			}
		});
		btnFlights.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnFlights.setBounds(258, 0, 143, 60);
		toppanel.add(btnFlights);
		
		JPanel bottompanel = new JPanel();
		bottompanel.setBackground(Color.WHITE);
		bottompanel.setBounds(0, 60, 1000, 590);
		contentPane.add(bottompanel);
		bottompanel.setLayout(null);
		
		JLabel DEL = new JLabel("DEL");
		DEL.setFont(new Font("Tahoma", Font.BOLD, 12));
		DEL.setForeground(new Color(25, 25, 112));
		DEL.setBounds(646, 239, 31, 14);
		bottompanel.add(DEL);
		
		JLabel MapLabel = new JLabel("");
		MapLabel.setIcon(new ImageIcon("C:\\Users\\sweet\\git\\BCL-Airport\\src\\map.png"));
		MapLabel.setBounds(0, 0, 1000, 561);
		bottompanel.add(MapLabel);
		
//		JComponent buttonPanel = null;
//		buttonPanel.setForeground(new Color(0, 0, 128));
//		buttonPanel.setBackground(new Color(0, 0, 128));
//		contentPane.add(buttonPanel, BorderLayout.NORTH);
//		
//		JButton btnNewButton = new JButton("New button");
//		btnNewButton.setBounds(5, 5, 978, 23);
//		contentPane.add(btnNewButton);
//		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
//		
//		JButton flightsButton = new JButton("Flights");
//		flightsButton.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				
//			}
//		});
//		buttonPanel.add(flightsButton);
//		flightsButton.setForeground(Color.BLACK);
//		flightsButton.setFont(new Font("Tahoma", Font.BOLD, 15));
//		flightsButton.setBackground(new Color(255, 255, 255));
//		
//		JButton arrivalButton = new JButton("Arrival");
//		Button.setEnabled(false);
//		Component Arrival;
//		buttonPanel.add(arrivalButton);
//		Button.setForeground(new Color(255, 255, 255));
//		Button.setBackground(new Color(0, 0, 128));
//		Button.setFont(new Font("Tahoma", Font.BOLD, 15));
//		

		
//		JButton departureButton = new JButton("Departures");
//		departureButton.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//			}
//		});
//		departureButton.setHorizontalAlignment(SwingConstants.RIGHT);
//		buttonPanel.add(departureButton);
//		departureButton.setBackground(new Color(255, 255, 255));
//		departureButton.setFont(new Font("Tahoma", Font.BOLD, 15));
//		
//		JButton arrivalButton1 = new JButton("Arrivals");
//		arrivalButton1.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				FlightArrivalMap_UI arrivalMap = new FlightArrivalMap_UI();
//				setVisible(false);
//				arrivalMap.setVisible(true);
//			}
//		});
//		arrivalButton1.setHorizontalAlignment(SwingConstants.RIGHT);
//		buttonPanel.add(arrivalButton1);
//		arrivalButton1.setBackground(new Color(255, 255, 255));
//		arrivalButton1.setFont(new Font("Tahoma", Font.BOLD, 15));
//		
	}
}
