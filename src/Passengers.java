import javax.swing.JOptionPane;


public class Passengers {
	public static void main(String[] args) {
		String fullName = JOptionPane.showInputDialog("Enter your First Name");
		int spacePosition = fullName.indexOf("");
		
		String firstName = fullName.substring(spacePosition);
		String surName = fullName.substring(spacePosition+1);
		
		JOptionPane.showMessageDialog(null, "your First Name is:" + firstName + " Surname is;" + surName);
		
		
				
		
	}

}

	


