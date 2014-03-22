package team16.project;
import java.awt.event.*;

public class Controller {
    private Model mainModel;
    private View  mainView;

    Controller(Model model, View view) {
        mainModel = model;
        mainView  = view;
        
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
                if(e.getActionCommand().matches("New"))
                	{
                	System.out.println("YOU CLICKED NEW");
                	}
            } catch (NumberFormatException nfex) {
            }
        }
    }
}
