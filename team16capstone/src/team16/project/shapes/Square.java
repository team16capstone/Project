package team16.project.shapes;


public class Square extends Shape{
	private int vertices[][] = new int[5][5];
	
	public Square(int x, int y, int height){
		setType("square");

		vertices[0][0] = x+0;
		vertices[0][1] = x+100;
		vertices[0][2] = x+100;
		vertices[0][3] = x+0;
		vertices[0][4] = x+0;
		vertices[1][0] = height-y+0;
		vertices[1][1] = height-y+0;
		vertices[1][2] = height-y+100;
		vertices[1][3] = height-y+100;
		vertices[1][4] = height-y+0;
	}
	
	public int getVertex(int i, int j){
		return vertices[i][j];
	}
	
	public void setVertex(int i, int j, int k){
		vertices[i][j] = k;
	}
}
