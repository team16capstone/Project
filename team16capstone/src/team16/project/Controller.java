package team16.project;
import java.awt.event.*;

import javax.media.opengl.GL;
import javax.media.opengl.GL2;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;

public class Controller {
	
	int object = 0;
	int xpoints[];
	int ypoints[];
	
	Controller(Model model, View view) {
        view.addMenuListener(new MenuListener());
        view.addGraphicListener(new GraphicListener());
        view.addMouseListener(null);
        view.addToolbarListener(new ToolbarListener());
    }
    
    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                System.out.println("HEY IT WORKED");
            } catch (NumberFormatException nfex) {
            }
        }
    }

    class ToolbarListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
            	if (e.getActionCommand().matches("new"))
                {
                	System.out.println("YOU CLICKED NEW BUTTON");
                }
            	if (e.getActionCommand().matches("square"))
                {
                	System.out.println("YOU CLICKED NEW SQUARE");
                }
            } catch (NumberFormatException nfex) {
            }
        }
    }
    
    class MenuListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                if (e.getActionCommand().matches("New"))
                {
                	System.out.println("YOU CLICKED NEW");
                }
                else if (e.getActionCommand().matches("Save Project"))
                {
                	
                }
                else if (e.getActionCommand().matches("Open Project"))
                {
                	
                }
                else if (e.getActionCommand().matches("Export To AVI"))
                {
                	
                }
                else if (e.getActionCommand().matches("Export To MPEG"))
                {
                	
                }
                else if (e.getActionCommand().matches("Export To MP4"))
                {
                	
                }
                else if (e.getActionCommand().matches("Export To MOV"))
                {
                	
                }
                else if (e.getActionCommand().matches("Exit"))
                {
                	System.exit(0);
                }
            } catch (NumberFormatException nfex) {
            }
        }
    }
    
    class GraphicListener implements GLEventListener{
		@Override
		public void dispose(GLAutoDrawable arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void init(GLAutoDrawable drawable) {

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
    	
	  	
		@Override
		public void display(GLAutoDrawable glautodrawable) {
			this.render( glautodrawable.getGL().getGL2(), glautodrawable.getWidth(), glautodrawable.getHeight() );
		}
			
		void render(GL2 gl2, int width, int height) {
			gl2.glClear( GL.GL_COLOR_BUFFER_BIT );

	        // draw a triangle filling the window
	        gl2.glLoadIdentity();
	        gl2.glBegin( GL2.GL_TRIANGLES );
	        gl2.glColor3f( 1, 0, 0 );
	        gl2.glVertex2f( 0, 0 );
	        gl2.glColor3f( 1, 0, 0 );
	        gl2.glVertex2f( width, 0 );
	        gl2.glColor3f( 1, 0, 0 );
	        gl2.glVertex2f( width / 2, height );
	        gl2.glEnd();
	        
	        //draw a square
//			gl2.glClear( GL.GL_COLOR_BUFFER_BIT );

	        gl2.glLoadIdentity();
	        gl2.glBegin( GL2.GL_POLYGON);
	        gl2.glColor3f( 0, 1, 0 );
	        gl2.glVertex2f( 0, 0 );
	        gl2.glColor3f( 0, 1, 0 );
	        gl2.glVertex2f( 100, 0 );
	        gl2.glColor3f( 0, 1, 0 );
	        gl2.glVertex2f( 100, 100 );
	        gl2.glColor3f( 0, 1, 0 );
	        gl2.glVertex2f( 0, 100 );
	        gl2.glColor3f( 0, 1, 0 );
	        gl2.glVertex2f( 0, 0 );
	        gl2.glColor3f( 0, 1, 0 );
	        gl2.glEnd();
	        
	        gl2.glLoadIdentity();
	        gl2.glBegin( GL2.GL_POLYGON );
	        gl2.glColor3f( 0, 0, 1 );
	        gl2.glVertex3f( 200, 100, 0 );
	        gl2.glColor3f( 0, 0, 1 );
	        gl2.glVertex3f( 300, 0, 0 );
	        gl2.glColor3f( 0, 0, 1 );
	        gl2.glVertex3f( 100, 0, 0 );
	        gl2.glColor3f( 0, 0, 1 );
	        
	        gl2.glColor3f( 0, 0, 1 );
	        gl2.glVertex3f( 200, 100, 100 );
	        gl2.glColor3f( 0, 0, 1 );
	        gl2.glVertex3f( 300, 0, 100 );
	        gl2.glColor3f( 0, 0, 1 );
	        gl2.glVertex3f( 100, 0, 100 );
	        gl2.glColor3f( 0, 0, 1 );
	        
	        
	        
	        
	        
	        gl2.glEnd();
		}
    }
}
