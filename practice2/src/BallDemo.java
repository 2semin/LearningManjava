
public class BallDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radius = 5;
		
		Ball b1 = new Ball();
		Circle c1 = new Circle(5);
		b1.circle = c1;
		
		System.out.println(b1.findArea());
		System.out.println(b1.findVolume());

	}

}
