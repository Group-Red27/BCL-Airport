import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.TextField;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.UIManager;
import javax.swing.JTextArea;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
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
import javax.swing.JCheckBox;
import java.awt.event.KeyEvent;

public class FlightUI extends JFrame {
	
	ArrayList<Flightclass> flights = null; 

	private JPanel contentPane;
	Data data;

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
		setBounds(100, 100, 750, 620);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("CheckBoxMenuItem.selectionBackground"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel textField = new JLabel();
		textField.setFont(new Font("Dialog", Font.PLAIN, 16));
		textField.setBackground(Color.WHITE);
		textField.setText("From");
		textField.setBounds(0, 167, 75, 32);
		contentPane.add(textField);
		
		JLabel textField_1 = new JLabel();
		textField_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		textField_1.setText("Depart");
		textField_1.setBounds(0, 260, 58, 21);
		contentPane.add(textField_1);
		
		JLabel textField_2 = new JLabel();
		textField_2.setFont(new Font("Dialog", Font.PLAIN, 16));
		textField_2.setText("To");
		textField_2.setBounds(416, 170, 38, 27);
		contentPane.add(textField_2);
		
		JLabel textField_3 = new JLabel();
		textField_3.setFont(new Font("Dialog", Font.PLAIN, 16));
		textField_3.setText("Return");
		textField_3.setBounds(358, 257, 64, 27);
		contentPane.add(textField_3);
		
		JLabel textField_4 = new JLabel();
		textField_4.setFont(new Font("Dialog", Font.PLAIN, 16));
		textField_4.setText("Shop");
		textField_4.setBounds(358, 0, 64, 27);
		contentPane.add(textField_4);
		
		JLabel textField_5 = new JLabel();
		textField_5.setFont(new Font("Dialog", Font.PLAIN, 16));
		textField_5.setText("Restaurant");
		textField_5.setBounds(464, 0, 142, 27);
		contentPane.add(textField_5);
		
		JLabel textField_6 = new JLabel();
		textField_6.setFont(new Font("Dialog", Font.BOLD, 16));
		textField_6.setText("Finance");
		textField_6.setBounds(643, 0, 95, 27);
		contentPane.add(textField_6);
		
		List list = new List();
		list.setBounds(81, 178, 135, 21);
		contentPane.add(list);
		
		List list_1 = new List();
		list_1.setBounds(91, 260, 135, 21);
		contentPane.add(list_1);
		
		List list_2 = new List();
		list_2.setBounds(501, 178, 135, 21);
		contentPane.add(list_2);
		
		List list_3 = new List();
		list_3.setBounds(464, 260, 135, 21);
		contentPane.add(list_3);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(0, 382, 355, 204);
		contentPane.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(383, 382, 355, 204);
		contentPane.add(textPane_1);
		
		JLabel textField_1_1 = new JLabel();
		textField_1_1.setText("Departures");
		textField_1_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		textField_1_1.setBounds(26, 325, 95, 27);
		contentPane.add(textField_1_1);
		
		JLabel textField_1_2 = new JLabel();
		textField_1_2.setText("Arrivals");
		textField_1_2.setFont(new Font("Dialog", Font.PLAIN, 16));
		textField_1_2.setBounds(495, 328, 75, 21);
		contentPane.add(textField_1_2);
		
		JComboBox<LocalDate> comboBox = new JComboBox<LocalDate>();
		comboBox.setBounds(228, 260, 100, 23);
		
		for (int i=0; i<this.flights.size(); i++) {
			Flightclass f = this.flights.get(i);
			comboBox.addItem(f.getdateofflight());
		}
		contentPane.add(comboBox);

		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(649, 257, 38, 32);
		contentPane.add(comboBox_2);
	
		
		ImageIcon icon = new ImageIcon("BrunelLogo.png");
		JLabel imageHolder=new JLabel(icon);
		imageHolder.setBounds(-100, 0, 600, 100);
		contentPane.add(imageHolder);

		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(643, 171, 30, 32);
		for (int i=0; i<this.flights.size(); i++) {
			Flightclass f = this.flights.get(i);
			comboBox_1.addItem(f.getdateofflight());
		    contentPane.add(comboBox_1);
		
	}
	}

	
}
