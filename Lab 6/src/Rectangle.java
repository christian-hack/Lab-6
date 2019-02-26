
public class Rectangle extends Polygon{

	private double height;
	private double width;
	
	public Rectangle(String id, double height, double width) {
		super(id);
		this.height = height;
		this.width = width;
	}
	public double getArea() {
		double recArea = height * width;
		return recArea;
	}
	public String getShapeType() {
		return "Rectangle";
	}
}
