
public class TestRectangle{

	public static void main(String[] args) {
	
		// Test for right lower and left upper end point.
		System.out.println("---------------Rectangle1 Test---------------\n");
		
		RectangleLeftRightEndpoints test = new RectangleLeftRightEndpoints();
		test.setX1(-2);
		test.setX2(5);
		test.setY1(-1);
		test.setY2(3);
		test.toString();
		System.out.println(test.toString());
		System.out.println("Area = " + test.area());
		System.out.println("Perimeter = " + test.perimeter());
		System.out.println("\n");
		
		// Test for left endpoint with width and height.
		System.out.println("---------------Rectangle2 Test---------------\n");
		
		RectangleLeftEndpointWidthandHeight test2 = new RectangleLeftEndpointWidthandHeight();
		test2.setX1(1);
		test2.setY1(2);
		test2.setHeight(5);
		test2.setWidth(3);
		test2.toString();
		System.out.println(test2.toString());
		System.out.println("Area = " + test2.area());
		System.out.println("Perimeter = " + test2.perimeter());
		
		// Test for center point with width and height.
		System.out.println("---------------Rectangle3 Test---------------\n");
		
		RectangleCenterWidthHeight test3 = new RectangleCenterWidthHeight();
		test3.setX1(5);
		test3.setY1(4);
		test3.setHeight(10);
		test3.setWidth(5);
		test3.toString();
		System.out.println(test3.toString());
		System.out.println("Area = " + test3.area());
		System.out.println("Perimeter = " + test3.perimeter());
	}

}
