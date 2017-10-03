package listandstrings.view;

import javax.swing.JOptionPane;

public class PopupDisplay
{
	/**
	 * Displays the supplied message in a popup window.
	 * @param message The Messade that is displayed.
	 */
	
	public void displayText(String message)
	{
		JOptionPane.showMessageDialog(null, message);
	}
	
	/**
	 * Displays the supplied question in a popup and returns the answer as a string.
	 * @param fromQuestion The question to ask the user
	 * @return The return type.
	 */
	public String getResponse(String fromQuestion)
	{
		String response = "";
		
		response += JOptionPane.showInputDialog(null, fromQuestion);
			
		return response;
	}

}
