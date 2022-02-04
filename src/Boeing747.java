import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;

public class Boeing747 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Boeing747 frame = new Boeing747();
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
	public Boeing747() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 405);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 128), 6));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel boeing747Label = new JLabel("Departure/Return: Boeing 747");
		boeing747Label.setForeground(new Color(0, 0, 255));
		boeing747Label.setFont(new Font("Tahoma", Font.BOLD, 12));
		boeing747Label.setBounds(21, 22, 207, 28);
		contentPane.add(boeing747Label);
		
		JLabel selectLabel = new JLabel("select x seats");
		selectLabel.setForeground(Color.BLUE);
		selectLabel.setFont(new Font("Tahoma", Font.BOLD, 9));
		selectLabel.setBounds(21, 45, 74, 28);
		contentPane.add(selectLabel);
	}

}
