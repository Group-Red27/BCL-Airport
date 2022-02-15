import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Panel;
import java.awt.Label;

public class Finance_GUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finance_GUI window = new Finance_GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Finance_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 750, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Finance_GUI.class.getResource("/Images_Finance/BrunelLogo.png")));
		lblNewLabel.setBounds(0, 0, 394, 75);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel header2 = new JPanel();
		header2.setBackground(new Color(0, 0, 128));
		header2.setBounds(0, 25, 736, 25);
		frame.getContentPane().add(header2);
		header2.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Checkout");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1.setBounds(626, 2, 100, 21);
		header2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Arrivals");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnNewButton_2.setBounds(502, 2, 100, 21);
		header2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Departures");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnNewButton_3.setBounds(377, 2, 100, 21);
		header2.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Restaurant");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnNewButton_4.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_4.setBounds(251, 2, 85, 21);
		header2.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Flight");
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnNewButton_5.setBounds(130, 2, 100, 21);
		header2.add(btnNewButton_5);
		
		JPanel header1 = new JPanel();
		header1.setBounds(0, 0, 736, 25);
		frame.getContentPane().add(header1);
		
		JPanel hearder3 = new JPanel();
		hearder3.setBounds(0, 50, 736, 25);
		frame.getContentPane().add(hearder3);
		hearder3.setLayout(null);
		
		JPanel mainpage = new JPanel();
		mainpage.setBackground(Color.WHITE);
		mainpage.setBounds(0, 75, 736, 388);
		frame.getContentPane().add(mainpage);
		mainpage.setLayout(null);
		
		JButton btnNewButton = new JButton("Proceed to payments");
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setIcon(new ImageIcon(Finance_GUI.class.getResource("/Images_Finance/Flight....png")));
		btnNewButton.setBounds(486, 302, 230, 20);
		mainpage.add(btnNewButton);
		
		JTextArea txtrAllPaymentsAre = new JTextArea();
		txtrAllPaymentsAre.setBackground(Color.LIGHT_GRAY);
		txtrAllPaymentsAre.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtrAllPaymentsAre.setBounds(26, 333, 678, 44);
		mainpage.add(txtrAllPaymentsAre);
		txtrAllPaymentsAre.setText("    All payments are calculated based on your selections. If you find any discripencies, please visit flight & restaurant \r\n     pages to check your details. No changes can be made on this page.");
	}
}
