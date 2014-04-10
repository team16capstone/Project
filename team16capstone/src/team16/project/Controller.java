package team16.project;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

public class Controller {
	
	int object = 0;
	int xpoints[];
	int ypoints[];
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
            		doProcessing("square");
                }
            	if (e.getActionCommand().matches("circle"))
                {
            		doProcessing("circle");
                }
            	if (e.getActionCommand().matches("star"))
                {
            		doProcessing("star");
                }
            	if (e.getActionCommand().matches("cross"))
                {
            		doProcessing("cross");
                }
            	if (e.getActionCommand().matches("wave"))
                {
            		doProcessing("wave");
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
    	JOptionPane.showMessageDialog(null,colorChooser);
    	System.out.println(colorChooser.getColor());
    	int tmpThick = Integer.parseInt(JOptionPane.showInputDialog("Please enter a size value from 1 to 100 (Recomended 10)"));
    	while(tmpThick > 100 || tmpThick < 1)
    		tmpThick = Integer.parseInt(JOptionPane.showInputDialog("INPUT NOT VALID! Please enter a size value from 1 to 100 (Recomended 10)"));
    	if(tmpThick < 1 || tmpThick > 100)
    		return;
    	else
    	{
        	view.ml.setActive(true);
        	view.ml.setType(shape);
        	view.ml.setThickness(tmpThick);
        	int[] tmpRGB = {colorChooser.getColor().getRed(),colorChooser.getColor().getGreen(),colorChooser.getColor().getBlue()};
        	view.ml.setRGB(tmpRGB);
    	}
    }
}
