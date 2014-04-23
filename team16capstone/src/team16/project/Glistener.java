package team16.project;

import java.awt.Color;

import javax.media.opengl.GL;
import javax.media.opengl.GL2;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.awt.GLCanvas;
import team16.project.animation.Rotate;
import team16.project.shapes.Circle;
import team16.project.shapes.Cross;
import team16.project.shapes.Shape;
import team16.project.shapes.Square;

public class Glistener implements GLEventListener{
    float angle = 0;
    private Shape shapes[] = new Shape[100];
    private Shape undoShape[] = new Shape[100];
    GLCanvas canvas;
	public Glistener(GLCanvas canvas) {
		this.canvas = canvas;
		}

	@Override
	public void display(GLAutoDrawable glautodrawable) {
//	    this.update();
	    this.render(glautodrawable);
	    }

    private void render(GLAutoDrawable drawable) {
        GL2 gl2 = drawable.getGL().getGL2();
    	gl2.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);


    	angle += 1;
        for(int i = 0; shapes[i] != null; i++)
        {
        	gl2.glLoadIdentity();
            if(shapes[i].getType().equals("square"))
            	((Square)shapes[i]).drawSquare(gl2, angle);
            else if(shapes[i].getType().equals("circle"))
            	((Circle)shapes[i]).drawCircle(gl2, angle);
            else if(shapes[i].getType().equals("cross"))
            	((Cross)shapes[i]).drawCross(gl2, angle);
        }
    }
      
    @SuppressWarnings("unused")
	private void update() {

    }

	@Override
	public void dispose(GLAutoDrawable glautodrawable) {
	}

	@Override
	public void init(GLAutoDrawable glautodrawable) {
		
	}

	@Override
	public void reshape(GLAutoDrawable glautodrawable, int x, int y, int width,
			int height) {
		this.setup( glautodrawable.getGL().getGL2(), width, height );
	}
	
	private void setup(GL2 gl2, int width, int height) {
        gl2.glMatrixMode(GL2.GL_PROJECTION);
        gl2.glLoadIdentity();
        gl2.glOrthof( 0.0f, width, 0.0f, height,-height,height);
        gl2.glMatrixMode(GL2.GL_MODELVIEW);
        gl2.glLoadIdentity();
	}
	
	public void addShape(int x, int y, int height, String type, int size, Color rGB, boolean filled, int thickness, Rotate rotate){
		
		int a = 0;
		for(int i = 0;shapes[i]!=null;i++)
		{
			a = i+1;
		}
		System.out.println("Adding shape to " + a);
		if(type.equals("square"))
			shapes[a] = new Square(x,y,height,size,rGB,filled,thickness,rotate);
		else if(type.equals("circle"))
			shapes[a] = new Circle(x,y,height,size,rGB,filled,thickness,rotate);
		else if(type.equals("cross"))
			shapes[a] = new Cross(x,y,height,size,rGB,thickness,rotate);

	}
	
	public void reset()
	{
		shapes = new Shape[100];
	}
	
	public void undo(){
		int a = 0, b = 0;
		for(int i = 0;shapes[i]!=null;i++)
		{
			a = i+1;
		}
		if (a > 0)
		{
			for(int i = 0;undoShape[i]!=null;i++)
			{
				b = i+1;
			}
			undoShape[b] = shapes[a-1];
			shapes[a-1] = null;	
		}
	}
	
	public void redo(){
		int a = 0, b = 0;
		for(int i = 0;shapes[i]!=null;i++)
		{
			a = i+1;
		}
		if(undoShape[0]!=null)
		{
			for(int i = 99;undoShape[i]==null;i--)
			{
				b = i-1;
			}
				shapes[a] = undoShape[b];
				undoShape[b] = null;
		}
	}
}
