package study;
import java.util.Random;

class Die {
	private int value;

    int roll() {	 
	 
		Random r = new Random();	 
		setValue(r.nextInt(6));  
		 
		setValue(getValue() + 1);  
		return getValue();	 
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}

