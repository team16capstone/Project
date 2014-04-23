package team16.project.animation;

import javax.media.opengl.GL2;

import team16.project.shapes.Circle;
import team16.project.shapes.Cross;
import team16.project.shapes.Shape;
import team16.project.shapes.Square;

public class Animation {
//	private Boolean rotate;
//	private Boolean bounce;
//	private Boolean path;
	private Rotate rotate;
	
	public Animation(Rotate rotate){
		this.rotate = rotate;
	}

//	public void setRotate(Boolean rotate)
//	{
//		this.rotate = rotate;
//	}
	
	public void setRotateData(Rotate rotate){
		this.rotate = rotate;
	}

//	public void setBounce(Boolean bounce)
//	{
//		this.bounce = bounce;
//	}
	
//	public void setPath(Boolean bounce)
//	{
//		this.bounce = bounce;
//	}
	
	public void doAnimations(GL2 gl2, Shape shape, float angle){
		if (rotate.getState())
		{
			if(shape.getType().equals("square")){
	    		gl2.glTranslatef(((Square)shape).getX(), ((Square)shape).getY(), 0);
	    		if(rotate.getDirection()){
	    			angle = angle*-1;
	    		}
	    		angle = angle*rotate.getSpeed();
	    		gl2.glRotatef(angle/10, 0, 0, 1);
	    		gl2.glTranslatef(-((Square)shape).getX(), -((Square)shape).getY(), 0);
			}
			else if(shape.getType().equals("cross")){
	    		gl2.glTranslatef(((Cross)shape).getX(), ((Cross)shape).getY(), 0);
	    		if(rotate.getDirection()){
	    			angle = angle*-1;
	    		}
	    		angle = angle*rotate.getSpeed();
	    		gl2.glRotatef(angle/10, 0, 0, 1);
	    		gl2.glTranslatef(-((Cross)shape).getX(), -((Cross)shape).getY(), 0);
			}
			else if(shape.getType().equals("circle")){
	    		gl2.glTranslatef(((Circle)shape).getX(), ((Circle)shape).getY(), 0);
	    		if(rotate.getDirection()){
	    			angle = angle*-1;
	    		}
	    		angle = angle*rotate.getSpeed();
	    		gl2.glRotatef(angle/10, 1, -1, 0);
	    		gl2.glTranslatef(-((Circle)shape).getX(), -((Circle)shape).getY(), 0);
			}
		}
	}
}
