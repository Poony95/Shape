package shapetest;

public abstract class ThreeDimShape extends Shape {
	protected double volume;
	
	public abstract void calcVolume();
	public ThreeDimShape(int x, int y) {
		super(x, y);
	}
	
}
