package team16.project;

import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

public class ChooseColour extends JOptionPane{
	private static final long serialVersionUID = 1L;

	JColorChooser chooser = new JColorChooser();
	
	public ChooseColour(){
		System.out.println("RETURN IS: " + JOptionPane.showOptionDialog(this, chooser, "Colour Chooser", optionType, messageType, icon, options, chooser));
	}
}
