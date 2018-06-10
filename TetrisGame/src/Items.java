import java.util.ArrayList;

public class Items {
	public static ArrayList<Pieces> pieces= new ArrayList<>();
	
	public void newItem()
	{
		
	}
	public void removeItem()
	{
		
		
	}
	//This method checks if the pieces make a full line, if they do it clears that line and shifts all the pieces down.
	public Items clearLine(Items items)
	{
		Pieces result= new Pieces();
		
		for (int k=0;k<items.pieces.size();k++)
		{
			for (int i=0;i<10;i++)
			{
				for (int j=0;j<22;j++)
				{
					if (items.pieces.get(k).piece[i][j]>0)
					{
						result.piece[i][j]=1;
					}
				}
			}
		}
		
		for (int j=0;j<22;j++)
		{
			boolean check=true;
			for (int i=0;i<10;i++)
			{
				if(result.piece[i][j]==0)
				{
					check=false;
				}
			}
				if (check)
				{
					for (int k=0;k<items.pieces.size();k++)
					{
						
						for (int i=0;i<10;i++)
						{
						items.pieces.get(k).piece[i][j]=0;
						}
					}
						for (int m=j-1;m>=0;m--)
						{
							for (int p=0;p<items.pieces.size();p++)
							{	
								for ( int n=0;n<10;n++)
									{
										if (items.pieces.get(p).piece[n][m]>0)
											{
												items.pieces.get(p).piece[n][m+1]=items.pieces.get(p).piece[n][m];
												items.pieces.get(p).piece[n][m]=0;
												
											}
									}
			
							}
						}
					}
				
			
		}
		return items;
	}
	 
}
