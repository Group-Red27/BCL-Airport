import java.awt.BorderLayout;
import java.awt.EventQueue;
// test comment
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JSplitPane;
import java.awt.SystemColor;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;

public class RestaurantSelectionScreen extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RestaurantSelectionScreen frame = new RestaurantSelectionScreen();
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
	public RestaurantSelectionScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 650);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel button_panel = new JPanel();
		button_panel.setForeground(new Color(0, 0, 128));
		button_panel.setBackground(new Color(0, 0, 128));
		contentPane.add(button_panel, BorderLayout.NORTH);
		button_panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton flightsButton = new JButton("Flights");
		flightsButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		button_panel.add(flightsButton);
		flightsButton.setForeground(Color.BLACK);
		flightsButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		flightsButton.setBackground(new Color(255, 255, 255));
		
		JButton restuarantButton = new JButton("Restuarant");
		restuarantButton.setEnabled(false);
		button_panel.add(restuarantButton);
		restuarantButton.setForeground(new Color(255, 255, 255));
		restuarantButton.setBackground(new Color(0, 0, 128));
		restuarantButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton financeButton = new JButton("Finance");
		financeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Popup popup = new Popup();
				popup.showSuccessMessage("Seating plan");
				System.out.println("return to page here");
			}
		});
		financeButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		button_panel.add(financeButton);
		financeButton.setBackground(new Color(255, 255, 255));
		financeButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton departureButton = new JButton("Departures");
		departureButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		departureButton.setHorizontalAlignment(SwingConstants.RIGHT);
		button_panel.add(departureButton);
		departureButton.setBackground(new Color(255, 255, 255));
		departureButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton arrivalButton = new JButton("Arrivals");
		arrivalButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		arrivalButton.setHorizontalAlignment(SwingConstants.RIGHT);
		button_panel.add(arrivalButton);
		arrivalButton.setBackground(new Color(255, 255, 255));
		arrivalButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JPanel main_panel = new JPanel();
		main_panel.setBackground(Color.WHITE);
		contentPane.add(main_panel, BorderLayout.CENTER);
		main_panel.setLayout(null);
		
		JPanel items_panel = new JPanel();
		items_panel.setBounds(30, 76, 589, 468);
		main_panel.add(items_panel);
		items_panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		items_panel.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(118, 86, 68, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(118, 200, 68, 19);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(118, 326, 68, 19);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Chicken Noodles");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(0, 10, 196, 19);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_7 = new JLabel("Chicken Noodles");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(37, 115, 110, 19);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Chicken Noodles");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_8.setBounds(37, 229, 110, 19);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("\u00A310.99");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_9.setBounds(17, 86, 53, 19);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_9_3 = new JLabel("\u00A310.99");
		lblNewLabel_9_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_9_3.setBounds(17, 200, 53, 19);
		panel.add(lblNewLabel_9_3);
		
		JLabel lblNewLabel_9_5_1_2 = new JLabel("\u00A310.99");
		lblNewLabel_9_5_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_9_5_1_2.setBounds(17, 324, 53, 19);
		panel.add(lblNewLabel_9_5_1_2);
		
		JLabel lblNewLabel_8_1 = new JLabel("Chicken Noodles");
		lblNewLabel_8_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_8_1.setBounds(37, 355, 110, 19);
		panel.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_9_6 = new JLabel("\u00A310.99");
		lblNewLabel_9_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_9_6.setBounds(17, 439, 53, 19);
		panel.add(lblNewLabel_9_6);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(118, 441, 68, 19);
		panel.add(textField_9);
		
		JPanel panel_1 = new JPanel();
		items_panel.add(panel_1);
		panel_1.setLayout(null);
		
		textField_3 = new JTextField();
		textField_3.setBounds(118, 86, 68, 19);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(118, 200, 68, 19);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setText("");
		textField_5.setBounds(118, 326, 68, 19);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Chicken Noodles");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(0, 10, 196, 19);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_5 = new JLabel("Chicken Noodles");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(44, 115, 110, 19);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Chicken Noodles");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(44, 229, 110, 19);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_9_1 = new JLabel("\u00A310.99");
		lblNewLabel_9_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_9_1.setBounds(17, 86, 53, 19);
		panel_1.add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_9_4 = new JLabel("\u00A310.99");
		lblNewLabel_9_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_9_4.setBounds(17, 200, 53, 19);
		panel_1.add(lblNewLabel_9_4);
		
		JLabel lblNewLabel_9_5_1_1 = new JLabel("\u00A310.99");
		lblNewLabel_9_5_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_9_5_1_1.setBounds(17, 324, 53, 19);
		panel_1.add(lblNewLabel_9_5_1_1);
		
		JLabel lblNewLabel_8_2 = new JLabel("Chicken Noodles");
		lblNewLabel_8_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_8_2.setBounds(44, 357, 110, 19);
		panel_1.add(lblNewLabel_8_2);
		
		JLabel lblNewLabel_9_7 = new JLabel("\u00A310.99");
		lblNewLabel_9_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_9_7.setBounds(17, 439, 53, 19);
		panel_1.add(lblNewLabel_9_7);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(118, 441, 68, 19);
		panel_1.add(textField_10);
		
		JPanel panel_2 = new JPanel();
		items_panel.add(panel_2);
		panel_2.setLayout(null);
		
		textField_6 = new JTextField();
		textField_6.setBounds(118, 86, 68, 19);
		panel_2.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(118, 200, 68, 19);
		panel_2.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(118, 326, 68, 19);
		panel_2.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Chicken Noodles");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(39, 115, 110, 19);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Chicken Noodles");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(39, 229, 110, 19);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_9_2 = new JLabel("\u00A310.99");
		lblNewLabel_9_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_9_2.setBounds(17, 84, 53, 19);
		panel_2.add(lblNewLabel_9_2);
		
		JLabel lblNewLabel_9_5 = new JLabel("\u00A310.99");
		lblNewLabel_9_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_9_5.setBounds(17, 203, 53, 19);
		panel_2.add(lblNewLabel_9_5);
		
		JLabel lblNewLabel_9_5_1 = new JLabel("\u00A310.99");
		lblNewLabel_9_5_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_9_5_1.setBounds(17, 324, 53, 19);
		panel_2.add(lblNewLabel_9_5_1);
		
		JLabel lblNewLabel_8_3 = new JLabel("Chicken Noodles");
		lblNewLabel_8_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_8_3.setBounds(39, 355, 110, 19);
		panel_2.add(lblNewLabel_8_3);
		
		JLabel lblNewLabel_9_8 = new JLabel("\u00A310.99");
		lblNewLabel_9_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_9_8.setBounds(17, 439, 53, 19);
		panel_2.add(lblNewLabel_9_8);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(118, 441, 68, 19);
		panel_2.add(textField_11);
		
		JLabel lblNewLabel_2 = new JLabel("Chicken Noodles");
		lblNewLabel_2.setBounds(0, 10, 196, 19);
		panel_2.add(lblNewLabel_2);
		lblNewLabel_2.setBackground(new Color(0, 0, 128));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JPanel info_panel = new JPanel();
		info_panel.setBackground(SystemColor.menu);
		info_panel.setBounds(641, 25, 151, 477);
		main_panel.add(info_panel);
		info_panel.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("Brunel City");
		lblNewLabel_2_1.setBounds(10, 10, 130, 42);
		lblNewLabel_2_1.setForeground(new Color(128, 128, 128));
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		info_panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Restaurant");
		lblNewLabel_2_1_1.setForeground(new Color(128, 128, 128));
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2_1_1.setBounds(10, 43, 130, 42);
		info_panel.add(lblNewLabel_2_1_1);
		
		JButton purchaseButton = new JButton("Purchase");
		purchaseButton.setBounds(20, 424, 109, 29);
		info_panel.add(purchaseButton);
		purchaseButton.setForeground(new Color(255, 255, 255));
		purchaseButton.setBackground(new Color(0, 0, 128));
		purchaseButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		purchaseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// move screens
				String[][] data = {
			            { "Noodles", "�1.99", "1", "�1.99" },
			            { "Noodles", "�1.99", "1", "�1.99" },
			            { "Noodles", "�1.99", "1", "�1.99" },
			            { "Noodles", "�1.99", "1", "�1.99" },
			            { "Noodles", "�1.99", "1", "�1.99" },
			            { "Noodles", "�1.99", "1", "�1.99" }
			           
			        };
				RestaurantConfirmationScreen confirmationScreen = new RestaurantConfirmationScreen(data);
				setVisible(false);
				confirmationScreen.setVisible(true);
			}
		});
		
		JPanel title_panel = new JPanel();
		title_panel.setBounds(29, 25, 590, 41);
		main_panel.add(title_panel);
		title_panel.setLayout(null);
		
		JLabel meal_Label = new JLabel("Meals");
		meal_Label.setFont(new Font("Tahoma", Font.BOLD, 20));
		meal_Label.setForeground(new Color(0, 0, 128));
		meal_Label.setBounds(66, 14, 62, 19);
		title_panel.add(meal_Label);
		
		JLabel snack_Label = new JLabel("Snacks");
		snack_Label.setForeground(new Color(0, 0, 128));
		snack_Label.setFont(new Font("Tahoma", Font.BOLD, 20));
		snack_Label.setBounds(263, 14, 79, 19);
		title_panel.add(snack_Label);
		
		JLabel drinks_Label = new JLabel("Drinks");
		drinks_Label.setFont(new Font("Tahoma", Font.BOLD, 20));
		drinks_Label.setForeground(new Color(0, 0, 128));
		drinks_Label.setBounds(456, 14, 72, 19);
		title_panel.add(drinks_Label);
	}
}
