

class Circle {
	int r;
	final double PI = 3.14;
	
	Circle(int r){
		this.r = r;
	}
	
	double findArea() {
		return r* r* PI;
	}

}
