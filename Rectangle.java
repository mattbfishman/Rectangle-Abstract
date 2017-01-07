/**
 * This class represents an abstract class
 * for rectangle. 
 * @author Matthew Fishman
 * @date 2/18/2015
 */

public abstract class Rectangle {
	//instance variables
	public double x1, y1, x2, y2,width, height,perimeter,area;
	
	//getters and setters
	public void setX1(double x1){
		this.x1 = x1;
	}
	
	public void setY1(double y1){
		this.y1 = y1;
	}
	
	public double getX1() {
		return x1;
	}
	
	public double getY1() {
		return y1;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getY2() {
		return y2;
	}

	public void setY2(double y2) {
		this.y2 = y2;
	}

	public double getX2() {
		return x2;
	}

	public void setX2(double x2) {
		this.x2 = x2;
	}
	
	//abstract method for toString
	public abstract String toString();

	//abstract method for perimeter
	public abstract double perimeter();
	
	//abstract method for area
	public abstract double area();
	
	
	
}
