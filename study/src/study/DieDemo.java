
package study;

public class DieDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die d1 = new Die();
		d1.roll();
		
		System.out.println(d1.getValue());
		
		EvenDie d2 = new EvenDie();
		d2.roll();
		System.out.println(d2.getValue());
		
		OddDie d3 = new OddDie();
		d3.roll();
		System.out.println(d3.getValue());
	}

}
