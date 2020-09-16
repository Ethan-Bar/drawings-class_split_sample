import processing.core.PApplet;

public class Person {

	private int x, y;
	private float scaleFactor;
	
	public Person () {
		x = 500/2 - 150;
		y = 500/2 - 100;
		scaleFactor = 1;
	}
	
	public void draw (PApplet surface) {
		surface.circle(x - 70 * scaleFactor, y + 100 * scaleFactor, 30 * scaleFactor); //Head
		surface.line(x - 70 * scaleFactor, y + 115 * scaleFactor, x - 70  * scaleFactor, y + 165 * scaleFactor); //Body
		surface.line(x - 90 * scaleFactor, y + 130 * scaleFactor, x + (20 - 70)  * scaleFactor, y + 130 * scaleFactor); //Arms
		surface.line(x - 70 * scaleFactor, y + 165 * scaleFactor, x + (-15 - 70)  * scaleFactor, y + 200 * scaleFactor); //Left leg
		surface.line(x - 70 * scaleFactor, y + 165 * scaleFactor, x + (15 - 70) * scaleFactor, y + 200 * scaleFactor); //Right leg
		
	}
	
	public void move (int x, int y) { //Moves the person
		
		this.x = this.x + x;
		this.y = this.y + y;
	}
	
	public void modifyScale (float amount) { //Modifies the scale of the person
		
		scaleFactor += amount;
	}
	
}
