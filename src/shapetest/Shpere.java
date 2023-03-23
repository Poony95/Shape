package shapetest;

public class Shpere extends ThreeDimShape {
	public static final double PI = 3.14;
	private double radius;
		
	public Shpere(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}

	@Override
	public void calcVolume() {
		volume =  4/3*PI*radius*radius*radius;
	}

	@Override
	public String toString() {
		return "Shpere [radius=" + radius + ", volume=" + volume + ", x=" + x + ", y=" + y + "]";
	}
	
}











