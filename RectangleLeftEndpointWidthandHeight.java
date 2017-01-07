/**
 * This class represents a rectangle's area and 
 * perimeter given the left endpoint, height and width
 * @author Matthew Fishman
 * @date 2/18/2015
 */
public class RectangleLeftEndpointWidthandHeight extends Rectangle{
	
	//returns a string showing the left endpoints coordinates, height and width
	public String toString(){
		return ("The left endpoint entered is: (" + x1 + "," + y1 + ")\n" + "Width: " + width + "\n" + "Height: " + height + "\n"); 
	}
	
	//calculates the perimeter using width multiplied by 2 and height muliplied by two added together
	public double perimeter(){
		return perimeter = (getWidth()*2) + (getHeight()*2);
	}
	
	//calculated the area using the width multiplied by the height
	public double area() {
		return area = (getWidth() * getHeight());
	}
}
