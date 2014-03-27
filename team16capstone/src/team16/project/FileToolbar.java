package team16.project;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class FileToolbar extends JPanel{
	private static final long serialVersionUID = 1L;

	/**All components of File Toolbar*/
	private JToolBar bar = new JToolBar();
	private JButton nNew = new JButton();
	private JButton open = new JButton();
	private JButton save = new JButton();
	private JButton exportAVI = new JButton();
	private JButton exportMPEG = new JButton();
	private JButton exportMP4 = new JButton();
	private JButton exportMOV = new JButton();
	
	private FlowLayout fileLayout = new FlowLayout();
	
	public FileToolbar()
	{
		fileLayout.setAlignment(FlowLayout.LEFT);
		this.setLayout(fileLayout);

		/**Dimensions of current screen to ensure consistent Icon ratio*/
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Double width = screenSize.getWidth();
		Double height = screenSize.getHeight();
		width = width/30;
		height = height/30;
		int h = height.intValue();
		
		/**Set the toolbar horizontal*/
		bar.setOrientation(0);

		/**add all the buttons to the toolbar*/
		bar.add(nNew);
		bar.add(open);
		bar.add(save);
		bar.add(exportAVI);
		bar.add(exportMPEG);
		bar.add(exportMP4);
		bar.add(exportMOV);
		
		
		/**add toolbar to the panel*/
		add(bar);
		bar.setAlignmentX(0);
		this.setAlignmentX(0);
		
		/**Set all icons*/
		try {
		    Image tmpNew = ImageIO.read(getClass().getResource("/res/new.jpg"));
		    ImageIcon newIcon = new ImageIcon(tmpNew.getScaledInstance(h, h, Image.SCALE_AREA_AVERAGING));
		    nNew.setIcon(newIcon);

		    Image tmpOpen = ImageIO.read(getClass().getResource("/res/open.jpg"));
		    ImageIcon openIcon = new ImageIcon(tmpOpen.getScaledInstance(h, h, Image.SCALE_AREA_AVERAGING));
		    open.setIcon(openIcon);

		    Image tmpSave = ImageIO.read(getClass().getResource("/res/save.jpg"));
		    ImageIcon saveIcon = new ImageIcon(tmpSave.getScaledInstance(h, h, Image.SCALE_AREA_AVERAGING));
		    save.setIcon(saveIcon);

		    Image tmpAVI = ImageIO.read(getClass().getResource("/res/avi.jpg"));
		    ImageIcon aviIcon = new ImageIcon(tmpAVI.getScaledInstance(h, h, Image.SCALE_AREA_AVERAGING));
		    exportAVI.setIcon(aviIcon);

		    Image tmpMPEG = ImageIO.read(getClass().getResource("/res/mpeg.jpg"));
		    ImageIcon mpegIcon = new ImageIcon(tmpMPEG.getScaledInstance(h, h, Image.SCALE_AREA_AVERAGING));
		    exportMPEG.setIcon(mpegIcon);

		    Image tmpMP4 = ImageIO.read(getClass().getResource("/res/mp4.jpg"));
		    ImageIcon mp4Icon = new ImageIcon(tmpMP4.getScaledInstance(h, h, Image.SCALE_AREA_AVERAGING));
		    exportMP4.setIcon(mp4Icon);

		    Image tmpMOV = ImageIO.read(getClass().getResource("/res/mov.jpg"));
		    ImageIcon movIcon = new ImageIcon(tmpMOV.getScaledInstance(h, h, Image.SCALE_AREA_AVERAGING));
		    exportMOV.setIcon(movIcon);
		    
		    


		    
		    
		  } catch (IOException ex) {
		  }
		
		
	}
}
