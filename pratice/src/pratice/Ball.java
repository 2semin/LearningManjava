package pratice;

class Ball extends Circle {
	
	Ball(int r){
		super(r);
	}
	
	double findArea() {
		return 4 * PI * r *r;
	}
	double findVolume() {
		return (4/3) * PI * r * r * r;
	}
	double circleFindArea() {
		return super.findArea();
	}

}
