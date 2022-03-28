import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FlightArrivalMapCurrent_UI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FlightArrivalMapCurrent_UI frame = new FlightArrivalMapCurrent_UI();
					frame.setVisible(true);
				} catch (Exception p) {
					p.printStackTrace();
				
					
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FlightArrivalMapCurrent_UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 50, 423, 210);
		contentPane.add(textPane);
		
		JButton btnNewButton = new JButton(" Arrivals");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FlightArrivalMap_UI frame= new FlightArrivalMap_UI ();
				frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(10, 16, 89, 23);
		contentPane.add(btnNewButton);
		
		// make the flight data refresh every 5 minute
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
		  @Override
		  public void run() {
			  
		
			// to clear the text pane whenever it refreshes 
			 textPane.setText("");
				ArrayList<Flightclass>  flightarrival= new ArrayList<Flightclass>();
			Data data = Data.getInstance();
			flightarrival = data.flights;
				//System.out.println(thisAir.size() + " : " + base.airName);
				
				int i;
				// run a for loop for the size of the arraylist
				for(i = 0; i< flightarrival .size();i++) {
					// getting the current time and formatting it
					Date date = new Date();
					SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
					// format the date in HH:MM
					// split the formatted date by :
					// 0 element of the split array is the hour and 1 element is the minute
					// covert the minute and hour into integer
					// multiply the hour by 60 and add the minutes to it
					int time = (Integer.valueOf(((sdf.format(date)).split(":"))[0]) * 60) + Integer.valueOf(((sdf.format(date)).split(":"))[1]);
					
					// check if the arrival airport is BCL
					if(flightarrival.get(i).getArivalairport().equals("BCL")) {
						// setting the values of the flight in variables
						DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm");
						LocalDate airport = flightarrival.get(i).getDateofflight();
			        	String arrivalAir = flightarrival.get(i).getArivalairport();
			            String arrivTime = dtf1.format(flightarrival.get(i).getArrivaltime());
			        	String depAir = flightarrival.get(i).getDepartureairport();
			        	LocalTime depTime = flightarrival.get(i).getDeparturetime();
			        	// Splitting the arrival time by :
			     
			        	String hr = arrivTime.split(":")[0];
			        	String min = arrivTime.split(":")[1];
			        	System.out.println(hr);
			        
			        	
			        	// multiplying the hour by 60 and add minutes to it
			        	int time1 = (Integer.valueOf(hr) * 60) + Integer.valueOf(min);
			    		
			        	//create a string which will be put up on the textpane
			        	String row = airport + "  " + arrivalAir + "    " + arrivTime + "    " + depAir + "    " + depTime + "\n";
			        	
			        	// create a styled document to work with the text colour
			        	StyledDocument doc = (StyledDocument) textPane.getDocument();
			        	// create a simple attribute set which will allow us to set the attributes of the text pane and the values in it
			        	SimpleAttributeSet highL = new SimpleAttributeSet();
			        	
			        	// check whether the arrival time of the flight is within 30 minutes of the live time
			        	if(time1 - time <= 30) {
			        		// make them red then
			        		StyleConstants.setForeground(highL, Color.RED);
			        	}
			        	else {
			        		// if not keep them black
			        		StyleConstants.setForeground(highL, Color.BLACK);
			        	}
			        	// checking if the arriving flight is after the current time
			        	if(time1 - time >= 0) {
				        	try {
				        		// if it is then add the string row to the textpane
								doc.insertString(doc.getLength(), row, highL);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
			        	}
			        	

			        	
			        	
			        	
					}
					
				}
		  }
		}, 0, 300000);

	}
}
