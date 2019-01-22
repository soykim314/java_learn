package edu.hgu.java.day5.inter;

public class Triangle implements Shape {

	private double height;
	private double bottom;
	
	public Triangle(double height, double bottom) {
		super();
		this.height = height;
		this.bottom = bottom;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getBottom() {
		return bottom;
	}

	public void setBottom(double bottom) {
		this.bottom = bottom;
	}

	@Override
	public double getRound() {
		// TODO Auto-generated method stub
		return height+bottom +Math.sqrt(Math.pow(height, 2)+Math.pow(bottom, 2));
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return height*bottom*0.5;
	}

}
