package team16.project;
import java.awt.*;

import javax.media.opengl.GLEventListener;
import javax.swing.*;

import java.awt.event.*;
public class View extends JFrame {
	private static final long serialVersionUID = 1L;
    
    private Menu menu = new Menu();
    private FileToolbar fileToolbar = new FileToolbar();
    private EditToolbar editToolbar = new EditToolbar();

    private BorderLayout bLayout = new BorderLayout();
    private DrawingSpace drawingSpace;

    View(Model model) {
        JPanel content = new JPanel();
        //JButton button = new JButton("button");
        content.setLayout(bLayout);
        setJMenuBar(menu);
        content.add(fileToolbar, BorderLayout.NORTH);
        content.add(editToolbar, BorderLayout.WEST);
        this.setContentPane(content);
        this.pack();
        
        int w = (Toolkit.getDefaultToolkit().getScreenSize().width) - (Toolkit.getDefaultToolkit().getScreenSize().width*4/100);
        int h = (Toolkit.getDefaultToolkit().getScreenSize().height) - (Toolkit.getDefaultToolkit().getScreenSize().height*18/100);
        drawingSpace = new DrawingSpace(w,h);

        content.add(drawingSpace);

        this.setTitle("Team 16 Motion Movie Maker");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    void reset() {
    }
    
    void setTotal(String newTotal) {
        //m_totalTf.setText(newTotal);
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
    
    void addGraphicListener(GLEventListener t) {
    	drawingSpace.addGraphicListener(t);
    }

}

