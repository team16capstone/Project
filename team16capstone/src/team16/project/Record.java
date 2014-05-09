package team16.project;

import java.awt.Component;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import com.xuggle.mediatool.IMediaWriter;
import com.xuggle.mediatool.ToolFactory;

import javax.imageio.ImageIO;
import javax.media.opengl.awt.GLJPanel;


public class Record {
	protected static int j = 0;
	protected static boolean stop = false;
	public static BufferedImage getScreenShot(
		    Component component) {

		    BufferedImage image = new BufferedImage(
		      component.getWidth(),
		      component.getHeight(),
		      BufferedImage.TYPE_INT_RGB
		      );
		    component.paint( image.getGraphics() );
		    return image;
		  }
	public static void saveImg(final GLJPanel canvas) {
		initFolder();
		stop = false;
		Runnable task = new Runnable(){
			@Override
			public void run(){
	int i = 0;
	while(!stop){
		BufferedImage img = getScreenShot(
            canvas );
          try {
            // Save the Image as a PNG in a temp directory - Send later for processing
            ImageIO.write(img,"png",new File("tmp/" + i + ".png"));
          } catch(Exception e) {
            e.printStackTrace();
          }
          i++;
        }
	}
	}; new Thread(task, "Service Thread").start();
	}
	public static void initFolder() {
		File folder = new File("tmp/");
	    File[] files = folder.listFiles();
	    if(files!=null) {
	        for(File f: files) {
	                f.delete();
	        }
	    }
	}
	public static void exportMovie(){
		j = 0;
		IMediaWriter encoder = ToolFactory.makeWriter("output.mp4");
		encoder.addVideoStream(0, 0, 1920, 1080);
		
		long startTime = System.nanoTime();
		while (haveMoreVideo()){
			BufferedImage image = getImage();
			encoder.encodeVideo(0, image, System.nanoTime()-startTime, TimeUnit.NANOSECONDS);
		}
		encoder.close();
	}

	private static BufferedImage getImage() {
		BufferedImage next = null;
		try {
			next = ImageIO.read(new File("tmp/" + j + ".png"));
		} catch (IOException e){
			e.printStackTrace();
		} finally {
			j++;
		}
		return next;
	}

	private static boolean haveMoreVideo() {
		File test = new File("tmp/" + j + ".png");
		if (test.exists()){
			return true;
		} else {
			return false;
		}
	}
  

}
