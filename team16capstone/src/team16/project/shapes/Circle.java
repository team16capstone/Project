package team16.project.shapes;

import javax.media.opengl.GL2;


public class Circle extends Shape{
	private int x;
	private int y;
	private int height;
	private int thickness;
	int[] rgb = new int[3];
	boolean fill = true;
	
	public Circle(int x, int y, int height, int thickness, int[] rGB){
		setType("circle");
		this.x = x;
		this.y = height - y;
		this.height = height;
		this.thickness = thickness;
		rgb = rGB;
	}
	
	public int getY(){
		return y;
	}
	public int getX(){
		return x;
	}
	
    public void drawCircle(GL2 gl)
    {

        gl.glColor3f((float)rgb[0]/(float)255, (float)rgb[1]/(float)255, (float)rgb[2]/(float)255);

    	float theta = (float) (2 * 3.1415926 / (100)); 
    	float tangetial_factor = (float) (Math.tan(theta));//calculate the tangential factor 
    	float radial_factor = (float) (Math.cos(theta));//calculate the radial factor 
    	float xx = (float)thickness / (float)210 * height;//we start at angle = 0 
    	float yy = 0; 
    	gl.glLineWidth(5f);
    	gl.glBegin(GL2.GL_POLYGON); //gl.glBegin(GL2.GL_POLYGON);
    	for(int ii = 0; ii < 100; ii++) 
    	{ 
    		gl.glVertex2f(xx + x, yy + y);//output vertex 

    		float tx = -yy; 
    		float ty = xx; 

    		xx += tx * tangetial_factor; 
    		yy += ty * tangetial_factor; 

    		xx *= radial_factor; 
    		yy *= radial_factor; 
    	} 
    	gl.glEnd();
    }
}
