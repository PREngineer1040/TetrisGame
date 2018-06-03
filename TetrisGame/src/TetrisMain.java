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
			Thread.sleep(400);
			frame.repaint();
			for (int i=0;i<items.pieces.size();i++)
			{
				items.pieces.get(i).fall(items.pieces.get(i).piece);
			}
		}
	}
}
