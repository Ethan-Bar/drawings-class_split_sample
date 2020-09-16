import java.awt.event.KeyEvent;
import processing.core.PApplet;

public class DrawingSurface extends PApplet {

	// FIELDS
	private House h;
	private Person p;
	
	
	// CONSTRUCTOR - Initialize any added fields here.
	public DrawingSurface() {
		h = new House();
		p = new Person();
	}
	
	
	// METHODS
	// Add processing methods here. See the documentation at processing.org for reference.
	public void setup() {
		
	}
	
	public void draw() {
		h.draw(this);
		p.draw(this);
		
		pushStyle();
		
		textSize(10);
		text("Interactions: Arrow Keys control the movement of the house and person\n W and S control the scaling of the house and person", 10, 10);
	}
	
	public void keyPressed () {
		
		background(205,205,205);
		if (keyCode == KeyEvent.VK_W) { //W and S move everything up or down
			h.modifyScale(0.1f);
			p.modifyScale(0.1f);
		} else if (keyCode == KeyEvent.VK_S) {
			h.modifyScale(-0.1f);
			p.modifyScale(-0.1f);
		}
		
		if (keyCode == KeyEvent.VK_RIGHT) { //Right and left arrows move everything left or right
			h.move(10, 0);
			p.move(10, 0);
		} else if (keyCode == KeyEvent.VK_LEFT) {
			h.move(-10, 0);
			p.move(-10, 0);
		}
		
		if (keyCode == KeyEvent.VK_UP) { //Up and down arrows move everything left or right
			h.move(0, -10);
			p.move(0, -10);
		} else if (keyCode == KeyEvent.VK_DOWN) {
			h.move(0, 10);
			p.move(0, 10);
		}
		
	}
	
	// Add methods for user interaction. Check the processing reference for info on this (http://processing.org).
	// We'll also review how to get mouse/keys working in class.
	
	
	
}
