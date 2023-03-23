package shapetest;

public class Triangle extends TwoDimShape {
	private double width;
	private double height;
	
	public Triangle(int x, int y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	@Override
	public void calcArea() {
		area = width * height / 2;
	}

	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + ", area=" + area + ", x=" + x + ", y=" + y + "]";
	}
	

}







