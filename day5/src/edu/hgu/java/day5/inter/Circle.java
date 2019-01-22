package edu.hgu.java.day5.inter;

public class Circle implements Shape {
	
	private double radius;
	
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getRound() {
		// TODO Auto-generated method stub
		return 2*Math.PI*radius;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(radius, 2);
	}
	
	
	
	
}
