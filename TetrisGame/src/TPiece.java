import java.util.Arrays;

public class TPiece extends Pieces{

	boolean[][] piece = new boolean [10][22];
	public TPiece()
	{
		piece[4][1]=true;
		piece[5][1]=true;
		piece[6][1]=true;
		piece[5][0]=true;
		piece[0][0]=false;
		super.piece=piece;
	}
	
	
	void rotate()
	{

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
	public boolean[][] getPiece()
	{
		return this.piece;
	}
}
