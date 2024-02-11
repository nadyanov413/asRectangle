package asRectangle;

public class Rectangle {

	private double length;
	private double width;
	
	
	
	
	public Rectangle(double l, double w) {
		length = l;
		width = w;
		
	}

	public double getLength(){
		return length;
	}
	public double getWidth() {
		return width;
	}
	public double computeArea() {
		double area = 0;
		area = length * width;
		return area;
		
	}
	public double computePerim() {
		double perim = 0;
		perim = length * 2 + width * 2;
		return perim;
	}

}
