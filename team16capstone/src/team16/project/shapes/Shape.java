package team16.project.shapes;


public abstract class Shape{
	private String type;
	private int shapeId;
	
	public String getType()
	{
		return type;
	}
	
	public void setType(String s){
		type = s;
	}
	
	public int getShapeId()
	{
		return shapeId;
	}
	
	public void setShapeId(int id){
		shapeId= id;
	}
}
