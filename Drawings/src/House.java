import processing.core.PApplet;

public class House{
	
	private int x, y;
	private float scaleFactor;
	// Add more fields to variable-ize house
	
	public House() {
		x = 500/2 - 150;
		y = 500/2 - 100;
		scaleFactor = 1;
	}

	
	public void draw (PApplet surface) {
		
		surface.rect(x, y, 300 * scaleFactor, 200 * scaleFactor); //Body of the house
		surface.triangle(x, y, x + 150 * scaleFactor, y - 100 * scaleFactor, x + 300 * scaleFactor, y); //roof of the house
		surface.square(x + 50 *scaleFactor, y + 50 * scaleFactor, 50 * scaleFactor); //Left window
		surface.square(x + 200 *scaleFactor, y + 50 * scaleFactor, 50 * scaleFactor); //Right window
		surface.rect(x + 115 * scaleFactor, y + 100 * scaleFactor, 70 * scaleFactor, 100 * scaleFactor); //Door
		
	}

	
	public void move(int x, int y) { //moves the house
		
		this.x = this.x + x;
		this.y = this.y + y;
	}
	
	public void modifyScale (float amount) { //modifies the scale of the house
		
		scaleFactor += amount;
	}
	// Add more methods to modify fields. Make sure methods sound like real actions.
	
	
	
	
	
}
