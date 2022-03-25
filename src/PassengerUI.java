import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class PassengerUI extends JFrame {

	private JPanel contentPane;
	private JTextField nameEntry;
	private JTextField SurName;
	private JTextField Email;
	private JTextField Tele;
	private JTextField txtBrunelCityAirport;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PassengerUI frame = new PassengerUI();
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
	public PassengerUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 564, 607);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("PASSENGER DETAILS");
		lblNewLabel_1.setBounds(15, 47, 258, 50);
		lblNewLabel_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Inconsolata", Font.BOLD, 21));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("First Name");
		lblNewLabel_2.setBounds(64, 133, 107, 26);
		lblNewLabel_2.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 18));
		lblNewLabel_2.setForeground(Color.DARK_GRAY);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Surname");
		lblNewLabel_2_1.setBounds(84, 182, 107, 26);
		lblNewLabel_2_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_2_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Date of Birth");
		lblNewLabel_2_1_1.setBounds(64, 228, 107, 26);
		lblNewLabel_2_1_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_2_1_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Email Address");
		lblNewLabel_2_1_1_1.setBounds(62, 275, 125, 26);
		lblNewLabel_2_1_1_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_2_1_1_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("Telephone Number");
		lblNewLabel_2_1_1_2.setBounds(44, 319, 165, 26);
		lblNewLabel_2_1_1_2.setForeground(Color.DARK_GRAY);
		lblNewLabel_2_1_1_2.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_2_1_1_2);
		
		JLabel lblNewLabel_2_1_1_3 = new JLabel("Bags");
		lblNewLabel_2_1_1_3.setBounds(102, 396, 70, 26);
		lblNewLabel_2_1_1_3.setForeground(Color.DARK_GRAY);
		lblNewLabel_2_1_1_3.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_2_1_1_3);
		
		JLabel lblNewLabel_2_1_1_3_1 = new JLabel("Departure Seat");
		lblNewLabel_2_1_1_3_1.setBounds(64, 433, 138, 26);
		lblNewLabel_2_1_1_3_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_2_1_1_3_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_2_1_1_3_1);
		
		JLabel lblNewLabel_2_1_1_3_1_1 = new JLabel("Return Seat");
		lblNewLabel_2_1_1_3_1_1.setBounds(84, 470, 107, 26);
		lblNewLabel_2_1_1_3_1_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_2_1_1_3_1_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_2_1_1_3_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(226, 396, 47, 22);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "1", "2", "3", "4", "5", "6", "7", "8", ""}));
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"", "1A", "6A", "11A"}));
		comboBox_1.setBounds(226, 433, 47, 22);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"", "1A", "6A", "11A"}));
		comboBox_2.setBounds(226, 470, 47, 22);
		contentPane.add(comboBox_2);
		
		JDateChooser DOB = new JDateChooser();
		DOB.setBounds(226, 228, 107, 20);
		contentPane.add(DOB);

		
		JButton btnNewButton = new JButton("Next");
		
		btnNewButton.setBounds(427, 516, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean validTicket = true;
				if(nameEntry.getText().length()==0) {
					JOptionPane.showMessageDialog(null, "Enter the First Name");
					validTicket = false;
				}
				else if(nameEntry.getText().length()<3){
					JOptionPane.showMessageDialog(null, "First Name Should be minimum of 3 characters");
					validTicket = false;
				}
				if(SurName.getText().length()==0) {
					JOptionPane.showMessageDialog(null, "Enter the Surname");
					validTicket = false;
				}	else if(SurName.getText().length()<3){
						JOptionPane.showMessageDialog(null, " Surname Should be minimum of 3 characters");
						validTicket = false;
				}
				if(DOB.getDate()==null) {
					JOptionPane.showMessageDialog(null, "Enter the DOB");
					validTicket = false;
				}
				if(Email.getText().length()==0) {
					JOptionPane.showMessageDialog(null, "Enter valid Email address");
					validTicket = false;
				}
				String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";

			      //Matching the given phone number with regular expression
			      boolean result = Email.getText().matches(regex);
			      if(result) {
			         JOptionPane.showMessageDialog(contentPane, "Email Verified!");
			      } else {
			         JOptionPane.showMessageDialog(contentPane, "Email not verified!");
			         
			      }
				

			    //Matching the given phone number with regular expression
			    boolean results = Email.getText().matches(regex);
			    if(results == false) {
			       JOptionPane.showMessageDialog(contentPane, "Enter valid Email address");
			       validTicket = false;
			    }

				
				if(Tele.getText().length()==0) {
					JOptionPane.showMessageDialog(null, "Enter the Telephone number");
					
					
					
				}
				
				
				if (validTicket == true) {
				Random rand = new Random();
				System.out.println(rand.nextInt(99999999));
				JOptionPane.showMessageDialog(contentPane, "Your ticket no. is " + rand.nextInt(99999999));
				setVisible(false);

				}
				
				
				
			
				
			}
			
			
		});
		contentPane.add(btnNewButton);
		
		nameEntry = new JTextField();
		nameEntry.setBounds(219, 134, 116, 20);
		contentPane.add(nameEntry);
		nameEntry.setColumns(10);
		
		SurName = new JTextField();
		SurName.setBounds(219, 183, 116, 20);
		SurName.setColumns(10);
		contentPane.add(SurName);
		
		Email = new JTextField();
		Email.setBounds(219, 276, 116, 20);
		Email.setColumns(10);
		contentPane.add(Email);
		
		Tele = new JTextField();
		Tele.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE) {
					e.consume();
				}
				
			}});
		Tele.setBounds(219, 320, 116, 20);
		Tele.setColumns(10);
		contentPane.add(Tele);
		
		txtBrunelCityAirport = new JTextField();
		txtBrunelCityAirport.setCaretColor(Color.GRAY);
		txtBrunelCityAirport.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtBrunelCityAirport.setForeground(Color.BLUE);
		txtBrunelCityAirport.setText("BRUNEL CITY AIRPORT");
		txtBrunelCityAirport.setBackground(Color.LIGHT_GRAY);
		txtBrunelCityAirport.setBounds(20, 27, 208, 33);
		contentPane.add(txtBrunelCityAirport);
		txtBrunelCityAirport.setColumns(10);
		


		}
		
}
	
		
		
		



