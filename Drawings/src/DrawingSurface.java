import processing.core.PApplet;

public class DrawingSurface extends PApplet {

	// FIELDS
	private House h;
	
	
	// CONSTRUCTOR - Initialize any added fields here.
	public DrawingSurface() {
		h = new House();
	}
	
	
	// METHODS
	// Add processing methods here. See the documentation at processing.org for reference.
	public void setup() {
		
	}
	
	public void draw() {
		h.draw(this);
		p.draw(this);
	}
	
	public void keyPressed () {
		
		background(205,205,205);
		if (keyCode == KeyEvent.VK_W) {
			h.modifyScale(0.1f);
			p.modifyScale(0.1f);
		} else if (keyCode == KeyEvent.VK_S) {
			h.modifyScale(-0.1f);
			p.modifyScale(-0.1f);
		}
		
		if (keyCode == KeyEvent.VK_RIGHT) {
			h.move(10, 0);
			p.move(10, 0);
		} else if (keyCode == KeyEvent.VK_LEFT) {
			h.move(-10, 0);
			p.move(-10, 0);
		}
		
		if (keyCode == KeyEvent.VK_UP) {
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
