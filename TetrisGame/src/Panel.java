import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JComponent;

public class Panel extends JComponent{
	private final int xMargins=80; 
	private final int yMargins=40;
	private final int cellSize=32;
	private final int frameHeight=735;
	private final int frameWidth=430;
	
	Items items = new Items();
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		

		//Here we draw the background.
		Color c = new Color(10,40,130);
		g2.setColor(c);
		g2.fillRect(0, 0, TetrisMain.frame.getWidth(), TetrisMain.frame.getHeight());
		
		//Here we draw the temporal Grid
		
		g2.setColor(Color.WHITE);
		
		for (int i=xMargins;i<frameWidth;i+=cellSize)
		{
			g2.drawLine(i, yMargins,i, frameHeight-yMargins-15);
		}
		for (int i=yMargins;i<frameHeight-cellSize;i+=cellSize)
		{
			g2.drawLine(xMargins, i,frameWidth-cellSize+2, i);
		}
		
		//Here we draw the pieces
		g2.setColor(Color.RED);
		for (int i=0;i<items.pieces.size();i++)
		{
			boolean[][] piece;
			piece=items.pieces.get(i).getPiece();
			for (int j=0;j<10;j++)
			{
				for (int k=0;k<22;k++)
				{
					if (piece[j][k] && k>1)
					{
						g2.fillRect(j*cellSize+xMargins+1, k*cellSize+yMargins+1-2*cellSize, cellSize-1, cellSize-1);
					}
				}
			}
			
		}
	}
	
}
