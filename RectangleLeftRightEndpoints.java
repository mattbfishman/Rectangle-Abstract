/**
 * This class represents a rectangle's area and 
 * perimeter given the right and left endpoints
 * @author Matthew Fishman
 * @date 2/18/2015
 */
public class RectangleLeftRightEndpoints extends Rectangle{
	
	/**
	 * returns a string containing the values of the two different sets of coordinates,
	 * one for the left upper endpoint and one for the lower right endpoint. 
	 */
	public String toString(){
		return("The two sets of points entered are:\n" + "set 1 :(" + x1 + "," + y1 + ")" + "\n" +  "set 2 :(" + x2 + "," + y2 + ")" + "\n");
	}
	
	/**
	 * Calculates the perimeter by taking the absolute value of the two X points subtracted together multiplying that 
	 * answer by two and adding it to the absolute value of the two Y points subtracted together multiplied by 2.
	 */
	public double perimeter(){
		return perimeter = ((Math.abs(getX1() - getX2())*2) + (Math.abs(getY1() - getY2())*2));
	}
	
	/**
	 * Calculates the area by taking the absolute values of the two X points subtracted together 
	 * and mulitplying that by the absolute value of the two Y points subtracted together
	 */
	public double area(){
		return area = (Math.abs(getX1() - getX2()) * (Math.abs(getY1() - getY2())));
	}
	
}
