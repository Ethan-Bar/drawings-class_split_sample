import processing.core.PApplet;

public class House {
	
	private int x,y;
	// Add more fields to variable-ize house
	
	public House() {
		x = 100;
		y = 150;
	}

	
	public void draw(PApplet surface) {
		
		surface.rect(x, y, 300, 200);
		surface.rect(x, y, 300 * scaleFactor, 200 * scaleFactor);
		surface.triangle(x, y, x + 150 * scaleFactor, y - 100 * scaleFactor, x + 300 * scaleFactor, y);
		surface.square(x + 50 *scaleFactor, y + 50 * scaleFactor, 50 * scaleFactor);
		surface.square(x + 200 *scaleFactor, y + 50 * scaleFactor, 50 * scaleFactor);
		surface.rect(x + 115 * scaleFactor, y + 100 * scaleFactor, 70 * scaleFactor, 100 * scaleFactor);
		
	}

	
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		
		this.x = this.x + x;
		this.y = this.y + y;
	}
	
	public void modifyScale (float amount) {
		
		scaleFactor += amount;
	}
	// Add more methods to modify fields. Make sure methods sound like real actions.
	
	
	
	
	
}
