package chap08;

class Circle {
	final double PI = 3.14;
	double radius;
	
	protected double findRadius() {
		return this.radius;
	}
	
	public double findArea() {
		return radius * radius * PI;
	}

}
