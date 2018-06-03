import java.util.Arrays;

public class TPiece extends Pieces{
// T shape piece has values 1 and 2, where the 2 is the center of the shape. 
	int[][] piece = new int[10][22];
	public TPiece()
	{
		piece[4][1]=1;
		piece[5][1]=2;
		piece[6][1]=1;
		piece[5][0]=1;

		super.piece=piece;
	}
	
	@Override
	void rotate(int[][] piece)
	{

		 for (int i=0;i<10;i++)
		 {
			 for (int j =0;j<21    ;j++)
			 {
				 if (piece[i][j]==2)
				 {
					 //Aqui dentro van los else if para los otros casos
					 if(piece[i-1][j]==1 && piece[i+1][j]==1 && piece[i][j-1]==1)
					 {
						 piece[i-1][j]=0;
						 piece[i][j+1]=1;
					 }
					 else if(piece[i][j+1]==1 && piece[i+1][j]==1 && piece[i][j-1]==1)
					 {
						piece[i][j-1]=0;
						 piece[i-1][j]=1;
					 }
					 else if(piece[i][j+1]==1 && piece[i+1][j]==1 && piece[i-1][j]==1)
					 {
						 piece[i+1][j]=0;
						 piece[i][j-1]=1;
					 }
					 else if(piece[i][j+1]==1 && piece[i][j-1]==1 && piece[i-1][j]==1)
					 {
						 piece[i][j+1]=0;
						 piece[i+1][j]=1;
					 }
				 }
			 }
		 }
	}
	void moveL()
	{
		
	}
	void moveR()
	{
		
	}
	void faster()
	{
		
	}
	public int[][] getPiece()
	{
		return this.piece; 
	}
}
