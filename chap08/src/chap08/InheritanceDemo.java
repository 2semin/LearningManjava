package chap08;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c1 = new Circle();
		c1.radius = 5;
		
		System.out.println(c1.findArea());
		
		Ball b1 = new Ball("Red");
		b1.radius = 5;
		b1.findVolume();
		System.out.println(b1.findArea()); // 오버라이딩 해서 나온 314.0 
	}

}
