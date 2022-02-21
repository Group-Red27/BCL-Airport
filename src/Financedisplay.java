import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Images_Finance.Finance_final_payment;

import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.CardLayout;
import java.awt.Label;
import java.awt.Font;
import java.awt.Button;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;

public class Financedisplay extends JFrame {
	
	Data data = Data.getInstance();

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Financedisplay frame = new Financedisplay();
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
	public Financedisplay() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel top_panel = new JPanel();
		top_panel.setBounds(0, 0, 1283, 90);
		contentPane.add(top_panel);
		top_panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Financedisplay.class.getResource("/Images_Finance/BrunelLogo.png")));
		lblNewLabel.setBounds(3, 5, 394, 90);
		top_panel.add(lblNewLabel);
		
		JPanel header1 = new JPanel();
		header1.setBounds(0, 0, 1283, 30);
		top_panel.add(header1);
		header1.setBackground(Color.LIGHT_GRAY);
		header1.setLayout(null);
		
		JPanel header2 = new JPanel();
		header2.setBounds(0, 30, 1283, 30);
		top_panel.add(header2);
		header2.setBackground(new Color(25, 25, 112));
		header2.setLayout(null);
		
		JButton btnCheckout = new JButton("Checkout");
		btnCheckout.setBounds(1130, 5, 90, 20);
		header2.add(btnCheckout);
		
		JButton btnArrivals = new JButton("Arrivals");
		btnArrivals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FlightArrivalMap_UI arrivalsWindow = new FlightArrivalMap_UI();
				setVisible(false);
				arrivalsWindow.setVisible(true);
			}
		});
		btnArrivals.setBounds(1030, 5, 90, 20);
		header2.add(btnArrivals);
		
		JButton btnDepartures = new JButton("Departures");
		btnDepartures.setBounds(930, 5, 90, 20);
		header2.add(btnDepartures);
		
		JButton btnRestaurant = new JButton("Restaurant");
		btnRestaurant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RestaurantSelectionScreen restaurantWindow = new RestaurantSelectionScreen();
				setVisible(false);
				restaurantWindow.setVisible(true);
			}
		});
		btnRestaurant.setBounds(830, 5, 90, 20);
		header2.add(btnRestaurant);
		
		JButton btnFlights = new JButton("Flights");
		btnFlights.setBounds(730, 5, 90, 20);
		header2.add(btnFlights);
		
		JPanel header3 = new JPanel();
		header3.setBackground(Color.LIGHT_GRAY);
		header3.setBounds(0, 60, 1283, 30);
		top_panel.add(header3);
		
		JPanel bottom_panel = new JPanel();
		bottom_panel.setBackground(new Color(0, 128, 128));
		bottom_panel.setBounds(0, 90, 1283, 610);
		contentPane.add(bottom_panel);
		bottom_panel.setLayout(new CardLayout(0, 0));
		
		JPanel nopurchase_panel = new JPanel();
		bottom_panel.add(nopurchase_panel, "name_421831182649000");
		nopurchase_panel.setLayout(null);
		
		JTextPane payment_general_txt = new JTextPane();
		payment_general_txt.setFont(new Font("Tahoma", Font.BOLD, 13));
		payment_general_txt.setText("          Payments are calculated based on your selections. If you don't agree to the totals, please revisit flights and restaurant pages to check & confirm your details");
		payment_general_txt.setBackground(Color.WHITE);
		payment_general_txt.setBounds(50, 555, 1180, 30);
		nopurchase_panel.add(payment_general_txt);
		
		JTextPane textboarder = new JTextPane();
		textboarder.setBackground(new Color(25, 25, 112));
		textboarder.setBounds(40, 550, 1200, 40);
		nopurchase_panel.add(textboarder);
		
		JLabel lblNewLabel_1 = new JLabel("Your cart is empty ..........");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(40, 40, 214, 30);
		nopurchase_panel.add(lblNewLabel_1);
		
		JButton payment_btn1 = new JButton("Proceed to payments");
		payment_btn1.setEnabled(false);
		payment_btn1.setFont(new Font("Tahoma", Font.BOLD, 13));
		payment_btn1.setIcon(new ImageIcon(Financedisplay.class.getResource("/Images_Finance/Payment btn.png")));
		payment_btn1.setBounds(940, 500, 287, 30);
		nopurchase_panel.add(payment_btn1);
		
		JPanel financetable_panel = new JPanel();
		bottom_panel.add(financetable_panel, "name_421871914575400");
		financetable_panel.setLayout(null);
		
		JTextPane payment_general_txt_1 = new JTextPane();
		payment_general_txt_1.setText("          Payments are calculated based on your selections. If you don't agree to the totals, please revisit flights and restaurant pages to check & confirm your details");
		payment_general_txt_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		payment_general_txt_1.setBackground(Color.WHITE);
		payment_general_txt_1.setBounds(50, 555, 1180, 30);
		financetable_panel.add(payment_general_txt_1);
		
		JTextPane textboarder_1 = new JTextPane();
		textboarder_1.setBackground(new Color(25, 25, 112));
		textboarder_1.setBounds(40, 550, 1200, 40);
		financetable_panel.add(textboarder_1);
		
		JButton realpymnt_btn = new JButton("Proceed to payments");		
		realpymnt_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Finance_final_payment finalPaymentScreen = new Finance_final_payment();
				setVisible(false);
				finalPaymentScreen.setVisible(true);
			}
		});
		realpymnt_btn.setIcon(new ImageIcon(Financedisplay.class.getResource("/Images_Finance/Payment btn.png")));
		realpymnt_btn.setFont(new Font("Tahoma", Font.BOLD, 13));
		realpymnt_btn.setBounds(940, 500, 290, 30);
		financetable_panel.add(realpymnt_btn);
	}
}
