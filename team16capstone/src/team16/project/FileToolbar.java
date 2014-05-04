package team16.project;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class FileToolbar extends JPanel{
	private static final long serialVersionUID = 1L;
	private FlowLayout fileLayout = new FlowLayout();

	/**All components of File Toolbar*/
	private JToolBar bar = new JToolBar();
	private JButton nNew = new JButton();
	private JButton open = new JButton();
	private JButton save = new JButton();
	private JButton exportAVI = new JButton();
	private JButton exportMPEG = new JButton();
	private JButton exportMP4 = new JButton();
	private JButton exportMOV = new JButton();
	
	/**All components of Effects*/
	private JButton rotate = new JButton();
	private JButton motionBounce = new JButton();
	private JButton motionPath = new JButton();
	private JButton pause = new JButton("Pause Animation");

	private JButton backColor = new JButton("Background Colour");
	private JButton color = new JButton("Shape Colour");
	private JButton undo = new JButton("Undo");
	private JButton redo = new JButton("Redo");
	
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
		nNew.setActionCommand("new");
		bar.add(open);
		open.setActionCommand("open");
		bar.add(save);
		save.setActionCommand("save");
		bar.add(exportAVI);
		exportAVI.setActionCommand("exportAVI");
		bar.add(exportMPEG);
		exportMPEG.setActionCommand("exportMPEG");
		bar.add(exportMP4);
		exportMP4.setActionCommand("exportMP4");
		bar.add(exportMOV);
		exportMOV.setActionCommand("exportMOV");
		
		bar.addSeparator();
		
		bar.add(rotate);
		rotate.setBackground(Color.LIGHT_GRAY);
		rotate.setActionCommand("rotate");
		bar.add(motionBounce);
		motionBounce.setActionCommand("motionBounce");
		bar.add(motionPath);
		motionPath.setActionCommand("motionPath");

		bar.addSeparator();
		
		bar.add(pause);
		pause.setActionCommand("pause");
		
		bar.addSeparator();

		bar.add(backColor);
		backColor.setActionCommand("backColor");
		bar.add(color);
		color.setActionCommand("color");
		
		bar.addSeparator();

		bar.add(undo);
		undo.setActionCommand("undo");
		bar.add(redo);
		redo.setActionCommand("redo");
		
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

		    Image tmpRotate = ImageIO.read(getClass().getResource("/res/rotate.jpg"));
		    ImageIcon rotateIcon = new ImageIcon(tmpRotate.getScaledInstance(h, h, Image.SCALE_AREA_AVERAGING));
		    rotate.setIcon(rotateIcon);
		    
		    Image tmpBounce = ImageIO.read(getClass().getResource("/res/bounce.jpg"));
		    ImageIcon bounceIcon = new ImageIcon(tmpBounce.getScaledInstance(h, h, Image.SCALE_AREA_AVERAGING));
		    motionBounce.setIcon(bounceIcon);
		    
		    Image tmpPath = ImageIO.read(getClass().getResource("/res/path.jpg"));
		    ImageIcon pathIcon = new ImageIcon(tmpPath.getScaledInstance(h, h, Image.SCALE_AREA_AVERAGING));
		    motionPath.setIcon(pathIcon);
		    
		  } catch (IOException ex) {
		  }
		
		
	}
	public void addListeners(ActionListener a){
		nNew.addActionListener(a);
		open.addActionListener(a);
		save.addActionListener(a);
		exportAVI.addActionListener(a);
		exportMPEG.addActionListener(a);
		exportMP4.addActionListener(a);
		exportMOV.addActionListener(a);
		rotate.addActionListener(a);
		motionBounce.addActionListener(a);
		motionPath.addActionListener(a);
		pause.addActionListener(a);
		backColor.addActionListener(a);
		color.addActionListener(a);
		undo.addActionListener(a);
		redo.addActionListener(a);
	}
	
	public void setColor(Color c){
		color.setBackground(c);
	}
	
	public void setBackColor(Color c){
		backColor.setBackground(c);
	}
	
	public void setRotateColor(Boolean b){
		if(b)
			rotate.setBackground(Color.YELLOW);
		else
			rotate.setBackground(Color.LIGHT_GRAY);
	}
	
	public void setBounceColor(Boolean b){
		if(b)
			motionBounce.setBackground(Color.YELLOW);
		else
			motionBounce.setBackground(Color.LIGHT_GRAY);
	}
	
	public void setPause(Boolean p){
		if(p)
			pause.setBackground(Color.YELLOW);
		else
			pause.setBackground(Color.LIGHT_GRAY);
	}
}
