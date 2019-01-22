package edu.hgu.java.day5.inter;

public class Rectangle implements Shape{
	
	private double garo;
	private double sero;
	
	
	public Rectangle(double garo, double sero) {
		super();
		this.garo = garo;
		this.sero = sero;
	}


	public double getGaro() {
		return garo;
	}

	public void setGaro(double garo) {
		this.garo = garo;
	}


	public double getSero() {
		return sero;
	}


	public void setSero(double sero) {
		this.sero = sero;
	}


	@Override
	public double getRound() {
		// TODO Auto-generated method stub
		return garo*2 +sero*2;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return garo*sero;
	}

}
