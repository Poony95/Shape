package shapetest;

public class Circle extends TwoDimShape {
	private double radius;
	public static final double PI = 3.14;
	
	@Override
	public void calcArea() {
		area = PI * radius * radius;
	}

	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", area=" + area + ", x=" + x + ", y=" + y + "]";
	}
	
}
