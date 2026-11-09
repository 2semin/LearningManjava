package chap07;

class Circle {
	private int radius;// 인스턴스 필드
	private String color; // 인스턴스 필드
	static int numOfCircles; //정적 필드, 정적 변수, 클래스 변수
	
	//클래스명과 동일한 메서드
	Circle()
	{
		this("red");
	}
	Circle(int radius)
	{
		this.radius = radius;
		numOfCircles++;
	}
	
	Circle (String color)
	{
		this.color = color;
		numOfCircles++;
	}
	
	Circle(int radius, String color)
	{
		this(radius);
		this.color = color;
		numOfCircles++;
	}
	public void setRadius(int radius){
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

}
