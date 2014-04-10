package team16.project.shapes;

import javax.media.opengl.GL2;


public class Square extends Shape{
	private float nsize;
	private int xpos;
	private int ypos;
	int[] rgb = new int[3];

	public Square(int x, int y, int height, int thickness, int[] rGB){
		setType("square");
		
		nsize = (((float)thickness)/(float)200) * (float)height;
		xpos = x;
		ypos = height-y;
		rgb = rGB;

	}
public void drawSquare(GL2 gl2){

    gl2.glColor3f((float)rgb[0]/(float)255, (float)rgb[1]/(float)255, (float)rgb[2]/(float)255);
//	gl2.glMatrixMode(GL2.GL_PROJECTION);
//	gl2.glPathCoordsNV(0, 0, 0, null);
//	gl2.glRotated(50, 0, 0, 0);	
//	gl2.glPushMatrix();
	gl2.glBegin(GL2.GL_QUADS);
	gl2.glVertex2d(xpos-nsize,ypos-nsize);
	gl2.glVertex2d(xpos+nsize,ypos-nsize);
	gl2.glVertex2d(xpos+nsize,ypos+nsize);
	gl2.glVertex2d(xpos-nsize,ypos+nsize);
	gl2.glVertex2d(xpos-nsize,ypos-nsize);
	gl2.glEnd();
//	gl2.glPopMatrix();

}
}
