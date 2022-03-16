import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class airportFlight extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					airportFlight frame = new airportFlight();
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
	public airportFlight() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 11, 418, 243);
		//contentPane.add(textArea);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 418, 243);
		contentPane.add(scrollPane);
		scrollPane.setViewportView(textArea);
		
		Data data = Data.getInstance();
		ArrayList<Flightclass> flights;
		ArrayList<Flightclass> curFlights = null;
		flights = data.flights;
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm");
		String curDate = sdf.format(date);
		
		for(int i = 0;i < flights.size(); i++) {
			String flDate = dtf.format(flights.get(i).getdateofflight())+"";
			if (curDate.equals(flDate)) {
				if(flights.get(i).getArivalairport().equals(FlightArrivalMap_UI.airportName)){
					String arrivalAir = flights.get(i).getArivalairport();
					String arrivTime = dtf1.format(flights.get(i).getArrivaltime());
					String depAir = flights.get(i).getDepartureairport();
					String depTime = dtf1.format(flights.get(i).getDeparturetime());
					
					String row = flDate + " " + arrivalAir + " " + arrivTime + " " + depAir + " " + depTime;
					
					textArea.append(row);
					textArea.append("\n");
					
					
				}
				
			}
		}
		
	}
}
