package team16.project;

import java.awt.Color;

import javax.swing.JPanel;

import javax.media.opengl.GL;
import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;

import javax.media.opengl.GLProfile;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.awt.GLCanvas;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLEventListener;


public class drawingSpace extends JPanel{

	private static final long serialVersionUID = 1L;

	public drawingSpace() {
		GLProfile glprofile = GLProfile.getDefault();
		GLCapabilities glcapabilities = new GLCapabilities(glprofile);
		//Given this is a priority in the program
		glcapabilities.setHardwareAccelerated(true);
		final GLCanvas drawingPad = new GLCanvas(glcapabilities);
		
		//Sample demo code
        drawingPad.addGLEventListener( new GLEventListener() {
            
            @Override
            public void reshape( GLAutoDrawable glautodrawable, int x, int y, int width, int height ) {
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
            public void init( GLAutoDrawable glautodrawable ) {
            }
            
            @Override
            public void dispose( GLAutoDrawable glautodrawable ) {
            }
            
            @Override
            public void display( GLAutoDrawable glautodrawable ) {
                this.render( glautodrawable.getGL().getGL2(), glautodrawable.getWidth(), glautodrawable.getHeight() );
            }

			private void render(GL2 gl2, int width, int height) {
				gl2.glClear( GL.GL_COLOR_BUFFER_BIT );

		        // draw a triangle filling the window
		        gl2.glLoadIdentity();
		        gl2.glBegin( GL.GL_TRIANGLES );
		        gl2.glColor3f( 1, 0, 0 );
		        gl2.glVertex2f( 0, 0 );
		        gl2.glColor3f( 0, 1, 0 );
		        gl2.glVertex2f( width, 0 );
		        gl2.glColor3f( 0, 0, 1 );
		        gl2.glVertex2f( width / 2, height );
		        gl2.glEnd();
				
			}
        });
        
        //End Sample Code
		drawingPad.display();
		drawingPad.doLayout();
		drawingPad.setBackground(Color.black);
		drawingPad.setBounds(0,0, 500, 500);
		drawingPad.setEnabled(true);
		drawingPad.setForeground(Color.white);
		drawingPad.setVisible(true);
		add(drawingPad);

	}
	
}
