
class Ball {
	Circle circle;
	
	double findArea() {
		return 4 * circle.r * circle.r * circle.PI;
	}
	double findVolume() {
		return (4/3) * circle.PI * circle.r * circle.r * circle.r;
	}

}
