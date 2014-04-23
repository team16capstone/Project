package team16.project.shapes;

import java.awt.Color;

import javax.media.opengl.GL2;

import team16.project.animation.Animation;
import team16.project.animation.Rotate;


public class Square extends Shape{
	private float nsize;
	private int xpos;
	private int ypos;
	Color rgb = new Color(0.0f,0.0f,0.0f);
	boolean filled;
	int thickness;
	private Animation squareAnimation = new Animation(new Rotate(false,false,0));
	public Square(int x, int y, int height, int size, Color rGB2, boolean filled, int thickness, Rotate rotate){
		setType("square");

		nsize = (((float)size)/(float)200) * (float)height;
		xpos = x;
		ypos = height-y;
		rgb = rGB2;
		this.filled = filled;
		this.thickness = thickness;
		if(rotate!=null)
		squareAnimation.setRotateData(rotate);
		else{
			rotate = new Rotate(false,false,0);
			squareAnimation.setRotateData(rotate);
		}
	}
public void drawSquare(GL2 gl2, float angle){

	squareAnimation.doAnimations(gl2, this, angle);
    gl2.glColor3f((float)rgb.getRed()/(float)255, (float)rgb.getGreen()/(float)255, (float)rgb.getBlue()/(float)255);
    if (filled)
    	gl2.glBegin(GL2.GL_QUADS);
    else
    {
    	gl2.glLineWidth((float)thickness);
    	gl2.glBegin(GL2.GL_LINE_LOOP);
    }
	gl2.glVertex2d(xpos-nsize,ypos-nsize);
	gl2.glVertex2d(xpos+nsize,ypos-nsize);
	gl2.glVertex2d(xpos+nsize,ypos+nsize);
	gl2.glVertex2d(xpos-nsize,ypos+nsize);
	gl2.glVertex2d(xpos-nsize,ypos-nsize);
	gl2.glEnd();


}

//public boolean getRotate(){
//	return rotate;
//}

public int getX()
{
	return xpos;
}
public int getY()
{
	return ypos;
}
}
