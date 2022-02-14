import javax.swing.JOptionPane;

public class Popup extends JOptionPane
{
	public static void showErrorMessage(String errorString) {
		JOptionPane.showMessageDialog( null, errorString , "Error", JOptionPane.ERROR_MESSAGE ); 
	}  
	    //To get this error message you write: 
		//Popup popup = new Popup();
		//popup.showErrorMessage("Whatever error message you want");

	
	public static void showSuccessMessage(String errorString) {
		JOptionPane.showMessageDialog( null, errorString , "Success", JOptionPane.INFORMATION_MESSAGE );
	}
		//To get this success message you write: 
		//Popup popup = new Popup();
		//popup.showSuccessMessage("Whatever success message you want");
	
}