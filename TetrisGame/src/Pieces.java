import java.util.Arrays;

public class Pieces {
	int[][]piece= new int[10][22];
	boolean placed = false;
	Items items;
	public Pieces()
	{
		
	}
	void fall()
	{ 

		boolean check=true;
		for (int i=0;i<10;i++)
		{
			if (this.piece[i][21]>0)
			{
				check=false;
			}
		}
		if (check && !this.placed)
		{
		for (int i=9;i>=0;i--)
		{
			for (int j=21;j>=0;j--)
			{
				if (this.piece[i][j]>0)
				{
					this.piece[i][j+1]=piece[i][j];
					this.piece[i][j]=0;
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
		
		boolean check=true;
		for (int j=0;j<22;j++)
		{
			if (piece[0][j]>0)
			{
				check=false;
			}
		}
		for (int i=0;i<10;i++)
		{
			if (piece[i][21]>0)
			{
				check=false;
			}
		}
		for (int k=0;k<items.pieces.size()-1;k++)
		{   
			Pieces piece= items.pieces.get(k);
			for (int i=1;i<10;i++)
			{
				for (int j=0;j<22;j++)
				{
					if (piece.piece[i-1][j]>0 && this.piece[i][j]>0)
					{
						check=false;
					}
				}
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
	void moveR()
	{
		boolean check=true;
		for (int j=0;j<22;j++)
		{
			if (this.piece[9][j]>0)
			{
				check=false;
			}
		}
		for (int i=0;i<10;i++)
		{
			if (this.piece[i][21]>0)
			{
				check=false;
			}
		}
		for (int k=0;k<items.pieces.size()-1;k++)
		{   
			Pieces piece= items.pieces.get(k);
			for (int i=0;i<9;i++)
			{
				for (int j=0;j<22;j++)
				{
					if (piece.piece[i+1][j]>0 && this.piece[i][j]>0)
					{
						check=false;
					}
				}
			}
			
		}
	if (check)
	{
		for (int i=9;i>=0;i--)
		{
			for (int j=21;j>=0;j--)
			{
				if (this.piece[i][j]>0)
				{
					this.piece[i+1][j]=this.piece[i][j];
					this.piece[i][j]=0;
				}
			}
		}
	}
	}
	void faster()
	{
		
	}

	public void key(Items items)
	{
		this.items=items;
		
		if (TetrisMain.keyStroke.isSpacePressed())
		{
			this.rotate(); 
			TetrisMain.keyStroke.setSpacePressed(false);
		}
		if (TetrisMain.keyStroke.isLeftPressed())
		{
			this.moveL();
			TetrisMain.keyStroke.setLeftPressed(false);
		}
		if (TetrisMain.keyStroke.isRightPressed())
		{
			this.moveR();
			TetrisMain.keyStroke.setRightPressed(false);
		}
		if (TetrisMain.keyStroke.isDownPressed())
		{
			
		}
	}
	
	public void checkPlaced(Items item)
	{
		 for (int i=0;i<10;i++)
		 {
			 if(this.piece[i][21]>0)
			 {
				 this.placed=true;
			 }
		 }
		 for (int k=0;k<item.pieces.size()-1;k++)
		 {
			 for (int i=0;i<10;i++)
			 {
				 for (int j =1;j<22;j++)
				 {
					 if (item.pieces.get(k).piece[i][j]>0)
					 {
						 if (this.piece[i][j-1]>0)
						 {
							 this.placed=true;
						 }
					 }
				 }
			 }
		 }
	}
	
	public int[][] getPiece()
	{
		return this.piece; 
	}
	
	
	public boolean isPlaced()
	{
		return this.placed;
	}
	
}
