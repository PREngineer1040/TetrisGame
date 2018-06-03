import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class TetrisMain {
	static JFrame frame = new JFrame();
	static Input keyStroke = new Input();
	public static void main(String[] args) throws InterruptedException
	{
		
		frame.addKeyListener(keyStroke);
		frame.setSize(514,760); 
		frame.setVisible(true); 
		Panel c = new Panel();
		frame.add(c); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Items items = new Items();
		TPiece me = new TPiece();
		items.pieces.add(me);
		while (true)
		{
			frame.addKeyListener(keyStroke);
			Thread.sleep(500);
			frame.repaint();
			for (int i=0;i<items.pieces.size();i++)
			{
				frame.addKeyListener(keyStroke);
				items.pieces.get(i).fall(items.pieces.get(i).piece);
				items.pieces.get(i).key(items.pieces.get(i).piece);
			}
			frame.addKeyListener(keyStroke);
		}
	}
}
