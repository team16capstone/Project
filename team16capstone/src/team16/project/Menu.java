package team16.project;

import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu extends JMenuBar {
	private static final long serialVersionUID = 1L;

	/**File Menu Components*/
	private JMenu file = new JMenu("File");
	private JMenuItem nNew = new JMenuItem("New");
	private JMenuItem saveProject = new JMenuItem("Save Project");
	private JMenuItem openProject = new JMenuItem("Open Project");
	private JMenu exportMovie = new JMenu("Export");
	private JMenuItem exportAVI = new JMenuItem("Export To AVI");
	private JMenuItem exportMPEG = new JMenuItem("Export To MPEG");
	private JMenuItem exportMP4 = new JMenuItem("Export To MP4");
	private JMenuItem exportMOV = new JMenuItem("Export To MOV");
	private JMenuItem exit = new JMenuItem("Exit");

	/**Insert Menu Components*/
	private JMenu insert = new JMenu("Insert");
	private JMenuItem circle = new JMenuItem("Circle");
	private JMenuItem cross = new JMenuItem("Cross");
	private JMenuItem square = new JMenuItem("Square");
	private JMenuItem star = new JMenuItem("Star");
	private JMenuItem wave = new JMenuItem("Wave");

	/**Effects Menu Components*/
	private JMenu effects = new JMenu("Effects");
	private JMenuItem motionPath = new JMenuItem("Motion Path");
	private JMenuItem rotation = new JMenuItem("Rotation");

	
    public Menu() {
    	/**Add File Menu*/
    	exportMovie.add(exportAVI);
    	exportMovie.add(exportMPEG);
    	exportMovie.add(exportMP4);
    	exportMovie.add(exportMOV);
    	file.add(nNew);
    	file.add(saveProject);
    	file.add(openProject);
    	file.add(exportMovie);
    	file.add(exit);
    	this.add(file);
    	
    	/**Add Insert Menu*/
    	insert.add(circle);
    	insert.add(cross);
    	insert.add(square);
    	insert.add(star);
    	insert.add(wave);
    	this.add(insert);
    	
    	/**Add Effects Menu*/
    	effects.add(motionPath);
    	effects.add(rotation);
    	this.add(effects);
    	
    	/**Add File Menu Shortcuts*/
    	file.setMnemonic('F');
    	nNew.setMnemonic('N');
    	saveProject.setMnemonic('S');
    	openProject.setMnemonic('O');
    	exportMovie.setMnemonic('E');
    	exportAVI.setMnemonic('A');
    	exportMPEG.setMnemonic('M');
    	exportMP4.setMnemonic('P');
    	exportMOV.setMnemonic('V');
    	exit.setMnemonic('X');

    	/**Add Insert Menu Shortcuts*/
    	insert.setMnemonic('I');
    	circle.setMnemonic('C');
    	cross.setMnemonic('R');
    	square.setMnemonic('Q');
    	star.setMnemonic('S');
    	wave.setMnemonic('W');
    	
    	/**Add Effects Menu Shortcuts*/
    	effects.setMnemonic('E');
    	motionPath.setMnemonic('M');
    	rotation.setMnemonic('R');


    }

    void addItemListener(ActionListener t) {
    	nNew.addActionListener(t);
    	saveProject.addActionListener(t);
    	openProject.addActionListener(t);
    	exportAVI.addActionListener(t);
    	exportMPEG.addActionListener(t);
    	exportMP4.addActionListener(t);
    	exportMOV.addActionListener(t);
    	exit.addActionListener(t);
    	circle.addActionListener(t);
    	cross.addActionListener(t);
    	square.addActionListener(t);
    	star.addActionListener(t);
    	wave.addActionListener(t);
    	effects.addActionListener(t);
    	motionPath.addActionListener(t);
    	rotation.addActionListener(t);

    }
}
