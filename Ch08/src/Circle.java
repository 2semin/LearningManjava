
class Circle {
	
	private void secret() {
		System.out.println("Secrete");
	}
	
	protected void findRadius() {
		System.out.println("Radius is 10.0");
	}
	
	public void findArea() {
		System.out.println("Area is PI * radius * radius");
	}
}
	
class Ball extends Circle{
	private String color;
	
	public Ball(String color) {
		this.color = color;
	}
	
	public void findColor() {
		System.out.println(color + "Ball");
	}
	
	public void findVolume() {
		System.out.println("Volume is 4/3*(PI * radius * radius * radius).");
	}
}
		


