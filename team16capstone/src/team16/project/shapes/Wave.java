package team16.project.shapes;


public class Wave extends Shape{
	private int vertices[][] = new int[5][5];
	
	public Wave(){
		setType("wave");

		vertices[0][0] = 0;
		vertices[0][1] = 100;
		vertices[0][2] = 100;
		vertices[0][3] = 0;
		vertices[0][4] = 0;
		vertices[1][0] = 0;
		vertices[1][1] = 0;
		vertices[1][2] = 100;
		vertices[1][3] = 100;
		vertices[1][4] = 0;
	}
	
	public int getVertex(int i, int j){
		return vertices[i][j];
	}
}
