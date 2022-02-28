import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PassengerUI extends JFrame {

	private JPanel contentPane;

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
		
		JTextPane txtpnBrunelCityAirport = new JTextPane();
		txtpnBrunelCityAirport.setBackground(Color.LIGHT_GRAY);
		txtpnBrunelCityAirport.setFont(new Font("Adobe Arabic", Font.BOLD | Font.ITALIC, 39));
		txtpnBrunelCityAirport.setForeground(Color.BLACK);
		txtpnBrunelCityAirport.setText("BRUNEL CITY AIRPORT");
		txtpnBrunelCityAirport.setBounds(5, 5, 355, 50);
		contentPane.add(txtpnBrunelCityAirport);
		
		JLabel lblNewLabel = new JLabel("BRUNEL CITY AIRPORT");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PASSENGER 1 DETAILS");
		lblNewLabel_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Inconsolata", Font.BOLD, 21));
		lblNewLabel_1.setBounds(15, 47, 258, 50);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("First Name");
		lblNewLabel_2.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 18));
		lblNewLabel_2.setForeground(Color.DARK_GRAY);
		lblNewLabel_2.setBounds(64, 133, 107, 26);
		contentPane.add(lblNewLabel_2);
		
		JTextPane nameEntry = new JTextPane();
		nameEntry.setBounds(219, 133, 116, 20);
		contentPane.add(nameEntry);
		
		JLabel lblNewLabel_2_1 = new JLabel("Surname");
		lblNewLabel_2_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_2_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 18));
		lblNewLabel_2_1.setBounds(84, 182, 107, 26);
		contentPane.add(lblNewLabel_2_1);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(219, 182, 116, 20);
		contentPane.add(textPane_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Date of Birth");
		lblNewLabel_2_1_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_2_1_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 18));
		lblNewLabel_2_1_1.setBounds(64, 228, 107, 26);
		contentPane.add(lblNewLabel_2_1_1);
		
		JTextPane textPane_1_1 = new JTextPane();
		textPane_1_1.setBounds(219, 234, 116, 20);
		contentPane.add(textPane_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Email Address");
		lblNewLabel_2_1_1_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_2_1_1_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 18));
		lblNewLabel_2_1_1_1.setBounds(62, 275, 125, 26);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		JTextPane textPane_1_1_1 = new JTextPane();
		textPane_1_1_1.setBounds(219, 281, 116, 20);
		contentPane.add(textPane_1_1_1);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("Telephone Number");
		lblNewLabel_2_1_1_2.setForeground(Color.DARK_GRAY);
		lblNewLabel_2_1_1_2.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 18));
		lblNewLabel_2_1_1_2.setBounds(44, 331, 165, 26);
		contentPane.add(lblNewLabel_2_1_1_2);
		
		JTextPane textPane_1_1_1_1 = new JTextPane();
		textPane_1_1_1_1.setBounds(219, 331, 116, 20);
		contentPane.add(textPane_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_3 = new JLabel("Bags");
		lblNewLabel_2_1_1_3.setForeground(Color.DARK_GRAY);
		lblNewLabel_2_1_1_3.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 18));
		lblNewLabel_2_1_1_3.setBounds(102, 396, 70, 26);
		contentPane.add(lblNewLabel_2_1_1_3);
		
		JLabel lblNewLabel_2_1_1_3_1 = new JLabel("Departure Seat");
		lblNewLabel_2_1_1_3_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_2_1_1_3_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 18));
		lblNewLabel_2_1_1_3_1.setBounds(64, 433, 138, 26);
		contentPane.add(lblNewLabel_2_1_1_3_1);
		
		JLabel lblNewLabel_2_1_1_3_1_1 = new JLabel("Return Seat");
		lblNewLabel_2_1_1_3_1_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_2_1_1_3_1_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 18));
		lblNewLabel_2_1_1_3_1_1.setBounds(84, 470, 107, 26);
		contentPane.add(lblNewLabel_2_1_1_3_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4"}));
		comboBox.setBounds(226, 396, 47, 22);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(226, 433, 47, 22);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(226, 470, 47, 22);
		contentPane.add(comboBox_2);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Passengers P = new Passengers();
				boolean validName = P.validateName(nameEntry); 
			}
			
			
		});
		btnNewButton.setBounds(427, 516, 89, 23);
		contentPane.add(btnNewButton);
	}
}
