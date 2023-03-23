package shapetest;

public class Cylinder extends ThreeDimShape {
	public static final double PI = 3.14;
	private double radius;
	private double height;
	
	
	
	public Cylinder(int x, int y, double radius, double height) {
		super(x, y);
		this.radius = radius;
		this.height = height;
	}

	@Override
	public void calcVolume() {
		volume = PI*radius*radius*height;
	}

	@Override
	public String toString() {
		return "Cylinder [radius=" + radius + ", height=" + height + ", volume=" + volume + ", x=" + x + ", y=" + y
				+ "]";
	}	
}









