package team16.project;

public class Main {
	public static void main(String[] args) {
	     
        Model      model      = new Model();
        View       view       = new View(model);
        new Controller(model, view);
        
        view.setVisible(true);
	}

}
