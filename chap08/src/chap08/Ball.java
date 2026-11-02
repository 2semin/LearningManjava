package chap08;

class Ball extends Circle {
	
	private String color;  // + radius, PI
	
	public Ball(String color) {
		this.color = color;
	}
	// +  findRadius() , findArea()
	public void findColor() {
		System.out.println(this.color + " Ball");
	}
	
	public void findVolume() {
		System.out.println("volume = " + (4/3) * radius * radius * radius *  PI);
	}
	
	public double findArea() {
		return  4 * PI * radius * radius;
	}

}
