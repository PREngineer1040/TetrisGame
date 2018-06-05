import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Handles user input events.
 */
public class Input implements KeyListener{
	private boolean leftIsPressed;
	private boolean rightIsPressed;
	private boolean downIsPressed;
	private boolean spaceIsPressed;

	

	/**
	 * Create a new input handler
	 * @param gameLogic the game logic handler
	 */
	public Input(){
		reset();
	}

	public void reset() {
		leftIsPressed = false;
		rightIsPressed = false;
		downIsPressed = false;
		spaceIsPressed = false;

	}

	public boolean isLeftPressed() {
		return leftIsPressed;
	}

	public boolean isRightPressed() {
		return rightIsPressed;
	}

	public boolean isDownPressed() {
		return downIsPressed;
	}

	public boolean isSpacePressed() {
		return spaceIsPressed;
	}
	public void setLeftPressed(boolean isPressed)
	{
		this.leftIsPressed=isPressed;
	}
	public void setRightPressed(boolean isPressed)
	{
		this.rightIsPressed=isPressed;
	}
	public void setDownPressed(boolean isPressed)
	{
		this.downIsPressed=isPressed;
	}
	public void setSpacePressed(boolean isPressed)
	{
		this.spaceIsPressed=isPressed;
	}

	/**
	 * Handle a key input event.
	 */
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()){
		case KeyEvent.VK_SPACE:
			this.spaceIsPressed = true;
			break;
		case KeyEvent.VK_DOWN:
			this.downIsPressed = true;
			break;
		case KeyEvent.VK_LEFT:
			this.leftIsPressed = true;
			break;
		case KeyEvent.VK_RIGHT:
			this.rightIsPressed = true;
			break;
		
		}
		e.consume();
	}


	/**
	 * Handle a key release event.
	 */

	public void keyReleased(KeyEvent e) {}
	
	/*
		switch(e.getKeyCode()){
		case KeyEvent.VK_SPACE:
			this.spaceIsPressed = false;
			break;
		case KeyEvent.VK_DOWN:
			this.downIsPressed = false;
			break;
		case KeyEvent.VK_LEFT:
			this.leftIsPressed = false;
			break;
		case KeyEvent.VK_RIGHT:
			this.rightIsPressed = false;
			break;
	
		}
		e.consume();
	}
	
	*/
	

	public void keyTyped(KeyEvent e) {
		// not used
	}
}


