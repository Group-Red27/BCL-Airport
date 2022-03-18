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
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;

public class FlightArrivalMap_UI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final JComponent Button = null;
	protected static final String JLabel = null;
	private JPanel contentPane;
	public static String airportName;
	

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
		setBounds(100, 100, 1424, 650);
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
		
		JLabel lblDub = new JLabel("DUB");
		lblDub.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				airportName = ((JLabel) e.getSource()).getText(); // will get the airport name from JLabel
				airportFlight frame = new airportFlight(); // makes a new frame
				frame.setVisible(true); //show.
			}
		});
		lblDub.setForeground(new Color(25, 25, 112));
		lblDub.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDub.setBounds(378, 139, 31, 15);
		bottompanel.add(lblDub);
		
		JLabel lblLos = new JLabel("LOS");
		lblLos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				airportName = ((JLabel) e.getSource()).getText(); // will get the airport name from JLabel
				airportFlight frame = new airportFlight(); // makes a new frame
				frame.setVisible(true); //show.
			}
		});
		lblLos.setForeground(new Color(25, 25, 112));
		lblLos.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLos.setBounds(432, 288, 31, 14);
		bottompanel.add(lblLos);
		
		JLabel lblJNB = new JLabel("JNB");
		lblJNB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				airportName = ((JLabel) e.getSource()).getText(); // will get the airport name from JLabel
				airportFlight frame = new airportFlight(); // makes a new frame
				frame.setVisible(true); //show.
			}
		});
		lblJNB.setForeground(new Color(25, 25, 112));
		lblJNB.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblJNB.setBounds(469, 418, 31, 14);
		bottompanel.add(lblJNB);
		
		JLabel lblDfw = new JLabel("DFW");
		lblDfw.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				airportName = ((JLabel) e.getSource()).getText(); // will get the airport name from JLabel
				airportFlight frame = new airportFlight(); // makes a new frame
				frame.setVisible(true); //show.
			}
		});
		lblDfw.setForeground(new Color(25, 25, 112));
		lblDfw.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDfw.setBounds(118, 206, 31, 15);
		bottompanel.add(lblDfw);
		
		JLabel lblLvs = new JLabel("LVS");
		lblLvs.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				airportName = ((JLabel) e.getSource()).getText(); // will get the airport name from JLabel
				airportFlight frame = new airportFlight(); // makes a new frame
				frame.setVisible(true); //show.
				}
		});
		lblLvs.setForeground(new Color(25, 25, 112));
		lblLvs.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLvs.setBounds(77, 192, 31, 15);
		bottompanel.add(lblLvs);
		
		JLabel lblMex = new JLabel("MEX");
		lblMex.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				airportName = ((JLabel) e.getSource()).getText(); // will get the airport name from JLabel
				airportFlight frame = new airportFlight(); // makes a new frame
				frame.setVisible(true); //show.
			}
		});
		lblMex.setForeground(new Color(25, 25, 112));
		lblMex.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMex.setBounds(98, 229, 31, 15);
		bottompanel.add(lblMex);
		
		JLabel lblJfk = new JLabel("JFK");
		lblJfk.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				airportName = ((JLabel) e.getSource()).getText(); // will get the airport name from JLabel
				airportFlight frame = new airportFlight(); // makes a new frame
				frame.setVisible(true); //show.
			}
		});
		lblJfk.setForeground(new Color(25, 25, 112));
		lblJfk.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblJfk.setBounds(198, 180, 31, 15);
		bottompanel.add(lblJfk);
		
		JLabel lblYyz = new JLabel("YYZ");
		lblYyz.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				airportName = ((JLabel) e.getSource()).getText(); // will get the airport name from JLabel
				airportFlight frame = new airportFlight(); // makes a new frame
				frame.setVisible(true); //show.
			}
		});
		lblYyz.setForeground(new Color(25, 25, 112));
		lblYyz.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblYyz.setBounds(174, 156, 31, 15);
		bottompanel.add(lblYyz);
		
		JLabel lblGru = new JLabel("GRU");
		lblGru.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				airportName = ((JLabel) e.getSource()).getText(); // will get the airport name from JLabel
				airportFlight frame = new airportFlight(); // makes a new frame
				frame.setVisible(true); //show.
			}
		});
		lblGru.setForeground(new Color(25, 25, 112));
		lblGru.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGru.setBounds(261, 384, 31, 15);
		bottompanel.add(lblGru);
		
		JLabel lblRak = new JLabel("RAK");
		lblRak.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				airportName = ((JLabel) e.getSource()).getText(); // will get the airport name from JLabel
				airportFlight frame = new airportFlight(); // makes a new frame
				frame.setVisible(true); //show.
			}
		});
		lblRak.setForeground(new Color(25, 25, 112));
		lblRak.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRak.setBounds(388, 205, 31, 15);
		bottompanel.add(lblRak);
		
		JLabel lblLis = new JLabel("LIS");
		lblLis.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {	
				airportName = ((JLabel) e.getSource()).getText(); // will get the airport name from JLabel
			    airportFlight frame = new airportFlight(); // makes a new frame
			    frame.setVisible(true); //show.
			}
		});
		lblLis.setForeground(new Color(25, 25, 112));
		lblLis.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLis.setBounds(378, 179, 31, 15);
		bottompanel.add(lblLis);
		
		JLabel lblMad = new JLabel("MAD");
		lblMad.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				airportName = ((JLabel) e.getSource()).getText(); // will get the airport name from JLabel
				airportFlight frame = new airportFlight(); // makes a new frame
				frame.setVisible(true); //show.
			}
		});
		lblMad.setForeground(new Color(25, 25, 112));
		lblMad.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMad.setBounds(404, 179, 31, 15);
		bottompanel.add(lblMad);
		
		JLabel lblCdg = new JLabel("CDG");
		lblCdg.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				airportName = ((JLabel) e.getSource()).getText(); // will get the airport name from JLabel
				airportFlight frame = new airportFlight(); // makes a new frame
				frame.setVisible(true); //show.
			}
		});
		lblCdg.setForeground(new Color(25, 25, 112));
		lblCdg.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCdg.setBounds(412, 156, 31, 15);
		bottompanel.add(lblCdg);
		
		JLabel lblAms = new JLabel("AMS");
		lblAms.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				airportName = ((JLabel) e.getSource()).getText(); // will get the airport name from JLabel
				airportFlight frame = new airportFlight(); // makes a new frame
				frame.setVisible(true); //show.
			}
		});
		lblAms.setForeground(new Color(25, 25, 112));
		lblAms.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAms.setBounds(445, 140, 31, 15);
		bottompanel.add(lblAms);
		
		JLabel lblArn = new JLabel("ARN");
		lblArn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				airportName = ((JLabel) e.getSource()).getText(); // will get the airport name from JLabel
				airportFlight frame = new airportFlight(); // makes a new frame
				frame.setVisible(true); //show.
			}
		});
		lblArn.setForeground(new Color(25, 25, 112));
		lblArn.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblArn.setBounds(469, 118, 31, 15);
		bottompanel.add(lblArn);
		
		JLabel lblFco = new JLabel("FCO");
		lblFco.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				airportName = ((JLabel) e.getSource()).getText(); // will get the airport name from JLabel
				airportFlight frame = new airportFlight(); // makes a new frame
				frame.setVisible(true); //show.
			}
		});
		lblFco.setForeground(new Color(25, 25, 112));
		lblFco.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFco.setBounds(455, 179, 31, 15);
		bottompanel.add(lblFco);
		
		JLabel lblAth = new JLabel("ATH");
		lblAth.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				airportName = ((JLabel) e.getSource()).getText(); // will get the airport name from JLabel
				airportFlight frame = new airportFlight(); // makes a new frame
				frame.setVisible(true); //show.
			}
		});
		lblAth.setForeground(new Color(25, 25, 112));
		lblAth.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAth.setBounds(486, 192, 31, 15);
		bottompanel.add(lblAth);
		
		JLabel lblSvo = new JLabel("SVO");
		lblSvo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				airportName = ((JLabel) e.getSource()).getText(); // will get the airport name from JLabel
				airportFlight frame = new airportFlight(); // makes a new frame
				frame.setVisible(true); //show.
			}
		});
		lblSvo.setForeground(new Color(25, 25, 112));
		lblSvo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSvo.setBounds(534, 155, 31, 15);
		bottompanel.add(lblSvo);
		
		JLabel lblDxb = new JLabel("DXB");
		lblDxb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				airportName = ((JLabel) e.getSource()).getText(); // will get the airport name from JLabel
				airportFlight frame = new airportFlight(); // makes a new frame
				frame.setVisible(true); //show.
			}
		});
		lblDxb.setForeground(new Color(25, 25, 112));
		lblDxb.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDxb.setBounds(547, 240, 31, 14);
		bottompanel.add(lblDxb);
		
		JLabel lblCai = new JLabel("CAI");
		lblCai.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				airportName = ((JLabel) e.getSource()).getText(); // will get the airport name from JLabel
				airportFlight frame = new airportFlight(); // makes a new frame
				frame.setVisible(true); //show.
			}
		});
		lblCai.setForeground(new Color(25, 25, 112));
		lblCai.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCai.setBounds(498, 229, 31, 14);
		bottompanel.add(lblCai);
		
		JLabel lblHnd = new JLabel("HND");
		lblHnd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				airportName = ((JLabel) e.getSource()).getText(); // will get the airport name from JLabel
				airportFlight frame = new airportFlight(); // makes a new frame
				frame.setVisible(true); //show.
			}
		});
		lblHnd.setForeground(new Color(25, 25, 112));
		lblHnd.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblHnd.setBounds(814, 191, 31, 14);
		bottompanel.add(lblHnd);
		
		JLabel lblHkg = new JLabel("HKG");
		lblHkg.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				airportName = ((JLabel) e.getSource()).getText(); // will get the airport name from JLabel
				airportFlight frame = new airportFlight(); // makes a new frame
				frame.setVisible(true); //show.
			}
		});
		lblHkg.setForeground(new Color(25, 25, 112));
		lblHkg.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblHkg.setBounds(754, 228, 31, 14);
		bottompanel.add(lblHkg);
		
		JLabel lblSyd = new JLabel("SYD");
		lblSyd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				airportName = ((JLabel) e.getSource()).getText(); // will get the airport name from JLabel
				airportFlight frame = new airportFlight(); // makes a new frame
				frame.setVisible(true); //show.
			}
		});
		lblSyd.setForeground(new Color(25, 25, 112));
		lblSyd.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSyd.setBounds(854, 400, 31, 14);
		bottompanel.add(lblSyd);
		
		JLabel lblBkk = new JLabel("BKK");
		lblBkk.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				airportName = ((JLabel) e.getSource()).getText(); // will get the airport name from JLabel
				airportFlight frame = new airportFlight(); // makes a new frame
				frame.setVisible(true); //show.
			}
		});
		lblBkk.setForeground(new Color(25, 25, 112));
		lblBkk.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBkk.setBounds(721, 261, 31, 14);
		bottompanel.add(lblBkk);
		
		JLabel BCL = new JLabel("BCL");
		BCL.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				airportName = ((JLabel) e.getSource()).getText(); // will get the airport name from JLabel
				airportFlight frame = new airportFlight(); // makes a new frame
				frame.setVisible(true); //show.
				
				
			}
		});
		BCL.setForeground(new Color(25, 25, 112));
		BCL.setFont(new Font("Tahoma", Font.BOLD, 12));
		BCL.setBounds(412, 139, 23, 14);
		bottompanel.add(BCL);
		
		JLabel DEL = new JLabel("DEL");
		DEL.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				airportName = ((JLabel) e.getSource()).getText(); // will get the airport name from JLabel
				airportFlight frame = new airportFlight(); // makes a new frame
				frame.setVisible(true); //show.
			}
		});
		DEL.setFont(new Font("Tahoma", Font.BOLD, 12));
		DEL.setForeground(new Color(25, 25, 112));
		DEL.setBounds(646, 239, 31, 14);
		bottompanel.add(DEL);
		
	
		
		
		
		JLabel MapLabel = new JLabel("");
		MapLabel.setIcon(new ImageIcon("C:\\Users\\sweet\\git\\BCL-Airport\\src\\map.png"));
		MapLabel.setBounds(0, 0, 1000, 561);
		bottompanel.add(MapLabel);
		
	
		
	
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(1087, 58, 260, 546);
		contentPane.add(scrollPane);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(1087, 174, 260, 345);
		
		contentPane.add(scrollBar);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(1087, 174, 260, 345);
		scrollPane.setViewportView(textArea);
		
		Data data = Data.getInstance();
		ArrayList<Flightclass> flights;
		ArrayList<Flightclass> curFlights;
		flights = data.flights;
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm");
		String curDate = sdf.format(date);
		
		for(int i = 0;i < flights.size(); i++) {
			String flDate = dtf.format(flights.get(i).getdateofflight())+"";
			if (curDate.equals(flDate)) {
				
					String arrivalAir = flights.get(i).getArivalairport();
					String arrivTime = dtf1.format(flights.get(i).getArrivaltime());
					String depAir = flights.get(i).getDepartureairport();
					String depTime = dtf1.format(flights.get(i).getDeparturetime());
					String newArriv = calcDelay(flights.get(i));
					
					String row = flDate + " " + arrivalAir + " " + arrivTime + " " + depAir + " " + depTime + " " + newArriv;
					
					textArea.append(row);
					textArea.append("\n");
					
					
				
				
			}
		}
		
	}
	

		
		public static String calcDelay(Flightclass Flight) {
			
			// grab the value of the delay of the flight
			String newArrival = null;
			int i;
			int delay = Flight.getDelay();
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
			// if the delay is more than 30 minutes
			if (delay >= 30) {
				
				// get the arrival time and split it by :
				String arrivTime = dtf.format(Flight.getArrivaltime());
				String[] arrivTimeAr = arrivTime.split(":");
				
				// convert the arrival time to minyes
				int minutes = (Integer.valueOf(arrivTimeAr[0]) * 100) + Integer.valueOf(arrivTimeAr[1]);
				int newArriv = delay + minutes;
				
				// convert he minutes into hours and minutes
				int hr = Integer.valueOf(newArriv) / 100;
				int min = Integer.valueOf(newArriv) % 100;
				
				String minutes1 = null;
				
				// formatting the time in the correct values
				if (hr >= 24) {
					hr = hr - 24;
				
				}		
				
				if(min >= 60) {
					hr += 1;
					min = min - 60;
					if(min < 10) {
						minutes1 = "0" + min;
						
					}
					else {
						minutes1 = String.valueOf(min);
					}
					
				}
				else {
					if(min < 10) {
						minutes1 = "0" + min;
						
					}
					else {
						minutes1 = String.valueOf(min);
					}
				}
				System.out.println(minutes1);
				
				// set the new arrival time to a varuable
				if (hr < 10) {
					newArrival = "0" + hr + ":" + minutes1;
				}
			
				else {
					newArrival = hr + ":" + minutes1;
				}
				
				
				}
			// if the delay is less than 30 minutes do not change the arrival time
			else {
				newArrival = dtf.format(Flight.getArrivaltime());
			}
			// returns the new arrival time
			return newArrival;

			
		
		// delay box goes here
//		Data data = Data.getInstance();
//		ArrayList<Flightclass> flights = data.getFlights();
//		for (int i = 0; i < flights.size(); i++) {
//			
//			int delay = flights.get(i).getDelay();
//			flights.get(i).getDepartureairport();
//			if (delay >= 30) { 
//				
			//}
				
			// get the delay for flight[i] 
			// if the delay is ... then setText = red
			
			
		//}
		
		
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
//		arrivalButton1.setBackground(new Colour(255, 255, 255));
//		arrivalButton1.setFont(new Font("Tahoma", Font.BOLD, 15));
//		
	}
}
