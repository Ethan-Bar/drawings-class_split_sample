
public class Person {

	// Model after House.
	public void draw (PApplet surface) {
		surface.circle(x - 70 * scaleFactor, y + 100 * scaleFactor, 30 * scaleFactor);
		surface.line(x - 70 * scaleFactor, y + 115 * scaleFactor, x - 70  * scaleFactor, y + 165 * scaleFactor);
		surface.line(x - 90 * scaleFactor, y + 130 * scaleFactor, x + (20 - 70)  * scaleFactor, y + 130 * scaleFactor);
		surface.line(x - 70 * scaleFactor, y + 165 * scaleFactor, x + (-15 - 70)  * scaleFactor, y + 200 * scaleFactor);
		surface.line(x - 70 * scaleFactor, y + 165 * scaleFactor, x + (15 - 70) * scaleFactor, y + 200 * scaleFactor);
	public void move (int x, int y) {
		
		this.x = this.x + x;
		this.y = this.y + y;
	public void modifyScale (float amount) {
		
		scaleFactor += amount;
	
}
