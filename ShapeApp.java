
public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle cir = new Circle(5);
		System.out.println("Area of Circle: " + cir.getArea());
		
		Square squ = new Square(5);
		System.out.println("Area of Square: " + squ.getArea());
		
		Rectangle rec = new Rectangle(3,5);
		System.out.println("Area of Rectangle: " + rec.getArea());
		
	}

}
