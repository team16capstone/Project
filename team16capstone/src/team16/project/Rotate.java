package team16.project;

public class Rotate {
	private Boolean state = false;
	private Boolean direction = false;
	private int speed = 0;
	
	public Rotate(Boolean s, Boolean d, int sp){
		state = s;
		direction = d;
		speed = sp;
	}
	
	public Boolean getState(){
		return state;
	}
	
	public Boolean getDirection(){
		return direction;
	}
	
	public int getSpeed(){
		return speed;
	}
	
	public void setState(Boolean s){
		state = s;
	}
	
	public void setDirection(Boolean d){
		direction = d;
	}
	
	public void setSpeed(int s){
		speed = s;
	}
}
