import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Component;

public class FlightArrivalMap_UI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final JComponent Button = null;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FlightArrivalMap_UI frame = new FlightArrivalMap_UI();
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
	@SuppressWarnings("null")
	public FlightArrivalMap_UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 650);
		ImageIcon Image= new ImageIcon(this.getClass().getResource("map.png"));
		JLabel lblNewLabel=new JLabel(Image);
		lblNewLabel.setBackground(Color.BLUE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(lblNewLabel);
		setContentPane(contentPane);
		
		JComponent buttonPanel = null;
		buttonPanel.setForeground(new Color(0, 0, 128));
		buttonPanel.setBackground(new Color(0, 0, 128));
		contentPane.add(buttonPanel, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("New button");
		contentPane.add(btnNewButton, BorderLayout.NORTH);
		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton flightsButton = new JButton("Flights");
		flightsButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		buttonPanel.add(flightsButton);
		flightsButton.setForeground(Color.BLACK);
		flightsButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		flightsButton.setBackground(new Color(255, 255, 255));
		
		JButton arrivalButton = new JButton("Arrival");
		Button.setEnabled(false);
		Component Arrival;
		buttonPanel.add(arrivalButton);
		Button.setForeground(new Color(255, 255, 255));
		Button.setBackground(new Color(0, 0, 128));
		Button.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton FianaceButton = new JButton("Finance");
		AbstractButton financeButton;
		financeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		financeButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		buttonPanel.add(financeButton);
		Button.setBackground(new Color(255, 255, 255));
		Button.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton departureButton = new JButton("Departures");
		departureButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		departureButton.setHorizontalAlignment(SwingConstants.RIGHT);
		buttonPanel.add(departureButton);
		departureButton.setBackground(new Color(255, 255, 255));
		departureButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton arrivalButton1 = new JButton("Arrivals");
		arrivalButton1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FlightArrivalMap_UI arrivalMap = new FlightArrivalMap_UI();
				setVisible(false);
				arrivalMap.setVisible(true);
			}
		});
		arrivalButton1.setHorizontalAlignment(SwingConstants.RIGHT);
		buttonPanel.add(arrivalButton1);
		arrivalButton1.setBackground(new Color(255, 255, 255));
		arrivalButton1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
	}

}
