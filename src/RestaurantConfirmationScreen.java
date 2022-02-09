import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
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
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

public class RestaurantConfirmationScreen extends JFrame {

	
	private JPanel contentPane;
	private JTextField nameEntry;
	private JTextField ticketEntry;
	private JTable table;


	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RestaurantConfirmationScreen frame = new RestaurantConfirmationScreen(data);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} */

	/**
	 * Create the frame.
	 */
	public RestaurantConfirmationScreen(FoodOrder foodOrder, Object[][] data) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setForeground(new Color(0, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titleLabel = new JLabel("Order Confirmation");
		titleLabel.setForeground(new Color(0, 0, 128));
		titleLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		titleLabel.setBounds(56, 59, 293, 40);
		contentPane.add(titleLabel);
		
		nameEntry = new JTextField();
		nameEntry.setBounds(191, 363, 215, 29);
		contentPane.add(nameEntry);
		nameEntry.setColumns(10);
		
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
		
		ticketEntry = new JTextField();
		ticketEntry.setColumns(10);
		ticketEntry.setBounds(191, 393, 215, 29);
		contentPane.add(ticketEntry);
		
		JButton backButton = new JButton("Back");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RestaurantSelectionScreen selectionScreen = new RestaurantSelectionScreen();
				setVisible(false);
				selectionScreen.setVisible(true);
			}
		});
		backButton.setBackground(new Color(255, 255, 255));
		backButton.setForeground(new Color(0, 0, 128));
		backButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		backButton.setBounds(463, 393, 137, 29);
		contentPane.add(backButton);
		
		JLabel fullNameLabel = new JLabel(" Full Name");
		fullNameLabel.setForeground(new Color(255, 255, 255));
		fullNameLabel.setBackground(new Color(0, 0, 128));
		fullNameLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		fullNameLabel.setBounds(56, 363, 134, 27);
		fullNameLabel.setOpaque(true);
		contentPane.add(fullNameLabel);
		
		JLabel ticketNoLabel = new JLabel(" Ticket Number");
		ticketNoLabel.setForeground(new Color(255, 255, 255));
		ticketNoLabel.setBackground(new Color(0, 0, 128));
		ticketNoLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		ticketNoLabel.setBounds(56, 393, 134, 27);
		ticketNoLabel.setOpaque(true);
		contentPane.add(ticketNoLabel);
		
		JLabel totalLabel = new JLabel(" Total");
		totalLabel.setForeground(new Color(255, 255, 255));
		totalLabel.setBackground(new Color(0, 0, 128));
		totalLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		totalLabel.setBounds(500, 276, 91, 29);
		totalLabel.setOpaque(true);
		contentPane.add(totalLabel);
		
		JLabel totalCostLabel = new JLabel(" PRICE HERE");
		totalCostLabel.setBackground(SystemColor.controlHighlight);
		totalCostLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		totalCostLabel.setBounds(591, 276, 137, 29);
		totalCostLabel.setOpaque(true);
		contentPane.add(totalCostLabel);
		

		
		
		
		
		String[] columnNames = {"Item Name", "Price", "Quantiy", "Net Price"};
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(56, 119, 715, 141);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		contentPane.add(scrollPane);
		

		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 12));
		table.setEnabled(false);
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(data, columnNames));
		
		JTextPane txtpnUserMessageHere = new JTextPane();
		txtpnUserMessageHere.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnUserMessageHere.setBackground(SystemColor.menu);
		txtpnUserMessageHere.setText("user message here!\r\n");
		txtpnUserMessageHere.setEditable(false);
		txtpnUserMessageHere.setBounds(56, 276, 417, 68);
		contentPane.add(txtpnUserMessageHere);
		
		/*
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(746, 108, 17, 133);
		contentPane.add(scrollBar);
		*/

		TableColumn column1= table.getColumn("Item Name");
        column1.setMinWidth(350);
        column1.setMaxWidth(350);

	}
}
