
public class Square extends Rectangle{
	private double side;
	
	public Square(double side) {
		super(side, side);
		this.side=side;
		calculateArea();
	}
	
	public void calculateArea() {
		area = side*side;
	}

	public double getArea() {
		return area;
	}

}
