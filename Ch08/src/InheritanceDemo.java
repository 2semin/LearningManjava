
public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		Ball c2 = new Ball("Red");
		
		System.out.println("Circle: ");
		c1.findRadius();
		c2.findArea();
		
		System.out.println("Ball: ");
		c2.findRadius();
		c2.findColor();
		c2.findArea();
		c2.findVolume();

	}

}