import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import java.awt.Color;

public class FlightArrivalMap_UI extends JFrame {

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
	}

}
