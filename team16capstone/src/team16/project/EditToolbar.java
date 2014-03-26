package team16.project;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class EditToolbar extends JPanel{
	private static final long serialVersionUID = 1L;

	private JToolBar bar = new JToolBar();
	private JButton nNew = new JButton();
	
	public EditToolbar()
	{
		add(bar);
		bar.add(nNew);
	}
}
