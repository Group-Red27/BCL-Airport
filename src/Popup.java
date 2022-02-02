import javax.swing.JOptionPane;

public class Popup extends JOptionPane
{
	public static void showErrorMessage(String errorString) {
		JOptionPane.showMessageDialog( null, errorString , "Error", JOptionPane.ERROR_MESSAGE );
	}
	
	
	public static void showSuccessMessage(String errorString) {
		JOptionPane.showMessageDialog( null, errorString , "Success", JOptionPane.INFORMATION_MESSAGE );
	}
	
}