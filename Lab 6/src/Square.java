
public class Square extends Polygon{
 private double side;
 
 public Square (String id, double size) {
	 super(id);
	 this.side = size;
	 
	 sideLengths.add(size);
	 sideLengths.add(size);
	 sideLengths.add(size);
	 sideLengths.add(size);
 }

@Override
public double getArea() {
	double sqArea = side * side;
	return sqArea;
}

@Override
public String getShapeType() {
	return "Square";
}
}
