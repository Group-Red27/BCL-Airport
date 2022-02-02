import javax.swing.JOptionPane;

public class Popup extends JOptionPane
{
	public static void showErrorMessage(String errorString) {
		JOptionPane.showMessageDialog( null, errorString , "Error", JOptionPane.ERROR_MESSAGE ); 
	}  //Copy paste for an error message for your own component. Just change the message.

	
	
	public static void showSuccessMessage(String errorString) {
		JOptionPane.showMessageDialog( null, errorString , "Success", JOptionPane.INFORMATION_MESSAGE );
	}	//Copy paste for an Success message for your own component. Just change the message.
	
}