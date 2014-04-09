package team16.project;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import team16.project.shapes.*;

public class Controller {
	
	int object = 0;
	int xpoints[];
	int ypoints[];

	
	Controller(Model model, View view) {
		MenuListener ml = new MenuListener(view);
		ToolbarListener tl = new ToolbarListener(view);
        view.addMenuListener(ml);
        view.addMouseListener(null);
        view.addToolbarListener(tl);
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
        View view;
    	public ToolbarListener(View view) {
    		this.view = view;
        }

		public void actionPerformed(ActionEvent e) {
            try {
            	if (e.getActionCommand().matches("new"))
                {
                	view.getGlistener().reset();
                }
            	if (e.getActionCommand().matches("open"))
                {
                	
                }
            	if (e.getActionCommand().matches("save"))
                {
                	
                }
            	if (e.getActionCommand().matches("exportAVI"))
                {
                	
                }
            	if (e.getActionCommand().matches("exportMPEG"))
                {
                	
                }
            	if (e.getActionCommand().matches("exportMP4"))
                {
                	
                }
            	if (e.getActionCommand().matches("exportMOV"))
                {
                	
                }
            	if (e.getActionCommand().matches("square"))
                {
                	view.ml.setActive(true);
                	view.ml.setType("square");
                }
            	if (e.getActionCommand().matches("circle"))
                {
                	view.ml.setActive(true);
                	view.ml.setType("circle");
                	}
            	if (e.getActionCommand().matches("star"))
                {
                	view.getGlistener().addShape(new Star());
                }
            	if (e.getActionCommand().matches("cross"))
                {
                	view.getGlistener().addShape(new Cross());
                }
            	if (e.getActionCommand().matches("wave"))
                {
                	view.getGlistener().addShape(new Wave());
                }
            	if (e.getActionCommand().matches("rotate"))
                {
                	
                }
            	if (e.getActionCommand().matches("motionpath"))
                {
                	
                }
            	if (e.getActionCommand().matches("animate"))
                {
                	
                }
            	if (e.getActionCommand().matches("color"))
                {

                }
            } catch (NumberFormatException nfex) {
            }
        }
    }
    
    class MenuListener implements ActionListener {
        View view;

    	public MenuListener(View view) {
    		this.view = view;
		}
        public void actionPerformed(ActionEvent e) {
            try {
                if (e.getActionCommand().matches("New"))
                {
                	view.getGlistener().reset();
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
                else if (e.getActionCommand().matches("Square"))
                {
                	view.ml.setActive(true);
                	view.ml.setType("square");
                }
                else if (e.getActionCommand().matches("Circle"))
                {
                	view.ml.setActive(true);
                	view.ml.setType("circle");
                	}
                else if (e.getActionCommand().matches("Star"))
                {
                	view.getGlistener().addShape(new Star());
                }
                else if (e.getActionCommand().matches("Cross"))
                {
                	view.getGlistener().addShape(new Cross());
                }
                else if (e.getActionCommand().matches("Wave"))
                {
                	view.getGlistener().addShape(new Wave());
                }
            } catch (NumberFormatException nfex) {
            }
        }
    }
}
