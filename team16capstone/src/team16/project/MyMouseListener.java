package team16.project;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.media.opengl.awt.GLCanvas;

import team16.project.animation.Bounce;

public class MyMouseListener implements MouseListener{
	View view;
	GLCanvas canvas;
	String type;
	boolean active;
	boolean rotate;
	boolean filled;
	int thickness;
	int size;
	Color rgb = new Color(0.0f,0.0f,0.0f);
	Bounce bounce;
	public MyMouseListener(View view, GLCanvas canvas2) {
		this.view = view;
		this.canvas = canvas2;
		type = "";
		active = false;
		rotate = false;
		filled = false;
		thickness = 1;
		size = 1;
		bounce = new Bounce(false,1);
		view.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		int x = arg0.getPoint().x;
		int y = arg0.getPoint().y;		
		if(active){
			active = false;
			view.getGlistener().addShape(x,y,canvas.getSize().width,canvas.getSize().height,type,size,view.getShapeColor(),filled,thickness,view.getRotate(),view.getBounce());
			if(view.getGlistener().getPause())
			view.getGlistener().setOnce();
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
	
	public void setSize(int size){
		this.size = size;
	}

	public void setFilled(boolean filled){
		this.filled = filled;
	}
	public void setThickness(int thickness){
		this.thickness = thickness;
	}
	public void setBounce(Bounce bounce){
		this.bounce = bounce;
	}	
}