import javax.swing.JOptionPane;

public class pop_plane extends JOptionPane
{
	public static void showErrorMessage(String errorString) 
	{
		JOptionPane.showMessageDialog( null, errorString , "Error", JOptionPane.ERROR_MESSAGE ); 
	}  
	    //To get this error message you write: 
		//pop_plane popup = new pop_plane();
		//popup.showErrorMessage("Whatever error message you want");

	
	public static void showSuccessMessage(String errorString) 
	{
		JOptionPane.showMessageDialog( null, errorString , "Success", JOptionPane.INFORMATION_MESSAGE );
	}
		//To get this success message you write: 
		//pop_plane popup = new pop_plane();
		//popup.showSuccessMessage("Whatever success message you want");
	
}