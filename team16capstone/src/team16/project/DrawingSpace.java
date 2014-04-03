package team16.project;

import java.awt.Color;

import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.GLProfile;
import javax.media.opengl.awt.GLCanvas;
import javax.swing.JPanel;


public class DrawingSpace extends JPanel{

	private static final long serialVersionUID = 1L;
	GLProfile glprofile = GLProfile.getDefault();
	GLCapabilities glcapabilities = new GLCapabilities(glprofile);
	//Given this is a priority in the program
	GLCanvas drawingPad = new GLCanvas(glcapabilities);

	//Sample demo code
	void addGraphicListener(GLEventListener t) {
		drawingPad.addGLEventListener(t);
	}
	
	public DrawingSpace(int ww, int hh) {
		glcapabilities.setHardwareAccelerated(true);
		
        /** SETUP CANVAS*/
		drawingPad.doLayout();
		drawingPad.setBackground(Color.GRAY);
		drawingPad.setBounds(0,0, ww, hh);
		drawingPad.setEnabled(true);
		drawingPad.setForeground(Color.GRAY);
		drawingPad.setVisible(true);
		drawingPad.display();
		add(drawingPad);
	}
	
}
