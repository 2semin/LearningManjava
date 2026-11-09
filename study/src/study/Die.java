package study;
import java.util.Random;

public class Die {
	private int value;

    public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void roll() {	 
	 
		Random r = new Random();	 
		value = r.nextInt(6) + 1;  
		 
    }
}
