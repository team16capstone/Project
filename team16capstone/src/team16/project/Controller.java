package team16.project;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

import team16.project.animation.Rotate;

public class Controller {
	
	int object = 0;
	int xpoints[];
	int ypoints[];
	Boolean direction;
	int speed = 0;
	View view;
	JColorChooser colorChooser=new JColorChooser();
	
	Controller(Model model, View view) {
		this.view = view;
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
            	else if (e.getActionCommand().matches("open"))
                {
                	
                }
            	else if (e.getActionCommand().matches("save"))
                {
                	
                }
            	else if (e.getActionCommand().matches("exportAVI"))
                {
                	
                }
            	else if (e.getActionCommand().matches("exportMPEG"))
                {
                	
                }
            	else if (e.getActionCommand().matches("exportMP4"))
                {
                	
                }
            	else if (e.getActionCommand().matches("exportMOV"))
                {
                	
                }
            	else if (e.getActionCommand().matches("square"))
                {
            		doProcessing("square");
                }
            	else if (e.getActionCommand().matches("circle"))
                {
            		doProcessing("circle");
                }
            	else if (e.getActionCommand().matches("star"))
                {
            		doProcessing("star");
                }
            	else if (e.getActionCommand().matches("cross"))
                {
            		doProcessing("cross");
                }
            	else if (e.getActionCommand().matches("wave"))
                {
            		doProcessing("wave");
                }
            	else if (e.getActionCommand().matches("rotate"))
                {
            		direction = false;

            		if(view.getRotate().getState())
            			view.setRotate(new Rotate(false,direction,0));
            		else
            		{
            			doRotate();
            		}
                }
            	else if (e.getActionCommand().matches("motionBounce"))
                {
                	
                }
            	else if (e.getActionCommand().matches("motionPath"))
                {
                	
                }
            	else if (e.getActionCommand().matches("color"))
                {
                	JOptionPane.showMessageDialog(null,colorChooser);
                	view.setShapeColor(colorChooser.getColor());
                }
            	else if (e.getActionCommand().matches("undo"))
                {
            		view.gl.undo();
            		System.out.println("UNDO CLICKED");
                }
            	else if (e.getActionCommand().matches("redo"))
                {
            		view.gl.redo();
            		System.out.println("REDO CLICKED");
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
            		doProcessing("square");
                }
                else if (e.getActionCommand().matches("Circle"))
                {
            		doProcessing("circle");
                }
                else if (e.getActionCommand().matches("Star"))
                {
            		doProcessing("star");
                }
                else if (e.getActionCommand().matches("Cross"))
                {
            		doProcessing("cross");
                }
                else if (e.getActionCommand().matches("Wave"))
                {
            		doProcessing("wave");
                }
            } catch (NumberFormatException nfex) {
            }
        }
    }
    
    public void doProcessing(String shape){
    	int tmpSize = Integer.parseInt(JOptionPane.showInputDialog("Please enter a size value from 1 to 100 (Recomended 10)"));
    	while(tmpSize > 100 || tmpSize < 1)
    		tmpSize = Integer.parseInt(JOptionPane.showInputDialog("INPUT NOT VALID! Please enter a size value from 1 to 100 (Recomended 10)"));
    	if(tmpSize < 1 || tmpSize > 100)
    		return;
    	else
    	{
        	view.ml.setActive(true);
        	view.ml.setType(shape);
        	view.ml.setSize(tmpSize);
        	int tmpFilled = 1;
        	if(!shape.equals("cross"))
        	tmpFilled = (JOptionPane.showOptionDialog(null, "Would you like this " + shape + " to be filled?","Shape Colour Fill",JOptionPane.YES_NO_OPTION , JOptionPane.INFORMATION_MESSAGE, null, null, 1));
        	if(tmpFilled == 0)
        		view.ml.setFilled(true);
        	else
        	{
        		view.ml.setFilled(false);
            	int tmpThick = Integer.parseInt(JOptionPane.showInputDialog("Please enter a line thickness value from 1 to 10"));
            	while(tmpThick > 10 || tmpThick < 1)
            		tmpThick = Integer.parseInt(JOptionPane.showInputDialog("INPUT NOT VALID! Please enter a line thickness value from 1 to 10"));
            	if(tmpThick < 1 || tmpThick > 10)
            		return;
            	else
            	{
            		view.ml.setThickness(tmpThick);
            	}
        	}
        		
    	}
    }
    
    public void doRotate(){
		Object[] options = {"Clockwise",
        "Anti-Clockwise"};
		int n = JOptionPane.showOptionDialog(null,
				"What direction would you like the shape to rotate?",
				"Rotation Direction",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,
				options,
				options[1]);
		if(n == 0)
			direction = true;
   	
    	speed = Integer.parseInt(JOptionPane.showInputDialog("Please enter a rotation speed from 1 to 100"));
    	while(speed > 100 || speed < 1)
    		speed = Integer.parseInt(JOptionPane.showInputDialog("INPUT NOT VALID! Please enter a rotation speed from 1 to 100"));
    	if(speed < 1 || speed > 100)
    		return;
    	else
    	{
    		view.setRotate(new Rotate(true,direction,speed));
    	}
    }
}
