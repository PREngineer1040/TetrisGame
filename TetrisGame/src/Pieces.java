import java.util.Arrays;

public class Pieces {
	int[][]piece;
	public Pieces()
	{
		
	}
	void fall(int[][] piece)
	{

		boolean check=true;
		for (int i=0;i<10;i++)
		{
			if (piece[i][21]>0)
			{
				check=false;
			}
		}
		if (check)
		{
		for (int i=9;i>=0;i--)
		{
			for (int j=21;j>=0;j--)
			{
				if (piece[i][j]>0)
				{
					piece[i][j+1]=piece[i][j];
					piece[i][j]=0;
				}
			}
		}
		}
	}
	void rotate(int[][] piece)
	{
	
	}
	void moveL(int[][] piece)
	{
		
		boolean check=true;
		for (int j=0;j<22;j++)
		{
			if (piece[0][j]>0)
			{
				check=false;
			}
		}
	if (check)
	{
		for (int i=0;i<10;i++)
		{
			for (int j=0;j<22;j++)
			{
				if (piece[i][j]>0)
				{
					piece[i-1][j]=piece[i][j];
					piece[i][j]=0;
				}
			}
		}
	}
	}
	void moveR(int[][] piece)
	{
		boolean check=true;
		for (int j=0;j<22;j++)
		{
			if (piece[9][j]>0)
			{
				check=false;
			}
		}
	if (check)
	{
		for (int i=9;i>=0;i--)
		{
			for (int j=21;j>=0;j--)
			{
				if (piece[i][j]>0)
				{
					piece[i+1][j]=piece[i][j];
					piece[i][j]=0;
				}
			}
		}
	}
	}
	void faster()
	{
		
	}
	int[][] getPiece()
	{
		return null;
	}
	public void key(int[][] piece)
	{
		if (TetrisMain.keyStroke.isSpacePressed())
		{
			rotate(piece); 
		}
		if (TetrisMain.keyStroke.isLeftPressed())
		{
			moveL(piece);
		}
		if (TetrisMain.keyStroke.isRightPressed())
		{
			moveR(piece);
		}
		if (TetrisMain.keyStroke.isDownPressed())
		{
			
		}
	}
	
}
