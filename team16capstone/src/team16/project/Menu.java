package team16.project;

import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu extends JMenuBar {
	private static final long serialVersionUID = 1L;

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

	
    public Menu() {
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
    }
}
