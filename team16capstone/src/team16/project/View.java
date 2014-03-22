package team16.project;
import java.awt.*;
import javax.swing.*;

import java.awt.event.*;
public class View extends JFrame {
	private static final long serialVersionUID = 1L;
    
    private JButton clearButton = new JButton("Clear");
    private Menu menu = new Menu();

    View(Model model) {
        this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        JPanel content = new JPanel();
        content.setLayout(new FlowLayout());
        content.add(clearButton);
        setJMenuBar(menu);
        
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
    
    void addButtonListener(ActionListener t) {
        clearButton.addActionListener(t);
    }
    
    void addMenuListener(ActionListener t) {
    	menu.addItemListener(t);
    }

}

