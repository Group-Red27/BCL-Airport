import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JButton;

public class PaymentConfirmation extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaymentConfirmation frame = new PaymentConfirmation();
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
	public PaymentConfirmation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 636, 15);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(25, 25, 112));
		panel_1.setBounds(0, 15, 636, 15);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Payment Confirmation");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(205, 46, 226, 47);
		contentPane.add(lblNewLabel);
		
		JTextPane txtpnImportantInformation = new JTextPane();
		txtpnImportantInformation.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnImportantInformation.setText("\t**** Important Information ****\r\n\r\nYou are about to make your payment. Your total payment includes departure & return ticket prices, bag cost, restaurant order & shop spendings. Any delays in your departures will be compensate towards your payment automatically. If you have not make your order in restaurant or shop, do not proceed to the payment. Once you have completed the payment you cannot make more orders in restaurant or shop.\r\nIf you are ready, please make your payment now.");
		txtpnImportantInformation.setBounds(100, 120, 436, 190);
		contentPane.add(txtpnImportantInformation);
		
		JButton btnNewButton = new JButton("Payment");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(424, 329, 100, 25);
		contentPane.add(btnNewButton);
	}
}
