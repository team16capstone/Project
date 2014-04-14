package team16.project.shapes;

import javax.media.opengl.GL2;


public class Square extends Shape{
	private float nsize;
	private int xpos;
	private int ypos;
	int[] rgb = new int[3];
	boolean filled;
	boolean rotate;
	int thickness;
	public Square(int x, int y, int height, int size, int[] rGB, boolean filled, int thickness, boolean rotate){
		setType("square");

		nsize = (((float)size)/(float)200) * (float)height;
		xpos = x;
		ypos = height-y;
		rgb = rGB;
		this.filled = filled;
		this.thickness = thickness;
		this.rotate = rotate;
	}
public void drawSquare(GL2 gl2){

    gl2.glColor3f((float)rgb[0]/(float)255, (float)rgb[1]/(float)255, (float)rgb[2]/(float)255);
    if(rotate)
    {
    	
//    	    gl2.glRotated(50, 0, 0, 0);	
//    	   	gl2.glPushMatrix();
    }

    if (filled)
    	gl2.glBegin(GL2.GL_QUADS);
    else
    {
    	gl2.glBegin(GL2.GL_LINE_LOOP);
    	gl2.glLineWidth((float)thickness);
    }
	gl2.glVertex2d(xpos-nsize,ypos-nsize);
	gl2.glVertex2d(xpos+nsize,ypos-nsize);
	gl2.glVertex2d(xpos+nsize,ypos+nsize);
	gl2.glVertex2d(xpos-nsize,ypos+nsize);
	gl2.glVertex2d(xpos-nsize,ypos-nsize);
	gl2.glEnd();
//    if(rotate)
//	gl2.glPopMatrix();

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
