import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AirbusA318 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AirbusA318 frame = new AirbusA318();
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
	public AirbusA318() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 515);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 128), 6));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel airbusA318Label = new JLabel("Departure/Return: Airbus A318");
		airbusA318Label.setFont(new Font("Tahoma", Font.BOLD, 12));
		airbusA318Label.setForeground(new Color(0, 0, 255));
		airbusA318Label.setBounds(22, 30, 220, 28);
		contentPane.add(airbusA318Label);
		
		JLabel selectLabel = new JLabel("select x seats");
		selectLabel.setForeground(Color.BLUE);
		selectLabel.setFont(new Font("Tahoma", Font.BOLD, 9));
		selectLabel.setBounds(22, 59, 74, 28);
		contentPane.add(selectLabel);
		
		JLabel businessClassLabel = new JLabel("Business Class");
		businessClassLabel.setForeground(Color.BLUE);
		businessClassLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		businessClassLabel.setBounds(22, 122, 86, 28);
		contentPane.add(businessClassLabel);
		
		JLabel economyClassLabel = new JLabel("Economy Class");
		economyClassLabel.setForeground(Color.BLUE);
		economyClassLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		economyClassLabel.setBounds(22, 241, 86, 28);
		contentPane.add(economyClassLabel);
		
		JButton oneAButton = new JButton("1A");
		oneAButton.setBackground(new Color(126, 192, 236));
		oneAButton.setForeground(new Color(255, 255, 255));
		oneAButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
		oneAButton.setBounds(139, 126, 51, 21);
		contentPane.add(oneAButton);
		
		JButton twoAButton = new JButton("2A");
		twoAButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		twoAButton.setForeground(Color.WHITE);
		twoAButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
		twoAButton.setBackground(new Color(126, 192, 236));
		twoAButton.setBounds(139, 146, 51, 21);
		contentPane.add(twoAButton);
		
		JButton threeAButton = new JButton("3A");
		threeAButton.setForeground(Color.WHITE);
		threeAButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
		threeAButton.setBackground(new Color(126, 192, 236));
		threeAButton.setBounds(139, 167, 51, 21);
		contentPane.add(threeAButton);
		
		JButton fourAButton = new JButton("4A");
		fourAButton.setForeground(Color.WHITE);
		fourAButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
		fourAButton.setBackground(new Color(126, 192, 236));
		fourAButton.setBounds(139, 188, 51, 21);
		contentPane.add(fourAButton);
		
		JButton fiveAButton = new JButton("5A");
		fiveAButton.setForeground(Color.WHITE);
		fiveAButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
		fiveAButton.setBackground(new Color(126, 192, 236));
		fiveAButton.setBounds(139, 208, 51, 21);
		contentPane.add(fiveAButton);
		
		JButton oneBButton = new JButton("1B");
		oneBButton.setForeground(Color.WHITE);
		oneBButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
		oneBButton.setBackground(new Color(126, 192, 236));
		oneBButton.setBounds(234, 126, 51, 21);
		contentPane.add(oneBButton);
		
		JButton twoBButton = new JButton("2B");
		twoBButton.setForeground(Color.WHITE);
		twoBButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
		twoBButton.setBackground(new Color(126, 192, 236));
		twoBButton.setBounds(234, 146, 51, 21);
		contentPane.add(twoBButton);
		
		JButton threeBButton = new JButton("3B");
		threeBButton.setForeground(Color.WHITE);
		threeBButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
		threeBButton.setBackground(new Color(126, 192, 236));
		threeBButton.setBounds(234, 167, 51, 21);
		contentPane.add(threeBButton);
		
		JButton fourBButton = new JButton("4B");
		fourBButton.setForeground(Color.WHITE);
		fourBButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
		fourBButton.setBackground(new Color(126, 192, 236));
		fourBButton.setBounds(234, 188, 51, 21);
		contentPane.add(fourBButton);
		
		JButton fiveBButton = new JButton("5B");
		fiveBButton.setForeground(Color.WHITE);
		fiveBButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
		fiveBButton.setBackground(new Color(126, 192, 236));
		fiveBButton.setBounds(234, 208, 51, 21);
		contentPane.add(fiveBButton);
		
		JButton oneBButton_1 = new JButton("6D");
		oneBButton_1.setForeground(Color.WHITE);
		oneBButton_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		oneBButton_1.setBackground(new Color(126, 192, 236));
		oneBButton_1.setBounds(234, 271, 51, 21);
		contentPane.add(oneBButton_1);
		
		JButton twoBButton_1 = new JButton("2B");
		twoBButton_1.setForeground(Color.WHITE);
		twoBButton_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		twoBButton_1.setBackground(new Color(126, 192, 236));
		twoBButton_1.setBounds(234, 291, 51, 21);
		contentPane.add(twoBButton_1);
		
		JButton threeBButton_1 = new JButton("3B");
		threeBButton_1.setForeground(Color.WHITE);
		threeBButton_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		threeBButton_1.setBackground(new Color(126, 192, 236));
		threeBButton_1.setBounds(234, 312, 51, 21);
		contentPane.add(threeBButton_1);
		
		JButton fourBButton_1 = new JButton("4B");
		fourBButton_1.setForeground(Color.WHITE);
		fourBButton_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		fourBButton_1.setBackground(new Color(126, 192, 236));
		fourBButton_1.setBounds(234, 333, 51, 21);
		contentPane.add(fourBButton_1);
		
		JButton fiveBButton_1 = new JButton("5B");
		fiveBButton_1.setForeground(Color.WHITE);
		fiveBButton_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		fiveBButton_1.setBackground(new Color(126, 192, 236));
		fiveBButton_1.setBounds(234, 353, 51, 21);
		contentPane.add(fiveBButton_1);
		
		JButton oneBButton_1_1 = new JButton("6E");
		oneBButton_1_1.setForeground(Color.WHITE);
		oneBButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		oneBButton_1_1.setBackground(new Color(126, 192, 236));
		oneBButton_1_1.setBounds(282, 271, 51, 21);
		contentPane.add(oneBButton_1_1);
		
		JButton twoBButton_1_1 = new JButton("2B");
		twoBButton_1_1.setForeground(Color.WHITE);
		twoBButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		twoBButton_1_1.setBackground(new Color(126, 192, 236));
		twoBButton_1_1.setBounds(282, 291, 51, 21);
		contentPane.add(twoBButton_1_1);
		
		JButton threeBButton_1_1 = new JButton("3B");
		threeBButton_1_1.setForeground(Color.WHITE);
		threeBButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		threeBButton_1_1.setBackground(new Color(126, 192, 236));
		threeBButton_1_1.setBounds(282, 312, 51, 21);
		contentPane.add(threeBButton_1_1);
		
		JButton fourBButton_1_1 = new JButton("4B");
		fourBButton_1_1.setForeground(Color.WHITE);
		fourBButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		fourBButton_1_1.setBackground(new Color(126, 192, 236));
		fourBButton_1_1.setBounds(282, 333, 51, 21);
		contentPane.add(fourBButton_1_1);
		
		JButton fiveBButton_1_1 = new JButton("5B");
		fiveBButton_1_1.setForeground(Color.WHITE);
		fiveBButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		fiveBButton_1_1.setBackground(new Color(126, 192, 236));
		fiveBButton_1_1.setBounds(282, 353, 51, 21);
		contentPane.add(fiveBButton_1_1);
		
		JButton oneBButton_1_1_1 = new JButton("6F");
		oneBButton_1_1_1.setForeground(Color.WHITE);
		oneBButton_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		oneBButton_1_1_1.setBackground(new Color(126, 192, 236));
		oneBButton_1_1_1.setBounds(332, 271, 51, 21);
		contentPane.add(oneBButton_1_1_1);
		
		JButton twoBButton_1_1_1 = new JButton("2B");
		twoBButton_1_1_1.setForeground(Color.WHITE);
		twoBButton_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		twoBButton_1_1_1.setBackground(new Color(126, 192, 236));
		twoBButton_1_1_1.setBounds(332, 291, 51, 21);
		contentPane.add(twoBButton_1_1_1);
		
		JButton threeBButton_1_1_1 = new JButton("3B");
		threeBButton_1_1_1.setForeground(Color.WHITE);
		threeBButton_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		threeBButton_1_1_1.setBackground(new Color(126, 192, 236));
		threeBButton_1_1_1.setBounds(332, 312, 51, 21);
		contentPane.add(threeBButton_1_1_1);
		
		JButton fourBButton_1_1_1 = new JButton("4B");
		fourBButton_1_1_1.setForeground(Color.WHITE);
		fourBButton_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		fourBButton_1_1_1.setBackground(new Color(126, 192, 236));
		fourBButton_1_1_1.setBounds(332, 333, 51, 21);
		contentPane.add(fourBButton_1_1_1);
		
		JButton fiveBButton_1_1_1 = new JButton("5B");
		fiveBButton_1_1_1.setForeground(Color.WHITE);
		fiveBButton_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		fiveBButton_1_1_1.setBackground(new Color(126, 192, 236));
		fiveBButton_1_1_1.setBounds(332, 353, 51, 21);
		contentPane.add(fiveBButton_1_1_1);
		
		JButton fiveBButton_1_2 = new JButton("5B");
		fiveBButton_1_2.setForeground(Color.WHITE);
		fiveBButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		fiveBButton_1_2.setBackground(new Color(126, 192, 236));
		fiveBButton_1_2.setBounds(234, 373, 51, 21);
		contentPane.add(fiveBButton_1_2);
		
		JButton fiveBButton_1_1_2 = new JButton("5B");
		fiveBButton_1_1_2.setForeground(Color.WHITE);
		fiveBButton_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		fiveBButton_1_1_2.setBackground(new Color(126, 192, 236));
		fiveBButton_1_1_2.setBounds(282, 373, 51, 21);
		contentPane.add(fiveBButton_1_1_2);
		
		JButton fiveBButton_1_1_1_1 = new JButton("5B");
		fiveBButton_1_1_1_1.setForeground(Color.WHITE);
		fiveBButton_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		fiveBButton_1_1_1_1.setBackground(new Color(126, 192, 236));
		fiveBButton_1_1_1_1.setBounds(332, 373, 51, 21);
		contentPane.add(fiveBButton_1_1_1_1);
		
		JButton oneBButton_1_2 = new JButton("6A");
		oneBButton_1_2.setForeground(Color.WHITE);
		oneBButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		oneBButton_1_2.setBackground(new Color(126, 192, 236));
		oneBButton_1_2.setBounds(63, 271, 51, 21);
		contentPane.add(oneBButton_1_2);
		
		JButton oneBButton_1_1_2 = new JButton("6B");
		oneBButton_1_1_2.setForeground(Color.WHITE);
		oneBButton_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		oneBButton_1_1_2.setBackground(new Color(126, 192, 236));
		oneBButton_1_1_2.setBounds(111, 271, 51, 21);
		contentPane.add(oneBButton_1_1_2);
		
		JButton oneBButton_1_1_1_1 = new JButton("6C");
		oneBButton_1_1_1_1.setForeground(Color.WHITE);
		oneBButton_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		oneBButton_1_1_1_1.setBackground(new Color(126, 192, 236));
		oneBButton_1_1_1_1.setBounds(161, 271, 51, 21);
		contentPane.add(oneBButton_1_1_1_1);
		
		JButton twoBButton_1_2 = new JButton("7A");
		twoBButton_1_2.setForeground(Color.WHITE);
		twoBButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		twoBButton_1_2.setBackground(new Color(126, 192, 236));
		twoBButton_1_2.setBounds(63, 291, 51, 21);
		contentPane.add(twoBButton_1_2);
		
		JButton twoBButton_1_1_2 = new JButton("7B");
		twoBButton_1_1_2.setForeground(Color.WHITE);
		twoBButton_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		twoBButton_1_1_2.setBackground(new Color(126, 192, 236));
		twoBButton_1_1_2.setBounds(111, 291, 51, 21);
		contentPane.add(twoBButton_1_1_2);
		
		JButton twoBButton_1_1_1_1 = new JButton("7C");
		twoBButton_1_1_1_1.setForeground(Color.WHITE);
		twoBButton_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		twoBButton_1_1_1_1.setBackground(new Color(126, 192, 236));
		twoBButton_1_1_1_1.setBounds(161, 291, 51, 21);
		contentPane.add(twoBButton_1_1_1_1);
		
		JButton threeBButton_1_2 = new JButton("8A");
		threeBButton_1_2.setForeground(Color.WHITE);
		threeBButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		threeBButton_1_2.setBackground(new Color(126, 192, 236));
		threeBButton_1_2.setBounds(63, 312, 51, 21);
		contentPane.add(threeBButton_1_2);
		
		JButton threeBButton_1_1_2 = new JButton("3B");
		threeBButton_1_1_2.setForeground(Color.WHITE);
		threeBButton_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		threeBButton_1_1_2.setBackground(new Color(126, 192, 236));
		threeBButton_1_1_2.setBounds(111, 312, 51, 21);
		contentPane.add(threeBButton_1_1_2);
		
		JButton threeBButton_1_1_1_1 = new JButton("3B");
		threeBButton_1_1_1_1.setForeground(Color.WHITE);
		threeBButton_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		threeBButton_1_1_1_1.setBackground(new Color(126, 192, 236));
		threeBButton_1_1_1_1.setBounds(161, 312, 51, 21);
		contentPane.add(threeBButton_1_1_1_1);
		
		JButton fourBButton_1_2 = new JButton("9A");
		fourBButton_1_2.setForeground(Color.WHITE);
		fourBButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		fourBButton_1_2.setBackground(new Color(126, 192, 236));
		fourBButton_1_2.setBounds(63, 333, 51, 21);
		contentPane.add(fourBButton_1_2);
		
		JButton fourBButton_1_1_2 = new JButton("4B");
		fourBButton_1_1_2.setForeground(Color.WHITE);
		fourBButton_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		fourBButton_1_1_2.setBackground(new Color(126, 192, 236));
		fourBButton_1_1_2.setBounds(111, 333, 51, 21);
		contentPane.add(fourBButton_1_1_2);
		
		JButton fourBButton_1_1_1_1 = new JButton("4B");
		fourBButton_1_1_1_1.setForeground(Color.WHITE);
		fourBButton_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		fourBButton_1_1_1_1.setBackground(new Color(126, 192, 236));
		fourBButton_1_1_1_1.setBounds(161, 333, 51, 21);
		contentPane.add(fourBButton_1_1_1_1);
		
		JButton fiveBButton_1_3 = new JButton("10A");
		fiveBButton_1_3.setForeground(Color.WHITE);
		fiveBButton_1_3.setFont(new Font("Tahoma", Font.PLAIN, 9));
		fiveBButton_1_3.setBackground(new Color(126, 192, 236));
		fiveBButton_1_3.setBounds(63, 353, 51, 21);
		contentPane.add(fiveBButton_1_3);
		
		JButton fiveBButton_1_1_3 = new JButton("5B");
		fiveBButton_1_1_3.setForeground(Color.WHITE);
		fiveBButton_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 9));
		fiveBButton_1_1_3.setBackground(new Color(126, 192, 236));
		fiveBButton_1_1_3.setBounds(111, 353, 51, 21);
		contentPane.add(fiveBButton_1_1_3);
		
		JButton fiveBButton_1_1_1_2 = new JButton("5B");
		fiveBButton_1_1_1_2.setForeground(Color.WHITE);
		fiveBButton_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		fiveBButton_1_1_1_2.setBackground(new Color(126, 192, 236));
		fiveBButton_1_1_1_2.setBounds(161, 353, 51, 21);
		contentPane.add(fiveBButton_1_1_1_2);
		
		JButton fiveBButton_1_2_2 = new JButton("11A");
		fiveBButton_1_2_2.setForeground(Color.WHITE);
		fiveBButton_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		fiveBButton_1_2_2.setBackground(new Color(126, 192, 236));
		fiveBButton_1_2_2.setBounds(63, 373, 51, 21);
		contentPane.add(fiveBButton_1_2_2);
		
		JButton fiveBButton_1_1_2_2 = new JButton("5B");
		fiveBButton_1_1_2_2.setForeground(Color.WHITE);
		fiveBButton_1_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		fiveBButton_1_1_2_2.setBackground(new Color(126, 192, 236));
		fiveBButton_1_1_2_2.setBounds(111, 373, 51, 21);
		contentPane.add(fiveBButton_1_1_2_2);
		
		JButton fiveBButton_1_1_1_1_2 = new JButton("12A");
		fiveBButton_1_1_1_1_2.setForeground(Color.WHITE);
		fiveBButton_1_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		fiveBButton_1_1_1_1_2.setBackground(new Color(126, 192, 236));
		fiveBButton_1_1_1_1_2.setBounds(161, 373, 51, 21);
		contentPane.add(fiveBButton_1_1_1_1_2);
		
		JButton fiveBButton_1_2_2_1 = new JButton("13A");
		fiveBButton_1_2_2_1.setForeground(Color.WHITE);
		fiveBButton_1_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		fiveBButton_1_2_2_1.setBackground(new Color(126, 192, 236));
		fiveBButton_1_2_2_1.setBounds(63, 412, 51, 21);
		contentPane.add(fiveBButton_1_2_2_1);
		
		JButton fiveBButton_1_3_1 = new JButton("12A");
		fiveBButton_1_3_1.setForeground(Color.WHITE);
		fiveBButton_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		fiveBButton_1_3_1.setBackground(new Color(126, 192, 236));
		fiveBButton_1_3_1.setBounds(63, 392, 51, 21);
		contentPane.add(fiveBButton_1_3_1);
		
		JButton fiveBButton_1_1_3_1 = new JButton("5B");
		fiveBButton_1_1_3_1.setForeground(Color.WHITE);
		fiveBButton_1_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		fiveBButton_1_1_3_1.setBackground(new Color(126, 192, 236));
		fiveBButton_1_1_3_1.setBounds(111, 392, 51, 21);
		contentPane.add(fiveBButton_1_1_3_1);
		
		JButton fiveBButton_1_1_2_2_1 = new JButton("5B");
		fiveBButton_1_1_2_2_1.setForeground(Color.WHITE);
		fiveBButton_1_1_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		fiveBButton_1_1_2_2_1.setBackground(new Color(126, 192, 236));
		fiveBButton_1_1_2_2_1.setBounds(111, 412, 51, 21);
		contentPane.add(fiveBButton_1_1_2_2_1);
		
		JButton fiveBButton_1_1_1_2_1 = new JButton("5B");
		fiveBButton_1_1_1_2_1.setForeground(Color.WHITE);
		fiveBButton_1_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		fiveBButton_1_1_1_2_1.setBackground(new Color(126, 192, 236));
		fiveBButton_1_1_1_2_1.setBounds(161, 392, 51, 21);
		contentPane.add(fiveBButton_1_1_1_2_1);
		
		JButton fiveBButton_1_1_1_1_2_1 = new JButton("5B");
		fiveBButton_1_1_1_1_2_1.setForeground(Color.WHITE);
		fiveBButton_1_1_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		fiveBButton_1_1_1_1_2_1.setBackground(new Color(126, 192, 236));
		fiveBButton_1_1_1_1_2_1.setBounds(161, 412, 51, 21);
		contentPane.add(fiveBButton_1_1_1_1_2_1);
		
		JButton fiveBButton_1_3_1_1 = new JButton("5B");
		fiveBButton_1_3_1_1.setForeground(Color.WHITE);
		fiveBButton_1_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		fiveBButton_1_3_1_1.setBackground(new Color(126, 192, 236));
		fiveBButton_1_3_1_1.setBounds(234, 392, 51, 21);
		contentPane.add(fiveBButton_1_3_1_1);
		
		JButton fiveBButton_1_1_3_1_1 = new JButton("5B");
		fiveBButton_1_1_3_1_1.setForeground(Color.WHITE);
		fiveBButton_1_1_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		fiveBButton_1_1_3_1_1.setBackground(new Color(126, 192, 236));
		fiveBButton_1_1_3_1_1.setBounds(282, 392, 51, 21);
		contentPane.add(fiveBButton_1_1_3_1_1);
		
		JButton fiveBButton_1_1_1_2_1_1 = new JButton("5B");
		fiveBButton_1_1_1_2_1_1.setForeground(Color.WHITE);
		fiveBButton_1_1_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		fiveBButton_1_1_1_2_1_1.setBackground(new Color(126, 192, 236));
		fiveBButton_1_1_1_2_1_1.setBounds(332, 392, 51, 21);
		contentPane.add(fiveBButton_1_1_1_2_1_1);
		
		JButton fiveBButton_1_2_2_1_1 = new JButton("5B");
		fiveBButton_1_2_2_1_1.setForeground(Color.WHITE);
		fiveBButton_1_2_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		fiveBButton_1_2_2_1_1.setBackground(new Color(126, 192, 236));
		fiveBButton_1_2_2_1_1.setBounds(234, 412, 51, 21);
		contentPane.add(fiveBButton_1_2_2_1_1);
		
		JButton fiveBButton_1_1_2_2_1_1 = new JButton("5B");
		fiveBButton_1_1_2_2_1_1.setForeground(Color.WHITE);
		fiveBButton_1_1_2_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		fiveBButton_1_1_2_2_1_1.setBackground(new Color(126, 192, 236));
		fiveBButton_1_1_2_2_1_1.setBounds(282, 412, 51, 21);
		contentPane.add(fiveBButton_1_1_2_2_1_1);
		
		JButton fiveBButton_1_1_1_1_2_1_1 = new JButton("5B");
		fiveBButton_1_1_1_1_2_1_1.setForeground(Color.WHITE);
		fiveBButton_1_1_1_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		fiveBButton_1_1_1_1_2_1_1.setBackground(new Color(126, 192, 236));
		fiveBButton_1_1_1_1_2_1_1.setBounds(332, 412, 51, 21);
		contentPane.add(fiveBButton_1_1_1_1_2_1_1);
	}
}
