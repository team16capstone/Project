package team16.project.shapes;

import java.awt.Color;

import javax.media.opengl.GL2;


public class Circle extends Shape{
	private int x;
	private int y;
	private int height;
	private int thickness;
	private int size;
	Color rgb = new Color(0.0f,0.0f,0.0f);
	boolean filled = true;
	boolean rotate;
	
	public Circle(int x, int y, int height, int size, Color rGB2, boolean filled, int thickness2, boolean rotate){
		setType("circle");
		this.x = x;
		this.y = height - y;
		this.height = height;
		this.size = size;
		this.filled = filled;
		rgb = rGB2;
		this.rotate = rotate;
	}
	
    public void drawCircle(GL2 gl2)
    {
        
        gl2.glColor3f((float)rgb.getRed()/(float)255, (float)rgb.getGreen()/(float)255, (float)rgb.getBlue()/(float)255);

    	float theta = (float) (2 * 3.1415926 / (100)); 
    	float tangetial_factor = (float) (Math.tan(theta));//calculate the tangential factor 
    	float radial_factor = (float) (Math.cos(theta));//calculate the radial factor 
    	float xx = (float)size / (float)210 * height;//we start at angle = 0 
    	float yy = 0; 
    	gl2.glLineWidth(5f);
        if (filled)
        	gl2.glBegin(GL2.GL_POLYGON);
        else
        {
        	gl2.glLineWidth((float)thickness);
        	gl2.glBegin(GL2.GL_LINE_LOOP);
        }
    	for(int ii = 0; ii < 100; ii++) 
    	{ 
    		gl2.glVertex2f(xx + x, yy + y);//output vertex 

    		float tx = -yy; 
    		float ty = xx; 

    		xx += tx * tangetial_factor; 
    		yy += ty * tangetial_factor; 

    		xx *= radial_factor; 
    		yy *= radial_factor; 
    	} 
    	gl2.glEnd();
    }
	
		public boolean getRotate(){
			return rotate;
		}

		public int getX()
		{
			return x;
		}
		public int getY()
		{
			return height-y;
		}
}
