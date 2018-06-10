import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class TetrisMain {
	static JFrame frame = new JFrame();
	static Input keyStroke = new Input();
	static Items items = new Items();
	public static void main(String[] args) throws InterruptedException
	{
		
		frame.addKeyListener(keyStroke);
		frame.setSize(514,760); 
		frame.setVisible(true); 
		Panel c = new Panel();
		frame.add(c); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		TPiece me = new TPiece();
		items.pieces.add(me);
		while (true)
		{
			Thread.sleep(200);

			items.pieces.get(items.pieces.size()-1).key(items);
			items.pieces.get(items.pieces.size()-1).fall();
			items.pieces.get(items.pieces.size()-1).checkPlaced(items);
			items=items.clearLine(items);
			if (items.pieces.get(items.pieces.size()-1).isPlaced())
			{
				TPiece T = new TPiece();
				items.pieces.add(T);
			}
			frame.repaint();
			for (int i=0;i<items.pieces.size();i++)
			{

			}
			
		}
	}
}
