import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JScrollBar;

public class RestaurantConfirmationScreen extends JFrame {

	private JPanel contentPane;
	private JTextField passengerNameEntry;
	private JTextField ticketNumberEntry;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RestaurantConfirmationScreen frame = new RestaurantConfirmationScreen();
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
	public RestaurantConfirmationScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setForeground(new Color(0, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Order Confirmation");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(43, 58, 293, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User update here!");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBackground(SystemColor.menu);
		lblNewLabel_1.setBounds(43, 298, 383, 40);
		contentPane.add(lblNewLabel_1);
		
		passengerNameEntry = new JTextField();
		passengerNameEntry.setBounds(178, 363, 208, 29);
		contentPane.add(passengerNameEntry);
		passengerNameEntry.setColumns(10);
		
		JButton confirmButton = new JButton("Confirm");
		confirmButton.setBackground(new Color(0, 0, 128));
		confirmButton.setForeground(new Color(255, 255, 255));
		confirmButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		confirmButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		confirmButton.setBounds(626, 393, 137, 29);
		contentPane.add(confirmButton);
		
		ticketNumberEntry = new JTextField();
		ticketNumberEntry.setColumns(10);
		ticketNumberEntry.setBounds(178, 393, 208, 29);
		contentPane.add(ticketNumberEntry);
		
		JButton backButton = new JButton("Back");
		backButton.setBackground(new Color(255, 255, 255));
		backButton.setForeground(new Color(0, 0, 128));
		backButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		backButton.setBounds(463, 393, 137, 29);
		contentPane.add(backButton);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(772, 125, 17, 112);
		contentPane.add(scrollBar);
		
		JLabel lblNewLabel_2 = new JLabel("Full Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(43, 363, 125, 29);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Ticket Number");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(43, 393, 125, 29);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Total");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2.setBounds(506, 269, 74, 29);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("PRICE HERE");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_3.setBounds(590, 269, 173, 29);
		contentPane.add(lblNewLabel_2_3);
	}
}
