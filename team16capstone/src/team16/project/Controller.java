package team16.project;
import java.awt.event.*;

public class Controller {

	Controller(Model model, View view) {
        view.addButtonListener(new ButtonListener());
        view.addMenuListener(new MenuListener());
    }
    
    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                System.out.println("HEY IT WORKED");
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
}
