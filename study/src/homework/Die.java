package homework;
import java.util.Random;

public class Die {
	public int number;

    public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void roll() {	 
	 
		Random r = new Random();	 
		number = r.nextInt(6) + 1;  
		 
    }
}
