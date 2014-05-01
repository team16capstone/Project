package team16.project.shapes;

import java.io.Serializable;


public abstract class Shape implements Serializable{
	private static final long serialVersionUID = 1L;
	private String type;
	
	public Shape(String type){
		this.type = type;
	}
	
	public String getType()
	{
		return type;
	}
}
