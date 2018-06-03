import java.util.Arrays;

public class Pieces {
	boolean[][]piece;
	public Pieces()
	{
		
	}
	void fall(boolean[][] piece)
	{
		boolean check=true;
		for (int i=0;i<10;i++)
		{
			if (piece[i][21])
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
				if (piece[i][j])
				{
					piece[i][j+1]=true;
					piece[i][j]=false;
				}
			}
		}
		}
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
	boolean[][] getPiece()
	{
		return null;
	}
	public void key()
	{
		if (TetrisMain.keyStroke.isSpacePressed())
		{
			
		}
		if (TetrisMain.keyStroke.isLeftPressed())
		{
			boolean check=true;
			for (int i=0;i<22;i++)
			{
				if  (piece[0][i]==true)
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
					if (piece[i][j])
					{
						piece[i-1][j]=true;
						piece[i][j]=false;
					}
				}
			}
			}
		}
		if (TetrisMain.keyStroke.isRightPressed())
		{
			boolean check=true;
			for (int i=0;i<22;i++)
			{
				if  (piece[9][i]==true)
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
					if (piece[i][j])
					{
						piece[i+1][j]=true;
						piece[i][j]=false;
					}
				}
			}
			}
		}
		if (TetrisMain.keyStroke.isDownPressed())
		{
			
		}
	}
	
}
