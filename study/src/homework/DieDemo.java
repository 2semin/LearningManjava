package homework;

public class DieDemo {
	   
	   static void upCast (Die d) {
	       d.roll();
	       System.out.println (d.number);
	   }
	   static void downCast (Die d1) {
	       d1.roll();
	       System.out.println (d1.number);
	   }

	   public static void main(String[] args) {
	       // TODO Auto-generated method stub
	       
	       Die d1 = new EvenDie();
	       upCast(d1);
	       downCast((EvenDie) d1);
	   }
	}