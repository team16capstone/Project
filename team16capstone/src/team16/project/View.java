package team16.project;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLProfile;
import javax.media.opengl.awt.GLCanvas;
import javax.media.opengl.awt.GLJPanel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.jogamp.opengl.util.FPSAnimator;

public class View extends JFrame {
	private static final long serialVersionUID = 1L;
    
    private Menu menu = new Menu();
    private FileToolbar fileToolbar = new FileToolbar();
    private EditToolbar editToolbar = new EditToolbar();
    
    private BorderLayout bLayout = new BorderLayout();
    int currentColor[] = new int[3];
    GLProfile glprofile = GLProfile.getDefault();
    GLCapabilities glcapabilities = new GLCapabilities( glprofile );
    GLJPanel canvas = new GLJPanel( glcapabilities );
    Glistener gl = new Glistener(canvas);
    MyMouseListener ml = new MyMouseListener(this,canvas);
    MyMouseListener MListener;
    /**FOR GRAPHICS*/
    View(Model model) {
    	this.setLayout(bLayout);


        FPSAnimator animator = new FPSAnimator(canvas,30, true);
        
        //JButton button = new JButton("button");
        setJMenuBar(menu);
        this.getContentPane().add(fileToolbar, BorderLayout.NORTH);
        this.getContentPane().add(editToolbar, BorderLayout.WEST);

        
//        int w = (Toolkit.getDefaultToolkit().getScreenSize().width) - (Toolkit.getDefaultToolkit().getScreenSize().width*4/100);
//        int h = (Toolkit.getDefaultToolkit().getScreenSize().height) - (Toolkit.getDefaultToolkit().getScreenSize().height*18/100);
//		gljpanel.setSize(w, h);
        this.getContentPane().add(canvas, BorderLayout.CENTER);
        
        this.setTitle("Team 16 Motion Movie Maker");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        canvas.addGLEventListener(gl);
        canvas.addMouseListener(ml);
        animator.start();
    }
    

	void reset() {
    }
    
   
    void showError(String errMessage) {
        JOptionPane.showMessageDialog(this, errMessage);
    }
    
   
    void addMenuListener(ActionListener t) {
    	menu.addItemListener(t);
    }
    
    void addToolbarListener(ActionListener t) {
    	fileToolbar.addListeners(t);
    	editToolbar.addListeners(t);
    }
    
   
    public Glistener getGlistener()
    {
    	return gl;
    }
    
    public MyMouseListener getMyMouseListener(){
    	return ml;
    }

    public void chooseColor()
    {
    	
    	
    }
}

