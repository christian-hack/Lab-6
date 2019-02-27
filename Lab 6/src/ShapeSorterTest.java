import org.junit.Assert;
import org.junit.Test;

/**
 * Lab 6
 *
 * Test class for ShapeSorter.
 * Implicitly tests that the comparators are implemented correctly.
 *
 * @author Stephen
 * @version 2019-02-18
 */
public class ShapeSorterTest
{
	/**
	 * Test that shapes are added correctly.
	 */
	@Test
	public void AddShapeTest()
	{
		ShapeSorter sorter = new ShapeSorter();

		Shape a = new Rectangle("test", 3, 3);
		Shape b = new EquilateralTriangle("test2", 4);
		Shape c = new Square("test3", 3);
		Shape d = new Circle("test4", 1.5);

		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);

		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(0), a);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(1), b);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(2), c);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(3), d);
	}

	/**
	 * Tests sorting via the default ordering.
	 */
	@Test
	public void SortShapesDefaultTest()
	{
		ShapeSorter test = new ShapeSorter();
		
		//Shape a = new Rectangle("test", 3, 4);
		Shape b = new EquilateralTriangle("test2", 4);
		//Shape c = new Square("test3", 3);
		Shape d = new Circle("test4", 1.5);
		
		//test.addShape(a);
		test.addShape(b);
		//test.addShape(c);
		test.addShape(d);
		
		test.sortShapes();
		String actual = test.toString();
		Assert.assertEquals("Circle:\t ID = test4\t area = 7.069\t perimeter = 9.425EquilateralTriangle:\t ID = test2\t area = 13.856\t perimeter = 12.000", actual);
	}

	/**
	 * Tests sorting by area ordering.
	 */
	@Test
	public void SortShapesAreaTest()
	{
		ShapeSorter test = new ShapeSorter();
		
		Shape b = new EquilateralTriangle("test2", 4);
		Shape d = new Circle("test4", 1.5);
		
		test.addShape(b);
		test.addShape(d);
		
		test.sortShapes(new ShapeAreaComparator());
		String actual = test.toString();
		
		Assert.assertEquals("Circle:\t ID = test4\t area = 7.069\t perimeter = 9.425EquilateralTriangle:\t ID = test2\t area = 13.856\t perimeter = 12.000", actual);
	}

	/**
	 * Tests sorting by perimeter ordering.
	 */
	@Test
	public void SortShapesPerimeterTest()
	{
		ShapeSorter test = new ShapeSorter();
		
		Shape b = new EquilateralTriangle("test2", 4);
		Shape d = new Circle("test4", 1.5);
		
		test.addShape(b);
		test.addShape(d);
		
		test.sortShapes(new ShapePerimeterComparator());
		
		String actual = test.toString();
		
		Assert.assertEquals("Circle:\t ID = test4\t area = 7.069\t perimeter = 9.425EquilateralTriangle:\t ID = test2\t area = 13.856\t perimeter = 12.000", actual);
	}

	/**
	 * Tests the toString.
	 */
	@Test
	public void ToStringTest()
	{
		ShapeSorter test = new ShapeSorter();
		
		Shape b = new EquilateralTriangle("test2", 4);
		test.addShape(b);
		
		String expected = "EquilateralTriangle:\t ID = test2\t area = 13.856\t perimeter = 12.000";
		String actual = test.toString();
		Assert.assertEquals(expected, actual);
	}
}
