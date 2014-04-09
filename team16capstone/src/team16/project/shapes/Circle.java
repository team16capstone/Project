package team16.project.shapes;


public class Circle extends Shape{
	private int x;
	private int y;
	
	public Circle(int x, int y, int height){
		setType("circle");
		this.x = x;
		this.y = height - y;
	}
	
	public int getY(){
		return y;
	}
	public int getX(){
		return x;
	}
}
