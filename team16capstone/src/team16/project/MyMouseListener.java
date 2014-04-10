package team16.project;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.media.opengl.awt.GLJPanel;
import javax.swing.JOptionPane;

public class MyMouseListener implements MouseListener{
	View view;
	GLJPanel canvas;
	String type;
	boolean active;
	int thickness;
	int[] RGB = new int[3];
	public MyMouseListener(View view, GLJPanel canvas) {
		this.view = view;
		this.canvas = canvas;
		type = "";
		active = false;
		thickness = 1;
		view.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		if(active){
			active = false;
			int x = arg0.getPoint().x;
			int y = arg0.getPoint().y;
			JOptionPane options = new JOptionPane(x);
			options.setLayout(new FlowLayout());
			view.getGlistener().addShape(x,y,canvas.getSize().height,type,thickness,RGB);
		}

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public void setActive(boolean active){
		this.active = active;
	}
	
	public void setType(String type){
		this.type = type;
	}
	
	public void setThickness(int thickness){
		this.thickness = thickness;
	}
	public void setRGB(int[] RGB){
		this.RGB = RGB;
	}
	
}