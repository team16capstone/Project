package team16.project;
import java.awt.*;
import javax.swing.*;

import java.awt.event.*;
public class View extends JFrame {
	private static final long serialVersionUID = 1L;
    
    private Menu menu = new Menu();
    private FileToolbar fileToolbar = new FileToolbar();
    private EditToolbar editToolbar = new EditToolbar();

    private BorderLayout bLayout = new BorderLayout();
    
    View(Model model) {
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        JPanel content = new JPanel();
        JButton button = new JButton("button");

        content.setLayout(bLayout);
        setJMenuBar(menu);
        content.add(button);
        content.add(fileToolbar, BorderLayout.NORTH);
        content.add(editToolbar, BorderLayout.WEST);
        fileToolbar.setSize(fileToolbar.getWidth(), super.getHeight());

        this.setContentPane(content);
        this.pack();
        
   
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

}

