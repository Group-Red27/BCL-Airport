import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.TextField;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.TextArea;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Button;
import java.awt.List;
import java.awt.Label;
import javax.swing.JMenuItem;
import javax.swing.JComboBox;

public class FlightUI extends JFrame {
	
	ArrayList<Flightclass> flights = null; 

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FlightUI frame = new FlightUI();
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
	public FlightUI() {
	
		this.flights = ((Data) Data.getInstance()).getFlights();
		
		System.out.print(flights.size());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 515);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(25, 25, 112));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel textField = new JLabel();
		textField.setFont(new Font("Dialog", Font.PLAIN, 6));
		textField.setBackground(Color.WHITE);
		textField.setText("From");
		textField.setBounds(0, 77, 46, 21);
		contentPane.add(textField);
		
		JLabel textField_1 = new JLabel();
		textField_1.setFont(new Font("Dialog", Font.PLAIN, 6));
		textField_1.setText("Depart");
		textField_1.setBounds(0, 158, 58, 21);
		contentPane.add(textField_1);
		
		JLabel textField_2 = new JLabel();
		textField_2.setFont(new Font("Dialog", Font.PLAIN, 6));
		textField_2.setText("To");
		textField_2.setBounds(375, 77, 38, 27);
		contentPane.add(textField_2);
		
		TextField textField_3 = new TextField();
		textField_3.setFont(new Font("Dialog", Font.PLAIN, 6));
		textField_3.setText("Return");
		textField_3.setBounds(375, 158, 64, 27);
		contentPane.add(textField_3);
		
		TextField textField_4 = new TextField();
		textField_4.setFont(new Font("Dialog", Font.PLAIN, 6));
		textField_4.setText("Shop");
		textField_4.setBounds(358, 0, 64, 27);
		contentPane.add(textField_4);
		
		TextField textField_5 = new TextField();
		textField_5.setFont(new Font("Dialog", Font.PLAIN, 6));
		textField_5.setText("Restaurant");
		textField_5.setBounds(464, 0, 142, 27);
		contentPane.add(textField_5);
		
		TextField textField_6 = new TextField();
		textField_6.setFont(new Font("Dialog", Font.BOLD, 6));
		textField_6.setText("Finance");
		textField_6.setBounds(643, 0, 95, 27);
		contentPane.add(textField_6);
		
		List list = new List();
		list.setBounds(91, 88, 135, 21);
		contentPane.add(list);
		
		List list_1 = new List();
		list_1.setBounds(91, 164, 135, 21);
		contentPane.add(list_1);
		
		List list_2 = new List();
		list_2.setBounds(464, 83, 135, 21);
		contentPane.add(list_2);
		
		List list_3 = new List();
		list_3.setBounds(486, 164, 135, 21);
		contentPane.add(list_3);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(0, 277, 355, 204);
		contentPane.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(383, 277, 355, 204);
		contentPane.add(textPane_1);
		
		TextField textField_1_1 = new TextField();
		textField_1_1.setText("Departures");
		textField_1_1.setFont(new Font("Dialog", Font.PLAIN, 6));
		textField_1_1.setBounds(50, 228, 95, 27);
		contentPane.add(textField_1_1);
		
		TextField textField_1_2 = new TextField();
		textField_1_2.setText("Arrivals");
		textField_1_2.setFont(new Font("Dialog", Font.PLAIN, 6));
		textField_1_2.setBounds(452, 228, 75, 21);
		contentPane.add(textField_1_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(258, 171, 30, 32);
		
		for (int i=0; i<this.flights.size(); i++) {
			Flightclass f = this.flights.get(i);
			comboBox.addItem(f.getArivalairport());
		}
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(643, 171, 30, 32);
		contentPane.add(comboBox_1);
		
	}
}
