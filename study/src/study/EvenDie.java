package study;

class EvenDie extends Die {
	
	public void roll() {
		super.roll();
		if (getValue() % 2 != 0) {
			setValue(getValue() + 1);
		}
	}

}
