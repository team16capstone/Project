package team16.project;

import java.awt.Frame;

public class Main {
	public static void main(String[] args) {
	     
        Model      model      = new Model();
        View       view       = new View(model);
        new Controller(model, view);

        view.setExtendedState(Frame.MAXIMIZED_BOTH);
        view.setVisible(true);
	}

}
