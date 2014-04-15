package team16.project.shapes;

import java.awt.Color;

import javax.media.opengl.GL2;


public class Cross extends Shape{
	private float nsize;
	private int xpos;
	private int ypos;
	private int thickness;
	Color rgb = new Color(0.0f,0.0f,0.0f);
	private boolean rotate;
	
	public Cross(int x, int y, int height, int size, Color rGB2, int thickness, boolean rotate){
		setType("cross");
		
		nsize = (((float)size)/(float)200) * (float)height;
		xpos = x;
		ypos = height-y;
		rgb = rGB2;
		this.thickness = thickness;
		this.rotate = rotate;
	}
public void drawCross(GL2 gl2){
    
    gl2.glColor3f((float)rgb.getRed()/(float)255, (float)rgb.getGreen()/(float)255, (float)rgb.getBlue()/(float)255);
    if(rotate)
    {

    }
    gl2.glLineWidth((float)thickness);
	gl2.glBegin(GL2.GL_LINE_LOOP);
	gl2.glVertex2d(xpos,ypos);
	gl2.glVertex2d(xpos,ypos-nsize);
	gl2.glVertex2d(xpos,ypos+nsize);
	gl2.glVertex2d(xpos,ypos);
	gl2.glVertex2d(xpos-nsize,ypos);
	gl2.glVertex2d(xpos+nsize,ypos);
	gl2.glVertex2d(xpos,ypos);
	gl2.glEnd();
}

public boolean getRotate(){
	return rotate;
}

public int getX()
{
	return xpos;
}
public int getY()
{
	return ypos;
}
}
