
public class Circle extends Shape{
	private double radius;
	
	public Circle(double radius) {
		super();
		this.radius=radius;
		calculateArea();
	}
	
	protected void calculateArea() {
		area = Math.PI*radius*radius;
	}

	public double getArea() {
		return area;
	}
}
