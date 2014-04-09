package team16.project;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.media.opengl.awt.GLJPanel;

import team16.project.shapes.Circle;
import team16.project.shapes.Square;

public class MyMouseListener implements MouseListener{
	View view;
	GLJPanel canvas;
	String type;
	boolean active;
	
	public MyMouseListener(View view, GLJPanel canvas) {
		this.view = view;
		this.canvas = canvas;
		type = "";
		active = false;
		view.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		if(active){
			active = false;
			int x = arg0.getPoint().x;
			int y = arg0.getPoint().y;	
				if(type.equals("square"))                	
				view.getGlistener().addShape(new Square(x,y,canvas.getSize().height));
				if(type.equals("circle"))                	
				view.getGlistener().addShape(new Circle(x,y,canvas.getSize().height));
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
	
}