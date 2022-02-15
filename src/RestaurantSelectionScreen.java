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
import java.util.ArrayList;

import javax.swing.border.LineBorder;
import javax.swing.JTextPane;

public class RestaurantSelectionScreen extends JFrame {

	private JPanel contentPane;
	private JTextField entry1;
	private JTextField entry2;
	private JTextField entry3;
	private JTextField entry5;
	private JTextField entry6;
	private JTextField entry7;
	private JTextField entry9;
	private JTextField entry10;
	private JTextField entry11;
	private JTextField textField_9;
	private JTextField entry8;
	private JTextField entry12;
	private JTextField entry4;

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
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setForeground(new Color(0, 0, 128));
		buttonPanel.setBackground(new Color(0, 0, 128));
		contentPane.add(buttonPanel, BorderLayout.NORTH);
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
		
		JButton restuarantButton = new JButton("Restuarant");
		restuarantButton.setEnabled(false);
		buttonPanel.add(restuarantButton);
		restuarantButton.setForeground(new Color(255, 255, 255));
		restuarantButton.setBackground(new Color(0, 0, 128));
		restuarantButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton financeButton = new JButton("Finance");
		financeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Finance_GUI financeScreen = new Finance_GUI();
				setVisible(false);
				financeScreen.main(null);
				// might need to delete main after this 
			}
		});
		financeButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		buttonPanel.add(financeButton);
		financeButton.setBackground(new Color(255, 255, 255));
		financeButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		
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
		
		JButton arrivalButton = new JButton("Arrivals");
		arrivalButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FlightArrivalMap_UI arrivalMap = new FlightArrivalMap_UI();
				setVisible(false);
				arrivalMap.setVisible(true);
			}
		});
		arrivalButton.setHorizontalAlignment(SwingConstants.RIGHT);
		buttonPanel.add(arrivalButton);
		arrivalButton.setBackground(new Color(255, 255, 255));
		arrivalButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(Color.WHITE);
		contentPane.add(mainPanel, BorderLayout.CENTER);
		mainPanel.setLayout(null);
		
		JPanel itemsPanel = new JPanel();
		itemsPanel.setBorder(new LineBorder(new Color(0, 0, 128)));
		itemsPanel.setBounds(30, 76, 589, 468);
		mainPanel.add(itemsPanel);
		itemsPanel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel mealPanel = new JPanel();
		mealPanel.setBorder(new LineBorder(new Color(0, 0, 128)));
		itemsPanel.add(mealPanel);
		mealPanel.setLayout(null);
		
		entry1 = new JTextField();
		entry1.setBounds(118, 86, 68, 19);
		mealPanel.add(entry1);
		entry1.setColumns(10);
		
		entry2 = new JTextField();
		entry2.setBounds(118, 200, 68, 19);
		mealPanel.add(entry2);
		entry2.setColumns(10);
		
		entry3 = new JTextField();
		entry3.setBounds(118, 326, 68, 19);
		mealPanel.add(entry3);
		entry3.setColumns(10);
		
		entry4 = new JTextField();
		entry4.setColumns(10);
		entry4.setBounds(118, 439, 68, 19);
		mealPanel.add(entry4);
		
		JLabel label1 = new JLabel("Chicken Noodles");
		label1.setForeground(new Color(255, 255, 255));
		label1.setBackground(new Color(0, 0, 128));
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label1.setBounds(0, 0, 196, 19);
		label1.setOpaque(true);
		mealPanel.add(label1);
		
		JLabel label2 = new JLabel("Rice & Beef");
		label2.setForeground(new Color(255, 255, 255));
		label2.setBackground(new Color(0, 0, 128));
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setFont(new Font("Tahoma", Font.BOLD, 15));
		label2.setBounds(0, 115, 196, 19);
		label2.setOpaque(true);
		mealPanel.add(label2);
		
		JLabel label3 = new JLabel("Tofu Stir Fry");
		label3.setForeground(new Color(255, 255, 255));
		label3.setBackground(new Color(0, 0, 128));
		label3.setHorizontalAlignment(SwingConstants.CENTER);
		label3.setFont(new Font("Tahoma", Font.BOLD, 15));
		label3.setBounds(0, 229, 196, 19);
		label3.setOpaque(true);
		mealPanel.add(label3);
		
		JLabel label4 = new JLabel("Vegetable Dumpling");
		label4.setForeground(new Color(255, 255, 255));
		label4.setBackground(new Color(0, 0, 128));
		label4.setHorizontalAlignment(SwingConstants.CENTER);
		label4.setFont(new Font("Tahoma", Font.BOLD, 15));
		label4.setBounds(0, 355, 196, 19);
		label4.setOpaque(true);
		mealPanel.add(label4);
		
		JLabel price1 = new JLabel();
		price1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		price1.setBounds(17, 86, 53, 19);
		mealPanel.add(price1);
		
		JLabel price2 = new JLabel();
		price2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		price2.setBounds(17, 200, 53, 19);
		mealPanel.add(price2);
		
		JLabel price3 = new JLabel();
		price3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		price3.setBounds(17, 324, 53, 19);
		mealPanel.add(price3);
		
		JLabel price4 = new JLabel();
		price4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		price4.setBounds(17, 439, 53, 19);
		mealPanel.add(price4);
		
		JTextPane description1 = new JTextPane();
		description1.setEditable(false);
		description1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		description1.setBounds(10, 31, 176, 50);
		mealPanel.add(description1);
		
		JTextPane description2 = new JTextPane();
		description2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		description2.setEditable(false);
		description2.setBounds(10, 144, 176, 50);
		mealPanel.add(description2);
		
		JTextPane description3 = new JTextPane();
		description3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		description3.setEditable(false);
		description3.setBounds(10, 258, 176, 50);
		mealPanel.add(description3);
		
		JTextPane description4 = new JTextPane();
		description4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		description4.setEditable(false);
		description4.setBounds(10, 384, 176, 50);
		mealPanel.add(description4);
		
		
		JPanel snacksPanel = new JPanel();
		snacksPanel.setBorder(new LineBorder(new Color(0, 0, 128)));
		itemsPanel.add(snacksPanel);
		snacksPanel.setLayout(null);
		
		entry5 = new JTextField();
		entry5.setBounds(118, 86, 68, 19);
		snacksPanel.add(entry5);
		entry5.setColumns(10);
		
		entry6 = new JTextField();
		entry6.setBounds(118, 200, 68, 19);
		snacksPanel.add(entry6);
		entry6.setColumns(10);
		
		entry7 = new JTextField();
		entry7.setBounds(118, 326, 68, 19);
		snacksPanel.add(entry7);
		entry7.setColumns(10);
		
		entry8 = new JTextField();
		entry8.setColumns(10);
		entry8.setBounds(118, 441, 68, 19);
		snacksPanel.add(entry8);
		
		JLabel label5 = new JLabel("Crisps");
		label5.setBackground(new Color(0, 0, 128));
		label5.setForeground(new Color(255, 255, 255));
		label5.setHorizontalAlignment(SwingConstants.CENTER);
		label5.setFont(new Font("Tahoma", Font.BOLD, 15));
		label5.setBounds(0, 0, 196, 19);
		label5.setOpaque(true);
		label5.setOpaque(true);
		snacksPanel.add(label5);
		
		JLabel label6 = new JLabel("Peanuts");
		label6.setForeground(new Color(255, 255, 255));
		label6.setBackground(new Color(0, 0, 128));
		label6.setHorizontalAlignment(SwingConstants.CENTER);
		label6.setFont(new Font("Tahoma", Font.BOLD, 15));
		label6.setBounds(0, 115, 196, 19);
		label6.setOpaque(true);
		snacksPanel.add(label6);
		
		JLabel label7 = new JLabel("Sweets");
		label7.setForeground(new Color(255, 255, 255));
		label7.setBackground(new Color(0, 0, 128));
		label7.setHorizontalAlignment(SwingConstants.CENTER);
		label7.setFont(new Font("Tahoma", Font.BOLD, 15));
		label7.setBounds(0, 229, 196, 19);
		label7.setOpaque(true);
		snacksPanel.add(label7);
		
		JLabel label8 = new JLabel("Ice Cream");
		label8.setForeground(new Color(255, 255, 255));
		label8.setBackground(new Color(0, 0, 128));
		label8.setHorizontalAlignment(SwingConstants.CENTER);
		label8.setFont(new Font("Tahoma", Font.BOLD, 15));
		label8.setBounds(0, 355, 196, 19);
		label8.setOpaque(true);
		snacksPanel.add(label8);
		
		JLabel price5 = new JLabel();
		price5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		price5.setBounds(17, 86, 53, 19);
		snacksPanel.add(price5);
		
		JLabel price6 = new JLabel();
		price6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		price6.setBounds(17, 200, 53, 19);
		snacksPanel.add(price6);
		
		JLabel price7 = new JLabel();
		price7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		price7.setBounds(17, 324, 53, 19);
		snacksPanel.add(price7);
		
		JLabel price8 = new JLabel();
		price8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		price8.setBounds(17, 439, 53, 19);
		snacksPanel.add(price8);
		
		JTextPane description5 = new JTextPane();
		description5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		description5.setEditable(false);
		description5.setBounds(10, 144, 176, 50);
		snacksPanel.add(description5);
		
		JTextPane description6 = new JTextPane();
		description6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		description6.setEditable(false);
		description6.setBounds(10, 258, 176, 50);
		snacksPanel.add(description6);
		
		JTextPane description7 = new JTextPane();
		description7.setBounds(10, 32, 176, 50);
		snacksPanel.add(description7);
		description7.setFont(new Font("Tahoma", Font.PLAIN, 11));
		description7.setEditable(false);
		
		JTextPane description8 = new JTextPane();
		description8.setFont(new Font("Tahoma", Font.PLAIN, 11));
		description8.setEditable(false);
		description8.setBounds(10, 386, 176, 50);
		snacksPanel.add(description8);
		
		JPanel drinksPanel = new JPanel();
		drinksPanel.setBorder(new LineBorder(new Color(0, 0, 128)));
		itemsPanel.add(drinksPanel);
		drinksPanel.setLayout(null);
		
		
		entry9 = new JTextField();
		entry9.setBounds(118, 86, 68, 19);
		drinksPanel.add(entry9);
		entry9.setColumns(10);
		
		entry10 = new JTextField();
		entry10.setBounds(118, 200, 68, 19);
		drinksPanel.add(entry10);
		entry10.setColumns(10);
		
		entry11 = new JTextField();
		entry11.setBounds(118, 326, 68, 19);
		drinksPanel.add(entry11);
		entry11.setColumns(10);
		
		entry12 = new JTextField();
		entry12.setColumns(10);
		entry12.setBounds(118, 441, 68, 19);
		drinksPanel.add(entry12);

		
		JLabel label9 = new JLabel("Bottled Water");
		label9.setForeground(new Color(255, 255, 255));
		label9.setBounds(0, 0, 196, 19);
		drinksPanel.add(label9);
		label9.setBackground(new Color(0, 0, 128));
		label9.setHorizontalAlignment(SwingConstants.CENTER);
		label9.setOpaque(true);
		label9.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel label10 = new JLabel("Fizzy Drink");
		label10.setForeground(new Color(255, 255, 255));
		label10.setBackground(new Color(0, 0, 128));
		label10.setHorizontalAlignment(SwingConstants.CENTER);
		label10.setFont(new Font("Tahoma", Font.BOLD, 15));
		label10.setBounds(0, 115, 196, 19);
		label10.setOpaque(true);
		drinksPanel.add(label10);
		
		JLabel label11 = new JLabel("Juice");
		label11.setForeground(new Color(255, 255, 255));
		label11.setBackground(new Color(0, 0, 128));
		label11.setHorizontalAlignment(SwingConstants.CENTER);
		label11.setFont(new Font("Tahoma", Font.BOLD, 15));
		label11.setBounds(0, 229, 196, 19);
		label11.setOpaque(true);
		drinksPanel.add(label11);
		
		JLabel label12 = new JLabel("Beer");
		label12.setForeground(new Color(255, 255, 255));
		label12.setBackground(new Color(0, 0, 128));
		label12.setHorizontalAlignment(SwingConstants.CENTER);
		label12.setFont(new Font("Tahoma", Font.BOLD, 15));
		label12.setBounds(0, 355, 196, 19);
		label12.setOpaque(true);
		drinksPanel.add(label12);
		
		JLabel price9 = new JLabel();
		price9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		price9.setBounds(17, 84, 53, 19);
		drinksPanel.add(price9);
		
		JLabel price10 = new JLabel();
		price10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		price10.setBounds(17, 203, 53, 19);
		drinksPanel.add(price10);
		
		JLabel price11 = new JLabel();
		price11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		price11.setBounds(17, 324, 53, 19);
		drinksPanel.add(price11);

		JLabel price12 = new JLabel();
		price12.setFont(new Font("Tahoma", Font.PLAIN, 15));
		price12.setBounds(17, 439, 53, 19);
		drinksPanel.add(price12);
		
		JTextPane description9 = new JTextPane();
		description9.setFont(new Font("Tahoma", Font.PLAIN, 11));
		description9.setEditable(false);
		description9.setBounds(10, 31, 176, 50);
		drinksPanel.add(description9);
		
		JTextPane description10 = new JTextPane();
		description10.setFont(new Font("Tahoma", Font.PLAIN, 11));
		description10.setEditable(false);
		description10.setBounds(10, 143, 176, 50);
		drinksPanel.add(description10);
		
		JTextPane description11 = new JTextPane();
		description11.setFont(new Font("Tahoma", Font.PLAIN, 11));
		description11.setEditable(false);
		description11.setBounds(10, 258, 176, 50);
		drinksPanel.add(description11);
		
		JTextPane description12 = new JTextPane();
		description12.setFont(new Font("Tahoma", Font.PLAIN, 11));
		description12.setEditable(false);
		description12.setBounds(10, 384, 176, 50);
		drinksPanel.add(description12);

		Data data = Data.getInstance();
		// price test
		// using a loop to assign the prices from foodItem rather than setting them constant
		JLabel[] itemNames = {label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12};
		JLabel[] priceLabels = {price1,price2,price3,price4,price5,price6,price7,price8,price9,price10,price11,price12};
		JTextPane[] descriptionText = {description1,description2,description3,description4,description5,description6,description7,description8,description9,description10,description11,description12};
		JTextField[] entryList = {entry1,entry2,entry3,entry4,entry5,entry6,entry7,entry8,entry9,entry10,entry11,entry12};
		for (int i = 0; i < 12; i ++) {
			priceLabels[i].setText(String.format("£%.2f", data.itemsAvailable[i].getPrice()));
			descriptionText[i].setText(data.itemsAvailable[i].getDescription());
			itemNames[i].setText(data.itemsAvailable[i].getItemName());
			// entry markOutOfStock test
			if (data.itemsAvailable[i].getStockLevel() == 0) {
				entryList[i].enable(false);
				entryList[i].setBackground(Color.GRAY);
			} 
		}
		
		JPanel infoPanel = new JPanel();
		infoPanel.setBackground(SystemColor.menu);
		infoPanel.setBounds(641, 32, 151, 485);
		mainPanel.add(infoPanel);
		infoPanel.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("Brunel City");
		lblNewLabel_2_1.setBounds(10, 29, 130, 42);
		lblNewLabel_2_1.setForeground(new Color(128, 128, 128));
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		infoPanel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Restaurant");
		lblNewLabel_2_1_1.setForeground(new Color(128, 128, 128));
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2_1_1.setBounds(10, 62, 130, 42);
		infoPanel.add(lblNewLabel_2_1_1);
		
		JButton purchaseButton = new JButton("Purchase");
		purchaseButton.setBounds(20, 424, 109, 29);
		infoPanel.add(purchaseButton);
		purchaseButton.setForeground(new Color(255, 255, 255));
		purchaseButton.setBackground(new Color(0, 0, 128));
		purchaseButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JTextPane txtpnInvalidTicketNumber = new JTextPane();
		txtpnInvalidTicketNumber.setEditable(false);
		txtpnInvalidTicketNumber.setBackground(SystemColor.menu);
		txtpnInvalidTicketNumber.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnInvalidTicketNumber.setText("\r\nPlease enter the quantity of a desired product into the entry box before pressing 'Purchase'\r\n\r\nYou will be prompted to enter your NAME and TICKET NUMBER to complete a purchase");
		txtpnInvalidTicketNumber.setBounds(20, 116, 108, 272);
		infoPanel.add(txtpnInvalidTicketNumber);
		
		purchaseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// move screens
				FoodOrder order = new FoodOrder();
				boolean moveFrame = order.selectItems(entryList);
				if (moveFrame == true) {
					int rows = 0;
					ArrayList<Integer> index = new ArrayList<Integer>();
					for (int i = 0; i < 12; i++) {
						if (order.itemsSelected[i] == true) {
							rows += 1;
							index.add(i);
						}
					} // calc num of rows needed based on items selected and the index of selected items
					
					Object[][] tableData = new Object[rows][4];
					for (int i = 0; i < rows; i++ ) {
						tableData[i][0] = data.itemsAvailable[index.get(i)].getItemName();
						tableData[i][1] = String.format("£%.2f",data.itemsAvailable[index.get(i)].getPrice());
						tableData[i][2] = order.getQuantity()[index.get(i)];
						tableData[i][3] = String.format("£%.2f",order.getNetPrices()[index.get(i)]); 
					}  //create data for table 
					
					RestaurantConfirmationScreen confirmationScreen = new RestaurantConfirmationScreen(order,tableData);
					setVisible(false);
					confirmationScreen.setVisible(true);
				} // end of if statement, if false, do nothing 
			}
		});
		
		JPanel titlePanel = new JPanel();
		titlePanel.setBounds(29, 25, 590, 41);
		mainPanel.add(titlePanel);
		titlePanel.setLayout(null);
		
		JLabel mealsLabel = new JLabel("Meals");
		mealsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		mealsLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		mealsLabel.setForeground(new Color(0, 0, 128));
		mealsLabel.setBounds(0, 0, 197, 41);
		titlePanel.add(mealsLabel);
		
		JLabel snacksLabel = new JLabel("Snacks");
		snacksLabel.setHorizontalAlignment(SwingConstants.CENTER);
		snacksLabel.setForeground(new Color(0, 0, 128));
		snacksLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		snacksLabel.setBounds(207, 0, 188, 41);
		titlePanel.add(snacksLabel);
		
		JLabel drinksLabel = new JLabel("Drinks");
		drinksLabel.setHorizontalAlignment(SwingConstants.CENTER);
		drinksLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		drinksLabel.setForeground(new Color(0, 0, 128));
		drinksLabel.setBounds(405, 0, 185, 41);
		titlePanel.add(drinksLabel);
	}
}
