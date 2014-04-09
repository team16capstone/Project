package team16.project;

import java.awt.Toolkit;

import javax.media.opengl.GL;
import javax.media.opengl.GL2;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.awt.GLJPanel;
import javax.media.opengl.glu.GLU;

import team16.project.animation.Animation;
import team16.project.shapes.*;

public class Glistener implements GLEventListener{

    private double theta = 0;
    private double s = 0;
    private double c = 0;
    
    private Shape shapes[] = new Shape[100];
    private Animation anim[] = new Animation[1000];
    GLJPanel canvas;
	public Glistener(GLJPanel canvas) {
		this.canvas = canvas;
		}

	@Override
	public void display(GLAutoDrawable glautodrawable) {
	    this.update();
	    this.render(glautodrawable);
	    }

    private void render(GLAutoDrawable drawable) {
        GL2 gl = drawable.getGL().getGL2();

        gl.glClear(GL.GL_COLOR_BUFFER_BIT);
     
        for(int i = 0; shapes[i] != null; i++)
        {
            if(shapes[i].getType().equals("square")){
            	drawSquare(gl,(Square)shapes[i]);
            }
            if(shapes[i].getType().equals("circle")){
            	drawCircle(gl,(Circle)shapes[i]);
            }
            if(shapes[i].getType().equals("wave"))
            {
            	drawWave(gl,(Wave)shapes[i]);
            }
        }
    }
    private void drawSquare(GL2 gl, Square sq)
    {
    	gl.glBegin(GL2.GL_POLYGON);
        for(int j = 0; j < 5; j++)
        {
        	gl.glColor3f(0, 0, 1);
        	gl.glVertex2d(((Square)(sq)).getVertex(0, j),((Square)(sq)).getVertex(1, j));
        }
        gl.glEnd();
    }
    
    private void drawCircle(GL2 gl, Circle sq)
    {

        gl.glColor3f(1, 1, 0);

    	float theta = (float) (2 * 3.1415926 / (100)); 
    	float tangetial_factor = (float) (Math.tan(theta));//calculate the tangential factor 
    	float radial_factor = (float) (Math.cos(theta));//calculate the radial factor 
    	float x = 50;//we start at angle = 0 
    	float y = 0; 
    	gl.glLineWidth(5f);
    	gl.glBegin(GL2.GL_LINE_LOOP); 
    	for(int ii = 0; ii < 100; ii++) 
    	{ 
    		gl.glVertex2f(x + sq.getX(), y + sq.getY());//output vertex 

    		float tx = -y; 
    		float ty = x; 

    		x += tx * tangetial_factor; 
    		y += ty * tangetial_factor; 

    		x *= radial_factor; 
    		y *= radial_factor; 
    	} 
    	gl.glEnd();
    }
    
    private void drawWave(GL2 gl, Wave sq)
    {

        // draw a triangle filling the window
        gl.glBegin(GL2.GL_POLYGON);
        gl.glColor3f(1, 0, 0);
        gl.glVertex2d(-s, -c);
        gl.glColor3f(0, 1, 0);
        gl.glVertex2d(s, c);
        gl.glColor3f(0, 0, 1);
        gl.glVertex2d(s, -c);
        gl.glEnd();
    }
    
    private void update() {
        theta += 0.01;
        s = Math.sin(theta)*canvas.getSize().width;
        c = Math.cos(theta)*canvas.getSize().height;
        for(int i = 0; shapes[i] != null; i++)
        {
            if(shapes[i].getType().equals("square")){
//            	((Square)shapes[i]).setVertex(1, 1, ((Square)shapes[i]).getVertex(1, 1)+1);

            }
            if(shapes[i].getType().equals("circle")){

            }
            if(shapes[i].getType().equals("wave"))
            {

            }
        }
    }

	@Override
	public void dispose(GLAutoDrawable glautodrawable) {
		// TODO Auto-generated method stub		
	}

	@Override
	public void init(GLAutoDrawable glautodrawable) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reshape(GLAutoDrawable glautodrawable, int x, int y, int width,
			int height) {
		this.setup( glautodrawable.getGL().getGL2(), width, height );
	}
	
	private void setup(GL2 gl2, int width, int height) {
    	gl2.glMatrixMode( GL2.GL_PROJECTION );
        gl2.glLoadIdentity();

        // coordinate system origin at lower left with width and height same as the window
        GLU glu = new GLU();
        glu.gluOrtho2D( 0.0f, width, 0.0f, height );

        gl2.glMatrixMode( GL2.GL_MODELVIEW );
        gl2.glLoadIdentity();

        gl2.glViewport( 0, 0, width, height );
	}
	
	public void addShape(Shape shape){
		
		int a = 0;
		for(int i = 0;shapes[i]!=null;i++)
		{
			a = i+1;
		}
		System.out.println("Adding shape to " + a);
		shapes[a] = shape;
	}
	
	public void reset()
	{
		shapes = new Shape[100];
	}
	
}
