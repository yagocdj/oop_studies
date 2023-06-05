
public class Rectangle {
	private int id;
	private double width;
	private double height;
	
	// Constructor
	public Rectangle(int id, double width, double height) {
		this.id = id;
		this.width = width;
		this.height = height;
	}
	
	// Other constructor (if no parameters were passed)
	public Rectangle() { }
	
	// Initialize the rectangle as a square
	public Rectangle(double side) {
		this.height = this.width = side;
	}
	
	public double calculateArea() {
		return width * height;
	}
	
	public double calculatePerimeter() {
		return width * 2 + height * 2;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void makeSquare() {
		double average = (width + height) / 2;
		width = average;
		height = average;
	}
	
	public boolean isSquare() {
		return (width == height);
	}

	public String toString() {
		return "\nId     = " + id +
			   "\nWidth  = " + width +
			   "\nHeight = " + height;
	}
	
	
}
